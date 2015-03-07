package objects;

public class Contact extends Character {
	int connection, loyalty, favor;
	String desc;
	
	

	public Contact(String namestr, int conn, int loylty, String description) {
		// TODO Auto-generated constructor stub
		super("System", 0);
		name = namestr;
		connection = conn;
		loyalty =loylty;
		favor = 0;
		desc = description;
	}
	
	/**
	 * @return the connection
	 */
	public int getConnection() {
		return connection;
	}

	/**
	 * @param connection the connection to set
	 */
	public void setConnection(int connection) {
		this.connection = connection;
	}

	/**
	 * @return the loyalty
	 */
	public int getLoyalty() {
		return loyalty;
	}

	/**
	 * @param loyalty the loyalty to set
	 */
	public void setLoyalty(int loyalty) {
		this.loyalty = loyalty;
	}

	/**
	 * @return the favor
	 */
	public int getFavor() {
		return favor;
	}

	/**
	 * @param favor the favor to set
	 */
	public void setFavor(int favor) {
		this.favor = favor;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
