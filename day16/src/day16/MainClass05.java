package day16;

import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainClass05 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("title"); //틀
		Container c = frame.getContentPane(); //장판
		
		JLabel label = new JLabel("Hello GUI"); //세팅
		//Button btn = new Button("버튼입니다.");
		c.add(label);
		//c.add(btn);
		
		Font font = new Font("휴먼옛체", Font.ITALIC, 32); //글자 설정
		label.setFont(font);
		//글자 위치
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.setLocation(1000, 200);//모니터의 위치 지정
		// 프레임 크기
		frame.setPreferredSize(new Dimension(500,200));
		frame.pack();// 설정 적용
		
		frame.setVisible(true); // 화면에 보여주어라
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i=1; ; i++) {
			label.setText(i+".Hello");
		}
	}
}
