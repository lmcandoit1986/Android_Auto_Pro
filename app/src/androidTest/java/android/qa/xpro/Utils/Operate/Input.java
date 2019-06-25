package android.qa.xpro.Utils.Operate;

import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;

import android.qa.xpro.Utils.Check;
import android.qa.xpro.Utils.Element;

/**
 * Created by liming on 2019/6/5.
 */

public class Input extends Element {

    public Check check;
    public final String TYPE_UP ="up";
    public final String TYPE_DOWN ="down";
    public final String TYPE_LEFT ="left";
    public final String TYPE_RIGHT ="right";
    private final String CLASS_TEXTVIEW ="android.widget.TextView";
    private final String CLASS_EDITTEXT ="android.widget.EditText";


    public Input(){
        check = new Check();
    }

    /**
     * 输入
     */

    public void input(String id,String text){
        UiObject EditTextOB = element(TYPE_ID,id);
        check.assertTrue("定位元素失败",EditTextOB !=null);
        try {
            if(EditTextOB.isEnabled())EditTextOB.setText(text);
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with UiObjectNotFoundException",false);
        }catch (NullPointerException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with NullPointerException",false);
        }
    }

    public void input(String id,int Instance,String text){
        UiObject EditTextOB = element(TYPE_ID,id,Instance);
        check.assertTrue("定位元素失败",EditTextOB !=null);
        try {
            if(EditTextOB.isEnabled())EditTextOB.setText(text);
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with UiObjectNotFoundException",false);
        }catch (NullPointerException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with NullPointerException",false);
        }
    }

    public void input(String text){
        UiObject EditTextOB = element(TYPE_Class,CLASS_EDITTEXT);
        check.assertTrue("定位元素失败",EditTextOB !=null);
        try {
            if(EditTextOB.isEnabled())EditTextOB.setText(text);
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with UiObjectNotFoundException",false);
        }catch (NullPointerException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with NullPointerException",false);
        }
    }

    public void input(int Instance,String text){
        UiObject EditTextOB = element(TYPE_Class,CLASS_EDITTEXT,Instance);
        check.assertTrue("定位元素失败",EditTextOB !=null);
        try {
            if(EditTextOB.isEnabled())EditTextOB.setText(text);
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with UiObjectNotFoundException",false);
        }catch (NullPointerException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with NullPointerException",false);
        }
    }

}
