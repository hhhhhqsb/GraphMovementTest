package com.tedu.dengshuxing1;

import javax.swing.JFrame;

import com.tedu.dengshuxing1.Mypanel;

public class Huaban {
	public static void main(String[] args) {
		JFrame huaBan = new JFrame();
		huaBan.setSize(1000, 1000);
		huaBan.setLocationRelativeTo(null);
		huaBan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Mypanel huaBu = new Mypanel();
		Thread t = new Thread(huaBu);
		t.start();
		 huaBan.add(huaBu);
	
		huaBan.setVisible(true);
	}

}
