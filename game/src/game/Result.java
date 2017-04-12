package game;
import java.io.RandomAccessFile;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.InputStream;





public class Result extends Quest {
	String name; //저장할 이름
	FileWriter fw = null; 
	public void question(){
		for(int a=0; a<10; a++) System.out.println("");
		System.out.println("당신의 점수는 " + super.score + "점입니다.");
		System.out.println("기록을 저장하시겠습니가?(1.yes/2.no) : ");
	}
	
	
	public void save(int m){
		switch(m){
		case 1:
			
			Scanner sn = new Scanner(System.in);
			System.out.println("your name : ");
			name = sn.nextLine();
			String logPath = "C:\\log.txt"; //파일 경로
			  
			  File templog = new File(logPath);
			   
			  try {
			   
			   if(!templog.exists())//해당경로에 파일있는 없는 경우 생성
			    templog.createNewFile();
			  
			     RandomAccessFile raf = new RandomAccessFile(logPath, "rw"); //이어쓰기용
			      raf.seek(raf.length());//맨마지막 위치로 커서 이동
			      String str =name+" "+ "score " + super.score+"\n"; //기록할 글
			      String r_str = new String(str.getBytes("KSC5601"),"8859_1");              
			      raf.writeBytes(r_str);
			     
			     
			      raf.close();
			      
			  } catch (Exception e) {
			   e.printStackTrace();
			  } 
			  System.out.println("점수가 기록되었습니다.");
			break;
			
		case 2:
			System.out.println("점수가 기록되지않았습니다.");
			//메인화면으로 돌아감
			break;
		}
		
	}
	
	public void load(){
		
		try{
			File f = new File("C://log.txt");
			//FileReader reader = new FileReader(f); //파일읽기
			BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF-8"));  
			//읽은 파일을 버퍼에 담는다
			String str = buffer.readLine();
			while(str != null){
				System.out.println(str);
				str = buffer.readLine();
			}
			buffer.close();
		}catch(FileNotFoundException e){e.printStackTrace();  	
	}catch(IOException e){e.printStackTrace();}}
	
	



		
	
	

}
