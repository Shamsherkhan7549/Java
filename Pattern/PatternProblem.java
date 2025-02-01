import java.util.*;
public class PatternProblem {

    public static void main(String[] args) {
        int n = 4;
        char ch = 'a';
        for(int i = 0; i < n; i++){

            for(int j = 0; j<=i; j++){

                if((i+j)%2 == 0){
                    System.out.print(Character.toUpperCase(ch)+ " ");   
                }else{
                    System.out.print(Character.toLowerCase(ch)+ " ");     
                }
                
               ch++;
            }
            System.out.println();
        }   
    }
}