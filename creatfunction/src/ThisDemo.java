
public class ThisDemo {

	public static void main(String[] args) {
	
	/*����ĳ�ʼ�������õ���Person��������Person�����ж��Person��������ô��������һ��Person�����أ�
	�Ϳ��ؼ���this���ĸ�Person�����У����ҿ�this�������������ĸ�Person����	
	���ǿ��Կ�����this�ڵ��������캯��Person�У��ٸ���this(n,x)���βο���֪����
	������캯��Personͨ��this�ؼ��ֵ����˵ڶ������캯��	 
	*/
	Person p = new Person("xiaoqiang","man",21);
	Person pp = new Person("xiaohong","woman",20);
	boolean b = p.equalsAge(pp);//p�������equalsAge����
	System.out.print("b = "+b);
	//p.show();
	
	}

}
