package bb;
import tt.Car;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//创建对象
		//类名 自定义对象变量名=new 类名();
		
		Student stu = new Student();
		Car car;
		car= new Car();
		
		Fish fish = new Fish();
		
		
		//使用特征
		stu.name="刘德华";
		stu.age=25;
		stu.sex="男";
		
		
		car.type="轿车";
		car.price=25000;
		car.brand="Toyota";
		
		fish.name="鲤鱼";
		
//		System.out.println(stu.name);
//		System.out.println(stu.age);
//		System.out.println(stu.sex);
		
		//使用行为
		stu.info();
		car.drive();
		fish.eat();
		
		//car.drive1();
	}

	
	
}
