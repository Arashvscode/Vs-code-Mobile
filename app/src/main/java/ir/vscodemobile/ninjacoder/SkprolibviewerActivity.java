package ir.vscodemobile.ninjacoder;

import android.Manifest;
import android.animation.*;
import android.app.*;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
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
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
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

public class SkprolibviewerActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private String libraryused = "";
	
	private ArrayList<HashMap<String, Object>> lis = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear5;
	private EditText edittext1;
	private ScrollView vscroll1;
	private LinearLayout linear4;
	private TextView textview1;
	private Button button1;
	
	private AlertDialog.Builder dialogbulider;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.skprolibviewer);
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
		linear5 = findViewById(R.id.linear5);
		edittext1 = findViewById(R.id.edittext1);
		vscroll1 = findViewById(R.id.vscroll1);
		linear4 = findViewById(R.id.linear4);
		textview1 = findViewById(R.id.textview1);
		button1 = findViewById(R.id.button1);
		dialogbulider = new AlertDialog.Builder(this);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				libraryused = "used library ==   ";
				lis = new Gson().fromJson(FileUtil.readFile(FileUtil.getExternalStorageDir().concat("/.sketchware/data/".concat(edittext1.getText().toString().concat("/local_library")))), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
				try { 
					for (int item = 0; item < (int)(lis.size()); item++) {
						libraryused = libraryused.concat("      ".concat(lis.get((int)item).get("name").toString()));
						textview1.setText(libraryused);
					}
				} catch (Exception ninja){
					dialogbulider.setTitle("اشتباهات");
					dialogbulider.setIcon(R.drawable.vs1);
					dialogbulider.setMessage("ممکن است ایدی عددی پروژه را به درستی وارد نکرده باشید یا پروژه کتابخونه ندارد لطفا از اول برسی کنید");
					dialogbulider.setPositiveButton("اوکی", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					dialogbulider.create().show();
				}
			}
		});
	}
	
	private void initializeLogic() {
	}
	
	@Override
	public void onStart() {
		super.onStart();
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
				Window w =this.getWindow();
				w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF616161".replace("0xFF" , "#")));
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