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

		setTitle("GUI Project"); // ������ �̸�
		setSize(Main.SCREEEN_WIDTH, Main.SCREEEN_HIGHT); // âũ��
		setResizable(false); // â ũ�� �缳�� ����
		setLocationRelativeTo(null); // ����� ��� �߱�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x ������ ���α׷� ����
		setVisible(true); // ȭ�鿡 ���̰� �ϱ�

		Panel.setLayout(null);
		Label.setLocation(20, 20);
		Label.setSize(170, 50);
		Label.setText("Ŭ�� ��ǥ: ");

		Panel.add(Label);
		Panel.addMouseListener(new MyMouse());
		add(Panel);

	}

	/* ��ʹ� �̺�Ʈ�� ���� ��� ���ο� Ŭ������ �ۼ��ϴ� �� */
	/* action, item, text �����ʴ� ��Ͱ� ���� */

	/* KeyListener --> KeyAdapter */

	/* MouseListener --> MouseAdapter */
	public class MyMouse extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			Integer x = e.getX();
			Integer y = e.getY();
			String string = "Ŭ�� ��ǥ: " + x.toString() + ", " + y.toString();
			Label.setText(string);

		}
	}

	/* FocusListener --> FocusAdapter */
}
