package android.qa.xpro.Cases.PA;

import android.os.Build;
import android.qa.xpro.TestBase;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.Tracer;
import android.support.test.uiautomator.UiSelector;
import android.support.test.uiautomator.UiWatcher;

import org.junit.After;
import org.junit.Before;

public class BasePA extends TestBase {

    @Before
    public void setup(){
        su.StartApp(Config.TARGET_APP_ID,Config.TARGET_APP_ACTIVITY);
        su.initToastListener();
        su.Door.getMydevice().registerWatcher("closeTV", new UiWatcher() {
            @Override
            public boolean checkForCondition() {
                if(op.clickV1.element("id","com.pa.health:id/iv_cancel").exists()){
                    op.clickV1.clickById("com.pa.health:id/iv_cancel");
                    return true;
                }
                return false;
            }
        });
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            su.Door.getInstrumentation().getUiAutomation().executeShellCommand("pm grant "+su.Door.getTargetContext().getPackageName()+"android.permission.WRITE_EXTERNAL_STORAGE");
        }
//        adoptShellPermissionIdentity();
    }

    @After
    public void TearDown(){
        su.quitApp(Config.TARGET_APP_ID);
    }

}
