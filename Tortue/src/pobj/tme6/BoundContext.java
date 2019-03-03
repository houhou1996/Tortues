package pobj.tme6;

import javafx.scene.paint.Color;

public class BoundContext implements IContext {

	private int minX, minY, maxX, maxY;

	public BoundContext() {
		minX = Integer.MAX_VALUE;
		minY = Integer.MAX_VALUE;
		maxX = 0;
		maxY = 0;
	}

	@Override
	public void drawLine(int x1, int y1, int x2, int y2, Color color) {
		if (minX == Integer.MAX_VALUE) {
			minX = Math.min(x1, x2);
			minY = Math.min(y1, y2);
			maxX = Math.max(x1, x2);
			maxY = Math.max(y1, y2);

		} else {
			minX = Math.min(Math.min(x1, x2), minX);
			minY = Math.min(Math.min(y1, y2), minY);
			maxX = Math.max(Math.max(x1, x2), maxX);
			maxY = Math.max(Math.max(y1, y2), maxY);

		}

	}

	/**
	 * @return the minX
	 */
	public int getMinX() {
		return minX;
	}

	/**
	 * @return the minY
	 */
	public int getMinY() {
		return minY;
	}

	/**
	 * @return the maxX
	 */
	public int getMaxX() {
		return maxX;
	}

	/**
	 * @return the maxY
	 */
	public int getMaxY() {
		return maxY;
	}

}
