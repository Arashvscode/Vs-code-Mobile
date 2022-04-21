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
import com.lwb.piechart.*;
import com.jtv7.rippleswitchlib.*;
import com.rohitop.rlottie.*;
import s4u.restore.swb.*;
import mrAr.Stop.notmeDicompile.*;
import androidx.webkit.*;
import com.android.tools.r8.*;
import xyz.ninjacoder.edittext.Animator.main.*;
import org.antlr.v4.runtime.*;
import com.caverock.androidsvg.*;
import com.blogspot.atifsoftwares.animatoolib.*;
import ninja.toska.path.*;
import com.oguzdev.circularfloatingactionmenu.library.*;
import com.googlecode.d2j.*;
import com.android.*;
import io.github.rosemoe.sora.langs.textmate.*;
import net.lingala.zip4j.*;
import io.github.rosemoe.sora.langs.base.*;
import org.jetbrains.kotlin.*;
import com.example.myapp.*;
import com.github.underscore.lodash.*;
import com.suke.widget.*;
import com.google.gson.*;
import com.google.android.material.*;
import com.github.angads25.filepicker.*;
import io.github.rosemoe.sora.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;

public class FontActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private String getpath = "";
	
	private LinearLayout linear1;
	private TextView textview2;
	private TextView textview1;
	private TextView textview3;
	private TextView textview10;
	private TextView textview4;
	private TextView textview5;
	private TextView textview6;
	private TextView textview7;
	private TextView textview8;
	private TextView textview9;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.font);
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
		linear1 = findViewById(R.id.linear1);
		textview2 = findViewById(R.id.textview2);
		textview1 = findViewById(R.id.textview1);
		textview3 = findViewById(R.id.textview3);
		textview10 = findViewById(R.id.textview10);
		textview4 = findViewById(R.id.textview4);
		textview5 = findViewById(R.id.textview5);
		textview6 = findViewById(R.id.textview6);
		textview7 = findViewById(R.id.textview7);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
	}
	
	private void initializeLogic() {
		setTitle(getIntent().getStringExtra("title"));
		getpath = getIntent().getStringExtra("key");
		textview1.setTypeface(Typeface.createFromFile(getpath));
		textview2.setTypeface(Typeface.createFromFile(getpath));
		textview3.setTypeface(Typeface.createFromFile(getpath));
		textview4.setTypeface(Typeface.createFromFile(getpath));
		textview5.setTypeface(Typeface.createFromFile(getpath));
		textview6.setTypeface(Typeface.createFromFile(getpath));
		textview7.setTypeface(Typeface.createFromFile(getpath));
		textview8.setTypeface(Typeface.createFromFile(getpath));
		textview9.setTypeface(Typeface.createFromFile(getpath));
		textview10.setTypeface(Typeface.createFromFile(getpath));
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) { 
				   Window ninjacoder = this.getWindow();
			 ninjacoder.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			 ninjacoder.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			
				   ninjacoder.setStatusBarColor(Color.parseColor("#FF000027")); ninjacoder.setNavigationBarColor(Color.parseColor("#FF000027"));
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