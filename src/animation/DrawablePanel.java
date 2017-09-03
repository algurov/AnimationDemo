package animation;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class DrawablePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private int tick = 0;
	
	private ActionListener listener;
	
	public DrawablePanel() {
		setSize(400, 300);
		setListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				updatePoints();
			}
		});
	}
	
	private void updatePoints() {
		setTick(getTick() + 1);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawLine(0, 100, getTick(), 100);
	}

	public ActionListener getListener() {
		return listener;
	}

	public void setListener(ActionListener listener) {
		this.listener = listener;
	}

	public int getTick() {
		return tick;
	}

	public void setTick(int tick) {
		this.tick = tick;
		repaint();
	}
}
