package hw;
/*
 * Topic: 設計Student與course 兩個 class，Student Class包含下列資訊:學號、姓名與課程(Course)，Course的class包含 課程名稱、課程代號、課程分數、授謀老師、學分數，並於主程式讓使用者輸入位學生的資料及修課資料，並根據平均成績由高至低輸出這些同學的資料
 * Date: 2016/11/28
 * Author: 103051089 林冠磊
 */
import java.util.ArrayList;
import java.util.Scanner;
public class hw03_103051089
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> stuList = new ArrayList<Student>();
		boolean sw=true;
		while(sw){
			System.out.println("name");
			String name =sc.next();
			System.out.println("id");
			String id =sc.next();
			stuList.add(new Student(name,id));
			System.out.println("more?");
			char chk = sc.next().charAt(0);
			if(chk =='n'||chk=='N'){
				sw=false;
			}
		}
		
		for(int i=0;i<stuList.size();i++){
			sw=true;
			System.out.println("no."+(i+1));
			while(sw){
				
				System.out.println("CourseName");
				String name =sc.next();
				System.out.println("CourseID");
				String id =sc.next();
				System.out.println("CourseTeacher");
				String teacher =sc.next();
				System.out.println("CourseScore");
				int score = sc.nextInt();
				System.out.println("CourseNum");
				int num = sc.nextInt();
				stuList.get(i).addCourse(name,id,teacher,score,num);
				System.out.println("more?");
				char chk = sc.next().charAt(0);
				if(chk =='n'||chk=='N'){
					sw=false;
				}
			}
		}
		Student stuTemp;
		for(int i=0;i<stuList.size()-1;i++){
			for(int j=0;j<stuList.size()-1;j++){
				if(stuList.get(j).getAvg()<stuList.get(j+1).getAvg()){
					stuTemp=stuList.get(j);
					stuList.set(j,stuList.get(j+1));
					stuList.set(j+1,stuTemp);
				}
			}
		}
		for(int i=0 ;i<stuList.size();i++){
			stuList.get(i).showInfo();
		}
		
	}
}
class Student{
	private String name,id;
	private ArrayList<Course> couList = new ArrayList<Course>();
	public Student(String name1,String id1){
		name=name1;
		id=id1;
	}
	public String getName(){
		return name;
	}
	public String getId(){
		return id;
	}
	public void addCourse(String name1,String id1,String teacher1,int score1,int num1){
		couList.add(new Course(name1,id1,teacher1,score1,num1));
	}
	public void showInfo(){
		System.out.println(name+"_"+id+"_"+getAvg());
		for(int i =0;i<couList.size();i++){
			System.out.print(couList.get(i).getId());
			System.out.print("\t"+couList.get(i).getName());
			System.out.print("\t"+couList.get(i).getTeachwr());
			System.out.print("\t"+couList.get(i).getScore());
			System.out.print("\t"+couList.get(i).getNum());
		}
	}
	public float getAvg(){
		float temp=0;
		for(int i =0;i<couList.size();i++){
			temp+=(float)couList.get(i).getScore();
		}
		return temp/couList.size();
	}
	
	 
}
class Course{
	private String name,id,teacher;
	private int score,num;
	public Course(String name1,String id1,String teacher1,int score1,int num1){
		name=name1;
		id=id1;
		teacher=teacher1;
		score=score1;
		num=num1;
	}
	public  String getName(){
		return name;
	}
	public String getId(){
		return id;
	}
	public String getTeachwr(){
		return teacher;
	}
	public int getScore(){
		return score;
	}
	public int getNum(){
		return num;
	}
	
}
