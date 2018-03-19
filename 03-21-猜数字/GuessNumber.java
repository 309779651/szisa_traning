package com.ISA;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class GuessNumber {
	public static void main(String[] args) {
			int b = (int) (Math.random() * 1000);
			Scanner input = new Scanner(System.in);
			System.out.println("请您输入1个1000以内的数字：");
			int a = input.nextInt();
			int i = 1;
			while (a != b && i < 1000) {
				System.out.println(a > b ? "大了" : "小了");
				System.out.println("请您输入1个1000以内的数字：");
				a = input.nextInt();
				i++;
			}
			if (a==b) {
				System.out.println("恭喜您猜对了！");
			}
			System.out.println("结果是：" + b + "你猜的次数为：" + i );
		}
	}
	
