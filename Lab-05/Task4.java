class Message{

	private String text = null;

	void setText(String text){
		this.text = text;
	}

	public String toString(){
		return text;
	}
}

class SMS extends Message{

	private String contact = null;

	void setSms(String text,String contact){
		super.setText(text);
		this.contact = contact;
	}

	void setText(String text){
		super.setText(text);
	}

	void setContact(String contact){
		this.contact = contact;
	}
	
	String getText(){
		return super.toString();
	}

	String getContact(){
		return contact;
	}
	
	public String toString(){
		return ("Contact : "+contact +"\nMessage : "+super.toString());
	}

}

class Email extends Message{

	private String sender =  null;
	private String receiver =  null;
	private String subject =  null;

	void setMsg(String msg){
		super.setText(msg);
	}

	void setSender(String sender){
		this.sender = sender;
	}

	void setReceiver(String receiver){
		this.receiver = receiver;
	}

	void setSubject(String sub){
		subject = sub; 
	}

	public String toString(){
		return ("Sender : "+sender+"\nReceiver : "+receiver+"\nSubject : "+subject+"\nMessage : "+super.toString());
	}
}

public class Task4{

 public static boolean containsKeyword(Message obj, String word){
	if(obj.toString().indexOf(word,0)>=0)
		return true;
	else
		return false;

 }

 public static void main(String args[]){

	SMS msg = new SMS();
	msg.setSms("Hey dear! How are you doing? I am going to thetre. Are you with me.","03012345678");
	System.out.println(msg.toString());
	boolean dec = containsKeyword(msg,"you");
	System.out.println("you is in the message ..."+dec);

	System.out.println();

	Email email = new Email();
	email.setMsg("Hey dear! How are you doing? I am going to thetre. Are you with me.");
	email.setSender("Sajan Ali");
	email.setReceiver("Sajjad Ali");
	email.setSubject("Going for refreshment ");
	System.out.println(email.toString());
	dec = containsKeyword(email,"How");
	System.out.println("How is in the mail ..."+dec);
	
 }
}