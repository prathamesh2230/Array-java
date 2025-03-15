import java.util.Scanner;

public class Ex11 {
   
      public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the size");
    int n=s.nextInt();
    int [] arr=new int[n];
    int target=5;
    
  
   
    System.out.println("Enter The Elements");
    for(int i=0;i<arr.length;i++){
        int a=s.nextInt();
        arr[i]=a;
    } 
    int sum=0;
    System.out.println("Answer is:");
for(int i=0;i<arr.length-1;i++){
    for(int j=i+1;j<arr.length;j++){
        if(target== arr[i]+arr[j]){
          System.out.println(arr[i]+" ,"+arr[j]);
        }
  
    }
   
}
}
}
