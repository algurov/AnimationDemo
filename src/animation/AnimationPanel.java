package animation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class AnimationPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton start;
	private JButton pause;
	private JButton stop;
	public static Timer timer;
	private DrawablePanel dPanel;
	
	public AnimationPanel() {
		setSize(800, 600);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		initControls();
	}
	
	private void initControls() {
		dPanel = new DrawablePanel();
		timer = new Timer(10, dPanel.getListener());
		JPanel controlPanel = new JPanel();
		start = new JButton("Start");
		start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				timer.start();
			}
		});
		pause = new JButton("Pause");
		pause.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				timer.stop();
			}
		});
		stop = new JButton("Stop");
		stop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				timer.stop();
				dPanel.setTick(0);
			}
		});
		controlPanel.add(start);
		controlPanel.add(pause);
		controlPanel.add(stop);
		add(controlPanel);
		add(dPanel);
	}
	
}
