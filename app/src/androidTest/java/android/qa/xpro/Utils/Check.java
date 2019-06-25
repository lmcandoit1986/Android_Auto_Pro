package android.qa.xpro.Utils;

import android.qa.xpro.Logging.Log_qa;
import android.support.test.uiautomator.UiObject;

/**
 * Created by liming on 2019/4/29.
 */

public class Check {

    Support support;

    public Check(){
        support = new Support();
    }

    public void assertTrueAndPrtScr(String Pic_Name, boolean condition) {
        if (!condition) {
            String ERR =String.format("截图:%s.jpg",Pic_Name);
            support.take_Pic(Pic_Name);
            Log_qa.print_e(ERR);
            throw new AssertionError(ERR);
        }
    }

    public void assertTrueAndPrtScr(String MSG,String Pic_Name, boolean condition) {
        if (!condition) {
            String ERR =String.format("截图:%s.jpg,错误信息:%s",Pic_Name,MSG);
            support.take_Pic(Pic_Name);
            Log_qa.print_e(ERR);
            throw new AssertionError(ERR);
        }
    }

    public void assertTrue(String ErrMsg, boolean condition) {
        if (!condition) {
            String ERR =String.format("错误信息:%s",ErrMsg);
            Log_qa.print_e(ERR);
            throw new AssertionError(ERR);
        }
    }

    public void assertTrue(boolean condition) {
        if (!condition) {
            throw new AssertionError();
        }
    }

    public void assertHasElement(UiObject object){
        if(!object.exists()){
            throw new AssertionError();
        }
    }

    public void assertHasElement(UiObject object,String Msg){
        if(!object.exists()){
            throw new AssertionError(Msg);
        }
    }
}
