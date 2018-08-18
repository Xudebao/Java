class bank
{
	int sum = 0;
	void save(int x)
	{
		sum = sum+x;
		System.out.println(Thread.currentThread().getName()+"....."+sum);
	}
}
class customer implements Runnable
{
	bank b = new bank();
	Object obj = new Object();
	public void run()
	{
		synchronized (obj) //同步代码块，使用任意对象作为“锁”
		{
				for(int i = 0;i<20;i++)
				b.save(100);
		}
	}
}
public class SaveMoney
{
	public static void main(String[] args)
	{
		Runnable cus1 = new customer();//创建Runnable对象1
		Runnable cus2 = new customer();//创建Runnable对象2
		
		Thread t1 = new Thread(cus1);//cus1创建Thread0
		Thread t2 = new Thread(cus1);//cus1创建Thread1
		Thread t3 = new Thread(cus2);//cus2创建Thread2
		Thread t4 = new Thread(cus2);//cus2创建Thread3
		Thread t5 = new Thread(cus2);//cus2创建Thread4
		t1.start();//开启线程
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
/*
 * 每一个对象都有一把锁，并且每个锁只有一把钥匙，而且对象的锁只会对被同步化了的方法上才起作用。
同步化的目标是保护重要的数据，你锁住的不是数据而是存取数据的方法。所以线程在开始执行并遇上同步化的方法时，
它会知道它需要对象的钥匙才能进入该方法，它会去拿钥匙（由虚拟机完成）。一旦进入方法内部，除非完成同步化的方法，
否则它不会放开钥匙，因此当线程持有钥匙时，没有其他的线程可以进入该对象的同步化方法，因为每个对象只有一个钥匙。

程序分析：
上面的程序创建了两个Runnable对象（cus1、cus2），并且给每个对象都配了一把锁。对于cus1，创建了两个线程
t1、t2，这两个线程相互交替拿cus1锁的钥匙，然后进入到同步化的方法中，并且每个线程都要执行20次循环;同样的，
对于cus2，创建了三个线程t3、t4、t5，这三个线程相互交替拿cus2锁的钥匙，然后进入到同步化的方法中，并且每个线程都要执行20次循环.
因此最后输出的结果是：由t1、t2完成的存储总数是4000，t3、t4、t5完成的存储总数是6000。
*/
