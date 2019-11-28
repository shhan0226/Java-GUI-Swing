package eventInnerClass;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class RunProgram extends JFrame {

	private JButton button1 = new JButton("�˻�1");

	public RunProgram() {

		setTitle("GUI InnerClass"); // ������ �̸�
		setSize(Main.SCREEEN_WIDTH, Main.SCREEEN_HIGHT); // âũ��
		setResizable(false); // â ũ�� �缳�� ����
		setLocationRelativeTo(null); // ����� ��� �߱�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x ������ ���α׷� ����
		setVisible(true); // ȭ�鿡 ���̰� �ϱ�

		// setLayout(new FlowLayout());
		setLayout(null); // ���� ���̾ƿ� ������ �������ֱ�
		button1.setSize(70, 20);
		button1.setLocation(50, 10);
		button1.addActionListener(new MyActionListener());
		add(button1);
	}

	/********************************** EventObject �θ� Ŭ���� �̺�Ʈ ��ü */
	/* ActionEvent */ /***** ���� Ŭ������ ���� *****/
	// ��ư, ����Ʈ, �ؽ�Ʈ �ʵ�, �޴�������
	public class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			JButton Button = (JButton) e.getSource();
			if (Button.getText().equals("�˻�1"))
				Button.setText("Stop");
			else
				Button.setText("�˻�1");
		}
	}

	/* ItemEvent */
	// üũ�ڽ�, üũ�޴�������, ����Ʈ

	/* KeyEvent */

	/* MouseEvent */

	/* FocusEvent */

	/* TextEvent */
	// �ؽ�Ʈ �ʵ�, �ؽ�Ʈ ������

	/********************************** �̺�Ʈ �����ʴ� �������̽��̴� */

	/* ActionListener */

	/* ItemListener */

	/* MouseListener */

	/* KeyListener */

}