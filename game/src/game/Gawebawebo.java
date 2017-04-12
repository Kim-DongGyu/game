package game;

import java.util.Random;
import java.util.Scanner;

public class Gawebawebo {

	String[] str = {" ","가위", "바위", "보"};   
	 

	static Quest qst = new Quest();
	
	int com;
	int user;
	Random rnd = new Random();
	Scanner sn = new Scanner(System.in);   
	   
	   
	   void printMenu(){
		   
		  System.out.println(""); 
	      System.out.println("곱셈문제를 틀리셨네요.");
	      System.out.println("이제 가위바위보 게임 입니다.");
	      System.out.println("1. 가위");
	      System.out.println("2. 바위");
	      System.out.println("3. 보");
	      System.out.print("선택한 번호는 : ");
	      
	      com = rnd.nextInt(3)+1;  
	      user = sn.nextInt();
	      
	      System.out.println("컴퓨터가 선택한 번호 : "+str[com]);
	      System.out.println("사용자가 선택한 번호 : "+str[user]);      
	      
	      switch(com){      
	         case 1:
	            if(user==1)
	               System.out.println("당신은 비겼습니다.");
	            if(user==2){
	               System.out.println("당신은 승리하였습니다.");
	            	qst.print();
	            }
	            if (user==3)
	               System.out.println("당신은 패배하였습니다.");
	            break;
	         case 2:
	            if(user==1)
	               System.out.println("당신은 패배하였습니다.");
	            if(user==2)
	               System.out.println("당신은 비겼습니다..");
	            if(user==3){
	               System.out.println("당신은 승리하였습니다.");
	            	qst.print();
	            }
	            break;
	         case 3:
	            if(user==1){
	               System.out.println("당신은승리하였습니다.");
	            	qst.print();
	            }
	            if(user==2) 
	               System.out.println("당신은 패배하엿습니다.");
	            if(user==3)
	               System.out.println("당신은 비겻습니다.");
	            break;         	                  
	         }
	       
	   }   

	   
}
