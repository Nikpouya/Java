package Inheritance;

public interface InterfaceA extends InterfaceB {
    public default int method1(int a, int b) //->  From JDK JavaSE 8,
    {
        return a+b+1 ;
    }

    public static int method2(int a)
    {
        return a ;
    } //->  From JDK JavaSE 8,

    public int method3(int a) ;

}
