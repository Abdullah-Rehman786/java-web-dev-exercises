package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.gettoppings();


        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        for(Flavor flavor : flavors){
            System.out.println(flavor.getName()+ " allergens: "+flavor.getAllergens().size());
        }
        Comparator comparator = new FlavorComparator();
        flavors.sort(comparator);
        System.out.println("---------------------------");
        for(Flavor flavor : flavors){
            System.out.println(flavor.getName()+ " allergens: "+flavor.getAllergens().size());
        }
        System.out.println("---------------------------");

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        cones.sort(new ConeComparator());
        for(Cone cone : cones){
            System.out.println(cone.getName()+ ": "+cone.getCost());
        }
        System.out.println("---------------------------");

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        for(Topping top : toppings){
            System.out.println(top.getName()+ ": "+top.getCost());
        }
        toppings.sort(new ToppingComparator());
        System.out.println("---------------------------");
        for(Topping top : toppings){
            System.out.println(top.getName()+ ": "+top.getCost());
        }
    }
}
