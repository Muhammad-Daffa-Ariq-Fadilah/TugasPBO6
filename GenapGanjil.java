public class GenapGanjil {
    public static void main(String[] args) {
    System.out.println("b. Deret bilangan ganjil dan genap dari 0 - 20:");
    ganjilgenap();
    }
    private static void ganjilgenap() {
        System.out.println("For loop:");
        for (int num = 1; num <= 20; num += 2) {
            System.out.println("Bilangan ganjil: " + num);
        }
        System.out.println("\nWhile loop:");
        int numWhile = 1;
        while (numWhile <= 20) {
            System.out.println("Bilangan ganjil: " + numWhile);
            numWhile += 2;
        }
        System.out.println("\nDo-while loop:");
        int numDoWhile = 1;
        do {
            System.out.println("Bilangan ganjil: " + numDoWhile);
            numDoWhile += 2;
        } while (numDoWhile <= 20);
        System.out.println("\nFor loop:");
        for (int num = 2; num <= 20; num += 2) {
            System.out.println("Bilangan genap: " + num);
        }
        System.out.println("\nWhile loop:");
        int numWhileEven = 2;
        while (numWhileEven <= 20) {
            System.out.println("Bilangan genap: " + numWhileEven);
            numWhileEven += 2;
        }
        System.out.println("\nDo-while loop:");
        int numDoWhileEven = 2;
        do {
            System.out.println("Bilangan genap: " + numDoWhileEven);
            numDoWhileEven += 2;
        } while (numDoWhileEven <= 20);
        System.out.println();
    }
}
