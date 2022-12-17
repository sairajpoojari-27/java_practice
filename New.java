import java.util.Scanner;
class New
{
   public static void main(String[] args) 
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int a=sc.nextInt();
    int sum=0;
    while(a!=0)
    {
        int rmd=a%10;
        sum=sum+rmd;
        a=a/10;

    }
    if(sum!=0)
    {
        int temp=sum;
        sum=0;
        while(temp!=0)
        {
        int rmd=temp%10;
        sum=sum+rmd;
        temp=temp/10;

        }
    }
    int count=0;
    for(char i='A';i<='Z';i++)
    {
        count++;
        if(sum==count)
        {
            System.out.println(i);
        }
    }
    //System.out.println(sum);
   } 
}
