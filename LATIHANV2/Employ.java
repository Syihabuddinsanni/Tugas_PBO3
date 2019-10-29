package LATIHANV2;

    public class Employ extends Person
    {
    private String noKaryawan;
    //konstruktor
    
    public Employ(String noKaryawan, String nama, int usia)
    {
        super(nama, usia);
        this.noKaryawan = noKaryawan;
    }
    //Metode
    public void info ()
    {
        System.out.println("No. Karyawan\t: "+this.noKaryawan);
        super.info();
    }
    //Akhir kelas Employ

            
    
    
}
