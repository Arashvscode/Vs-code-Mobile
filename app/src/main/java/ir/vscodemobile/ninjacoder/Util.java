package ir.vscodemobile.ninjacoder;

import android.content.SharedPreferences;

import java.util.Collection;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

public class Util {
    public static boolean isPrimitive(String text) {
		if(text.equals("byte") | text.equals("int") | text.equals("long") | text.equals("short") | text.equals("float") | text.equals("double") | text.equals("char") | text.equals("boolean") | text.equals("void")) {return true;} else {return false;}
	}
	
	public static ArrayList<String> sharedPreferencesToArrayList(SharedPreferences sharedData) {
		ArrayList<String> list = new ArrayList();
		
		for(String text : (Collection<String>)sharedData.getAll().values()) {
			list.add(text);
		}
		return list;
	}
	
	public static ArrayList<String> readJSON(String path) throws IOException {
		if(new File(path).exists()) {
			ArrayList<String> data = new ArrayList<>();
			String text = FileUtil.readFile(path);
			
		    try {
				JSONArray _JSONObject = new JSONArray(text);
			    for(int i = 0; i < _JSONObject.length(); i++) {
					data.add(_JSONObject.get(i).toString());
				}
				return data;
		    }catch(JSONException e) {
				throw new IOException("");
		    }
		}else {
			throw new IOException("");
		}
	}
}
