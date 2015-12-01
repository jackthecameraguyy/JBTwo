
public class Case {
	//initialize variables
	private int caseNumber;
	private String title;
	private static int totalCases;
	private Plaintiff plaintiff;
	
	//default constructor
	public Case(){
		caseNumber = 0;
		title = "";
		totalCases++;
	}
	
	/**	 
	 * @param caseNum
	 */
	public void setCaseNum(int caseNum){
		caseNumber = caseNum;
	}
	
   public void createPlaintiff(String name, String phone, String email) {
      plaintiff = new Plaintiff(name, phone, email);
   }
   	/**
	 * 
	 * @param title
	 */
	public void setTitle(String title){
		this.title = title;
	}
	
	/**
	 * 
	 * @param name
	 * @param phone
	 * @param email
	 */
	public void setPlaintiff(String name, String phone, String email ){
		
		plaintiff = new Plaintiff(name, phone, email);
		
	}
	
	//get casenumber
	public int getCaseNum(){
		return caseNumber;
	}
	//get title
	public String getTitle(){
		return title;
	}
	
	/**
	 * returns the total amount of cases
	 * @return
	 */
	public static int getTotalCases() {
		return totalCases;
	}
	
	public Plaintiff getPlaintiff(){
		return plaintiff;
	}
	
	public String toString(){
		return "Case Number:" + caseNumber + " Title: " + title ;
	}
	
	
	
	
}
