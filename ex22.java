public class ex22 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        
         int pos=2;
         for(int i=pos-1;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
       
    }
}
