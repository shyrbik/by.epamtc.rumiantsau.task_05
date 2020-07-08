by.epamtc.rumiantsau.task_05.good;

import java.util.Map;

public class Speakers extends Goods{
    private double power_consumption;
    private double number_of_speakers;
    private String frequency_range;
    private double cord_length;

    public Speakers(Map<String, String> goodParam) {
        this.power_consumption = Double.parseDouble(goodParam.get("POWER_CONSUMPTION"));
        this.number_of_speakers = Double.parseDouble(goodParam.get("NUMBER_OF_SPEAKERS"));
        this.frequency_range = goodParam.get("FREQUENCY_RANGE");
        this.cord_length = Double.parseDouble(goodParam.get("CORD_LENGTH"));
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "power_consumption='" + power_consumption + '\'' +
                ", number_of_speakers='" + number_of_speakers + '\'' +
                ", frequency_range='" + frequency_range + '\'' +
                ", cord_length='" + cord_length + '\'' +
                '}' ;
    }

    public double getPower_consumption() {
        return power_consumption;
    }

    public double getNumber_of_speakers() {
        return number_of_speakers;
    }

    public String getFrequency_range() {
        return frequency_range;
    }

    public double getCord_length() {
        return cord_length;
    }

    public void setPower_consumption(double power_consumption) {
        this.power_consumption = power_consumption;
    }

    public void setNumber_of_speakers(double number_of_speakers) {
        this.number_of_speakers = number_of_speakers;
    }

    public void setFrequency_range(String frequency_range) {
        this.frequency_range = frequency_range;
    }

    public void setCord_length(double cord_length) {
        this.cord_length = cord_length;
    }
}
