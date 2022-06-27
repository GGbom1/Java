package experiment6ixF28;

public class Computer 
{
	//属性：型号（model），操作系统（OS）
	String model,OS;
	
	//2个构造方法：    
	//2个参数（String model，String OS）通过参数传递设置属性的值。
	//1个参数（String model）通过参数设置属性model的值，并把OS的值设置为”Windows10”
	Computer(String model,String OS){this.model=model;this.OS=OS;}
	Computer(String model){this.model=model;OS="Windows10";}
	//定义所有属性的getter、setter访问器
	public void setterModel(String model) {this.model=model;}
	public String getterModel() {return model;}
	public void setterOS(String OS) {this.OS=OS;}
	public String getterOS() {return OS;}
	//定义方法work( )：输出“电脑都拥有操作系统，可运行程序！”   
	public void work() {System.out.println("电脑都拥有操作系统，可运行程序！");}
	//定义方法print( )：输出品牌、操作系统等信息。       
	public void print() {System.out.println("品牌:"+model);System.out.println("操作系统"+OS);}
	
	
}
