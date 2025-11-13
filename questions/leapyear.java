public class leapyear{
    public static void main(String [] args)
    {
        int y = 12323;
        if(y%100 == 0 && y%400 ==0)
        System.out.println("leap");
        else
        {
            if(y%4 == 0)
            System.out.println("leap");
            else
            System.out.println("not");
        }
    }
}