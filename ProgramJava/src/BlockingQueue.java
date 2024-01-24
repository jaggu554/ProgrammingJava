import java.util.concurrent.ArrayBlockingQueue;
public class BlockingQueue {
public static void main(String[] args) {
	ArrayBlockingQueue<String> animals=new ArrayBlockingQueue<>(5);
	try {
	animals.put("Dog");
	animals.put("Cat");
	System.out.println("ArrayBlockingQueue:"+animals);
}catch(Exception e) {
	System.out.println(e);
}
}
}