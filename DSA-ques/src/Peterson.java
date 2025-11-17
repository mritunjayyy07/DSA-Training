public class Peterson {
    static int fact(int num)
    {
        if(num == 1)
        return 1;
        else
        {
            return num*fact(num-1);
        }
    }
    static int Petersonnum(int num)
    {
        if(num == 0)
        return 0;
        else{
            int p = fact(num%10);
            

            return (p + Petersonnum(num/10));
            
        }

    }

    static void Peter(int num, int sum, int org)
    {
        if(num == 0)
        {
            if(sum == org)
            System.out.println("peterson");
            else
            System.out.println("not");
        }
        else
        {
            int p =fact(num%10);
            Peter(num/10,sum+p,org);
        }
    }
    

    public static void main(String[] args) {

        int num = 145;
        int res = Petersonnum(num);
        Peter(num,0,145);
        System.out.println(res == num ? "Peterson" : " not");
        
    }
    
}
