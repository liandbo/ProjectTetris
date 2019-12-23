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
			gameBoard.addTetris(getCurrentBlock().getX1(), getCurrentBlock().getY1());
			gameBoard.addTetris(getCurrentBlock().getX2(), getCurrentBlock().getY2());
			gameBoard.addTetris(getCurrentBlock().getX3(), getCurrentBlock().getY3());
			gameBoard.addTetris(getCurrentBlock().getX4(), getCurrentBlock().getY4());
			getCurrentBlock().setY(50);
			getCurrentBlock().setX(200);
			getCurrentBlock().setRotate(1);
			currentBlock=randomBlock();
			getCurrentBlock().setY(50);
			getCurrentBlock().setX(200);
			getCurrentBlock().setRotate(1);
	}
	
	public void rotateBlock() {
		if (getCurrentBlock().getRotate() == 4) {
			getCurrentBlock().setRotate(1);
		} 
		else {
			getCurrentBlock().setRotate(getCurrentBlock().getRotate()+1);
		}
	}
	
	public void increaseBlockX(LogicInterface logicInterface) {
		if(logicInterface.checkRight(getCurrentBlock().getX(), getCurrentBlock().getY())&&
				logicInterface.checkRight(getCurrentBlock().getX1(), getCurrentBlock().getY1())&&
				logicInterface.checkRight(getCurrentBlock().getX2(), getCurrentBlock().getY2())&&
				logicInterface.checkRight(getCurrentBlock().getX3(), getCurrentBlock().getY3())&&
				logicInterface.checkRight(getCurrentBlock().getX4(), getCurrentBlock().getY4())
				) {
			getCurrentBlock().setX(getCurrentBlock().getX()+50);
			getCurrentBlock().setX1(getCurrentBlock().getX1()+50);
			getCurrentBlock().setX2(getCurrentBlock().getX2()+50);
			getCurrentBlock().setX3(getCurrentBlock().getX3()+50);
			getCurrentBlock().setX4(getCurrentBlock().getX4()+50);
		}
	}
	
	public void decreaseBlockX(LogicInterface logicInterface) {
		if(logicInterface.checkLeft(getCurrentBlock().getX(), getCurrentBlock().getY())&&
				logicInterface.checkLeft(getCurrentBlock().getX1(), getCurrentBlock().getY1())&&
				logicInterface.checkLeft(getCurrentBlock().getX2(), getCurrentBlock().getY2())&&
				logicInterface.checkLeft(getCurrentBlock().getX3(), getCurrentBlock().getY3())&&
				logicInterface.checkLeft(getCurrentBlock().getX4(), getCurrentBlock().getY4())
				) {
			getCurrentBlock().setX(getCurrentBlock().getX()-50);
			getCurrentBlock().setX1(getCurrentBlock().getX1()-50);
			getCurrentBlock().setX2(getCurrentBlock().getX2()-50);
			getCurrentBlock().setX3(getCurrentBlock().getX3()-50);
			getCurrentBlock().setX4(getCurrentBlock().getX4()-50);
		}
	}
	
	public void increaseBlockY(LogicInterface logicInterface) {
		if(logicInterface.checkDown(getCurrentBlock().getX(), getCurrentBlock().getY())&&
				logicInterface.checkDown(getCurrentBlock().getX1(), getCurrentBlock().getY1())&&
				logicInterface.checkDown(getCurrentBlock().getX2(), getCurrentBlock().getY2())&&
				logicInterface.checkDown(getCurrentBlock().getX3(), getCurrentBlock().getY3())&&
				logicInterface.checkDown(getCurrentBlock().getX4(), getCurrentBlock().getY4())
				) {
			getCurrentBlock().setY(getCurrentBlock().getY()+50);
			getCurrentBlock().setY1(getCurrentBlock().getY1()+50);
			getCurrentBlock().setY2(getCurrentBlock().getY2()+50);
			getCurrentBlock().setY3(getCurrentBlock().getY3()+50);
			getCurrentBlock().setY4(getCurrentBlock().getY4()+50);
			
			System.out.println(getCurrentBlock().getX() +" "+ getCurrentBlock().getY()+" "+getCurrentBlock());
		}
	}
	
}
