class Time{
 private int minute = 0;
 private int hour = 0;

 Time(int hour,int minute){
	this.minute = minute;
	this.hour = hour;
 }

 int getHour(){ 
	return hour;
 }

 int getMinute(){
	return minute;
 }

}