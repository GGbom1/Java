package experiment6ixF28;

public class ComputerDemo {

	public static void main(String[] args) 
	{
		//��main��������ֱ𴴽�Computer��Laptop��IPad��Ķ��󣬲��ֱ�������ǵ�work��print������    
		
		Computer a1=new Computer("С��");
		a1.work();
		a1.print();
		Computer a2=new Laptop("��Ϊ");
		a2.work();
		a2.print();
		Computer a3=new IPad("����");
		a3.work();
		a3.print();

	}

}
