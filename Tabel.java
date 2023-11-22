import java.util.Scanner;
public class Tabel{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n (<= 10): ");
        int n = scanner.nextInt();
        if(n > 10){
            System.out.println("Please enter a value less than or equal to 10.");
        }else{
            printMultiplicationTable(n);
        }
        scanner.close();
    }
    private static void printMultiplicationTable(int n){
        System.out.print("   ");
        for(int i = 1; i <= n; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 1; i <= n; i++){
            System.out.print(i + "  ");
            for(int j = 1; j <= n; j++){
                int result = i * j;
                if(result == 0){
                    System.out.print("  ");
                }else{
                    System.out.print(result + " ");
                }
            }
            System.out.println();
        }
    }
}