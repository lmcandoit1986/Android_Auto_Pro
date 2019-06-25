package android.qa.xpro.Utils;

import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiScrollable;
import android.support.test.uiautomator.UiSelector;

import android.qa.xpro.Logging.Log_qa;


/**
 * Created by liming on 2019/4/28.
 */

public class Element extends Connection{

    private String TAG = "Element";
    public long WAIT_TIME_MAX = 3000;
    public static final String TYPE_TEXT ="text";
    public static final String TYPE_ID ="id";
    public static final String TYPE_Class ="class";


    public Element(){

    }

    public UiObject element(String Type, String id){
        UiObject Target =null;
        if (Type.equals(TYPE_TEXT)){
            Target = Door.getMydevice().findObject(new UiSelector().text(id));
        }else if(Type.equals(TYPE_ID)){
            Target = Door.getMydevice().findObject(new UiSelector().resourceId(id));
        }else if(Type.equals(TYPE_Class)){
            Target = Door.getMydevice().findObject(new UiSelector().className(id));
        }else{
            Log_qa.print_e(TAG,String.format("参数错误，请检查参数类型:%s",Type));
        }

        return Target;
    }

    public UiObject element(String Type, String id,String Type2,String id2){
        UiObject Target =null;
        if (Type.equals(TYPE_ID)){
            if (Type2.equals(TYPE_TEXT)){
                Target = Door.getMydevice().findObject(new UiSelector().resourceId(id).text(id2));
            }
        }else{
            Log_qa.print_e(TAG,String.format("参数错误，请检查参数类型:%s",Type));
        }
        return Target;
    }

    public UiObject element(String Type, String id, int Instance){
        UiObject Target =null;
        if (Type.equals(TYPE_TEXT)){
            Target = Door.getMydevice().findObject(new UiSelector().text(id).instance(Instance));
        }else if(Type.equals(TYPE_ID)){
            Target = Door.getMydevice().findObject(new UiSelector().resourceId(id).instance(Instance));
        }else if(Type.equals(TYPE_Class)){
            Target = Door.getMydevice().findObject(new UiSelector().className(id).instance(Instance));
        }else{
            Log_qa.print_e(TAG,String.format("参数错误，请检查参数类型:%s",Type));
        }
        return Target;
    }

    public UiObject element(String Type, String id, Long WATI_TIME){
        UiObject Target =null;
        if (Type.equals(TYPE_TEXT)){
            Target = Door.getMydevice().findObject(new UiSelector().text(id));
        }else if(Type.equals(TYPE_ID)){
            Target = Door.getMydevice().findObject(new UiSelector().resourceId(id));
        }else if(Type.equals(TYPE_Class)){
            Target = Door.getMydevice().findObject(new UiSelector().className(id));
        }else{
            Log_qa.print_e(TAG,String.format("参数错误，请检查参数类型:%s",Type));
        }

        if(Target!=null){
            Target.waitForExists(WATI_TIME);
        }
        return Target;

    }

    public UiObject element(String Type, String id, int Instance, Long WATI_TIME){
        UiObject Target =null;
        if (Type.equals(TYPE_TEXT)){
            Target = Door.getMydevice().findObject(new UiSelector().text(id).instance(Instance));
        }else if(Type.equals(TYPE_ID)){
            Target = Door.getMydevice().findObject(new UiSelector().resourceId(id).instance(Instance));
        }else if(Type.equals(TYPE_Class)){
            Target = Door.getMydevice().findObject(new UiSelector().className(id).instance(Instance));
        }else{
            Log_qa.print_e(TAG,String.format("参数错误，请检查参数类型:%s",Type));
        }
        /**
         * 判断元素是否存在
         */
        if(Target!=null){
            Target.waitForExists(WATI_TIME);
        }
        return Target;
    }

    public UiObject elemInListUseText(String List_Type, String List_id, String item_Type, String item_id, String Text){
        UiScrollable list =null;
        if (List_Type.equals(TYPE_Class)){
            list = new UiScrollable(new UiSelector().className(List_id));
        }else if(List_Type.equals(TYPE_ID)){
            list = new UiScrollable(new UiSelector().resourceId(List_id));
        }else{
            Log_qa.print_e(TAG,"参数错误，请检查参数类型,List_Type:"+List_Type);
            return null;
        }

        if (!list.waitForExists(WAIT_TIME_MAX)){
            Log_qa.print_e(TAG,String.format("定位列表失败，请检查参数类型,List_Type:%s,List_id:%s",List_Type,List_id));
            return null;
        }

        UiObject Target =null;
        try {
            if (item_Type.equals(TYPE_ID)) {
                Target = list.getChildByText(new UiSelector().resourceId(item_id),Text);
            }else if(item_Type.equals(TYPE_Class)){
                Target = list.getChildByText(new UiSelector().className(item_id),Text);
            }else{
                Log_qa.print_e(TAG,String.format("参数错误，请检查参数类型,item_Type:%s,item_id:%s",item_Type,item_id));
                return null;
            }
            return Target;

        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
            Log_qa.print_e(TAG,e.toString());
            return null;
        }
    }

    public Boolean hasElement(UiObject object){
        if(object!=null){
            if (object.exists()) return true;
                return false;
        }
        return false;
    }

}
