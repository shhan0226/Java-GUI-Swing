package component;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

//JFrame 상속 받아 사용
public class SwingJFrame2 extends JFrame {

	// 생성자를 통해 프레임 구성
	public SwingJFrame2() {
		
		setTitle("Swing JFrame2");
		setSize(500, 500);
		setVisible(true);
		
	}

	public static void main(String[] args) {

		SwingJFrame2 MainFrame = new SwingJFrame2();

	}

}
