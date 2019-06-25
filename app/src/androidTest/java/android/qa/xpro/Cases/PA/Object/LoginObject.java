package android.qa.xpro.Cases.PA.Object;

import android.qa.xpro.Utils.Solo;

public class LoginObject extends Solo{
    /**
     * 元素汇总
     */
    public static String Phone_Edit_id = "com.pa.health:id/edt_input_phone_number";
    public static String Pwd_Edit_id = "com.pa.health:id/edt_input_code";
    public static String Send_Code_id = "com.pa.health:id/tv_send_code";
    public static String Login_btn_id = "com.pa.health:id/btn_login";


    public static void inputPhone(String phoneNumber){
        op.input.input(Phone_Edit_id,phoneNumber);
    }

    public static void sendCode(){
        op.clickV2.clickById(Send_Code_id);
        su.sleep(5000);
    }

    public static void inputPwd(String Pwd){
        op.input.input(Pwd_Edit_id,Pwd);
    }

    public static void submit(){
        op.clickV2.clickById(Login_btn_id);
    }
}
