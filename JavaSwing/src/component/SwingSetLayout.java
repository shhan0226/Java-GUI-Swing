package component;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

//�̺�Ʈ ó���� �����ʰ���
//�����ʴ� �������̽���(�̺�Ʈ ó�� �޼ҵ� ���ǵ�)

public class SwingSetLayout extends JFrame {

	public SwingSetLayout() {
		setTitle("Swing 4th");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(null); // null�� ������ ������ �� �ֵ��� �Ѵ�.
		JButton button2 = new JButton("test");
		button2.setSize(100, 50);
		button2.setLocation(100, 100);
		add(button2);

	}

	public static void main(String[] args) {
		SwingSetLayout MainFrame = new SwingSetLayout();

	}

}
