public class Pro1_64010516 {
    public static boolean isPrime(int n) {
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalllindrom(int n) {
        int original = n;
        int reverse = 0;
        while (n != 0) {
            reverse = reverse*10 + n%10;
            n /= 10;
        }
        if(original == reverse)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int primeCount=0,inlineCount=0;
        int num = 2;
        while (primeCount < 100) {
            if(isPrime(num) && isPalllindrom(num)) {
                if(inlineCount == 10) {
                    System.out.println();
                    inlineCount = 0;
                }
                primeCount++;
                inlineCount++;
                System.out.printf("%d ",num);
            }
            num++;
        }
    }
}