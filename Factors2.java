class Factors1
{
    public static void main(String[] args)
    {
        int count=0;
        for (int i = 1; i <500; i++) 
        {
            int sum=0;
            for (int j = 1; j <i; j++) 
            {
                if(i%j==0)
                {
                    sum=sum+j;
                }
                
                
            }
            if (sum==i)
            {
               
             count++;
            }
            
        }
        System.out.println(count);
        
    }
}
