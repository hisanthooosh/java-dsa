import java.util.Scanner;

public class caluculater_program {
    

    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);

        boolean x = true;
        float result=0;

        while (x=true){
            System.out.println("enter the oparatir");
            char op = input.next().trim().charAt(0);
             if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){

                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if(op == '+'){
                    result= num1+num2;
                }
                 if(op == '-'){
                    result= num1-num2;
                }
                 if(op == '*'){
                    result= num1*num2;
                }
                 if(op == '/'){
                    result=num1/num2;
                    if (num2 == 0){
                        System.out.println(" undifind");
                    }else if (num1 == 0){
                        result=0;
                    }
                }
                if(op == '%'){
                    result= num1%num2;

                }

                System.out.println(result);
             }else if (op == 'x' || op == 'X'){
                x=false;
             }else{
                System.out.println("undefeind oparation");
             }
        }
    }
}
