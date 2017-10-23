package exam_4.corejava;

public class FactorialOf5 {
    public static int findFactorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args){
        int x = findFactorial(5);
        System.out.println("Factorial of 5! is : "+x);
    }
}
