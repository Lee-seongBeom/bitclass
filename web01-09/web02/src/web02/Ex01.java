package web02;

class Target{
	public Target(){
		System.out.println("��ü ������.");
	}
	
	void func(){
		System.out.println("target func");
	}
}

public class Ex01 {

	public static void main(String[] args) {
//		Target target = new Target();
//		target.func();

		String info = "web02.Target";
		try {
			Class clazz = Class.forName(info);
			Target result = (Target) clazz.newInstance();
			result.func();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}












