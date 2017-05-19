
public class DriverSosmed {
    public static void main(String[] args) {
        ArrayList<Data> list = new ArrayList<>();
        ArrayList<Data> list2 = new ArrayList<>();
        HashMap<String, ArrayList> mapData = new HashMap<String, ArrayList>();
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
            
                    list.add(new Data(nama, tglLahir, email, jenisKelamin));
                }
}
