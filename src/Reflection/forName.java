package Reflection;

public class forName {

    public static void main(String[] args) throws ClassNotFoundException {

        // Use to load class dynamically . qualified Name should be known . Cannot be used for primitive types
        Class C = Class.forName("Polymorphism.classA") ; // -> ClassPath

        System.out.println(C.getName());
    }
}
