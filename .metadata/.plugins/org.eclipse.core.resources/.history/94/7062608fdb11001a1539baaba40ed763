package layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class RunProgram extends JFrame {

	private JButton button1 = new JButton("검색1");
	private JButton button2 = new JButton("검색2");
	private JButton button3 = new JButton("검색3");
	private JButton button4 = new JButton("검색4");
	private JButton button5 = new JButton("검색5");

	public RunProgram() {

		setTitle("GUI Project"); // 프레임 이름
		setSize(Main.SCREEEN_WIDTH, Main.SCREEEN_HIGHT); // 창크기
		setResizable(false); // 창 크기 재설정 금지
		setLocationRelativeTo(null); // 모니터 가운데 뜨기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x 누를때 프로그램 종료
		setVisible(true); // 화면에 보이게 하기

		/*
		 * button1.setSize(70, 20); button2.setSize(70, 20);
		 */

		/* BorderLayout() */
		BorderLayout bl = new BorderLayout();

		add(button1, bl.NORTH);
		add(button2, bl.SOUTH);
		add(button3, bl.CENTER);
		add(button4, bl.WEST);
		add(button5, bl.EAST);
		// pack(); //버튼 크기에 맞추어 출력하기

		/* GridLayout() */ // 격자모양

		/* FlowLayout() */ // 왼쪽에서 오른쪽으로 순차적

		/* CardLayout() */ // 겹쳐서 레이아웃

	}

}
