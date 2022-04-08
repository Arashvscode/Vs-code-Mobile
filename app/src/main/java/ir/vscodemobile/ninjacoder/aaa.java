package ir.vscodemobile.ninjacoder
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.app.AlertDialog;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;

public class Main extends AppCompatActivity{
	
	private Toolbar _tool;
	private AlertDialog.Builder alter;
	public static void main(String[] args){
		System.out.println("Hello word");
		 _aa("Mr vafa","");
		}
		 
		
		
	      public static void _aa(String _Zer , final String _ber){
			   System.out.println("Hello word "+_ber + _Zer);
			   
			  }
			  
	public static boolean aa(){

		for(int po = 0; po < (int)(0); po++){
			return false;
			if(!getApplicationContext().getPackageName().equals("ir.vscodemoblie.ninjacoder")){
				
				showMassges("Error");
			
		}else{
			  Toast.makeText(getApplicationContext(), "Not found", Toast.LENGTH_SHORT).show();
			
		}
	}
}
} 