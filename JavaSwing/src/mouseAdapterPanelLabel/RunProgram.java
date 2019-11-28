package mouseAdapterPanelLabel;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
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

		Panel.setLayout(null);
		Label.setLocation(20, 20);
		Label.setSize(170, 50);
		Label.setText("클릭 좌표: ");

		Panel.add(Label);
		Panel.addMouseListener(new MyMouse());
		add(Panel);

	}

	/* 어뎁터는 이벤트가 많을 경우 새로운 클래스로 작성하는 것 */
	/* action, item, text 리스너는 어뎁터가 없다 */

	/* KeyListener --> KeyAdapter */

	/* MouseListener --> MouseAdapter */
	public class MyMouse extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			Integer x = e.getX();
			Integer y = e.getY();
			String string = "클릭 좌표: " + x.toString() + ", " + y.toString();
			Label.setText(string);

		}
	}

	/* FocusListener --> FocusAdapter */
}
