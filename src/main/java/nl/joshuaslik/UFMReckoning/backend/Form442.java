package nl.joshuaslik.UFMReckoning.backend;

/**
 * @author Bryan van Wijk
 * Formation met 4-4-2
 * where CB is Central Back
 * RB is Right back player
 * LB is Left back player
 * CM is Central midfield player
 * LM is left midfield player
 * RM is right midfield player
 * LW is left wing player
 * RW is right wing player
 */

public class Form442 extends Formation {
		
	private Fieldplayer CB1;
	private Fieldplayer CB2;
	private Fieldplayer RB;
	private Fieldplayer LB;
	private Fieldplayer CM1;
	private Fieldplayer CM2;
	private Fieldplayer LM;
	private Fieldplayer RM;
	private Fieldplayer LW;
	private Fieldplayer RW;
	
	public Form442(){
		
	}
	
	/**
	 * Set the Centralback 1
	 * @param CB1
	 */
	public void setCB1(Fieldplayer CB1){
		this.CB1 = CB1;
	}
	
	/**
	 * Set the Centralback 2
	 * @param CB1
	 */
	public void setCB2(Fieldplayer CB2){
		this.CB1 = CB2;
	}
	
	/**
	 * Set the rightback
	 * @param RB
	 */
	public void setRB(Fieldplayer RB){
		this.RB = RB;
	}
	
	/**
	 * Set the leftback
	 * @param LB
	 */
	public void seLB1(Fieldplayer LB){
		this.LB = LB;
	}
	
	/**
	 * Set the Central midfield 1
	 * @param CM1
	 */
	public void setCM1(Fieldplayer CM1){
		this.CM1 = CM1;
	}
	
	/**
	 * Set the Central midfield 1
	 * @param CM2
	 */
	public void setCM2(Fieldplayer CM2){
		this.CM2 = CM2;
	}
	
	/**
	 * Set the left midfield
	 * @param LM
	 */
	public void setLM(Fieldplayer LM){
		this.LM = LM;
	}
	
	/**
	 * Set the right midfield 
	 * @param RM
	 */
	public void setRM(Fieldplayer RM){
		this.RM = RM;
	}
	
	/**
	 * Set the left Wing
	 * @param LW
	 */
	public void setLW(Fieldplayer LW){
		this.LW = LW;
	}
	
	/**
	 * Set the right Wing
	 * @param RW
	 */
	public void setRW(Fieldplayer RW){
		this.RW = RW;
	}
	
}
