package android.qa.xpro.Utils;

import android.app.Instrumentation;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;

/**
 * Created by liming on 2019/4/30.
 */

public class initDevices {

    private static initDevices Instance;
    private Context MyContext;
    private UiDevice Mydevice;
    private Instrumentation instrumentation;
    private int PhoneHeight;
    private int PhoneWidth;
    private String Module;
    private String sdk_version;
    private Context TargetContext;

    private initDevices(){
        Mydevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        instrumentation = InstrumentationRegistry.getInstrumentation();
        MyContext = InstrumentationRegistry.getInstrumentation().getContext();
        PhoneHeight = Mydevice.getDisplayHeight();
        PhoneWidth = Mydevice.getDisplayWidth();
        Module=(android.os.Build.MODEL).replace("\r","").replace("\n","");
        sdk_version=android.os.Build.VERSION.SDK;
        TargetContext =InstrumentationRegistry.getTargetContext();
    }

    public static initDevices getInstance(){
        if(Instance==null){
            Instance = new initDevices();
        }
        return Instance;
    }

    public UiDevice getMydevice(){
        return Mydevice;
    }

    public Context getMyContext(){
        return MyContext;
    }

    public int getPhoneHeight(){
        return PhoneHeight;
    }

    public int getPhoneWidth(){
        return PhoneWidth;
    }

    public String getModule(){
        return Module;
    }

    public String getSdk_version(){
        return sdk_version;
    }

    public Context getTargetContext(){
        return TargetContext;
    }

    public Instrumentation getInstrumentation(){
        return instrumentation;
    }

}
