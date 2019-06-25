package android.qa.xpro.Cases.PA.Object;

import android.qa.xpro.Logging.Log_qa;
import android.qa.xpro.Utils.Solo;

public class MainObject extends Solo{

    /**
     * 元素汇总
     */
    public static String Tab_id = "com.pa.health:id/radio";
    public static String Title_id = "com.pa.health:id/tv_title_left";

    /**
     * 切换Tab，tabName 为 Tab 的文本
     * @param tabName
     */
    public static void changeTab(String tabName){
        Log_qa.print_i(String.format("change Tab to %s",tabName));
        op.clickV2.clickByIdAndText(Tab_id,tabName);
    }

    public static Boolean assertInMainActivity(){
        if(op.clickV2.hasElement(op.clickV2.element("id",Title_id,"text","首页")))return true;
            return false;
    }

}
