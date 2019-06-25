package android.qa.xpro.Utils.Operate;

import android.app.Instrumentation;
import android.support.test.uiautomator.UiDevice;

import android.qa.xpro.Utils.Operate.Click.V1;
import android.qa.xpro.Utils.Operate.Click.V2;

/**
 * Created by liming on 2019/6/5.
 */

public class Operate {

    public V1 clickV1 ;
    public V2 clickV2 ;
    public Drag drag;
    public Input input;

    public Operate(){
        clickV1 = new V1();
        clickV2 = new V2();
        drag = new Drag();
        input = new Input();
    }

    public UiDevice getMydevice(){
        return clickV1.Door.getMydevice();
    }

    public Instrumentation getInstrumentation(){
        return clickV1.Door.getInstrumentation();
    }

}
