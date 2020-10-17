package model;
public class Pilot
{
    // Atributes
    private String name;
    private int age;
    private int[] scores;
    // Relationships
    private Team team;
    // Methods
    public Pilot(String name, int age, Team team, int[] size)
    {   
        this.name = name;
        this.age = age;
        this.team = team;
		scores = size;
    }
    //Getters and setters
    public Team getTeam(){
        return team;
    }
    public void setTeam(Team team){
        this.team = team;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int[] getScores() {
		return scores;
	}
	public void setScores(int[] scores) {
		this.scores = scores;
    }
    /** calcuteAverage
}	* Method to calculate the average time of pilots. <br>
	* @return String with its message
	*/
    public String calculateAverage(){
        int hours=0;
        int minutes=0;
        int seconds=0;
        double scoresFinal=0;
        int index=scores.length;
        int sum=0;
        for(int i=0; i<index; i++){
            sum+=scores[i];
        }
        scoresFinal=sum/index;
        seconds=(int)scoresFinal % 60;
        minutes=(int)scoresFinal/60;
        hours=minutes/60;
        minutes=minutes%60;
        return "hours: "+hours+" minutes: "+minutes+ " seconds: "+seconds;
    }
}