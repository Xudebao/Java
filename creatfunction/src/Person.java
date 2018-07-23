
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
		this.name = name;//通过this关键字将局部变量name【右边】赋值给成员变量name【左边】
		this.sex = sex;
	}
	/*
	 构造函数私有化，只有在本类中有效。那么，该如何访问呢？
	 注意1：构造函数只能被构造函数调用。不能直接被一般函数调用，
	 原因是：一般函数是在有对象时才能用，而对象要先初始化【使用构造函数】才能用
	
	 构造函数之间的访问通过关键字 this 来解决
	this：代表的是对象。具体代表哪个对象呢？即哪个对象调用this所在的函数，this就代表哪个对象 
	this带上参数列表的方式就是可以访问本类中的其他构造函数
	 比如：this("李四")，这个访问的就是本类中，带有一个字符串参数的构造函数
	 
	 记住：用于调用构造函数的this语句必须定义在构造函数的第一行，因为初始化动作要先执行;
	 并且一个构造函数中只能调用一个构造函数，即只能写一个this语句【因为只能放在第一行】
	 
	 总结：只要直接被对象调用的方法都持有this引用。（即凡是访问了对象中的数据的方法都持有this引用）
	
	this的另一个作用是：当成员变量和局部变量同名时，可以通过this关键字来区分
	例如，  this.name = name,左边的name是成员变量，右边的name是局部变量
	即，右边的局部变量name，赋值给左边依靠this关键字来区别的成员变量name
	*/
	
	Person(String name,String sex,int age)
	{
		this(name,sex);
	//	name = n;
		this.age = age;
	}
	
	//建立一个功能，判断是否为同龄人
	//结果：为boolean型数据
	//参数：传递一个Person对象
	public boolean equalsAge(Person pp)
	{
		return pp.age == this.age;//右边中的age是指调用equalsAge方法的这个对象中的age
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

