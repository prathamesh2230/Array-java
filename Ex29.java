public class Ex29 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int [] res=sum1(arr);
        for(int i=0;i<res.length;i++){
            if(res[i]!=-1){
        System.out.println(res[i]);}
            }
    }  

    public static int[] sum1(int [] arr){
        int [] c=new int[arr.length];
        for(int i=0;i<arr.length;i++){
              if(arr[i]%2==0){
              c[i]=arr[i];
              }
              else c[i]=-1;
        }
       return c;
    }
}
