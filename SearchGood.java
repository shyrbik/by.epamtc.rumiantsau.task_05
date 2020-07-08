package by.epamtc.rumiantsau.task_05;

import task5.good.Goods;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SearchGood {

    public static List<Goods> findGoodByParam (String nameOfGood, String paramForSearch, String fileName) throws IOException {
        //считываем файл в строку
        String strDB = fileRead(fileName);
        List<Goods> allMatches = new ArrayList<>();
        String[] arrayDB = strDB.replace(";","").split("\n");
        List<String> goodsMatches = new ArrayList();
        //сюда будем писать характеристики товара

        for (String s : arrayDB) {
            if ((s.contains(nameOfGood)) && (s.contains(paramForSearch))) {
                goodsMatches.add(s);
            }
        }

        if (goodsMatches.size() == 0){
            System.out.println("No Matches Found");}

        else {
            String[] arrayNatches;
            for (String goodsMatch : goodsMatches) {
                Map<String, String> goodParam = new HashMap<>();
                //Оставляем только параметры
                arrayNatches = goodsMatch.replace(nameOfGood + " : ", "").split(", ");

                for (String arrayNatch : arrayNatches) {
                    //записываем в хеш мапу НазваниеХарактеристики - ЗначениеХарактеристики
                    goodParam.put(arrayNatch.split("=")[0],
                            arrayNatch.split("=")[1]);
                }

                //Тут создаем товар исходя из его типа и характеристик и добавляем его в коллекцию
                allMatches.add(Goods.typeOfGood(nameOfGood,goodParam));
            }
        }

        return allMatches;
    }


    private static String fileRead(String fileName) throws IOException {
        StringBuilder strDB = new StringBuilder();

        FileReader fr= new FileReader(fileName);
        Scanner scan = new Scanner(fr);
        while (scan.hasNextLine()) {
            strDB.append(scan.nextLine()).append("\n");
        }
        fr.close();

        return strDB.toString();
    }



}

