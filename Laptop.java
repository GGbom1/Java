package experiment6ixF28;

public class Laptop extends Computer
{
	//�������2��������1�������Ĺ��췽��
	Laptop(String model,String OS){super(model,OS);}
	Laptop(String model){super(model);}
	//���Ǹ����work( )�������������������ԣ�����Я���������ƶ��칫��������
	
	public void work() {System.out.println("������ԣ�����Я���������ƶ��칫������");}
}
