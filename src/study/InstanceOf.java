package study;
class Parent{
	void confirm1(){
		System.out.println("class of Parent");
	}
}
class Child extends Parent{
	void confirm2() {
		System.out.println("class of Child");
	}
}
class Instance{
	
	void doWork(Child cd) {
		if(cd instanceof Child) {
			Parent pe = (Child)cd;
			cd.confirm2();
			System.out.println("casting completed");
		}
		else {
			System.out.println("casting fail");
		}
	}
}
public class InstanceOf {
	public static void main(String[] args) {
		Instance in = new Instance();
		in.doWork(new Child());
		
		//Parent p = new Parent();
		//Child cd = (Child)p;
		//cd.confirm2(); //�ڽ� ���������� �θ��ν��ͽ��� ����ų�� ����. 
		               //����ȯ�� �����ϴ�.
		               // ���� �ν��Ͻ����� confirm2()�� ���⶧���̴�.
	}
}
