package ir.vscodemobile.ninjacoder;

import android.Manifest;
import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.Editable;
import android.text.TextWatcher;
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
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
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
import java.util.regex.*;
import mrAr.Stop.notmeDicompile.*;
import net.lingala.zip4j.*;
import ninja.toska.path.*;
import org.antlr.v4.runtime.*;
import org.jetbrains.kotlin.*;
import org.json.*;
import s4u.restore.swb.*;
import xyz.ninjacoder.edittext.Animator.main.*;
import java.io.*;
import java.security.*;
import com.github.angads25.filepicker.view.*;
import com.github.angads25.filepicker.model.*;
import com.github.angads25.filepicker.controller.*;
import com.github.angads25.filepicker.utils.*;
import com.github.angads25.filepicker.widget.*;
import com.google.android.material.checkbox.MaterialCheckBox;

public class D8toolsActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private ArrayList<String> args = new ArrayList<>();
	
	private LinearLayout general;
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear4;
	private HorizontalScrollView hscroll1;
	private NinjaEditTextAnimator more_args;
	private Button run;
	private LinearLayout linear7;
	private LinearLayout linear6;
	private LinearLayout linear5;
	private ScrollView vscroll1;
	private TextView textview1;
	private NinjaEditTextAnimator jar;
	private Button btn_select_jar;
	private TextView textview2;
	private NinjaEditTextAnimator output;
	private Button btn_select_output;
	private TextView textview3;
	private NinjaEditTextAnimator anjar;
	private Button btn_select_ajar;
	private LinearLayout linear3;
	private MaterialCheckBox c_release;
	private MaterialCheckBox c_int;
	private MaterialCheckBox c_fileperclass;
	private TextView log;
	private ProgressBar progressbar1;
	private TextView textview4;
	private TextView clear_log;
	private EditText logger;
	
	private SharedPreferences helper;
	private AlertDialog.Builder dialog;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.d8tools);
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
		general = findViewById(R.id.general);
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		linear4 = findViewById(R.id.linear4);
		hscroll1 = findViewById(R.id.hscroll1);
		more_args = findViewById(R.id.more_args);
		run = findViewById(R.id.run);
		linear7 = findViewById(R.id.linear7);
		linear6 = findViewById(R.id.linear6);
		linear5 = findViewById(R.id.linear5);
		vscroll1 = findViewById(R.id.vscroll1);
		textview1 = findViewById(R.id.textview1);
		jar = findViewById(R.id.jar);
		btn_select_jar = findViewById(R.id.btn_select_jar);
		textview2 = findViewById(R.id.textview2);
		output = findViewById(R.id.output);
		btn_select_output = findViewById(R.id.btn_select_output);
		textview3 = findViewById(R.id.textview3);
		anjar = findViewById(R.id.anjar);
		btn_select_ajar = findViewById(R.id.btn_select_ajar);
		linear3 = findViewById(R.id.linear3);
		c_release = findViewById(R.id.c_release);
		c_int = findViewById(R.id.c_int);
		c_fileperclass = findViewById(R.id.c_fileperclass);
		log = findViewById(R.id.log);
		progressbar1 = findViewById(R.id.progressbar1);
		textview4 = findViewById(R.id.textview4);
		clear_log = findViewById(R.id.clear_log);
		logger = findViewById(R.id.logger);
		helper = getSharedPreferences("helper", Activity.MODE_PRIVATE);
		dialog = new AlertDialog.Builder(this);
		
		run.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((anjar.getText().toString().equals("") && output.getText().toString().equals("")) && jar.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "Type Full All Fildet!");
				}
				else {
					new AsyncTask<String, String, String>() {
						@Override
						protected void onPreExecute() {
							log.setText("Running...");
							
							run.setEnabled(false);
							run.setText("Converting to Class.dex wait...");
							progressbar1.setVisibility(View.VISIBLE);
							btn_select_output.setEnabled(false);
							btn_select_output.setEnabled(false);
							btn_select_ajar.setEnabled(false);
							more_args.setEnabled(false);
							jar.setEnabled(false);
						}
						@Override
						protected String doInBackground(String... params) {
							String _param = params[0];
							args.clear();
							if (c_release.isChecked()) {
								args.add(c_release.getText().toString());
							}
							if (c_int.isChecked()) {
								args.add(c_int.getText().toString());
							}
							if (c_fileperclass.isChecked()) {
								args.add(c_fileperclass.getText().toString());
							}
							if (!anjar.getText().toString().equals("")) {
								args.add("--lib");
								args.add(anjar.getText().toString());
							}
							if(!more_args.getText().toString().isEmpty()) {
								     args.addAll(new ArrayList<String>(
								         Arrays.asList(more_args.getText().toString().split(" "))
								     ));
							}
							args.add("--output");
							args.add(output.getText().toString());
							args.add(jar.getText().toString());
							try {
									
										D8.main(args.toArray(new String[0]));
										
							} catch(final Exception e) {
								runOnUiThread(() -> {
										SketchwareUtil.showMessage(getApplicationContext(), e.toString());
								});
							}
							return "";
						}
						@Override
						protected void onPostExecute(String _result) {
							btn_select_output.setEnabled(true);
							btn_select_output.setEnabled(true);
							btn_select_ajar.setEnabled(true);
							more_args.setEnabled(true);
							jar.setEnabled(true);
							log.setText("Done.");
							run.setEnabled(true);
							run.setText("RUN D8");
							progressbar1.setVisibility(View.GONE);
						}
					}.execute("");
				}
			}
		});
		
		btn_select_jar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				DialogProperties properties = new DialogProperties();
				
				properties.selection_mode = DialogConfigs.SINGLE_MODE;
				properties.selection_type = DialogConfigs.FILE_SELECT;
				properties.root = new File(DialogConfigs.DEFAULT_DIR);
				properties.error_dir = new File(DialogConfigs.DEFAULT_DIR);
				properties.offset = new File(DialogConfigs.DEFAULT_DIR);
				properties.extensions = new String[] {"jar"};
				
				FilePickerDialog dialog = new FilePickerDialog(D8toolsActivity.this, properties);
				
				dialog.setTitle("Select a jar file");
				
				dialog.setDialogSelectionListener(files -> {
						jar.setText(files[0]);
				});
				
				dialog.show();
				
			}
		});
		
		logger.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				{
					final ArrayList<colorsSyntax> listSyntax  = new ArrayList<>();
					
					listSyntax.add(new colorsSyntax(Pattern.compile("Warning in"), 0xFFFFEB3B));
					listSyntax.add(new colorsSyntax(Pattern.compile("Error "), 0xFFF44336));
					
					Editable _p = logger.getText();
					
					removeSpan(_p, ForegroundColorSpan.class);
					if (listSyntax != null || listSyntax.size()>0)
					    for (colorsSyntax syntax : listSyntax) {
						      for(Matcher m = syntax.pattern.matcher(_p); m.find();) {
							        _p.setSpan(new ForegroundColorSpan(syntax.color),
							            m.start(),
							            m.end(), 
							            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
							      }
						    }
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
	}
	
	private void initializeLogic() {
		
		
		java.io.OutputStream _os = new java.io.OutputStream() {
				StringBuilder mCache;
				@Override
				public void write(int b) {
						if(mCache == null) mCache = new StringBuilder();
						if(((char) b) == '\n'){
								final String _print = mCache.toString();
														
								runOnUiThread(() -> {
							logger.append("\n");
						logger.append(_print);
						vscroll1.post(() -> {
								vscroll1.fullScroll(ScrollView.FOCUS_DOWN);
						});
					});
													
								mCache = new StringBuilder();
						}else{
								mCache.append((char)b);
						}
				}
		};
		
		System.setOut(new java.io.PrintStream(_os));
		System.setErr(new java.io.PrintStream(_os));
		anjar.setText(helper.getString("ajar", ""));
		run.getBackground().setColorFilter(Color.parseColor("#e91e63"), PorterDuff.Mode.MULTIPLY);
		btn_select_output.setOnClickListener(v->{
				
			
				 DialogProperties properties = new DialogProperties();
			
			properties.selection_mode = DialogConfigs.SINGLE_MODE;
			properties.selection_type = DialogConfigs.DIR_SELECT;
			properties.root = new File(DialogConfigs.DEFAULT_DIR);
			properties.error_dir = new File(DialogConfigs.DEFAULT_DIR);
			properties.offset = new File(DialogConfigs.DEFAULT_DIR);
			
			FilePickerDialog dialog = new FilePickerDialog(D8toolsActivity.this,properties);
			
			dialog.setTitle("Select an output directory");
			
			dialog.setDialogSelectionListener((files) -> {
					output.setText(files[0]);
			});
			    
			dialog.show();
		});
		btn_select_ajar.setOnClickListener(v->{
				
			
				 DialogProperties properties = new DialogProperties();
			
			properties.selection_mode = DialogConfigs.SINGLE_MODE;
			properties.selection_type = DialogConfigs.FILE_SELECT;
			properties.root = new File(DialogConfigs.DEFAULT_DIR);
			properties.error_dir = new File(DialogConfigs.DEFAULT_DIR);
			properties.offset = new File(DialogConfigs.DEFAULT_DIR);
			properties.extensions = new String[] {"jar"};
			
			FilePickerDialog dialog = new FilePickerDialog(D8toolsActivity.this,properties);
			
			dialog.setTitle("Select a jar file");
			
			dialog.setDialogSelectionListener((files) -> {
					anjar.setText(files[0]);
			});
			    
			dialog.show();
		});
		if (android.os.Build.VERSION.SDK_INT >= 21) {
				progressbar1.getIndeterminateDrawable().setColorFilter(Color.parseColor("#FFFF0073"), PorterDuff.Mode.SRC_IN);
		}
		logger.setEnabled(false);
	}
	
	
	@Override
	public void onStop() {
		super.onStop();
		helper.edit().putString("ajar", anjar.getText().toString()).commit();
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
	
	    public void onLowMemory() {
		        super.onLowMemory();
		        dialog.setTitle("Low memory");
		dialog.setIcon(R.drawable.vscode);
		dialog.setMessage("خطا حافظه موبایل شما کم است");
		dialog.setPositiveButton("اوک", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		dialog.create().show();
		        }
	public void _lib() {
	}
	void removeSpan(Editable _param4, Class<? extends CharacterStyle> type) {
		    CharacterStyle[]  spans = _param4.getSpans(0, _param4.length(), type);
		    for (CharacterStyle span : spans) {
			      _param4.removeSpan(span);
			    }
		  } 
	
	  class colorsSyntax {
		    final Pattern pattern;
		    final int color;
		
		     colorsSyntax(Pattern pattern, int color) {
			      this.pattern = pattern;
			      this.color = color;
			    }
		  }
	{
		
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