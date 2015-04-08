package src.objects.gear;

public class Modification {
	String modStat;
	String modName;
	int modStatAmnt;
	int modSize;
	public Modification(String modNameIn, String modStatIn,  int modStatAmntIn,int modSizeIn){
		modStat = modStatIn;
		modName = modNameIn;
		modStatAmnt = modStatAmntIn;
		modSize = modSizeIn;
	}
	public Modification(){
		modStat = "NULL";
		modName = "EYESIGHT";
		modStatAmnt = 0;
		modSize = 0;
	}
	public String getModStat() {
		return modStat;
	}
	public void setModStat(String modStat) {
		this.modStat = modStat;
	}
	public String getModName() {
		return modName;
	}
	public void setModName(String modName) {
		this.modName = modName;
	}
	public int getModStatAmnt() {
		return modStatAmnt;
	}
	public void setModStatAmnt(int modStatAmnt) {
		this.modStatAmnt = modStatAmnt;
	}
	public int getModSize() {
		return modSize;
	}
	public void setModSize(int modSize) {
		this.modSize = modSize;
	}
}
