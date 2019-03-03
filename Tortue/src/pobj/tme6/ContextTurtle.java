package pobj.tme6;

import javafx.scene.paint.Color;

public class ContextTurtle extends ColorTurtle implements IColorTurtle {
	private IContext context;
	
	public ContextTurtle(IContext context) {
		this.context = context;
	}
	@Override
	public void move(int length) {
		super.move(length);
		
	}

	@Override
	public void turn(int angle) {
		super.turn(angle);
		
	}

	@Override
	public void up() {
		super.up();
		
	}

	@Override
	public void down() {
		super.down();
		
	}

	@Override
	public void setColor(Color color) {
		super.setColor(color);
		
	}
	@Override
	public void draw(int x1, int y1, int x2, int y2) {
		if(super.isDown()) {
			context.drawLine(x1, y1, x2, y2, super.getColor());
	}

	}
}
