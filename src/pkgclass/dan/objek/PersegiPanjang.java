
package pkgclass.dan.objek;

public class PersegiPanjang {
        int panjang;
        int lebar;
        
        public PersegiPanjang(int panjangBaru,int lebarBaru )
        { 
            panjang=panjangBaru;
            lebar=lebarBaru;
        }
        
        int getLuas(){
            return panjang * lebar;
        }
        int getKeliling(){
            return 2 * (panjang + lebar);
        }
        void setpanjang(int panjangBaru){
            panjang=panjangBaru;
        }
        void setlebar(int lebarBaru){
            lebar=lebarBaru;
        }

    }
