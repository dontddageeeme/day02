package day02;

public class Ex04 {
public static void main(String[] args) {
	/*
	 상수 : 한번 저장하면 변경할 수 없다
	 final : 상수를 지정하면 바뀌지 않게 만들어주는 명령어(절대적으로 변경 안하는거)
	 */
	final int num = 100;
	//num = 200;
	System.out.println( num );
	
	//String 은 무조건 ""로 쓰기
	String name = "구나연";
	System.out.println( name );
	
	final String KOREA = "대한민국";
	//KOREA = "미국";
	System.out.println( KOREA );
	
	boolean bool = true;
	System.out.println(bool);
	bool = false;
	System.out.println(bool);
	
	String addr;
	addr = "산골짜기";
	System.out.println(addr);
	
	int n1, n2, sum;
	n1 = 10;
	n2 = 20;
	sum = n1+n2;
	System.out.println(sum);
	System.out.println(n1+n2);
	
	int num1=0,num2=0,sum2=0;
	sum2 = num1+num2;
	System.out.println(sum2);
	
	//첫번째 글자가 대문자면 null로 초기화
	//첫번째가 소문자면 0으로 초기화
	String a=null;
	System.out.println(a);
			
}
}
