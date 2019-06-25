package android.qa.xpro.Cases.PA.TestCases;

import android.qa.xpro.Cases.PA.BasePA;
import android.qa.xpro.Cases.PA.Object.LoginObject;
import android.qa.xpro.Cases.PA.Object.MainObject;
import android.qa.xpro.Cases.PA.Object.MyTabObject;

import org.junit.Test;

public class Login extends BasePA {

    @Test
    public void loginWithPhoneAndCode(){
        su.take_Pic("test");
        if(MainObject.assertInMainActivity()){
            MainObject.changeTab("我的");
            MyTabObject.intoLogin();
        }

        LoginObject.inputPhone("18612118781");
        LoginObject.sendCode();
        String Code = su.getCode();
        LoginObject.inputPwd(Code);
        LoginObject.submit();
        su.sleep(5000);

    }

}
