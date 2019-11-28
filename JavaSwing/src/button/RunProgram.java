package button;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class RunProgram extends JFrame {

	private JButton button = new JButton("검색");

	public RunProgram() {

		setTitle("GUI button"); // 프레임 이름
		setSize(Main.SCREEEN_WIDTH, Main.SCREEEN_HIGHT); // 창크기
		setResizable(false); // 창 크기 재설정 금지
		setLocationRelativeTo(null); // 모니터 가운데 뜨기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x 누를때 프로그램 종료
		setVisible(true); // 화면에 보이게 하기

		/*
		 * 컨탠트 팬으로 버튼 추가 Container ContentPane = getContentPane();
		 * ContentPane.setLayout(null); button.setSize(70, 20);
		 * button.setLocation(50, 10); ContentPane.add(button);
		 */

		/* JFram으로 버튼 추가 */
		setLayout(null); // 기존 레이아웃 관리자 삭제해주기
		button.setSize(70, 20);
		button.setLocation(50, 10);
		add(button);

	}

}