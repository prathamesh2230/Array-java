import java.util.Scanner;

public class Ex10 {
   
      public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the size");
    int n=s.nextInt();
    int [] arr=new int[n];
    
  
   
    System.out.println("Enter The Elements");
    for(int i=0;i<arr.length;i++){
        int a=s.nextInt();
        arr[i]=a;
    
    
    } int sum=0;
for(int i=0;i<arr.length-1;i++){
    for(int j=i+1;j<arr.length;j++){
        if(arr[i]+arr[j]>sum)
        sum=arr[i]+arr[j];
    }
}
System.out.println("highest Sum is"+sum);}
}
