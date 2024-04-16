package ktgk2;

import java.util.Scanner;

public class ThemNhanVien {
  
}

class InputThread extends Thread {
    NhanVien nhanVien;
    Scanner scanner = new Scanner(System.in);

    public InputThread(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    @Override
    public void run() {
        System.out.println("Nhap ma nhan vien:");
        String id = scanner.nextLine();
        System.out.println("Nhap ho va ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap chuc vu:");
        String cv = scanner.nextLine();   
    }
}

class SaveThread extends Thread {
	NhanVien nhanVien;
	QLNV qlnv = new QLNV();
    public SaveThread(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(500); 
            nhanVien.getId();
            nhanVien.getName();
            nhanVien.getChucVu();
            qlnv.themNhanVien(nhanVien);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}