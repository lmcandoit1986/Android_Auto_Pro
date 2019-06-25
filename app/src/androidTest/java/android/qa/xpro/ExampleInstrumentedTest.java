package android.qa.xpro;

import android.content.Context;
import android.os.Bundle;
import android.qa.xpro.Utils.SendBundle;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith( AndroidJUnit4.class )
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        Bundle bundle = new Bundle();
        bundle.putString("key","vaulesss");
        SendBundle sendBundle = new SendBundle(InstrumentationRegistry.getInstrumentation());
        sendBundle.sendStatus(5,bundle);
//        IAutomationSupport support = new IAutomationSupport() {
//            @Override
//            public void sendStatus(int resultCode, Bundle status) {
//
//            }
//        };
//        getAutomationSupport().
        assertEquals("dx.qa.xpro", appContext.getPackageName());
    }
}
