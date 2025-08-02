

class PrimeNumRange{
    public static void main(String[] args){
       
    
        int strt = 10;
        int end = 50;
        for (int num = strt; num<=end; num++){
            boolean isPrime = true;
            for (int i =2; i<=Math.sqrt(num); i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime&&num>1){
                System.out.println(num+" ");
            }
        }
    }
}