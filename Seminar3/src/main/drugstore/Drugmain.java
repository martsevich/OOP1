package main.drugstore;

import main.drugstore.Component;
import main.drugstore.components.Azitronite;
import main.drugstore.components.Penicillin;
import main.drugstore.components.Pharmacy2;
import main.drugstore.components.Water;

import java.util.*;

public class Drugmain {
    public static void main(String[] args) {
        Component azitronite = new Azitronite("Azitronite", 150, 14);
        Component water = new Water("Water", 100, 1);
        Component penicillin = new Penicillin("Penicillin", 200, 6);

        Pharmacy2 p1 = new Pharmacy2();
        p1.addComponents(azitronite, water);

        Pharmacy2 p2 = new Pharmacy2();
        p2.addComponents(penicillin, water);

        Pharmacy2 p3 = new Pharmacy2();
        p3.addComponents(azitronite, penicillin);

        List<Component> components = new ArrayList<>();
        components.add(water);
        components.add(penicillin);
        //components.add(water);
        components.add(azitronite);


        System.out.println(components);

        Collections.sort(components);
        System.out.println(components);

        Collections.sort(components, Comparator.reverseOrder()); // сортировка в обратном порядке
        System.out.println("сортировка: " + components);

//        Iterator<Component> iterator = p1;
//        while (iterator.hasNext()) {
//            System.out.println(p1.next().toString());
//        }
//        for (Component c : p2){
//            System.out.println(c);
//        }
     }
}

