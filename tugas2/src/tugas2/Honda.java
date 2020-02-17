package tugas2;
public class Honda extends Motor {
    public void tampilkan() {
        String bahanbakar = "premium";
        
        Motor m = new Motor();
        
        m.inputData("Blade", "Bebek", "Hitam");
        m.tampilkandata();
        
        System.out.println("jenis bahan bakar :" +bahanbakar);
    }
    
}
