package org.jointheleague.enums;

public enum Direction {
	
	NORTH(-1, 0), EAST(0, 1), SOUTH(1 , 0), WEST(0, -1);
	
	private final int deltaRow, deltaColumn;
		private Direction(int r, int c){
			deltaRow = r;
			deltaColumn = c;
		}
   
	public int getDeltaRow(){
		return deltaRow;
	}
	
	public int getDeltaCol(){
		return deltaColumn;
	}
	
	public Direction getRight(){
		Direction[] directions = Direction.values();
		return directions[(ordinal()+3)%4];
	}
	
	public Direction getLeft(){
		Direction[] directions = Direction.values();
		return directions[(ordinal()+1)%4];
	}

}
