package com.bridgelabz.fuctional;

/*
* @author :  Laxman Bhosale 
* @purpose:  Program Stopwatch Program for measuring the time that elapses between
             the start and end clicks.
* @Date   : 13/02/2019          
*/
public class StopWatch {
	public long startTime = 0;
	public long endTime = 0;
	public long elapsedTime = 0;

	// to start timer
	public void start() {
		startTime = System.currentTimeMillis();
		System.out.println("Start Time is: " + startTime);
	}

	// to stop timer
	public void stop() {
		endTime = System.currentTimeMillis();
		System.out.println("Stop Time is: " + endTime);
	}
  //calculates elapsed time
	public long getElapsedTime() {
		elapsedTime = endTime - startTime;
		return elapsedTime;
	}

	public static void main(String[] args) throws Exception {
		StopWatch sw = new StopWatch();
		// Utility u=new Utility();
		System.out.println("Press '1' to Start Time: ");
		int start1 = Utility.inputInteger();
		if (start1 == 1)
			sw.start();

		System.out.println();
		System.out.println("Press '2' to Stop Time: ");
		int start2 = Utility.inputInteger();
		if (start2 == 2)
			sw.stop();

		long l = sw.getElapsedTime();
		System.out.println();
		System.out.println("Total Time Elapsed(in millisec) is:" + l);
		System.out.println();
		System.out.println("Converting millisec to seconds: " + (l / 1000) + " sec");
	}
}