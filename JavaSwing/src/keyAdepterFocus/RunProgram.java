package keyAdepterFocus;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RunProgram extends JFrame {

	public static JPanel Panel = new JPanel();
	public static JLabel Label1 = new JLabel();
	public static JLabel Label2 = new JLabel();

	public RunProgram() {

		setTitle("GUI KeyAdepterFocus"); // 프레임 이름
		setSize(Main.SCREEEN_WIDTH, Main.SCREEEN_HIGHT); // 창크기
		setResizable(false); // 창 크기 재설정 금지
		setLocationRelativeTo(null); // 모니터 가운데 뜨기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x 누를때 프로그램 종료
		setVisible(true); // 화면에 보이게 하기

		Panel.setLayout(null);
		Label1.setLocation(20, 20);
		Label1.setSize(120, 15);
		Label1.setText("문자 키: ");

		Label2.setLocation(20, 50);
		Label2.setSize(120, 15);
		Label2.setText("기능 키: ");

		Panel.add(Label1);
		Panel.add(Label2);
		Panel.addKeyListener(new MyKeyListener());
		add(Panel);
		Panel.requestFocus(true);

	}

	/* 어뎁터는 이벤트가 많을 경우 새로운 클래스로 작성하는 것 */
	/* action, item, text 리스너는 어뎁터가 없다 */

	/* KeyListener --> KeyAdapter */

	/* MouseListener --> MouseAdapter */
	public class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			char cKey = e.getKeyChar();

			if (cKey == e.CHAR_UNDEFINED) {// 기능키
				String str = "기능 키: " + e.getKeyText(e.getKeyCode());
				Label2.setText(str);
			} else {// 문자키
				String str = "문자 키: " + cKey;
				Label1.setText(str);
			}
		}
	}

	/* FocusListener --> FocusAdapter */
}
