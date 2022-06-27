package experiment6ixF28;

public class ComputerDemo {

	public static void main(String[] args) 
	{
		//在main方法里面分别创建Computer、Laptop、IPad类的对象，并分别调用他们的work、print方法。    
		
		Computer a1=new Computer("小米");
		a1.work();
		a1.print();
		Computer a2=new Laptop("华为");
		a2.work();
		a2.print();
		Computer a3=new IPad("联想");
		a3.work();
		a3.print();

	}

}
