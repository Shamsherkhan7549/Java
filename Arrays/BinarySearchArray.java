public class BinarySearchArray{
    public static int getIndex(int arr[], int target){
        int i = 0;
        int n = arr.length-1; 
        int mid =  0;

        while(i<=n){
             mid =  (i+n)/2;

           if(arr[mid] == target){
                return mid;

           }else if(arr[mid] > target){
                n = mid-1;

           }else{
                i = mid+1;

           }
        }

        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Binary Search");

        int incNums[] = {2,4,6,8,10,12};

        int index = getIndex(incNums, 10);
        System.out.println("index = " + index);
    }
}