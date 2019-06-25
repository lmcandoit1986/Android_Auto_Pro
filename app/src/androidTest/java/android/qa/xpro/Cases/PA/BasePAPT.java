package android.qa.xpro.Cases.PA;

import android.os.Bundle;
import android.qa.xpro.TestBase;
import android.qa.xpro.Utils.SendBundle;

import org.junit.After;
import org.junit.Before;

public class BasePAPT extends TestBase {

    @Before
    public void setup(){
        sendBundle = new SendBundle(op.clickV1.Door.getInstrumentation());
        su.StartApp(Config.TARGET_APP_ID,Config.TARGET_APP_ACTIVITY);
        Bundle bundle = new Bundle();
        bundle.putString("PT","");
        sendBundle.sendStatus(5,bundle);

    }

    @After
    public void TearDown(){
        Bundle bundle = new Bundle();
        bundle.putString("PT","");
        sendBundle.sendStatus(6,bundle);
        su.quitApp(Config.TARGET_APP_ID);
    }

}
