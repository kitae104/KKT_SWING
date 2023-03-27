package swing.event;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyMouseEvent extends JFrame implements ActionListener, MouseListener, KeyListener, MouseMotionListener {
		
	private JButton btn;
	public final int STEP = 10;
	private Container contentPane;

	public MyMouseEvent(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(null);
		
		contentPane = getContentPane();
		
		btn = new JButton("ȫ�浿");
		btn.setSize(80, 25);
		btn.setLocation(100, 100);
		btn.addActionListener(this);
		btn.addMouseListener(this);
		contentPane.add(btn);
		
		contentPane.addMouseListener(this);	
		contentPane.addKeyListener(this);
		contentPane.addMouseMotionListener(this);
		
		contentPane.setFocusable(true);
		contentPane.requestFocus();
		
		setVisible(true);		
	}

	public static void main(String[] args) {
		new MyMouseEvent("MyMouseEvent");

	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		Object obj = e.getSource();
		
		if(obj == btn) {
			System.out.println("AAA");
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		btn.setLocation(x, y);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		Object obj = e.getSource();
		
		if(obj == btn) {
			System.out.println("AAA");
		} else if(obj == contentPane) {
			System.out.println("BBB");
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		char c = e.getKeyChar();
		int i = e.getKeyCode();
		
		if(i == KeyEvent.VK_UP) {
			btn.setLocation(btn.getX(), btn.getY() - STEP);
		} else if(i == KeyEvent.VK_DOWN) {
			btn.setLocation(btn.getX(), btn.getY() + STEP);			
		} else if(i == KeyEvent.VK_LEFT) {
			btn.setLocation(btn.getX() - STEP, btn.getY());					
		} else if(i == KeyEvent.VK_RIGHT) {
			btn.setLocation(btn.getX() + STEP, btn.getY());					
		}		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		Point p = e.getPoint();
		btn.setLocation(p);		
	}

	@Override
	public void mouseMoved(MouseEvent e) {		
		
	}

}
