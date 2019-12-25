package gameCore;

import gameAssets.*;
import gameData.*;
import gameInterface.*;

public class GameFunction {
	
	private GameBoard gameBoard = new GameBoard();
	
	
	private static ShapeSquare shapeSquare = new ShapeSquare();
	private static ShapeRuler shapeRuler = new ShapeRuler();
	private static ShapeJ shapeJ = new ShapeJ();
	private static ShapeL shapeL = new ShapeL();
	private static ShapeS shapeS = new ShapeS();
	private static ShapeZ shapeZ = new ShapeZ();
	private static ShapeT shapeT = new ShapeT();
	
	
	private static ShapeInterface currentBlock=shapeSquare;
	private ShapeInterface listBlock[]= {shapeRuler,shapeSquare,shapeJ,shapeL,shapeS,shapeZ,shapeT};
	
	public ShapeInterface getCurrentBlock() {
		return currentBlock;
	}
	
	public ShapeInterface randomBlock() {
		ShapeInterface randomBlock = listBlock[(int) (Math.random() * listBlock.length)];
		return randomBlock;
	}
	
	public boolean checkBlock(LogicInterface logicInterface) {
		if(logicInterface.checkDown(getCurrentBlock().getX(), getCurrentBlock().getY())&&
				logicInterface.checkDown(getCurrentBlock().getX1(), getCurrentBlock().getY1())&&
				logicInterface.checkDown(getCurrentBlock().getX2(), getCurrentBlock().getY2())&&
				logicInterface.checkDown(getCurrentBlock().getX3(), getCurrentBlock().getY3())&&
				logicInterface.checkDown(getCurrentBlock().getX4(), getCurrentBlock().getY4())
				) {
			return true;
		}
			return false;
	}
	
	public void resetBlock(LogicInterface logicInterface) {
			//luu data
			gameBoard.addTetris(getCurrentBlock().getX1(), getCurrentBlock().getY1());
			gameBoard.addTetris(getCurrentBlock().getX2(), getCurrentBlock().getY2());
			gameBoard.addTetris(getCurrentBlock().getX3(), getCurrentBlock().getY3());
			gameBoard.addTetris(getCurrentBlock().getX4(), getCurrentBlock().getY4());
			//reset block
			getCurrentBlock().setY(GameVariables.getBlockYInital());
			getCurrentBlock().setX(GameVariables.getBlockXInital());
			getCurrentBlock().setRotate(GameVariables.getBlockRotationInital());
			currentBlock=randomBlock();
			getCurrentBlock().setY(GameVariables.getBlockYInital());
			getCurrentBlock().setX(GameVariables.getBlockXInital());
			getCurrentBlock().setRotate(GameVariables.getBlockRotationInital());
	}
	
	public void rotateBlock() {
		if (getCurrentBlock().getRotate() == GameVariables.getBlockRotationFinal()) {
			getCurrentBlock().setRotate(GameVariables.getBlockRotationInital());
		} 
		else {
			getCurrentBlock().setRotate(getCurrentBlock().getRotate()+1);
		}
	}
	
	public void reverseBlock() {
		if (getCurrentBlock().getRotate() == GameVariables.getBlockRotationInital()) {
			getCurrentBlock().setRotate(GameVariables.getBlockRotationFinal());
		} 
		else {
			getCurrentBlock().setRotate(getCurrentBlock().getRotate()-1);
		}
	}
	
	//qua phai
	public void increaseBlockX(LogicInterface logicInterface) {
		if(logicInterface.checkRight(getCurrentBlock().getX(), getCurrentBlock().getY())&&
				logicInterface.checkRight(getCurrentBlock().getX1(), getCurrentBlock().getY1())&&
				logicInterface.checkRight(getCurrentBlock().getX2(), getCurrentBlock().getY2())&&
				logicInterface.checkRight(getCurrentBlock().getX3(), getCurrentBlock().getY3())&&
				logicInterface.checkRight(getCurrentBlock().getX4(), getCurrentBlock().getY4())
				) {
			getCurrentBlock().setX(getCurrentBlock().getX()+GameVariables.getBlockSize());
			getCurrentBlock().setX1(getCurrentBlock().getX1()+GameVariables.getBlockSize());
			getCurrentBlock().setX2(getCurrentBlock().getX2()+GameVariables.getBlockSize());
			getCurrentBlock().setX3(getCurrentBlock().getX3()+GameVariables.getBlockSize());
			getCurrentBlock().setX4(getCurrentBlock().getX4()+GameVariables.getBlockSize());
		}
	}
	
	//qua trai
	public void decreaseBlockX(LogicInterface logicInterface) {
		if(logicInterface.checkLeft(getCurrentBlock().getX(), getCurrentBlock().getY())&&
				logicInterface.checkLeft(getCurrentBlock().getX1(), getCurrentBlock().getY1())&&
				logicInterface.checkLeft(getCurrentBlock().getX2(), getCurrentBlock().getY2())&&
				logicInterface.checkLeft(getCurrentBlock().getX3(), getCurrentBlock().getY3())&&
				logicInterface.checkLeft(getCurrentBlock().getX4(), getCurrentBlock().getY4())
				) {
			getCurrentBlock().setX(getCurrentBlock().getX()-GameVariables.getBlockSize());
			getCurrentBlock().setX1(getCurrentBlock().getX1()-GameVariables.getBlockSize());
			getCurrentBlock().setX2(getCurrentBlock().getX2()-GameVariables.getBlockSize());
			getCurrentBlock().setX3(getCurrentBlock().getX3()-GameVariables.getBlockSize());
			getCurrentBlock().setX4(getCurrentBlock().getX4()-GameVariables.getBlockSize());
		}
	}
	
	//giam do cao
	public void increaseBlockY(LogicInterface logicInterface) {
		if(logicInterface.checkDown(getCurrentBlock().getX(), getCurrentBlock().getY())&&
				logicInterface.checkDown(getCurrentBlock().getX1(), getCurrentBlock().getY1())&&
				logicInterface.checkDown(getCurrentBlock().getX2(), getCurrentBlock().getY2())&&
				logicInterface.checkDown(getCurrentBlock().getX3(), getCurrentBlock().getY3())&&
				logicInterface.checkDown(getCurrentBlock().getX4(), getCurrentBlock().getY4())
				) {
			getCurrentBlock().setY(getCurrentBlock().getY()+GameVariables.getBlockSize());
			getCurrentBlock().setY1(getCurrentBlock().getY1()+GameVariables.getBlockSize());
			getCurrentBlock().setY2(getCurrentBlock().getY2()+GameVariables.getBlockSize());
			getCurrentBlock().setY3(getCurrentBlock().getY3()+GameVariables.getBlockSize());
			getCurrentBlock().setY4(getCurrentBlock().getY4()+GameVariables.getBlockSize());
			
			System.out.println(getCurrentBlock().getX() +" "+ getCurrentBlock().getY()+" "+getCurrentBlock());//debuging tool r cool
		}
	}
	
	//check xoay
	public void rotateBlock(LogicInterface logicInterface) {
		rotateBlock();
		getCurrentBlock().setBlock();
		if (	!logicInterface.checkPosition(getCurrentBlock().getX1(), getCurrentBlock().getY1()) ||
				!logicInterface.checkPosition(getCurrentBlock().getX2(), getCurrentBlock().getY2()) ||
				!logicInterface.checkPosition(getCurrentBlock().getX3(), getCurrentBlock().getY3()) ||
				!logicInterface.checkPosition(getCurrentBlock().getX4(), getCurrentBlock().getY4()) ) 
		{
			reverseBlock();
			getCurrentBlock().setBlock();
		} 
	}
	
	public void checkBoardLine(LogicInterface logicInterface) {
		for(int i = 0; i < GameVariables.getBlockXAmount(); i++) {
			gameBoard.removeLine(logicInterface.checkLine());
		}
	}
	
}
