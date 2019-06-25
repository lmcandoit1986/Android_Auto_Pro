package android.qa.xpro.Utils;

/**
 * 主要完成初始化操作
 * Created by liming on 2019/4/28.
 */

public class Connection {

    public initDevices Door;

    public Connection(){
        Door = initDevices.getInstance();
    }

    public initDevices getDoor(){
        return Door;
    }

}
