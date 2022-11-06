package chapter3;

import java.util.Scanner;

public class SeqSearchFor {
	
	static int seqSearchFor(int n, int x[], int ky) {
		
		for(int i=0; i<n; i++) {	
			if(x[i]==ky) {
				return i;
			}	
		}
		return -1;
		
		
	}
	
	public static void main(String[] args) {
		
		// 1. 요솟수, 배열, 검색할 값 입력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수를 입력해주세요 : ");
		int num = sc.nextInt();

		int[] x = new int[num];
		System.out.println("배열의 값을 입력해주세요");
		for(int i=0; i<num; i++) {
			System.out.print(i + "번째 값 : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값을 입력해주세요 : ");
		int ky = sc.nextInt();
		
		int index = seqSearchFor(num, x, ky);
		
		if(index>=0)
			System.out.println(ky+"은 x["+index+"] 에 있습니다.");
		else
			System.out.println(ky+"은 x배열에 없습니다.");
		
		
		
	}
}
