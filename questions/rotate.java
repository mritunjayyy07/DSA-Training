import java.util.*;
public class rotate{
    public static void main(String [] args)
    {
        int rot = 3;
        
        int num = 98634;
        int l = 0;
        int d = num;
        
        while(d != 0)
        {
            l++;
            d=d/10;
        }
        rot = rot%l;
        int pow =(int) Math.pow(10,l-1);
        // for(int i = 1; i <= rot; i++)
        // {
        //     d = num;
        //     int r = num%10;
        //     d = d/10;
        //     num = (r*pow) +d;
            
        // }
        int rightpart = num % (int)Math.pow(10,rot);
        int leftpart = num/ (int)Math.pow(10,rot);
        num = rightpart * pow + leftpart;//some error
        System.out.println(num);
    }
}