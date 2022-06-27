package experiment6ixF28;

public class IPad extends Computer
{	//定义1个参数的构造方法(把OS的值设置为默认值“iPadOS13”)。 
	//IPad(){super("联想");}
	IPad(String model){super(model);super.OS="iPadOS13";}
	
	//覆盖父类的work( )方法：输出：“触屏操作，轻便，用于娱乐消遣！
	public void work() {System.out.println("触屏操作，轻便，用于娱乐消遣！");}
}
