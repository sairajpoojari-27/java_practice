import java.util.Scanner;
class Power
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the base: ");
        int a=sc.nextInt();
        System.out.println("enter the power: ");
        int b=sc.nextInt();
        int prod=1;
        for (int i = 1; i <=b; i++) 
        {
           prod=prod*a;
            
        }
        System.out.println(prod);
    }
}



