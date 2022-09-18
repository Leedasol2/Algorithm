package chapter3;

import java.util.Scanner;

public class SeqSearch {
	
	// while문을 이용한 선형 검색 메소드
	static int seqSearch(int[] a, int n, int key) {
		
		/*
		 * key와 일치하는 요소를 찾으면 검색 성공! 	- 인덱스 i를 반환
		 * 배열의 끝까지 도달한 경우 검색 실패 		- -1을 반환
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
	
	// for문을 이용한 선형 검색 메소드
	static int seqSearch2(int[] a, int n, int key) {
		
		/*
		 * key와 일치하는 요소를 찾으면 검색 성공! 	- 인덱스 i를 반환
		 */
		for(int i=0; i<n; i++) {
			if(key==a[i]) {
				return i;
			}
		}

		// 반복문을 빠져나와 배열의 끝까지 도달한 경우 검색 실패 - -1을 반환
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdIn = new Scanner(System.in);
		
		// 배열의 크기 입력받고, 크기만큼 배열 선언
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		// 배열요소 입력받음
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = stdIn.nextInt();
		}
		
		// 검색할 값 입력받음
		System.out.print("검색할 값 : ");
		int key = stdIn.nextInt();
		
		// 검색 메소드 호출
		int idx = seqSearch(x, num, key);
		
		// 검색에 실패한 경우
		if(idx == -1) 
			System.out.println(key + "값은 없습니다.");
		// 검색에 성공한 경우
		else
			System.out.println(key + "값은 x[" + idx + "]에 있습니다.");
		
		
		
		
		
		
		
		
		
	}

}
