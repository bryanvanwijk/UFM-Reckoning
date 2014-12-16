package nl.joshuaslik.UFMReckoning.backend;
/**
 * @author Bryan van Wijk
 * abstract class for formation
 */
public abstract class Formation {
	
	Goalkeeper goalkeeper;
	
	public Formation(){
		
	}
	
	/**
	 * Set the goalkeeper of the formation
	 * @param goalkeeper
	 */
	public void setGoalkeeper(Goalkeeper goalkeeper){
		this.goalkeeper = goalkeeper;
	}

}
