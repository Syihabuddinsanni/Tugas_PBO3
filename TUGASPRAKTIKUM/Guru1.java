package TUGASPRAKTIKUM;

import LATIHANV2.*;

    public class Guru1 {
        
        private String nama;
        private int usia;
        
        //Konstruktor
        public Guru1 (String nama, int usia)
        {
            this.nama = nama;
            this.usia = usia;
        }
        //Metode
        public void info()
        {
            System.out.println("Nama\t\t: "+this.nama);
            System.out.println("Usia\t\t: "+this.usia);
            
        }
    
}
