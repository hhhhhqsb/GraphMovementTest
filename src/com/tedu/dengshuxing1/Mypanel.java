package com.tedu.dengshuxing1;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Mypanel extends JPanel implements Runnable
{
	public int x =0;

	@Override
	public void paint(Graphics g) {
		// TODO 自动生成的方法存根
		super.paint(g);
		//设置画笔颜色
		g.setColor(Color.yellow);//使用系统自带黄色
		g.drawLine(0, 0, 0, 0);
		g.setColor(new Color(0, 0, 0));//自定义颜色，每种颜色最大值为 255
		g.drawRect(0, 0, 0, 0);
		g.fillRect(0, 0, 0, 0);
		
		g.setColor(Color.black);
		g.fillRect(300, 100, 30, 10);
		g.fillRect(290, 110, 10, 10);
		g.fillRect(330, 110, 10, 10);
		g.fillRect(290, 120, 20, 10);
		g.fillRect(340, 120, 10, 10);
		g.fillRect(270, 130, 20, 10);
		g.fillRect(310, 130, 10, 10);
		g.fillRect(340, 130, 20, 10);
		g.fillRect(260, 140, 10, 10);
		g.fillRect(320, 140, 10, 10);
		g.fillRect(340, 140, 10, 10);
		g.fillRect(360, 140, 10, 10);
		g.fillRect(250, 150, 10, 10);
		g.fillRect(330, 150, 10, 10);
		g.fillRect(370, 150, 10, 10);
		g.fillRect(250, 160, 10, 10);
		g.fillRect(290, 160, 30, 10);
		g.fillRect(360, 160, 20, 10);
		g.fillRect(250, 170, 10, 10);
		g.fillRect(280, 170, 10, 10);
		g.fillRect(320, 170, 10, 10);
		g.fillRect(350, 170, 10, 10);
		g.fillRect(380, 170, 10, 10);
		g.fillRect(250, 180, 10, 10);
		g.fillRect(270, 180, 10, 10);
		g.fillRect(330, 180, 10, 10);
		g.fillRect(350, 180, 10, 10);
		g.fillRect(380, 180, 10, 10);
		g.fillRect(250, 190, 10, 10);
		g.fillRect(270, 190, 10, 10);
		g.fillRect(330, 190, 10, 10);
		g.fillRect(350, 190, 10, 10);
		g.fillRect(380, 190, 10, 10);
		g.fillRect(260, 200, 10, 10);
		g.fillRect(280, 200, 10, 10);
		g.fillRect(320, 200, 10, 10);
		g.fillRect(360, 200, 30, 10);
		g.fillRect(260, 210, 10, 10);
		g.fillRect(290, 210, 30, 10);
		g.fillRect(380, 210, 10, 10);
		g.fillRect(270, 220, 10, 10);
		g.fillRect(350, 220, 10, 10);
		g.fillRect(370, 220, 10, 10);
		g.fillRect(280, 230, 10, 10);
		g.fillRect(340, 230, 10, 10);
		g.fillRect(360, 230, 10, 10);
		g.fillRect(280, 240, 70, 10);
		g.fillRect(360, 240, 10, 10);
		g.fillRect(270, 250, 10, 10);
		g.fillRect(290, 250, 10, 10);
		g.fillRect(340, 250, 10, 10);
		g.fillRect(360, 250, 10, 10);
		g.fillRect(270, 260, 10, 10);
		g.fillRect(300, 260, 50, 10);
		g.fillRect(360, 260, 10, 10);
		g.fillRect(270, 270, 10, 10);
		g.fillRect(350, 270, 10, 10);
		g.fillRect(260, 280, 10, 10);
		g.fillRect(280, 280, 80, 10);
		g.fillRect(250, 290, 10, 10);
		g.fillRect(370, 290, 10, 10);
		g.fillRect(250, 300, 10, 10);
		g.fillRect(280, 300, 70, 10);
		g.fillRect(370, 300, 10, 10);
		g.fillRect(250, 310, 10, 10);
		g.fillRect(270, 310, 10, 10);
		g.fillRect(350, 310, 10, 10);
		g.fillRect(370, 310, 10, 10);
		g.fillRect(260, 320, 20, 10);
		g.fillRect(350, 320, 20, 10);
		
		g.setColor(Color.red);
		g.fillRect(300, 110, 30, 10);
		g.fillRect(310, 120, 10, 10);
		g.fillRect(300, 250, 40, 10);
		g.fillRect(270, 280, 10, 10);
		g.fillRect(260, 290, 110, 10);
		g.fillRect(270, 300, 10, 10);
		g.fillRect(350, 300, 10, 10);
		
		
		g.setColor(Color.yellow);
		g.fillRect(290, 170, 30, 10);
		g.fillRect(360, 170, 20, 10);
		g.fillRect(280, 180, 50, 10);
		g.fillRect(360, 180, 20, 10);
		g.fillRect(280, 190, 50, 10);
		g.fillRect(360, 190, 20, 10);
		g.fillRect(290, 200, 30, 10);
		
		
		
		g.setColor(Color.pink);
		g.fillRect(410+x, 210, 10, 10);
		g.fillRect(430+x, 210, 10, 10);
		g.fillRect(410+x, 220, 30, 10);
		g.fillRect(420+x, 230, 10, 10);
		g.fillRect(380+x, 240, 10, 10);
		g.fillRect(400+x, 240, 10, 10);
		g.fillRect(380+x, 250, 30, 10);
		g.fillRect(390+x, 260, 10, 10);

	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(true){
			x++;
			
		
			repaint();
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}

		
		
	
	}
}
