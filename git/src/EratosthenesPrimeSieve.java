public class EratosthenesPrimeSieve implements PrimeSieve{
    private int obergrenze;
    public EratosthenesPrimeSieve(int obergrenze){
        this.obergrenze = obergrenze;
    }


    @Override
    public boolean isPrime(int p) {
        //überprüfen ob 1 die Obergrenze ist
        if (p < 2) {
            return false;
        }

        boolean[] gestrichen = new boolean[obergrenze + 1];
        //boolean array erstellt

        for (int i = 2; i <= Math.sqrt(obergrenze); i++) {
            if (!gestrichen[i]) {
                for (int j = i * i; j <= obergrenze; j += i) {
                    gestrichen[j] = true;
                }
            }
        }

        return !gestrichen[p];
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
