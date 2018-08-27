package Input;

import java.util.Scanner;

public class UsingScanner {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Enter something : ");
            String input = scanner.nextLine();

            if ("q".equals(input)) {
                System.out.println("Exit!");
                break;
            }

            System.out.println("input : " + input);
            System.out.println("-----------\n");
        }

        scanner.close();
    }
}
