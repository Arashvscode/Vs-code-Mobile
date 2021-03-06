package ir.vscodemobile.ninjacoder;

import android.Manifest;
import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.pm.PackageManager;
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
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
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
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
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
import java.util.regex.*;
import mrAr.Stop.notmeDicompile.*;
import net.lingala.zip4j.*;
import ninja.toska.path.*;
import org.antlr.v4.runtime.*;
import org.jetbrains.kotlin.*;
import org.json.*;
import s4u.restore.swb.*;
import xyz.ninjacoder.edittext.Animator.main.*;

public class ProjectskproviewActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private String library = "";
	
	private ArrayList<HashMap<String, Object>> map = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout code;
	private CardView cardview1;
	private ImageView icon;
	private TextView textview2;
	private TextView package_n;
	private TextView textview1;
	private TextView Name;
	private TextView textview3;
	private TextView ver;
	private LinearLayout linear8;
	private ScrollView vscroll1;
	private TextView textview4;
	private TextView library_co;
	private LinearLayout linear9;
	private TextView librarys;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.projectskproview);
		initialize(_savedInstanceState);
		
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE}, 1000);
		} else {
			initializeLogic();
		}
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
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
		linear5 = findViewById(R.id.linear5);
		linear6 = findViewById(R.id.linear6);
		linear7 = findViewById(R.id.linear7);
		code = findViewById(R.id.code);
		cardview1 = findViewById(R.id.cardview1);
		icon = findViewById(R.id.icon);
		textview2 = findViewById(R.id.textview2);
		package_n = findViewById(R.id.package_n);
		textview1 = findViewById(R.id.textview1);
		Name = findViewById(R.id.Name);
		textview3 = findViewById(R.id.textview3);
		ver = findViewById(R.id.ver);
		linear8 = findViewById(R.id.linear8);
		vscroll1 = findViewById(R.id.vscroll1);
		textview4 = findViewById(R.id.textview4);
		library_co = findViewById(R.id.library_co);
		linear9 = findViewById(R.id.linear9);
		librarys = findViewById(R.id.librarys);
	}
	
	private void initializeLogic() {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) { 
				   Window Hsi = this.getWindow();
			 Hsi.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			 Hsi.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			
				   Hsi.setStatusBarColor(Color.parseColor("#FF000027")); Hsi.setNavigationBarColor(Color.parseColor("#FF000027"));
		}
		try{
			cardview1.setCardBackgroundColor(0xFF00003A);
			cardview1.setRadius((float)25);
			cardview1.setCardElevation((float)2);
			linear2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF000027));
			linear2.setElevation((float)25);
			package_n.setText(getIntent().getStringExtra("PACK"));
			Name.setText(getIntent().getStringExtra("NAME"));
			ver.setText(getIntent().getStringExtra("VERSION"));
			icon.setImageBitmap(FileUtil.decodeSampleBitmapFromPath(FileUtil.getExternalStorageDir().concat("/.sketchware/resources/icons/".concat(getIntent().getStringExtra("ID").concat("/icon.png"))), 1024, 1024));
			library = "";
			map = new Gson().fromJson(FileUtil.readFile(FileUtil.getExternalStorageDir().concat("/.sketchware/data/".concat(getIntent().getStringExtra("ID").concat("/local_library")))), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			for (int item = 0; item < (int)(map.size()); item++) {
				library = library.concat("\n".concat(map.get((int)item).get("name").toString()));
				librarys.setText(library);
				library_co.setText(String.valueOf((long)(map.size())));
			}
		}catch(Exception e){
			 
		}
		vscroll1.setHorizontalScrollBarEnabled(false);
		vscroll1.setVerticalScrollBarEnabled(false);
		vscroll1.setOverScrollMode(ListView.OVER_SCROLL_NEVER);
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