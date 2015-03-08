/**
 * 
 */
package test;

import com.google.gson.Gson;

import objects.Vehicle;

/**
 * This class tests whether or not the JSON code works the way I think it does.
 * @author Johnathan
 *
 */
public class JsonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle derp = new Vehicle("Derpcycle", new int[]{0,1,2,3,4,5,6}, 0, 5, false, false, "It's sorta like a bicycle, but derpy.");
		Gson converter = new Gson();
		String json = converter.toJson(derp);
		System.out.println("Next line is JSON");
		System.out.println(json);
		System.out.println("JSON complete");
		Vehicle clone = converter.fromJson(json, derp.getClass());
		System.out.println(clone.getName());
	}

}
