package DesignPatterns.Delegation;

public class ClassB {
    private ClassA prt = new ClassA() ;
    public void print()
    {
        prt.print();
    }
}
