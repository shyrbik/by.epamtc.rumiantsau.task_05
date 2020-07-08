by.epamtc.rumiantsau.task_05.good;

import java.util.Map;

public class Laptop extends Goods{
    private double battery_capacity;
    private String os;
    private double memory_ro;
    private double system_memory;
    private double cpu;
    private double display_inchs;


    public Laptop(Map<String, String> goodParam) {
        this.battery_capacity = Double.parseDouble(goodParam.get("BATTERY_CAPACITY"));
        this.os = goodParam.get("OS");
        this.memory_ro = Double.parseDouble(goodParam.get("MEMORY_RO"));
        this.system_memory = Double.parseDouble(goodParam.get("SYSTEM_MEMORY"));
        this.cpu = Double.parseDouble(goodParam.get("CPU"));
        this.display_inchs = Double.parseDouble(goodParam.get("DISPLAY_INCHS"));
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "battery_capacity='" + battery_capacity + '\'' +
                ", os='" + os + '\'' +
                ", memory_ro='" + memory_ro + '\'' +
                ", system_memory='" + system_memory + '\'' +
                ", cpu='" + cpu + '\'' +
                ", display_inchs='" + display_inchs + '\'' +
                '}' ;
    }

    public double getBattery_capacity() {
        return battery_capacity;
    }

    public String getOs() {
        return os;
    }

    public double getMemory_ro() {
        return memory_ro;
    }

    public double getSystem_memory() {
        return system_memory;
    }

    public double getCpu() {
        return cpu;
    }

    public double getDisplay_inchs() {
        return display_inchs;
    }

    public void setBattery_capacity(double battery_capacity) {
        this.battery_capacity = battery_capacity;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setMemory_ro(double memory_ro) {
        this.memory_ro = memory_ro;
    }

    public void setSystem_memory(double system_memory) {
        this.system_memory = system_memory;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public void setDisplay_inchs(double display_inchs) {
        this.display_inchs = display_inchs;
    }
}
