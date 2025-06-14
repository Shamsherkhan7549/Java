import java.util.Arrays;

public class Trapwater {
    public static int trapwater(int heights[]){
        int[]leftMax = new int[heights.length];
        int[]rightMax = new int[heights.length];
        int trapedWater = 0;
        int width = 1;
        for(int i = 0; i < leftMax.length; i++){
            leftMax[i] = i==0 ? heights[0] : Math.max(leftMax[i-1], heights[i]);
        }

        for(int i = rightMax.length-1; i >= 0; i--){
            rightMax[i] = i== heights.length-1? heights[heights.length-1] : Math.max(rightMax[i+1], heights[i]);
        }

         for(int i = 0; i < heights.length; i++){
            trapedWater += (Math.min(leftMax[i], rightMax[i]) - heights[i])*width;
        }


        return trapedWater;
    }
    public static void main(String[] args) {
        int[] heights = {4,2,0,6,3,2,5};
        // int[] heights = {4,6};

        // int leftMax[] = trapwater(heights);
        // System.out.println(Arrays.toString(leftMax));

        // int rightMax[] = trapwater(heights);
        // System.out.println(Arrays.toString(rightMax));

        System.out.println("Traped Water = " + trapwater(heights));
    }
}
