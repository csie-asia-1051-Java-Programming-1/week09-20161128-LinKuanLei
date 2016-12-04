package hw;
/*
 * Topic: 讓使用者輸入一正整數，利用函式呼叫找出一連續整數數列讓該數列的和為此一正整數，有些正整數並不能找出連續整數，若找不到時，請印出「No」。
 例如: 15 =1+2+3+4+5 =4+5+6=7+8
 * Date: 2016/11/28
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class hw01_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = 0;
		boolean  sw=true;
		for(int i =1;i<=num;i++){
			temp=0;
			for(int j = i;j<=num;j++){
				temp+=j;
				if(temp==num && j!=num){
					sw=false;
					System.out.print("=");
					for(int k = i;k<=j;k++){
						System.out.print(k);
						if(k<j){
							System.out.print("+");
						}
					}
					System.out.println();
				}
			}
		}
		if(sw==true){
			System.out.println("No");
		}
        }

}
