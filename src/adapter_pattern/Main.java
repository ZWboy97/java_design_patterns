package adapter_pattern;

import adapter_pattern.adapter.AdapteeClass;
import adapter_pattern.adapter.Adapter;
import adapter_pattern.adapter.TargetClass;
import adapter_pattern.appearance.Operation;
import adapter_pattern.appearance.TargetSystem;
import adapter_pattern.appearance.devices.Device1;
import adapter_pattern.appearance.devices.Device2;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/12 23:02
 */
public class Main {

    public static void main(String [] args) throws Exception{
        Adapter adapter = new Adapter(new AdapteeClass("Adaptee"));
        TargetClass target = new TargetClass(adapter);
        target.run();

        Device1 device1 =  new Device1("Device1");
        Device2 device2 = new Device2("Device2");
        Operation operation = new Operation(device1,device2);
        TargetSystem system = new TargetSystem(operation);
        system.getUp();
        system.getOff();

    }

}
