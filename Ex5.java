
    
    
    import java.util.*;
    public class Ex5{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=s.nextInt();
        int [] arr=new int[n];
        int sum=0;
        System.out.println("Enter The Elements");
        for(int i=0;i<arr.length;i++){
               arr[i]=s.nextInt();
        }
        int count=0;
        
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
          sum=sum+arr[i];
       count++;
            }
        }
        System.out.println("the Avg of Odd Elements is : "+sum/count);
    }
    }
