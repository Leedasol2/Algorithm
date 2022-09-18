package chapter3;

import java.util.Scanner;

public class SeqSearch {
	
	// while���� �̿��� ���� �˻� �޼ҵ�
	static int seqSearch(int[] a, int n, int key) {
		
		/*
		 * key�� ��ġ�ϴ� ��Ҹ� ã���� �˻� ����! 	- �ε��� i�� ��ȯ
		 * �迭�� ������ ������ ��� �˻� ���� 		- -1�� ��ȯ
		 */		
		int i=0;
		while(true) {
			if(i==n)
				return -1;
			if(a[i] == key)
				return i;
			i++;
		}	
	}
	
	// for���� �̿��� ���� �˻� �޼ҵ�
	static int seqSearch2(int[] a, int n, int key) {
		
		/*
		 * key�� ��ġ�ϴ� ��Ҹ� ã���� �˻� ����! 	- �ε��� i�� ��ȯ
		 */
		for(int i=0; i<n; i++) {
			if(key==a[i]) {
				return i;
			}
		}

		// �ݺ����� �������� �迭�� ������ ������ ��� �˻� ���� - -1�� ��ȯ
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdIn = new Scanner(System.in);
		
		// �迭�� ũ�� �Է¹ް�, ũ�⸸ŭ �迭 ����
		System.out.print("��ڼ� : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		// �迭��� �Է¹���
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = stdIn.nextInt();
		}
		
		// �˻��� �� �Է¹���
		System.out.print("�˻��� �� : ");
		int key = stdIn.nextInt();
		
		// �˻� �޼ҵ� ȣ��
		int idx = seqSearch(x, num, key);
		
		// �˻��� ������ ���
		if(idx == -1) 
			System.out.println(key + "���� �����ϴ�.");
		// �˻��� ������ ���
		else
			System.out.println(key + "���� x[" + idx + "]�� �ֽ��ϴ�.");
		
		
		
		
		
		
		
		
		
	}

}
