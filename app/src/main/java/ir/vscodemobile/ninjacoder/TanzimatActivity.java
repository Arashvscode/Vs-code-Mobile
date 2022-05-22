package ir.vscodemobile.ninjacoder;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.SharedPreferences;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.webkit.*;
import com.android.*;
import com.android.tools.r8.*;
import com.blogspot.atifsoftwares.animatoolib.*;
import com.caverock.androidsvg.*;
import com.example.myapp.*;
import com.github.angads25.filepicker.*;
import com.github.underscore.lodash.*;
import com.google.android.material.appbar.AppBarLayout;
import com.googlecode.d2j.*;
import com.lwb.piechart.*;
import com.oguzdev.circularfloatingactionmenu.library.*;
import com.rohitop.rlottie.*;
import coyamo.visualxml.*;
import io.github.rosemoe.sora.*;
import io.github.rosemoe.sora.langs.base.*;
import io.github.rosemoe.sora.langs.textmate.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import mrAr.Stop.notmeDicompile.*;
import net.lingala.zip4j.*;
import ninja.toska.path.*;
import org.antlr.v4.runtime.*;
import org.jetbrains.kotlin.*;
import org.json.*;
import s4u.restore.swb.*;
import xyz.ninjacoder.edittext.Animator.main.*;
import com.google.android.material.checkbox.MaterialCheckBox;

public class TanzimatActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private boolean bool = false;
	private boolean webview1 = false;
	private boolean cxd = false;
	private boolean img1 = false;
	private boolean Eimg2 = false;
	private boolean Fimg3 = false;
	private boolean Himg4 = false;
	
	private ScrollView vscroll1;
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
	private MaterialCheckBox switch1;
	private TextView word;
	private MaterialCheckBox switch2;
	private TextView set;
	private MaterialCheckBox switch4;
	private TextView line;
	private MaterialCheckBox switch3;
	private TextView showline;
	private MaterialCheckBox switch5;
	private TextView sysbar;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private MaterialCheckBox switch6;
	private TextView autotext;
	private MaterialCheckBox switch11;
	private TextView textview13;
	private LinearLayout linear11;
	private LinearLayout installweb;
	private TextView textview8;
	private ImageView dowen;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private MaterialCheckBox switch7;
	private TextView webzoomSp;
	private MaterialCheckBox switch8;
	private TextView webjs;
	private MaterialCheckBox switch9;
	private TextView webdrak;
	private LinearLayout linear17;
	private LinearLayout otherhiden;
	private TextView textview12;
	private ImageView imageleft;
	private LinearLayout linear19;
	private MaterialCheckBox switch10;
	private TextView autosavefile;
	
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
	private SharedPreferences t1;
	private SharedPreferences m2;
	private SharedPreferences l1;
	private SharedPreferences Do;
	private TimerTask mtimer;
	private SharedPreferences AL;
	
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
		vscroll1 = findViewById(R.id.vscroll1);
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
		word = findViewById(R.id.word);
		switch2 = findViewById(R.id.switch2);
		set = findViewById(R.id.set);
		switch4 = findViewById(R.id.switch4);
		line = findViewById(R.id.line);
		switch3 = findViewById(R.id.switch3);
		showline = findViewById(R.id.showline);
		switch5 = findViewById(R.id.switch5);
		sysbar = findViewById(R.id.sysbar);
		linear20 = findViewById(R.id.linear20);
		linear21 = findViewById(R.id.linear21);
		switch6 = findViewById(R.id.switch6);
		autotext = findViewById(R.id.autotext);
		switch11 = findViewById(R.id.switch11);
		textview13 = findViewById(R.id.textview13);
		linear11 = findViewById(R.id.linear11);
		installweb = findViewById(R.id.installweb);
		textview8 = findViewById(R.id.textview8);
		dowen = findViewById(R.id.dowen);
		linear13 = findViewById(R.id.linear13);
		linear14 = findViewById(R.id.linear14);
		linear15 = findViewById(R.id.linear15);
		switch7 = findViewById(R.id.switch7);
		webzoomSp = findViewById(R.id.webzoomSp);
		switch8 = findViewById(R.id.switch8);
		webjs = findViewById(R.id.webjs);
		switch9 = findViewById(R.id.switch9);
		webdrak = findViewById(R.id.webdrak);
		linear17 = findViewById(R.id.linear17);
		otherhiden = findViewById(R.id.otherhiden);
		textview12 = findViewById(R.id.textview12);
		imageleft = findViewById(R.id.imageleft);
		linear19 = findViewById(R.id.linear19);
		switch10 = findViewById(R.id.switch10);
		autosavefile = findViewById(R.id.autosavefile);
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
		t1 = getSharedPreferences("t1", Activity.MODE_PRIVATE);
		m2 = getSharedPreferences("m2", Activity.MODE_PRIVATE);
		l1 = getSharedPreferences("l1", Activity.MODE_PRIVATE);
		Do = getSharedPreferences("Do", Activity.MODE_PRIVATE);
		AL = getSharedPreferences("AL", Activity.MODE_PRIVATE);
		
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
					word.setText("Word Wrap on");
				}
				else {
					r1.edit().putString("repu", "dc").commit();
					word.setText("Word Wrap off");
				}
			}
		});
		
		switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					Assin.edit().putString("ok1", "oks").commit();
					set.setText("Set Overscrolll on");
				}
				else {
					Assin.edit().putString("ok1", "nos").commit();
					set.setText("Set Overscrolll off");
				}
			}
		});
		
		switch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					pin.edit().putString("Pin", "true").commit();
					line.setText("Set Overscrolll on");
				}
				else {
					pin.edit().putString("Pin", "false").commit();
					line.setText("Set Overscrolll off");
				}
			}
		});
		
		switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					lin.edit().putString("vi", "true").commit();
					showline.setText("Show line on");
				}
				else {
					lin.edit().putString("vi", "false").commit();
					showline.setText("Show line off");
				}
			}
		});
		
		switch5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					sys.edit().putString("Mpass", "true").commit();
					sysbar.setText("Show symbol bar on");
				}
				else {
					sys.edit().putString("Mpass", "false").commit();
					sysbar.setText("Show symbol bar off");
				}
			}
		});
		
		switch6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					Zb.edit().putString("Over", "true").commit();
					autotext.setText("AutoTextComplete on");
				}
				else {
					Zb.edit().putString("Over", "false").commit();
					autotext.setText("AutoTextComplete off");
				}
			}
		});
		
		switch11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					textview13.setText("Enable notifications on");
					AL.edit().putString("A10", "true").commit();
				}
				else {
					textview13.setText("Enable notifications off");
					AL.edit().putString("A10", "false").commit();
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
					webzoomSp.setText("Web Zoom support on");
				}
				else {
					webjavasce.edit().putString("Qjava", "false").commit();
					webzoomSp.setText("Web Zoom support off");
				}
			}
		});
		
		switch8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					Rjavapath.edit().putString("Xcdm", "true").commit();
					webjs.setText("Web Javascript support on");
				}
				else {
					Rjavapath.edit().putString("Xcdm", "false").commit();
					webjs.setText("Web Javascript support off");
				}
			}
		});
		
		switch9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					Dark.edit().putString("IDark", "true").commit();
					webdrak.setText("Web Dark on");
				}
				else {
					Dark.edit().putString("IDark", "false").commit();
					webdrak.setText("Web Dark off");
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
					autosavefile.setText("Auto Save on");
				}
				else {
					autosave.edit().putString("Va", "false").commit();
					autosavefile.setText("Auto Save off");
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
		try{
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
			if (AL.getString("A10", "").equals("true")) {
				switch11.setChecked(true);
			}
			else {
				switch11.setChecked(false);
			}
		}catch(Exception e){
			 
		}
	}
	
	@Override
	public void onStart() {
		super.onStart();
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
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
				Window w =this.getWindow();
				w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF616161".replace("0xFF" , "#")));
		}
	}
	
	public void _imageGordone(final ImageView _imageview, final boolean _mshow) {
		if (_mshow) {
			mtimer = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							_imageview.setRotation((float)(_imageview.getRotation() + 10));
						}
					});
				}
			};
			_timer.scheduleAtFixedRate(mtimer, (int)(0), (int)(1000));
		}
		else {
			_imageview.setRotation((float)(0));
		}
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