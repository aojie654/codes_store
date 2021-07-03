package Basic.Lessons.Week7.L721FunctionCall.src;

public class FunctionCall {
    public static void main(String[] args) {
        sum(1, 10);
        sum(20, 30);
        sum(35, 45);
    }

    private static void sum(int i, int i1) {
        int sum0 = 0;
        for (int i2 = i; i2 <= i1; i2 += 1) {
            sum0 += i2;
        }
        System.out.println("The sum of " + i + " to " + i1 + " is " + sum0+".");
    }
}
