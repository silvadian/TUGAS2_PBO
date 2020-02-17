package tugas2;

public class Motor {
    private String merek;
    private String jenis;
    private String warna;
    
    public String getMerek() {
        return merek;
    }
    
    public void setMerek(String merek) {
        this.merek = merek;
    }
    
    public String getJenis() {
        return jenis;
    }
    
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    public String getWarna() {
        return warna;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public void tampilkandata() {
        System.out.println("merek motor :" +getMerek());
        System.out.println("jenis motor :" +getJenis());
        System.out.println("warna motor :" +getWarna());
    }
    
    public void inputData(String m, String j, String w){
            setMerek (m);
            setJenis (j);
            setWarna (w);
    
}
}
