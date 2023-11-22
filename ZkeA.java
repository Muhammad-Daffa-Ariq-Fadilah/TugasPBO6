public class ZkeA{
    public static void main(String[] args){
        System.out.println("c. Huruf Z - A:");
        zkea();
    }
    private static void zkea(){
        System.out.println("For loop:");
        for(char c = 'Z'; c >= 'A'; c--){
            System.out.println("Huruf Z - A: " + c);
        }
        System.out.println("\nWhile loop:");
        char charWhile = 'Z';
        while(charWhile >= 'A'){
            System.out.println("Huruf Z - A: " + charWhile);
            charWhile--;
        }
        System.out.println("\nDo-while loop:");
        char charDoWhile = 'Z';
        do{
            System.out.println("Huruf Z - A: " + charDoWhile);
            charDoWhile--;
        }while(charDoWhile >= 'A');
        System.out.println();
    }
}