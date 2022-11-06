package chapter3;

import java.util.Scanner;

public class SeqSearchSen {

	
	static int SeqSearchSen(int n, int x[], int ky) {
		// 보초법을 이용하여 선형검색
		
		x[n] = ky;
		
		int i=0;
		while(true) {

			// while문 안의 판단 횟수(if)가 절반으로 줄어든다.
			if(x[i]==ky)
				break;
			i++;
		}
		
		//n == i 이면 검색 실패
		return n==i ? -1: i;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 요솟수, 배열, 검색할 값 입력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수를 입력해주세요 : ");
		int num = sc.nextInt();

		//보초법을 위한 인덱스 하나 추가
		int[] x = new int[num+1];
		System.out.println("배열의 값을 입력해주세요");
		for(int i=0; i<num; i++) {
			System.out.print(i + "번째 값 : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값을 입력해주세요 : ");
		int ky = sc.nextInt();
		
		int index = SeqSearchSen(num, x, ky);
		
		if(index>=0)
			System.out.println(ky+"은 x["+index+"] 에 있습니다.");
		else
			System.out.println(ky+"은 x배열에 없습니다.");
		
		
		
		
	}

}
