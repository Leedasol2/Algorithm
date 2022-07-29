package chapter2;

import java.util.Scanner;

public class parc_Q11 {
	
	static int isLeap(int year) {
		return (year%4==0 && year%100!=0||year%400==0)?1:0;
	}
	
	static int[][] days= {
			{31,28,31,30,31,30,31,31,30,31,30,31},	//평년
			{31,29,31,30,31,30,31,31,30,31,30,31}	//윤년
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
			
			// d+n이 현재 달의 일수를 초과 했을 때
			if(d>days[isLeap(y)][m-1]) {
				
				//월,일 구하기
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
			
			// n이 현재 달의 남은 일수보다 작을 때
			if(d<=0) {
				
				//월,일 구하기
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
		
		System.out.println("날짜를 입력해주세요");
		System.out.print("년 : ");
		int y=Integer.parseInt(sc.nextLine());
		System.out.print("월 : ");
		int m=Integer.parseInt(sc.nextLine());
		System.out.print("일 : ");
		int d=Integer.parseInt(sc.nextLine());
		
		System.out.print("현재 일로부터 몇 일을 더하고 뺄까요? : ");
		int n=Integer.parseInt(sc.nextLine());
		
		
		YMD test1=new YMD(y, m, d);
		
		YMD test2=test1.after(n);
		YMD test3=test1.before(n);
		
		System.out.printf("기준일 : %d년 %d월 %d일\n",test1.y,test1.m,test1.d);
		System.out.printf("%d일 후 : %d년 %d월 %d일\n",n,test2.y,test2.m,test2.d);
		System.out.printf("%d일 전 : %d년 %d월 %d일\n",n,test3.y,test3.m,test3.d);
	}
	
	
}
