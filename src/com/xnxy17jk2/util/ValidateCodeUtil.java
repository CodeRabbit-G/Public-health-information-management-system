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
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.util
 * @类名: ValidateCodeUtil
 * @说明: 验证码生成工具
 * @作者: Guo_SY
 * @创建时间: 2020年4月29日 下午13:03:12
 */
public class ValidateCodeUtil {
	
	/**
	 * 用于产生新的验证码
	 * @param out
	 * @throws IOException
	 */
	public static String genNewCode(OutputStream out) throws IOException {
		
		/**
		 * 产生一张图片
		 *   参数一： 图片宽度
		 *   参数二： 图片高度
		 *   参数三： 图片类型
		 */
		int width = 80;
		int height = 30;
		BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
		
		/**
		 * 设置图片
		 */
		Graphics g = image.getGraphics();	//画笔
		g.setColor(new Color(200,200,200));	//设置颜色
		g.fillRect(0, 0, width, height);	//画矩形
		
		/**
		 * 随机生成四个数字(0-9)
		 */
		Random random = new Random();
		StringBuffer nums = new StringBuffer();
		for(int i=1;i<=4;i++){
			nums.append(random.nextInt(10));
		}
		g.setColor(Color.BLACK);	//黑色
		/**
		 * 字体 ：类型 、 样式、大小
		 */
		g.setFont(new Font("黑体",Font.ITALIC,22));	//设置字体
		g.drawString(nums.toString(), 15, 20);		//写文字
		
		/**
		 * 添加随机干扰线
		 */
		for(int i=1;i<=20;i++){
			int x1 = random.nextInt(width)-10;
			int y1 = random.nextInt(height);
			int x2 = random.nextInt(width);
			int y2 = random.nextInt(height)+10;
			g.setColor(getColor());		//随机颜色
			g.drawLine(x1, y1, x2, y2);	//画线
		}
		
		/**
		 * 参数一： 图片对象
		 * 参数二： 图片格式
		 * 参数三： 输出位置
		 */
		ImageIO.write(image, "png", out);
		return nums.toString();
	}
	
	/**
	 * 返回随机颜色对象
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