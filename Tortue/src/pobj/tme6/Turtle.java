package pobj.tme6;

public class Turtle implements ITurtle {
	private int x;
	private int y;
	private int angle;
	private boolean etat;

	public Turtle() {
		x = 0;
		y = 0;
		angle = 0;
		etat = true;
	}

	@Override
	public void move(int length) {
		int newx = x + (int) (length * Math.sin(angle * Math.PI / 180.));
		int newy = y + (int) (length * Math.cos(angle * Math.PI / 180.));
		draw(x, y, newx, newy);
		x = newx;
		y = newy;

	}

	@Override
	public void turn(int angle) {
		this.angle += angle;

	}

	@Override
	public void up() {
		this.etat = false;

	}

	@Override
	public void down() {
		etat = true;
	}

	public void draw(int x1, int y1, int x2, int y2) {
		if (isDown())
			System.out.print(x1 + " " + y1 + " " + x2 + " " + y2+" ");
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getAngle() {
		return angle;
	}

	public boolean isDown() {
		return etat;
	}
	
}
