package String;

public class main {
    public static void main(String[] args){

            String s = "hi" ; //-> String literal is memory efficient
            String s2 = "hi" ; // -> No OBJECT is created for s2 ... it uses OBJECT of s in " String Constant Pool " !
            String s3 = new String("hi") ; // -> new OBJECT in non-pool(heap)

            s.concat("wow");

            System.out.println(s); // hi will be printed !! Cause String object is immutable (Like final) ! It means you cannot change the
            // value after creation ! if you wanna change , you should do it in this way :

            s = s.concat("wow") ;

            System.out.println(s);

    }
}
