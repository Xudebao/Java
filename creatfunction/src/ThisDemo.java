
public class ThisDemo {

	public static void main(String[] args) {
	
	/*这里的初始化对象用的是Person函数，而Person类中有多个Person函数，那么到底是哪一个Person函数呢？
	就看关键字this在哪个Person函数中，并且看this调用了其他的哪个Person函数	
	我们可以看到：this在第三个构造函数Person中，再根据this(n,x)的形参可以知道，
	这个构造函数Person通过this关键字调用了第二个构造函数	 
	*/
	Person p = new Person("xiaoqiang","man",21);
	Person pp = new Person("xiaohong","woman",20);
	boolean b = p.equalsAge(pp);//p对象调用equalsAge方法
	System.out.print("b = "+b);
	//p.show();
	
	}

}
