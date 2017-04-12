package game;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
public class Main {
	public static void main(String args[]) throws Exception{
		int num, num1;
		Intro itr = new Intro();
		Result res = new Result();
		Quest qs = new Quest();
		
		
		//게임시작
		for(;;){
		itr.intro();
		Scanner std = new Scanner(System.in);
		num = std.nextInt();
		switch(num){
		
		//게임시작
		case 1:
			qs.print();           //구구단 문제 시작
			res.question();       //저장할껀지 묻는 메시지
			num1 = std.nextInt(); //1번입력시 저장 2번입력시 저장안함
			res.save(num1);       //저장
			break;
			
		//랭킹보기
		case 2:
			res.load();          //기록불러오기
			break;
			
		//종료
		case 3 : 
			System.exit(0);
			break;
			
		}
		}
		
		
		
		
	
	}

}
