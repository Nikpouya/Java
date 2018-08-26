package Reflection;

public class getClass {
    public static void main(String[] args)
    {
        //  It should be used if you know the type. Moreover, it can be used with primitives.
        Polymorphism.classA classA = new Polymorphism.classA() ;
      //  getClass getClass = new getClass() ;
        getClass.PrintName(classA);
    }

    public static void PrintName(Object obj)
    {
        Class C = obj.getClass() ;
        System.out.println(C.getName());
    }
}
