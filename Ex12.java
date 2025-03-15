import java.util.Scanner;

public class Ex12 {
      
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
    // int [] rev=new int [n];
    // System.out.println("reverse elements are ");
    //  for(int i=0;i<arr.length;i++){
    //
    //   int reverse=0;
    // while(arr[i]>0){
    //    
    //      reverse=reverse*10+arr[i]%10;
    //      arr[i]=arr[i]/10;
    //  }
    //      rev[i]=reverse;                   
    //             System.out.println(rev[i]);
 
    System.out.println("reverse Elemnts are");
    for(int i=0;i<arr.length;i++){
      int num=arr[i];
      int rev=0;
      while(num>0){
        rev=rev*10+num%10;
        num=num/10;
      }
      System.out.println(rev);
    }
        
}
}


