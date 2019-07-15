import javax.swing.JFrame;

public class SMImage {

	public static void main(String[] args) {
		
		MImage im = new MImage();
		JFrame f = new JFrame();
		
		f.add(im);
		f.setVisible(true);
		f.setSize(600, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Moving image");
	}

}
