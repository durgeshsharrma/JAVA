import java.util.*;
public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int NumArr[]= new int[6];
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<NumArr.length; i++){
                NumArr[i]=sc.nextInt();
                
                
        }
        int temp= NumArr[5];
        for(int i=4; i>=0; i--){
            NumArr[i+1]=NumArr[i];

        }
        NumArr[0]=temp;

        for(int i=0; i<NumArr.length; i++)
        {
            System.out.print(NumArr[i]);
        }


       


    }
}
