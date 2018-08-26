package NestedClass;

public class StaticNestedClass {

    public static int a = 10 ;
    public void SuperFunc()
    {
        StaticNestedClass.subClass Obj = new StaticNestedClass.subClass();
        Obj.subFunc();
    }


    public class subClass {
        public void subFunc ()
        {
            System.out.println("This is subFunc");
        }
    }
}
