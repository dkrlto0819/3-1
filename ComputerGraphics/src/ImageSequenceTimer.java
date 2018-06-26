import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ImageSequenceTimer extends JApplet implements ActionListener{
	ImageSQPanel imageSQPanel;
	static int frameNumber = -1;
	int delay;
	static boolean frozen=false;
	Timer timer;
	
	public void init() {
		Image[] images=new Image[10];
		for(int i=1;i<=10;i++) images[i-1]=getImage(getCodeBase(), "images/T"+i+".jpg");
		buildUI(getContentPane(), images);
		startAnimation();
	}
	
	void buildUI(Container container, Image[] dukes) {
		int fps=10;
		
		delay=(fps>0) ? (1000/fps) : 100;
		
		timer=new Timer(delay, this);
		timer.setInitialDelay(0);
		timer.setCoalesce(true);
		
		imageSQPanel=new ImageSQPanel(dukes);
		container.add(imageSQPanel, BorderLayout.CENTER);
		
		imageSQPanel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if(frozen) {
					frozen=false;
					startAnimation();
				}else {
					frozen=true;
					stopAnimation();
				}
			}
		});
	}
	
	public void start() {
		startAnimation();
	}
	
	public void stop() {
		stopAnimation();
	}
	
	public synchronized void startAnimation() {
		if(frozen) {
			
		}else {
			if(!timer.isRunning()) timer.start();
		}
	}
	public synchronized void stopAnimation() {
		if(timer.isRunning()) {
			timer.stop();
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		frameNumber++;
		
		imageSQPanel.repaint();
	}
	
	class ImageSQPanel extends JPanel{
		Image dukesWave[];
		
		public ImageSQPanel(Image[] dukesWave) {
			this.dukesWave=dukesWave;
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			try {
				g.drawImage(dukesWave[ImageSequenceTimer.frameNumber%10], 0, 0, this);
			}catch(ArrayIndexOutOfBoundsException e) {
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		Image[] waving=new Image[10];
		
		for(int i=1;i<=10;i++) {
			waving[i=1]=Toolkit.getDefaultToolkit().getImage("images/T"+i+".jpg");
		}
		JFrame f=new JFrame("ImageSequenceTimer");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		ImageSequenceTimer controller=new ImageSequenceTimer();
		controller.buildUI(f.getContentPane(), waving);
		controller.startAnimation();
		f.setSize(new Dimension(75, 100));
		f.setVisible(true);
	}
}
