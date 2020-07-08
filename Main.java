package by.epamtc.rumiantsau.task_05;

import task5.good.Goods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "F:/java/db/appliances_db.txt";
        String nameOfGood = "Oven";
        String paramForSearch = "WIDTH=59.5";
        //тут будут хранится все ссылки на созданные товары, которые отобраны согласно условию
        List<Goods> allMatches = new ArrayList<>();

        allMatches = SearchGood.findGoodByParam(nameOfGood, paramForSearch, fileName);


        for (Goods allMatch : allMatches) {
            System.out.println(allMatch);
        }





    }


    }






