package ktgk2;

public class NhanVien {
	private String id;
	private String name;
	private String chucVu;
	
	public NhanVien(){
		super();
	}

	public NhanVien(String id, String name, String chucVu) {
		super();
		this.id = id;
		this.name = name;
		this.chucVu = chucVu;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	@Override
	public String toString() {
		return "NhanVien [Ma Nhan Vien=" + id + ", Ho Va Ten=" + name + ", Chuc Vu=" + chucVu + "]";
	}	
}
