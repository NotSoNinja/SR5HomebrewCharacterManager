/**
 * 
 */
package objects.system;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

/**
 * A class to hold the reference files during execution
 * @author Johnathan
 *
 */
public class SR5Archive {
	File saveLoc;
	String name;
	//TODO an array of everything that one could want to save
	public SR5Archive(String name){
		saveLoc = new File(name + ".sra");
		this.name = name;
		//TODO initialize arrays
	}
	
	//TODO getters/setters?  Maybe protected
	
	public boolean writeArchiveToFile(File fi) {
		if(fi == null){
			saveLoc = new File("UnnamedArchive.json");
			fi = saveLoc;
		}
		Gson converter = new Gson();
		String json = converter.toJson(this);
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fi));
			out.write(json, 0, json.length());
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			return true;
		}
		return false;
	}

}
