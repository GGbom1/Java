package experiment6ixF28;

public class Computer 
{
	//���ԣ��ͺţ�model��������ϵͳ��OS��
	String model,OS;
	
	//2�����췽����    
	//2��������String model��String OS��ͨ�����������������Ե�ֵ��
	//1��������String model��ͨ��������������model��ֵ������OS��ֵ����Ϊ��Windows10��
	Computer(String model,String OS){this.model=model;this.OS=OS;}
	Computer(String model){this.model=model;OS="Windows10";}
	//�����������Ե�getter��setter������
	public void setterModel(String model) {this.model=model;}
	public String getterModel() {return model;}
	public void setterOS(String OS) {this.OS=OS;}
	public String getterOS() {return OS;}
	//���巽��work( )����������Զ�ӵ�в���ϵͳ�������г��򣡡�   
	public void work() {System.out.println("���Զ�ӵ�в���ϵͳ�������г���");}
	//���巽��print( )�����Ʒ�ơ�����ϵͳ����Ϣ��       
	public void print() {System.out.println("Ʒ��:"+model);System.out.println("����ϵͳ"+OS);}
	
	
}
