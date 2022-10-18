import task.Main;

public class Runner {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Main(),"MainFactorial");
        myThread.start();
    }
}
