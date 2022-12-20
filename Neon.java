import java.util.Scanner;
class Neon
{
   public static void main(String[] args ) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int a=sc.nextInt();
    int prod=a*a;
    int sum=0; 
    while (prod!=0) 
    {
        int rmd=prod%10;
        sum=sum+rmd;
        prod=prod/10;
        
    }
    if(sum==a)
    {
        System.out.println(a+" it is neon number");
    }
    else

    {
        System.out.println(a+" it is not neon number");
    }

   }
}