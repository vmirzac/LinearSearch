public class LinearSearch {

    public static int linearSearch(int[] arr, int key){

        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String a[]){

        int[] arr1= {23,45,21,55,234,1,34,90};
        int searchKey = 21;
        System.out.println("Key "+searchKey+" found at index: "+linearSearch(arr1, searchKey));

    }
}
