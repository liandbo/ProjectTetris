package gameInterface;

public interface LogicInterface {
	
	public int getTimer();
	public boolean checkDown(int x,int y);
	public boolean checkRight(int x,int y);
	public boolean checkLeft(int x,int y);
	public boolean checkPosition(int x, int y);
}
