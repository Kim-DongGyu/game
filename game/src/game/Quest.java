package game;

import java.util.Random;
import java.util.Scanner;

public class Quest
{

  
   int i; //난수
   int j; //난순
   int c; //정답
   int d; //사용자 입력값
   static int score = 0; //점수
   boolean num = true;
   Scanner sn = new Scanner(System.in);
   static Gawebawebo gbb = new Gawebawebo();
   //문제시작출력
   void print(){
	   
   
	   System.out.println("=================================");
	   System.out.println("곱셈 문제를 맞추는 프로그램 입니다.");
	   System.out.println("       값을 입력하시오!"); 
	   System.out.println("=================================");
   		
   //문제발생
  
	   while(num){
		   Random rnd = new Random();
		   
		   int i= rnd.nextInt(10)+1;
		   int j= rnd.nextInt(10)+1;
		   
		   int c= i*j;
		   
		   System.out.println("");
		   System.out.print("문제."+i+" X "+j+"=");
		   d = sn.nextInt();
		   
		   if(c == d){
			   ++score;
			   System.out.println("정답입니다.");
			
		   }else{
			   //가위바위보
			   System.out.println("틀렸습니다.");
			   gbb.printMenu();
			   num= false;
		   }
		   
		   }   
   }
   
}