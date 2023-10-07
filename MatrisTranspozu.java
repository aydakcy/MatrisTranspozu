import java.util.Scanner;

public class MatrisTranspozu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Matris boyutlarını kullanıcıdan al
        System.out.print("Satır sayısını girin: ");
        int satir = input.nextInt();
        System.out.print("Sütun sayısını girin: ");
        int sutun = input.nextInt();

        // Matrisi oluştur
        int[][] matris = new int[satir][sutun];

        // Matris elemanlarını kullanıcıdan al
        System.out.println("Matris elemanlarını girin:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("Matris[" + i + "][" + j + "]: ");
                matris[i][j] = input.nextInt();
            }
        }

        // Transpoz matrisi oluştur
        int[][] transpozMatris = new int[sutun][satir];

        // Transpoz matrisini hesapla
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpozMatris[j][i] = matris[i][j];
            }
        }

        // Transpoz matrisini ekrana yazdır
        System.out.println("Matrisin Transpozu:");
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                System.out.print(transpozMatris[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}

