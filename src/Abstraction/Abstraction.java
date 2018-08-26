package Abstraction;

public abstract class Abstraction {

    public int publicNumber ;
    private int privateNumber;
    protected int  protectedNumber ;

    public String method1(String a , String b)
    {
        return "method1" ;
    }

    public abstract String method2(int a) ;

}
