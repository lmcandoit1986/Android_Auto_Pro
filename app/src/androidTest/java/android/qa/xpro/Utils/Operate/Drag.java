package android.qa.xpro.Utils.Operate;

import android.qa.xpro.Logging.Log_qa;
import android.qa.xpro.Utils.Element;

/**
 * Created by liming on 2019/6/5.
 */

public class Drag extends Element {

    public final String TYPE_UP ="up";
    public final String TYPE_DOWN ="down";
    public final String TYPE_LEFT ="left";
    public final String TYPE_RIGHT ="right";

    public Drag(){}

    /**
     * 拖动
     */


    public void Drag(String type,int Cycle){

        int PH =Door.getPhoneHeight();
        int PW =Door.getPhoneWidth();

        /**
         * type参数，用于控制滑动方向，依次是up，down，left，right
         * index参数，用户控制滑动参数
         */

        int height_up = PH/ 3;
        int height_down = PH / 2 * 2;
        int mid_height = PH / 2;

        int mid_width = PW / 2;
        int width_left = PW / 3;
        int width_right = PW / 3 * 2;

        Log_qa.print(String.format("Drag:%s,time:%d",type,Cycle));

        if (type.equals(TYPE_UP)) {
            for (int i = 0; i < Cycle; i++) {

                Door.getMydevice().swipe(mid_width, height_down/2, mid_width, height_up/2, 30);
                Sleep(1000);
            }
        } else if (type.equals(TYPE_DOWN)) {
            for (int i = 0; i < Cycle; i++) {
                Door.getMydevice().swipe(mid_width, height_up, mid_width, height_down, 30);
                Sleep(1000);
            }
        } else if (type.equals(TYPE_LEFT)) {
            for (int j = 0; j < Cycle; j++) {

                Door.getMydevice().swipe(width_right, mid_height, width_left, mid_height, 5);
                Sleep(1000);
            }
        } else if (type.equals(TYPE_RIGHT)) {
            for (int j = 0; j < Cycle; j++) {

                Door.getMydevice().swipe(width_left, mid_height, width_right, mid_height, 5);
                Sleep(1000);
            }
        } else {
            Log_qa.print_e(String.format("wrong cmd!,To:%s",type));
        }

    }

    public void Drag_v2(String type,int Cycle,int location){

        int PH =Door.getPhoneHeight();
        int PW =Door.getPhoneWidth();

        /**
         * type参数，用于控制滑动方向，依次是up，down，left，right
         * index参数，用户控制滑动参数
         */

        int height_up = PH/ 3;
        int height_down = PH / 2 * 2;
        int mid_height = PH / 2;

        int mid_width = PW / 2;
        int width_left = PW / 3;
        int width_right = PW / 3 * 2;

        Log_qa.print(String.format("Drag:%s,time:%d",type,Cycle));

        if (type.equals(TYPE_UP)) {
            for (int i = 0; i < Cycle; i++) {
                if(location <PW)
                    Door.getMydevice().swipe(location, height_down/2, location, height_up/2, 30);
                Sleep(1000);
            }
        } else if (type.equals(TYPE_DOWN)) {
            for (int i = 0; i < Cycle; i++) {
                if(location <PW)
                    Door.getMydevice().swipe(location, height_up, location, height_down, 30);
                Sleep(1000);
            }
        } else if (type.equals(TYPE_LEFT)) {
            for (int j = 0; j < Cycle; j++) {
                if(location <PH)
                    Door.getMydevice().swipe(width_right, location, width_left, location, 5);
                Sleep(1000);
            }
        } else if (type.equals(TYPE_RIGHT)) {
            for (int j = 0; j < Cycle; j++) {
                if(location <PH)
                    Door.getMydevice().swipe(width_left, location, width_right, location, 5);
                Sleep(1000);
            }
        } else {
            Log_qa.print_e(String.format("wrong cmd!,To:%s",type));
        }

    }

    /**
     * sleep
     * @param ms
     */

    public void Sleep(long ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


