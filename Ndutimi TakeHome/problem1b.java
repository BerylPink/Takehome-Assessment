import java.util.Scanner;
import java.io.*;
public class MyClass {
    static int Result (int Numerator, int Denominator){
        
        if (Numerator == 0){
            return 0;
        }
        if  (Denominator == 0){
            return Integer.Max_VALUE;
        }
        boolean negResult = false;
        
        if (Numerator < 0){
            Numerator = -Numerator;
            if  (Denominator < 0){
                Denominator = -Denominator;
            }
            else{
                negResult true;
            }
        }
        else if (Denominator < 0){
            Denominator = -Denominator;
            negResult = true;
        }
        int Result = 0;
        
        while (Numerator >= Denominator) 
        { 
            Numerator = Numerator - Denominator; 
            Result++; 
        } 
        
        if (negResult){
            Result = -Result;
            return Result;
        }
    }
        
    public static void main(String args[]){
        int sign;
        int Product;
        int Remainder;
        

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Numerator:");
        Numerator = scanner.nextInt();
        System.out.println("Enter Denominator:");
        Denominator = scanner.nextInt();
        
        System.out.println("The Result is:" +Result);
        
        Product = Result * Denominator;
        Remainder = Product - Numerator;
        
         System.out.println("The Remainder is:" +Remainder);
                
        
    }
    
   
}