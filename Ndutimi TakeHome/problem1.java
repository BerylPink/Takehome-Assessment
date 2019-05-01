import java.util.Scanner;
class problem1{
    public static void main(String args[]){
        int Numerator;
        int Denominator;
        int sign;
        int Product;
        int Remainder;
        int Result = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numerator:");
        Numerator = sc.nextInt();
        System.out.println("Enter Denominator:");
        Denominator = sc.nextInt();

        sign = Numerator + Denominator ;

        while(sign>Denominator){
           sign = sign - Denominator;
            Result++;
        }

        Product = Result * Denominator;
        Remainder = Numerator - Product;

        if (Denominator = 0) {
            System.out.println("Number cannot be divided by 0! /n Please Enter Denominator:");
            Denominator = sc.nextInt();  
        }
        else{
            System.out.println("The Result is:" +Result);
            System.out.println("The Remainder is:" +Remainder);
            
        }

       
    }
}