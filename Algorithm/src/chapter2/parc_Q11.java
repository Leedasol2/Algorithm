package chapter2;

import java.util.Scanner;

public class parc_Q11 {
	
	static int isLeap(int year) {
		return (year%4==0 && year%100!=0||year%400==0)?1:0;
	}
	
	static int[][] days= {
			{31,28,31,30,31,30,31,31,30,31,30,31},	//���
			{31,29,31,30,31,30,31,31,30,31,30,31}	//����
		};

	public static class YMD{
		int y;
		int m;
		int d;
		
		public YMD(int y, int m, int d) {
			this.y=y;
			this.m=m;
			this.d=d;
		}
		
		public YMD after(int n) {
			int y=this.y;
			int m=this.m;
			int d=this.d+n;
			
			// d+n�� ���� ���� �ϼ��� �ʰ� ���� ��
			if(d>days[isLeap(y)][m-1]) {
				
				//��,�� ���ϱ�
				while(d > days[isLeap(y)][m-1]) {
					d=d-days[isLeap(y)][m-1];
					m++;
					if(m>12) {
						y++;
						m=1;
					}
				}
				
			}
			return new YMD(y,m,d);
		}
		
		public YMD before(int n) {
			int y=this.y;
			int m=this.m;
			int d=this.d-n;
			
			// n�� ���� ���� ���� �ϼ����� ���� ��
			if(d<=0) {
				
				//��,�� ���ϱ�
				while(d < 1) {
					m--;
					if(m<1) {
						y--;
						m=12;
					}
					d=days[isLeap(y)][m-1]+d;
				}
				
			}
			return new YMD(y,m,d);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("��¥�� �Է����ּ���");
		System.out.print("�� : ");
		int y=Integer.parseInt(sc.nextLine());
		System.out.print("�� : ");
		int m=Integer.parseInt(sc.nextLine());
		System.out.print("�� : ");
		int d=Integer.parseInt(sc.nextLine());
		
		System.out.print("���� �Ϸκ��� �� ���� ���ϰ� �����? : ");
		int n=Integer.parseInt(sc.nextLine());
		
		
		YMD test1=new YMD(y, m, d);
		
		YMD test2=test1.after(n);
		YMD test3=test1.before(n);
		
		System.out.printf("������ : %d�� %d�� %d��\n",test1.y,test1.m,test1.d);
		System.out.printf("%d�� �� : %d�� %d�� %d��\n",n,test2.y,test2.m,test2.d);
		System.out.printf("%d�� �� : %d�� %d�� %d��\n",n,test3.y,test3.m,test3.d);
	}
	
	
}
