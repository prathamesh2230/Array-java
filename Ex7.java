import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the size");
    int n=s.nextInt();
    int [] arr=new int[n];
    int [] arr1=new int [n];
    boolean flag=true;
   
    System.out.println("Enter The Elements");
    for(int i=0;i<arr.length;i++){
        int a=s.nextInt();
        arr[i]=a;
        arr1[i]=a;
    }
    
    //  int start=0;
    //  int end=arr.length-1;
    //  while(start<end){
    //     int temp=arr[start];
    //     arr[start]=arr[end];
    //     arr[end]=temp;
    //     start++;
    //     end--;
    //  }

    //int []rev=new int [n];
    //int t=3;
    // for(int i=0;i<arr.length;i++){
       //
       //rev[t]=arr[i];
       //t--;
    // }
    for(int i=arr.length-1;i>=0;i--){
        System.out.println(arr1[i]);
    }
    
     for(int i=0;i<arr.length;i++){
        if(arr[i]!=arr1[i])     //if(arr[i]!=rev[i])
        flag=false;
        break;
     }
    
  if(flag==true){
    System.out.println("palindrome");

  }
  else{
    System.out.println("not palindrome");
  }
    
}
}