package ca.vollov.alg.labs;

public class RunThread {

	public static void main(String[] args) {
		new Thread(new CodeToRun()).start();

	}

}

class CodeToRun implements Runnable{
	public void run() {
		System.out.println("run thread");
	}
}