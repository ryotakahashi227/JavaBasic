package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */
		for(int i =0;i<6;i++) {
			if(i<1) {
				System.out.print("□");	
			}else {
				System.out.print("■");
			}
			for(int j =0;j<4;j++) {
				if(j<i-1) {
					System.out.print("■");
				}else {
				System.out.print("□");
			}
			}
				System.out.println();
		}
		for(int i =0;i<4;i++) {
		
				System.out.print("■");
			
			for(int j =0;j<4;j++) {
				if(j<3-i) {
					System.out.print("■");
				}else {
				System.out.print("□");
			}
			}
				System.out.println();
		}
	}
}
