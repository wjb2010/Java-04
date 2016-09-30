package tt;

import java.nio.charset.MalformedInputException;

import bb.Main;

//访问权限,类的关键字,类名

 public class Car extends Main{

	// 特征(变量)
	 public String type;
	 public float price;
	public String brand;
	
	
	

	public void drive() {
		n();
		
		System.out.println(type);
		System.out.println(price);
		System.out.println(brand);
	}




	/**
	 * 
	 */
	public void n() {
		System.out.println("这是一个汽车的方法1");
	}

	

	
	
	
	
	
	

	// 行为(方法)

}
