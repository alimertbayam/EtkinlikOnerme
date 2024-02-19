import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak Yapabilirsiniz.");
        }
        else if (heat <= 25) {
            System.out.println("Yürüyüş Yapabilirsiniz.");
         if (heat <= 10) {
            System.out.println("Pikniğe Gidebilirsiniz.");
        }  if (heat <= 15) {
            System.out.println("Sinemaya Gidebilirsiniz."); }
        }
         else {
            System.out.println("Yüzmeye Gidebilirsiniz.");
        }

    }

}
