package ir.vscodemobile.ninjacoder;

import android.Manifest;
import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.pm.PackageManager;
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
import com.google.android.material.*;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.*;
import com.google.android.material.textfield.*;
import com.google.gson.*;
import com.googlecode.d2j.*;
import com.jtv7.rippleswitchlib.*;
import com.lwb.piechart.*;
import com.oguzdev.circularfloatingactionmenu.library.*;
import com.rohitop.rlottie.*;
import com.suke.widget.*;
import coyamo.visualxml.*;
import io.github.rosemoe.sora.*;
import io.github.rosemoe.sora.langs.base.*;
import io.github.rosemoe.sora.langs.textmate.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import mrAr.Stop.notmeDicompile.*;
import net.lingala.zip4j.*;
import ninja.toska.path.*;
import org.antlr.v4.runtime.*;
import org.jetbrains.kotlin.*;
import org.json.*;
import s4u.restore.swb.*;
import xyz.ninjacoder.edittext.Animator.main.*;
import com.bobur.keysore.creator.*;

public class KeystoneActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private String app_directory = "";
	private String alias = "";
	private String keyPassword = "";
	private String storePassword = "";
	private String commonName = "";
	private String OrganizationUnit = "";
	private String OrganizationName = "";
	private String stateName = "";
	private String CountryCode = "";
	private String city = "";
	private double expire = 0;
	private String save = "";
	
	private LinearLayout nav;
	private ScrollView vscroll;
	private LinearLayout linear2;
	private TextView textview1;
	private TextView textview4;
	private TextInputLayout textinputlayout1;
	private TextInputLayout textinputlayout2;
	private TextInputLayout textinputlayout3;
	private TextView textview3;
	private TextInputLayout textinputlayout4;
	private TextInputLayout textinputlayout5;
	private TextInputLayout textinputlayout6;
	private TextInputLayout textinputlayout7;
	private TextInputLayout textinputlayout8;
	private TextInputLayout textinputlayout9;
	private MaterialButton create;
	private EditText edittext_alias;
	private EditText edittext_password;
	private EditText edittext_validity;
	private EditText edittext_name;
	private EditText edittext_orgunit;
	private EditText edittext_org;
	private EditText edittext_city;
	private EditText edittext_state;
	private EditText edittext_country;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.keystone);
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
		nav = findViewById(R.id.nav);
		vscroll = findViewById(R.id.vscroll);
		linear2 = findViewById(R.id.linear2);
		textview1 = findViewById(R.id.textview1);
		textview4 = findViewById(R.id.textview4);
		textinputlayout1 = findViewById(R.id.textinputlayout1);
		textinputlayout2 = findViewById(R.id.textinputlayout2);
		textinputlayout3 = findViewById(R.id.textinputlayout3);
		textview3 = findViewById(R.id.textview3);
		textinputlayout4 = findViewById(R.id.textinputlayout4);
		textinputlayout5 = findViewById(R.id.textinputlayout5);
		textinputlayout6 = findViewById(R.id.textinputlayout6);
		textinputlayout7 = findViewById(R.id.textinputlayout7);
		textinputlayout8 = findViewById(R.id.textinputlayout8);
		textinputlayout9 = findViewById(R.id.textinputlayout9);
		create = findViewById(R.id.create);
		edittext_alias = findViewById(R.id.edittext_alias);
		edittext_password = findViewById(R.id.edittext_password);
		edittext_validity = findViewById(R.id.edittext_validity);
		edittext_name = findViewById(R.id.edittext_name);
		edittext_orgunit = findViewById(R.id.edittext_orgunit);
		edittext_org = findViewById(R.id.edittext_org);
		edittext_city = findViewById(R.id.edittext_city);
		edittext_state = findViewById(R.id.edittext_state);
		edittext_country = findViewById(R.id.edittext_country);
		
		create.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext_alias.getText().toString().equals("") || (edittext_password.getText().toString().equals("") || (edittext_validity.getText().toString().equals("") || (edittext_name.getText().toString().equals("") || (edittext_orgunit.getText().toString().equals("") || (edittext_org.getText().toString().equals("") || (edittext_city.getText().toString().equals("") || (edittext_state.getText().toString().equals("") || edittext_country.getText().toString().equals(""))))))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "تمامی فیلد ها رو پر کنید");
				}
				else {
					try {
						alias = edittext_alias.getText().toString();
						keyPassword = edittext_password.getText().toString();
						storePassword = edittext_password.getText().toString();
						commonName = edittext_name.getText().toString();
						OrganizationUnit = edittext_orgunit.getText().toString();
						OrganizationName = edittext_org.getText().toString();
						stateName = edittext_state.getText().toString();
						CountryCode = edittext_country.getText().toString();
						city = edittext_city.getText().toString();
						expire = Double.parseDouble(edittext_validity.getText().toString());
						save = app_directory.concat("keyvscode.jks");
						KeyStoreHelper.Builder builder = new KeyStoreHelper.Builder();
						        builder.setAlias(alias);
						        builder.setKeyPassword(keyPassword);
						        builder.setStorePassword(storePassword);
						        builder.setCommonName(commonName);
						        builder.setOrganizationName(OrganizationName);
						        builder.setOrganizationUnit(OrganizationUnit);
						        builder.setStateName(stateName);
						        builder.setValidityYears((int)expire);
						        builder.setCityOrLocalityName(city);
						        builder.setCountryCode(CountryCode);
						        builder.setStoreType(KeyStoreHelper.Type.JKS);
						        builder.setKeySize(KeyStoreHelper.Size.S_1024);
						        builder.setSigAlgorithm(KeyStoreHelper.SigAlgorithm.SHA1WITHRSA);
						        builder.setKeyAlgorithm(KeyStoreHelper.Algorithm.RSA);
						        builder.setOutputFile(new java.io.File(save));
						        try {
							            KeyStoreHelper.generate(builder);
							        } catch (Exception e) {
							            Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_LONG).show();
							        }
						if (FileUtil.isExistFile(save)) {
							SketchwareUtil.showMessage(getApplicationContext(), "Success - ".concat(save.replace(FileUtil.getExternalStorageDir(), "")));
						}
					} catch (Exception e) {
						SketchwareUtil.showMessage(getApplicationContext(), e.toString());
					}
				}
			}
		});
	}
	
	private void initializeLogic() {
		FileUtil.writeFile("dont remove me plz", "write storage permission");
		app_directory = FileUtil.getExternalStorageDir().concat("/vscodemobile/");
		FileUtil.makeDir(FileUtil.getExternalStorageDir().concat("/vscodemobile/"));
		textinputlayout1.setBoxBackgroundColor(0xFFFFFFFF);
		textinputlayout2.setBoxBackgroundColor(0xFFFFFFFF);
		textinputlayout3.setBoxBackgroundColor(0xFFFFFFFF);
		textinputlayout4.setBoxBackgroundColor(0xFFFFFFFF);
		textinputlayout5.setBoxBackgroundColor(0xFFFFFFFF);
		textinputlayout6.setBoxBackgroundColor(0xFFFFFFFF);
		textinputlayout7.setBoxBackgroundColor(0xFFFFFFFF);
		textinputlayout8.setBoxBackgroundColor(0xFFFFFFFF);
		textinputlayout9.setBoxBackgroundColor(0xFFFFFFFF);
		textinputlayout1.setBoxStrokeColor(0xFF00BCD4);
		textinputlayout2.setBoxStrokeColor(0xFF00BCD4);
		textinputlayout3.setBoxStrokeColor(0xFF00BCD4);
		textinputlayout4.setBoxStrokeColor(0xFF00BCD4);
		textinputlayout5.setBoxStrokeColor(0xFF00BCD4);
		textinputlayout6.setBoxStrokeColor(0xFF00BCD4);
		textinputlayout7.setBoxStrokeColor(0xFF00BCD4);
		textinputlayout8.setBoxStrokeColor(0xFF00BCD4);
		textinputlayout9.setBoxStrokeColor(0xFF00BCD4);
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) { 
				   Window ninjacoder = this.getWindow();
			 ninjacoder.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			 ninjacoder.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			
				   ninjacoder.setStatusBarColor(Color.parseColor("#FF000027")); ninjacoder.setNavigationBarColor(Color.parseColor("#FF000027"));
		}
		vscroll.setHorizontalScrollBarEnabled(false);
		vscroll.setVerticalScrollBarEnabled(false);
		vscroll.setOverScrollMode(ListView.OVER_SCROLL_NEVER);
		edittext_validity.setEnabled(false);
	}
	
	
	@Override
	public void onStart() {
		super.onStart();
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/myf.ttf"), 1);
		textview3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/myf.ttf"), 1);
		textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/myf.ttf"), 0);
		create.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/myf.ttf"), 0);
		edittext_alias.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/myf.ttf"), 0);
		edittext_password.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/myf.ttf"), 0);
		edittext_validity.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/myf.ttf"), 0);
		edittext_name.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/myf.ttf"), 0);
		edittext_orgunit.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/myf.ttf"), 0);
		edittext_org.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/myf.ttf"), 0);
		edittext_city.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/myf.ttf"), 0);
		edittext_state.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/myf.ttf"), 0);
		edittext_country.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/myf.ttf"), 0);
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