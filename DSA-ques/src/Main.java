public class Main {
    static void fact(int n, int result)
    {
        if(n == 1)
        System.out.println(result);
        else

        fact(n-1 , (result*n));
    }
    public static void main(String[] args) {
        fact(5,1);
    }
    
}
