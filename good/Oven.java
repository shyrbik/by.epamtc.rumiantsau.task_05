by.epamtc.rumiantsau.task_05.good;
import java.util.Map;

 class Oven extends Goods {
     private double power_consumption;
     private double weight;
     private double capacity;
     private double depth;
     private double height;
     private double width;

    //конструктор через хешМап
    public Oven(Map<String, String> goodParam) {
        this.power_consumption = Double.parseDouble(goodParam.get("POWER_CONSUMPTION"));
        this.weight = Double.parseDouble(goodParam.get("WEIGHT"));
        this.capacity = Double.parseDouble(goodParam.get("CAPACITY"));
        this.depth = Double.parseDouble(goodParam.get("DEPTH"));
        this.height = Double.parseDouble(goodParam.get("HEIGHT"));
        this.width = Double.parseDouble(goodParam.get("WIDTH"));
    }
     @Override
     public String toString() {
         return "Oven{" +
                 "power_consumption='" + power_consumption + '\'' +
                 ", weight='" + weight + '\'' +
                 ", capacity='" + capacity + '\'' +
                 ", depth='" + depth + '\'' +
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

     public double getCapacity() {
         return capacity;
     }

     public double getDepth() {
         return depth;
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

     public void setCapacity(double capacity) {
         this.capacity = capacity;
     }

     public void setDepth(double depth) {
         this.depth = depth;
     }

     public void setHeight(double height) {
         this.height = height;
     }

     public void setWidth(double width) {
         this.width = width;
     }
 }
