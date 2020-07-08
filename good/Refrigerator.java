by.epamtc.rumiantsau.task_05.good;

import java.util.Map;

public class Refrigerator extends Goods{
    private double power_consumption;
    private double weight;
    private double freezer_capacity;
    private double overall_capacity;
    private double height;
    private double width;

    public Refrigerator(Map<String, String> goodParam) {
        this.power_consumption = Double.parseDouble(goodParam.get("POWER_CONSUMPTION"));
        this.weight = Double.parseDouble(goodParam.get("WEIGHT"));
        this.freezer_capacity = Double.parseDouble(goodParam.get("FREEZER_CAPACITY"));
        this.overall_capacity = Double.parseDouble(goodParam.get("OVERALL_CAPACITY"));
        this.height = Double.parseDouble(goodParam.get("HEIGHT"));
        this.width = Double.parseDouble(goodParam.get("WIDTH"));
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "power_consumption='" + power_consumption + '\'' +
                ", weight='" + weight + '\'' +
                ", freezer_capacity='" + freezer_capacity + '\'' +
                ", overall_capacity='" + overall_capacity + '\'' +
                ", height='" + height + '\'' +
                ", width='" + width + '\'' +
                '}' ;
    }

    public double getPower_consumption() {
        return power_consumption;
    }

    public double getWeight() {
        return weight;
    }

    public double getFreezer_capacity() {
        return freezer_capacity;
    }

    public double getOverall_capacity() {
        return overall_capacity;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setPower_consumption(double power_consumption) {
        this.power_consumption = power_consumption;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFreezer_capacity(double freezer_capacity) {
        this.freezer_capacity = freezer_capacity;
    }

    public void setOverall_capacity(double overall_capacity) {
        this.overall_capacity = overall_capacity;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
