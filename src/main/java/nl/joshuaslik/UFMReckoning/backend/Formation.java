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
	 * @return old goalkeeper
	 */
	public Goalkeeper setGoalkeeper(Goalkeeper goalkeeper){
		Goalkeeper tmp = this.goalkeeper;
		this.goalkeeper = goalkeeper;
		return tmp;
	}
	

}
