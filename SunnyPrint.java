class SunnyPrint
{
    public static void main(String[] args) 
    {
        int count=0;
        for (int i = 1; i <=500; i++) 
        {

            int t=i;
            for(int j=1;j<=i; j++)
            {
                if(j*j==i+1)
                {
                    count++;
                    System.out.println(t+"is sunny number");
            
                }
            } 

            
            
        }
        System.out.println(count);
        
    }
}