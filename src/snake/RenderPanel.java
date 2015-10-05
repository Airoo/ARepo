package snake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class RenderPanel extends JPanel {

	public static Color green = new Color(166073);

	@SuppressWarnings("static-access")
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(green);
		g.fillRect(0, 0, 800, 700);
		Snake snake = Snake.snake;
		g.setColor(Color.WHITE);
		for (Point point : snake.snakeParts) {

			g.fillRect(point.x * snake.SCALE, point.y * snake.SCALE, snake.SCALE, snake.SCALE);

		}
		g.fillRect(snake.head.x * snake.SCALE, snake.head.y * snake.SCALE, snake.SCALE, snake.SCALE);
		g.setColor(Color.RED);
		g.fillRect(snake.cherry.x * snake.SCALE, snake.cherry.y * snake.SCALE, snake.SCALE, snake.SCALE);
		String string = "Score: " + snake.score + ", Lenght: " + snake.tail + ", Time: " + snake.time / 2 / 20;
		g.setColor(Color.WHITE);
		g.drawString(string, (int) (getWidth() / 2 - string.length() * 2.5), 10);
		// curColor++;
	}
}
