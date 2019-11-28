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

		// x버튼 누르면 스윙프로그램 종료(SYstetm.exit(0) 같음)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 버튼을 컨탠트 팬을 통해 추가하는 코드
		Container ContentPane = getContentPane();
		ContentPane.setLayout(null);
		JButton button1 = new JButton("test1");
		button1.setSize(100, 30);
		button1.setLocation(50, 10);
		ContentPane.add(button1);

		// JFrame을 통해 버튼을 추가하는 코드(내부적 컨텐트 팬 사용)
		// this.setLayout(null); //기존의 객체를 배치하는 레이아웃 관리자를 삭제한다.
		JButton button2 = new JButton("test2");
		button2.setSize(100, 50);
		button2.setLocation(50, 100);
		this.add(button2);

	}

	public static void main(String[] args) {
		SwingContentPane MainFrame = new SwingContentPane();
	}

}
