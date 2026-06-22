
public class Main
{
    static void count(int n)
    {
        if(n==0)
        return;
        System.out.println(n);
        count(n-1);
    }
	

     static int factorial(int n){
        // int fact=1;
         if(n==0)
         return 1;
           return n*factorial(n-1);
     }
      
      static int  power(int a,int b,int pro)
      {
          
          if(b==0)
          return pro;
          
         
         return power(a,b-1,pro*a);
         
        
      }
     	public static void main(String[] args){
     	System.out.println(factorial(5));
     	count(10);
     	int pro=1;
         System.out.println(power(5,2,pro));
       	}
 }
