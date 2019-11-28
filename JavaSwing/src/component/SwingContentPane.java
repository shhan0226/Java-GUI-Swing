package component;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingContentPane extends JFrame {

	public SwingContentPane() {
		setTitle("Swing 3th");
		setSize(500, 500);
		setVisible(true);

		// x��ư ������ �������α׷� ����(SYstetm.exit(0) ����)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ��ư�� ����Ʈ ���� ���� �߰��ϴ� �ڵ�
		Container ContentPane = getContentPane();
		ContentPane.setLayout(null);
		JButton button1 = new JButton("test1");
		button1.setSize(100, 30);
		button1.setLocation(50, 10);
		ContentPane.add(button1);

		// JFrame�� ���� ��ư�� �߰��ϴ� �ڵ�(������ ����Ʈ �� ���)
		// this.setLayout(null); //������ ��ü�� ��ġ�ϴ� ���̾ƿ� �����ڸ� �����Ѵ�.
		JButton button2 = new JButton("test2");
		button2.setSize(100, 50);
		button2.setLocation(50, 100);
		this.add(button2);

	}

	public static void main(String[] args) {
		SwingContentPane MainFrame = new SwingContentPane();
	}

}
