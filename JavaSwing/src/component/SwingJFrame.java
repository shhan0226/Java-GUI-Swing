package component;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

// 콘테이너 > 컴포넌트 > JFrame

public class SwingJFrame {

	public static void main(String[] args) {

		// Frame 만들어서 보여주기
		JFrame MainFrame = new JFrame();
		MainFrame.setTitle("Swing JFrame");
		MainFrame.setSize(500, 500);
		MainFrame.setVisible(true);

	}

}
