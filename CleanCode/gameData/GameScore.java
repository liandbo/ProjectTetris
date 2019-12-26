package gameData;

public class GameScore {
	
private static int score;
	
	public int getScore() {
		return score;
	}
	
	public void ScoreforDown() {
		score+=GameVariables.getScoreForDown();
	}
	
	public void ScoreforLine() {
		score+=GameVariables.getScoreForLine();
	}
}
