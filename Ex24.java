public class Ex24 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int  [] arr1={6,7,8,9};
    
       // int [] c=new int [arr.length+arr1.length];
        
 //  int i=0;int j=0; int x=0;

 //while(i<c.length){
//     if(x<arr.length){
//         c[i]=arr[x];
//         x++;
//         i++
//     }
//     if(j<arr.length){
//         c[i]=arr1[j];
//         x++;
//         j++
//     }
//  }
// for(int i=0;i<c.length;i++){
// System.out.println(c[i]);
// }
       
    int i=0;int j=0;
    while(i<arr.length-1 && j<arr1.length-1){
     
        System.out.println(arr[i++]);
        System.out.println(arr1[j++]);
}
   while(i<arr.length-1){
    System.out.println(arr[i++]);
}
  
while(j<arr.length-1){
    System.out.println(arr[j++]);
}
}}
    