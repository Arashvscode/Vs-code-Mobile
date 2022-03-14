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
import java.util.ArrayList;
import java.util.HashMap;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.Timer;
import java.util.TimerTask;
import android.view.View;
import android.graphics.Typeface;
import androidx.webkit.*;
import mrAr.Stop.notmeDicompile.*;
import s4u.restore.swb.*;
import com.jtv7.rippleswitchlib.*;
import com.android.tools.r8.*;
import com.lwb.piechart.*;
import net.lingala.zip4j.*;
import io.github.rosemoe.sora.langs.textmate.*;
import io.github.rosemoe.sora.langs.base.*;
import org.antlr.v4.runtime.*;
import com.caverock.androidsvg.*;
import dos.ir.res.*;
import com.googlecode.d2j.*;
import com.android.*;
import io.github.rosemoe.sora.*;
import com.github.angads25.filepicker.*;
import com.google.gson.*;
import com.suke.widget.*;
import javaxml.*;
import com.github.underscore.lodash.*;
import com.example.myapp.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;

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
				bot.setTitle("vs code mobile");
				bot.setIcon(R.drawable.vscode);
				bot.setMessage("vs code moblie\nv 1.0.0\n\nاضافه شدن ادیتور جاوا اسکریپت\nرفع باگ های برنامه\n\nv 1.0.1\nرفع کراش ران کردن جاوا اسکریپت\n\nv 1.0.2\nاضافه شدن کتابخونه گیت هاب دانلودر\nاضافه شدن زبان css\nرفع بهبود کارای \nاضافه شدن کشو\n\nv 1.0.3\nاضافه شدن jar to dex\nکتابخونه گیت هاب دانلودر بدون فیلتر شکن دانلود کنید\nv 1.06\n\nرفع کراش های برنامه\nclass to jar\njar to class \nاجرا کردن  فایل های لاتی\nحالا مانند اسکوچر کتابخونه ها را بارگیری کنید\nبهبود کارای جاوا اسکریپت\n\n\nv 1.0.8\n\nadd Compressed project and any share\nبهبود گرافیک برنامه\nاستایل برنامه عوض شدن باگ های برنامه رفع شدن\nپروگس بار حذف شد زیرا فقط باعث کندی برنامه میشد\nرفع خطای کامپایل کردن جاوا اسکریپت\nاضافه شدن کامپایلر c & c++\nممکن است پایدار نباشد\nاکنون میتونید پروژع های اسکوچری خودتون مشاهده کنید\nو کلی ویژگی دیگر\n \n v 1.0.9\n \n توسعه دهنگان جدید\n اتتخاب رنگ اضافه شد\n رفع خطا و باگ ها\n کلمات کلیدی جدید اضافه شد به html\n کلمات کلیدی زبان دارت کامل شد\n بهبود عمل کرد shell\n \n v 1.1.1\n \n خدمات shell  اپدیت شد\n هم اکنون میتوانید زبان های که این برنامه باهاش توسعه پیدا کرده است مشاهدیده کنید\n رفع خطای ایجاد کلید");
				bot.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				bot.create().show();
			}
		});
	}
	
	private void initializeLogic() {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) { 
				   Window ninjacoder = this.getWindow();
			 ninjacoder.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			 ninjacoder.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			
				   ninjacoder.setStatusBarColor(Color.parseColor("#FF000027")); ninjacoder.setNavigationBarColor(Color.parseColor("#FF000027"));
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "");
			lismapget.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "");
			lismapget.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "");
			lismapget.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("key", "");
			lismapget.add(_item);
		}
		
		listview1.setAdapter(new Listview1Adapter(lismapget));
		((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		bot = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		//com.lwb.piechart.PieChartView
		PieChartView pieChartView = findViewById(R.id.port);
		pieChartView.addItemType(new PieChartView.ItemType("shell", 21, 0xFF4CAF50));
		pieChartView.addItemType(new PieChartView.ItemType("python", 19, 0xFF009688));
		pieChartView.addItemType(new PieChartView.ItemType("java", 60, 0xFFFF9800));
		pieChartView.addItemType(new PieChartView.ItemType("c", 10, 0xFF9C27B0));
		pieChartView.addItemType(new PieChartView.ItemType("c++", 62, 0xFFE91E63));
		pieChartView.addItemType(new PieChartView.ItemType("kotlin", 8, 0xFF673AB7));
		pieChartView.addItemType(new PieChartView.ItemType("ninja", 15, 0xFFFFFFFF));
		pieChartView.addItemType(new PieChartView.ItemType("js", 22, 0xFFFFEB3B));
		pieChartView.setPieCell(5);
		pieChartView.setCell(10);
		pieChartView.setInnerRadius(0.10f);
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
			if (_position == 0) {
				textview1.setText("Ninja coder");
				color.setBackgroundColor(0xFFF44336);
				circleimageview1.setImageResource(R.drawable.ninja);
			}
			if (_position == 1) {
				textview1.setText("Arsh");
				color.setBackgroundColor(0xFF4CAF50);
				circleimageview1.setImageResource(R.drawable.more_1);
			}
			if (_position == 2) {
				circleimageview1.setImageResource(R.drawable.more_2);
				textview1.setText("BlackError");
				color.setBackgroundColor(0xFF3F51B5);
			}
			if (_position == 3) {
				circleimageview1.setImageResource(R.drawable.milad);
				textview1.setText("☆ Milad ☆");
				color.setBackgroundColor(0xFFFFEB3B);
			}
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
			circleimageview1.setOnTouchListener(new View.OnTouchListener() {
				@Override
				public boolean onTouch(View v, MotionEvent event) {
					switch (event.getAction()){
						case MotionEvent.ACTION_DOWN:{
							ObjectAnimator scaleX = new ObjectAnimator();
							scaleX.setTarget(circleimageview1);
							scaleX.setPropertyName("scaleX");
							scaleX.setFloatValues(0.9f);
							scaleX.setDuration((int)5);
							scaleX.start();
							
							ObjectAnimator scaleY = new ObjectAnimator();
							scaleY.setTarget(circleimageview1);
							scaleY.setPropertyName("scaleY");
							scaleY.setFloatValues(0.9f);
							scaleY.setDuration((int)5);
							scaleY.start();
							break;
						}
						case MotionEvent.ACTION_UP:{
							
							ObjectAnimator scaleX = new ObjectAnimator();
							scaleX.setTarget(circleimageview1);
							scaleX.setPropertyName("scaleX");
							scaleX.setFloatValues((float)1);
							scaleX.setDuration((int)5);
							scaleX.start();
							
							ObjectAnimator scaleY = new ObjectAnimator();
							scaleY.setTarget(circleimageview1);
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