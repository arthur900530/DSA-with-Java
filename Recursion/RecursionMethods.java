package Recursion;
public class RecursionMethods {
    public static long[] fibonacci(int n){
        if (n <= 1) {
            long[] answer = {0, n};
            return answer;
        } else {
            long[] temp = fibonacci(n - 1);
            long[] answer = {temp[1], temp[0] + temp[1]};
            return answer;
        }
    }
}
