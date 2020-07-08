by.epamtc.rumiantsau.task_05.good;

import java.util.Map;

public class TabletPC extends Goods{
    private double battery_capacity;
    private double  display_inches;
    private double memory_rom;
    private double flash_memory_capacity;
    private String color;

    public TabletPC(Map<String, String> goodPara) {
        this.battery_capacity = Double.parseDouble(goodParam.get("BATTERY_CAPACITY"));
        this. display_inches = Double.parseDouble(goodParam.get("DISPLAY_INCHES"));
        this.memory_rom = Double.parseDouble(goodParam.get("MEMORY_ROM"));
        this.flash_memory_capacity = Double.parseDouble(goodParam.get("FLASH_MEMORY_CAPACITY"));
        this.color = goodParam.get("COLOR");
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "battery_capacity='" + battery_capacity + '\'' +
                ", display_inches='" + display_inches + '\'' +
                ", memory_rom='" + memory_rom + '\'' +
                ", flash_memory_capacity='" + flash_memory_capacity + '\'' +
                ", color='" + color + '\'' +
                '}' ;
    }

    public double getBattery_capacity() {
        return battery_capacity;
    }

    public double getDisplay_inches() {
        return display_inches;
    }

    public double getMemory_rom() {
        return memory_rom;
    }

    public double getFlash_memory_capacity() {
        return flash_memory_capacity;
    }

    public String getColor() {
        return color;
    }

    public void setBattery_capacity(double battery_capacity) {
        this.battery_capacity = battery_capacity;
    }

    public void setDisplay_inches(double display_inches) {
        this.display_inches = display_inches;
    }

    public void setMemory_rom(double memory_rom) {
        this.memory_rom = memory_rom;
    }

    public void setFlash_memory_capacity(double flash_memory_capacity) {
        this.flash_memory_capacity = flash_memory_capacity;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
