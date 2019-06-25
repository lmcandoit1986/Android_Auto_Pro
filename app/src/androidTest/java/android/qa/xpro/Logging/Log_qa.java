package android.qa.xpro.Logging;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by liming on 2019/4/28.
 */

public class Log_qa {

    private static final Boolean IS_OPEN_LOG = Boolean.TRUE;
    private static final String TAG = "qa_test";

    public static void print(String logtext){
        if (IS_OPEN_LOG) Log.i(TAG, logtext);
    }

    public static void print(String TAG,String logtext){
        if (IS_OPEN_LOG) Log.i(TAG,logtext);
    }

    public static void print_i(String logtext){
       print(logtext);
    }

    public static void print_e(String logtext){
        if (IS_OPEN_LOG) Log.e(TAG,logtext);
    }

    public static void print_w(String logtext){
        if (IS_OPEN_LOG) Log.w(TAG,logtext);
    }

    public static void print_i(String TAG,String logtext){
        print(TAG,logtext);
    }

    public static void print_e(String TAG,String logtext){
        if (IS_OPEN_LOG) Log.e(TAG,logtext);
    }

    public static void print_w(String TAG,String logtext){
        if (IS_OPEN_LOG) Log.w(TAG,logtext);
    }


    public String getCurrentTime(){
        long time=System.currentTimeMillis();//long now = android.os.SystemClock.uptimeMillis();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1=new Date(time);
        String t1=format.format(d1);
        return t1;
    }

}
