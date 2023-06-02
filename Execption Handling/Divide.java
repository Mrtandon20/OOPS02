package Exception;

import java.util.Scanner;

public class Divide {

    public static int Division(int a, int b) throws ZeroDivisionException {
        if(b == 0){
            throw new ZeroDivisionException();
        }
        return a/b;
    }

    public static void main(String[] args)  {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Numerator : ");
            int num = sc.nextInt();
            System.out.println("Enter Denominator : ");
            int dem = sc.nextInt();

            try{
               int ans =  Division(num, dem);
                System.out.println("Within Try");
               System.out.println("Answer : " + ans);
            }
            catch (ZeroDivisionException e){
                System.out.println("Divide by 0 Exception raised : " + e);
            }
            finally{
                System.out.println("Connection off : ");
            }
        }
    }
