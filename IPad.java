package experiment6ixF28;

public class IPad extends Computer
{	//����1�������Ĺ��췽��(��OS��ֵ����ΪĬ��ֵ��iPadOS13��)�� 
	//IPad(){super("����");}
	IPad(String model){super(model);super.OS="iPadOS13";}
	
	//���Ǹ����work( )�������������������������㣬����������ǲ��
	public void work() {System.out.println("������������㣬����������ǲ��");}
}
