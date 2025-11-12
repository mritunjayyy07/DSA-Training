public class ifelse{
    public static void main(String [] args)
    {
       int n  =34512;
       int i =1;
       int sum = 0;
       while(n != 0)
       {
        int r = n%10;
        int toAdd =i*(int)Math.pow(10,r-1);
        sum+=toAdd;
        i++;
        n=n/10;

       }
       System.out.println(sum);
       


    }
}