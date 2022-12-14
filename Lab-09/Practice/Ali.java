import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FillDemo extends JFrame implements ActionListener{

  public static final int WIDTH = 300;
  public static final int HEIGHT = 200;
  public static final int FILL_WIDTH = 300;
  public static final int FILL_HEIGHT = 100;
  public static final int CIRCLE_SIZE = 10;
  public static final int PAUSE = 100;

  private JPanel box;

  public static void main(String args[]){
	FillDemo gui = new FillDemo();
	gui.setVisible(true);
  }

  FillDemo(){
	setSize(WIDTH,HEIGHT);
	setTitle("FillDemo");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(new BorderLayout());
	
	box = new JPanel();
	add(box,"Center");
	
	JPanel buttons = new JPanel();
	buttons.setLayout(new FlowLayout());

	JButton startButton = new JButton("start");
	startButton.addActionListener(this);
	buttons.add(startButton);
	add(buttons,"South");
  }

  public void actionPerformed(ActionEvent e){
	Packer packerThread = new Packer();
	packerThread.start();
  }


  private class Packer extends Thread{

	public void run(){
		Graphics g = box.getGraphics();
		for(int y=0;y<FILL_HEIGHT;y+=CIRCLE_SIZE)
		    for(int x = 0;x<FILL_WIDTH;x+=CIRCLE_SIZE){
			g.fillOval(x,y,CIRCLE_SIZE,CIRCLE_SIZE);
			doNothing(PAUSE);
		    }
	}
  }

  public void doNothing(int miliseconds){
	try{
		Thread.sleep(miliseconds);
	}catch(InterruptedException e){
		JOptionPane.showMessageDialog(null,e.getMessage());
		System.exit(0);
	}
  }


}