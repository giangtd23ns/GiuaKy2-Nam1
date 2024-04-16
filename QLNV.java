package ktgk2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class QLNV {
	private ArrayList<NhanVien> list;

	public QLNV() {
		this.list = new ArrayList<NhanVien>();
	}

	public QLNV(ArrayList<NhanVien> list) {
		super();
		this.list = list;
	}

	public ArrayList<NhanVien> getList() {
		return list;
	}

	public void setList(ArrayList<NhanVien> list) {
		this.list = list;
	}
	
	public void themNhanVien(NhanVien nhanVien) {
		this.list.add(nhanVien);
		try {
            FileWriter writer = new FileWriter("NhanVien.txt", true); 
            writer.write(nhanVien.toString() + "\n");
            writer.close();
            System.out.println("Thong tin cua nhan vien da duoc ghi vao file!");
        } catch (IOException e) {
            System.err.println("Khong the them nhan vien vao file!");
            e.printStackTrace();
        }
	}
	
	public void xoaNhanVien(String id) {
	    boolean found = false;
	    for (int i = 0; i < list.size(); i++) {
	        NhanVien nhanVien = list.get(i);
	        if (nhanVien.getId().equals(id)) {
	            list.remove(i);
	            found = true;
	            System.out.println("Xoa thanh cong!");
	            break; 
	        }
	    }
	    if (!found) {
	        System.err.println("Nhan vien khong ton tai!");
	    }
	}
	
	public void timKiem(String id) {
		for (NhanVien nhanVien : list) {
			if(nhanVien.getName().indexOf(id) >= 0) {
				System.out.println(nhanVien);
			} else {
				System.err.println("Nhan vien khong ton tai!");
			}
		}
	}
	
	public void hienThi() {
		list.stream().forEach(nv -> System.out.println(nv.toString() + "\n"));
	}
	
	public void sua(String id, String tenMoi, String nChucVu) {
		for (NhanVien nhanVien : list) {
			if(nhanVien.getId().indexOf(id) >= 0) {
				nhanVien.setName(tenMoi);
				nhanVien.setChucVu(nChucVu);
			} else {
				System.err.println("Nhan vien khong ton tai!");
			}
		}
	}
}


