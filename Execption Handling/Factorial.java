package Exception;

import java.util.Scanner;

public class Factorial {
    
    public static int fact(int num) throws  NegativeFactorialException{
        if(num < 0){
          throw new NegativeFactorialException();
        }
        if(num == 0){
            return 1;
        }
        int ans = 1;
        for(int i=1; i<=num; i++){
            ans = ans*i;
        }
        return ans;
    } 

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int ans = fact(num);
            System.out.println("Within Try");
            System.out.println(ans);
            
        } catch (NegativeFactorialException e) {
            System.out.println("Negative Numbers have no factorials : " + e);
        }
        finally{
            System.out.println("Connection Close Bye : ");
        }
    }
}
