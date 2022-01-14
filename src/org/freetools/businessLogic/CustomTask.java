package org.freetools.businessLogic;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.util.TimerTask;

public class CustomTask extends TimerTask {

	public CustomTask() {
		
	}

	public void run() {
		try {
			// Your task process
			System.out.println("Task1 Runs after every 1 min");
			System.out.println("Task Start");
			taskWork();
			System.out.println("Task End");

		} catch (Exception ex) {
			System.out.println("error running thread " + ex.getMessage());
		}
	}
	
	public void taskWork() throws Exception {
		//Move Mouse Pointer Logic 
		
		Robot r = new Robot();
		
		int counter = 0;
		/*while (true) {
			r.delay(1000);*/
			PointerInfo a = MouseInfo.getPointerInfo();
			Point b = a.getLocation();
			int xi = (int) b.getX();
			int yi = (int) b.getY();
			int xf = 0, yf = 0;
			System.out.println("Cursor Current Location " + "xi = " + xi + " yi = " + yi);
			
			if (counter % 2 == 0) {
				xf = xi + 5;
				yf = yi + 5;
			} else {
				xf = xi - 5;
				yf = yi - 5;
			}
			r.mouseMove(xf, yf);
			System.out.println("Cursor Destination Location " + "x = " + xf + " y = " + yf);
			counter++;
		//}

		
	}
}
