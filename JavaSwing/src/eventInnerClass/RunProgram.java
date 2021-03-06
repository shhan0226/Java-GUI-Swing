package eventInnerClass;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class RunProgram extends JFrame {

	private JButton button1 = new JButton("검색1");

	public RunProgram() {

		setTitle("GUI InnerClass"); // 프레임 이름
		setSize(Main.SCREEEN_WIDTH, Main.SCREEEN_HIGHT); // 창크기
		setResizable(false); // 창 크기 재설정 금지
		setLocationRelativeTo(null); // 모니터 가운데 뜨기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x 누를때 프로그램 종료
		setVisible(true); // 화면에 보이게 하기

		// setLayout(new FlowLayout());
		setLayout(null); // 기존 레이아웃 관리자 삭제해주기
		button1.setSize(70, 20);
		button1.setLocation(50, 10);
		button1.addActionListener(new MyActionListener());
		add(button1);
	}

	/********************************** EventObject 부모 클래스 이벤트 객체 */
	/* ActionEvent */ /***** 내부 클래스로 구현 *****/
	// 버튼, 리스트, 텍스트 필드, 메뉴아이템
	public class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			JButton Button = (JButton) e.getSource();
			if (Button.getText().equals("검색1"))
				Button.setText("Stop");
			else
				Button.setText("검색1");
		}
	}

	/* ItemEvent */
	// 체크박스, 체크메뉴아이템, 리스트

	/* KeyEvent */

	/* MouseEvent */

	/* FocusEvent */

	/* TextEvent */
	// 텍스트 필드, 텍스트 에리어

	/********************************** 이벤트 리스너는 인터페이스이다 */

	/* ActionListener */

	/* ItemListener */

	/* MouseListener */

	/* KeyListener */

}
