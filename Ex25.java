public class Ex25 {
    public static void main(String[] args) {
        int [] arr={1,2,4,5,6,7};
        int ele=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                ele++;
            }
            else{
                System.out.println(ele+" is Missing Element in the Array");
                break;
            }
        }
    }
}
