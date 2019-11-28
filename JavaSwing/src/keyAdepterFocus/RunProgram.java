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

		setTitle("GUI KeyAdepterFocus"); // ������ �̸�
		setSize(Main.SCREEEN_WIDTH, Main.SCREEEN_HIGHT); // âũ��
		setResizable(false); // â ũ�� �缳�� ����
		setLocationRelativeTo(null); // ����� ��� �߱�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x ������ ���α׷� ����
		setVisible(true); // ȭ�鿡 ���̰� �ϱ�

		Panel.setLayout(null);
		Label1.setLocation(20, 20);
		Label1.setSize(120, 15);
		Label1.setText("���� Ű: ");

		Label2.setLocation(20, 50);
		Label2.setSize(120, 15);
		Label2.setText("��� Ű: ");

		Panel.add(Label1);
		Panel.add(Label2);
		Panel.addKeyListener(new MyKeyListener());
		add(Panel);
		Panel.requestFocus(true);

	}

	/* ��ʹ� �̺�Ʈ�� ���� ��� ���ο� Ŭ������ �ۼ��ϴ� �� */
	/* action, item, text �����ʴ� ��Ͱ� ���� */

	/* KeyListener --> KeyAdapter */

	/* MouseListener --> MouseAdapter */
	public class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			char cKey = e.getKeyChar();

			if (cKey == e.CHAR_UNDEFINED) {// ���Ű
				String str = "��� Ű: " + e.getKeyText(e.getKeyCode());
				Label2.setText(str);
			} else {// ����Ű
				String str = "���� Ű: " + cKey;
				Label1.setText(str);
			}
		}
	}

	/* FocusListener --> FocusAdapter */
}
