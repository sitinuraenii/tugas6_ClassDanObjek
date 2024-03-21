
package pkgclass.dan.objek;

public class ClassDanObjek {

    public static void main(String[] args) {
        PersegiPanjang persegiPanjang1 = new PersegiPanjang(1, 1);
        System.out.println("Persegi Panjang ke-1 : ");
        System.out.println("Panjang = " + persegiPanjang1.panjang);
        System.out.println("Lebar = " + persegiPanjang1.lebar);
        System.out.println("Hasil keliling = " + persegiPanjang1.getKeliling());
        System.out.println("Hasil Luas = " + persegiPanjang1.getLuas()+ "\n");
        
        System.out.println("Persegi Panjang ke-2 : ");
        PersegiPanjang persegiPanjang2 = new PersegiPanjang(30, 40);
        System.out.println("Panjang = " + persegiPanjang2.panjang);
        System.out.println("Lebar = " + persegiPanjang2.lebar);
        System.out.println("Hasil keliling = " + persegiPanjang2.getKeliling());
        System.out.println("Hasil Luas = " + persegiPanjang2.getLuas()+ "\n");
        
        System.out.println("Persegi Panjang ke-3 : ");
        PersegiPanjang persegiPanjang3 = new PersegiPanjang(25, 35);
        System.out.println("Panjang = " + persegiPanjang3.panjang);
        System.out.println("Lebar = " + persegiPanjang3.lebar);
        System.out.println("Hasil keliling = " + persegiPanjang3.getKeliling());
        System.out.println("Hasil Luas = " + persegiPanjang3.getLuas());
    }
    
}
