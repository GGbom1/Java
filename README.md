# Java
import java.util.ArrayList;
import java.io.*;
public class phoneBook
{
	ArrayList<Person> phoneList;
	phoneBook(){phoneList = new ArrayList<Person>();}
	phoneBook(int n)
	{
		phoneList = new ArrayList<Person>(n);
		for(int i=0;i<n;i++) {input();}
	}
	
	void input() 
	{
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in)); 
		try {
				System.out.println("请输入您的姓名");
				String name =in.readLine();
				System.out.println("请输入您的电话");
				String tel = in.readLine();
				phoneList.add(new Person(name,tel));
			} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}

	String searchByName(String name) 
	{
		for(int i=0;i<phoneList.size();i++) 
		{
			if(phoneList.get(i).name == name) 
			{
				System.out.println("根据输入的姓名查询phoneList，返回找到的电话号码，否则返回null；");
				return phoneList.get(i).getterTel();
			}
		}
		return null;
	}
	
	String searchByPhone(String phone) 
	{
		for(int i=0;i<phoneList.size();i++) 
		{
			if(phoneList.get(i).tel == phone )
			{
				System.out.println("根据输入的电话号码查询phoneList，返回找到的Person对象，否则返回null；");
				return phoneList.get(i).name;
			}
		}
		return null;
	}
	
	void writeFile(String filename) throws IOException 
	{
		System.out.println("遍历phoneList，调用每个Person的toString方法，获得姓名、电话串，输出到文本文件“phone.txt”中");
		FileWriter fw1=new FileWriter(filename);
		BufferedWriter bw=new BufferedWriter(fw1);
		for(int i=0 ; i<phoneList.size() ; i++) 
		{
			bw.write(phoneList.get(i).toString());
		}
		bw.flush();
		bw.close();  
	}
	
	void print(String filename) throws IOException 
	{
		System.out.println("把文件的所有内容从屏幕输出");
		FileReader fr=new FileReader(filename);
		BufferedReader br2=new BufferedReader(fr);
		String s2;
		System.out.println("********************************");
		System.out.println("文件中包括的内容：");
		while((s2=br2.readLine())!=null){
			System.out.println(s2);
			}
		System.out.println("********************************");
		br2.close();
	}

	void exportList(String filename) throws IOException 
	{
		System.out.println("使用对象序列化方法，把phoneList输出到文件");
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in)); 
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
		System.out.println("请输入姓名");
		String name = in.readLine();
		System.out.println("请输入电话");
		String tel = in.readLine();
		
		oos.writeObject(new Person(name,tel));
		oos.close();
	}

	void importList(String filename) throws IOException
	{
		System.out.println("使用对象序列化方法，从文件中读取内容加载phoneList。");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
		Object obj = ois.readLine();
		Person p = (Person) obj;
		System.out.println(p.getterName()+","+p.getterTel());
		ois.close();
	}

	void deleteByName(String name) 
	{
		for(int i=0;i<phoneList.size();i++)
		{
			if(name == phoneList.get(1).name) 
			{
				System.out.println("移除"+name);
				phoneList.remove(i);
				System.out.println("移除成功,根据输入的姓名查询phoneList，删除指定的Person对象，若删除成功返回true，否则返回false。");
			}
		}
	}
}