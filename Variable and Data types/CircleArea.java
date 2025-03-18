import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int radius = sc.nextInt();
        sc.close();
        float area = 3.14f*radius*radius;
        System.out.println(area);
    }
}