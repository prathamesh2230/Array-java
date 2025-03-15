 public class Ex15{
    public static void main(String[] args) {
        int [] arr={1,2,2,33,4,3,5,7,6,7,5,4,3,8};
     
        int len = arr.length;
      
        for (int i = 0; i < len ; i++) {
            int count=0;
           for(int j=i+1;j<len;j++){
            if (arr[i] == arr[j]){
                count++;
           arr[j]=-1;
            }
             }
             if (count>0&&arr[i]!=-1) {
                         System.out.println(arr[i]);
                        
                    }
             
    } 
    
}}
