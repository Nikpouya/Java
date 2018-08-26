package Generic;

public class main {

    public static void main(String[] args)
    {
        Class<Integer> intClass = new Class<Integer>() ;
        intClass.add(10);
        System.out.println(intClass.get());

        Integer[] numbers = {1,2,3,4,5,6} ;
        Character[] chars = {'a','b','c','d'} ;

        Method.printArray(numbers);
        Method.printArray(chars);
    }
}
