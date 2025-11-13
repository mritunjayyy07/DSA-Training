public class Pattern{
    public static void main(String [] args)
    {
        int n =8;
        for(int i =1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                // if(i == 1 || j == 1 || i == n || j == n)
                // {
                //     System.out.print("*");
                // }
                // else
                // System.out.print(" ");



                // if(i == j || (i+j-1 == n))
                // System.out.print("*");
                // else
                // System.out.print(" ");

                // if(j <= i && i <= n)
                // {
                //     System.out.print("*");

                // }
                // if(i > n)
                // {
                //     if(j <= (2*n-i))
                //     System.out.print("*");
                // }


                // if( j >= n -i +1)
                // System.out.print("* ");
                // else
                // System.out.print(" ");


                if(i == n/2 || j == n/2)
                System.out.print("*");

                else  if(j == n && i >= n/2)
                System.out.print("*");

                else if(i == 1 && j >= n/2)
                System.out.print("*");

                


                else if(j == 1 && i <= n/2)
                System.out.print("*");

                else if(i == n && j <= n/2)
                System.out.print("*");

                else
                System.out.print(" ");

                
                


            }
            System.out.println();
        }
    }
}


   *
  *. *