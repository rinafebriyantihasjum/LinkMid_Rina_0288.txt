RINA FEBRIYANTI HASJUM 13020210288
import java.util.Scanner;

public class Konversi {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int mill, km  ;
            System.out.print("Berapa mill yang ingin anda konversikan ke Meter: ");
            mill = input.nextInt();



          km = (int) (mill*1609);
            
            System.out.println("Konversi dari : "+ mill +" Mill, Adalah : ");
            System.out.println(km+" Meter ");
        }
    }
    
}