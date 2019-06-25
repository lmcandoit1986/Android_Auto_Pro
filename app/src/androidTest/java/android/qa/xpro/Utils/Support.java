package android.qa.xpro.Utils;

import android.app.Notification;
import android.app.UiAutomation;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import android.view.accessibility.AccessibilityEvent;
import java.io.File;
import java.io.IOException;
import android.qa.xpro.Logging.Log_qa;
import android.qa.xpro.Cases.PA.Config;


/**
 * Created by liming on 2019/4/30.
 */

public class Support extends Connection{

    public final String Pic_Save_File ="/sdcard/pajkx/";

    public Support(){

    }

    public void take_Pic(String Pic_Name){
        screenShot(String.format("%s%s.png",Pic_Save_File,Pic_Name));
    }

    public void screenShot(String FilePath){
        try {
            Door.getMydevice().executeShellCommand(String.format("screencap %s",FilePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void StartApp(String PackageName,String StartActivityName){
        Log_qa.print(String.format("Start App:%s",PackageName));
        /**
         * 优先使用
         */
        Start_Intent(PackageName);
        Log_qa.print(Door.getMydevice().getCurrentPackageName());
        if(!Door.getMydevice().getCurrentPackageName().equals(PackageName)){
            /**
             * 如果失败，则使用
             */
            Log_qa.print("执行 shell 命令启动 App");
            try {
                Door.getMydevice().executeShellCommand("am start "+PackageName+"/"+StartActivityName);
                Thread.sleep(6000);
            } catch (IOException e) {
                e.printStackTrace();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void quitApp(String PackageName){
        try {
            Door.getMydevice().executeShellCommand("am force-stop "+PackageName);
            Thread.sleep(5000);
        } catch (IOException e) {
            e.printStackTrace();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void Start_Intent(String PackageName){
        Log_qa.print("执行 Intent 命令启动 App");
        Context context = Door.getMyContext();
        final Intent intent = context.getPackageManager().getLaunchIntentForPackage(PackageName);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(intent);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void initToastListener() {
        Door.getInstrumentation().getUiAutomation().setOnAccessibilityEventListener(new UiAutomation.OnAccessibilityEventListener() {
            @Override
            public void onAccessibilityEvent(AccessibilityEvent event) {
                if (event.getEventType()!= AccessibilityEvent.TYPE_NOTIFICATION_STATE_CHANGED) {
                    return;
                }
                //获取消息来源
                String sourcePackageName = (String) event.getPackageName();

                //获取事件具体信息
                Parcelable parcelable = event.getParcelableData();

                //如果不是下拉通知栏消息，则为其它通知信息，包括Toast
                if (!(parcelable instanceof Notification)) {
                    Config.TOAST_TEXT = (String) event.getText().get(0);
                }
            }
        });
    }

    public void sleep(long time){
        Log_qa.print_i(String.format("sleep %d ms",time));
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getCode(){
        String res=null;
        Door.getMydevice().openNotification();
        UiObject tar = Door.getMydevice().findObject(new UiSelector().textContains("验证码"));
        tar.waitForExists(5000);
        try {
            res = tar.getText();
            Log_qa.print_i(res);
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }

        //…客户，您的验证码为：176710，有效期2分钟。买健康险，就上平安健康APP！【平安健康险】
        Door.getMydevice().pressBack();
        if(!res.equals(null)){
            return res.split("：")[1].split("，")[0];
        }
        return null;
    }


}
