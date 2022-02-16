package com.rays.Polymorphism;

public class ShapeAbstract {
	public abstract class Squaree {
		private String color;
		private int borderwidth;

		public String getColor() {
			return color;
		}
		public void setColor (String color) {
			this.color = color;
		}
		public int getBorderwidth() {
			return borderwidth;
		}
		public void setBorderwidth(int borderwidth) {
			this.borderwidth = borderwidth;
		}
	public abstract void area();
		}


}
