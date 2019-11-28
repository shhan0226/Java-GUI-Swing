package layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class RunProgram extends JFrame {

	private JButton button1 = new JButton("�˻�1");
	private JButton button2 = new JButton("�˻�2");
	private JButton button3 = new JButton("�˻�3");
	private JButton button4 = new JButton("�˻�4");
	private JButton button5 = new JButton("�˻�5");

	public RunProgram() {

		setTitle("GUI Project"); // ������ �̸�
		setSize(Main.SCREEEN_WIDTH, Main.SCREEEN_HIGHT); // âũ��
		setResizable(false); // â ũ�� �缳�� ����
		setLocationRelativeTo(null); // ����� ��� �߱�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x ������ ���α׷� ����
		setVisible(true); // ȭ�鿡 ���̰� �ϱ�

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
		// pack(); //��ư ũ�⿡ ���߾� ����ϱ�

		/* GridLayout() */ // ���ڸ��

		/* FlowLayout() */ // ���ʿ��� ���������� ������

		/* CardLayout() */ // ���ļ� ���̾ƿ�

	}

}
