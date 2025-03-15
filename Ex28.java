public class Ex28 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println(sum1(arr));
        
    }  

    public static int sum1(int [] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
              sum=sum+arr[i];
        }
        return sum;
    }
}