public class EvenOdd{
    static void countEvenOdd(int n, int even, int odd) {
        if (n == 0) {
            System.out.println("Even count: " + even);
            System.out.println("Odd count: " + odd);
            return;
        }
        if (n % 2 == 0) {
            even++;
        } else {
            odd++;
        }
        countEvenOdd(n - 1, even, odd);
    }

    public static void main(String[] args) {
        countEvenOdd(100, 0, 0);
    }
}
