import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class DriverSosmed {
    public static void main(String[] args) {
        ArrayList<Source> list = new ArrayList<>();
        ArrayList<Source> list2 = new ArrayList<>();
        HashMap<String, ArrayList<Source>> mapData = new HashMap<String, ArrayList<Source>>();
        Scanner input = new Scanner(System.in);
        
        
        String nama, email, jenisKelamin;
        int mengulang, tglLahir;
        int group;
        
        System.out.println("            Google+            ");
        System.out.println("------------------------------------");
        
        
        try{
            do{
                System.out.print("Pilih Circle (1/2) : ");
                group = input.nextInt();
                
                if(group == 1){
                    System.out.print("Masukkan Nama  : ");
                    nama = input.next();
            
                    System.out.print("Masukkan Tanggal Lahir  : ");
                    tglLahir = input.nextInt();
                    
                    System.out.print("Masukkan Email : ");
                    email = input.next();
            
                    System.out.print("Masukkan Jenis Kelamin : ");
                    jenisKelamin = input.next();
            
                    list.add(new Source(nama, tglLahir, email, jenisKelamin));
                }

                else{
                    System.out.print("Masukkan Nama  : ");
                    nama = input.next();
            
                    System.out.print("Masukkan Tanggal Lahir  : ");
                    tglLahir = input.nextInt();
                    
                    System.out.print("Masukkan Email : ");
                    email = input.next();
            
                    System.out.print("Masukkan jenis Kelamin : ");
                    jenisKelamin = input.next();
            
                    list2.add(new Source(nama, tglLahir, email, jenisKelamin));
                }
            
                System.out.print("\nLanjut entry data ?(1/0) ");
                mengulang = input.nextInt();
                System.out.println("");
            }
            while(mengulang != 0);
        }
        catch(java.util.InputMismatchException a){
            System.err.println("Input Harus Angka");
        }
        
        System.out.println("------------------------------------");
        

        mapData.put("circle1", new ArrayList(list));
        mapData.put("circle2", new ArrayList(list2));
        

        //System.out.println("Circle 1");
        //System.out.println(mapData.toString());
        
        
        System.out.println("Circle 1");
        list.forEach((a) -> {
            System.out.println("Nama : " +a.getNama() +", Tanggal Lahir : " +a.getTglLahir() +" , E-mail : " +a.getEmail() +" , Jenis Kelamin : " +a.getJenisKelamin());
        });
        
        System.out.println("");
        
        System.out.println("Circle 2");
        list2.forEach((b) -> {
            System.out.println("Nama : " +b.getNama() +", Tanggal Lahir : " +b.getTglLahir() +" , E-mail : " +b.getEmail() +" , Jenis Kelamin : " +b.getJenisKelamin());
        });
}
}
