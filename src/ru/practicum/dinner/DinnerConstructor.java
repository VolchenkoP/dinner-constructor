package ru.practicum.dinner;
import java.util.Random;


import java.util.ArrayList;
import java.util.HashMap;

public class DinnerConstructor {
    private final HashMap <String, ArrayList<String>> menu;
    ArrayList<String> combo;
    Random random;


    DinnerConstructor (){

        menu = new HashMap<>();

    }

    void addNewDish(String type, String name){
        if (menu.containsKey(type)){
            menu.get(type).add(name);
        } else {
            menu.put(type, new ArrayList<>());
            menu.get(type).add(name);
        }
    }

    void makeNewDinner(int numbersOfDinner, ArrayList<String> nextItems){
        String nameDish;
        ArrayList<String> nameDishList;
        random = new Random();
        for (int i = 0; i < numbersOfDinner; i++) {
            System.out.println("Комбо " + (i + 1));
            combo = new ArrayList<>();
            for (String type : nextItems){
                if (menu.containsKey(type)){
                    nameDishList = menu.get(type);
                    nameDish = nameDishList.get(random.nextInt(nameDishList.size()));
                    combo.add(nameDish);
                }
            }
            System.out.println(combo);
        }
    }

}
