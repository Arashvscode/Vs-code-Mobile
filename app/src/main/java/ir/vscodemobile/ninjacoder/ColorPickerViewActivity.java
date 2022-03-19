package ir.vscodemobile.ninjacoder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
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
import androidx.cardview.widget.CardView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Button;
import androidx.webkit.*;
import mrAr.Stop.notmeDicompile.*;
import s4u.restore.swb.*;
import com.jtv7.rippleswitchlib.*;
import com.android.tools.r8.*;
import com.lwb.piechart.*;
import net.lingala.zip4j.*;
import io.github.rosemoe.sora.langs.textmate.*;
import io.github.rosemoe.sora.langs.base.*;
import com.github.underscore.lodash.*;
import com.example.myapp.*;
import org.jetbrains.kotlin.*;
import com.suke.widget.*;
import com.google.gson.*;
import com.github.angads25.filepicker.*;
import io.github.rosemoe.sora.*;
import com.android.*;
import com.googlecode.d2j.*;
import org.antlr.v4.runtime.*;
import com.caverock.androidsvg.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;

public class ColorPickerViewActivity extends AppCompatActivity {
	
	private CardView cardview1;
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear5;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private LinearLayout linear14;
	private CardView cardview2;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private TextView textview5;
	private EditText edittext1;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private TextView textview1;
	private SeekBar seekbar1;
	private TextView textview6;
	private TextView textview2;
	private SeekBar seekbar2;
	private TextView textview7;
	private TextView textview3;
	private SeekBar seekbar3;
	private TextView textview8;
	private TextView textview4;
	private SeekBar seekbar4;
	private TextView textview9;
	private Button button1;
	private Button button2;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.color_picker_view);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		cardview1 = findViewById(R.id.cardview1);
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		linear5 = findViewById(R.id.linear5);
		linear3 = findViewById(R.id.linear3);
		linear4 = findViewById(R.id.linear4);
		linear10 = findViewById(R.id.linear10);
		linear11 = findViewById(R.id.linear11);
		linear14 = findViewById(R.id.linear14);
		cardview2 = findViewById(R.id.cardview2);
		linear12 = findViewById(R.id.linear12);
		linear13 = findViewById(R.id.linear13);
		textview5 = findViewById(R.id.textview5);
		edittext1 = findViewById(R.id.edittext1);
		linear6 = findViewById(R.id.linear6);
		linear7 = findViewById(R.id.linear7);
		linear8 = findViewById(R.id.linear8);
		linear9 = findViewById(R.id.linear9);
		textview1 = findViewById(R.id.textview1);
		seekbar1 = findViewById(R.id.seekbar1);
		textview6 = findViewById(R.id.textview6);
		textview2 = findViewById(R.id.textview2);
		seekbar2 = findViewById(R.id.seekbar2);
		textview7 = findViewById(R.id.textview7);
		textview3 = findViewById(R.id.textview3);
		seekbar3 = findViewById(R.id.seekbar3);
		textview8 = findViewById(R.id.textview8);
		textview4 = findViewById(R.id.textview4);
		seekbar4 = findViewById(R.id.seekbar4);
		textview9 = findViewById(R.id.textview9);
		button1 = findViewById(R.id.button1);
		button2 = findViewById(R.id.button2);
	}
	
	private void initializeLogic() {
		fonts(getApplicationContext(),getWindow().getDecorView()); 
	} 
	  private void fonts(final android.content.Context context, final View v) {
		    String fontName = "fonts/myf.ttf";
		 try {
						Typeface 
						typeace = Typeface.createFromAsset(getAssets(), fontName);
						if ((v instanceof ViewGroup)) {
								ViewGroup vg = (ViewGroup) v;
								for (int i = 0;
								i < vg.getChildCount();
								i++) {
										View child = vg.getChildAt(i);
										fonts(context, child);
								}
						}
						else {
								if ((v instanceof TextView)) {
										((TextView) v).setTypeface(typeace);
								}
								else {
										if ((v instanceof EditText )) {
												((EditText) v).setTypeface(typeace);
										}
										else {
												if ((v instanceof Button)) {
														((Button) v).setTypeface(typeace);
												}
										}
								}
						}
				}
				catch(Exception e)
				
				{
						e.printStackTrace();
				};
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}