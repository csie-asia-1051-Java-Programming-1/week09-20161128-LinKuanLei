package hw;
/*
 * Topic: 輸入一個正整數 N，列舉如下數列，直到數字超過 N 為止。
數列一:1 2 4 7 11 16 22 29…
數列二:1 2 2 3 3 3 4 4 4 4 5 5 5 5 5...
 * Date: 2016/11/28
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class hw02_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = 1;
		for(int i = 0;temp<=num;i++){
			temp+=i;
			System.out.print(temp+"\t");
		}
		System.out.println();
		for(int i = 1;i<=num;i++){
			for(int j = 0;j<i;j++){
				System.out.print(i+"\t");
			}
		}
	}

}
