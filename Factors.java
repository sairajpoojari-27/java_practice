import java.util.Scanner;
class Factors
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int a= sc.nextInt();
            int sum=0;
            System.out.println("factor is ");
           for (int i=1; i<=a; i++) 
          {
            
            if(a%i ==0)

            {
                System.out.println( i);
                sum=sum+i;
            }
            
          }  
          System.out.println("sum of factors is "+sum);
          if(sum==a)
          {
            System.out.println("prefect number");
          }
          else
          {
            System.out.print("not a perfect number");
          }
    }  
}
