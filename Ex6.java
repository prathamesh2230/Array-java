import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the size");
    int n=s.nextInt();
    int [] arr=new int[n];
   
    System.out.println("Enter The Elements");
    for(int i=0;i<arr.length;i++){
           arr[i]=s.nextInt();
    }
    
     int start=0;
     int end=arr.length-1;
     while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
     }
     System.out.println("Reverse array is:");
     for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
     }
    }
}
