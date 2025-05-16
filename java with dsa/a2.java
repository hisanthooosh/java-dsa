import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {


        // area of circle
        
        // Scanner in = new Scanner(System.in);

        // System.out.println(" enter the value of redues");
        
        //  float r = in.nextInt();

         
        //  float a =(22f/7f)*r*r;

        //  System.out.println(a);

        // area of triangle

        // Scanner in = new Scanner(System.in);

        // System.out.println("enter the base of the trinagel");
        // float b = in.nextFloat();

        // System.out.println("enter the hight of the trinagel");
        // float h = in.nextFloat();

        // float a = 0.5f*b*h;

        // System.out.println(a);

        // Subtract the Product and Sum of Digits of an Integer
        
        // int num = 23 ;

        // int sum = 0;
        // int pro =1;

        // while (num > 0) {

        //     sum = sum + num%10;

        //     pro = pro*num%10;

        //     num = num/10;
            
        // }

        // System.out.println(sum - pro    );

        // Input a number and print all the factors of that number (use loops).

        Scanner in = new Scanner( System.in);

        int num = in.nextInt();

        for ( int i = 2 ; i <= num ; i++){

            if ( num % i == 0 ){

                System.out.println(i);
            }
        }
    }
}
