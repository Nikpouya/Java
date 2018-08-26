package ComparablePlusComparator;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] arg)
    {
        ArrayList<myClass> myArr = new ArrayList<myClass>();
        myArr.add(new myClass("ali",10));
        myArr.add(new myClass("reza",30));
        myArr.add(new myClass("hassan",20));
        Collections.sort(myArr);
        // Comparable is enough here

        // if we want to use Comparator with ageComparator and nameComparator we continue

        ageComparator ac = new ageComparator();
        Collections.sort(myArr,ac);

        nameComparator nc = new nameComparator();
        Collections.sort(myArr,nc);

        Collections.sort(myArr, new Comparator<myClass>() {
            @Override
            public int compare(myClass o1, myClass o2) {
                return o1.compareTo(o2);
            }
        });

        Collections.sort(myArr,(a,b) -> b.compareTo(a)); // java 8 - lambda
    }

  //  To summarize, if sorting of objects needs to be based on natural order then use Comparable
  // whereas if you sorting needs to be done on attributes of different objects, then use Comparator
}
