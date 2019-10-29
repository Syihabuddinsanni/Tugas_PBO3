package TUGASPRAKTIKUM;

import LATIHANV2.*;

    public class Guru2 extends Guru1
    {
    private String Matpel;
    private String Jadwal;
    //konstruktor
    
    public Guru2(String Matpel, String nama, int usia,String Jadwal)
    {
        super(nama, usia);
        this.Matpel = Matpel;
        this.Jadwal = Jadwal;
    }
    //Metode
    public void info ()
    {
        System.out.println("Matpel\t\t: "+this.Matpel);
        System.out.println("Jadwal\t\t: "+this.Jadwal);
        super.info();
         
    }
    }
       
    
    
 
    
    //Akhir class

            
    
   

