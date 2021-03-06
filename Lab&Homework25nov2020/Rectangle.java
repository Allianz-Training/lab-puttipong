package com.allianz.helloWorld;

public class Rectangle {
	private float length = 1.0f;
	private float width = 1.0f;
	
	public Rectangle() {}
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public double getArea() {
		return width * length;
	}
	public double getPerimeter() {
		return (2*width) + (2*length);
	}
	public String toString() {
		return "Length is "+getLength()+" Width is "+getWidth()+" Area is " + getArea() + " Perimeter is "+ getPerimeter();
	}
	
}
