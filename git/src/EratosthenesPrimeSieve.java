public class EratosthenesPrimeSieve implements PrimeSieve{
    private int obergrenze;
    public EratosthenesPrimeSieve(int obergrenze){
        this.obergrenze = obergrenze;
    }


    @Override
    public boolean isPrime(int p) {
        if (p < 2){
            return false;
        }
        for (int i = 2; i < p; i++){
            if (p % i == 0){
                return false;
            }
        }
        return true;
    }

    @Override
    public void printPrimes() {
        for (int i = 0; i < obergrenze; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
