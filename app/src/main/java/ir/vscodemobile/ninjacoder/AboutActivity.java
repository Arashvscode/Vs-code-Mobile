package ir.vscodemobile.ninjacoder;

import android.animation.*;
import android.app.*;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
import android.content.res.*;
import android.graphics.*;
import android.graphics.Typeface;
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
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
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
import java.util.ArrayList;
import java.util.HashMap;
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

public class AboutActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private ArrayList<HashMap<String, Object>> lismapget = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private PieChartView port;
	private ListView listview1;
	private ImageView imageview1;
	
	private AlertDialog.Builder bot;
	private TimerTask ask;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.about);
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
		port = findViewById(R.id.port);
		listview1 = findViewById(R.id.listview1);
		imageview1 = findViewById(R.id.imageview1);
		bot = new AlertDialog.Builder(this);
		
		//OnTouch
		linear2.setOnTouchListener(new View.OnTouchListener(){
				@Override
				public boolean onTouch(View v, MotionEvent event){
						int ev = event.getAction();
						switch (ev) {
								case MotionEvent.ACTION_DOWN:
								
								 
								
								break;
								case MotionEvent.ACTION_UP:
								
								 
								
								break;
						} return true;
				}
		});
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				final com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog = new com.google.android.material.bottomsheet.BottomSheetDialog(AboutActivity.this);
				
				View bottomSheetView; bottomSheetView = getLayoutInflater().inflate(R.layout.about_btm,null );
				bottomSheetDialog.setContentView(bottomSheetView);
				
				bottomSheetDialog.getWindow().findViewById(R.id.design_bottom_sheet).setBackgroundResource(android.R.color.transparent);
				
				ScrollView ver = (ScrollView) bottomSheetView.findViewById(R.id.ver);
				LinearLayout holder = (LinearLayout) bottomSheetView.findViewById(R.id.holder);
				LinearLayout nub = (LinearLayout) bottomSheetView.findViewById(R.id.nub);
				{
					GradientDrawable SketchUi = new GradientDrawable();
					SketchUi.setColor(0xFF000027);
					SketchUi.setCornerRadius(getDip(12));
					nub.setElevation(getDip(5));
					RippleDrawable SketchUiRD = new RippleDrawable(new ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE0E0E0}), SketchUi, null);
					nub.setBackground(SketchUiRD);
				}
				{
					GradientDrawable SketchUi = new GradientDrawable();
					SketchUi.setColor(0xFF000027);
					SketchUi.setCornerRadius(getDip(12));
					holder.setElevation(getDip(5));
					RippleDrawable SketchUiRD = new RippleDrawable(new ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE0E0E0}), SketchUi, null);
					holder.setBackground(SketchUiRD);
				}
				bottomSheetDialog.show();
			}
		});
	}
	
	private void initializeLogic() {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
				Window w =this.getWindow();
				w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF616161".replace("0xFF" , "#")));
		}
		for(int _repeat49 = 0; _repeat49 < (int)(5); _repeat49++) {
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("key", "");
				lismapget.add(_item);
			}
			
		}
		listview1.setAdapter(new Listview1Adapter(lismapget));
		((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		bot = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		//com.lwb.piechart.PieChartView
		PieChartView pieChartView = findViewById(R.id.port);
		pieChartView.addItemType(new PieChartView.ItemType("shell", 21, 0xFF4CAF50));
		pieChartView.addItemType(new PieChartView.ItemType("python", 44, 0xFF009688));
		pieChartView.addItemType(new PieChartView.ItemType("java", 80, 0xFFFF9800));
		pieChartView.addItemType(new PieChartView.ItemType("c", 10, 0xFF9C27B0));
		pieChartView.addItemType(new PieChartView.ItemType("c++", 88, 0xFFE91E63));
		pieChartView.addItemType(new PieChartView.ItemType("kotlin", 32, 0xFF673AB7));
		pieChartView.addItemType(new PieChartView.ItemType("ninja", 95, 0xFFFFFFFF));
		pieChartView.addItemType(new PieChartView.ItemType("js", 22, 0xFFFFEB3B));
		pieChartView.setPieCell(0);
		pieChartView.setCell(0);
		pieChartView.setInnerRadius(0.0f);
		pieChartView.setBackGroundColor(0xFF000027);
		pieChartView.setTextPadding(5);
		pieChartView.setItemTextSize(26);
	}
	
	public class Listview1Adapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Listview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = getLayoutInflater();
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.dra, null);
			}
			
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final LinearLayout linear4 = _view.findViewById(R.id.linear4);
			final androidx.cardview.widget.CardView cardview2 = _view.findViewById(R.id.cardview2);
			final de.hdodenhof.circleimageview.CircleImageView circleimageview1 = _view.findViewById(R.id.circleimageview1);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final LinearLayout color = _view.findViewById(R.id.color);
			
			circleimageview1.setCircleBackgroundColor(Color.TRANSPARENT);
			circleimageview1.setBorderColor(Color.TRANSPARENT);
			textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/myf.ttf"), 1);
			ask = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							ObjectAnimator a = ObjectAnimator.ofInt(textview1, "textColor" , Color.BLUE , Color.GREEN , Color.WHITE , Color.YELLOW); a.setInterpolator(new LinearInterpolator()); a.setDuration(2000); a.setRepeatCount(ValueAnimator.INFINITE); a.setRepeatMode(ValueAnimator.REVERSE); a.setEvaluator(new ArgbEvaluator()); AnimatorSet t = new AnimatorSet(); t.play(a); t.start();
						}
					});
				}
			};
			_timer.scheduleAtFixedRate(ask, (int)(0), (int)(1000));
			linear1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					linear1.setOnTouchListener(new View.OnTouchListener() {
						@Override
						public boolean onTouch(View v, MotionEvent event) {
							switch (event.getAction()){
								case MotionEvent.ACTION_DOWN:{
									ObjectAnimator scaleX = new ObjectAnimator();
									scaleX.setTarget(linear1);
									scaleX.setPropertyName("scaleX");
									scaleX.setFloatValues(0.9f);
									scaleX.setDuration((int)5);
									scaleX.start();
									
									ObjectAnimator scaleY = new ObjectAnimator();
									scaleY.setTarget(linear1);
									scaleY.setPropertyName("scaleY");
									scaleY.setFloatValues(0.9f);
									scaleY.setDuration((int)5);
									scaleY.start();
									break;
								}
								case MotionEvent.ACTION_UP:{
									
									ObjectAnimator scaleX = new ObjectAnimator();
									scaleX.setTarget(linear1);
									scaleX.setPropertyName("scaleX");
									scaleX.setFloatValues((float)1);
									scaleX.setDuration((int)5);
									scaleX.start();
									
									ObjectAnimator scaleY = new ObjectAnimator();
									scaleY.setTarget(linear1);
									scaleY.setPropertyName("scaleY");
									scaleY.setFloatValues((float)1);
									scaleY.setDuration((int)5);
									scaleY.start();
									
									break;
								}
							}
							return false;
						}
					});
				}
			});
			if (_position == 0) {
				textview1.setText("Ninja coder");
				color.setBackgroundColor(0xFFF44336);
				circleimageview1.setImageResource(R.drawable.ninja);
			}
			if (_position == 1) {
				textview1.setText("Mr A");
				color.setBackgroundColor(0xFFFF5722);
				circleimageview1.setImageResource(R.drawable.more_1);
			}
			if (_position == 2) {
				textview1.setText("Rosemoe");
				color.setBackgroundColor(0xFF9C27B0);
				circleimageview1.setImageResource(R.drawable.milad);
			}
			if (_position == 3) {
				circleimageview1.setImageResource(R.drawable.arman);
				textview1.setText("Arman");
				color.setBackgroundColor(0xFF9C27B0);
			}
			if (_position == 4) {
				circleimageview1.setImageResource(R.drawable.amircoder);
				textview1.setText("Amir");
				color.setBackgroundColor(0xFFFFFFFF);
			}
			if (_position == 5) {
				circleimageview1.setImageResource(R.drawable.hiz);
				textview1.setText("Hisham Dz");
				color.setBackgroundColor(0xFF2196F3);
			}
			
			return _view;
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