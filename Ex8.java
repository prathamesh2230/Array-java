import java.util.*;

public class Ex8 {
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
    Arrays.sort(arr);
  //int b=arr[0]
    // for(int i=0;i<arr.length;i++ ){
    //     if(arr[i]<b){
    //     b=arr[i];
    //     }
    // }
    System.out.println("the smallest element is:"+arr[0]);
}}
