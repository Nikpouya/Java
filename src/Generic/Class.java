package Generic;

public class Class<T> {
    private T obj ;
    public void add(T obj)
    {
        this.obj = obj ;
    }

    public T get()
    {
        return this.obj ;
    }
    
}
