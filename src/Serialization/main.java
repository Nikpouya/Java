package Serialization;

import java.io.*;

public class main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Serialize() ;
        Deserialize();

    }

    public static void Serialize() throws IOException {
        Serialization myObj = new Serialization("Ali" , "Ahamadi" , 20) ;
        FileOutputStream f=new FileOutputStream("f.txt");
        ObjectOutputStream out=new ObjectOutputStream(f);
        out.writeObject(myObj);
        out.flush();
        out.close();
        f.close();
        System.out.println("success");
    }

    public static void Deserialize() throws IOException, ClassNotFoundException {
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
        Serialization myObj = (Serialization)in.readObject();
        System.out.println(myObj.name+" "+myObj.family+" "+myObj.age);
        in.close();
    }

}
