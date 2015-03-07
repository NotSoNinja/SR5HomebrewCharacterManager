package objects;

public class Quality {
	String name, desc;
	int karma;
	
	//TODO figure how to attach to skill etc. tests

	public Quality(String namestr, int cost, String description){
		name = namestr;
		karma = cost;
		desc = description;
	}
	
	//TODO getters and setters
	
}
