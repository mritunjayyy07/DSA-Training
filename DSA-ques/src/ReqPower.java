public class ReqPower {


    static int pow(int num,int poww)
    {
        if(poww == 0)
        return 1;
        return num*pow(num,poww-1);
    }

    static void power(int num,int pow,int result)
    {
        if(pow == 0)
       System.out.println(result);
        else
        power(num,pow-1,result*num);
    }
    public static void main(String[] args) {
        power(5,3,1);
       int ans = pow(5,4);
        System.out.println(ans);
    }
    
}
