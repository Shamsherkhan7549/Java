import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;

public class StackAssingment {
    /*
     * Insert at bottom / at any index
     */

     public static void insertAt(Stack<Integer> nums){

        Stack<Integer> nums2 = new Stack<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index : ");
        int index = sc.nextInt();

        System.out.print("Enter element : ");
        int element = sc.nextInt();

        sc.close();

        for(int i = 1; i <= index; i++){
            nums2.push(nums.pop());
        }

        nums.push(element);

        for(int i = 1; i <= index; i++){
            nums.push(nums2.pop());
        }


     }

     public static void displayStack(Stack<Integer> nums){
        int n = nums.size();
        int arr[] = new int[n];

        for(int i = n-1; i>=0; i--){
            arr[i] = nums.pop();
            
        }

       
        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
            nums.push(arr[i]);
        }
     }

     public static void displayStack2(Stack<Integer> nums){
        LinkedList<Integer> ll = new LinkedList<>();

        int n = nums.size();
        while(n!=0){
            ll.addFirst(nums.pop());
            n--;
        }
        
        n = ll.size();
        int i = 0;
         while(i<n){
            System.out.println(ll.get(i));
            nums.push(ll.get(i));
            i++;
        }

        
     }

     public static void displayStackRec(Stack<Integer> nums){
        int n = nums.size();
        int arr[] = new int[n];
        if(n == 0){
            return;
        }


        arr[n-1] = nums.pop();
        n--;
        displayStackRec(nums);
        System.out.println(arr[n]);
        nums.push(arr[n]);
        n++;

     }

     public static void removeAt(Stack<Integer> nums){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index: ");
        int index =  sc.nextInt();

        Stack<Integer> nums2 = new Stack<>();

        for(int i = 0; i < index; i++){
            nums2.push(nums.pop());
        }
        nums.pop();
        for(int i = 0; i < index; i++){
            int ele = nums2.pop();
            System.out.println(ele);
            nums.push(ele);
        }



     }


    public static void main(String[] args) {
        Stack<Integer> nums = new Stack<>();
        nums.push(1);
        nums.push(2);
        nums.push(3);
        nums.push(4);
        System.out.println(nums);
        // insertAt(nums);
        System.out.println(nums);

        // displayStack(nums);
        // displayStack2(nums);
        // displayStackRec(nums);
        removeAt(nums);
        System.out.println(nums);

    }
}
