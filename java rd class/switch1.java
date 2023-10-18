
import java.util.*;
public class switch1 {
    public static void main(String[] args) {//YEAR IS LEAP YEAR OR NOT

        //switch statement includes int, char,byte,str;//YEAR IS LEAP YEAR OR NOT

        //YEAR IS LEAP YEAR OR NOT

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        int year = sc.nextInt();

        if(year%4==0 ){
            if(year%100!=0){
                System.out.println("the year is leap year");
                
            }
            if(year%400==0){
                System.out.println("the year is leap year");
            }else{
                System.out.println("the year is not leap year");
            }
            
        }else{
            System.out.println("the year is not a leap year");
        }
        

    }
}
