package day16;

import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainClass05 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("title"); //Ʋ
		Container c = frame.getContentPane(); //����
		
		JLabel label = new JLabel("Hello GUI"); //����
		//Button btn = new Button("��ư�Դϴ�.");
		c.add(label);
		//c.add(btn);
		
		Font font = new Font("�޸տ�ü", Font.ITALIC, 32); //���� ����
		label.setFont(font);
		//���� ��ġ
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.setLocation(1000, 200);//������� ��ġ ����
		// ������ ũ��
		frame.setPreferredSize(new Dimension(500,200));
		frame.pack();// ���� ����
		
		frame.setVisible(true); // ȭ�鿡 �����־��
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i=1; ; i++) {
			label.setText(i+".Hello");
		}
	}
}
