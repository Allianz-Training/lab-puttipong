package com.allianz.helloWorld;

public class MovablePoint implements Movable{
	protected int x;
	protected int y;
	protected int xSpeed;
	protected int ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public void moveUp() {
		y = y + ySpeed;
		System.out.println("move up!");
	}

	@Override
	public void moveDown() {
		y = y - ySpeed;
		System.out.println("move down!");
	}

	@Override
	public void moveLeft() {
		x = x- xSpeed;
		System.out.println("move left!");
	}

	@Override
	public void moveRight() {
		x = x+ xSpeed;
		System.out.println("move right!");
	}

	@Override
	public String toString() {
		return "Position is "+"x: " + x +"Y: "+ y;
	}	
}
