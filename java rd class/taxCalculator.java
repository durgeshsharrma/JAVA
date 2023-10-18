import java.util.*;
public class taxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        int Salary = sc.nextInt();
        if(Salary <10000){
                  System.out.println("NO tax");
        }
        if(Salary >= 10000 || Salary < 20000)
        {
            Salary= (Salary/100)*10;
            System.out.println("Your salary after 10% tax is"+" "+ Salary);
        }
        if(Salary >= 20000 || Salary < 30000)
        {
            Salary= (Salary/100)*15;
            System.out.println("Your salary after 15% tax is"+" "+ Salary);
        }
        if(Salary >= 30000){
                
        }

    }
}
