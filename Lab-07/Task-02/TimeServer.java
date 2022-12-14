interface TimeServer{
	void setTime(int hour,int min);
	
	void setDate(int day,int mon,int year);

	void setDateAndTime(int hour,int min,int day,int mon,int year);

	String getLocalDateTime();

}