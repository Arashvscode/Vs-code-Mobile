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
import com.airbnb.lottie.*;
import android.widget.TextView;
import android.widget.SeekBar;
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

public class LottileplayActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LottieAnimationView lottie1;
	private TextView textview1;
	private SeekBar seekbar1;
	private TextView textview2;
	private SeekBar seekbar2;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.lottileplay);
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
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		linear4 = findViewById(R.id.linear4);
		lottie1 = findViewById(R.id.lottie1);
		textview1 = findViewById(R.id.textview1);
		seekbar1 = findViewById(R.id.seekbar1);
		textview2 = findViewById(R.id.textview2);
		seekbar2 = findViewById(R.id.seekbar2);
		
		seekbar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar _param1, int _param2, boolean _param3) {
				final int _progressValue = _param2;
				lottie1.setSpeed((float)_progressValue);
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar _param1) {
				
			}
			
			@Override
			public void onStopTrackingTouch(SeekBar _param2) {
				
			}
		});
		
		seekbar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar _param1, int _param2, boolean _param3) {
				final int _progressValue = _param2;
				lottie1.setRepeatCount((int)_progressValue);
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar _param1) {
				
			}
			
			@Override
			public void onStopTrackingTouch(SeekBar _param2) {
				
			}
		});
	}
	
	private void initializeLogic() {
		lottie1.setAnimationFromJson(getIntent().getStringExtra("paser"));
		seekbar1.getProgressDrawable().setColorFilter(Color.parseColor("#00FFF1"), PorterDuff.Mode.SRC_IN);
		seekbar2.getProgressDrawable().setColorFilter(Color.parseColor("#00FFF1"), PorterDuff.Mode.SRC_IN);
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