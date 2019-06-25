package android.qa.xpro.Utils;

import android.app.Instrumentation;
import android.os.Bundle;
import android.support.test.uiautomator.IAutomationSupport;

/**
 * Created by liming on 2019/5/24.
 */

public class SendBundle implements IAutomationSupport {

    private Instrumentation mInstrumentation;

    public SendBundle(Instrumentation instrumentation) {
        mInstrumentation = instrumentation;
    }

    @Override
    public void sendStatus(int resultCode, Bundle status) {
        mInstrumentation.sendStatus(resultCode, status);
    }
}
