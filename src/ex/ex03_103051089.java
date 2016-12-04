package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，輸出 n 的所有正因數，並判斷該整數是否為質數
 * Date: 2016/11/28
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class ex03_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean prime =true;
		for(int i=2;i<=Math.sqrt(num);i++){
			if(num%i==0){
				prime =false;
			}
		}
		if(prime==true && num!=1){
			System.out.println("prime!");
			
		}else{
			for(int i =1;i<=num;i++){

				if(num%i==0){
					System.out.print(i+"\t");
				}
			}
		}
	}

}
