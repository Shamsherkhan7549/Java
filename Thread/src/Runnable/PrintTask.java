package Runnable;

public class PrintTask implements Runnable {
    public void run(){
        System.out.printf("%s start " , Thread.currentThread().getName() );
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d%c ",i, targetChar);
        }
        System.out.printf("%s end " , Thread.currentThread().getName() );
        System.out.println();
    }

    private final char targetChar;

    PrintTask(char targetChar){
        this.targetChar = targetChar;
    }

}
