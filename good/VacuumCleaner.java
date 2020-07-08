by.epamtc.rumiantsau.task_05.good;

import java.util.Map;

public class VacuumCleaner extends Goods{
    private double power_consumption;
    private String filter_type;
    private String bag_type;
    private String wand_type;
    private double motor_speed_regulation;
    private double cleaning_width;

    public VacuumCleaner(Map<String, String> goodPara) {
        this.power_consumption = Double.parseDouble(goodParam.get("POWER_CONSUMPTION"));
        this.filter_type = goodParam.get("FILTER_TYPE");
        this.bag_type = goodParam.get("BAG_TYPE");
        this.wand_type = goodParam.get("WAND_TYPE");
        this.motor_speed_regulation = Double.parseDouble(goodParam.get("MOTOR_SPEED_REGULATION"));
        this.cleaning_width = Double.parseDouble(goodParam.get("CLEANING_WIDTH"));
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "power_consumption=" + power_consumption +
                ", filter_type='" + filter_type + '\'' +
                ", bag_type='" + bag_type + '\'' +
                ", wand_type='" + wand_type + '\'' +
                ", motor_speed_regulation=" + motor_speed_regulation +
                ", cleaning_width=" + cleaning_width +
                '}' ;
    }

    public double getPower_consumption() {
        return power_consumption;
    }

    public String getFilter_type() {
        return filter_type;
    }

    public String getBag_type() {
        return bag_type;
    }

    public String getWand_type() {
        return wand_type;
    }

    public double getMotor_speed_regulation() {
        return motor_speed_regulation;
    }

    public double getCleaning_width() {
        return cleaning_width;
    }

    public void setPower_consumption(double power_consumption) {
        this.power_consumption = power_consumption;
    }

    public void setFilter_type(String filter_type) {
        this.filter_type = filter_type;
    }

    public void setBag_type(String bag_type) {
        this.bag_type = bag_type;
    }

    public void setWand_type(String wand_type) {
        this.wand_type = wand_type;
    }

    public void setMotor_speed_regulation(double motor_speed_regulation) {
        this.motor_speed_regulation = motor_speed_regulation;
    }

    public void setCleaning_width(double cleaning_width) {
        this.cleaning_width = cleaning_width;
    }
}
