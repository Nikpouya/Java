package ComparablePlusComparator;

import java.util.Comparator;

public class ageComparator implements Comparator<myClass> {
    @Override
    public int compare(myClass o1, myClass o2) {
        if (o1.age < o2.age) return -1;
        if (o1.age > o2.age) return 1;
        else return 0;
    }
}
