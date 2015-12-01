
public class Rejected extends Case {
	
	private String reason;
	private Plaintiff plaintiff;
	
	public Rejected(int id, String title){
		super.setCaseNum(id);
		super.setTitle(title);
		reason="";
	}
   
   public void createPlaintiff(String name, String phone, String email) {
      this.plaintiff = new Plaintiff(name, phone, email);
   }

	
	/**
	 * The default constructor that calls the 
	 * superclass, Case class's default constructor
	 */
	public Rejected(){
		super();
		reason = "";
	}
	
	/**
	 * Method sets the reason & takes in a string variable
	 * @param r
	 */
	public void setReason(String r){
		reason = r;
	}
	
	/**
	 * Method returns the reason of the rejection
	 * @return
	 */
	public String getReason(){
		return reason;
	}
	
	/**
	 * Method returns a formatted string of the rejected reason
	 */
	public String toString(){
		
		return super.toString()+"Reason: " + reason;
	}
}
