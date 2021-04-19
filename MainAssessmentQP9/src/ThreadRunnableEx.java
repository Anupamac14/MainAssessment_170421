class Task implements Runnable{
	@Override
	public void run (){
		System.out.println ("Runnable interface");
	}
}
class ThreadDemo extends Thread{
	@Override
	public void run(){
		System.out.println( "Thread class ");
	}
}
public class ThreadRunnableEx {
	public static void main (String ... args){
new ThreadDemo().start();
	
		new Thread (new Task(), "Thread 1").start();
		
		new Thread (new Task(), "Thread 2").start();
	}
}
