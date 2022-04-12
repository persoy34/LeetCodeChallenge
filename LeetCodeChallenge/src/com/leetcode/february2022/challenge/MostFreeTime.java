package com.leetcode.february2022.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Time implements Comparable<Time>{
	int hours;
	int minutes;
	int totalMinutes;
	Time endTime;
	String AMPM;
	@Override
	public int compareTo(Time o) {
		if (this.totalMinutes == o.totalMinutes)
			return 0;
		if (this.totalMinutes > o.totalMinutes)
			return 1;
		return -1;
	}
}
public class  MostFreeTime{
	
	private Time parseTime(String time) {
		  String []timeParts = time.split(":");
		  int hours = Integer.parseInt(timeParts[0].trim());
		  int minutes = Integer.parseInt(timeParts[1].trim().substring(0, 2));
		  String AMPM = timeParts[1].trim().substring(2).toUpperCase();
		  int totalMinutes = hours * 60 + minutes;
		  if (AMPM.equals("PM") && hours < 12)
		    totalMinutes += 12 * 60;
          Time returnTime= new Time();
          returnTime.hours= hours;
          returnTime.minutes= minutes;
          returnTime.totalMinutes=totalMinutes;
          returnTime.AMPM=AMPM;
          
          
		  return returnTime;
		}
	private String FormatTime(int time) {
		
		  return (time < 10) ? "0" + time : time+"";
		}
	public  String arrayChallenge(String[] strArr) {
		List<Time> startTimes = new ArrayList<>();
		  for (int i = 0; i < strArr.length; i++) {
		    String period = strArr[i];
		    String [] times = period.split("-");
		    Time time1 = parseTime(times[0]);
		    Time time2 = parseTime(times[1]);
		    time1.endTime = time2;
		    startTimes.add(time1);
		  }
		  Collections.sort(startTimes);
		  //to find difference between times
		  int diff = 0, mostDiff = 0;
		  for (int i = 0; i < startTimes.size() - 1; i++) {
		    Time endTimeOfEvent = startTimes.get(i).endTime;
		    Time startTimeOfNextEvent = startTimes.get(i+1);
		    diff = startTimeOfNextEvent.totalMinutes - endTimeOfEvent.totalMinutes;
		    if (diff > mostDiff)
		      mostDiff = diff;
		  }

		  String output;
		  if (mostDiff < 60)
		    output = "00:" + FormatTime(mostDiff);
		  else {
		    int hours = mostDiff / 60;
		    int minutes = mostDiff % 60;
		    output = FormatTime(hours) + ':' + FormatTime(minutes);
		  }
		  return output;	    
	  }

	  public static void main(String[] args) {  
	    // keep this function call here     
	   String [] strArr = {"12:15PM-02:00PM","09:00AM-12:11PM","02:02PM-04:00PM"};
	   MostFreeTime freeTime = new MostFreeTime();
	   String result =freeTime.arrayChallenge(strArr);
	   System.out.println(result);
	  }

	}


