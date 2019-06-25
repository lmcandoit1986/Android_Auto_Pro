package android.qa.xpro.Cases.PA;

import android.qa.xpro.Utils.Operate.Operate;
import android.qa.xpro.Utils.SendBundle;
import android.qa.xpro.Utils.Support;

/**
 * Created by liming on 2019/4/28.
 */

public class Config {

    public static final String TARGET_APP_ID ="com.pa.health";
    public static final String AUTO_TEST_APP_ID ="";
    public static final String TARGET_APP_ACTIVITY =".LoadingActivity";


    public static final String TYPE_TEXT ="text";
    public static final String TYPE_ID ="id";
    public static final String TYPE_Class ="class";

    /**
     * 用于Toast文案获取
     * 使用之前需要先启动 Support 类中的 initToastListener 方法；
     * 后面在Toast文案出现后，直接调用该类即可
     */
    public static String TOAST_TEXT;

}
