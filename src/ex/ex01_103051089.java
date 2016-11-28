package ex;
/*
 * Topic: 請設計一樂透亂數選號程式，由 1~42 中選出 6個不重覆的數字組合並輸出。 請使用已下方式,(setSeed就是設定亂數種子，可以使每次跑出的亂數序列，都會是一樣的)
 例如:輸入 23323456會得到 39  17  32  13  41  15 
	Random randnum = new Random();
	randnum.setSeed(23323456)
 * Date: 2016/11/28
 * Author: 103051089 林冠磊
 */

import java.util.Random;

public class ex01_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		rnd.setSeed(23323456);
		int[] val = new int[6];
		int i =0;
		while(i<6){
			val[i]=rnd.nextInt(42)+1;	
			for(int j = 0 ; j<6 ; j++){
				if(i==j){
					continue;
				}
				if(val[i] != val[j]){		
					System.out.println(val[i]);
					i++;
					break;					
				}
			}				
		}
	}

}
