package Polymorphism;

public class main {
    public static void main(String[] arg)
    {
        classA cA = null ;
        cA = new classA() ;

        classB cB = new classB() ;

        System.out.println(cA.method1(1));
        System.out.println(cA.method1(1,2));
        System.out.println(cB.method1(1));
        System.out.println(cB.method2(1));
        System.out.println(cB.method1(1,2,3));

        new classB().get().ShowMessage() ; //-> Covariant overriding (from Java 5 onward)
    }
}
