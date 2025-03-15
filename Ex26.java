public class Ex26 {
    public static void main(String[] args) {
        int []arr={10,13,40,30,15};
        int [] arr1={13,30,15,50};
      
        int k=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr1[i]==arr[j]){
                     k++;
                   arr[j]=-1;
                     break;
                }
            }
        }
        if(k==arr1.length){
            System.out.println("subset");
        }
        else{
               System.out.println("Not Subset");
        }
     
        }
    } 

