package com.ISA;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class GuessNumber {
	public static void main(String[] args) {
			int b = (int) (Math.random() * 1000);
			Scanner input = new Scanner(System.in);
			System.out.println("��������1��1000���ڵ����֣�");
			int a = input.nextInt();
			int i = 1;
			while (a != b && i < 1000) {
				System.out.println(a > b ? "����" : "С��");
				System.out.println("��������1��1000���ڵ����֣�");
				a = input.nextInt();
				i++;
			}
			if (a==b) {
				System.out.println("��ϲ���¶��ˣ�");
			}
			System.out.println("����ǣ�" + b + "��µĴ���Ϊ��" + i );
		}
	}
	
