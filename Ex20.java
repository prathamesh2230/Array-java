import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter teh size");
        int size=s.nextInt();
        int [] arr=new int[size+1];      
     //   int [] arr1=new int[arr.length+1];
        int ele=10;
System.out.println("Enter the Elemtnst");
for(int i=0;i<size;i++){
    arr[i]=s.nextInt();
}
    System.out.println("Enter Position");
        int pos=s.nextInt();
        if(pos<0 || pos>arr.length-1){
            System.out.println("Invalid Position");
        }
        else{
      
         for(int i=arr.length-1;i>pos-1;i--){
             arr[i]=arr[i-1];
         }
         arr[pos-1]=ele;
        
        System.out.println("new");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}}
  // int temp=0;
        //  for(int i=0;i<arr.length;i++){
              
        //      if(i>=pos){
        //      temp=arr[i+1];
        //      arr[i+1]=arr[i];
        //      arr[i]=ele;
        //     }
        //     else{
                 
        //     }
             
              
               
        //}
        // }
