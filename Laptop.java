package experiment6ixF28;

public class Laptop extends Computer
{
	//定义包含2个参数和1个参数的构造方法
	Laptop(String model,String OS){super(model,OS);}
	Laptop(String model){super(model);}
	//覆盖父类的work( )方法：输出：“手提电脑，便于携带，用于移动办公环境！”
	
	public void work() {System.out.println("手提电脑，便于携带，用于移动办公环境！");}
}
