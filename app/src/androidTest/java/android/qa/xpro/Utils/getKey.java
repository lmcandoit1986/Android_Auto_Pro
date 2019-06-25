package android.qa.xpro.Utils;

import android.os.Bundle;
import android.support.test.InstrumentationRegistry;
//import androidx.test.runner.permission;

/**
 * Created by liming on 2019/5/23.
 */

public class getKey {

    public static String getBundle(){
        Bundle b= InstrumentationRegistry.getArguments();
        String values= (String) b.get("icon");
        return values;
    }
}
