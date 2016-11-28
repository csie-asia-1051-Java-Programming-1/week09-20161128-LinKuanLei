package ex;
/*
 * Topic: 設計一 class 包含下列資訊:學號、姓名、國文成績、英文成績、數學成績，
 並於主程式讓使用者輸入位學生的資料並根據平均成績由高至低輸出如下:
 ID    NAME     Chinese     English       Math        Avg
 * Date: 2016/11/28
 * Author: 103051089 林冠磊
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ex02_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> stuList = new ArrayList<Student>();
		String name , id;
		while(true){
			System.out.print("姓名");
			name = sc.next();
			System.out.print("學號");
			id = sc.next();
			stuList.add(new Student(name,id));
			System.out.print("下一位?(Y/N)");
			char chk = sc.next().charAt(0);
			if(chk == 'N' || chk == 'n'){
				break;
			}
		}
		for(int i = 0 ; i <stuList.size() ; i++){
			System.out.print("第"+(i+1)+"位\t中文成績");			
			stuList.get(i).addScore("ChineseScore", sc.nextInt());
			System.out.print("第"+(i+1)+"位\t英文成績");			
			stuList.get(i).addScore("EngishScore", sc.nextInt());
			System.out.print("第"+(i+1)+"位\t數學成績");			
			stuList.get(i).addScore("MathScore", sc.nextInt());
		}
		System.out.println("學生共計"+stuList.size()+"位");
		for(int i = 0 ; i <stuList.size() ; i++){
			System.out.println("第"+(i+1)+"位\t姓名 "+
												stuList.get(i).getName() + "\t ID " +
												stuList.get(i).getId() + "\t 	平均分數 "+
												stuList.get(i).avgScore());
		}
		Student tempStu;
		for (int i=0;i<stuList.size()-1;i++)  
        {
             for (int j=0;j<stuList.size()-1;j++)  
             {
                  if (stuList.get(j+1).avgScore()>stuList.get(j).avgScore())
                  {
                      tempStu = stuList.get(j+1);  //交換陣列元素
                      stuList.set(j+1 , stuList.get(j));
                      stuList.set(j , tempStu);
                  }
             }
        }
		System.out.println("以平均排列：");		
		for(int i = 0 ; i <stuList.size() ; i++){
			System.out.println("第"+(i+1)+"位\t姓名 "+
												stuList.get(i).getName() + "\t ID " +
												stuList.get(i).getId() + "\t 	平均分數 "+
												stuList.get(i).avgScore());
		}
	}

}
class Student{
	private String name , id;
	private ArrayList<Score> scoreList = new ArrayList<Score>();
	public Student (String name1 , String id1){
		name = name1;
		id = id1;
	}
	public String getName(){
		return name;
	}
	public String getId(){
		return id;
	}
	public void addScore(String scoreName1 ,int score){ 
		scoreList.add(new Score(scoreName1,score));
	}
	public float avgScore(){
		float total = 0f;
		for(int i = 0 ; i < scoreList.size() ; i++){
			total += scoreList.get(i).getScore();
		}
		return total/scoreList.size();
	}
	
}
class Score{
	private String scoreName ;
	private int score;
	public Score(String name1 ,int score1){
		scoreName = name1;
		score = score1;
	}
	public void setName(String name1){
		scoreName = name1;
	}
	public void setScore(int score1){
		score = score1;
	}
	public String getName(){
		return scoreName;
	}
	public int getScore(){
		return score;
	}
}