import java.util.Arrays;

class MEARGE_SHORT{
     public static void  main(String[] args) {
          int[] arr = {1,2,832,9873,032,833,99};
          arr = meargsort(arr);
          System.out.println(Arrays.toString(arr));
        
     }
     static int[] meargsort(int[] arr){
          if (arr.length==1){
               return arr;
          }
          int mid= arr.length/2;
          int[] left = meargsort(Arrays.copyOfRange(arr,0, mid));
          int[] right = meargsort(Arrays.copyOfRange(arr, mid, arr.length));
          return mearge(left,right);

     }
    
     private static int[] mearge(int[] first, int[] second){
          int[] mix= new int[first.length+second.length];
          int i=0; int j=0; int k=0;
          while(i<first.length&& j<second.length){
               if(first[i]<second[j]){
                    mix[k]=first[i];
                    i++;
               }
               else{
                    mix[k]=second[j];
                    j++;
               }
               k++;
          }
          while (i<first.length) {
               mix[k]=first[i];
               i++;
               k++;
               
          }
          while (j<second.length) {
               mix[k]=second[j];
               j++;
               k++;}
               return mix;

     }
} 
