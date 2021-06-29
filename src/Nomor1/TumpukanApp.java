package Nomor1;
public class TumpukanApp {
    public static void main(String[] args){
        
        Tumpukan tumpukan=new Tumpukan(10);
        tumpukan.push(8);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(2);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(3);
        tumpukan.baca();
        System.out.println(" ");
        long nilai = tumpukan.peek();
        System.out.println("nilai teratas = " + nilai);
        System.out.println(" ");
        System.out.println("Nama saya adalah Nur Halisah Fasya");
        System.out.println(" ");
        tumpukan.pop();
        System.out.println("nilai yang dihapus = " + nilai);
        System.out.println(" ");
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(4);
        tumpukan.baca();
 
        }
    }

