package Final;

public class main {
    public static final void main(String[] arg)
    {
        ClassA instance1 = new ClassA() ;
       //instance1.name = "Reza" ; Not possible , name is FINAL
        System.out.println(instance1.name);

    }
}
