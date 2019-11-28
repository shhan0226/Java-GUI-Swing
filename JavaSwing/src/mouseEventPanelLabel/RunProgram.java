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

		setTitle("GUI Project"); // ������ �̸�
		setSize(Main.SCREEEN_WIDTH, Main.SCREEEN_HIGHT); // âũ��
		setResizable(false); // â ũ�� �缳�� ����
		setLocationRelativeTo(null); // ����� ��� �߱�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x ������ ���α׷� ����
		setVisible(true); // ȭ�鿡 ���̰� �ϱ�

		/* JLabel -->component */
		/* JPanel -->Container */

		/* MouseEvent */ /** 5���� �̺�Ʈ�� �߻� **/

		// setLayout(new BorderLayout());
		Panel.add(Label); // �⺻ Border layout ����

		/* MouseMotionEvent */ /** 2���� �̺�Ʈ�� �߻� **/
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