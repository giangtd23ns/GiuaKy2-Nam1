package ktgk2;

import java.util.Scanner;

public class View {
	public static void main(String[] args) throws InterruptedException {
		Scanner k = new Scanner(System.in);
		QLNV ql = new QLNV();
		int choice = 0;
		
		do {
			System.out.println("******************MENU*******************");
			System.out.println("1. Them nhan vien ");
			System.out.println("2. Sua nhan vien theo Ma Nhan Vien");
			System.out.println("3. Xoa nhan vien");
			System.out.println("4. Tim kiem nhan vien theo Ho Va Ten");
			System.out.println("5. Hien thi danh sach nhan vien");
			System.out.println("0. Thoat chuong trinh");
			System.out.println("----------------------------------------");
			System.out.println("Vui long chon mot so de tiep tuc: ");
			choice = k.nextInt();
			
			if(choice == 1) {
				/*
				System.out.println("Nhap ma nhan vien: "); String id = k.nextLine();
				k.nextLine();
				System.out.println("Nhap ho va ten: "); String name = k.nextLine();
				System.out.println("Nhap chuc vu: "); String cv = k.nextLine();
				NhanVien nhanVien = new NhanVien(id, name, cv);
				ql.themNhanVien(nhanVien); 
				*/
				
				NhanVien nhanVien = new NhanVien();
		        InputThread input = new InputThread(nhanVien);
		        SaveThread save = new SaveThread(nhanVien);
		        input.start();
		        input.join();
		        save.start();
			}else if(choice == 2) {
				System.out.println("Nhap ma nhan vien can sua thong tin: "); 
				String id = k.nextLine();
				k.nextLine();
				System.out.println("Nhap ten: ");
				String nName = k.nextLine();
				System.out.println("Nhap chuc vu: ");
				String nCV = k.nextLine();
				ql.sua(id, nName, nCV);
			}else if(choice == 3) {
				System.out.println("Nhap ma nhan vien cua nhan vien can xoa: ");
				String id = k.nextLine();
				ql.xoaNhanVien(id);
			}else if(choice == 4) {
				System.out.println("Nhap ma nhan vien cua nhan vien can tim: ");
				String id = k.nextLine();
				ql.timKiem(id);
			}else if(choice == 5) {
				System.out.println("Danh sach nhan vien: ");
				ql.hienThi();
			}else if(choice == 0) {
				System.out.println("Da thoat chuong trinh!");
			}else if( choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 0) {
				System.err.println("Lua chon cua ban khong hop le! Vui long chon lai!");
			}
		}while(choice != 0);
	}

}
