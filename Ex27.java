public class Ex27 {
    public static void main(String[] args) {
        int [] a={10,20,30,40,50,60};
      
        int mid=0;
        if(a.length%2==0){
            mid=a.length/2;
        }
        else{
            mid=a.length/2+1;
        }
        int temp=0;
        for(int i=0;i<a.length/2;i++){
               temp=a[i];
              a[i]=a[mid];
              a[mid++]=temp;
        } 
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
