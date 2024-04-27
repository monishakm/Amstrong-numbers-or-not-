import java.util.*;
public class Main 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
           int count=0;
           int num=a[i];
           while(num!=0)
           {
             count+=1;
             num=num/10;
             
           }
           int temp =a[i];
           int rem,sum=0;
           while(temp>0)
           {
               rem=temp%10;
               sum+=Math.pow(rem,count);
               temp=temp/10;
           }
           if(sum==a[i])
           {
               System.out.println(sum+" is a amstrong number");
           }
    
           
        }
        
        
        
    }
    
}
