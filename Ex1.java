import java.util.*;
public class Ex1{
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the size");
    int n=s.nextInt();
    int [] arr=new int[n];
    System.out.println("Enter The Elements");
    for(int i=0;i<arr.length;i++){
           arr[i]=s.nextInt();
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
}