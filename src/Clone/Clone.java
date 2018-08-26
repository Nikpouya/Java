package Clone;

public class Clone implements Cloneable { //-> Cloneable is a Marker Interface (Like Serializable)

    public String Name ;
    public String Family ;
    public  Object clone() throws CloneNotSupportedException {
        return super.clone() ;

    }

}
