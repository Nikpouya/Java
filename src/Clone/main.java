package Clone;

import java.io.IOException;

public class main {
    public static void main(String[] arg) throws IOException {
        //Clone instance1 = new Clone("Ali","Rezayi") ;
        Clone instance1 = new Clone() ;
        instance1.Name = "abc" ;
        instance1.Family = "DEF0" ;
        try {
            Clone instance2 = (Clone)instance1.clone() ;
            System.out.println("First Instance :" + instance1.Name +" "+instance1.Family);
            System.out.println("Second Instance :" + instance2.Name +" "+instance2.Family);
            System.in.read() ;
            Runtime.getRuntime().exec("cls");

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
