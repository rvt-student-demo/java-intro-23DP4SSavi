package lv.rvt;

import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write numbers: ");

        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
        }

        scanner.close();
    }
}




