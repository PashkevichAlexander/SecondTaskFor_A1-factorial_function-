package task;

public class MathFunction {
    public static double factorial(double n){
        if(n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static double cycleSum(double n) {
        int f = 1, Sum = 0;
        for (int i = 1; i <= n; i++) {
            f = f * i;
            Sum += f;
        }
        return Sum;
    }
}
