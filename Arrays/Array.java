
public class Array {
    public static void main(String[] args) {
        int arr[][][] ={{{1,2,3},{23,34}},{{1,2,3,4,5}},{{5,3,56,6},{34,56,7,8},{4,6,6,6}}};

        int sum = 0;

        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                for(int k=0; k<arr[i][j].length; k++){
                   
                    sum +=arr[i][j][k];
                    System.out.print(arr[i][j][k]+"");
                }

                System.out.print(" Index " + i + "," + j +" = " + sum);
                sum=0;
                System.out.println();
            }

            System.out.println();
        }

        System.out.println("sum = "+ sum);
    }
}
