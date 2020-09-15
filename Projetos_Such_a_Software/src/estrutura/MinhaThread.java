package estrutura;

public class MinhaThread {
	public static void main(String[] args) {
		Thread minhaThread = new Thread(ThreadWorking);
		minhaThread.start();
//		new Thread() {
//			public void run() {
//				for(int i=0; i<10; i++) {
//					System.out.println("Hi Lorena");
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		}.start();
		
		System.out.println("How are u?");
	}
	
	private static Runnable ThreadWorking= new Runnable() {
		public void run() {
			for(int i=0; i<10; i++) {
				System.out.println("Hi Lorena");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
}
