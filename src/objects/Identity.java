package objects;

import enums.Lifestyle;

public class Identity {
	String name, licenses;
	Lifestyle stdOfLiving;
	int nuyen;
	
	public Identity(String nameStr, Lifestyle sty, int cash){
		name = nameStr;
		stdOfLiving = sty;
		nuyen = cash;
	}
	
	//TODO getters and setters

}
