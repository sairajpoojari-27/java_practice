//import java.util.Scanner;
class Factors3
{
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        //System.out.println("enter the number");
        //int a=sc.nextInt();
        for (int i = 1; i <=20; i++) {
            System.out.println("Factors of "+i+" is ");
       
        for (int j = 1; j <=i; j++) {
            if(i%j==0)
            {
                System.out.println(j);
            }
        }

      } 
    }
}