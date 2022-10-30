class slepjoin extends Thread{
	 public void run() {
		for (int i = 0; i <4; i++) {
		try {
		Thread.sleep(400);	
		} catch (Exception e) {
			
		}
		System.out.println(i);
		}
	}
}