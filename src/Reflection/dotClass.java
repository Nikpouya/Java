package Reflection;

import NestedClass.NestedInterface.ClassInterface;

public class dotClass {
    public static void main(String[] args)
    {
        // If a type is available but there is no instance we can obtain a Class by appending ".class" to the name of the type.It can be used for primitive data type also

        Class c = boolean.class;
        System.out.println(c.getName());

        Class c2 = Polymorphism.classA.class;
        System.out.println(c2.getName());

        Class I1 = Inheritance.InterfaceA.class ;
        System.out.println(I1.isInterface());

    }
}
