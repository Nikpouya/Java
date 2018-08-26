package ComparablePlusComparator;

public class myClass implements Comparable<myClass> {
    public myClass(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    int age;
    String name;
    @Override
    public int compareTo(myClass o) {
        return this.age - o.age;
    }
}

// This ComparablePlusComparator marker is useful when we need to determine
// based on which attribute sorting should happens.
