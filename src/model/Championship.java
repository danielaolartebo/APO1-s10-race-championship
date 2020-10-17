package model;
public class Championship {
	// Constants
	public final static int MAX_PILOTS=15;
	// Atributes
    private int year;
    private int races;
	// Relations
	private Pilot[] pilots;
    // Métodos
	public Championship(int year, int races)
	{
        this.year = year;
        this.races = races;
		pilots=new Pilot[MAX_PILOTS];
    }
    //Getters and setters
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getRaces() {
        return races;
	}
    public void setRaces(int races) {
        this.races = races;
	}
	/** findPilot
	* Method to find a pilot. <br>
	* @param name - pilot's name - pCedula != null
	* @return Pilot if the name exists, null otherwise
	*/
	public boolean findPilot(String name){
	    boolean exit=false;
		boolean findPilots=false;
	    	for(int i=0;i<MAX_PILOTS && exit==false;i++){
	    		if (pilots[i]!=null && pilots[i].getName().equals(name)){
	    			findPilots=true;
				}
	    	}
	    return findPilots;
		}
	/** addPilot
	* Method to add a pilot. <br>
	<b>pre: </b> Pilot's array exists already. list!=null
	* <b>post: </b> Pilot objet has been created in the array. <br>
	* @param name - pilot's name - name != null
	* @param age - pilot's age - age != 0
	* @param team - pilot's team - team != null
	* @param ray - pilot's ray - ray != 0
	* @return String with its message
	*/
	public String addPilot(String name, int age, String team, int[] ray){ 
		Team teamFinal = Team.valueOf(team.toUpperCase());
		boolean findPilots= findPilot(name);
		String message="Pilot has been created successfully";
		boolean exit=false;
		if (findPilots==false){
			for (int i=0;i<MAX_PILOTS && exit==false;i++){
	    		if (pilots[i]== null){
	    			pilots[i] = new Pilot(name, age, teamFinal, ray);
	    			exit=true;
	    		}
	    	}
	    	if (exit==false){
	    		message="Error. There can only be 15 competitors";
			}
		}
		else{
			message="Pilot was added already";
		}
		return message;
	}
	/** showAverageTimes
	* Method to show average times of pilots. <br>
	* @return String with its message
	*/
    public String showAverageTimes(){
		String message="";
		for(int i=0; i<pilots.length; i++){
			if(pilots[i]!=null){
				message+="Pilot's name: "+pilots[i].getName()+", average score: "+ pilots[i].calculateAverage()+"\n";
			}
		}
		return message;
    }
}