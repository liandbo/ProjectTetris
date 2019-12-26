package gameData;

import java.awt.Color;

public class GameVariables {
	
	private static int gameTick = 1000;
	
	private static Color blockColorList[]= {Color.red,Color.yellow,Color.green,Color.orange,Color.pink};
	private static Color blockColor = Color.red;
	private static Color boardColor = Color.cyan;
	private static Color lineColor = Color.white;
	private static Color scoreColor = Color.black;
	
	private static int blockRotationInital = 1; // from 1 to 4
	private static int blockRotationFinal = 4;
	private static int blockXAmount = 10;
	private static int blockYAmount = 16;
	private static int blockSize = 50;
	private static int blockXInital = blockSize*(blockXAmount/2)-blockSize;
	private static int blockYInital = 0;
	
	private static int boardXOffset = 0;
	private static int boardYOffset = 0;
	private static int boardXSize = boardXOffset+(blockXAmount * blockSize);
	private static int boardYSize = boardYOffset+(blockYAmount * blockSize)-50;//50 pixels is the size of yours tooltip
	
	private static int scoreBoardXSize = boardXSize+300;
	private static int scoreBoardYSize = boardYSize+50;
	private static int screenXSize = scoreBoardXSize;
	private static int screenYSize = scoreBoardYSize;
	
	private static int scoreXPos = boardXSize + 50;
	private static int scoreYPos = 50;
	private static int scoreForDown = 1;
	private static int scoreForLine = 10;
	
	public static Color randomBlockColor() {
		Color randomBlockColor = blockColorList[(int) (Math.random() * blockColorList.length)];
		return randomBlockColor;
	}
	
	public static int getGameTick() {
		return gameTick;
	}
	public static Color getBoardColor() {
		return boardColor;
	}
	public static Color getBlockColor() {
		return blockColor;
	}
	public static Color getLineColor() {
		return lineColor;
	}
	public static Color getScoreColor() {
		return scoreColor;
	}
	public static int getBlockXInital() {
		return blockXInital;
	}
	public static int getBlockYInital() {
		return blockYInital;
	}
	public static int getBlockRotationInital() {
		return blockRotationInital;
	}
	public static int getBlockRotationFinal() {
		return blockRotationFinal;
	}
	public static int getBlockXAmount() {
		return blockXAmount;
	}
	public static int getBlockYAmount() {
		return blockYAmount;
	}
	public static int getBlockSize() {
		return blockSize;
	}
	public static int getBoardXOffset() {
		return boardXOffset;
	}
	public static int getBoardYOffset() {
		return boardYOffset;
	}
	public static int getBoardXSize() {
		return boardXSize;
	}
	public static int getBoardYSize() {
		return boardYSize;
	}
	public static int getScoreBoardXSize() {
		return scoreBoardXSize;
	}
	public static int getScoreBoardYSize() {
		return scoreBoardYSize;
	}
	public static int getScreenXSize() {
		return screenXSize;
	}
	public static int getScreenYSize() {
		return screenYSize;
	}
	public static int getScoreForDown() {
		return scoreForDown;
	}
	public static int getScoreForLine() {
		return scoreForLine;
	}
	public static int getScoreXPos() {
		return scoreXPos;
	}
	public static int getScoreYPos() {
		return scoreYPos;
	}

}
