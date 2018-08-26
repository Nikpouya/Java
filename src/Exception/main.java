package Exception;

import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws StackOverflowError, SQLException, IndexOutOfBoundsException {
        try {
            int a = 1 / 0;
        }
//        catch (StackOverflowError e)
//        {
//        }
//        catch(ClassNotFoundException e)
//        {
//        }
//        catch (CloneNotSupportedException e)
//        {
//        }
//        catch (ArrayIndexOutOfBoundsException e)
//        {
//        }
//        catch (NoSuchFieldError e)
//        {
//        }
        catch (ArithmeticException e) {
            System.err.println(e.getMessage());
            throw e;
        } finally {
            String alaki = "hi" ;
            alaki.concat("wow");
            System.out.println(alaki);
            System.out.println("Finally Block is here !!");
        }

    }
}
