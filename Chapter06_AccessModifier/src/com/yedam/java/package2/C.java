package com.yedam.java.package2;

import com.yedam.java.package1.A;
import com.yedam.java.package1.B;

public class C {
	
	//A a;
	//B b;
	
	A a1 = new A(true);
	//A a2 = new A(1);  디폴트
	//A a3 = new A("문자열");  프라이빗
	
	public C() {
		A a = new A();
		a.field1 = 5;
		//a.field2 = 5;
		//a.field3 = 5;
		
		a.method1();
		//a.method2();
		//a.method3();
	}
	
}
