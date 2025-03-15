public class Ex19 {
    //Merge Two Arrays
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5 };
        int  [] arr1={6,7,8,9};
        int [] res=new int[arr.length+arr1.length];
        int length=arr.length;
        int count=0;
        // for(int i=0;i<arr.length;i++){
        //       res[i]=arr[i];
        //       count++;
        // }
        // for(int i=0;i<arr1.length;i++){
        //     res[count]=arr1[i];
        //     count++;

        // }
        // for(int i=0;i<res.length;i++){
        //   System.out.print(res[i]+" ");
          
        // }
        int j=0;
        for(int i=0;i<res.length;i++){
            if(i<arr.length){
                res[i]=arr[i];
            }
            else{
                res[i]=arr1[j];
                j++;
            }
    }
    for(int i=0;i<res.length;i++){
        System.out.print(res[i]+"");
    }
}}
