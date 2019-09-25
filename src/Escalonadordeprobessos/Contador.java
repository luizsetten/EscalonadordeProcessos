package Escalonadordeprobessos;

public class Contador extends Thread {
	int clock = 5;
	
	
	
	public void decrementa() throws InterruptedException {
		clock --;
		Contador.sleep(1000);
	}



	@Override
	public void run() {
		
		while(true) {
			try {
				decrementa();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
