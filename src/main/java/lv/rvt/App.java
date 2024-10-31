package lv.rvt;

import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        {
            int[] val = {0, 1, 2, 3}; 
        
            int sum = 0;
            for(int i = 0; i < val.length; i++) {
                sum += val[i];
            }   
            System.out.println( "Sum of all numbers = " + sum );
         
           }
        

        scanner.close();
    }

}
