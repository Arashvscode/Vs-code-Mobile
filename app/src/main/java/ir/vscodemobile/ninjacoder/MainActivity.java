package ir.vscodemobile.ninjacoder;

import ir.vscodemobile.ninjacoder.SplashActivity;
import android.Manifest;
import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.*;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.*;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.webkit.*;
import com.android.*;
import com.android.tools.r8.*;
import com.blogspot.atifsoftwares.animatoolib.*;
import com.caverock.androidsvg.*;
import com.example.myapp.*;
import com.github.angads25.filepicker.*;
import com.github.underscore.lodash.*;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.gson.Gson;
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
import io.github.rosemoe.sora.widget.CodeEditor;
import io.github.rosemoe.sora.langs.EmptyLanguage;
import io.github.rosemoe.sora.langs.desc.CDescription;
import io.github.rosemoe.sora.langs.desc.CppDescription;
import io.github.rosemoe.sora.langs.desc.JavaScriptDescription;
import io.github.rosemoe.sora.langs.html.HTMLLanguage;
import io.github.rosemoe.sora.langs.java.JavaLanguage;
import io.github.rosemoe.sora.langs.python.PythonLanguage;
import io.github.rosemoe.sora.langs.universal.UniversalLanguage;
import io.github.rosemoe.sora.widget.schemes.HTMLScheme;
import io.github.rosemoe.sora.widget.schemes.SchemeDarcula;
import io.github.rosemoe.sora.widget.schemes.SchemeEclipse;
import io.github.rosemoe.sora.widget.schemes.SchemeGitHub;
import io.github.rosemoe.sora.widget.schemes.SchemeNotepadXX;
import io.github.rosemoe.sora.widget.schemes.SchemeVS2019;

import io.github.rosemoe.sora.langs.universal.*;

import io.github.rosemoe.sora.langs.desc.GoDescription;
 import io.github.rosemoe.sora.langs.xml.*;
import io.github.rosemoe.sora.langs.desc.KotlinDescription;
import io.github.rosemoe.sora.langs.desc.NINJADescription;
import io.github.rosemoe.sora.langs.desc.ShellDescription;
import io.github.rosemoe.sora.langs.desc.SmaillDescription;
import io.github.rosemoe.sora.langs.desc.PhpDescription;
import io.github.rosemoe.sora.langs.desc.AndroidXmlDescription;
import io.github.rosemoe.sora.langs.xml.XMLLanguage;
import io.github.rosemoe.sora.langs.desc.LuaDescription;
import io.github.rosemoe.sora.langs.desc.DartDescription;
import io.github.rosemoe.sora.langs.desc.FuntomDescription;
import io.github.rosemoe.sora.langs.desc.RubyDescription;
import io.github.rosemoe.sora.langs.desc.PasDescription;
import io.github.rosemoe.sora.langs.desc.CssDescription;
import io.github.rosemoe.sora.langs.desc.sharpDescription;
import ir.vscodemobile.ninjacoder.theme;
import ir.vscodemobile.ninjacoder.htmltheme;
import dalvik.system.*;
import io.github.rosemoe.sora.langs.java.*;
import io.github.rosemoe.sora.langs.python.*;
import com.google.android.material.checkbox.MaterialCheckBox;
import javax.*;
import org.*;
import com.google.android.material.*;
import java.*;
import io.github.rosemoe.sora.widget.EditorAutoCompleteWindow;
import io.github.rosemoe.sora.widget.EditorColorScheme;
import android.widget.AdapterView.*;
import android.text.*;
import com.google.gson.internal.LinkedTreeMap;
import ir.vscodemobile.ninjacoder.Formatter;

public class MainActivity extends AppCompatActivity {
	
	public final int REQ_CD_FILEPICKER = 101;
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private DrawerLayout _drawer;
	private String HEX = "";
	private String currentWord = "";
	private String maincss = "";
	private String htmlb = "";
	private boolean bool01 = false;
	private boolean mm = false;
	private String save_path = "";
	private double mseekbarsort = 0;
	private String mseekbarString = "";
	private String mpath = "";
	private String mpack = "";
	private String mandroidjar = "";
	private boolean mChack = false;
	private boolean mbool = false;
	private String save_tab = "";
	private boolean isbool = false;
	private double num = 0;
	
	private ArrayList<String> opt = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> map_tabs = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> map_tabcode = new ArrayList<>();
	
	private RelativeLayout RelativeLayout;
	private ImageView bak;
	private LinearLayout coding;
	private LinearLayout linear1;
	private LinearLayout ll_tabs;
	private LinearLayout linear12;
	private LinearLayout fmt;
	private RecyclerView recyclerview1;
	private ProgressBar progressbar1;
	private CodeEditor editor;
	private LinearLayout sogole;
	private HorizontalScrollView hscroll1;
	private LinearLayout fixbar;
	private LinearLayout linearbar;
	private LinearLayout linear6;
	private LinearLayout amro;
	private SymbolInputView sysbar;
	private LinearLayout mcolor;
	private ImageView up;
	private LinearLayout linear13;
	private ImageView down;
	private LinearLayout linear14;
	private ImageView left;
	private LinearLayout linear15;
	private ImageView re;
	private LinearLayout linear9;
	private LinearLayout serachbar;
	private ImageView imageview7;
	private EditText search;
	private EditText Replace;
	private LinearLayout linear11;
	private Button btn;
	private LinearLayout _drawer_linear1;
	private RecyclerView _drawer_recyclerview1;
	
	private Intent in = new Intent();
	private Intent js = new Intent();
	private SharedPreferences r1;
	private Intent json = new Intent();
	private SharedPreferences r2;
	private AlertDialog.Builder le;
	private SharedPreferences Assin;
	private SharedPreferences lin;
	private SharedPreferences pin;
	private SharedPreferences sys;
	private SharedPreferences Zb;
	private AlertDialog.Builder alreplce;
	private SharedPreferences autosave;
	private TimerTask rang;
	private TimerTask t;
	private SharedPreferences fb120;
	private SharedPreferences RdImageview1;
	private SharedPreferences Kmaranimage9;
	private SharedPreferences paletImageview3;
	private SharedPreferences mortalkomat;
	private SharedPreferences gow;
	private Intent Filepicker = new Intent(Intent.ACTION_GET_CONTENT);
	private SharedPreferences fb;
	private SharedPreferences noor12;
	private Notification aram;
	private SharedPreferences MsortSeekbar;
	private SharedPreferences mCh;
	private TimerTask mTimerAsk;
	private TimerTask mtimer;
	private ProgressDialog mprogreesbardialog;
	private SharedPreferences AL;
	private SharedPreferences imgAplhe;
	private AlertDialog mdialog;
	private Intent newfile = new Intent();
	private AlertDialog.Builder mdialogFormater;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
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
		_fab = findViewById(R.id._fab);
		
		_drawer = findViewById(R.id._drawer);
		ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(MainActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = findViewById(R.id._nav_view);
		
		RelativeLayout = findViewById(R.id.RelativeLayout);
		bak = findViewById(R.id.bak);
		coding = findViewById(R.id.coding);
		linear1 = findViewById(R.id.linear1);
		ll_tabs = findViewById(R.id.ll_tabs);
		linear12 = findViewById(R.id.linear12);
		fmt = findViewById(R.id.fmt);
		recyclerview1 = findViewById(R.id.recyclerview1);
		progressbar1 = findViewById(R.id.progressbar1);
		editor = findViewById(R.id.editor);
		sogole = findViewById(R.id.sogole);
		hscroll1 = findViewById(R.id.hscroll1);
		fixbar = findViewById(R.id.fixbar);
		linearbar = findViewById(R.id.linearbar);
		linear6 = findViewById(R.id.linear6);
		amro = findViewById(R.id.amro);
		sysbar = findViewById(R.id.sysbar);
		mcolor = findViewById(R.id.mcolor);
		up = findViewById(R.id.up);
		linear13 = findViewById(R.id.linear13);
		down = findViewById(R.id.down);
		linear14 = findViewById(R.id.linear14);
		left = findViewById(R.id.left);
		linear15 = findViewById(R.id.linear15);
		re = findViewById(R.id.re);
		linear9 = findViewById(R.id.linear9);
		serachbar = findViewById(R.id.serachbar);
		imageview7 = findViewById(R.id.imageview7);
		search = findViewById(R.id.search);
		Replace = findViewById(R.id.Replace);
		linear11 = findViewById(R.id.linear11);
		btn = findViewById(R.id.btn);
		_drawer_linear1 = _nav_view.findViewById(R.id.linear1);
		_drawer_recyclerview1 = _nav_view.findViewById(R.id.recyclerview1);
		r1 = getSharedPreferences("r1", Activity.MODE_PRIVATE);
		r2 = getSharedPreferences("r2", Activity.MODE_PRIVATE);
		le = new AlertDialog.Builder(this);
		Assin = getSharedPreferences("Assin", Activity.MODE_PRIVATE);
		lin = getSharedPreferences("lin", Activity.MODE_PRIVATE);
		pin = getSharedPreferences("pin", Activity.MODE_PRIVATE);
		sys = getSharedPreferences("sys", Activity.MODE_PRIVATE);
		Zb = getSharedPreferences("Zb", Activity.MODE_PRIVATE);
		alreplce = new AlertDialog.Builder(this);
		autosave = getSharedPreferences("autosave", Activity.MODE_PRIVATE);
		fb120 = getSharedPreferences("fb120", Activity.MODE_PRIVATE);
		RdImageview1 = getSharedPreferences("maincdmImage10", Activity.MODE_PRIVATE);
		Kmaranimage9 = getSharedPreferences("0kotsc", Activity.MODE_PRIVATE);
		paletImageview3 = getSharedPreferences("30302280", Activity.MODE_PRIVATE);
		mortalkomat = getSharedPreferences("m102829201192", Activity.MODE_PRIVATE);
		gow = getSharedPreferences("gow", Activity.MODE_PRIVATE);
		Filepicker.setType("image/*");
		Filepicker.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
		fb = getSharedPreferences("fb", Activity.MODE_PRIVATE);
		noor12 = getSharedPreferences("1d20", Activity.MODE_PRIVATE);
		MsortSeekbar = getSharedPreferences("MsortSeekbar", Activity.MODE_PRIVATE);
		mCh = getSharedPreferences("mCh", Activity.MODE_PRIVATE);
		AL = getSharedPreferences("AL", Activity.MODE_PRIVATE);
		imgAplhe = getSharedPreferences("img", Activity.MODE_PRIVATE);
		mdialogFormater = new AlertDialog.Builder(this);
		
		up.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				editor.moveSelectionUp();
			}
		});
		
		down.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				editor.moveSelectionDown();
			}
		});
		
		left.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				editor.moveSelectionLeft();
			}
		});
		
		re.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				editor.moveSelectionRight();
			}
		});
		
		imageview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				fixbar.setVisibility(View.GONE);
			}
		});
		
		search.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				editor.getSearcher().search(_charSeq);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (Replace.getVisibility() == View.GONE) {
					Replace.setVisibility(View.VISIBLE);
				}
				else {
					if (Replace.getText().toString().length() > 0) {
						try {
							            editor.getSearcher().replaceAll(Replace.getText().toString());
							        } catch (IllegalStateException e) {
							            e.printStackTrace();
							        }
						fixbar.setVisibility(View.GONE);
					}
				}
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_myfab(true);
				if (getIntent().getStringExtra("key").equals("empty")) {
					
				}
				else {
					FileUtil.writeFile(getIntent().getStringExtra("key"), editor.getText().toString());
					if (AL.getString("A10", "").equals("true")) {
								{
							final Activity activity = MainActivity.this;
									final Context context = activity.getApplicationContext();
									final int notificationId = 18;
									final String channelId = "8";
									final String channelName = "aram";
									
									new androidx.core.app.NotificationCompat.Builder(context, channelId){
											
											
											NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
											Intent intent335 = new Intent();
																	   public void create(){
									
																			   intent335.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP); 
																			   PendingIntent pendingIntent = PendingIntent.getActivity(activity, 0, intent335, 0);
																			   
																			   if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
																					   NotificationChannel mChannel = new NotificationChannel(
																						   channelId, channelName, NotificationManager.IMPORTANCE_HIGH);
																					   notificationManager.createNotificationChannel(mChannel);
																				   }
																		
									
									setSmallIcon(R.drawable.vscode);
									setContentTitle("File saved");
									setContentText("File saved ".concat(getIntent().getStringExtra("key")));
									setOngoing(false);
																			   setAutoCancel(true);
									setPriority(androidx.core.app.NotificationCompat.PRIORITY_DEFAULT);
									notificationManager.notify(notificationId, this.build());
									
																		   }
								
																   }.create();}
								
					}
					else {
						if (AL.getString("A10", "").equals("false")) {
							
						}
						else {
							
						}
					}
				}
				if (editor.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "متن نمیتواند خالی باشد");
					_myfab(false);
				}
				else {
					mtimer = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									_srcruner();
									_myfab(false);
								}
							});
						}
					};
					_timer.schedule(mtimer, (int)(1000));
				}
			}
		});
	}
	
	private void initializeLogic() {
		LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view);  androidx.drawerlayout.widget.DrawerLayout .LayoutParams Qparams = (androidx.drawerlayout.widget.DrawerLayout .LayoutParams)_nav_view.getLayoutParams(); 
		Qparams.width = (int)getDip((int)250); 
		Qparams.height = androidx.drawerlayout.widget.DrawerLayout .LayoutParams.MATCH_PARENT; 
		_nav_view.setLayoutParams(Qparams);
		_nav_view.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(Color.TRANSPARENT));
		
		mdialogFormater = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF424242".replace("0xFF" , "#")));
		}
		mpack = "";
		up.setColorFilter(0xFF00FFFF, PorterDuff.Mode.MULTIPLY);
		down.setColorFilter(0xFF00FFFF, PorterDuff.Mode.MULTIPLY);
		left.setColorFilter(0xFF00FFFF, PorterDuff.Mode.MULTIPLY);
		re.setColorFilter(0xFF00FFFF, PorterDuff.Mode.MULTIPLY);
		imgAplhe.edit().putString("mview", "true").commit();
		_toolbar.setBackgroundColor(0xFF212121);
		LayoutInflater d = LayoutInflater.from(MainActivity.this);
		LinearLayout mninjacoder = (LinearLayout) d.inflate(R.layout.editorlayoutmaster, null, false);
		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams( LinearLayout.LayoutParams.WRAP_CONTENT,  LinearLayout.LayoutParams.WRAP_CONTENT);
		mninjacoder.setLayoutParams(params);
		  
		final LinearLayout bg = mninjacoder.findViewById(R.id.bg);
		final LinearLayout savecolor = mninjacoder.findViewById(R.id.savecolor);
		final ImageView color = mninjacoder.findViewById(R.id.color);
		final ImageView rep = mninjacoder.findViewById(R.id.rep);
		final ImageView save = mninjacoder.findViewById(R.id.save);
		final ImageView undo = mninjacoder.findViewById(R.id.undo);
		final ImageView redo = mninjacoder.findViewById(R.id.redo);
		final ImageView edi = mninjacoder.findViewById(R.id.edi);
		final ImageView del = mninjacoder.findViewById(R.id.del);
		final ImageView format = mninjacoder.findViewById(R.id.format);
		final ImageView link = mninjacoder.findViewById(R.id.link);
		final ImageView blur = mninjacoder.findViewById(R.id.blur);
		final ImageView fb = mninjacoder.findViewById(R.id.fb);
		final ImageView more = mninjacoder.findViewById(R.id.more);
		final HorizontalScrollView hc = mninjacoder.findViewById(R.id.hc);
		final ImageView  add = mninjacoder.findViewById(R.id. add);
		undo.setColorFilter(0xFF00FFFF, PorterDuff.Mode.MULTIPLY);
		redo.setColorFilter(0xFF00FFFF, PorterDuff.Mode.MULTIPLY);
		hc.setHorizontalScrollBarEnabled(false);
		hc.setVerticalScrollBarEnabled(false);
		hc.setOverScrollMode(ListView.OVER_SCROLL_NEVER);
		mbool = false;
		savecolor.setVisibility(View.GONE);
		if (false) {
			
		}
		else {
			
		}
		save.setOnClickListener((view) -> {
			
			       if (getIntent().getStringExtra("key").equals("empty")) {
				
			}
			else {
				FileUtil.writeFile(getIntent().getStringExtra("key"), editor.getText().toString());
				if (AL.getString("A10", "").equals("true")) {
							{
						final Activity activity = MainActivity.this;
								final Context context = activity.getApplicationContext();
								final int notificationId = 18;
								final String channelId = "8";
								final String channelName = "aram";
								
								new androidx.core.app.NotificationCompat.Builder(context, channelId){
										
										
										NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
										Intent intent335 = new Intent();
																   public void create(){
								
																		   intent335.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP); 
																		   PendingIntent pendingIntent = PendingIntent.getActivity(activity, 0, intent335, 0);
																		   
																		   if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
																				   NotificationChannel mChannel = new NotificationChannel(
																					   channelId, channelName, NotificationManager.IMPORTANCE_HIGH);
																				   notificationManager.createNotificationChannel(mChannel);
																			   }
																	
								
								setSmallIcon(R.drawable.vscode);
								setContentTitle("File saved");
								setContentText("File saved ".concat(getIntent().getStringExtra("title")));
								setOngoing(false);
																		   setAutoCancel(true);
								setPriority(androidx.core.app.NotificationCompat.PRIORITY_DEFAULT);
								notificationManager.notify(notificationId, this.build());
								savecolor.setVisibility(View.GONE);
								
																	   }
							
															   }.create();}
							
				}
				else {
					if (AL.getString("A10", "").equals("false")) {
						
					}
					else {
						
					}
				}
			}
			
			
		});
		color.setOnClickListener((view) -> {
			
			       _ColorPickerDialog(HEX);
			
			
		});
		rep.setOnClickListener((view) -> {
			
			       try{
				fixbar.setVisibility(View.VISIBLE);
			}catch(Exception e){
				 
			}
			
			
		});
		undo.setOnClickListener((view) -> {
			
			       editor.undo();
			
			
		});
		redo.setOnClickListener((view) -> {
			
			       editor.redo();
			
			
		});
		edi.setOnClickListener((view) -> {
			
			       if (!mbool) {
				mbool = true;
				edi.setImageResource(R.drawable.eye);
				  {				
										getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);			
										
					          if (android.os.Build.VERSION.SDK_INT <= 10) {
						          			editor.setInputType(InputType.TYPE_NULL);
						          	} else {
						          			getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
						          			try {
							          				Class<CodeEditor> cls = CodeEditor.class;
							          				java.lang.reflect.Method setSoftInputShownOnFocus;
							          				setSoftInputShownOnFocus = cls.getMethod("setShowSoftInputOnFocus", boolean.class);
							          				setSoftInputShownOnFocus.setAccessible(true);
							          				setSoftInputShownOnFocus.invoke(editor, false);
							          		} catch (Exception e) {
							          				e.printStackTrace();
							          		}
						          	}
					             }
			}
			else {
				mbool = false;
				edi.setImageResource(R.drawable.edit);
				  {								getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
					          
					          if (android.os.Build.VERSION.SDK_INT <= 10) {
									editor.setInputType(InputType.TYPE_TEXT_VARIATION_NORMAL);
							} else {
									try {
											Class<CodeEditor> cls = CodeEditor.class;
											java.lang.reflect.Method setSoftInputShownOnFocus;
											setSoftInputShownOnFocus = cls.getMethod("setShowSoftInputOnFocus", boolean.class);
											setSoftInputShownOnFocus.setAccessible(false);
											setSoftInputShownOnFocus.invoke(editor, true);
									} catch (Exception e) {
											e.printStackTrace();
									}
							}
					  }
			}
			
			
		});
		format.setOnClickListener((view) -> {
			
			       mdialogFormater.setTitle("Code Formating ");
			mdialogFormater.setIcon(R.drawable.vs1);
			mdialogFormater.setMessage("Please select one of the following options may not work well for you");
			mdialogFormater.setPositiveButton("java ani mor {}", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					try {
							
							
							editor.setText(format(editor.getText().toString()));
					} catch (Exception ninjacoder) {
							SketchwareUtil.CustomToast(getApplicationContext(), "Error no road Code format", 0xFFFFFFFF, 19, 0xFF3F51B5, 25, SketchwareUtil.TOP);
					}
					
				}
			});
			mdialogFormater.setNegativeButton("xml ani mor <>", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					try{
						editor.setText(Formatter.xmlFormat(editor.getText().toString()));
					}catch(Exception e){
						SketchwareUtil.CustomToast(getApplicationContext(), "Error not format sorry);", 0xFF000000, 19, 0xFFFFFFFF, 15, SketchwareUtil.CENTER);
					}
				}
			});
			mdialogFormater.create().show();
			
			
		});
		link.setOnClickListener((view) -> {
			
			       final LinearLayout lin = new LinearLayout(getApplicationContext()); 
			lin.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.MATCH_PARENT, android.widget.LinearLayout.LayoutParams.MATCH_PARENT));
			lin.setOrientation(LinearLayout.VERTICAL);
			
			
			final Button btn = new Button(getApplicationContext()); 
			btn.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.MATCH_PARENT, android.widget.LinearLayout.LayoutParams.WRAP_CONTENT));
			btn.setTextSize((int)16);
			btn.setTextColor(0xFFFF9800);
			
			{
				android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
				int colors [] = { 0xFF0288D1, 0xFF6DD5ED };
				SketchUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colors);
				SketchUi.setCornerRadius(getDip(11));
				btn.setElevation(getDip(5));
				android.graphics.drawable.RippleDrawable SketchUi_RD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE0E0E0}), SketchUi, null);
				btn.setBackground(SketchUi_RD);
			}
			
			
			lin.setBackgroundColor(0xFF000027);
			lin.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
			lin.setPadding(10,10,10,10);
			if (Locale.getDefault().getDisplayLanguage().equals("العربية")) {
					btn.setText("نسخ الكل");
			}
			else {
					btn.setText("copy all");
			}
			String[] arr = editor.getText().toString().split(" ");
			final StringBuilder build = new StringBuilder();
			
			
			final AlertDialog.Builder bui = new AlertDialog.Builder(MainActivity.this);
			
			final TextView txt = new TextView(getApplicationContext());
			txt.setTextColor(0xFFFF9800);
			txt.setTextIsSelectable(true);
			
			
			txt.setTextSize((float)16);
			
			for (String one : arr) {
					if (one.contains("http")|| one.contains("www")){
							
							build.append(one).append("\n");
							
							
							
					}
					
			}
			
			txt.setText(build.toString().replace("\"", "").replace("\'", "").replace("(", "").replace(")", "").replace("{", "").replace("}", "").replace("[", "").replace("]", ""));
			
			lin.addView(txt);
			
			lin.addView(btn);
			
			bui.setView(lin);
			
			bui.show();
			txt.setGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT);
			txt.setPadding(50,50,8,10);
			btn.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
							try {
									android.content.ClipboardManager clipboard = (android.content.ClipboardManager) getSystemService(CLIPBOARD_SERVICE); 
									ClipData clip = ClipData.newPlainText("label", txt.getText().toString());
									clipboard.setPrimaryClip(clip);
							} catch (Exception e) {
									e.printStackTrace();
							}
							if (Locale.getDefault().getDisplayLanguage().equals("العربية")) {
									SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ");
							}
							else {
									SketchwareUtil.showMessage(getApplicationContext(), "کپی شد");
							}
					}
			});
			
			
		});
		blur.setOnClickListener((view) -> {
			
			       final AlertDialog dialog1 = new AlertDialog.Builder(MainActivity.this).create();
			View inflate = getLayoutInflater().inflate(R.layout.bluer,null); 
			dialog1.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
			dialog1.setView(inflate);
			final androidx.cardview.widget.CardView card = (androidx.cardview.widget.CardView) inflate.findViewById(R.id.card);
			final SeekBar sr = (SeekBar) inflate.findViewById(R.id.sr);
			final LinearLayout mis = (LinearLayout) inflate.findViewById(R.id.mis);
			try{
				mseekbarString = MsortSeekbar.getString("seek", "");
				sr.setProgress((int)Double.parseDouble(mseekbarString));
			}catch(Exception e){
				 
			}
			card.setCardBackgroundColor(0xFF000027);
			card.setRadius((float)25);
			card.setCardElevation((float)1);
			sr.getThumb().setColorFilter(Color.parseColor("#FF0095"), PorterDuff.Mode.SRC_IN);
			sr.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
					@Override
					public void onProgressChanged(SeekBar _param1, int _param2, boolean _param3) {
							final int _progressValue = _param2;
							
							
							
					
						
						
					}
					
					@Override
					public void onStartTrackingTouch(SeekBar _param1) {
							
					}
					
							@Override
							public void onStopTrackingTouch(SeekBar _param2) {
									 
							}
					});
			mis.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
							
						dialog1.dismiss();
					
					}
			});
			dialog1.setCancelable(true);
			dialog1.show();
			
			
		});
		fb.setOnClickListener((view) -> {
			
			       startActivityForResult(Filepicker, REQ_CD_FILEPICKER);
			
			
		});
		del.setOnClickListener((view) -> {
			
			       editor.setText("");
			
			
		});
		more.setOnClickListener((view) -> {
			
			       _popmenu(more);
			
			
		});
		add.setOnClickListener((view) -> {
			
			       newfile.setClass(getApplicationContext(), FilesActivity.class);
			startActivity(newfile);
			
			
		});
		sogole.addView(mninjacoder);
		getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE|WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
		editor.setLineNumberAlign(Paint.Align.CENTER);
		
		
		setTitle(getIntent().getStringExtra("title"));
		setTheme(android.R.style.Theme_Material);
		editor.setTypefaceLineNumber(Typeface.createFromAsset(getAssets(), "myfont.ttf"));
		
		//////editor.setTypefaceSymbolInputView(Typeface.createFromAsset(getAssets(), "myfont.ttf"));
		
		editor.getColorScheme().setColor(EditorColorScheme.CSS_TAG, 0);
		
		editor.getColorScheme().setColor(EditorColorScheme.AUTO_COMP_PANEL_BG,0);
		bool01 = false;
		mm = false;
		fixbar.setVisibility(View.GONE);
		editor.setTypefaceText(Typeface.createFromAsset(getAssets(), "myfont.ttf"));
		SymbolInputView inputView = findViewById(R.id.sysbar);
		
		inputView.bindEditor(editor);
		inputView.addSymbols(new String[]{"->", "{", "}", "(", ")", ",", "|","=","#","!","&","/","%","`","_",";",".", "×", "<",">","\"", "?", "+", "-", "*", "/","<-"},
		new String[]{"\t", "{}", "}", "(", ")", ",", ".", ";", "|","\"", "?", "+", "-", "*", "/"});
		
		hscroll1.setHorizontalScrollBarEnabled(false);
		hscroll1.setVerticalScrollBarEnabled(false);
		hscroll1.setOverScrollMode(ListView.OVER_SCROLL_NEVER);
		//editor.setTextActionMode(CodeEditor.TextActionMode.POPUP_WINDOW);
		//editor.setEdgeEffectColor(Color.RED);
		
		//editor.setPinLineNumber(!editor.isLineNumberPinned());
		//editor.setNonPrintablePaintingFlags(CodeEditor.FLAG_DRAW_WHITESPACE_LEADING | CodeEditor.FLAG_DRAW_LINE_SEPARATOR);
		
		_fab.hide();
		new AsyncTask<String, String, String>() {
			@Override
			protected void onPreExecute() {
				progressbar1.setVisibility(View.VISIBLE);
				if (android.os.Build.VERSION.SDK_INT >= 21) {
						progressbar1.getIndeterminateDrawable().setColorFilter(Color.parseColor("#FFFD0061"), PorterDuff.Mode.SRC_IN);
				}
				recyclerview1.setVisibility(View.GONE);
			}
			@Override
			protected String doInBackground(String... params) {
				String _param = params[0];
				editor.setColorScheme(new theme());
				return "";
			}
			@Override
			protected void onPostExecute(String _result) {
				recyclerview1.setVisibility(View.VISIBLE);
				progressbar1.setVisibility(View.GONE);
				_editortab(Uri.parse(getIntent().getStringExtra("title")).getLastPathSegment(), getIntent().getStringExtra("title"));
			}
		}.execute("");
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =MainActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF424242);
		}
		try{
					setTitle(getIntent().getStringExtra("title"));
			getSupportActionBar().setSubtitle(getIntent().getStringExtra("key"));
			loadFilesTotree("/sdcard/vscodemobile/", _drawer_recyclerview1, "your dir ");
		}catch(Exception ex){
					final AlertDialog.Builder malterDialog = new AlertDialog.Builder(MainActivity.this);
					StringBuffer sb = new StringBuffer(500); 
					StackTraceElement[] st =ex.getStackTrace(); 
					sb.append(ex.getClass().getName() + ": " +ex.getMessage() + "\n"); 
					for (int iii = 0; iii < st.length; iii++) { 
								sb.append("\t at ⟶" + st[iii].toString() + "\n"); 
					}
					
					final LinearLayout lin = new LinearLayout(getApplicationContext());
					
					lin.setPadding(8,8,8,8);
					
					final TextView txt = new TextView(getApplicationContext());
					
					txt.setPadding(8,8,8,8);
					
					txt.setTextIsSelectable(true);
					
					lin.addView(txt);
					
					txt.setText(sb.toString());
					
					
					{
								SpannableString spannableString = new SpannableString(txt.getText().toString());
								Matcher matcher = Pattern.compile("(^(.*)|(?<=:)\\d+)").matcher(txt.getText().toString());
								
								
								
								
								while (matcher.find()) {
											
											
											spannableString.setSpan(new ForegroundColorSpan(0xFFB71C1C), matcher.start(), matcher.end(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
											spannableString.setSpan(new StyleSpan(1), matcher.start(), matcher.end(), 33);
											
								}
								
								
								
								txt.setText(spannableString);
					}
					malterDialog.setView(lin);
					malterDialog.show();
		}
		
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			case REQ_CD_FILEPICKER:
			if (_resultCode == Activity.RESULT_OK) {
				ArrayList<String> _filePath = new ArrayList<>();
				if (_data != null) {
					if (_data.getClipData() != null) {
						for (int _index = 0; _index < _data.getClipData().getItemCount(); _index++) {
							ClipData.Item _item = _data.getClipData().getItemAt(_index);
							_filePath.add(FileUtil.convertUriToFilePath(getApplicationContext(), _item.getUri()));
						}
					}
					else {
						_filePath.add(FileUtil.convertUriToFilePath(getApplicationContext(), _data.getData()));
					}
				}
				try{
					fb.edit().putString("set", _filePath.get((int)(0))).commit();
				}catch(Exception e){
					 
				}
			}
			else {
				
			}
			break;
			default:
			break;
		}
	}
	
	
	@Override
	public void onStart() {
		super.onStart();
		editor.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try { 
					String textSpan = editor.getText().toString();
					    final int selection = editor.getCursor().getLeft();
					    final Pattern pattern = Pattern.compile("(#?)(\\w+)");
					    final Matcher matcher = pattern.matcher(textSpan);
					    int start = 0;
					    int end = 0;
					
					   String currentWordddddddd = "";
					   try { 
							 while (matcher.find()) {
									        start = matcher.start();
									        end = matcher.end();
									        if (start <= selection && selection <= end) {
											            currentWordddddddd = textSpan.substring(start, end).toString();
											            currentWord = currentWordddddddd;
											        }
									    }
					} catch (Exception rr) { 
							rr.printStackTrace();
					}
					if (!currentWord.isEmpty()) {
						if (currentWord.contains("#")) {
							try {
								    
								mcolor.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)55, (int)4, Color.TRANSPARENT, Color.parseColor(currentWord)));
							} catch (IllegalArgumentException iae) {
								    
							}
						}
						else {
							if (currentWord.toLowerCase().contains("0xff")) {
								try {
									    
									currentWord = currentWord.replace("0xff", "#");
									currentWord = currentWord.replace("0xFF", "#");
									mcolor.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)55, (int)6, Color.TRANSPARENT, Color.parseColor(currentWord)));
								} catch (IllegalArgumentException iae) {
									    
								}
							}
							else {
								editor.getSearcher().search(currentWord);
							}
						}
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		_tanzimat();
	}
	private void a(StringBuilder content, int indents) {
			for(int i = 0; i < indents; i++) {
					content.append('\t');
			}
	}
	
	private String format(final String input) {
			StringBuilder bilder = new StringBuilder();
			
			for (String line : editor.getText().toString().split("\n")) {
					String trims = (line + "X").trim();
					trims = trims.substring(0, trims.length() - 1);
					
					bilder.append(trims);
					bilder.append("\n");
			}
			String s = bilder.toString();
			
			try {
					final StringBuilder sb = new StringBuilder(4096);
					final char[] charArray = s.toCharArray();
					final int length = charArray.length;
					int i = 0;
					int n = 0;
					int n2 = 0;
					int n3 = 0;
					int n4 = 0;
					int n5 = 0;
					int n6 = 0;
				while (i < length) {
							final char c = charArray[i];
							int n10 = 0;
							int n11 = 0;
							Label_0094: {
									Label_0082: {
											if (n != 0) {
													if (c == '\n') {
															sb.append(c);
															a(sb, n4);
															n = 0;
													}
													else {
															sb.append(c);
													}
											}
											else if (n2 != 0) {
													if (c == '*') {
															final int n7 = i + 1;
															final char c2 = charArray[n7];
															if (c2 == '/') {
																	sb.append(c);
																	sb.append(c2);
																	n2 = 0;
																	i = n7;
																	break Label_0082;
															}
													}
													sb.append(c);
													if(c=='\n') a(sb, n4);
											}
											else if (n3 != 0) {
													sb.append(c);
													n3 = 0;
											}
											else if (c == '\\') {
													sb.append(c);
													n3 = 1;
											}
											else if (n5 != 0) {
													if (c == '\'') {
															sb.append(c);
															n5 = 0;
													}
													else {
															sb.append(c);
													}
											}
											else if (n6 != 0) {
													if (c == '\"') {
															sb.append(c);
															n6 = 0;
													}
													else {
															sb.append(c);
													}
											}
											else {
													if (c == '/') {
															final int n8 = i + 1;
															final char c3 = charArray[n8];
															if (c3 == '/') {
																	sb.append(c);
																	sb.append(c3);
																	n = 1;
																	i = n8;
																	break Label_0082;
															}
															if (c3 == '*') {
																	sb.append(c);
																	sb.append(c3);
																	n2 = 1;
																	i = n8;
																	break Label_0082;
															}
													}
													if (c != '\n') {
															if (c == '\'') {
																	n5 = 1;
															}
															int n9;
															if (c == '\"') {
																	n9 = 1;
															}
															else {
																	n9 = n6;
															}
															if (c== '{') {
																	++n4;
															}
															n10 = n4;
															if (c == '}') {
																	n10 = --n4;
																	if (sb.charAt(sb.length() - 1) == '\t') {
																			sb.deleteCharAt(sb.length() - 1);
																			n10 = n4;
																	}
															}
															sb.append(c);
															n11 = n9;
															break Label_0094;
													}
													sb.append(c);
													a(sb, n4);
											}
									}
									final int n12 = n6;
									n10 = n4;
									n11 = n12;
							}
							++i;
							final int n13 = n10;
							n6 = n11;
							n4 = n13;
					}
					return sb.toString();
			} catch (Exception e) {
					return input;
			}
	}
	
	{
	}
	
	@Override
	public void onBackPressed() {
		if (_drawer.isDrawerOpen(GravityCompat.START)) {
			_drawer.closeDrawer(GravityCompat.START);
		} else {
			super.onBackPressed();
		}
	}
	public void _ColorPickerDialog(final String _Hex) {
		final AlertDialog ColorPicker = new AlertDialog.Builder(MainActivity.this).create();
		LayoutInflater ColorPickerLI = getLayoutInflater();
		View ColorPickerCV = (View) ColorPickerLI.inflate(R.layout.color_picker_view, null);
		ColorPicker.setView(ColorPickerCV);
		final SeekBar ska = (SeekBar)
		ColorPickerCV.findViewById(R.id.seekbar1);
		
		final SeekBar skr = (SeekBar)
		ColorPickerCV.findViewById(R.id.seekbar2);
		
		final SeekBar skg = (SeekBar)
		ColorPickerCV.findViewById(R.id.seekbar3);
		
		final SeekBar skb = (SeekBar)
		ColorPickerCV.findViewById(R.id.seekbar4);
		
		final TextView a = (TextView)
		ColorPickerCV.findViewById(R.id.textview6);
		
		final TextView r = (TextView)
		ColorPickerCV.findViewById(R.id.textview7);
		
		final TextView g = (TextView)
		ColorPickerCV.findViewById(R.id.textview8);
		
		final TextView b = (TextView)
		ColorPickerCV.findViewById(R.id.textview9);
		
		final Button cancelar = (Button)
		ColorPickerCV.findViewById(R.id.button1);
		
		final Button confirmar = (Button)
		ColorPickerCV.findViewById(R.id.button2);
		
		final LinearLayout cor = (LinearLayout)
		ColorPickerCV.findViewById(R.id.linear12);
		
		final EditText hex = (EditText)
		ColorPickerCV.findViewById(R.id.edittext1);
		InputFilter[] editFiltersHEX = hex.getFilters(); InputFilter[] newFiltersHEX = new InputFilter[editFiltersHEX.length + 1]; System.arraycopy(editFiltersHEX, 0, newFiltersHEX, 0, editFiltersHEX.length); newFiltersHEX[editFiltersHEX.length] = new InputFilter.LengthFilter(8); hex.setFilters(newFiltersHEX);
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			SketchUi.setColor(0xFF424242);SketchUi.setCornerRadius(getDip(19));
			confirmar.setElevation(getDip(1));
			android.graphics.drawable.RippleDrawable SketchUi_RD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE0E0E0}), SketchUi, null);
			confirmar.setBackground(SketchUi_RD);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			SketchUi.setColor(0xFF424242);SketchUi.setCornerRadius(getDip(19));
			cancelar.setElevation(getDip(1));
			android.graphics.drawable.RippleDrawable SketchUi_RD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE0E0E0}), SketchUi, null);
			cancelar.setBackground(SketchUi_RD);
		}
		ska.getProgressDrawable().setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_IN);
		ska.getThumb().setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_IN);
		
		skr.getProgressDrawable().setColorFilter(Color.RED, PorterDuff.Mode.SRC_IN);
		skr.getThumb().setColorFilter(Color.RED, PorterDuff.Mode.SRC_IN);
		
		skg.getProgressDrawable().setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_IN);
		skg.getThumb().setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_IN);
		
		skb.getProgressDrawable().setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN);
		skb.getThumb().setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN);
		try{
				
			hex.setText(_Hex.replace("#", ""));
			
				a.setText(String.valueOf((long)(Double.parseDouble(_Hex.replace("#", "").toLowerCase().substring((int)(1), (int)(2)).replace("a", "10").replace("b", "11").replace("c", "12").replace("d", "13").replace("e", "14").replace("f", "15")) + (Double.parseDouble(_Hex.replace("#", "").toLowerCase().substring((int)(0), (int)(1)).replace("a", "10").replace("b", "11").replace("c", "12").replace("d", "13").replace("e", "14").replace("f", "15")) * 16))));
				
				ska.setProgress((int)Double.parseDouble(a.getText().toString()));
				
				r.setText(String.valueOf((long)(Double.parseDouble(_Hex.replace("#", "").toLowerCase().substring((int)(3), (int)(4)).replace("a", "10").replace("b", "11").replace("c", "12").replace("d", "13").replace("e", "14").replace("f", "15")) + (Double.parseDouble(_Hex.replace("#", "").toLowerCase().substring((int)(2), (int)(3)).replace("a", "10").replace("b", "11").replace("c", "12").replace("d", "13").replace("e", "14").replace("f", "15")) * 16))));
				
				skr.setProgress((int)Double.parseDouble(r.getText().toString()));
				
				g.setText(String.valueOf((long)(Double.parseDouble(_Hex.replace("#", "").toLowerCase().substring((int)(5), (int)(6)).replace("a", "10").replace("b", "11").replace("c", "12").replace("d", "13").replace("e", "14").replace("f", "15")) + (Double.parseDouble(_Hex.replace("#", "").toLowerCase().substring((int)(4), (int)(5)).replace("a", "10").replace("b", "11").replace("c", "12").replace("d", "13").replace("e", "14").replace("f", "15")) * 16))));
				
				skg.setProgress((int)Double.parseDouble(g.getText().toString()));
				
				b.setText(String.valueOf((long)(Double.parseDouble(_Hex.replace("#", "").toLowerCase().substring((int)(7), (int)(8)).replace("a", "10").replace("b", "11").replace("c", "12").replace("d", "13").replace("e", "14").replace("f", "15")) + (Double.parseDouble(_Hex.replace("#", "").toLowerCase().substring((int)(6), (int)(7)).replace("a", "10").replace("b", "11").replace("c", "12").replace("d", "13").replace("e", "14").replace("f", "15")) * 16))));
				
				skb.setProgress((int)Double.parseDouble(b.getText().toString()));
				
				cor.setBackground(new android.graphics.drawable.ColorDrawable(Color.parseColor(_Hex)));
			
		}catch(Exception e){
				 
		}
		ska.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
						@Override
						public void onProgressChanged (SeekBar _param1, int _param2, boolean _param3) {
								final int _progressValue = _param2;
								
				a.setText(String.valueOf((long)(_progressValue)));
				
				hex.setText("#".concat(String.format("%02X%02X%02X%02X", new Object[]{
					Integer.valueOf((int)ska.getProgress()),
						Integer.valueOf((int)skr.getProgress()), Integer.valueOf((int)skg.getProgress()), Integer.valueOf((int)skb.getProgress())
				})).replace("#", ""));
				
						}
						
						@Override
						public void onStartTrackingTouch(SeekBar _param1) {
								
						}
						
						@Override
						public void onStopTrackingTouch(SeekBar _param2) {
								
						}
				});
		skr.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
						@Override
						public void onProgressChanged (SeekBar _param1, int _param2, boolean _param3) {
								final int _progressValue = _param2;
								
				r.setText(String.valueOf((long)(_progressValue)));
				
				hex.setText("#".concat(String.format("%02X%02X%02X%02X", new Object[]{
					Integer.valueOf((int)ska.getProgress()),
						Integer.valueOf((int)skr.getProgress()), Integer.valueOf((int)skg.getProgress()), Integer.valueOf((int)skb.getProgress())
				})).replace("#", ""));
				
						}
						
						@Override
						public void onStartTrackingTouch(SeekBar _param1) {
								
						}
						
						@Override
						public void onStopTrackingTouch(SeekBar _param2) {
								
						}
				});
		skg.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
						@Override
						public void onProgressChanged (SeekBar _param1, int _param2, boolean _param3) {
								final int _progressValue = _param2;
								
				g.setText(String.valueOf((long)(_progressValue)));
				
				hex.setText("#".concat(String.format("%02X%02X%02X%02X", new Object[]{
					Integer.valueOf((int)ska.getProgress()),
						Integer.valueOf((int)skr.getProgress()), Integer.valueOf((int)skg.getProgress()), Integer.valueOf((int)skb.getProgress())
				})).replace("#", ""));
				
						}
						
						@Override
						public void onStartTrackingTouch(SeekBar _param1) {
								
						}
						
						@Override
						public void onStopTrackingTouch(SeekBar _param2) {
								
						}
				});
		skb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
						@Override
						public void onProgressChanged (SeekBar _param1, int _param2, boolean _param3) {
								final int _progressValue = _param2;
								
				b.setText(String.valueOf((long)(_progressValue)));
				
				hex.setText("#".concat(String.format("%02X%02X%02X%02X", new Object[]{
					Integer.valueOf((int)ska.getProgress()),
						Integer.valueOf((int)skr.getProgress()), Integer.valueOf((int)skg.getProgress()), Integer.valueOf((int)skb.getProgress())
				})).replace("#", ""));
				
						}
						
						@Override
						public void onStartTrackingTouch(SeekBar _param1) {
								
						}
						
						@Override
						public void onStopTrackingTouch(SeekBar _param2) {
								
						}
				});
		hex.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String _charSeq = _param1.toString();
				hex.setSelection(hex.getText().length());
				
							try{
					if (hex.getText().toString().length() == 8) {
						
						a.setText(String.valueOf((long)(Double.parseDouble(_charSeq.replace("#", "").toLowerCase().substring((int)(1), (int)(2)).replace("a", "10").replace("b", "11").replace("c", "12").replace("d", "13").replace("e", "14").replace("f", "15")) + (Double.parseDouble(_charSeq.replace("#", "").toLowerCase().substring((int)(0), (int)(1)).replace("a", "10").replace("b", "11").replace("c", "12").replace("d", "13").replace("e", "14").replace("f", "15")) * 16))));
						
						ska.setProgress((int)Double.parseDouble(a.getText().toString()));
						
						r.setText(String.valueOf((long)(Double.parseDouble(_charSeq.replace("#", "").toLowerCase().substring((int)(3), (int)(4)).replace("a", "10").replace("b", "11").replace("c", "12").replace("d", "13").replace("e", "14").replace("f", "15")) + (Double.parseDouble(_charSeq.replace("#", "").toLowerCase().substring((int)(2), (int)(3)).replace("a", "10").replace("b", "11").replace("c", "12").replace("d", "13").replace("e", "14").replace("f", "15")) * 16))));
						
						skr.setProgress((int)Double.parseDouble(r.getText().toString()));
						
						g.setText(String.valueOf((long)(Double.parseDouble(_charSeq.replace("#", "").toLowerCase().substring((int)(5), (int)(6)).replace("a", "10").replace("b", "11").replace("c", "12").replace("d", "13").replace("e", "14").replace("f", "15")) + (Double.parseDouble(_charSeq.replace("#", "").toLowerCase().substring((int)(4), (int)(5)).replace("a", "10").replace("b", "11").replace("c", "12").replace("d", "13").replace("e", "14").replace("f", "15")) * 16))));
						
						skg.setProgress((int)Double.parseDouble(g.getText().toString()));
						
						b.setText(String.valueOf((long)(Double.parseDouble(_charSeq.replace("#", "").toLowerCase().substring((int)(7), (int)(8)).replace("a", "10").replace("b", "11").replace("c", "12").replace("d", "13").replace("e", "14").replace("f", "15")) + (Double.parseDouble(_charSeq.replace("#", "").toLowerCase().substring((int)(6), (int)(7)).replace("a", "10").replace("b", "11").replace("c", "12").replace("d", "13").replace("e", "14").replace("f", "15")) * 16))));
						
						skb.setProgress((int)Double.parseDouble(b.getText().toString()));
						
						cor.setBackground(new android.graphics.drawable.ColorDrawable(Color.parseColor("#".concat(_charSeq))));
						
					}
					
				}catch(Exception e){
				}
			}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		cancelar.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
								ColorPicker.dismiss();
				}
		});
		
		confirmar.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
								hex.setText("#".concat(String.format("%02X%02X%02X%02X", new Object[]{
								Integer.valueOf((int)ska.getProgress()),
									Integer.valueOf((int)skr.getProgress()), Integer.valueOf((int)skg.getProgress()), Integer.valueOf((int)skb.getProgress())
						})).replace("#", ""));
						
						///_OnColorPicked("#".concat(hex.getText().toString()), Double.parseDouble(a.getText().toString()), Double.parseDouble(r.getText().toString()), Double.parseDouble(g.getText().toString()), Double.parseDouble(b.getText().toString()));
						//((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", Hex));
						
						////SketchwareUtil.showMessage(getApplicationContext(), "Color : ".concat(Hex.concat(" Copyeid!")));
						//((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", "#".concat(hex.getText().toString())));
				//((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", hex.getText().toString()));
				try {
						android.content.ClipboardManager clipboard = (android.content.ClipboardManager) getSystemService(CLIPBOARD_SERVICE); 
						ClipData clip = ClipData.newPlainText("label", "#".concat(hex.getText().toString()));
						clipboard.setPrimaryClip(clip);
				} catch (Exception e) {
						e.printStackTrace();
				}
				
								ColorPicker.dismiss();
				}
		});
		ColorPicker.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
		
		ColorPicker.setCancelable(false);
		
		ColorPicker.show();
	}
	
	
	public void _javaruner() {
		new AsyncTask<String, String, String>() {
			ProgressDialog pr;
			long ecjTime, dxTime;
			@Override
			protected void onPreExecute() {
				pr = new ProgressDialog(MainActivity.this);
				
				pr.getWindow().setBackgroundDrawable(new ColorDrawable(0xFF130F3B));
				pr.setMessage(Html.fromHtml("<font color=\"#59FF7B\">Running...</font>"));
				
				
				pr.setCancelable(false);
				
				pr.show();
			}
			@Override
			protected String doInBackground(String... params) {
				String _param = params[0];
				//code that prepares the files
				FileUtil.deleteFile(FileUtil.getExternalStorageDir().concat("/bin/"));
				FileUtil.makeDir(FileUtil.getExternalStorageDir().concat("/bin/"));
				FileUtil.writeFile(FileUtil.getExternalStorageDir().concat("/bin/Main.java"), editor.getText().toString());
				//code that copies cp.jar from assets to temp folder (if not exists)
				if (!FileUtil.isExistFile(FileUtil.getExternalStorageDir().concat("/bin/android.jar"))) {
					try (InputStream input = getAssets().open("libs/android.jar");
					OutputStream output = new FileOutputStream(
					FileUtil.getExternalStorageDir().concat("/bin/android.jar")
					)) {
								byte[] buffer = new byte[input.available()];
								int length;
								while ((length = input.read(buffer)) != -1) {
											output.write(buffer, 0, length);
								}
								
					} catch (FileNotFoundException e) {
								
					} catch (IOException e) {
								
					}
					
				}
				//code that runs ecj
				long time = System.currentTimeMillis();
				//publishProgress(Html.fromHtml("<font color=\"#59FF7B\">.</font>"));
				
				pr.setMessage(Html.fromHtml("<font color=\"#59FF7B\">Java Compiling...</font>"));
				
				opt.clear();
				opt.add("-1.8");
				opt.add("-nowarn");
				opt.add("-deprecation");
				opt.add("-d");
				opt.add(FileUtil.getExternalStorageDir().concat("/bin/classes"));
				opt.add("-cp");
				opt.add(FileUtil.getExternalStorageDir().concat("/bin/android.jar"));
				opt.add("-proc:none");
				opt.add("-sourcepath");
				opt.add("ignore");
				opt.add(FileUtil.getExternalStorageDir().concat("/bin/Main.java"));
				PrintWriter printWriter = new PrintWriter(new OutputStream() {
							@Override
							public void write(int p1) throws IOException
							{
										//do nothing
							}
				});
				
				final StringBuilder errs = new StringBuilder();
				
				PrintWriter printWriter2 = new PrintWriter(new OutputStream() {
							@Override
							public void write(int p1) throws IOException
							{
										errs.append((char)p1);
							}
				});
				
				org.eclipse.jdt.internal.compiler.batch.Main main = new org.eclipse.jdt.internal.compiler.batch.Main(printWriter2, printWriter2, false, null, null);
				
				main.compile(opt.toArray(new String[0]));
				
				if(main.globalErrorsCount > 0) {
					    return errs.toString();
				}
				ecjTime = System.currentTimeMillis() - time;
				//code that packages classes to a JAR
				////publishProgress(Html.fromHtml("<font color=\"#59FF7B\">...</font>"))
				
				
				pr.setMessage(Html.fromHtml("<font color=\"#59FF7B\">Packaging JAR...</font>"));
				
				try{
					new JarPackager(
					
					FileUtil.getExternalStorageDir().concat("/bin/classes/"),
					
					FileUtil.getExternalStorageDir().concat("/bin/classes.jar")
					
					).create();
				}catch(Exception e){
					return "Packaging JAR failed: " + e.toString();
				}
				//code that runs d8 //dx
				time = System.currentTimeMillis();
				try{
					////////publishProgress(Html.fromHtml("<font color=\"#59FF7B\">...</font>"));
					
					
					pr.setMessage(Html.fromHtml("<font color=\"#59FF7B\">Dexing with D8...</font>"));
					
					/*

*/
					opt.clear();
					opt.add("--output");
					opt.add(FileUtil.getExternalStorageDir().concat("/bin/"));
					opt.add("--lib");
					opt.add(FileUtil.getExternalStorageDir().concat("/bin/android.jar"));
					opt.add(FileUtil.getExternalStorageDir().concat("/bin/classes.jar"));
					D8.main(opt.toArray(new String[0]));
				}catch(Exception e){
					return "Dex failed: " + e.toString();
				}
				dxTime = System.currentTimeMillis() - time;
				return "";
			}
			@Override
			protected void onProgressUpdate(String... values) {
				pr.setMessage(values[0]);
			}
			@Override
			protected void onPostExecute(String _result) {
				pr.dismiss();
				if (TextUtils.isEmpty(_result)) {
					final TextView tx = new TextView(MainActivity.this);
					tx.setLayoutParams(new LinearLayout.LayoutParams(-2,-2));
					tx.setTextSize(15);
					tx.setTextColor(0xFF2196F3);
					tx.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/myf.ttf"), 2);
					//tx.setTextColor(Color.BLACK);
					tx.setPadding(20,20,20,20);
					tx.setTextIsSelectable(true);
					
					final ScrollView sc = new ScrollView(MainActivity.this);
					sc.setLayoutParams(new LinearLayout.LayoutParams(-1,-2));
					sc.addView(tx);
					//final 
					//code that starts listening to system prints
					OutputStream _outstream = new OutputStream() {
						    @Override
						    public void write(int b) {
							         tx.append(String.valueOf((char)b));
							    }
						
						@Override
						public String toString() {
							return tx.getText().toString();
						}
						
					};
					
					System.setOut(new PrintStream(_outstream));
					System.setErr(new PrintStream(_outstream));
					//code that loads the final dex
					try {
						String optimizedDir = getApplicationContext().getDir("odex", MODE_PRIVATE).getAbsolutePath();
						
						DexClassLoader dcl = new DexClassLoader( 
						FileUtil.getExternalStorageDir().concat("/bin/classes.dex")
						, optimizedDir, null, getClassLoader() ); 
						
						Class calledClass = dcl.loadClass("");
						
						java.lang.reflect.Method method = calledClass.getDeclaredMethod("main", String[].class); 
						
						String[] param = {};
						
						Object result = method.invoke(null, new Object[] {param});
					} catch(java.lang.reflect.InvocationTargetException i) {
						dialog("Failed..", "Runtime error: " + i.getCause().toString());
						return;
					} catch(Exception e) {
						dialog("Failed..", "Couldn't execute the dex: " + e.toString() + "\n\nSystem logs:\n" + _outstream.toString() );
						return;
					}
					//code that shows the dialog
					new AlertDialog.Builder(MainActivity.this)
					.setTitle("Output (ecj:" + ecjTime + "ms | d8:" + dxTime + "ms)")
					.setView(sc)
					.setPositiveButton("OK", null)
					.setNegativeButton("Cancel", null)
					.setOnDismissListener(new DialogInterface.OnDismissListener() {
							@Override
							public void onDismiss(DialogInterface dialogInterface) {
									
							}
					})
					.create().show();
					
				}
				else {
					dialog("Failed..", _result);
				}
			}
			public void dialog(String title, String message) {
						AlertDialog.Builder dialog =	new AlertDialog.Builder(MainActivity.this)
						.setTitle(title)
						.setMessage(message)
						.setPositiveButton("OK", null)
						.setNegativeButton("Cancel", null);
						
						AlertDialog dlg = dialog.create();
						dlg.show();
						
						View messageView = dlg.findViewById(android.R.id.message);
						if (messageView instanceof TextView) {
									((TextView) messageView).setTextIsSelectable(true);
						}
			}
		}.execute("");
	}
	
	
	public void _libraryjarpack() {
		
	}
	
	
	public void _tanzimat() {
		if (r1.getString("repu", "").equals("cd")) {
			editor.setWordwrap(true);
		}
		else {
			if (r1.getString("repu", "").equals("dc")) {
				editor.setWordwrap(false);
			}
			else {
				
			}
		}
		if (Assin.getString("ok1", "").equals("oks")) {
			editor.setOverScrollEnabled(true);
		}
		else {
			if (Assin.getString("ok1", "").equals("nos")) {
				editor.setOverScrollEnabled(false);
			}
			else {
				
			}
		}
		if (lin.getString("vi", "").equals("true")) {
			editor.setLineNumberEnabled(true);
		}
		else {
			if (lin.getString("vi", "").equals("false")) {
				editor.setLineNumberEnabled(false);
			}
			else {
				
			}
		}
		if (pin.getString("Pin", "").equals("true")) {
			editor.setPinLineNumber(!editor.isLineNumberPinned());
			editor.setNonPrintablePaintingFlags(CodeEditor.FLAG_DRAW_WHITESPACE_LEADING | CodeEditor.FLAG_DRAW_LINE_SEPARATOR);
		}
		else {
			if (pin.getString("Pin", "").equals("false")) {
				
			}
			else {
				
			}
		}
		if (sys.getString("Mpass", "").equals("true")) {
			hscroll1.setVisibility(View.VISIBLE);
		}
		else {
			if (sys.getString("Mpass", "").equals("false")) {
				hscroll1.setVisibility(View.GONE);
			}
			else {
				
			}
		}
		if (Zb.getString("Over", "").equals("true")) {
			editor.setAutoCompletionEnabled(true);
		}
		else {
			if (Zb.getString("Over", "").equals("false")) {
				editor.setAutoCompletionEnabled(false);
			}
			else {
				
			}
		}
		if (autosave.getString("Va", "").equals("true")) {
			rang = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							if (getIntent().getStringExtra("key").equals("empty")) {
								
							}
							else {
								FileUtil.writeFile(getIntent().getStringExtra("key"), editor.getText().toString());
							}
						}
					});
				}
			};
			_timer.scheduleAtFixedRate(rang, (int)(0), (int)(2000));
		}
		else {
			if (autosave.getString("Va", "").equals("false")) {
				
			}
			else {
				
			}
		}
		if (FileUtil.isExistFile(fb.getString("set", ""))) {
			bak.setImageBitmap(FileUtil.decodeSampleBitmapFromPath(fb.getString("set", ""), 1024, 1024));
		}
	}
	
	
	public void _srcruner() {
		if (getIntent().getStringExtra("key").contains(".json")) {
			json.setClass(getApplicationContext(), LottileplayActivity.class);
			json.putExtra("paser", editor.getText().toString().trim());
			startActivity(json);
		}
		else {
			if (getIntent().getStringExtra("key").contains(".js")) {
				js.setClass(getApplicationContext() , JscompilerActivity.class);
				js.putExtra("sendCode" , editor.getText().toString().trim());
				startActivity(js);
			}
			else {
				if (getIntent().getStringExtra("key").contains(".sh")) {
					js.setClass(getApplicationContext() , ShellActivity.class);
					js.putExtra("sh" , editor.getText().toString().trim());
					startActivity(js);
				}
				else {
					if (getIntent().getStringExtra("key").contains(".java")) {
						_javaruner();
					}
					else {
						if (getIntent().getStringExtra("key").contains(".html")) {
							in.setClass(getApplicationContext(), HtmlActivity.class);
							in.putExtra("code", getIntent().getStringExtra("key"));
							in.putExtra("title", getIntent().getStringExtra("title"));
							startActivity(in);
						}
						else {
							if (getIntent().getStringExtra("key").contains(".c")) {
								SketchwareUtil.showMessage(getApplicationContext(), "Error not install Gcc");
							}
							else {
								if (getIntent().getStringExtra("key").contains(".cpp")) {
									SketchwareUtil.showMessage(getApplicationContext(), "Error not install sdk");
								}
								else {
									if (getIntent().getStringExtra("key").contains(".ninja")) {
										SketchwareUtil.showMessage(getApplicationContext(), "Error Not found class Arr.ninja()->().public class Error not found()");
									}
									else {
										if (getIntent().getStringExtra("key").contains(".xml")) {
											in.setClass(getApplicationContext(), LayoutxmlviewerActivity.class);
											in.putExtra("view", editor.getText().toString().trim());
											startActivity(in);
										}
										else {
											
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	public void _snakbar() {
		ViewGroup v = (ViewGroup) ((ViewGroup) MainActivity.this .findViewById(android.R.id.content)).getChildAt(0);
		
		final com.google.android.material.snackbar.Snackbar snackbar = com.google.android.material.snackbar.Snackbar.make(v, "", com.google.android.material.snackbar.Snackbar.LENGTH_LONG);
		  
		                
		                View customSnackView = getLayoutInflater().inflate(R.layout.saved, null);
		  
		                
		                snackbar.getView().setBackgroundColor(Color.TRANSPARENT);
		  
		                
		                com.google.android.material.snackbar.Snackbar.SnackbarLayout snackbarLayout = (com.google.android.material.snackbar.Snackbar.SnackbarLayout) snackbar.getView();
		  
		                
		                snackbarLayout.setPadding(0, 0, 0, 0);
		  
		                
		                LinearLayout bg = customSnackView.findViewById(R.id.bg);           
		{
			GradientDrawable SketchUi = new GradientDrawable();
			SketchUi.setColor(0xFF000060);SketchUi.setCornerRadii(new float[]{
				getDip(25),getDip(25),getDip(25),getDip(25),getDip(0),getDip(0) ,getDip(0),getDip(0)});
			bg.setElevation(getDip(0));
			RippleDrawable SketchUiRD = new RippleDrawable(new ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE0E0E0}), SketchUi, null);
			bg.setBackground(SketchUiRD);
		}
		t = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						snackbar.dismiss();                    
					}
				});
			}
		};
		_timer.schedule(t, (int)(2000));
		  
		                
		                snackbarLayout.addView(customSnackView, 0);
		                  
		                snackbar.show();
	}
	
	
	public void _setbackground() {
		
	}
	
	
	public void _blure() {
	}
	public class BlurredBitmap{
		
		public Bitmap fastBlur(Bitmap sentBitmap, float scale, int radius) {
						Bitmap bitmap = null;
				
							if(sentBitmap!=null) {
								int width = Math.round(sentBitmap.getWidth() * scale);
								int height = Math.round(sentBitmap.getHeight() * scale);
								sentBitmap = Bitmap.createScaledBitmap(sentBitmap, width, height, false);
								
								 bitmap = sentBitmap.copy(sentBitmap.getConfig(), true);
								
								if (radius < 1) {
											return (null);
								}
								
								int w = bitmap.getWidth();
								int h = bitmap.getHeight();
								
								int[] pix = new int[w * h];
								//	Log.e("pix", w + " " + h + " " + pix.length);
								bitmap.getPixels(pix, 0, w, 0, 0, w, h);
								
								int wm = w - 1;
								int hm = h - 1;
								int wh = w * h;
								int div = radius + radius + 1;
								
								int r[] = new int[wh];
								int g[] = new int[wh];
								int b[] = new int[wh];
								int rsum, gsum, bsum, x, y, i, p, yp, yi, yw;
								int vmin[] = new int[Math.max(w, h)];
								
								int divsum = (div + 1) >> 1;
								divsum *= divsum;
								int dv[] = new int[256 * divsum];
								for (i = 0; i < 256 * divsum; i++) {
											dv[i] = (i / divsum);
								}
								
								yw = yi = 0;
								
								int[][] stack = new int[div][3];
								int stackpointer;
								int stackstart;
								int[] sir;
								int rbs;
								int r1 = radius + 1;
								int routsum, goutsum, boutsum;
								int rinsum, ginsum, binsum;
								
								for (y = 0; y < h; y++) {
											rinsum = ginsum = binsum = routsum = goutsum = boutsum = rsum = gsum = bsum = 0;
											for (i = -radius; i <= radius; i++) {
														p = pix[yi + Math.min(wm, Math.max(i, 0))];
														sir = stack[i + radius];
														sir[0] = (p & 0xff0000) >> 16;
														sir[1] = (p & 0x00ff00) >> 8;
														sir[2] = (p & 0x0000ff);
														rbs = r1 - Math.abs(i);
														rsum += sir[0] * rbs;
														gsum += sir[1] * rbs;
														bsum += sir[2] * rbs;
														if (i > 0) {
																	rinsum += sir[0];
																	ginsum += sir[1];
																	binsum += sir[2];
														} else {
																	routsum += sir[0];
																	goutsum += sir[1];
																	boutsum += sir[2];
														}
											}
											stackpointer = radius;
											
											for (x = 0; x < w; x++) {
														
														r[yi] = dv[rsum];
														g[yi] = dv[gsum];
														b[yi] = dv[bsum];
														
														rsum -= routsum;
														gsum -= goutsum;
														bsum -= boutsum;
														
														stackstart = stackpointer - radius + div;
														sir = stack[stackstart % div];
														
														routsum -= sir[0];
														goutsum -= sir[1];
														boutsum -= sir[2];
														
														if (y == 0) {
																	vmin[x] = Math.min(x + radius + 1, wm);
														}
														p = pix[yw + vmin[x]];
														
														sir[0] = (p & 0xff0000) >> 16;
														sir[1] = (p & 0x00ff00) >> 8;
														sir[2] = (p & 0x0000ff);
														
														rinsum += sir[0];
														ginsum += sir[1];
														binsum += sir[2];
														
														rsum += rinsum;
														gsum += ginsum;
														bsum += binsum;
														
														stackpointer = (stackpointer + 1) % div;
														sir = stack[(stackpointer) % div];
														
														routsum += sir[0];
														goutsum += sir[1];
														boutsum += sir[2];
														
														rinsum -= sir[0];
														ginsum -= sir[1];
														binsum -= sir[2];
														
														yi++;
											}
											yw += w;
								}
								for (x = 0; x < w; x++) {
											rinsum = ginsum = binsum = routsum = goutsum = boutsum = rsum = gsum = bsum = 0;
											yp = -radius * w;
											for (i = -radius; i <= radius; i++) {
														yi = Math.max(0, yp) + x;
														
														sir = stack[i + radius];
														
														sir[0] = r[yi];
														sir[1] = g[yi];
														sir[2] = b[yi];
														
														rbs = r1 - Math.abs(i);
														
														rsum += r[yi] * rbs;
														gsum += g[yi] * rbs;
														bsum += b[yi] * rbs;
														
														if (i > 0) {
																	rinsum += sir[0];
																	ginsum += sir[1];
																	binsum += sir[2];
														} else {
																	routsum += sir[0];
																	goutsum += sir[1];
																	boutsum += sir[2];
														}
														
														if (i < hm) {
																	yp += w;
														}
											}
											yi = x;
											stackpointer = radius;
											for (y = 0; y < h; y++) {
														// Preserve alpha channel: ( 0xff000000 & pix[yi] )
														pix[yi] = ( 0xff000000 & pix[yi] ) | ( dv[rsum] << 16 ) | ( dv[gsum] << 8 ) | dv[bsum];
														
														rsum -= routsum;
														gsum -= goutsum;
														bsum -= boutsum;
														
														stackstart = stackpointer - radius + div;
														sir = stack[stackstart % div];
														
														routsum -= sir[0];
														goutsum -= sir[1];
														boutsum -= sir[2];
														
														if (x == 0) {
																	vmin[y] = Math.min(y + r1, hm) * w;
														}
														p = x + vmin[y];
														
														sir[0] = r[p];
														sir[1] = g[p];
														sir[2] = b[p];
														
														rinsum += sir[0];
														ginsum += sir[1];
														binsum += sir[2];
														
														rsum += rinsum;
														gsum += ginsum;
														bsum += binsum;
														
														stackpointer = (stackpointer + 1) % div;
														sir = stack[stackpointer];
														
														routsum += sir[0];
														goutsum += sir[1];
														boutsum += sir[2];
														
														rinsum -= sir[0];
														ginsum -= sir[1];
														binsum -= sir[2];
														
														yi += w;
											}
								}
								
								//	Log.e("pix", w + " " + h + " " + pix.length);
								bitmap.setPixels(pix, 0, w, 0, 0, w, h);
							} 
							return (bitmap);
			
				}
	}
	
	
	public void _myfab(final boolean _see) {
		try{
			if (_see) {
				_fab.setEnabled(false);
				mChack = false;
				_fab.setImageResource(R.drawable.loading);
				mTimerAsk = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								if (!mChack) {
									_fab.setRotation((float)(_fab.getRotation() + 11));
								}
							}
						});
					}
				};
				_timer.scheduleAtFixedRate(mTimerAsk, (int)(0), (int)(20));
			}
			else {
				_fab.setImageResource(R.drawable.play);
				mTimerAsk.cancel();
				_fab.setRotation((float)(0));
				_fab.setEnabled(true);
				mChack = true;
			}
		}catch(Exception e){
			SketchwareUtil.showMessage(getApplicationContext(), "Error Fab");
		}
	}
	
	
	public void _coderuner() {
		editor.setColorScheme(new ir.vscodemobile.ninjacoder.SchemeVS2019());
		if (getIntent().getStringExtra("title").contains(".scss")) {
			StringBuilder androidtxt = new StringBuilder();
			
			try {
				
				Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("key"))).useDelimiter("\\Z");
				while (scanner.hasNext()) {
					androidtxt .append(scanner.next());
				}
				editor.setText(androidtxt );
			} catch (Exception rt) {
				rt.printStackTrace();
			}
			_fab.hide();
			editor.setEditorLanguage(new UniversalLanguage(new io.github.rosemoe.sora.langs.desc.SCSSDescription()));
		}
		else {
			if (getIntent().getStringExtra("title").contains(".txt")) {
				StringBuilder androidtxt = new StringBuilder();
				
				try {
					
					Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("key"))).useDelimiter("\\Z");
					while (scanner.hasNext()) {
						androidtxt .append(scanner.next());
					}
					editor.setText(androidtxt );
				} catch (Exception rt) {
					rt.printStackTrace();
				}
				_fab.hide();
				////editor.setEditorLanguage(new UniversalLanguage(new PasDescription()));
			}
			else {
				if (getIntent().getStringExtra("title").contains(".pas")) {
					StringBuilder androidc = new StringBuilder();
					
					try {
						
						Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("key"))).useDelimiter("\\Z");
						while (scanner.hasNext()) {
							androidc .append(scanner.next());
						}
						editor.setText(androidc );
					} catch (Exception rt) {
						rt.printStackTrace();
					}
					_fab.hide();
					editor.setEditorLanguage(new UniversalLanguage(new PasDescription()));
				}
				else {
					if (getIntent().getStringExtra("title").contains(".xml")) {
						StringBuilder androidc = new StringBuilder();
						
						try {
							
							Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("key"))).useDelimiter("\\Z");
							while (scanner.hasNext()) {
								androidc .append(scanner.next());
							}
							editor.setText(androidc );
						} catch (Exception rt) {
							rt.printStackTrace();
						}
						_fab.show();
						XMLLanguage xmlLanguage=new XMLLanguage(); xmlLanguage.setSyntaxCheckEnable(true); editor.setEditorLanguage(xmlLanguage);
					}
					else {
						if (getIntent().getStringExtra("title").contains(".kt")) {
							StringBuilder androidc = new StringBuilder();
							
							try {
								
								Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("key"))).useDelimiter("\\Z");
								while (scanner.hasNext()) {
									androidc .append(scanner.next());
								}
								editor.setText(androidc );
							} catch (Exception rt) {
								rt.printStackTrace();
							}
							_fab.hide();
							editor.setEditorLanguage(new UniversalLanguage(new KotlinDescription()));
						}
						else {
							if (getIntent().getStringExtra("title").contains(".cs")) {
								StringBuilder androidcs = new StringBuilder();
								
								try {
									
									Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("key"))).useDelimiter("\\Z");
									while (scanner.hasNext()) {
										androidcs .append(scanner.next());
									}
									editor.setText(androidcs );
								} catch (Exception rt) {
									rt.printStackTrace();
								}
								_fab.hide();
								editor.setEditorLanguage(new UniversalLanguage(new sharpDescription()));
							}
							else {
								if (getIntent().getStringExtra("title").contains(".c")) {
									StringBuilder androidc = new StringBuilder();
									
									try {
										
										Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("key"))).useDelimiter("\\Z");
										while (scanner.hasNext()) {
											androidc .append(scanner.next());
										}
										editor.setText(androidc );
									} catch (Exception rt) {
										rt.printStackTrace();
									}
									_fab.show();
									editor.setEditorLanguage(new UniversalLanguage(new CDescription()));
								}
								else {
									if (getIntent().getStringExtra("title").contains(".rb")) {
										StringBuilder androidrb = new StringBuilder();
										
										try {
											
											Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("key"))).useDelimiter("\\Z");
											while (scanner.hasNext()) {
												androidrb .append(scanner.next());
											}
											editor.setText(androidrb );
										} catch (Exception rt) {
											rt.printStackTrace();
										}
										_fab.hide();
										editor.setEditorLanguage(new UniversalLanguage(new RubyDescription()));
									}
									else {
										if (getIntent().getStringExtra("title").contains(".dart")) {
											StringBuilder androiddart = new StringBuilder();
											
											try {
												
												Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("key"))).useDelimiter("\\Z");
												while (scanner.hasNext()) {
													androiddart .append(scanner.next());
												}
												editor.setText(androiddart );
											} catch (Exception rt) {
												rt.printStackTrace();
											}
											_fab.hide();
											editor.setEditorLanguage(new UniversalLanguage(new DartDescription()));
										}
										else {
											if (getIntent().getStringExtra("title").contains(".ninja")) {
												StringBuilder androidninja = new StringBuilder();
												
												try {
													
													Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("key"))).useDelimiter("\\Z");
													while (scanner.hasNext()) {
														androidninja .append(scanner.next());
													}
													editor.setText(androidninja );
												} catch (Exception rt) {
													rt.printStackTrace();
												}
												_fab.show();
												editor.setEditorLanguage(new UniversalLanguage(new NINJADescription()));
											}
											else {
												if (getIntent().getStringExtra("title").contains(".gradle")) {
													StringBuilder androidjs = new StringBuilder();
													
													try {
														
														Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("key"))).useDelimiter("\\Z");
														while (scanner.hasNext()) {
															androidjs .append(scanner.next());
														}
														editor.setText(androidjs );
													} catch (Exception rt) {
														rt.printStackTrace();
													}
													_fab.hide();
												}
												else {
													if (getIntent().getStringExtra("title").contains(".json")) {
														editor.setEditorLanguage(new UniversalLanguage(new io.github.rosemoe.sora.langs.desc.JSONDescription()));
														StringBuilder androidpy = new StringBuilder();
														
														try {
															
															Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("key"))).useDelimiter("\\Z");
															while (scanner.hasNext()) {
																androidpy .append(scanner.next());
															}
															editor.setText(androidpy );
														} catch (Exception rt) {
															rt.printStackTrace();
														}
														_fab.setImageResource(R.drawable.json);
														_fab.show();
														le.setTitle("json forrmating??");
														le.setIcon(R.drawable.cog);
														le.setMessage("ایا میخواهید فایل : ".concat(getIntent().getStringExtra("title").concat(" مرتب کنید؟")));
														le.setPositiveButton("بله", new DialogInterface.OnClickListener() {
															@Override
															public void onClick(DialogInterface _dialog, int _which) {
																{
																	final String json_str = editor.getText().toString();
																	final int indent_width = 1;
																		
																	    final char[] chars = json_str.toCharArray();
																	    final String newline = System.lineSeparator();
																	
																	final boolean[] begin_quotes = {false};
																	   
																	final int[] progres = {0};
																	 
																	final String[] ret = {""};
																	
																	final ProgressDialog prog = new ProgressDialog(MainActivity.this);
																	
																	prog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
																	
																	prog.setIndeterminate(false);
																	
																	prog.setMax(chars.length);
																	
																	prog.setMessage("Formatting in progress...");
																	
																	prog.setCancelable(false);
																	
																	prog.show();
																	new Thread(new Runnable() {
																			@Override
																			public void run() {
																					Looper.prepare();
																					
																					
																					    for (int i = 0, indent = 0; i < chars.length; i++) {
																							        char c = chars[i];
																							
																							prog.setProgress(i);
																							
																							
																							
																							        if (c == '\"') {
																									            ret[0] += c;
																									            begin_quotes[0] = !begin_quotes[0];
																									            continue;
																									        }
																							
																							        if (!begin_quotes[0]) {
																									            switch (c) {
																											            case '{':
																											            case '[':
																											                ret[0] += c + newline + String.format("%" + (indent += indent_width) + "s", "");
																											                continue;
																											            case '}':
																											            case ']':
																											                ret[0] += newline + ((indent -= indent_width) > 0 ? String.format("%" + indent + "s", "") : "") + c;
																											                continue;
																											            case ':':
																											                ret[0] += c + " ";
																											                continue;
																											            case ',':
																											                ret[0] += c + newline + (indent > 0 ? String.format("%" + indent + "s", "") : "");
																											                continue;
																											            default:
																											                if (Character.isWhitespace(c)) continue;
																											            }
																									        }
																							
																							        ret[0] += c + (c == '\\' ? "" + chars[++i] : "");
																							    }
																					
																					    
																					
																					
																					runOnUiThread(new Runnable() {
																							@Override
																							public void run() {
																									
																									
																									
																									prog.dismiss();
																									
																					editor.setText(ret[0]);
																									
																									Looper.loop();
																							} 
																							
																					});
																			}
																	}).start();
																	
																}
															}
														});
														le.setNegativeButton("خیر", new DialogInterface.OnClickListener() {
															@Override
															public void onClick(DialogInterface _dialog, int _which) {
																
															}
														});
														le.create().show();
													}
													else {
														if (getIntent().getStringExtra("title").contains(".py")) {
															editor.setEditorLanguage(new PythonLanguage()); 
															////editor.setEditorLanguage(new UniversalLanguage(new CppDescription()));
															StringBuilder androidpy = new StringBuilder();
															
															try {
																
																Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("key"))).useDelimiter("\\Z");
																while (scanner.hasNext()) {
																	androidpy .append(scanner.next());
																}
																editor.setText(androidpy );
															} catch (Exception rt) {
																rt.printStackTrace();
															}
														}
														else {
															if (getIntent().getStringExtra("title").contains(".cpp")) {
																
																StringBuilder androidjava = new StringBuilder();
																
																try {
																	
																	Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("key"))).useDelimiter("\\Z");
																	while (scanner.hasNext()) {
																		androidjava .append(scanner.next());
																	}
																	editor.setText(androidjava );
																} catch (Exception rt) {
																	rt.printStackTrace();
																}
																_fab.show();
																editor.setEditorLanguage(new UniversalLanguage(new CppDescription()));
															}
															else {
																if (getIntent().getStringExtra("title").contains(".sh")) {
																	_fab.show();
																	StringBuilder androidjava = new StringBuilder();
																	
																	try {
																		
																		Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("key"))).useDelimiter("\\Z");
																		while (scanner.hasNext()) {
																			androidjava .append(scanner.next());
																		}
																		editor.setText(androidjava );
																	} catch (Exception rt) {
																		rt.printStackTrace();
																	}
																	editor.setEditorLanguage(new UniversalLanguage(new ShellDescription()));
																}
																else {
																	if (getIntent().getStringExtra("title").contains(".java")) {
																		StringBuilder androidjava = new StringBuilder();
																		
																		try {
																			
																			Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("key"))).useDelimiter("\\Z");
																			while (scanner.hasNext()) {
																				androidjava .append(scanner.next());
																			}
																			editor.setText(androidjava );
																		} catch (Exception rt) {
																			rt.printStackTrace();
																		}
																		editor.setEditorLanguage(new JavaLanguage()); 
																		_fab.show();
																	}
																	else {
																		if (getIntent().getStringExtra("title").contains(".html")) {
																			StringBuilder androidhtml = new StringBuilder();
																			
																			try {
																				
																				Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("key"))).useDelimiter("\\Z");
																				while (scanner.hasNext()) {
																					androidhtml .append(scanner.next());
																				}
																				editor.setText(androidhtml );
																			} catch (Exception rt) {
																				rt.printStackTrace();
																			}
																			_fab.show();
																			_fab.setImageResource(R.drawable.play);
																			editor.setEditorLanguage(new HTMLLanguage()); 
																			editor.setColorScheme(new ir.vscodemobile.ninjacoder.HTMLScheme());
																			
																		}
																		else {
																			if (getIntent().getStringExtra("title").contains(".js")) {
																				StringBuilder androidjs = new StringBuilder();
																				
																				try {
																					
																					Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("key"))).useDelimiter("\\Z");
																					while (scanner.hasNext()) {
																						androidjs .append(scanner.next());
																					}
																					editor.setText(androidjs );
																				} catch (Exception rt) {
																					rt.printStackTrace();
																				}
																				editor.setEditorLanguage(new UniversalLanguage(new JavaScriptDescription()));
																				_fab.show();
																			}
																			else {
																				if (getIntent().getStringExtra("title").contains(".css")) {
																					StringBuilder androidcss = new StringBuilder();
																					
																					try {
																						
																						Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("key"))).useDelimiter("\\Z");
																						while (scanner.hasNext()) {
																							androidcss .append(scanner.next());
																						}
																						editor.setText(androidcss );
																					} catch (Exception rt) {
																						rt.printStackTrace();
																					}
																					editor.setEditorLanguage(new UniversalLanguage(new CssDescription()));
																				}
																				else {
																					
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	public void _Ripple_Drawable(final View _view, final String _c) {
		android.content.res.ColorStateList clr = new android.content.res.ColorStateList(new int[][]{new int[]{}},new int[]{Color.parseColor(_c)}); android.graphics.drawable.RippleDrawable ripdr = new android.graphics.drawable.RippleDrawable(clr, null, null); _view.setBackground(ripdr);
	}
	
	
	public void _popmenu(final View _views) {
		View popupView = getLayoutInflater().inflate(R.layout.popup, null);
		final PopupWindow popup = new PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
		LinearLayout l1 = popupView.findViewById(R.id.l1);
		l1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFF000027));
		 com.google.android.material.checkbox.MaterialCheckBox   ch01 = popupView.findViewById(R.id.ch01);
		
		 
		
		 com.google.android.material.checkbox.MaterialCheckBox   ch02 = popupView.findViewById(R.id.ch02);
		
		 
		
		 com.google.android.material.checkbox.MaterialCheckBox   ch03 = popupView.findViewById(R.id.ch03);
		
		 
		
		ch01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
						@Override
						public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
								final boolean _isChecked = _param2;
								if (_isChecked) {
					SketchwareUtil.CustomToast(getApplicationContext(), "soon", 0xFFFFFFFF, 16, 0xFF000027, 25, SketchwareUtil.TOP);
				}
				else {
					
				}
						}
				});
			
		ch02.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
						@Override
						public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
								final boolean _isChecked = _param2;
								if (_isChecked) {
					SketchwareUtil.CustomToast(getApplicationContext(), "soon", 0xFFFFFFFF, 16, 0xFF000027, 25, SketchwareUtil.TOP);
				}
				else {
					
				}
						}
				});
			
		ch03.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
						@Override
						public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
								final boolean _isChecked = _param2;
								if (_isChecked) {
					SketchwareUtil.CustomToast(getApplicationContext(), "soon", 0xFFFFFFFF, 16, 0xFF000027, 25, SketchwareUtil.TOP);
				}
				else {
					
				}
						}
				});
			
		popup.setAnimationStyle(android.R.style.Animation_Dialog);
		
		popup.showAsDropDown(_views, 0,0);
		
		popup.setBackgroundDrawable(new BitmapDrawable());
	}
	
	
	public void _editortab(final String _name, final String _code) {
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("tab", _name);
			map_tabs.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("code", _code);
			map_tabcode.add(_item);
		}
		
		_coderuner();
		recyclerview1.setAdapter(new Recyclerview1Adapter(map_tabs));
		LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
		recyclerview1.setHasFixedSize(true); 
		recyclerview1.setLayoutManager(layoutManager);  
		
		save_tab = new Gson().toJson(map_tabs);
	}
	public class Recyclerview1Adapter extends RecyclerView.Adapter<Recyclerview1Adapter.ViewHolder> {
			
			ArrayList<HashMap<String, Object>> _data;
			
			public Recyclerview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
					_data = _arr;
			}
			
			@Override
			public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
					LayoutInflater _inflater = getLayoutInflater();
					View _v = _inflater.inflate(R.layout.editor_tab, null);
					RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
					_v.setLayoutParams(_lp);
					return new ViewHolder(_v);
			}
			
			@Override
			public void onBindViewHolder(ViewHolder _holder, final int _position) {
					View _view = _holder.itemView;
					
					final LinearLayout ll_main = _view.findViewById(R.id.ll_main);
					final LinearLayout linear1 = _view.findViewById(R.id.linear1);
					final LinearLayout ll_indicator = _view.findViewById(R.id.ll_indicator);
					final TextView tv_filename = _view.findViewById(R.id.tv_filename);
					final ImageView img_close = _view.findViewById(R.id.img_close);
					
					tv_filename.setText(map_tabs.get((int)_position).get("tab").toString());
					linear1.setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View _view) {
									save_path = map_tabcode.get(_position).get("code").toString();
									//editor.setText(FileUtil.readFile(map_tabcode.get((int)_position).get("code").toString()));
					                _coderuner();
							}
					});
					
					img_close.setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View _view) {
									if (editor.getText().toString().equals(FileUtil.readFile(map_tabcode.get((int)_position).get("code").toString()))) {
											editor.setVisibility(View.GONE);
											editor.setText("");
											
											map_tabs.remove(_position);
											map_tabcode.remove(_position);
											LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
											recyclerview1.setHasFixedSize(true); 
											recyclerview1.setLayoutManager(layoutManager);
									}
									else {
											map_tabs.remove(_position);
											map_tabcode.remove(_position);
											LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
											recyclerview1.setHasFixedSize(true); 
											recyclerview1.setLayoutManager(layoutManager);
									}
							}
					});
			}
			
			@Override
			public int getItemCount() {
					return _data.size();
			}
			
			public class ViewHolder extends RecyclerView.ViewHolder {
					public ViewHolder(View v) {
							super(v);
					}
			}
			
			
	}
	
	
	public void _treeviewlocallibrary() {
	}
	
	private TreeViewList.TreeViewAdapter adapter;
		private List<TreeViewList.TreeNode> nodes2;
		private TreeViewList.TreeNode<TreeViewList.Dir> node;
	
		public void loadFilesTotree(String path, final RecyclerView recycler, String rootFolderName){
		
				TreeViewList.isPath = true;
		TreeViewList.backgroundColor = 0xFF212121;
		TreeViewList.textColor = 0xFF00FFFF;
				recycler.setBackgroundColor(TreeViewList.backgroundColor);
		
		
				nodes2 = new ArrayList<>();
				node = new TreeViewList.TreeNode<>(new TreeViewList.Dir(rootFolderName));
				nodes2.add(node);
					
				 
				initData2(path, node);
					
						
						recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
		
				adapter = new TreeViewList.TreeViewAdapter(nodes2, Arrays.asList(new TreeViewList.FileNodeBinder(), new TreeViewList.DirectoryNodeBinder()));
				// whether collapse child nodes when their parent node was close.
		//        adapter.ifCollapseChildWhileCollapseParent(true);
				adapter.setOnTreeNodeListener(new TreeViewList.TreeViewAdapter.OnTreeNodeListener() {
						@Override
						public boolean onClick(String clickedPath, TreeViewList.TreeNode node, RecyclerView.ViewHolder holder) {
								if (!node.isLeaf()) {
										//Update and toggle the node.
										onToggle(!node.isExpand(), holder);
					//                    if (!node.isExpand())
					//                        adapter.collapseBrotherNode(node);
								}
								
				// simple click
				if (FileUtil.isFile(clickedPath)) {
					SketchwareUtil.CustomToast(getApplicationContext(), "File dir = ".concat(clickedPath), 0xFF424242, 0, 0xFF00FFFF, 25, SketchwareUtil.TOP);
				}
				else {
					if (FileUtil.isDirectory(clickedPath)) {
						SketchwareUtil.CustomToast(getApplicationContext(), "Folder dir = ".concat(clickedPath), 0xFF424242, 0, 0xFF00FFFF, 25, SketchwareUtil.TOP);
					}
				}
				
				
								return false;
						}
			
						@Override
						public void onToggle(boolean isExpand, RecyclerView.ViewHolder holder) {
								TreeViewList.DirectoryNodeBinder.ViewHolder dirViewHolder = (TreeViewList.DirectoryNodeBinder.ViewHolder) holder;
								final ImageView ivArrow = dirViewHolder.getIvArrow();
								int rotateDegree = isExpand ? 90 : -90;
								ivArrow.animate().rotationBy(rotateDegree)
										.start();
						}
						
						
						@Override
						public void onLongClick(String clickedPath){
				
							//	Toast.makeText(getApplicationContext(), "long clicked : "+ clickedPath, Toast.LENGTH_SHORT).show();
				 
				
						}
						
				});
				recycler.setAdapter(adapter);
						
						
		
		
				
		
				
		}
		
		public void initData2(String path, final TreeViewList.TreeNode<TreeViewList.Dir> dir){
		
		final String[] pathStr = {path};
		
		new Thread(new Runnable() {
				@Override
				public void run() {
						Looper.prepare();
								
				
						ArrayList<String> rootDir = new ArrayList<>();
				
						FileUtil.listDir(pathStr[0], rootDir);
				
						for (String one : rootDir){
								if (FileUtil.isFile(one)){
										dir.addChild(new TreeViewList.TreeNode<>(new TreeViewList.File(one)));
								} else if (FileUtil.isDirectory(one)) {
										TreeViewList.TreeNode<TreeViewList.Dir> dirTree = new TreeViewList.TreeNode<>(new TreeViewList.Dir(one));
										dir.addChild(dirTree);
										initData2(one, dirTree);
								}
						}
						
						
					}
		}).start();
		
				
		}
		
	
	
	
	public static class TreeViewList {
		
		    public static boolean isPath = false;
		    public static int textColor = 0xFF000000;
		    public static int backgroundColor = 0xFFFFFFFF;
		
		
		    public static class TreeNode<T extends LayoutItemType> implements Cloneable {
			        private T content;
			        private TreeNode parent;
			        private List<TreeNode> childList;
			        private boolean isExpand;
			        private boolean isLocked;
			        //the tree high
			        private int height = UNDEFINE;
			
			        private static final int UNDEFINE = -1;
			
			        public TreeNode(@NonNull T content) {
				            this.content = content;
				            this.childList = new ArrayList<>();
				        }
			
			        public int getHeight() {
				            if (isRoot())
				                height = 0;
				            else if (height == UNDEFINE)
				                height = parent.getHeight() + 1;
				            return height;
				        }
			
			        public boolean isRoot() {
				            return parent == null;
				        }
			
			        public boolean isLeaf() {
				            return childList == null || childList.isEmpty();
				        }
			
			        public void setContent(T content) {
				            this.content = content;
				        }
			
			        public T getContent() {
				            return content;
				        }
			
			        public List<TreeNode> getChildList() {
				            return childList;
				        }
			
			        public void setChildList(List<TreeNode> childList) {
				            this.childList.clear();
				            for (TreeNode treeNode : childList) {
					                addChild(treeNode);
					            }
				        }
			
			        public TreeNode addChild(TreeNode node) {
				            if (childList == null)
				                childList = new ArrayList<>();
				            childList.add(node);
				            node.parent = this;
				            return this;
				        }
			
			        public boolean toggle() {
				            isExpand = !isExpand;
				            return isExpand;
				        }
			
			        public void collapse() {
				            if (isExpand) {
					                isExpand = false;
					            }
				        }
			
			        public void collapseAll() {
				            if (childList == null || childList.isEmpty()) {
					                return;
					            }
				            for (TreeNode child : this.childList) {
					                child.collapseAll();
					            }
				        }
			
			        public void expand() {
				            if (!isExpand) {
					                isExpand = true;
					            }
				        }
			
			        public void expandAll() {
				            expand();
				            if (childList == null || childList.isEmpty()) {
					                return;
					            }
				            for (TreeNode child : this.childList) {
					                child.expandAll();
					            }
				        }
			
			        public boolean isExpand() {
				            return isExpand;
				        }
			
			        public void setParent(TreeNode parent) {
				            this.parent = parent;
				        }
			
			        public TreeNode getParent() {
				            return parent;
				        }
			
			        public TreeNode<T> lock() {
				            isLocked = true;
				            return this;
				        }
			
			        public TreeNode<T> unlock() {
				            isLocked = false;
				            return this;
				        }
			
			        public boolean isLocked() {
				            return isLocked;
				        }
			
			        @Override
			        public String toString() {
				            return "TreeNode{" +
				                    "content=" + this.content +
				                    ", parent=" + (parent == null ? "null" : parent.getContent().toString()) +
				                    ", childList=" + (childList == null ? "null" : childList.toString()) +
				                    ", isExpand=" + isExpand +
				                    '}';
				        }
			
			        @Override
			        protected TreeNode<T> clone() throws CloneNotSupportedException {
				            TreeNode<T> clone = new TreeNode<>(this.content);
				            clone.isExpand = this.isExpand;
				            return clone;
				        }
			    }
		
		
		    //interface
		    public interface LayoutItemType {
			        int getLayoutId();
			    }
		
		
		    // Tree View Adapter
		
		
		    public static class TreeViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
			        private static final String KEY_IS_EXPAND = "IS_EXPAND";
			        private final List<? extends TreeViewBinder> viewBinders;
			        private List<TreeNode> displayNodes;
			        private int padding = 30;
			        private OnTreeNodeListener onTreeNodeListener;
			        private boolean toCollapseChild;
			
			        public TreeViewAdapter(List<? extends TreeViewBinder> viewBinders) {
				            this(null, viewBinders);
				        }
			
			        public TreeViewAdapter(List<TreeNode> nodes, List<? extends TreeViewBinder> viewBinders) {
				            displayNodes = new ArrayList<>();
				            if (nodes != null)
				                findDisplayNodes(nodes);
				            this.viewBinders = viewBinders;
				        }
			
			        private void findDisplayNodes(List<TreeNode> nodes) {
				            for (TreeNode node : nodes) {
					                displayNodes.add(node);
					                if (!node.isLeaf() && node.isExpand())
					                    findDisplayNodes(node.getChildList());
					            }
				        }
			
			        @Override
			        public int getItemViewType(int position) {
				            return displayNodes.get(position).getContent().getLayoutId();
				        }
			
			        @Override
			        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
				            View v = LayoutInflater.from(parent.getContext())
				                    .inflate(viewType, parent, false);
				            if (viewBinders.size() == 1)
				                return viewBinders.get(0).provideViewHolder(v);
				            for (TreeViewBinder viewBinder : viewBinders) {
					                if (viewBinder.getLayoutId() == viewType)
					                    return viewBinder.provideViewHolder(v);
					            }
				            return viewBinders.get(0).provideViewHolder(v);
				        }
			
			        @Override
			        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position, List<Object> payloads) {
				            if (payloads != null && !payloads.isEmpty()) {
					                Bundle b = (Bundle) payloads.get(0);
					                for (String key : b.keySet()) {
						                    switch (key) {
							                        case KEY_IS_EXPAND:
							                            if (onTreeNodeListener != null)
							                                onTreeNodeListener.onToggle(b.getBoolean(key), holder);
							                            break;
							                    }
						                }
					            }
				            super.onBindViewHolder(holder, position, payloads);
				        }
			
			        @Override
			        public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
				            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
					                holder.itemView.setPaddingRelative(displayNodes.get(position).getHeight() * padding, 3, 3, 3);
					            }else {
					                holder.itemView.setPadding(displayNodes.get(position).getHeight() * padding, 3, 3, 3);
					            }
				
				            final TextView txt = holder.itemView.findViewById(R.id.tv_name);
				
				            txt.setTextColor(textColor);
				            holder.itemView.setBackgroundColor(backgroundColor);
				
				            final String clickedPath[] = {""};
				
				            holder.itemView.setOnClickListener(new View.OnClickListener() {
					                @Override
					                public void onClick(View v) {
						                    TreeNode selectedNode = displayNodes.get(holder.getLayoutPosition());
						                    // Prevent multi-click during the short interval.
						                    try {
							                        long lastClickTime = (long) holder.itemView.getTag();
							                       if (System.currentTimeMillis() - lastClickTime < 500)
							                            return;
							                    } catch (Exception e) {
							                        holder.itemView.setTag(System.currentTimeMillis());
							                    }
						                    holder.itemView.setTag(System.currentTimeMillis());
						
						                    
						
						
						
						                    try {
							                        Dir dirNode = (Dir) selectedNode.getContent();
							                        clickedPath[0] = dirNode.dirName;
							                    } catch (Exception e){
							                        File fileNode = (File) selectedNode.getContent();
							                        clickedPath[0] = fileNode.fileName;
							                    }
						
						                    if (onTreeNodeListener != null && onTreeNodeListener.onClick(clickedPath[0],
						                            selectedNode, holder))
						                        return;
						                    if (selectedNode.isLeaf())
						                        return;
						                    // This TreeNode was locked to click.
						                    if (selectedNode.isLocked()) return;
						                    boolean isExpand = selectedNode.isExpand();
						                    int positionStart = displayNodes.indexOf(selectedNode) + 1;
						                    if (!isExpand) {
							                        notifyItemRangeInserted(positionStart, addChildNodes(selectedNode, positionStart));
							                    } else {
							                        notifyItemRangeRemoved(positionStart, removeChildNodes(selectedNode, true));
							                    }
						                }
					            });
							
							
							holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
					                @Override
					                public boolean onLongClick(View v) {
						                    TreeNode selectedNode = displayNodes.get(holder.getLayoutPosition());
						
						                    try {
							                        Dir dirNode = (Dir) selectedNode.getContent();
							                        clickedPath[0] = dirNode.dirName;
							                    } catch (Exception e){
							                        File fileNode = (File) selectedNode.getContent();
							                        clickedPath[0] = fileNode.fileName;
							                    }
						
						                    onTreeNodeListener.onLongClick(clickedPath[0]);
						
						
						                    return true;
						                }
					            });
							
							
				            for (TreeViewBinder viewBinder : viewBinders) {
					                if (viewBinder.getLayoutId() == displayNodes.get(position).getContent().getLayoutId())
					                    viewBinder.bindView(holder, position, displayNodes.get(position));
					            }
				        }
			
			        private int addChildNodes(TreeNode pNode, int startIndex) {
				            List<TreeNode> childList = pNode.getChildList();
				            int addChildCount = 0;
				            for (TreeNode treeNode : childList) {
					                displayNodes.add(startIndex + addChildCount++, treeNode);
					                if (treeNode.isExpand()) {
						                    addChildCount += addChildNodes(treeNode, startIndex + addChildCount);
						                }
					            }
				            if (!pNode.isExpand())
				                pNode.toggle();
				            return addChildCount;
				        }
			
			        private int removeChildNodes(TreeNode pNode) {
				            return removeChildNodes(pNode, true);
				        }
			
			        private int removeChildNodes(TreeNode pNode, boolean shouldToggle) {
				            if (pNode.isLeaf())
				                return 0;
				            List<TreeNode> childList = pNode.getChildList();
				            int removeChildCount = childList.size();
				            displayNodes.removeAll(childList);
				            for (TreeNode child : childList) {
					                if (child.isExpand()) {
						                    if (toCollapseChild)
						                        child.toggle();
						                    removeChildCount += removeChildNodes(child, false);
						                }
					            }
				            if (shouldToggle)
				                pNode.toggle();
				            return removeChildCount;
				        }
			
			        @Override
			        public int getItemCount() {
				            return displayNodes == null ? 0 : displayNodes.size();
				        }
			
			        public void setPadding(int padding) {
				            this.padding = padding;
				        }
			
			        public void ifCollapseChildWhileCollapseParent(boolean toCollapseChild) {
				            this.toCollapseChild = toCollapseChild;
				        }
			
			        public void setOnTreeNodeListener(OnTreeNodeListener onTreeNodeListener) {
				            this.onTreeNodeListener = onTreeNodeListener;
				        }
			
			        public interface OnTreeNodeListener {
				            /**
             * called when TreeNodes were clicked.
             * @return weather consume the click event.
             */
				            boolean onClick(String clickedPath, TreeNode node, RecyclerView.ViewHolder holder);
				
				            /**
             * called when TreeNodes were toggle.
             * @param isExpand the status of TreeNodes after being toggled.
             */
				            void onToggle(boolean isExpand, RecyclerView.ViewHolder holder);
							
							
							//long clickedPath
							void onLongClick(String clickedPath);
				        }
			
			        public void refresh(List<TreeNode> treeNodes) {
				            displayNodes.clear();
				            findDisplayNodes(treeNodes);
				            notifyDataSetChanged();
				        }
			
			        public Iterator<TreeNode> getDisplayNodesIterator() {
				            return displayNodes.iterator();
				        }
			
			        private void notifyDiff(final List<TreeNode> temp) {
				            DiffUtil.DiffResult diffResult = DiffUtil.calculateDiff(new DiffUtil.Callback() {
					                @Override
					                public int getOldListSize() {
						                    return temp.size();
						                }
					
					                @Override
					                public int getNewListSize() {
						                    return displayNodes.size();
						                }
					
					                // judge if the same items
					                @Override
					                public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
						                    return TreeViewAdapter.this.areItemsTheSame(temp.get(oldItemPosition), displayNodes.get(newItemPosition));
						                }
					
					                // if they are the same items, whether the contents has bean changed.
					                @Override
					                public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
						                    return TreeViewAdapter.this.areContentsTheSame(temp.get(oldItemPosition), displayNodes.get(newItemPosition));
						                }
					
					                @Nullable
					                @Override
					                public Object getChangePayload(int oldItemPosition, int newItemPosition) {
						                    return TreeViewAdapter.this.getChangePayload(temp.get(oldItemPosition), displayNodes.get(newItemPosition));
						                }
					            });
				            diffResult.dispatchUpdatesTo(this);
				        }
			
			        private Object getChangePayload(TreeNode oldNode, TreeNode newNode) {
				            Bundle diffBundle = new Bundle();
				            if (newNode.isExpand() != oldNode.isExpand()) {
					                diffBundle.putBoolean(KEY_IS_EXPAND, newNode.isExpand());
					            }
				            if (diffBundle.size() == 0)
				                return null;
				            return diffBundle;
				        }
			
			        // For DiffUtil, if they are the same items, whether the contents has bean changed.
			        private boolean areContentsTheSame(TreeNode oldNode, TreeNode newNode) {
				            return oldNode.getContent() != null && oldNode.getContent().equals(newNode.getContent())
				                    && oldNode.isExpand() == newNode.isExpand();
				        }
			
			        // judge if the same item for DiffUtil
			        private boolean areItemsTheSame(TreeNode oldNode, TreeNode newNode) {
				            return oldNode.getContent() != null && oldNode.getContent().equals(newNode.getContent());
				        }
			
			        /**
         * collapse all root nodes.
         */
			        public void collapseAll() {
				            // Back up the nodes are displaying.
				            List<TreeNode> temp = backupDisplayNodes();
				            //find all root nodes.
				            List<TreeNode> roots = new ArrayList<>();
				            for (TreeNode displayNode : displayNodes) {
					                if (displayNode.isRoot())
					                    roots.add(displayNode);
					            }
				            //Close all root nodes.
				            for (TreeNode root : roots) {
					                if (root.isExpand())
					                    removeChildNodes(root);
					            }
				            notifyDiff(temp);
				        }
			
			        @NonNull
			        private List<TreeNode> backupDisplayNodes() {
				            List<TreeNode> temp = new ArrayList<>();
				            for (TreeNode displayNode : displayNodes) {
					                try {
						                    temp.add(displayNode.clone());
						                } catch (CloneNotSupportedException e) {
						                    temp.add(displayNode);
						                }
					            }
				            return temp;
				        }
			
			        public void collapseNode(TreeNode pNode) {
				            List<TreeNode> temp = backupDisplayNodes();
				            removeChildNodes(pNode);
				            notifyDiff(temp);
				        }
			
			        public void collapseBrotherNode(TreeNode pNode) {
				            List<TreeNode> temp = backupDisplayNodes();
				            if (pNode.isRoot()) {
					                List<TreeNode> roots = new ArrayList<>();
					                for (TreeNode displayNode : displayNodes) {
						                    if (displayNode.isRoot())
						                        roots.add(displayNode);
						                }
					                //Close all root nodes.
					                for (TreeNode root : roots) {
						                    if (root.isExpand() && !root.equals(pNode))
						                        removeChildNodes(root);
						                }
					            } else {
					                TreeNode parent = pNode.getParent();
					                if (parent == null)
					                    return;
					                List<TreeNode> childList = parent.getChildList();
					                for (TreeNode node : childList) {
						                    if (node.equals(pNode) || !node.isExpand())
						                        continue;
						                    removeChildNodes(node);
						                }
					            }
				            notifyDiff(temp);
				        }
			
			    }
		
		
		    // Tree View Binder
		
		    public static abstract class TreeViewBinder<VH extends RecyclerView.ViewHolder> implements LayoutItemType {
			        public abstract VH provideViewHolder(View itemView);
			
			        public abstract void bindView(VH holder, int position, TreeNode node);
			
			        public static class ViewHolder extends RecyclerView.ViewHolder {
				            public ViewHolder(View rootView) {
					                super(rootView);
					            }
				
				            protected <T extends View> T findViewById(@IdRes int id) {
					                return (T) itemView.findViewById(id);
					            }
				        }
			
			    }
		
		
		    public static class FileNodeBinder extends TreeViewBinder<FileNodeBinder.ViewHolder> {
			        @Override
			        public ViewHolder provideViewHolder(View itemView) {
				            return new ViewHolder(itemView);
				        }
			
			        @Override
			        public void bindView(ViewHolder holder, int position, TreeNode node) {
				            File fileNode = (File) node.getContent();
				            if (TreeViewList.isPath) {
					                holder.tvName.setText(Uri.parse(fileNode.fileName).getLastPathSegment());
					            } else {
					                holder.tvName.setText(fileNode.fileName);
					            }
				        }
			
			        @Override
			        public int getLayoutId() {
				            return R.layout.item_file;
				        }
			
			        public class ViewHolder extends TreeViewBinder.ViewHolder {
				            public TextView tvName;
				
				            public ViewHolder(View rootView) {
					                super(rootView);
					                this.tvName = (TextView) rootView.findViewById(R.id.tv_name);
					            }
				
				        }
			    }
		
		
		    public static class DirectoryNodeBinder extends TreeViewBinder<DirectoryNodeBinder.ViewHolder> {
			        @Override
			        public ViewHolder provideViewHolder(View itemView) {
				            return new ViewHolder(itemView);
				        }
			
			        @Override
			        public void bindView(ViewHolder holder, int position, TreeNode node) {
				            holder.ivArrow.setRotation(0);
				            holder.ivArrow.setImageResource(R.drawable.arrow);
				            int rotateDegree = node.isExpand() ? 90 : 0;
				            holder.ivArrow.setRotation(rotateDegree);
				            Dir dirNode = (Dir) node.getContent();
				
				            if (TreeViewList.isPath) {
					                holder.tvName.setText(Uri.parse(dirNode.dirName).getLastPathSegment());
					            } else {
					                holder.tvName.setText(dirNode.dirName);
					            }
				
				            if (node.isLeaf())
				                holder.ivArrow.setVisibility(View.INVISIBLE);
				            else holder.ivArrow.setVisibility(View.VISIBLE);
				        }
			
			        @Override
			        public int getLayoutId() {
				            return R.layout.item_dir;
				        }
			
			        public static class ViewHolder extends TreeViewBinder.ViewHolder {
				            private ImageView ivArrow;
				            private TextView tvName;
				
				            public ViewHolder(View rootView) {
					                super(rootView);
					                this.ivArrow = (ImageView) rootView.findViewById(R.id.iv_arrow);
					                this.tvName = (TextView) rootView.findViewById(R.id.tv_name);
					            }
				
				            public ImageView getIvArrow() {
					                return ivArrow;
					            }
				
				            public TextView getTvName() {
					                return tvName;
					            }
				        }
			    }
		
		
		    public static class Dir implements TreeViewList.LayoutItemType {
			        public String dirName;
			
			        public Dir(String dirName) {
				            this.dirName = dirName;
				        }
			
			        @Override
			        public int getLayoutId() {
				            return R.layout.item_dir;
				        }
			    }
		
		
		    public static class File implements TreeViewList.LayoutItemType {
			        public String fileName;
			
			        public File(String fileName) {
				            this.fileName = fileName;
				        }
			
			        @Override
			        public int getLayoutId() {
				            return R.layout.item_file;
				        }
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