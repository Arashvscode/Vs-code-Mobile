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
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.app.Activity;
import android.content.SharedPreferences;
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
import androidx.core.content.ContextCompat;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;

public class HtmlActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private LinearLayout linear1;
	private WebView webview1;
	
	private RequestNetwork nre;
	private RequestNetwork.RequestListener _nre_request_listener;
	private SharedPreferences webjavasce;
	private SharedPreferences Rjavapath;
	private SharedPreferences Dark;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.html);
		initialize(_savedInstanceState);
		
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1000);
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
		webview1 = findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		nre = new RequestNetwork(this);
		webjavasce = getSharedPreferences("webjavasce", Activity.MODE_PRIVATE);
		Rjavapath = getSharedPreferences("Rjavapath", Activity.MODE_PRIVATE);
		Dark = getSharedPreferences("Dark", Activity.MODE_PRIVATE);
		
		//no listener code
		
		//no listener code
		
		//webviewOnProgressChanged
		webview1.setWebChromeClient(new WebChromeClient() {
				@Override public void onProgressChanged(WebView view, int _newProgress) {
					
				}
		});
		
		webview1.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				
				super.onPageFinished(_param1, _param2);
			}
		});
		
		_nre_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
	}
	
	private void initializeLogic() {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) { 
				   Window ninjacoder = this.getWindow();
			 ninjacoder.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			 ninjacoder.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			
				   ninjacoder.setStatusBarColor(Color.parseColor("#FF000027")); ninjacoder.setNavigationBarColor(Color.parseColor("#FF000027"));
		}
		
		webview1.loadUrl("file:///".concat(getIntent().getStringExtra("code")));
		setTitle("vs code mobile ".concat("( ".concat(getIntent().getStringExtra("title").concat(" )"))));
		if (webjavasce.getString("Qjava", "").equals("true")) {
			webview1.getSettings().setLoadWithOverviewMode(false);
			webview1.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
			webview1.getSettings().setDisplayZoomControls(false);
			webview1.getSettings().setBuiltInZoomControls(true);
		}
		else {
			if (webjavasce.getString("Qjava", "").equals("false")) {
				webview1.getSettings().setLoadWithOverviewMode(true);
				webview1.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
				webview1.getSettings().setDisplayZoomControls(true);
				webview1.getSettings().setBuiltInZoomControls(false);
			}
			else {
				
			}
		}
		if (Rjavapath.getString("Xcdm", "").equals("true")) {
			webview1.getSettings().setJavaScriptEnabled(true);
		}
		else {
			if (Rjavapath.getString("Xcdm", "").equals("false")) {
				webview1.getSettings().setJavaScriptEnabled(true);
			}
			else {
				
			}
		}
		if (Dark.getString("IDark", "").contains("true")) {
			/////webview drak mod on
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(webview1.getSettings(), WebSettingsCompat.FORCE_DARK_ON);
			////dont edit code ples
			///add library webkit
		}
		else {
			if (Dark.getString("IDark", "").equals("false")) {
				////this code webview dark mod of
				////used library webkit 
				if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
				WebSettingsCompat.setForceDark(webview1.getSettings(), WebSettingsCompat.FORCE_DARK_OFF);
				////the code not work android 4~9
				///used android 10 up ples add block if sdk android 10 up
				////the code by google 
				///add block by ninja coder.ir
				///dont edit code
				////dont used block try
			}
			else {
				
			}
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