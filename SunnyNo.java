import java.util.Scanner;
class SunnyNo
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number: "); 
       int a=sc.nextInt();
       int sum=a+1;
       int count=0;
       for (int i =1; i <=a; i++) 
       {
           if (i*i==sum) 
           {
             count++;
             break;
           }
        
       }
       if (count==1) 
       {
        System.out.println(a+"is a sunny number");
        
       }
       else
       {
        System.out.println(a+"is not a sunny number");
       }
    }
}