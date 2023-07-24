package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone o1, Cone o2) {
        if (o1.getCost() - o2.getCost() < 0) {
            // o1 is less than o2
            return -1;
        } else if (o1.getCost() - o2.getCost() > 0) {
            //o1 is greater than o2
            return 1;
        } else {
            return 0;
        }
    }
}
