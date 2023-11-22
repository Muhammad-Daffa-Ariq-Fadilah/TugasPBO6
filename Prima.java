public class Prima{
    public static void main(String[] args){
        System.out.println("a. Deret bilangan prima dari 0 - 20:");
        prima();
    }
    private static void prima(){
        System.out.println("For loop:");
        for(int num = 0; num <= 20; num++){
            if(isPrime(num)){
                System.out.println("Bilangan prima: " + num);
            }
        }
        System.out.println("\nWhile loop:");
        int numWhile = 0;
        while(numWhile <= 20){
            if(isPrime(numWhile)){
                System.out.println("Bilangan prima: " + numWhile);
            }
            numWhile++;
        }
        System.out.println("\nDo-while loop:");
        int numDoWhile = 0;
        do{
            if(isPrime(numDoWhile)){
                System.out.println("Bilangan prima: " + numDoWhile);
            }
            numDoWhile++;
        }while(numDoWhile <= 20);
    }
    private static boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        for(int j = 2; j < num; j++){
            if(num % j == 0){
                return false;
            }
        }
        return true;
    }
}