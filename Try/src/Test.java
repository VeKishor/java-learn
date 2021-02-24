import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.locks.StampedLock;


public class Test {

	public static void main1(String[] args) {
		LocalDateTime t1 = LocalDateTime.now();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LocalDateTime t2 = LocalDateTime.now();
		System.out.println(ChronoUnit.MILLIS.between(t1, t2));

		Long l1 = Long.valueOf(123);
		long l2 = 123;

		Map<Long, String> map = new Hashtable<Long, String>();

		map.put(l1, "val");
		System.out.println("containsKey " + map.containsKey(l2));

		StampedLock sl = new StampedLock();

		long s1 = sl.readLock();
		long s2 = sl.readLock();
		long s3 = sl.readLock();

		System.out.println("ReadLockCount" + sl.getReadLockCount());
		sl.unlockRead(s1);
		System.out.println("ReadLockCount" + sl.getReadLockCount());
		System.out.println("validate" + sl.validate(s1));
		sl.unlockRead(s1);
		System.out.println("ReadLockCount" + sl.getReadLockCount());
		sl.unlockRead(s1);
		System.out.println("ReadLockCount" + sl.getReadLockCount());
		// sl.unlockRead(s1);

		long x = 123;

	}

	public static void main(String args[]) {
		int num = 2;
		switch (num + 2) {
		case 1:
			System.out.println("Case1: Value is: " + num);
			break;
		case 2:
			System.out.println("Case2: Value is: " + num);
			break;
		case 3:
			System.out.println("Case3: Value is: " + num);
			break;
		default:
			System.out.println("Default: Value is: " + num);
		}
		
		try {
			System.out.println("Case1: Value is: ");
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
		    System.out.println("You should not divide a number by zero");
		}
		     
	}

}
