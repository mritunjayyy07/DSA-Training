public class Armstrong1toN {
    
    static int pow(int num, int pow)
    {
        if(pow == 0)
        return 1;
        else
        {
            return (num*pow(num,pow-1));
        }
    }
    static int count(int n )

    {
        if(n == 0)
        return 0;
        else
        return 1+count(n/10);
    }
    static int Armstrong(int N,int d)
    {
        
        if(N == 0)
        {
            return 0;

        }
        else
        {
           
           return pow(N%10,d)+Armstrong(N/10,d);
        }
    }
    static void countArm(int n)
    {
        int d =count(n);
        if(n == 0)
        {
            return;
        }
        else{
            int res = Armstrong(n,d);
            if(res == n)
            System.out.println(n);
            countArm(n-1);

        }
    }

    
    public static void main(String[] args) {
        int n =10000;
        countArm(n);
        
    }
}
