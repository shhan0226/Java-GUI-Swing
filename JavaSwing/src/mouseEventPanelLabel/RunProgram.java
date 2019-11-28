package mouseEventPanelLabel;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RunProgram extends JFrame {
	public static JPanel Panel = new JPanel();
	public static JLabel Label = new JLabel();

	public RunProgram() {

		setTitle("GUI Project"); // 프레임 이름
		setSize(Main.SCREEEN_WIDTH, Main.SCREEEN_HIGHT); // 창크기
		setResizable(false); // 창 크기 재설정 금지
		setLocationRelativeTo(null); // 모니터 가운데 뜨기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x 누를때 프로그램 종료
		setVisible(true); // 화면에 보이게 하기

		/* JLabel -->component */
		/* JPanel -->Container */

		/* MouseEvent */ /** 5개의 이벤트를 발생 **/

		// setLayout(new BorderLayout());
		Panel.add(Label); // 기본 Border layout 적용

		/* MouseMotionEvent */ /** 2개의 이벤트를 발생 **/
		Panel.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				Integer x = e.getX();
				Integer y = e.getY();
				String str = "X: " + x.toString() + "Y: " + y.toString();
				Label.setText(str);
			}
		});

		// add(BorderLayout.CENTER, Panel);
		add(Panel);

	}

}