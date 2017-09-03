package animation;

import javax.swing.JFrame;

public class AnimationFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private AnimationPanel panel = new AnimationPanel();
	
	public AnimationFrame() {
		add(panel);
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("Animation");
	}
}
