
public class Person {

	private String name;
	private String sex;
	private int age;
	Person()
	{
		name = "body";
	}
	private Person(String name,String sex)
	{
		this.name = name;//ͨ��this�ؼ��ֽ��ֲ�����name���ұߡ���ֵ����Ա����name����ߡ�
		this.sex = sex;
	}
	/*
	 ���캯��˽�л���ֻ���ڱ�������Ч����ô������η����أ�
	 ע��1�����캯��ֻ�ܱ����캯�����á�����ֱ�ӱ�һ�㺯�����ã�
	 ԭ���ǣ�һ�㺯�������ж���ʱ�����ã�������Ҫ�ȳ�ʼ����ʹ�ù��캯����������
	
	 ���캯��֮��ķ���ͨ���ؼ��� this �����
	this��������Ƕ��󡣾�������ĸ������أ����ĸ��������this���ڵĺ�����this�ʹ����ĸ����� 
	this���ϲ����б�ķ�ʽ���ǿ��Է��ʱ����е��������캯��
	 ���磺this("����")��������ʵľ��Ǳ����У�����һ���ַ��������Ĺ��캯��
	 
	 ��ס�����ڵ��ù��캯����this�����붨���ڹ��캯���ĵ�һ�У���Ϊ��ʼ������Ҫ��ִ��;
	 ����һ�����캯����ֻ�ܵ���һ�����캯������ֻ��дһ��this��䡾��Ϊֻ�ܷ��ڵ�һ�С�
	 
	 �ܽ᣺ֻҪֱ�ӱ�������õķ���������this���á��������Ƿ����˶����е����ݵķ���������this���ã�
	
	this����һ�������ǣ�����Ա�����;ֲ�����ͬ��ʱ������ͨ��this�ؼ���������
	���磬  this.name = name,��ߵ�name�ǳ�Ա�������ұߵ�name�Ǿֲ�����
	�����ұߵľֲ�����name����ֵ���������this�ؼ���������ĳ�Ա����name
	*/
	
	Person(String name,String sex,int age)
	{
		this(name,sex);
	//	name = n;
		this.age = age;
	}
	
	//����һ�����ܣ��ж��Ƿ�Ϊͬ����
	//�����Ϊboolean������
	//����������һ��Person����
	public boolean equalsAge(Person pp)
	{
		return pp.age == this.age;//�ұ��е�age��ָ����equalsAge��������������е�age
		/*
		 if(pp.age == this.age)
		 	return true;
		 return false;
		 */
	}
	
	public void show()
	{
		System.out.println("name = "+name+','+"age = "+age+','+"sex = "+sex);
	}
}

