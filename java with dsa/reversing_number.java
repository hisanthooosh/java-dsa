public class reversing_number {
    public static void main (String [] args){

      int num = 12345;
      int  x=0;
      int ans=0;
      while (num >0){

        x=num%10;
        ans=ans*10+x;
        num=num/10;
        System.out.println(ans);
      }
           

    }
}
