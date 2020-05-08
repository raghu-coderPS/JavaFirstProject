package com.sapient.students;

public class Message implements Runnable {
		private static final int N = 10;
	    private Thread thread;
	    private static Object object = new Object();

	    public Message(String name){
	        thread = new Thread(this, name);
	        thread.start();
	    }

	    public void run(){
	        for(int i=0; i<N; i++){
	            synchronized (object) {
	                System.out.println(thread.getName());
	                object.notify();
	                try {
	                    object.wait();
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }

	            }
	        }
	 }

	public static void main(String[] args) {
		Message message1 = new Message("tic");
		Message message2 = new Message("toc");
	}

}
