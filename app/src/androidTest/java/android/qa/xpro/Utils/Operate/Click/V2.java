package android.qa.xpro.Utils.Operate.Click;

import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;

import android.qa.xpro.Utils.Check;
import android.qa.xpro.Utils.Element;

/**
 * Created by liming on 2019/6/5.
 */

public class V2 extends Element {

    /**
     * 基础操作：点击，长按，拖动，输入
     * v1 不会做任何的校验
     * v2 会做基础检验，如果失败，会中断用例执行
     */

    public Check check;
    public final String TYPE_UP ="up";
    public final String TYPE_DOWN ="down";
    public final String TYPE_LEFT ="left";
    public final String TYPE_RIGHT ="right";
    private final String CLASS_TEXTVIEW ="android.widget.TextView";
    private final String CLASS_EDITTEXT ="android.widget.EditText";


    public V2(){
        check = new Check();
    }

    /**
     * 点击操作
     * @param id
     */
    public void clickById(String id){
        UiObject Target = element(TYPE_ID,id);
        check.assertTrue("定位元素失败",Target !=null);
        try {
            if(Target.isEnabled())Target.click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with UiObjectNotFoundException",false);
        }catch (NullPointerException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with NullPointerException",false);
        }
    }

    public void clickByIdAndInstance(String id,int Instance){
        UiObject Target = element(TYPE_ID,id,Instance);
        check.assertTrue("定位元素失败",Target !=null);
        try {
            if(Target.isEnabled())Target.click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with UiObjectNotFoundException",false);
        }catch (NullPointerException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with NullPointerException",false);
        }
    }

    public void clickByText(String text){
        UiObject Target = element(TYPE_TEXT,text);
        check.assertTrue("定位元素失败",Target !=null);
        try {
            if(Target.isEnabled())Target.click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with UiObjectNotFoundException",false);
        }catch (NullPointerException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with NullPointerException",false);
        }
    }

    public void clickByIdAndText(String id,String text){
        UiObject Target = element(TYPE_ID,id,TYPE_TEXT,text);
        check.assertTrue("定位元素失败",Target !=null);
        try {
            if(Target.isEnabled())Target.click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with UiObjectNotFoundException",false);
        }catch (NullPointerException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with NullPointerException",false);
        }
    }

    public void clickByTextAndInstance(String text,int Instance){
        UiObject Target = element(TYPE_TEXT,text,Instance);
        check.assertTrue("定位元素失败",Target !=null);
        try {
            if(Target.isEnabled())Target.click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with UiObjectNotFoundException",false);
        }catch (NullPointerException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with NullPointerException",false);
        }
    }

    public void clickByclass(String text){
        UiObject Target = element(TYPE_Class,text);
        check.assertTrue("定位元素失败",Target !=null);
        try {
            if(Target.isEnabled())Target.click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with UiObjectNotFoundException",false);
        }catch (NullPointerException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with NullPointerException",false);
        }
    }

    public void clickByClassAndInstance(String className,int Instance){
        UiObject Target = element(TYPE_Class,className,Instance);
        check.assertTrue("定位元素失败",Target !=null);
        try {
            if(Target.isEnabled())Target.click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with UiObjectNotFoundException",false);
        }catch (NullPointerException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with NullPointerException",false);
        }
    }

    public void clickByTextUseIdInList(String List_Type,String List_id,String item_id,String Text){
        UiObject Target = elemInListUseText(List_Type,List_id,TYPE_ID,item_id,Text);
        check.assertTrue("定位元素失败",Target !=null);
        try {
            if(Target.isEnabled())
                Target.click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with UiObjectNotFoundException",false);
        }catch (NullPointerException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with NullPointerException",false);
        }

    }

    public void clickByTextUseClassInList(String List_Type,String List_id,String Text){
        UiObject Target = elemInListUseText(List_Type,List_id,TYPE_Class,CLASS_TEXTVIEW,Text);
        check.assertTrue("定位元素失败",Target !=null);
        try {
            if(Target.isEnabled())
                Target.click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with UiObjectNotFoundException",false);
        }catch (NullPointerException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with NullPointerException",false);
        }

    }

    /**
     * 长按操作
     */

    public void longClickById(String id,int time){
        UiObject Target = element(TYPE_ID,id);
        check.assertTrue("定位元素失败",Target !=null);
        try {
            if(Target.isEnabled())Door.getMydevice().swipe(Target.getBounds().centerX(), Target.getBounds().centerY(), Target.getBounds().centerX(), Target.getBounds().centerY(), 50 * time);
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with UiObjectNotFoundException",false);
        }catch (NullPointerException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with NullPointerException",false);
        }
    }

    public void longClickByIdAndInstance(String id,int Instance,int time){
        UiObject Target = element(TYPE_ID,id,Instance);
        check.assertTrue("定位元素失败",Target !=null);
        try {
            if(Target.isEnabled())Door.getMydevice().swipe(Target.getBounds().centerX(), Target.getBounds().centerY(), Target.getBounds().centerX(), Target.getBounds().centerY(), 50 * time);
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with UiObjectNotFoundException",false);
        }catch (NullPointerException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with NullPointerException",false);
        }
    }

    public void longClickByText(String text,int time){
        UiObject Target = element(TYPE_TEXT,text);
        check.assertTrue("定位元素失败",Target !=null);
        try {
            if(Target.isEnabled())Door.getMydevice().swipe(Target.getBounds().centerX(), Target.getBounds().centerY(), Target.getBounds().centerX(), Target.getBounds().centerY(), 50 * time);
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with UiObjectNotFoundException",false);
        }catch (NullPointerException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with NullPointerException",false);
        }
    }

    public void longClickByTextAndInstance(String text,int Instance,int time){
        UiObject Target = element(TYPE_TEXT,text,Instance);
        check.assertTrue("定位元素失败",Target !=null);
        try {
            if(Target.isEnabled())Door.getMydevice().swipe(Target.getBounds().centerX(), Target.getBounds().centerY(), Target.getBounds().centerX(), Target.getBounds().centerY(), 50 * time);
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with UiObjectNotFoundException",false);
        }catch (NullPointerException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with NullPointerException",false);
        }
    }

    public void longClickByClass(String text,int time){
        UiObject Target = element(TYPE_Class,text);
        check.assertTrue("定位元素失败",Target !=null);
        try {
            if(Target.isEnabled())Door.getMydevice().swipe(Target.getBounds().centerX(), Target.getBounds().centerY(), Target.getBounds().centerX(), Target.getBounds().centerY(), 50 * time);
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with UiObjectNotFoundException",false);
        }catch (NullPointerException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with NullPointerException",false);
        }
    }

    public void longClickByClassAndInstance(String text,int Instance,int time){
        UiObject Target = element(TYPE_Class,text,Instance);
        check.assertTrue("定位元素失败",Target !=null);
        try {
            if(Target.isEnabled())Door.getMydevice().swipe(Target.getBounds().centerX(), Target.getBounds().centerY(), Target.getBounds().centerX(), Target.getBounds().centerY(), 50 * time);
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with UiObjectNotFoundException",false);
        }catch (NullPointerException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with NullPointerException",false);
        }
    }

    public void longClickByTextUseIdInList(String List_Type,String List_id,String item_id,String Text,int time){
        UiObject Target = elemInListUseText(List_Type,List_id,TYPE_ID,item_id,Text);
        check.assertTrue("定位元素失败",Target !=null);
        try {
            if(Target.isEnabled())
                Door.getMydevice().swipe(Target.getBounds().centerX(), Target.getBounds().centerY(), Target.getBounds().centerX(), Target.getBounds().centerY(), 50 * time);
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with UiObjectNotFoundException",false);
        }catch (NullPointerException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with NullPointerException",false);
        }

    }

    public void longClickByTextUseClassInList(String List_Type,String List_id,String Text,int time){
        UiObject Target = elemInListUseText(List_Type,List_id,TYPE_Class,CLASS_TEXTVIEW,Text);
        check.assertTrue("定位元素失败",Target !=null);
        try {
            if(Target.isEnabled())
                Door.getMydevice().swipe(Target.getBounds().centerX(), Target.getBounds().centerY(), Target.getBounds().centerX(), Target.getBounds().centerY(), 50 * time);
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with UiObjectNotFoundException",false);
        }catch (NullPointerException e) {
            e.printStackTrace();
            check.assertTrue("Click Failed with NullPointerException",false);
        }

    }

}
