public class Ex16 {
    //WAJP to print frequency of each element
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
      
        for(int i=0;i<arr.length;i++){
            int count=1;
          for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){


                count++;
                arr[j]=-1;
                
            }}
            if(arr[i]!=-1){
                System.out.println(arr[i]+" "+count);
            }
           
          
        }
    }
    
}
