package ir.vscodemobile.ninjacoder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
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
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;
import android.app.Activity;
import android.content.SharedPreferences;
import android.widget.CompoundButton;
import android.view.View;
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
import com.oguzdev.circularfloatingactionmenu.library.*;
import org.antlr.v4.runtime.*;
import com.caverock.androidsvg.*;
import com.blogspot.atifsoftwares.animatoolib.*;
import ninja.toska.path.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import androidx.appcompat.widget.SwitchCompat;

public class TanzimatActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private boolean bool = false;
	private boolean webview1 = false;
	private boolean cxd = false;
	
	private LinearLayout bg;
	private LinearLayout back;
	private LinearLayout linear2;
	private LinearLayout hiden;
	private LinearLayout web;
	private LinearLayout otherSettings;
	private TextView textview1;
	private ImageView imageview1;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear7;
	private LinearLayout linear5;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private SwitchCompat switch1;
	private TextView textview2;
	private SwitchCompat switch2;
	private TextView textview3;
	private SwitchCompat switch4;
	private TextView textview5;
	private SwitchCompat switch3;
	private TextView textview4;
	private SwitchCompat switch5;
	private TextView textview6;
	private SwitchCompat switch6;
	private TextView textview7;
	private LinearLayout linear11;
	private LinearLayout installweb;
	private TextView textview8;
	private ImageView dowen;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private SwitchCompat switch7;
	private TextView textview9;
	private SwitchCompat switch8;
	private TextView textview10;
	private SwitchCompat switch9;
	private TextView textview11;
	private LinearLayout linear17;
	private LinearLayout otherhiden;
	private TextView textview12;
	private ImageView imageleft;
	private LinearLayout linear19;
	private SwitchCompat switch10;
	private TextView textview13;
	
	private SharedPreferences r1;
	private SharedPreferences r2;
	private SharedPreferences Assin;
	private SharedPreferences lin;
	private SharedPreferences pin;
	private SharedPreferences sys;
	private SharedPreferences Zd;
	private SharedPreferences Zb;
	private SharedPreferences webjavasce;
	private SharedPreferences Rjavapath;
	private SharedPreferences Dark;
	private SharedPreferences autosave;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.tanzimat);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		bg = findViewById(R.id.bg);
		back = findViewById(R.id.back);
		linear2 = findViewById(R.id.linear2);
		hiden = findViewById(R.id.hiden);
		web = findViewById(R.id.web);
		otherSettings = findViewById(R.id.otherSettings);
		textview1 = findViewById(R.id.textview1);
		imageview1 = findViewById(R.id.imageview1);
		linear3 = findViewById(R.id.linear3);
		linear4 = findViewById(R.id.linear4);
		linear7 = findViewById(R.id.linear7);
		linear5 = findViewById(R.id.linear5);
		linear8 = findViewById(R.id.linear8);
		linear9 = findViewById(R.id.linear9);
		switch1 = findViewById(R.id.switch1);
		textview2 = findViewById(R.id.textview2);
		switch2 = findViewById(R.id.switch2);
		textview3 = findViewById(R.id.textview3);
		switch4 = findViewById(R.id.switch4);
		textview5 = findViewById(R.id.textview5);
		switch3 = findViewById(R.id.switch3);
		textview4 = findViewById(R.id.textview4);
		switch5 = findViewById(R.id.switch5);
		textview6 = findViewById(R.id.textview6);
		switch6 = findViewById(R.id.switch6);
		textview7 = findViewById(R.id.textview7);
		linear11 = findViewById(R.id.linear11);
		installweb = findViewById(R.id.installweb);
		textview8 = findViewById(R.id.textview8);
		dowen = findViewById(R.id.dowen);
		linear13 = findViewById(R.id.linear13);
		linear14 = findViewById(R.id.linear14);
		linear15 = findViewById(R.id.linear15);
		switch7 = findViewById(R.id.switch7);
		textview9 = findViewById(R.id.textview9);
		switch8 = findViewById(R.id.switch8);
		textview10 = findViewById(R.id.textview10);
		switch9 = findViewById(R.id.switch9);
		textview11 = findViewById(R.id.textview11);
		linear17 = findViewById(R.id.linear17);
		otherhiden = findViewById(R.id.otherhiden);
		textview12 = findViewById(R.id.textview12);
		imageleft = findViewById(R.id.imageleft);
		linear19 = findViewById(R.id.linear19);
		switch10 = findViewById(R.id.switch10);
		textview13 = findViewById(R.id.textview13);
		r1 = getSharedPreferences("r1", Activity.MODE_PRIVATE);
		r2 = getSharedPreferences("r2", Activity.MODE_PRIVATE);
		Assin = getSharedPreferences("Assin", Activity.MODE_PRIVATE);
		lin = getSharedPreferences("lin", Activity.MODE_PRIVATE);
		pin = getSharedPreferences("pin", Activity.MODE_PRIVATE);
		sys = getSharedPreferences("sys", Activity.MODE_PRIVATE);
		Zd = getSharedPreferences("Zd", Activity.MODE_PRIVATE);
		Zb = getSharedPreferences("Zb", Activity.MODE_PRIVATE);
		webjavasce = getSharedPreferences("webjavasce", Activity.MODE_PRIVATE);
		Rjavapath = getSharedPreferences("Rjavapath", Activity.MODE_PRIVATE);
		Dark = getSharedPreferences("Dark", Activity.MODE_PRIVATE);
		autosave = getSharedPreferences("autosave", Activity.MODE_PRIVATE);
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!bool) {
					bool = true;
					hiden.setVisibility(View.VISIBLE);
					imageview1.setImageResource(R.drawable.down);
				}
				else {
					bool = false;
					hiden.setVisibility(View.GONE);
					imageview1.setImageResource(R.drawable.up001);
				}
			}
		});
		
		switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					r1.edit().putString("repu", "cd").commit();
				}
				else {
					r1.edit().putString("repu", "dc").commit();
				}
			}
		});
		
		switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					Assin.edit().putString("ok1", "oks").commit();
				}
				else {
					Assin.edit().putString("ok1", "nos").commit();
				}
			}
		});
		
		switch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					pin.edit().putString("Pin", "true").commit();
				}
				else {
					pin.edit().putString("Pin", "false").commit();
				}
			}
		});
		
		switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					lin.edit().putString("vi", "true").commit();
				}
				else {
					lin.edit().putString("vi", "false").commit();
				}
			}
		});
		
		switch5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					sys.edit().putString("Mpass", "true").commit();
				}
				else {
					sys.edit().putString("Mpass", "false").commit();
				}
			}
		});
		
		switch6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					Zb.edit().putString("Over", "true").commit();
				}
				else {
					Zb.edit().putString("Over", "false").commit();
				}
			}
		});
		
		dowen.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!webview1) {
					webview1 = true;
					installweb.setVisibility(View.VISIBLE);
					dowen.setImageResource(R.drawable.down);
				}
				else {
					webview1 = false;
					installweb.setVisibility(View.GONE);
					dowen.setImageResource(R.drawable.up001);
				}
			}
		});
		
		switch7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					webjavasce.edit().putString("Qjava", "true").commit();
				}
				else {
					webjavasce.edit().putString("Qjava", "false").commit();
				}
			}
		});
		
		switch8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					Rjavapath.edit().putString("Xcdm", "true").commit();
				}
				else {
					Rjavapath.edit().putString("Xcdm", "false").commit();
				}
			}
		});
		
		switch9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					Dark.edit().putString("IDark", "true").commit();
				}
				else {
					Dark.edit().putString("IDark", "false").commit();
				}
			}
		});
		
		imageleft.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!cxd) {
					cxd = true;
					otherhiden.setVisibility(View.VISIBLE);
					imageleft.setImageResource(R.drawable.down);
				}
				else {
					cxd = false;
					otherhiden.setVisibility(View.GONE);
					imageleft.setImageResource(R.drawable.up001);
				}
			}
		});
		
		switch10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					autosave.edit().putString("Va", "true").commit();
				}
				else {
					autosave.edit().putString("Va", "false").commit();
				}
			}
		});
	}
	
	private void initializeLogic() {
		bool = false;
		hiden.setVisibility(View.GONE);
		webview1 = false;
		installweb.setVisibility(View.GONE);
		cxd = false;
		otherhiden.setVisibility(View.GONE);
		if (r1.getString("repu", "").equals("cd")) {
			switch1.setChecked(true);
		}
		else {
			switch1.setChecked(false);
		}
		if (Assin.getString("ok1", "").equals("oks")) {
			switch2.setChecked(true);
		}
		else {
			switch2.setChecked(false);
		}
		if (lin.getString("vi", "").equals("true")) {
			switch3.setChecked(true);
		}
		else {
			switch3.setChecked(false);
		}
		if (pin.getString("Pin", "").equals("true")) {
			switch4.setChecked(true);
		}
		else {
			switch4.setChecked(false);
		}
		if (sys.getString("Mpass", "").equals("true")) {
			switch5.setChecked(true);
		}
		else {
			switch5.setChecked(false);
		}
		if (Zb.getString("Over", "").equals("true")) {
			switch6.setChecked(true);
		}
		else {
			switch6.setChecked(false);
		}
		if (webjavasce.getString("Qjava", "").equals("true")) {
			switch7.setChecked(true);
		}
		else {
			switch7.setChecked(false);
		}
		 if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
				      
			if (Dark.getString("IDark", "").equals("true")) {
				switch9.setChecked(true);
			}
			else {
				switch9.setChecked(false);
			}
					        
				    } else {
				      
				    switch9.setEnabled(false);  
				    }
		if (Rjavapath.getString("Xcdm", "").equals("true")) {
			switch8.setChecked(true);
		}
		else {
			switch8.setChecked(false);
		}
		if (autosave.getString("Va", "").equals("true")) {
			switch10.setChecked(true);
		}
		else {
			switch10.setChecked(false);
		}
	}
	
	@Override
	public void onStart() {
		super.onStart();
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) { 
				   Window ninjacoder = this.getWindow();
			 ninjacoder.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			 ninjacoder.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			
				   ninjacoder.setStatusBarColor(Color.parseColor("#FF000027")); ninjacoder.setNavigationBarColor(Color.parseColor("#FF000027"));
		}
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