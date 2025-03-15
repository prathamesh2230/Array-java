
    import java.util.*;
public class Ex2{
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the size");
    int n=s.nextInt();
    int [] arr=new int[n];
    System.out.println("Enter The Elements");
    for(int i=0;i<arr.length;i++){
           arr[i]=s.nextInt();
    }
    System.out.println("The Even Elemenst Are:");
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0)
        System.out.print(arr[i]+" ");
    }
}
}

