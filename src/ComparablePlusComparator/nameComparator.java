package ComparablePlusComparator;

import java.util.Comparator;

public class nameComparator implements Comparator<myClass> {
    @Override
    public int compare(myClass o1, myClass o2) {
        if (o1.name.equalsIgnoreCase(o2.name)) return 1;
        else return 0;
    }
}
