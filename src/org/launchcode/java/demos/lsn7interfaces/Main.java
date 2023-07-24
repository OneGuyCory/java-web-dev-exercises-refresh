package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getAllergens());
        }

        flavors.sort(new FlavorComparator());
        System.out.println("\n");

        for (Flavor flavor : flavors) {
            System.out.println(flavor.getAllergens());
        }

        System.out.println("\n");

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        for (Cone cone : cones) {
            System.out.println(cone.getCost());
        }

        cones.sort(new ConeComparator());
        System.out.println("\n");

        for (Cone cone : cones) {
            System.out.println(cone.getCost());
        }

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
