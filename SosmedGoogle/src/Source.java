public class Source {
	public class Data {
	    protected String nama;
	    protected int tglLahir;
	    protected String email;
	    protected String jenisKelamin;
	    
	    public Data(String nama,int tglLahir, String email, String jenisKelamin) {
	        this.nama = nama;
	        this.tglLahir = tglLahir;
	        this.email = email;
	        this.jenisKelamin = jenisKelamin;
	    }
	    
	    public String getNama() {
	        return nama;
	    }

	    public void setNama(String nama) {
	        this.nama = nama;
	    }
	    
	    public int getTglLahir(){
	    	return tglLahir;
	    }
	    
	    public void setTglLahir(int tglLahir){
	    	this.tglLahir = tglLahir;
	    }

}

