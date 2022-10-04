package Obyek;

public class Main {
    public static void main(String[] args) {
        Hewan Elang = new Hewan("Elang");
        Hewan Kucing = new Hewan("Kucing");
        Hewan Harimau = new Hewan("Harimau");
        Hewan Gajah = new Hewan("Gajah");
        Elang.beratHewan(5);
        Elang.jumlahKakiHewan(2);
        Elang.warnaHewan("Coklat");
        Elang.cetakHewan();
        
        Kucing.beratHewan(2);
        Kucing.jumlahKakiHewan(4);
        Elang.warnaHewan(("Putih"));
        Kucing.cetakHewan();

        Harimau.beratHewan(3);
        Harimau.jumlahKakiHewan(4);
        Harimau.warnaHewan("Oren");
        Harimau.cetakHewan();
        

        Gajah.beratHewan(30);
        Gajah.jumlahKakiHewan(4);
        Gajah.warnaHewan("Abu-abu");
        Gajah.cetakHewan();

        
    }
}
