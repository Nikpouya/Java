package NestedClass;


public class AnonymousInnerClass {

    public String Attrib ;

    public void Func2()
    {
        Class myclass = new Class() {
            @Override
            public void Fund1() {
                System.out.println("Hi there");
            }
        } ;
    }

}

abstract class Class {

    public abstract void Fund1() ;

}


