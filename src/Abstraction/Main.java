package Abstraction;

public class Main {


    public static void main(String[] arg) {

        Abstraction abs = new Abstraction() {
            @Override
            public String method2(int a) {
                return String.valueOf(a);
            }
        } ;


        Abstraction abs2 = new Abstraction() {
            @Override
            public String method2(int a) {
                return "ghalat";
            }
        } ;

//        Abstraction.Abstraction abs3 = null;
//        abs3.protectedNumber = 10 ; ->Null pointer Exception


        System.out.println(abs.method2(10) + abs.method1("a","b") + abs.protectedNumber) ;
        System.out.println(abs2.method2(10) + abs2.method1("a","b") + abs.protectedNumber) ;
//        System.out.println(abs3.method2(10) + abs3.method1("a","b")+abs.protectedNumber) ;

    }


}
