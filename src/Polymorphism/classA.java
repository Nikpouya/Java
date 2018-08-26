package Polymorphism;

public class classA {
    public int method1(int a) {
        return a ;
    }

    public int method1(int a, int b) {
        return a+b;
    }

    public String method1(int a , int b , int c) {
        return String.valueOf(a+b+c);
    }

    public int method2(int a) {
        return a;
    }

    private int method3(int a) //-> This method cannot be overridden
    {
        return a ;
    }

    public final int method4(int a) //-> This method cannot be overridden too
    {
        return a ;
    }

    public classA get()
    {
        return  this ;
    }

    public void ShowMessage()
    {
        System.out.println("This is ClassA") ;
    }


  //  public abstract  int method3(int a) ;// -> Method cannot be abstract unless the class is defined abstract !!!
}
