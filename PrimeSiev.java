import java.util.Arrays;
public class PrimeSiev {
    public static boolean[] sieve = new boolean [1000];
    public static int[] primes;
    public static void main(String[] args) {
        Arrays.fill(sieve, true); //sets all values to true
        sieve[0] = false;
        sieve[1] = false;
        
        for(int i=2; i<=999; i++){
            for (int j=2; j<= i; j++){
               if ( i % j==0 && j != i){
                  sieve[i] = false;
               }
            }   
        }
        primes = collectPrime();
        //That down er is the random number for prime factors
        printPrimeFactors(132);
    }
    
    public static int[] collectPrime(){
        int[] ree = new int[1000];
        int n = 0;
        for(int j=0; j<= 999;j++){
            if(sieve[j] == true){
                ree[n] = j;
                n++; 
            }
        }
        return ree;
    }
   
    public static void printPrimeFactors (int i){//i is the given number
        System.out.println("Prime factorization of " + i);
        for(int k = 0; k < primes.length; k++){//divider counter
            if(primes[k] != 0){
                int n = 0;
                while(i % primes[k] == 0){
                    i = i/primes[k];//renews i so it can loop divide by the same #
                    n = n + 1;
                }
                if(n > 0){
                    System.out.println(primes[k] + ": " + n);
                }   
            }
        }
    }
}
 /*public static void printPrimeFactors (){
        int j = 0, m = 0;
       
        System.out.println("Prime factorization of" + i);
        while( j <=primes.length){//divider counter
             if (i % primes[j] == 0){
                        int k = k + 1;
                }
             int l = i / (prime[j] * prime[j]);
             while( m <=primes.length){
                 if (i % primes[j] == 0){
                        int o = o + 1;
                 }
                 o++;
             }
             j++;
             System.out.println(primes[j] + ":" + k);
        }
    }
    public static void printPrimeFactors (){
        int j = 0;
        System.our.println("Prime factorization of 132");
        for (j = 2; j < primes.length; j++){
            while(132 % primes[j] = 0){
                int k = k + 1;
                j++;
            }
            System.out.println(prime[j] + ": " + k);
        }
    }*/

    
        /*collectPrimes is its own method, using the info from changed universal 
     *sieve[] 
     *printPrimeFactors is then a second method, using info from collectPrimes
     */
