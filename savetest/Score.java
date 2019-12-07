package test;

public class Score {
	public static int Diem=0;
	
	public int tangDiem() {
		return Diem++;
	}
	
	public int tangDiemHang() {
		return Diem+=10;
	}
}
