package game;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class BlockBreakerPanel extends JPanel implements KeyListener {

	
	ArrayList<Block> blocks = new ArrayList<Block>();
	Block ball = new Block(235,435,25,25,"image/ball.png");
	Block paddle = new Block(175,480,150,25,"image/paddle.png");
	

	
	 BlockBreakerPanel() {
		
		for(int i=0;i<8;i++) {
			blocks.add(new Block((i*60+2),0,60,25,"image/blue.png"));
		}
		
		for(int i=0;i<8;i++) {
			blocks.add(new Block((i*60+2),25,60,25,"image/green.png"));
		}
		
		for(int i=0;i<8;i++) {
			blocks.add(new Block((i*60+2),50,60,25,"image/red.png"));
		}
		
		for(int i=0;i<8;i++) {
			blocks.add(new Block((i*60+2),75,60,25,"image/yellow.png"));
		}
		
		addKeyListener(this);
		setFocusable(true);
		
	}
	
	public void paintComponent(Graphics g) {
		blocks.forEach(block ->{
			block.draw(g,this);
		});
		paddle.draw(g, this);
	}
	
	
	public void update() {
	
		repaint();
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		if(e.getKeyCode()== KeyEvent.VK_ENTER) {
			
			new Thread(() -> {
				while(true) {
					update();
				
		
					
					try {
						Thread.sleep(10);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					
				}
			}).start();
		}
		
		if(e.getKeyCode()== KeyEvent.VK_RIGHT && paddle.x <(getWidth() - paddle.width)) {
			paddle.x +=15;
		}
		
		if(e.getKeyCode()== KeyEvent.VK_LEFT) {
			paddle.x -=15;
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	

}
