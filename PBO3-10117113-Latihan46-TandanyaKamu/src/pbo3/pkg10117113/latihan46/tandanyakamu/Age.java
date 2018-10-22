/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan46.tandanyakamu;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program untuk menampilkan keterangan sifat sesuai dengan tahun
 *            kelahiran yang di isi.
 *            
 */
public class Age {
    private int yearBirth;
    private int yearNow;
    private String red;

    public Age(int yearNow) {
       this.yearNow = yearNow;
       
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }
    
    public int hitungUmur () {
       return yearNow - yearBirth  ;
    }
    
    public String tandanyaKamu(int umur) {
        String keterangan = null;
        
        if ((hitungUmur() >= 0) && (hitungUmur() <= 5))
           keterangan = (char)27+ "[01;31mLAGI LUCU LUCU NYA ";
          
        else if ((hitungUmur() > 5) && (hitungUmur() <= 10))
           keterangan = (char)27+ "[01;31mMASIH ANAK ANAK ";
                 
        else if ((hitungUmur() > 10) && (hitungUmur() <= 13))
           keterangan = (char)27+ "[01;31mMASIH REMADJA ";
        
        else if ((hitungUmur() > 13) && (hitungUmur() <= 19))
           keterangan = (char)27+ "[01;31mALAY";
        
        else if ((hitungUmur() > 19) && (hitungUmur() <= 29))
           keterangan = (char)27+ "[01;31mLAGI GALAU NYARI JODOH";
        
        else if ((hitungUmur() > 29) && (hitungUmur() <= 35))
           keterangan = (char)27+ "[01;31mLAGI SIBUK NYARI UANG ";
        
        else if ((hitungUmur() > 35) && (hitungUmur() <= 150))
           keterangan = (char)27+ "[01;31mSUDAH TUA";
        
        else
           keterangan = (char)27+ "[01;31mTIDAK TERDETEKSI DI KEHIDUPAN ";
        
        return keterangan;
        
    }
}
