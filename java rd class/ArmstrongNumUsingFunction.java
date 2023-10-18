import java.util.*;
public class ArmstrongNumUsingFunction {

    static int Counter(int d){
        int count=0;
        
          
           while(d>0){
            d=d/10;
           
            count++;
           }
           return count;
    }
    static void Armstrong(int num){
           int temp=num;
           int arm=0;
           int count=Counter(num);
           int b=0;
           while(num>0){
            b=num%10;
            arm=arm+(int)Math.pow(b,count);
            num=num/10;
           }
            if(temp==arm)
            {
                System.out.println("the Number is armstrong");
            }
           }


    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the number");
           int num = sc.nextInt();
           Armstrong(num);
    }
}
