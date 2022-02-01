public class Pro3_64010516 {
    public static double[] generateList()
    {
        double[] list = new double[1000];
        for(int i=0;i<1000;i++) {
            list[i] = (Math.random() * 1000);
        }
        return list;
    }
    public static void printList(double[] list) {
        for(int i=0;i<list.length;i++) {
            System.out.printf("\t%.2f\t",list[i]);
            if((i+1)%5==0) {
                System.out.println();
            }
        }
    }
    public static double[] selectionSort(double[] list) {
        int minIndex;
        for(int i=0;i<list.length - 1;i++) {
            minIndex = i;
            for(int j=i+1;j<list.length;j++) {
                if(list[j] < list[minIndex]) {
                    minIndex = j;
                }
            }

            double temp = list[minIndex];
            list[minIndex] = list[i];
            list[i] = temp;
        }

        return list;
    }
    public static boolean isPrime(long n) {
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPallindrom(long n) {
        long original = n;
        long reverse = 0;
        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        if (original == reverse)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        double[] list = new double[1000];
        Stopwatch stopwatch = new Stopwatch();
        System.out.println("Creating a list containing 1000 elements,");
        list = generateList();
        printList(list);
        System.out.println("List created.");
        System.out.println("Sorting stopwatch starts...");
        stopwatch.start();
        list = selectionSort(list);
        stopwatch.stop();
        printList(list);
        System.out.println("Sorting stopwatch stoped.");
        System.out.printf("The sort time is %.2f milliseconds\n",stopwatch.getElapsedTime());
        System.out.println("-----------------------------------------------------------------------");
        int primeCount = 0, inlineCount = 0;
        long num = 2;
        System.out.println("The pallindroePrime stopwatch starts...");
        System.out.println("Creating 100 PallindromePrime...");
        stopwatch.start();
        while (primeCount < 100) {
            if (isPrime(num) && isPallindrom(num)) {
                if (inlineCount == 10) {
                    System.out.println();
                    inlineCount = 0;
                }
                primeCount++;
                inlineCount++;
                System.out.printf("%d ", num);
            }
            num++;
        }
        stopwatch.stop();
        System.out.println();
        System.out.println("PallindromePrime created.");
        System.out.println("The pallindromePrime stopwatch stopped.");
        System.out.printf("The pallindromePrime time is %.2f milliseconds",stopwatch.getElapsedTime());
    }
}