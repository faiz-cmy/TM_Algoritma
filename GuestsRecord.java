import java.util.Scanner;

public class GuestsRecord {
    public static void main(String[] args) {
        Daftar_tamu();


    }
    static void Daftar_tamu() {
        Scanner Input = new Scanner(System.in);
        EventOrganiser Tamu = new EventOrganiser();

            System.out.print("Masukan ID : ");
            Tamu.setCUSTID(Input.nextInt());
            System.out.print("Masukan Nama : ");
            Tamu.setCUSTNAME(Input.next());
            System.out.print("Masukan Addres : ");
            Tamu.setCUSTADDR(Input.next());
            System.out.print("Masukan Email : ");
            Tamu.setCUSTEMAIL(Input.next());
            System.out.print("Masukan Phone : ");
            Tamu.setCUSTPHONE(Input.nextInt());
            Tamu.PrintGuests();
        }

        }



