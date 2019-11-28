package component;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

//이벤트 처리는 리스너가함
//리스너는 인터페이스임(이벤트 처리 메소드 정의됨)

public class SwingSetLayout extends JFrame {

	public SwingSetLayout() {
		setTitle("Swing 4th");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(null); // null은 임의의 조정할 수 있도록 한다.
		JButton button2 = new JButton("test");
		button2.setSize(100, 50);
		button2.setLocation(100, 100);
		add(button2);

	}

	public static void main(String[] args) {
		SwingSetLayout MainFrame = new SwingSetLayout();

	}

}
