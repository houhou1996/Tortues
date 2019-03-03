package pobj.tme6;

import javafx.scene.paint.Color;

public class ColorTurtle extends Turtle implements IColorTurtle {
	private Color color;
	public ColorTurtle() {
		color = Color.BLACK;
	}
	@Override
	public void setColor(Color color) {
		this.color = color;
		
	}
	public Color getColor() {
		return color;
	}
	@Override
	public void draw(int x1, int y1, int x2, int y2) {
		super.draw(x1, y1, x2, y2);
		if(super.isDown())
			System.out.println(color.toString());
	}

}
