package NestedClass;

public class LocalInnerClass {

    public void Func()
    {

        class subClass { //Access modifiers are not allowed here ( public,private,protected )

            public String Attrib ;

            public void subFunc (){
            }

        }

    }

}
