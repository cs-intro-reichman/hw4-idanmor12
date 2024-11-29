public class Primes {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[size + 1];
        int[] primeNums = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149};
        int isPrimeCounter = 0;
        int primeNumsCounter = 0;
        int numOfPrimes = 0;
        int currPrime;

        for (int i = 2; i < size+1; i++) {
            isPrime[i] = true;
        }
        
        while ( primeNums[primeNumsCounter] < Math.sqrt(size)) {
            currPrime = primeNums[primeNumsCounter];
            if (isPrimeCounter <= size) {
                if (isPrime[isPrimeCounter] && isPrimeCounter != currPrime && isPrimeCounter % currPrime == 0){
                    isPrime[isPrimeCounter] = false;
                }
                isPrimeCounter++;
            } else {
                isPrimeCounter = 0;
                primeNumsCounter++;
            }
        }

        for (int i = 0; i < size+1; i++) {
            if (isPrime[i]){
                System.out.println(i);
                numOfPrimes++;
            }
        }

        int precentagePrimes = (int) (((double)numOfPrimes/ (double)size) * 100);
        System.out.println("There are " + numOfPrimes + " primes between 2 and " + size + " (" + precentagePrimes + "% are primes)");
    }
}