package Inheritance;

public class classB extends classA  implements InterfaceA , InterfaceB {
    public void method1()
    {
        System.out.println("this is method1");
    }

    @Override
    public int method1(int a, int b) { //-> there are two instances in both Interface A and Interface B ,So we should make decision
        return super.method1(a,b);
    }

    public void methodA(int a , int b,int c)
    {
        System.out.println(a+b);
    }

    @Override
    public int method3(int a) {  //-> From InterfaceA
        return 0;
    }
}
