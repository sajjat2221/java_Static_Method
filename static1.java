import java.util.*;
import java.io.*;


public class static1 {
	
	

public static boolean display(int breadth,int height){

	
	
	boolean flag;
	if(height<=0 || breadth<=0){
		flag=false;
		
	}
	else{
		flag=true;
	}
	
	return flag;

	
}
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     System.out.print("Enter you Number ");
	 
	 int b=in.nextInt();
     int  h=in.nextInt();
	 int sum=0;
	   
	boolean value=static1.display(b,h);
	
	
		
		if(value==false){
			System.out.print("java.lang.Exception: Breadth and height must be positive");
		}
		else if (value==true){
			sum=b*h;
			System.out.println("Result is "+sum);
		}
      
    }
}