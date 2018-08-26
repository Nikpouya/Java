package Polymorphism;

public class classB extends classA {
    @Override
    public int method2(int a) {

        return super.method2(a);
    }


    public classB get()
    {
        return this ;
    }

    public void ShowMessage()
    {
        System.out.println("This is ClassB") ;
    }


}
