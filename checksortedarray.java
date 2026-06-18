class Main{
 public static void main (String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        for(int i=1;i<n;i++)
        {
           if(!(a[i]>=a[i-1])){
        System.out.println(" Not a Sorted array");
        return;
           }
        }
        System.out.println("Sorted array");
    }
}
