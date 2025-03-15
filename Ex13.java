import java.util.*;

public class Ex13 {
      public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the size");
    int n=s.nextInt();
    int [] arr=new int[n];

    System.out.println("Enter The Elements");
    for(int i=0;i<arr.length;i++){
        int a=s.nextInt();
        arr[i]=a;
    } 
    int largest=Integer.MIN_VALUE;
    int second=Integer.MIN_VALUE; 
   
    for(int i=0;i<arr.length;i++){
        
        if(largest<arr[i]){
            second=largest;
            largest=arr[i];}
            else if(second<arr[i]&&largest!=arr[i]){
                second=arr[i];
            }

            }
    
           
            System.out.println(""+second);
          }
    
 }


