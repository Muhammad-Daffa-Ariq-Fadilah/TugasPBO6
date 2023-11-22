import java.util.Scanner;
public class AnakAyam{
    public static void main(String[] args){
        System.out.println("d. Lagu 'Anak Ayam Turun N':");
        System.out.print("Masukkan nilai N untuk lagu 'Anak Ayam Turun N': ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printAnakAyamTurunN(n);
    }
    private static void printAnakAyamTurunN(int n){
        System.out.println("For loop:");
        for(int i = n; i >= 1; i--){
            System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
        }
        System.out.println("\nWhile loop:");
        int iWhile = n;
        while(iWhile >= 1){
            System.out.println("Anak ayam turun " + iWhile + ", mati satu tinggal " + (iWhile - 1));
            iWhile--;
        }
        System.out.println("\nDo-while loop:");
        int iDoWhile = n;
        do{
            System.out.println("Anak ayam turun " + iDoWhile + ", mati satu tinggal " + (iDoWhile - 1));
            iDoWhile--;
        }while(iDoWhile >= 1);
        System.out.println();
    }
}