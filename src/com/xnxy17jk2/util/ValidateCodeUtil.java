package com.xnxy17jk2.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.util
 * @����: ValidateCodeUtil
 * @˵��: ��֤�����ɹ���
 * @����: Guo_SY
 * @����ʱ��: 2020��4��29�� ����13:03:12
 */
public class ValidateCodeUtil {
	
	/**
	 * ���ڲ����µ���֤��
	 * @param out
	 * @throws IOException
	 */
	public static String genNewCode(OutputStream out) throws IOException {
		
		/**
		 * ����һ��ͼƬ
		 *   ����һ�� ͼƬ���
		 *   �������� ͼƬ�߶�
		 *   �������� ͼƬ����
		 */
		int width = 80;
		int height = 30;
		BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
		
		/**
		 * ����ͼƬ
		 */
		Graphics g = image.getGraphics();	//����
		g.setColor(new Color(200,200,200));	//������ɫ
		g.fillRect(0, 0, width, height);	//������
		
		/**
		 * ��������ĸ�����(0-9)
		 */
		Random random = new Random();
		StringBuffer nums = new StringBuffer();
		for(int i=1;i<=4;i++){
			nums.append(random.nextInt(10));
		}
		g.setColor(Color.BLACK);	//��ɫ
		/**
		 * ���� ������ �� ��ʽ����С
		 */
		g.setFont(new Font("����",Font.ITALIC,22));	//��������
		g.drawString(nums.toString(), 15, 20);		//д����
		
		/**
		 * ������������
		 */
		for(int i=1;i<=20;i++){
			int x1 = random.nextInt(width)-10;
			int y1 = random.nextInt(height);
			int x2 = random.nextInt(width);
			int y2 = random.nextInt(height)+10;
			g.setColor(getColor());		//�����ɫ
			g.drawLine(x1, y1, x2, y2);	//����
		}
		
		/**
		 * ����һ�� ͼƬ����
		 * �������� ͼƬ��ʽ
		 * �������� ���λ��
		 */
		ImageIO.write(image, "png", out);
		return nums.toString();
	}
	
	/**
	 * ���������ɫ����
	 * @return
	 */
	private static Color getColor(){
		Random ran = new Random();
		int r = ran.nextInt(256);
		int g = ran.nextInt(256);
		int b = ran.nextInt(256);
		return new Color(r,g,b);
	}
}