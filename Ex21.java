import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        int [] arr1=new int[arr.length+1];
        int ele=10;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Position");
        int pos=s.nextInt();
        if(pos<0 || pos>arr.length){
            System.out.println("Invalid Position");
        }
        else{
      
         for(int i=arr.length-1;i>=pos-1;i--){
             arr1[i+1]=arr[i];
         }
         arr[pos-1]=ele;
         for(int i=0;i<pos-1;i++){
            arr1[i]=arr[i];
         }
        
        System.out.println("new");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr1[i]);
        }
    }
    
}}

 
              
    