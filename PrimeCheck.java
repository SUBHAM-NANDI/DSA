public class PrimeCheck{
    public static void main(String[] args) {
        int num = 17;
        boolean isPrime = num > 1;
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println("prime");
        }else{
            System.out.println("prime");
        }
    }
}