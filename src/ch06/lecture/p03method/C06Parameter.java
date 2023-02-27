package ch06.lecture.p03method;

public class C06Parameter {
	public static void main(String[] args) {
		//자동형변환
			
		
		MyClass06 o1 = new MyClass06();
		o1.method1(33);
		o1.method1('c');
		
		o1.method2(12983019283L);
		o1.method2(33);
		o1.method2('d');
		
		o1.method3(3.14);
		o1.method3(483894798723993847L);
		o1.method3(55);
		
		o1.method4(3.14f);
	}
}
