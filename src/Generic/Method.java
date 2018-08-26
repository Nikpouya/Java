package Generic;

public class Method {
    public static <E> void printArray(E[] Elements)
    {
        for(E element : Elements)
        {
            System.out.println(element);
        }
        System.out.println();
    }


}
