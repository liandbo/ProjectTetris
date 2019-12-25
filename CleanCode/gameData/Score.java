package gameData;

public class Score {
	private static int score;
	
	public int getScore() {
		return score;
	}
	
	public void ScoreforDown() {
		score++;
	}
	
	public void ScoreforLine() {
		score+=10;
	}
}
