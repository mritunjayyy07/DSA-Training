public class SumOfdigits {

    static int sum(int num)
    {
        if(num == 0)
        return 0;


        return ((num%10) + sum(num/10));


    }
    

    static void sumofD(int num, int sum)
    {
        if(num == 0)
        {
            System.out.println(sum);
            return;
        }
        else
        sumofD(num/10,sum+num%10);
    }
    public static void main(String[] args) {
        int res = sum(123);
        
        System.out.println(res);

        sumofD(243,0);
    }
    
}
