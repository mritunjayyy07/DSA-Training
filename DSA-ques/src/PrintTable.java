public class PrintTable {

    static  void printTable(int num , int count){
        if( num == 0)
        {
            System.out.println(count);
            return;
           

          
        }
        else{
            
            if(num % 10 == 0)
            printTable(num/10, count+1);
            else
            printTable(num/10, count);
           
            
            
        }

    }
    public static void main(String[] args) {
        printTable(10, 0);
        

    }
    
}
