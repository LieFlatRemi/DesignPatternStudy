package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeviceFactory {
    private Map<String, NetWorkDevice> pool;        //相当于享元池，保存所有设备

    public DeviceFactory() {
        pool = new HashMap<>();
        pool.put("TP", new Switch("TP-LINK-89ABPI"));
        pool.put("CISCO", new Hub("CISCO-WS-019-23"));
    }

    public NetWorkDevice getDevice(String type){
        return pool.get(type);
    }

    public int getPoolSize(){
        return pool.size();
    }
}
