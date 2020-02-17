package tugas2;

public class Yamaha extends Motor {
    public void tampilkan() {
        String bahanbakar;
        
        bahanbakar="premium";
        
        Motor m = new Motor();
        
        m.inputData("Mio", "Matic", "Putih");
        m.tampilkandata();
        
        System.out.println("jenis bahan bakar :" +bahanbakar );
    }
    
}
