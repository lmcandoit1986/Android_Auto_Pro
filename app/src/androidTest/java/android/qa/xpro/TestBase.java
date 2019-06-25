package android.qa.xpro;

import android.qa.xpro.Utils.SendBundle;
import android.qa.xpro.Utils.Solo;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import android.qa.xpro.Logging.Log_qa;
import android.qa.xpro.Cases.PA.Config;
import android.qa.xpro.Utils.Operate.Operate;
import android.qa.xpro.Utils.Support;

/**
 * Created by liming on 2019/5/31.
 */
@RunWith(AndroidJUnit4.class)
public class TestBase {

    public static Operate op;
    public static Support su;
    public static SendBundle sendBundle;

    @BeforeClass
    public static void Setup(){
        Log_qa.print("setup");
        op = new Operate();
        su = new Support();
        Solo.op=op;
        Solo.su=su;
        Solo.sendBundle = sendBundle;

    }

    @After
    public void TearDown(){

    }

}
