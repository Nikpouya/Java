package Serialization;

import java.io.Serializable;

public class Serialization implements Serializable  {

    public String name ;
    public String family ;
    public transient int age ; // -> it will not be serialized

    public Serialization(String name , String family , int age)
    {
        this.name = name ;
        this.family = family ;
        this.age = age ;
    }
}
