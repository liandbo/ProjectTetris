package test;

public class Score {
	private static int Diem=0;
	
	public int getDiem() {
		return Diem;
	}
	
	public int tangDiem() {
		return Diem++;
	}
	
	public int tangDiemHang() {
		return Diem+=10;
	}
}
