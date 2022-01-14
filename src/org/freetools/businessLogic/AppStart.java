package org.freetools.businessLogic;

import java.util.Timer;

public class AppStart {
	
	public int minutes;

	public AppStart(int minutes)
	{
		this.minutes = minutes;
	}
	
	
	public void taskScheduler() {
		
		/*Calendar calendar = Calendar.getInstance();
        calendar.set(
           Calendar.DAY_OF_WEEK,
           Calendar.MONDAY
        );
        calendar.set(Calendar.HOUR_OF_DAY, 17);
        calendar.set(Calendar.MINUTE, 51);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);*/
        
		Timer time = new Timer();                 // Instantiate Timer Object
		CustomTask customTask = new CustomTask(); // Instantiate SheduledTask class
        time.schedule(customTask, 0, minutes*60*1000);      
        
        // Start running the task on Monday at 15:40:00, period is set to 8 hours
        // if you want to run the task immediately, set the 2nd parameter to 0
        //time.schedule(customTask, calendar.getTime(), TimeUnit.HOURS.toMillis(8));
        
         
		
	}
	
}

