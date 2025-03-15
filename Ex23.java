public class Ex23 {
    public static void main(String[] args) {
        int [] arr={2,31,1,4,5,6,7,8,9,10};
   
        for(int i=0;i<arr.length;i++){
            int count=0;
            
        for(int j=1;j<=arr[i]/2;j++){
            if(arr[i]%j==0){
                 count++;
               
            }
        if(count>1){
            break;
        }}
           
         if(count==1){
            System.out.println(arr[i]);
         }
        
          
        }
     
    }
}
