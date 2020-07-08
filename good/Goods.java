by.epamtc.rumiantsau.task_05.good;

import java.util.Map;

public class Goods {
    Map<String, String> goodParam;


    public static Goods typeOfGood(String nameOfGood, Map<String, String> goodParam) {
        switch (nameOfGood) {
            case "Oven":
                return new Oven(goodParam);
            case "Laptop":
                return new Laptop(goodParam);
            case "Refrigerator":
                return new Refrigerator(goodParam);
            case "Speakers":
                return new Speakers(goodParam);
            case "TabletPC":
                return new TabletPC(goodParam);
            case "VacuumCleaner":
                return new VacuumCleaner(goodParam);
            default:
                System.out.println("Can not find such Good!");
                return null;
        }


    }
}
