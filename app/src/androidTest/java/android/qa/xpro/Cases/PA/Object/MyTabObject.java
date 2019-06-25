package android.qa.xpro.Cases.PA.Object;

import android.qa.xpro.Logging.Log_qa;
import android.qa.xpro.Utils.Solo;

public class MyTabObject extends Solo{
    /**
     * 元素汇总
     */
    public static String Login_Text = "登录/注册";

    /**
     * 点击登录注册
     */
    public static void intoLogin(){
        Log_qa.print_i("点击登录入口");
        op.clickV2.clickByText(Login_Text);
    }
}
