import java.lang.*;
import java.util.Arrays;
public class Ex14{
    public static void main(String[] args) {
        int [] arr={1,2,2,33,4,3,5,7,6,7,5,4,3,8};
        
        int j = 0;
int len = arr.length;
     
      //  int len = arr.length;
      
        // for (int i = 0; i < len ; i++) {
        //     for(int j=i+1;j<len;j++){
        //     if (arr[i] == arr[j]){
        //         arr[j]=-1;
        //     }
        //     }
        //     if (arr[i]!=-1) {
        //         System.out.println(arr[i]);
                
        //     }
        // }
        // System.out.println(arr.length);
 Arrays.sort(arr);

for (int i = 0; i < len - 1; i++) {
    if (arr[i] != arr[i + 1]) {
        arr[j] = arr[i];
        j++;
    }
}
arr[j++] = arr[len - 1]; 


for (int i = 0; i <j ; i++) { 
    System.out.print(arr[i]+" ");
}

        
}
       
    }
