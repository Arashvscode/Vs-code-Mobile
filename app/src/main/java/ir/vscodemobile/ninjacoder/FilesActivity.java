package ir.vscodemobile.ninjacoder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.widget.LinearLayout;
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
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ScrollView;
import android.widget.ImageView;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.app.Activity;
import android.content.SharedPreferences;
import java.util.Timer;
import java.util.TimerTask;
import android.content.Context;
import android.os.Vibrator;
import android.view.View;
import android.widget.AdapterView;
import android.graphics.Typeface;
import com.oguzdev.circularfloatingactionmenu.library.*;
import com.googlecode.d2j.*;
import com.android.*;
import io.github.rosemoe.sora.*;
import com.github.angads25.filepicker.*;
import com.google.gson.*;
import com.suke.widget.*;
import com.github.underscore.lodash.*;
import com.example.myapp.*;
import org.jetbrains.kotlin.*;
import io.github.rosemoe.sora.langs.base.*;
import io.github.rosemoe.sora.langs.textmate.*;
import net.lingala.zip4j.*;
import androidx.webkit.*;
import mrAr.Stop.notmeDicompile.*;
import s4u.restore.swb.*;
import com.jtv7.rippleswitchlib.*;
import com.android.tools.r8.*;
import com.rohitop.rlottie.*;
import com.lwb.piechart.*;
import xyz.ninjacoder.edittext.Animator.main.*;
import org.antlr.v4.runtime.*;
import com.caverock.androidsvg.*;
import com.blogspot.atifsoftwares.animatoolib.*;
import ninja.toska.path.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import androidx.core.content.ContextCompat;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;
import ir.vscodemobile.ninjacoder.LibraryDownloaderUtils;
import a.a.a.bB;
import mod.agus.jcoderz.lib.FileUtil;
import mod.hey.studios.project.library.LibraryDownloader;
import mod.hey.studios.util.Helper;
import java.io.File;
import com.googlecode.dex2jar.v3.Dex2jar;
import java.lang.reflect.Method;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.PKCS8EncodedKeySpec;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import com.caverock.androidsvg.SVGImageView;
import ua.naiksoftware.jadx.*;
import java.io.InputStream;
import java.io.IOException;
import com.rohitop.rlottie.RLottie;
import com.rohitop.rlottie.RLottieImageView;
import com.rohitop.rlottie.RLottieDrawable;

public class FilesActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private DrawerLayout _drawer;
	private String subtitle = "";
	private String Folder = "";
	private double position = 0;
	private double index = 0;
	private String Upfolder = "";
	private String CreateFolder = "";
	private String mainfile = "";
	private String mypath = "";
	private String addddd = "";
	private double abbbb = 0;
	private String avvvv = "";
	private String acccc = "";
	private String paths = "";
	private String input = "";
	private String output = "";
	private String c091272000 = "";
	private String co841245690111111445 = "";
	private String input1 = "";
	private String output1 = "";
	private String path = "";
	private String cdm = "";
	private boolean error = false;
	private String exception = "";
	private String out = "";
	private String outFile = "";
	private String pathss = "";
	private String pathout = "";
	private String good = "";
	private String code = "";
	private String HEX = "";
	private String Aswb = "";
	private String stringinput = "";
	private String stringoutput = "";
	private String dir = "";
	private String ninjaoutput = "";
	private String ninjainput = "";
	private String text = "";
	private double limit = 0;
	private String output120 = "";
	private String fileshare = "";
	
	private ArrayList<String> liststring = new ArrayList<>();
	private ArrayList<String> list = new ArrayList<>();
	private ArrayList<String> folderList = new ArrayList<>();
	private ArrayList<String> fileList = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> files = new ArrayList<>();
	
	private LinearLayout linear1;
	private ListView listview1;
	private LinearLayout _drawer_mynav;
	private LinearLayout _drawer_linear5;
	private LinearLayout _drawer_gitlib;
	private ScrollView _drawer_vscroll2;
	private LinearLayout _drawer_linear8;
	private LinearLayout _drawer_linear9;
	private ImageView _drawer_lego;
	private LinearLayout _drawer_linear10;
	private ImageView _drawer_codeviewweb;
	private ImageView _drawer_githublibdownloader;
	private ImageView _drawer_libviewer;
	private ImageView _drawer_bockview;
	private ImageView _drawer_decoder;
	private ImageView _drawer_javacode;
	private ImageView _drawer_skpro;
	private ImageView _drawer_color;
	private ImageView _drawer_shellrun;
	private ImageView _drawer_skprolib;
	private ImageView _drawer_bug;
	private ImageView _drawer_About;
	private ImageView _drawer_sting;
	private ImageView _drawer_imageview7;
	
	private Intent ini = new Intent();
	private AlertDialog.Builder dialog;
	private Intent intent = new Intent();
	private AlertDialog.Builder dialogmain;
	private AlertDialog.Builder alter;
	private SharedPreferences a11;
	private AlertDialog.Builder android11dialog;
	private AlertDialog.Builder dialogpop;
	private ProgressDialog pro;
	private TimerTask r1;
	private TimerTask r2;
	private ProgressDialog prodialog7zip;
	private AlertDialog.Builder dialogdextojar;
	private AlertDialog.Builder dialogjartodex;
	private ProgressDialog progress;
	private AlertDialog.Builder gitlibdow;
	private ProgressDialog massgerpro;
	private ProgressDialog jartodex;
	private Intent sting = new Intent();
	private AlertDialog.Builder exit;
	private Intent About = new Intent();
	private Intent jar = new Intent();
	private Intent json = new Intent();
	private Intent lib = new Intent();
	private Intent i1 = new Intent();
	private TimerTask timer;
	private TimerTask maintimer;
	private Intent intentskpro = new Intent();
	private AlertDialog.Builder dialogfile;
	private AlertDialog.Builder dialogfolder;
	private TimerTask ask;
	private TimerTask ask2;
	private Intent keystonemain = new Intent();
	private AlertDialog.Builder dialogfiled;
	private Intent getclassview = new Intent();
	private ProgressDialog SkpLdialog;
	private Intent javacode = new Intent();
	private Intent blockview = new Intent();
	private Intent decoder = new Intent();
	private AlertDialog.Builder smaill;
	private Intent sendgmail = new Intent();
	private RequestNetwork c;
	private RequestNetwork.RequestListener _c_request_listener;
	private Vibrator vb;
	private AlertDialog.Builder smail;
	private Intent c3 = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.files);
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
		ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(FilesActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = findViewById(R.id._nav_view);
		
		linear1 = findViewById(R.id.linear1);
		listview1 = findViewById(R.id.listview1);
		_drawer_mynav = _nav_view.findViewById(R.id.mynav);
		_drawer_linear5 = _nav_view.findViewById(R.id.linear5);
		_drawer_gitlib = _nav_view.findViewById(R.id.gitlib);
		_drawer_vscroll2 = _nav_view.findViewById(R.id.vscroll2);
		_drawer_linear8 = _nav_view.findViewById(R.id.linear8);
		_drawer_linear9 = _nav_view.findViewById(R.id.linear9);
		_drawer_lego = _nav_view.findViewById(R.id.lego);
		_drawer_linear10 = _nav_view.findViewById(R.id.linear10);
		_drawer_codeviewweb = _nav_view.findViewById(R.id.codeviewweb);
		_drawer_githublibdownloader = _nav_view.findViewById(R.id.githublibdownloader);
		_drawer_libviewer = _nav_view.findViewById(R.id.libviewer);
		_drawer_bockview = _nav_view.findViewById(R.id.bockview);
		_drawer_decoder = _nav_view.findViewById(R.id.decoder);
		_drawer_javacode = _nav_view.findViewById(R.id.javacode);
		_drawer_skpro = _nav_view.findViewById(R.id.skpro);
		_drawer_color = _nav_view.findViewById(R.id.color);
		_drawer_shellrun = _nav_view.findViewById(R.id.shellrun);
		_drawer_skprolib = _nav_view.findViewById(R.id.skprolib);
		_drawer_bug = _nav_view.findViewById(R.id.bug);
		_drawer_About = _nav_view.findViewById(R.id.About);
		_drawer_sting = _nav_view.findViewById(R.id.sting);
		_drawer_imageview7 = _nav_view.findViewById(R.id.imageview7);
		dialog = new AlertDialog.Builder(this);
		dialogmain = new AlertDialog.Builder(this);
		alter = new AlertDialog.Builder(this);
		a11 = getSharedPreferences("a11", Activity.MODE_PRIVATE);
		android11dialog = new AlertDialog.Builder(this);
		dialogpop = new AlertDialog.Builder(this);
		dialogdextojar = new AlertDialog.Builder(this);
		dialogjartodex = new AlertDialog.Builder(this);
		gitlibdow = new AlertDialog.Builder(this);
		exit = new AlertDialog.Builder(this);
		dialogfile = new AlertDialog.Builder(this);
		dialogfolder = new AlertDialog.Builder(this);
		dialogfiled = new AlertDialog.Builder(this);
		smaill = new AlertDialog.Builder(this);
		c = new RequestNetwork(this);
		vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		smail = new AlertDialog.Builder(this);
		
		listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (FileUtil.isDirectory(files.get((int)_position).get("path").toString())) {
					Folder = files.get((int)_position).get("path").toString();
					_getFiles("");
				}
				else {
					if (files.get((int)_position).get("path").toString().endsWith(".ini")) {
						ini.setClass(getApplicationContext(), MainActivity.class);
						ini.putExtra("key", files.get((int)_position).get("path").toString());
						ini.putExtra("save", files.get((int)_position).get("path").toString());
						ini.putExtra("title", Uri.parse(files.get((int)_position).get("path").toString()).getLastPathSegment());
						startActivity(ini);
					}
					if (files.get((int)_position).get("path").toString().endsWith(".css")) {
						ini.setClass(getApplicationContext(), MainActivity.class);
						ini.putExtra("key", files.get((int)_position).get("path").toString());
						ini.putExtra("save", files.get((int)_position).get("path").toString());
						ini.putExtra("title", Uri.parse(files.get((int)_position).get("path").toString()).getLastPathSegment());
						startActivity(ini);
					}
					if (files.get((int)_position).get("path").toString().endsWith(".js")) {
						ini.setClass(getApplicationContext(), MainActivity.class);
						ini.putExtra("key", files.get((int)_position).get("path").toString());
						ini.putExtra("save", files.get((int)_position).get("path").toString());
						ini.putExtra("title", Uri.parse(files.get((int)_position).get("path").toString()).getLastPathSegment());
						startActivity(ini);
					}
					if (files.get((int)_position).get("path").toString().endsWith(".html")) {
						ini.setClass(getApplicationContext(), MainActivity.class);
						ini.putExtra("key", files.get((int)_position).get("path").toString());
						ini.putExtra("save", files.get((int)_position).get("path").toString());
						ini.putExtra("title", Uri.parse(files.get((int)_position).get("path").toString()).getLastPathSegment());
						startActivity(ini);
					}
					if (files.get((int)_position).get("path").toString().endsWith(".java")) {
						ini.setClass(getApplicationContext(), MainActivity.class);
						ini.putExtra("key", files.get((int)_position).get("path").toString());
						ini.putExtra("save", files.get((int)_position).get("path").toString());
						ini.putExtra("title", Uri.parse(files.get((int)_position).get("path").toString()).getLastPathSegment());
						startActivity(ini);
					}
					if (files.get((int)_position).get("path").toString().endsWith(".sh")) {
						ini.setClass(getApplicationContext(), MainActivity.class);
						ini.putExtra("key", files.get((int)_position).get("path").toString());
						ini.putExtra("save", files.get((int)_position).get("path").toString());
						ini.putExtra("title", Uri.parse(files.get((int)_position).get("path").toString()).getLastPathSegment());
						startActivity(ini);
					}
					if (files.get((int)_position).get("path").toString().endsWith(".pdf")) {
						ini.setClass(getApplicationContext(), PdfviewActivity.class);
						ini.putExtra("pdf", files.get((int)_position).get("path").toString());
						startActivity(ini);
					}
					if (files.get((int)_position).get("path").toString().endsWith(".vsM")) {
						final AlertDialog dialog1 = new AlertDialog.Builder(FilesActivity.this).create();
						View inflate = getLayoutInflater().inflate(R.layout.projectview,null); 
						dialog1.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
						dialog1.setView(inflate);
						androidx.cardview.widget.CardView card = (androidx.cardview.widget.CardView) inflate.findViewById(R.id.card);
						LinearLayout bg = (LinearLayout) inflate.findViewById(R.id.bg);
						TextView in = (TextView) inflate.findViewById(R.id.in);
						TextView viv = (TextView) inflate.findViewById(R.id.viv);
						card.setRadius((float)19);
						card.setCardElevation((float)0);
						card.setCardBackgroundColor(0xFF000027);
						in.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
										
									final SpinKitView spkv = new SpinKitView(FilesActivity.this);
								spkv.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
								spkv.setStyle(Style.WAVE);
								spkv.setColor(0xFFFF8800);
								
								
								
								LinearLayout layoutP = new LinearLayout(FilesActivity.this);
								LinearLayout layout1 = new LinearLayout(FilesActivity.this);
								LinearLayout layout2 = new LinearLayout(FilesActivity.this);
								
								final TextView textLoad = new TextView(getApplicationContext());
								textLoad.setText("install project to".concat(" ".concat(Uri.parse(files.get((int)_position).get("path").toString()).getLastPathSegment())));
								textLoad.setTextColor(0xFFFF8800);
								textLoad.setTextSize((float)17);
								
								//layoutP.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
								layoutP.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
								
								layoutP.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
								layoutP.setOrientation(LinearLayout.VERTICAL);
								layout1.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
								layout2.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
								  
								
								     
								     
								layout2.setPadding(8,8,8,8);
								textLoad.setPadding(8,8,8,8);
								
								layout1.addView(spkv);
								layout2.addView(textLoad);
								layoutP.addView(layout1);
								layoutP.addView(layout2);
								
								newDialogspkv = new AlertDialog.Builder(FilesActivity.this)
									.setView(layoutP)
									.create();
								  newDialogspkv.show();
								
								newDialogspkv.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
								
								r2 = new TimerTask() {
									@Override
									public void run() {
										runOnUiThread(new Runnable() {
											@Override
											public void run() {
												while(true) {
													try {
														
														String fileZip = files.get((int)_position).get("path").toString();
														        java.io.File destDir = new java.io.File("/sdcard/vscodemobile/");
														        byte[]  buffer = new byte[1024] ;
														        try {
															        java.util.zip.ZipInputStream zis = new java.util.zip.ZipInputStream(new java.io.FileInputStream(fileZip));
															        java.util.zip.ZipEntry zipEntry = zis.getNextEntry();
															
															
															        while (zipEntry != null) {
																             java.io.File newFile = newFile(destDir, zipEntry);
																             if (zipEntry.isDirectory()) {
																	                 if (!newFile.isDirectory() && !newFile.mkdirs()) {
																		                     throw new java.io.IOException("Failed to create directory " + newFile);
																		                 }
																	             } else {
																	                 // fix for Windows-created archives
																	                 java.io.File parent = newFile.getParentFile();
																	                 if (!parent.isDirectory() && !parent.mkdirs()) {
																		                     throw new java.io.IOException("Failed to create directory " + parent);
																		                 }
																	
																	                 // write file content
																	                 java.io.FileOutputStream fos = new java.io.FileOutputStream(newFile);
																	                 int len;
																	                 while ((len = zis.read(buffer)) > 0) {
																		                     fos.write(buffer, 0, len);
																		                 }
																	                 fos.close();
																	             }
																         zipEntry = zis.getNextEntry();
																        }
															        zis.closeEntry();
															        zis.close();
														} catch (Exception e) {
															  showMessage(e.toString());
															   }
														SketchwareUtil.showMessage(getApplicationContext(), "prject installed! ");
														_getFiles("");
													} catch (Exception e) {
														 
													}
													newDialogspkv.dismiss();
													break;
												}
											}
										});
									}
								};
								_timer.schedule(r2, (int)(1000));
								newDialogspkv.setCancelable(false);
								dialog1.dismiss();
								
								}
						});
						viv.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
										
									ini.setClass(getApplicationContext(), VsmviewActivity.class);
								ini.putExtra("view", files.get((int)_position).get("path").toString());
								ini.putExtra("title", Uri.parse(files.get((int)_position).get("path").toString()).getLastPathSegment());
								startActivity(ini);
								dialog1.dismiss();
								
								}
						});
						dialog1.setCancelable(true);
						dialog1.show();
					}
					_listfile(_position, "path");
					if (files.get((int)_position).get("path").toString().endsWith(".c")) {
						ini.setClass(getApplicationContext(), MainActivity.class);
						ini.putExtra("key", files.get((int)_position).get("path").toString());
						ini.putExtra("save", files.get((int)_position).get("path").toString());
						ini.putExtra("title", Uri.parse(files.get((int)_position).get("path").toString()).getLastPathSegment());
						startActivity(ini);
					}
					if (files.get((int)_position).get("path").toString().endsWith(".cpp")) {
						ini.setClass(getApplicationContext(), MainActivity.class);
						ini.putExtra("key", files.get((int)_position).get("path").toString());
						ini.putExtra("save", files.get((int)_position).get("path").toString());
						ini.putExtra("title", Uri.parse(files.get((int)_position).get("path").toString()).getLastPathSegment());
						startActivity(ini);
					}
					if (files.get((int)_position).get("path").toString().endsWith(".py")) {
						ini.setClass(getApplicationContext(), MainActivity.class);
						ini.putExtra("key", files.get((int)_position).get("path").toString());
						ini.putExtra("save", files.get((int)_position).get("path").toString());
						ini.putExtra("title", Uri.parse(files.get((int)_position).get("path").toString()).getLastPathSegment());
						startActivity(ini);
					}
					if (files.get((int)_position).get("path").toString().endsWith(".json")) {
						json.setClass(getApplicationContext(), MainActivity.class);
						json.putExtra("key", files.get((int)_position).get("path").toString());
						json.putExtra("save", files.get((int)_position).get("path").toString());
						json.putExtra("title", Uri.parse(files.get((int)_position).get("path").toString()).getLastPathSegment());
						startActivity(json);
					}
					if (files.get((int)_position).get("path").toString().endsWith(".ttf")) {
						ini.setClass(getApplicationContext(), FontActivity.class);
						ini.putExtra("key", files.get((int)_position).get("path").toString());
						ini.putExtra("title", Uri.parse(files.get((int)_position).get("path").toString()).getLastPathSegment());
						startActivity(ini);
					}
					if (files.get((int)_position).get("path").toString().endsWith(".gradle")) {
						ini.setClass(getApplicationContext(), MainActivity.class);
						ini.putExtra("key", files.get((int)_position).get("path").toString());
						ini.putExtra("title", Uri.parse(files.get((int)_position).get("path").toString()).getLastPathSegment());
						ini.putExtra("save", files.get((int)_position).get("path").toString());
						startActivity(ini);
					}
					if (files.get((int)_position).get("path").toString().endsWith(".apk")) {
						final AlertDialog dialog1 = new AlertDialog.Builder(FilesActivity.this).create();
						View inflate = getLayoutInflater().inflate(R.layout.apkfile,null); 
						dialog1.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
						dialog1.setView(inflate);
						androidx.cardview.widget.CardView card = (androidx.cardview.widget.CardView) inflate.findViewById(R.id.card);
						LinearLayout bg = (LinearLayout) inflate.findViewById(R.id.bg);
						TextView install = (TextView) inflate.findViewById(R.id.install);
						TextView si = (TextView) inflate.findViewById(R.id.si);
						TextView n = (TextView) inflate.findViewById(R.id.n);
						TextView size = (TextView) inflate.findViewById(R.id.size);
						ImageView icon = (ImageView) inflate.findViewById(R.id.icon);
						TextView name = (TextView) inflate.findViewById(R.id.name);
						TextView dir = (TextView) inflate.findViewById(R.id.dir);
						TextView apk = (TextView) inflate.findViewById(R.id.apk);
						card.setCardBackgroundColor(0xFF000027);
						pathout = files.get((int)_position).get("path").toString();
						card.setRadius((float)15);
						card.setCardElevation((float)1);
						_getApkIcon(files.get((int)_position).get("path").toString(), icon);
						_tamal(files.get((int)_position).get("path").toString(), size);
						name.setText(Uri.parse(files.get((int)_position).get("path").toString()).getLastPathSegment());
						dir.setText(files.get((int)_position).get("path").toString());
						name.setEllipsize(TextUtils.TruncateAt.MARQUEE);
						name.setMarqueeRepeatLimit(-1);
						name.setSingleLine(true);
						name.setSelected(true);
						dir.setEllipsize(TextUtils.TruncateAt.MARQUEE);
						dir.setMarqueeRepeatLimit(-1);
						dir.setSingleLine(true);
						dir.setSelected(true);
						install.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
										
									try {
									if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
															Uri uri = androidx.core.content.FileProvider.getUriForFile(getApplicationContext(),
																	FilesActivity.this.getPackageName() + ".provider", new java.io.File(files.get((int)_position).get("path").toString()));
															Intent intent = new Intent(Intent.ACTION_VIEW);
															intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
															intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
															intent.setDataAndType(uri, "application/vnd.android.package-archive");
															startActivity(intent);
										
													} else {
															Intent intent = new Intent(Intent.ACTION_VIEW);
															intent.setDataAndType(Uri.fromFile( new java.io.File(files.get((int)_position).get("path").toString())),
																	"application/vnd.android.package-archive");
															intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
															startActivity(intent);
													}
									
								} catch (Exception rr) {
									showMessage (rr.toString());
								}
								dialog1.dismiss();
								
								}
						});
						si.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
										
									try {
									final SpinKitView spkv = new SpinKitView(FilesActivity.this);
									spkv.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
									spkv.setStyle(Style.WAVE);
									spkv.setColor(0xFFFF8800);
									
									
									
									LinearLayout layoutP = new LinearLayout(FilesActivity.this);
									LinearLayout layout1 = new LinearLayout(FilesActivity.this);
									LinearLayout layout2 = new LinearLayout(FilesActivity.this);
									
									final TextView textLoad = new TextView(getApplicationContext());
									textLoad.setText("singing apk file......");
									textLoad.setTextColor(0xFFFF8800);
									textLoad.setTextSize((float)17);
									
									//layoutP.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
									layoutP.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
									
									layoutP.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
									layoutP.setOrientation(LinearLayout.VERTICAL);
									layout1.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
									layout2.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
									  
									
									     
									     
									layout2.setPadding(8,8,8,8);
									textLoad.setPadding(8,8,8,8);
									
									layout1.addView(spkv);
									layout2.addView(textLoad);
									layoutP.addView(layout1);
									layoutP.addView(layout2);
									
									newDialogspkv = new AlertDialog.Builder(FilesActivity.this)
										.setView(layoutP)
										.create();
									  newDialogspkv.show();
									
									newDialogspkv.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
									
									timer = new TimerTask() {
										@Override
										public void run() {
											runOnUiThread(new Runnable() {
												@Override
												public void run() {
													while(true) {
														try {
															if (FileUtil.isExistFile(files.get((int)_position).get("path").toString())) {
																if (files.get((int)_position).get("path").toString().endsWith(".apk")) {
																	FileUtil.writeFile("p", "p");
																	pathss = files.get((int)_position).get("path").toString();
																	signedFile(new File(pathss));
																	_getFiles("");
																}
																else {
																	SketchwareUtil.showMessage(getApplicationContext(), "Enter path to APK file");
																}
															}
															else {
																SketchwareUtil.showMessage(getApplicationContext(), "The entered file is not exist");
															}
														} catch (Exception e) {
															 
														}
														newDialogspkv.dismiss();
														break;
													}
												}
											});
										}
									};
									_timer.schedule(timer, (int)(1000));
									newDialogspkv.setCancelable(false);
								} catch (Exception e) {
									 
								}
								
								}
						});
						n.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
										
									dialog1.dismiss();
								
								}
						});
						apk.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
										
									ini.setClass(getApplicationContext(), VsmviewActivity.class);
								ini.putExtra("view", files.get((int)_position).get("path").toString());
								ini.putExtra("title", Uri.parse(files.get((int)_position).get("path").toString()).getLastPathSegment());
								startActivity(ini);
								
								}
						});
						dialog1.setCancelable(true);
						dialog1.show();
					}
					_imagerviewerclass(files, _position, "path");
					if (files.get((int)_position).get("path").toString().endsWith(".dex")) {
						stringinput = files.get((int)_position).get("path").toString();
						stringoutput = FileUtil.getExternalStorageDir().concat("/vscodemobile/");
						dialogfiled.setTitle("Vs code mobile DexFile");
						dialogfiled.setIcon(R.drawable.vscode);
						dialogfiled.setMessage("Set dex File convert to Jar or Dicompile java File?");
						dialogfiled.setPositiveButton("Convert To jar File", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								path = files.get((int)_position).get("path").toString();
								if (path.equals("")) {
									SketchwareUtil.showMessage(getApplicationContext(), "Enter path to .dex file");
								}
								else {
									if (path.endsWith(".dex")) {
										if (FileUtil.isExistFile(path)) {
											final SpinKitView spkv = new SpinKitView(FilesActivity.this);
											spkv.setLayoutParams(new LinearLayout.LayoutParams(110, 110));
											spkv.setStyle(Style.WAVE);
											spkv.setColor(0xFFE91E63);
											
											
											
											LinearLayout layoutP = new LinearLayout(FilesActivity.this);
											LinearLayout layout1 = new LinearLayout(FilesActivity.this);
											LinearLayout layout2 = new LinearLayout(FilesActivity.this);
											
											final TextView textLoad = new TextView(getApplicationContext());
											textLoad.setText("Convert Dex : ".concat(Uri.parse(path).getLastPathSegment().concat("To Jar File")));
											textLoad.setTextColor(0xFFE91E63);
											textLoad.setTextSize((float)17);
											
											layoutP.setLayoutParams(new LinearLayout.LayoutParams(400, 400));
											layoutP.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
											layoutP.setOrientation(LinearLayout.VERTICAL);
											layout1.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
											layout2.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
											layout2.setPadding(8,8,8,8);
											textLoad.setPadding(8,8,8,8);
											
											layout1.addView(spkv);
											layout2.addView(textLoad);
											layoutP.addView(layout1);
											layoutP.addView(layout2);
											
											newDialogspkv = new AlertDialog.Builder(FilesActivity.this)
												.setView(layoutP)
												.create();
											  newDialogspkv.show();
											
											newDialogspkv.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
											newDialogspkv.setCancelable(false);
											try {
												new _BackgroundTaskClass(FilesActivity.this) {
														        @Override
														        public void doInBackground() {
														_ConvertDexToJar(path, path.substring((int)(0), (int)(path.lastIndexOf(".dex"))).concat(".jar"));
														
																        }
														
														        @Override
														        public void onPostExecute() {
																 
														SketchwareUtil.CustomToast(getApplicationContext(), "Success to convert - ".concat(path.substring((int)(0), (int)(path.lastIndexOf(".dex"))).concat(".jar")), 0xFF2196F3, 16, 0xFF00003A, 19, SketchwareUtil.TOP);
														newDialogspkv.dismiss();
														_getFiles("");
																        }
														    }.execute();
											} catch (Exception e) {
												SketchwareUtil.showMessage(getApplicationContext(), e.toString());
											}
											newDialogspkv.setCancelable(true);
										}
										else {
											SketchwareUtil.showMessage(getApplicationContext(), "File not found ");
										}
									}
									else {
										SketchwareUtil.showMessage(getApplicationContext(), "Enter path to .dex file");
									}
								}
							}
						});
						dialogfiled.setNegativeButton("Dex to smaill", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								_dtos(_position, files);
								
							}
						});
						dialogfiled.create().show();
					}
					if (files.get((int)_position).get("path").toString().endsWith(".ninja")) {
						ini.setClass(getApplicationContext(), MainActivity.class);
						ini.putExtra("key", files.get((int)_position).get("path").toString());
						ini.putExtra("title", Uri.parse(files.get((int)_position).get("path").toString()).getLastPathSegment());
						ini.putExtra("save", files.get((int)_position).get("path").toString());
						startActivity(ini);
					}
					if (files.get((int)_position).get("path").toString().endsWith(".dart")) {
						ini.setClass(getApplicationContext(), MainActivity.class);
						ini.putExtra("key", files.get((int)_position).get("path").toString());
						ini.putExtra("title", Uri.parse(files.get((int)_position).get("path").toString()).getLastPathSegment());
						ini.putExtra("save", files.get((int)_position).get("path").toString());
						startActivity(ini);
					}
					    _swbreston(_position, files, "path");
						_SkpL("path", files, _position);
						_xmlrunr("path", _position, files);
						_kt("path", _position, files);
						_rubycodeplay(_position, "path", files);
						_charpcodeplay(_position, "path", files);
						_pacal("path", files, _position);
						_txtnormal(_position, "path", files);
				}
			}
		});
		
		listview1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
			@Override
			public boolean onItemLongClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				fileshare = files.get((int)_position).get("path").toString();
				final com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog = new com.google.android.material.bottomsheet.BottomSheetDialog(FilesActivity.this);
				
				View bottomSheetView; bottomSheetView = getLayoutInflater().inflate(R.layout.vscodeprojectmain,null );
				bottomSheetDialog.setContentView(bottomSheetView);
				
				bottomSheetDialog.getWindow().findViewById(R.id.design_bottom_sheet).setBackgroundResource(android.R.color.transparent);
				
				androidx.cardview.widget.CardView card = (androidx.cardview.widget.CardView) bottomSheetView.findViewById(R.id.card);
				LinearLayout bg = (LinearLayout) bottomSheetView.findViewById(R.id.bg);
				LinearLayout file = (LinearLayout) bottomSheetView.findViewById(R.id.file);
				LinearLayout folder = (LinearLayout) bottomSheetView.findViewById(R.id.folder);
				final LinearLayout fb = (LinearLayout) bottomSheetView.findViewById(R.id.fb);
				
				file.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
						
						dialogfile.setTitle("Project folder ");
						dialogfile.setIcon(R.drawable.projectcompers_2);
						dialogfile.setMessage("type name project..");
						good = "/sdcard/nameproject.vsM";
						final EditText hsi= new EditText(FilesActivity.this);
						LinearLayout.LayoutParams lparr = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
						///custom edit
						hsi.setText(good);
						hsi.setTextColor(0xFFFFFFFF);
						hsi.setTextSize((int)15);
						hsi.setHintTextColor(0xFFFFFFFF);
						hsi.setSingleLine(true);
						hsi.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/myf.ttf"), 2);
						///end
						hsi.setLayoutParams(lparr);
						dialogfile.setView(hsi);
						dialogfile.setPositiveButton("ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								final AlertDialog dialog1 = new AlertDialog.Builder(FilesActivity.this).create();
								View inflate = getLayoutInflater().inflate(R.layout.dextojar,null); 
								dialog1.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
								dialog1.setView(inflate);
								androidx.cardview.widget.CardView card = (androidx.cardview.widget.CardView) inflate.findViewById(R.id.card);
								card.setCardBackgroundColor(Color.TRANSPARENT);
								card.setRadius((float)20);
								card.setCardElevation((float)0);
								ask = new TimerTask() {
									@Override
									public void run() {
										runOnUiThread(new Runnable() {
											@Override
											public void run() {
												while(true) {
													try {
														
														try {
															
																								new net.lingala.zip4j.ZipFile(new java.io.File(hsi.getText().toString())).addFile(new java.io.File(files.get((int)_position).get("path").toString()));							
															
																		} catch (net.lingala.zip4j.exception.ZipException e) {
																				showMessage(e.toString());
																		}
														_getFiles("");
													} catch (Exception e) {
														 
													}
													dialog1.dismiss();
													break;
												}
											}
										});
									}
								};
								_timer.schedule(ask, (int)(1000));
								dialog1.setCancelable(false);
								dialog1.show();
							}
						});
						dialogfile.setNeutralButton("no", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dialogfile.create().show();
						bottomSheetDialog.dismiss();
						
					}
				});
				folder.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
						
						dialogfolder.setTitle("Compressed folder");
						dialogfolder.setIcon(R.drawable.projectcompers_1);
						dialogfolder.setMessage("Type name project ...");
						code = files.get((int)_position).get("path").toString();
						final EditText ninja= new EditText(FilesActivity.this);
						LinearLayout.LayoutParams lparr = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
						///custom edit
						ninja.setText(code);
						ninja.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/myf.ttf"), 0);
						ninja.setHintTextColor(0xFFFFFFFF);
						ninja.setHint("/sdcard/name.vsM");
						ninja.setTextSize((int)15);
						ninja.setTextColor(0xFFFFFFFF);
						///end
						ninja.setLayoutParams(lparr);
						dialogfolder.setView(ninja);
						dialogfolder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								final AlertDialog dialog1 = new AlertDialog.Builder(FilesActivity.this).create();
								View inflate = getLayoutInflater().inflate(R.layout.dextojar,null); 
								dialog1.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
								dialog1.setView(inflate);
								androidx.cardview.widget.CardView card = (androidx.cardview.widget.CardView) inflate.findViewById(R.id.card);
								card.setCardBackgroundColor(Color.TRANSPARENT);
								card.setRadius((float)19);
								card.setCardElevation((float)0);
								ask2 = new TimerTask() {
									@Override
									public void run() {
										runOnUiThread(new Runnable() {
											@Override
											public void run() {
												while(true) {
													try {
														
														try {
															
																				new net.lingala.zip4j.ZipFile(ninja.getText().toString()).addFolder(new java.io.File(files.get((int)_position).get("path").toString()));
															
																		} catch (net.lingala.zip4j.exception.ZipException e) {
																				showMessage(e.toString());
																		}
														_getFiles("");
													} catch (Exception e) {
														 
													}
													dialog1.dismiss();
													break;
												}
											}
										});
									}
								};
								_timer.schedule(ask2, (int)(1000));
								dialog1.setCancelable(false);
								dialog1.show();
							}
						});
						dialogfolder.setNeutralButton("no", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dialogfolder.create().show();
						bottomSheetDialog.dismiss();
						
					}
				});
				fb.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
								
							String myFilePath = fileshare;
						
						java.io.File file = new java.io.File(myFilePath);
						
						 Intent shareIntent = new Intent();
						shareIntent.setAction(Intent.ACTION_SEND);
						StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
						    StrictMode.setVmPolicy(builder.build());
						
						shareIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse("file://"+file.getAbsolutePath()));
						shareIntent.setType("*/*");
						startActivity(Intent.createChooser(shareIntent, "Share to"));
						bottomSheetDialog.dismiss();
						
						}
				});
				bottomSheetDialog.setCancelable(true);
				card.setCardBackgroundColor(0xFF000027);
				card.setRadius((float)19);
				card.setCardElevation((float)0);
				bottomSheetDialog.show();
				return true;
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				final com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog = new com.google.android.material.bottomsheet.BottomSheetDialog(FilesActivity.this);
				
				View bottomSheetView; bottomSheetView = getLayoutInflater().inflate(R.layout.dialogalter,null );
				bottomSheetDialog.setContentView(bottomSheetView);
				
				bottomSheetDialog.getWindow().findViewById(R.id.design_bottom_sheet).setBackgroundResource(android.R.color.transparent);
				
				LinearLayout bg = (LinearLayout) bottomSheetView.findViewById(R.id.bg);
				androidx.cardview.widget.CardView card = (androidx.cardview.widget.CardView) bottomSheetView.findViewById(R.id.card);
				LinearLayout folder = (LinearLayout) bottomSheetView.findViewById(R.id.folder);
				LinearLayout file = (LinearLayout) bottomSheetView.findViewById(R.id.file);
				card.setCardBackgroundColor(0xFF000027);
				card.setRadius((float)25);
				card.setCardElevation((float)0);
				file.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
						
						_file();
						bottomSheetDialog.dismiss();
						
					}
				});
				folder.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
						
						_folder();
						bottomSheetDialog.dismiss();
						
					}
				});
				bottomSheetDialog.setCancelable(true);
				bottomSheetDialog.show();
			}
		});
		
		_c_request_listener = new RequestNetwork.RequestListener() {
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
		
		_drawer_gitlib.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				final AlertDialog dialog1 = new AlertDialog.Builder(FilesActivity.this).create();
				View inflate = getLayoutInflater().inflate(R.layout.exit,null); 
				dialog1.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
				dialog1.setView(inflate);
				TextView ok = (TextView) inflate.findViewById(R.id.ok);
				TextView no = (TextView) inflate.findViewById(R.id.no);
				androidx.cardview.widget.CardView card = (androidx.cardview.widget.CardView) inflate.findViewById(R.id.card);
				card.setCardBackgroundColor(0xFF000027);
				card.setRadius((float)20);
				card.setCardElevation((float)0);
				ok.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
								
							dialog1.dismiss();
						finishAffinity();
						
						}
				});
				no.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
								
							dialog1.dismiss();
						
						}
				});
				dialog1.setCancelable(true);
				dialog1.show();
			}
		});
		
		_drawer_codeviewweb.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i1.setClass(getApplicationContext(), SiteviewcodeActivity.class);
				startActivity(i1);
			}
		});
		
		_drawer_githublibdownloader.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				final AlertDialog dialog1 = new AlertDialog.Builder(FilesActivity.this).create();
				View inflate = getLayoutInflater().inflate(R.layout.gitlibdownloader,null); 
				dialog1.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
				dialog1.setView(inflate);
				LinearLayout bg = (LinearLayout) inflate.findViewById(R.id.bg);
				androidx.cardview.widget.CardView card = (androidx.cardview.widget.CardView) inflate.findViewById(R.id.card);
				TextView d8 = (TextView) inflate.findViewById(R.id.d8);
				TextView dx = (TextView) inflate.findViewById(R.id.dx);
				TextView no = (TextView) inflate.findViewById(R.id.no);
				card.setCardBackgroundColor(0xFF00003A);
				card.setRadius((float)22);
				card.setCardElevation((float)0);
				d8.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
								
							{
								try{
										int count;
										java.io.InputStream input= FilesActivity.this._getMyContext(FilesActivity.this).getAssets().open("libs/core-lambda-stubs.jar");
										java.io.OutputStream output = new  java.io.FileOutputStream("/sdcard/vscodemobile/class_path.jar");
										byte data[] = new byte[1024];
										while ((count = input.read(data))>0) {
												output.write(data, 0, count);
										}
										output.flush();
										output.close();
										input.close();
										
									}catch(Exception e){
												
									}
						}
						{
								try{
										int count;
										java.io.InputStream input= FilesActivity.this._getMyContext(FilesActivity.this).getAssets().open("libs/android.jar");
										java.io.OutputStream output = new  java.io.FileOutputStream("/sdcard/vscodemobile/android.jar");
										byte data[] = new byte[1024];
										while ((count = input.read(data))>0) {
												output.write(data, 0, count);
										}
										output.flush();
										output.close();
										input.close();
										
									}catch(Exception e){
												
									}
						}
						
						{
							new mod.hey.studios.project.library.LibraryDownloader(FilesActivity.this._getMyContext(FilesActivity.this), true,"/sdcard/vscodemobile/" , "/sdcard/vscodemobile/android.jar" , "/sdcard/vscodemobile/class_path.jar").showDialog(new LibraryDownloader.OnCompleteListener() {
								
								@Override
								public void onComplete() {
									SketchwareUtil.showMessage(getApplicationContext(), "lib");
								}
							});
						}
						dialog1.dismiss();
						
						}
				});
				dx.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
								
							{
								try{
										int count;
										java.io.InputStream input= FilesActivity.this._getMyContext(FilesActivity.this).getAssets().open("libs/core-lambda-stubs.jar");
										java.io.OutputStream output = new  java.io.FileOutputStream("/sdcard/vscodemobile/class_path.jar");
										byte data[] = new byte[1024];
										while ((count = input.read(data))>0) {
												output.write(data, 0, count);
										}
										output.flush();
										output.close();
										input.close();
										
									}catch(Exception e){
												
									}
						}
						{
								try{
										int count;
										java.io.InputStream input= FilesActivity.this._getMyContext(FilesActivity.this).getAssets().open("libs/android.jar");
										java.io.OutputStream output = new  java.io.FileOutputStream("/sdcard/vscodemobile/android.jar");
										byte data[] = new byte[1024];
										while ((count = input.read(data))>0) {
												output.write(data, 0, count);
										}
										output.flush();
										output.close();
										input.close();
										
									}catch(Exception e){
												
									}
						}
						
						{
							new mod.hey.studios.project.library.LibraryDownloader(FilesActivity.this._getMyContext(FilesActivity.this), false,"/sdcard/vscodemobile/" , "/sdcard/vscodemobile/android.jar" , "/sdcard/vscodemobile/class_path.jar").showDialog(new LibraryDownloader.OnCompleteListener() {
								
								@Override
								public void onComplete() {
									SketchwareUtil.showMessage(getApplicationContext(), "lib");
								}
							});
						}
						dialog1.dismiss();
						
						}
				});
				no.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
								
							dialog1.dismiss();
						
						}
				});
				dialog1.setCancelable(true);
				dialog1.show();
			}
		});
		
		_drawer_libviewer.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				lib.setClass(getApplicationContext(), SkprolibviewerActivity.class);
				startActivity(lib);
			}
		});
		
		_drawer_bockview.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				blockview.setClass(getApplicationContext(), BlocksmanagerActivity.class);
				startActivity(blockview);
			}
		});
		
		_drawer_decoder.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				decoder.setClass(getApplicationContext(), ScpEncryptActivity.class);
				startActivity(decoder);
			}
		});
		
		_drawer_javacode.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				javacode.setClass(getApplicationContext(), JavacodeActivity.class);
				startActivity(javacode);
			}
		});
		
		_drawer_skpro.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (FileUtil.isExistFile(FileUtil.getExternalStorageDir().concat("/.sketchware"))) {
						intentskpro.setClass(getApplicationContext(), SkproprojectActivity.class);
					startActivity(intentskpro);
				}
				else {
						SketchwareUtil.showMessage(getApplicationContext(), "متاسفم شما پوشه اسکچور را ندارید ورود ممکن نیست");
				}
			}
		});
		
		_drawer_color.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_colotpiker(HEX);
			}
		});
		
		_drawer_shellrun.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				startActivity(new Intent(FilesActivity.this, CmdActivity.class)); Animatoo.animateZoom(FilesActivity.this);
			}
		});
		
		_drawer_skprolib.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				jar.setClass(getApplicationContext(), LibrarydownloadermathActivity.class);
				startActivity(jar);
			}
		});
		
		_drawer_bug.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				final AlertDialog dialog1 = new AlertDialog.Builder(FilesActivity.this).create();
				View inflate = getLayoutInflater().inflate(R.layout.policebug,null); 
				dialog1.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
				dialog1.setView(inflate);
				final xyz.ninjacoder.edittext.Animator.main.NinjaEditTextAnimator ed = (xyz.ninjacoder.edittext.Animator.main.NinjaEditTextAnimator) inflate.findViewById(R.id.ed);
				final Button b = (Button) inflate.findViewById(R.id.b);
				final com.rohitop.rlottie.RLottieImageView img = (com.rohitop.rlottie.RLottieImageView) inflate.findViewById(R.id.img);
				final androidx.cardview.widget.CardView card = (androidx.cardview.widget.CardView) inflate.findViewById(R.id.card);
				final TextView textview1 = (TextView) inflate.findViewById(R.id.textview1);
				ed.setTextColor(0xFF219EB7);
				ed.setHintTextColor(0xFF219EB7);
				card.setCardBackgroundColor(0xFF000027);
				card.setRadius((float)25);
				card.setCardElevation((float)0);
				ed.setSingleLine(true);
				limit = 60;
				textview1.setText("0/".concat(String.valueOf((long)(limit))));
				
				img.post(new Runnable() {
						@Override
						public void run() {
								img.setAutoRepeat(true);
								img.setAnimation(R.raw.report_police, 150, 150);	
								// loader_view.setLayerColor("Shape Layer 1.**", Color.parseColor("#FF7043"));
								img.playAnimation();	
						}
				});
				ed.addTextChangedListener(new TextWatcher() {
								@Override
								public void onTextChanged(CharSequence _param1, int _param2, final int _param3,final int _param4) {
										final String _charSeq = _param1.toString();
						       
						 
						               try {
							text = _charSeq;
							textview1.setText(String.valueOf((long)(text.length())).concat("/".concat(String.valueOf((long)(limit)))));
							if (text.length() > 60) {
								vb.vibrate((long)(200));
								ed.setTextColor(0xFFF44336);
								textview1.setTextColor(0xFFF44336);
								((xyz.ninjacoder.edittext.Animator.main.NinjaEditTextAnimator)ed).setError("Type 60 Number");
							}
							else {
								ed.setTextColor(0xFF219EB7);
								textview1.setTextColor(0xFF219EB7);
							}
						} catch (Exception e) {
							SketchwareUtil.showMessage(getApplicationContext(), e.toString());
						}
										
								}
								
								@Override
								public void beforeTextChanged(CharSequence _param1, int _param2, final int _param3, final int _param4) {
										
						                      
								} 
								
								@Override
								public void afterTextChanged(Editable _param1) {
										
								}
					           
						});
					
				b.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
								
							if (!"".equals(ed.getText().toString())) {
							if (!"".equals(ed.getText().toString())) {
								try {
									android.telephony.SmsManager smsManager = android.telephony.SmsManager.getDefault(); smsManager.sendTextMessage("+989930117992", null, ed.getText().toString(), null, null);
									
									SketchwareUtil.showMessage(getApplicationContext(), "پیام شما به پشتیبانی ارسال شد");
								}
								catch (Exception e) { 
									SketchwareUtil.showMessage(getApplicationContext(), "ابتدا مجوز را بدهید");
									Intent myAppSettings = new Intent(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS, Uri.parse("package:" + getPackageName())); myAppSettings.addCategory(Intent.CATEGORY_DEFAULT); myAppSettings.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); startActivity(myAppSettings); 
									e.printStackTrace();
								}
							}
							else {
								
							}
						}
						else {
							
						}
						dialog1.dismiss();
						
						}
				});
				dialog1.show();
			}
		});
		
		_drawer_About.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				About.setClass(getApplicationContext(), AboutActivity.class);
				startActivity(About);
			}
		});
		
		_drawer_sting.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				sting.setClass(getApplicationContext(), TanzimatActivity.class);
				startActivity(sting);
			}
		});
	}
	
	private void initializeLogic() {
		setTheme(android.R.style.Theme_Material);
		myContext = new GetContextClass(this).getContextNow();
		
		RLottie.init(this);
		Folder = FileUtil.getExternalStorageDir();
		_getFiles("");
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =FilesActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF000027);
		}
		listview1.setHorizontalScrollBarEnabled(false);
		listview1.setVerticalScrollBarEnabled(false);
		listview1.setOverScrollMode(ListView.OVER_SCROLL_NEVER);
		_drawer_vscroll2.setHorizontalScrollBarEnabled(false);
		_drawer_vscroll2.setVerticalScrollBarEnabled(false);
		_drawer_vscroll2.setOverScrollMode(ListView.OVER_SCROLL_NEVER);
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF000027".replace("0xFF" , "#")));
		}
		_fab.setImageResource(R.drawable.plus);
		
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			SketchUi.setColor(0xFF000027);SketchUi.setCornerRadius(getDip(10));
			_drawer_mynav.setElevation(getDip(2));
			_drawer_mynav.setBackground(SketchUi);
		}
		dialog = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		dialogmain = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		alter = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		android11dialog = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		dialogpop = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		dialogfile = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		dialogfolder = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		exit = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		smaill = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		fonts(getApplicationContext(),getWindow().getDecorView()); 
	} 
	  private void fonts(final android.content.Context context, final View v) {
		    String fontName = "fonts/myf.ttf";
		 try {
						Typeface 
						typeace = Typeface.createFromAsset(getAssets(), fontName);
						if ((v instanceof ViewGroup)) {
								ViewGroup vg = (ViewGroup) v;
								for (int i = 0;
								i < vg.getChildCount();
								i++) {
										View child = vg.getChildAt(i);
										fonts(context, child);
								}
						}
						else {
								if ((v instanceof TextView)) {
										((TextView) v).setTypeface(typeace);
								}
								else {
										if ((v instanceof EditText )) {
												((EditText) v).setTypeface(typeace);
										}
										else {
												if ((v instanceof Button)) {
														((Button) v).setTypeface(typeace);
												}
										}
								}
						}
				}
				catch(Exception e)
				
				{
						e.printStackTrace();
				};
		setTitle("VS Mobile");
		final LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view); _nav_view.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(Color.TRANSPARENT));
		if (true) {
			     getSupportActionBar().hide();
		}
		else {
					getSupportActionBar().show();
		}
		if (a11.getString("kk", "").equals("")) {
			a11.edit().putString("kk", "1").commit();
			try {
				 if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
						      
					final AlertDialog dialog1 = new AlertDialog.Builder(FilesActivity.this).create();
					View inflate = getLayoutInflater().inflate(R.layout.android11,null); 
					dialog1.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
					dialog1.setView(inflate);
					TextView ok = (TextView) inflate.findViewById(R.id.ok);
					androidx.cardview.widget.CardView card = (androidx.cardview.widget.CardView) inflate.findViewById(R.id.card);
					TextView no = (TextView) inflate.findViewById(R.id.no);
					card.setCardBackgroundColor(0xFF000027);
					card.setRadius((float)20);
					card.setCardElevation((float)0);
					ok.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
									
								mypath = "/sdcard/htmlgo/";
							if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
								    try {
									        
									       if (permission()) {	   
										if (FileUtil.isExistFile(mypath)) {
											FileUtil.makeDir(mypath);
										}          
												                } else {
												                  RequestPermission_Dialog();
										
												                }
									        
									        
									    } catch (Exception e) {
									               
									    }
										                
									         } else {
								
								if (FileUtil.isExistFile(mypath)) {
									FileUtil.makeDir(mypath);
								}
								
							}
							dialog1.dismiss();
							
							}
					});
					no.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
									
								dialog1.dismiss();
							
							}
					});
					dialog1.setCancelable(true);
					dialog1.show();
							        
						    } else {
						      
						       
						    }
			} catch (Exception e) {
				SketchwareUtil.showMessage(getApplicationContext(), e.toString());
			}
		}
		else {
			
		}
		
		_fab.setBackgroundTintList(android.content.res.ColorStateList.valueOf(Color.parseColor("0xFF2196F3".replace("0xFF" , "#"))));
	}
	
	@Override
	public void onBackPressed() {
		if (Folder.equals(FileUtil.getExternalStorageDir())) {
			finishAffinity();
		}
		else {
			Upfolder = Folder.substring((int)(0), (int)(Folder.lastIndexOf("/")));
			Folder = Upfolder;
			_getFiles("");
		}
	}
	
	
	    public void onLowMemory() {
		        super.onLowMemory();
		        SketchwareUtil.CustomToast(getApplicationContext(), "حافظه کم است برای اجرا برنامه", 0xFFE91E63, 15, 0xFFFFFFFF, 25, SketchwareUtil.CENTER);
		        }
	public void _getFiles(final String _path) {
		list.clear();
		files.clear();
		folderList.clear();
		fileList.clear();
		FileUtil.listDir(Folder, list);
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		index = 0;
		for(int _repeat13 = 0; _repeat13 < (int)(list.size()); _repeat13++) {
			if (FileUtil.isDirectory(list.get((int)(index)))) {
				folderList.add(list.get((int)(index)));
			}
			else {
				fileList.add(list.get((int)(index)));
			}
			index++;
		}
		index = 0;
		for(int _repeat37 = 0; _repeat37 < (int)(folderList.size()); _repeat37++) {
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("path", folderList.get((int)(index)));
				files.add(_item);
			}
			
			index++;
		}
		index = 0;
		for(int _repeat54 = 0; _repeat54 < (int)(fileList.size()); _repeat54++) {
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("path", fileList.get((int)(index)));
				files.add(_item);
			}
			
			index++;
		}
		listview1.setAdapter(new Listview1Adapter(files));
		((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
	}
	
	
	public void _folder() {
		dialog.setTitle(Html.fromHtml("<font color=\"#00BDF5\">ایجاد پوشه</font>"));
		dialog.setIcon(R.drawable.vscode);
		final EditText edittext12= new EditText(FilesActivity.this);
		LinearLayout.LayoutParams lparr = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		///custom edit
		edittext12.addTextChangedListener(new TextWatcher() {
			
			  ColorScheme keywords = new ColorScheme(
			      Pattern.compile(
			          "\\b(transient|Activity|View|Log|MotionEvent|void|const|static|volatile|interface|native|protected|final|abstract|synchronized|enum|instanceof|assert|break|goto|return|new|throw|throws|super|extends|implements|import)\\b"),
			      Color.parseColor("#FFD84315") //brown
			  );
			
			ColorScheme keywordskeywords = new ColorScheme(
			      Pattern.compile(
			          "\\b(class|private|public|this|arg|args|out)\\b"),
			      Color.parseColor("#FFFF1744") //rose
			  );
			
			ColorScheme keywords2 = new ColorScheme(
			      Pattern.compile(
			          "\\b(package|strictfp|char|short|int|long|double|String|float|byte|boolean|default|do|continue)\\b"),
			      Color.parseColor("#FF4DB6AC") 
			  );
			
			ColorScheme keywords3 = new ColorScheme(
			      Pattern.compile(
			          "\\b(if|else|switch|case|for|while)\\b"),
			      Color.parseColor("#FFD500F9") //mauve
			  );
			
			ColorScheme keywords4 = new ColorScheme(
			      Pattern.compile(
			          "\\b(try|catch|finally|true|false|null|IOException|java.io.IOException)\\b"),
			      Color.parseColor("#FFFFC400") // jaune foncé
			  );
			
			ColorScheme keywords5 = new ColorScheme(
			      Pattern.compile(
			          "\\b(BroadcastReceiver|Intent|Integer|CharSequence|Dialog|OnFocusChangeListener|OnCreateContextMenuListener|OnKeyListener|WifiManager|StringBuffer|StringBuilder|OnClickListener|OnTouchListener|OnLongClickListener|OnCheckedChanged|addTextChangedListener|Color.parseColor|parseColor|Color|ColorScheme|ProcessBuilder|Process|PackageManager|)\\b"),
			      Color.parseColor("#FF2196F3") //Blue
			  );
			
			ColorScheme keywords6 = new ColorScheme(
			      Pattern.compile(
			          "\\b(LinearLayout|LinearParams|CheckboxGroup|CheckBox|Button|Switch|Spannable|EditText|TextView|ImageView|CircleImageView|RadioButton|TabLayout|SwipRefreshLayout)\\b"),
			      Color.parseColor("#FFC0CA33") //Lime foncé
			  );
			
			ColorScheme newtypes = new ColorScheme(
			      Pattern.compile(
			          "\\b(onTextChanged|isSelected|isChecked|CheckBox|Button|Switch|Spannable|EditText|TextView|ImageView|CircleImageView|RadioButton|TabLayout|SwipRefreshLayout)\\b"),
			      Color.parseColor("#76ff03") //green claire
			  );
			
			ColorScheme keywords7 = new ColorScheme(    
			      Pattern.compile(
			          "\\b(java.io.|BufferedReader|InputStream|BufferedWriter|InputStreamReader|File|FileReader|java.io.BufferedReader|java.io.InputStream|java.io.BufferedWriter|java.io.InputStreamReader|java.io.File|java.io.FileReader)\\b"),
			      Color.parseColor("#FFBA68C8") 
			  );
			
			
			  final ColorScheme[] schemes = {newtypes, keywordskeywords , keywords4, keywords3, keywords2, keywords, keywords5, keywords6, keywords7 };
			
			  @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) {
				
				  }
			
			  @Override public void onTextChanged(CharSequence s, int start, int before, int count) {
				
				  }
			
			  @Override public void afterTextChanged(Editable s) {
				    removeSpans(s, ForegroundColorSpan.class);
				    for (ColorScheme scheme : schemes) {
					      for(Matcher m = scheme.pattern.matcher(s); m.find();) {
						        s.setSpan(new ForegroundColorSpan(scheme.color),
						            m.start(),
						            m.end(),
						            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
						      }
					    }
				  }
			
			  void removeSpans(Editable e, Class<? extends CharacterStyle> type) {
				    CharacterStyle[] spans = e.getSpans(0, e.length(), type);
				    for (CharacterStyle span : spans) {
					      e.removeSpan(span);
					    }
				  }
			
			  class ColorScheme {
				    final Pattern pattern;
				    final int color;
				
				     ColorScheme(Pattern pattern, int color) {
					      this.pattern = pattern;
					      this.color = color;
					    }
				  }
			
		});
		
		edittext12.setTextColor(0xFFFFFFFF);
		edittext12.setHintTextColor(0xFFFFFFFF);
		///end
		edittext12.setLayoutParams(lparr);
		dialog.setView(edittext12);
		dialog.setMessage(Html.fromHtml("<font color=\"#00FFFF\">آیا میخواهید یک پوشه ایجاد کنید؟</font>"));
		dialog.setNegativeButton(Html.fromHtml("<font color=\"#00FF00\">Yes</font>"), new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				try {
					CreateFolder = edittext12.getText().toString();
					
					if (!FileUtil.isFile(Folder.concat("/".concat(CreateFolder.concat("/"))))) {
						FileUtil.makeDir(Folder.concat("/".concat(CreateFolder.concat("/"))));
						_getFiles("");
						NinjaCodermain.CustomToast(getApplicationContext(), "Add Folder To ".concat(Folder), 0xFFFFFFFF, 16, 0xFF00003A, 25,NinjaCodermain.CENTER , 5);
					}
					else {
						
					}
				} catch (Exception e) {
					 
				}
			}
		});
		dialog.setNeutralButton(Html.fromHtml("<font color=\"#FF0000\">No</font>"), new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		dialog.create().show();
	}
	
	
	public void _file() {
		dialogmain.setTitle("ایجاد فایل");
		dialogmain.setIcon(R.drawable.vscode);
		dialogmain.setMessage("ایا میخواهید یک فایل ایجاد کنید");
		final EditText edittext2= new EditText(FilesActivity.this);
		LinearLayout.LayoutParams lparr = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		edittext2.setHint("Type name file!");
		edittext2.setHintTextColor(0xFFFFFFFF);
		edittext2.setTextSize((float)16);
		edittext2.setTextColor(0xFFFFFFFF);
		edittext2.setLayoutParams(lparr);
		dialogmain.setView(edittext2);
		edittext2.addTextChangedListener(new TextWatcher() {
			
			  ColorScheme keywords = new ColorScheme(
			      Pattern.compile(
			          "\\b(transient|Activity|View|Log|MotionEvent|void|const|static|volatile|interface|native|protected|final|abstract|synchronized|enum|instanceof|assert|break|goto|return|new|throw|throws|super|extends|implements|import)\\b"),
			      Color.parseColor("#FFD84315") //brown
			  );
			
			ColorScheme keywordskeywords = new ColorScheme(
			      Pattern.compile(
			          "\\b(class|private|public|this|arg|args|out)\\b"),
			      Color.parseColor("#FFFF1744") //rose
			  );
			
			ColorScheme keywords2 = new ColorScheme(
			      Pattern.compile(
			          "\\b(package|strictfp|char|short|int|long|double|String|float|byte|boolean|default|do|continue)\\b"),
			      Color.parseColor("#FF4DB6AC") 
			  );
			
			ColorScheme keywords3 = new ColorScheme(
			      Pattern.compile(
			          "\\b(if|else|switch|case|for|while)\\b"),
			      Color.parseColor("#FFD500F9") //mauve
			  );
			
			ColorScheme keywords4 = new ColorScheme(
			      Pattern.compile(
			          "\\b(try|catch|finally|true|false|null|IOException|java.io.IOException)\\b"),
			      Color.parseColor("#FFFFC400") // jaune foncé
			  );
			
			ColorScheme keywords5 = new ColorScheme(
			      Pattern.compile(
			          "\\b(BroadcastReceiver|Intent|Integer|CharSequence|Dialog|OnFocusChangeListener|OnCreateContextMenuListener|OnKeyListener|WifiManager|StringBuffer|StringBuilder|OnClickListener|OnTouchListener|OnLongClickListener|OnCheckedChanged|addTextChangedListener|Color.parseColor|parseColor|Color|ColorScheme|ProcessBuilder|Process|PackageManager|)\\b"),
			      Color.parseColor("#FF2196F3") //Blue
			  );
			
			ColorScheme keywords6 = new ColorScheme(
			      Pattern.compile(
			          "\\b(LinearLayout|LinearParams|CheckboxGroup|CheckBox|Button|Switch|Spannable|EditText|TextView|ImageView|CircleImageView|RadioButton|TabLayout|SwipRefreshLayout)\\b"),
			      Color.parseColor("#FFC0CA33") //Lime foncé
			  );
			
			ColorScheme newtypes = new ColorScheme(
			      Pattern.compile(
			          "\\b(onTextChanged|isSelected|isChecked|CheckBox|Button|Switch|Spannable|EditText|TextView|ImageView|CircleImageView|RadioButton|TabLayout|SwipRefreshLayout)\\b"),
			      Color.parseColor("#76ff03") //green claire
			  );
			
			ColorScheme keywords7 = new ColorScheme(    
			      Pattern.compile(
			          "\\b(java.io.|BufferedReader|InputStream|BufferedWriter|InputStreamReader|File|FileReader|java.io.BufferedReader|java.io.InputStream|java.io.BufferedWriter|java.io.InputStreamReader|java.io.File|java.io.FileReader)\\b"),
			      Color.parseColor("#FFBA68C8") 
			  );
			
			
			  final ColorScheme[] schemes = {newtypes, keywordskeywords , keywords4, keywords3, keywords2, keywords, keywords5, keywords6, keywords7 };
			
			  @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) {
				
				  }
			
			  @Override public void onTextChanged(CharSequence s, int start, int before, int count) {
				
				  }
			
			  @Override public void afterTextChanged(Editable s) {
				    removeSpans(s, ForegroundColorSpan.class);
				    for (ColorScheme scheme : schemes) {
					      for(Matcher m = scheme.pattern.matcher(s); m.find();) {
						        s.setSpan(new ForegroundColorSpan(scheme.color),
						            m.start(),
						            m.end(),
						            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
						      }
					    }
				  }
			
			  void removeSpans(Editable e, Class<? extends CharacterStyle> type) {
				    CharacterStyle[] spans = e.getSpans(0, e.length(), type);
				    for (CharacterStyle span : spans) {
					      e.removeSpan(span);
					    }
				  }
			
			  class ColorScheme {
				    final Pattern pattern;
				    final int color;
				
				     ColorScheme(Pattern pattern, int color) {
					      this.pattern = pattern;
					      this.color = color;
					    }
				  }
			
		});
		
		dialogmain.setPositiveButton("yes", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				try {
					mainfile = edittext2.getText().toString();
					if (mainfile.equals("")) {
						_file();
					}
					else {
						if (!mainfile.contains("/")) {
							FileUtil.writeFile(Folder.concat("/".concat(mainfile)), "");
							_getFiles("");
						}
						else {
							if (FileUtil.isExistFile(Folder.concat("/".concat(mainfile)))) {
								_getFiles("");
								NinjaCodermain.CustomToast(getApplicationContext(), "Add File To ".concat(Folder), 0xFFFFFFFF, 16, 0xFF00003A, 25,NinjaCodermain.CENTER , 2);
							}
							else {
								
							}
						}
					}
					
				} catch (Exception e) {
					 
				}
			}
		});
		dialogmain.setNegativeButton("no", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		dialogmain.create().show();
	}
	
	
	public void _android11() {
	}
	/*
Code Edited by Hichem Soft
youtube channel : Hichem Soft
support me if you like my work
*/
	@Override
	    protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		  super.onActivityResult(_requestCode, _resultCode, _data);
		            
		if (_requestCode == new_folder){
			    if (_resultCode == Activity.RESULT_OK) {
				            if (_data != null) {
					              final Uri uri2 = _data.getData();
					if (Uri.decode(uri2.toString()).endsWith(":")) {
						SketchwareUtil.showMessage(getApplicationContext(), "⛔");
						askPermission(uri2.toString());
					}
					else {
						final int takeFlags = i.getFlags()
						            & (Intent.FLAG_GRANT_READ_URI_PERMISSION
						            | Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
						// Check for the freshest data.
						getContentResolver().takePersistableUriPermission(uri2, takeFlags);
						
						
						 
						
						
					}
					
					       } else {
					        
					   }
				       } else {
				      
				 
				 
				   }
		}
		
		
		if (_requestCode == 2000) {
				      if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
						        if (Environment.isExternalStorageManager()) {
								          
								        } else {
								
								        }
						      }
				    
		}
		
		
		
		       
		
	}
	
	// solve android 11 sdcard permissions
	
	
	 public void RequestPermission_Dialog() {
		    if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
				      try {
						        Intent intent = new Intent(android.provider.Settings.ACTION_MANAGE_ALL_FILES_ACCESS_PERMISSION);
						        intent.addCategory("android.intent.category.DEFAULT");
						        intent.setData(Uri.parse(String.format("package: ", new Object[]{getApplicationContext().getPackageName()})));
						        startActivityForResult(intent, 2000);
						      } catch (Exception e) {
						        Intent obj = new Intent();
						        obj.setAction(android.provider.Settings.ACTION_MANAGE_ALL_FILES_ACCESS_PERMISSION);
						        startActivityForResult(obj, 2000);
						      }
				    } else {
				      androidx.core.app.ActivityCompat.requestPermissions(FilesActivity.this, new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE, android.Manifest.permission.READ_EXTERNAL_STORAGE}, REQUEST_CODE);
				    }
		  }
	
	  public boolean permission() {
		    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) { // R is Android 11
				      return Environment.isExternalStorageManager();
				    } else {
				      int write = androidx.core.content.ContextCompat.checkSelfPermission(getApplicationContext(), android.Manifest.permission.WRITE_EXTERNAL_STORAGE);
				      int read = androidx.core.content.ContextCompat.checkSelfPermission(getApplicationContext(), android.Manifest.permission.READ_EXTERNAL_STORAGE);
				
				      return write == android.content.pm.PackageManager.PERMISSION_GRANTED
				          && read == android.content.pm.PackageManager.PERMISSION_GRANTED;
				    }
	} 
	
	// ask permissions request
	
	    
	    public void askPermission(final String _uri) {
			
		
			i.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION |  Intent.FLAG_GRANT_PERSISTABLE_URI_PERMISSION);
					
			i.setAction(Intent.ACTION_OPEN_DOCUMENT_TREE);				    i.putExtra(android.provider.DocumentsContract.EXTRA_INITIAL_URI, Uri.parse(_uri));
						        startActivityForResult(i, new_folder);
		}
	
	// check permissions of path if accepted 
	
	
	public boolean checkPermission(final String _uri) {
				Uri muri = Uri.parse(_uri);
				    dFile = androidx.documentfile.provider.DocumentFile.fromTreeUri(getApplicationContext(), muri);
				                    
				if (dFile.canRead() && dFile.canWrite()) {
						return true ;
				}
				return false ;
		}
	
	// simple path to UriTree path
	
	
	public String pathToRealUri( String _path) {
				uriFor1 = "content://com.android.externalstorage.documents/tree/primary%3A";
		
		if ( _path.endsWith("/")) {
			_path = _path.substring(0, _path.length()-1);
		}
		
		
				if (_path.contains("/sdcard/")) {
						uriFor2 = _path.replace("/sdcard/", "").replace("/", "%2F");
						
						if (uriFor2.substring(uriFor2.length()-1, uriFor2.length()).equals("/")) {
								
								uriFor2 = uriFor1.substring(0, uriFor1.length()-1);
								
						}
						
				}
				else {
						if (_path.contains("/storage/") && _path.contains("/emulated/")) {
								uriFor2 = _path.replace("/storage/emulated/0/", "").replace("/", "%2F");
								
								if (uriFor2.substring(uriFor2.length()-1, uriFor2.length()).equals("/")) {
										
										uriFor2 = uriFor1.substring(0, uriFor1.length()-1);
										
								}	
								
						}
						else {
								
						}
				}
				return uriFor1 = uriFor1 + uriFor2;
		}
	
	
	// simple path to UriTree path 2
	
	public String pathToUri( String _path) {
				uriFor1 = "content://com.android.externalstorage.documents/tree/primary%3AAndroid/document/primary%3A";
		
		if ( _path.endsWith("/")) {
			_path = _path.substring(0, _path.length()-1);
		}
		
				if (_path.contains("/sdcard/")) {
						uriFor2 = _path.replace("/sdcard/", "").replace("/", "%2F");
						
						if (uriFor2.substring(uriFor2.length()-1, uriFor2.length()).equals("/")) {
								
								uriFor2 = uriFor1.substring(0, uriFor1.length()-1);
								
						}
						
						
				}
				else {
						if (_path.contains("/storage/") && _path.contains("/emulated/")) {
								uriFor2 = _path.replace("/storage/emulated/0/", "").replace("/", "%2F");
								
								if (uriFor2.substring(uriFor2.length()-1, uriFor2.length()).equals("/")) {
										
										uriFor2 = uriFor1.substring(0, uriFor1.length()-1);
										
								}
								
						}
						else {
								
						}
				}
				return uriFor1 = uriFor1 + uriFor2;
		}
	
	// ccopy file from path to path
	
	private boolean copyAsset(final String assetFilename, final Uri targetUri) {
		  			try{
			  				int count;
			  				InputStream input = null;
					OutputStream output = null;
			  				
			  				ContentResolver content = getApplicationContext().getContentResolver();
						  
			            input = getApplicationContext().getAssets().open(assetFilename);
						
			            output = content.openOutputStream(targetUri);
			            
			            
			  				byte data[] = new byte[1024];
			  				while ((count = input.read(data))>0) {
				  					output.write(data, 0, count);
				  			}
			  				output.flush();
			  				output.close();
			  				input.close();
			  				
			  				SketchwareUtil.showMessage(getApplicationContext(), "success ✔️ نجاح ");
							 
			  		}catch(Exception e){
			  				
			  		FileUtil.writeFile("/sdcard/log.txt", "\n"+ "3   " +e.toString());		SketchwareUtil.showMessage(getApplicationContext(), e.toString());
							  return false;
			  		}
		
		return true;
	}
	
	
	
	
	
	private void copyAssetFolder(String  _folder, String _out ) {
		
		
		AssetManager assetManager = getAssets();
		int sizeList = 0;
		    String[] files = null;
		    try {
				        files = assetManager.list(_folder);
				
				    } catch (java.io.IOException e) {
				        
				    }
		final ArrayList<String> str = new ArrayList<>(Arrays.asList(files));
		
		
		
		int nn = 0;
		for(int _repeat12 = 0; _repeat12 < (int)(str.size()); _repeat12++) {
				
				try {
							Uri mUri = Uri.parse(pathToRealUri(_out));
							
							String fileName = str.get((int)nn);
					sizeList = str.size()-1;		
						
						androidx.documentfile.provider.DocumentFile dFile = androidx.documentfile.provider.DocumentFile.fromTreeUri(getApplicationContext(), mUri);
							           Uri mUri2 = Uri.parse(mUri.toString()+ "%2" + fileName);
							          androidx.documentfile.provider.DocumentFile  dFile2 = androidx.documentfile.provider.DocumentFile.fromTreeUri(getApplicationContext(), mUri2);
							            
							  
							
							try {              
										
										androidx.documentfile.provider.DocumentFile file = dFile.findFile(fileName);
										   android.provider.DocumentsContract.deleteDocument(getApplicationContext().getContentResolver(), file.getUri());
										
								    android.provider.DocumentsContract.deleteDocument(getApplicationContext().getContentResolver(), mUri2);
										
										
							} catch (FileNotFoundException e) {
										                } catch (Exception e2) {
										                }
							
							
							
							dFile2 = dFile.createFile("*/*", fileName);
							            mUri = dFile2.getUri();
							        
							        
							        
							        if (copyAsset(_folder+"/"+fileName, mUri)) {
										    
						if (nn >= sizeList){				    SketchwareUtil.showMessage(getApplicationContext(), "️😎✔️");       
					}					        
						} else {
										            
										        
								SketchwareUtil.showMessage(getApplicationContext(), "😓❌");
								break;
						}
							
							                
							      } catch (Exception re){}      
				            
				nn++;
		}
		
	}
	
	
	public boolean copy(java.io.File copy, String directory, Context con) {
		     java.io.FileInputStream inStream = null;
		     java.io.OutputStream outStream = null;
		    androidx.documentfile.provider.DocumentFile  dir= androidx.documentfile.provider.DocumentFile.fromTreeUri(getApplicationContext(), Uri.parse(pathToRealUri(directory)));
		    
		 
		try {   
			  String fileN = Uri.parse(copy.getPath()).getLastPathSegment();  
			
			    androidx.documentfile.provider.DocumentFile file = dir.findFile(fileN);
			   android.provider.DocumentsContract.deleteDocument(getApplicationContext().getContentResolver(), file.getUri());
			    
			 } catch (Exception e){
			e.printStackTrace();
		}   
		    String mim = mime(copy.toURI().toString());
		    androidx.documentfile.provider.DocumentFile  copy1= dir.createFile(mim, copy.getName());
		    try {
			        inStream = new java.io.FileInputStream(copy);
			        outStream =
			                con.getContentResolver().openOutputStream(copy1.getUri());
			        byte[] buffer = new byte[16384];
			        int bytesRead;
			        while ((bytesRead = inStream.read(buffer)) != -1) {
				            outStream.write(buffer, 0, bytesRead);
				
				        }
			    } catch (java.io.FileNotFoundException e) {
			        e.printStackTrace();
			    } catch (java.io.IOException e) {
			        e.printStackTrace();
			    } finally {
			        try {
				
				            inStream.close();
				
				            outStream.close();
				
				
				            return true;
				
				
				        } catch (java.io.IOException e) {
				            e.printStackTrace();
				        }
			    }
		    return false;
	}
	
	
	
	public  String mime(String URI) {
		       String type = "";
		       String extention = android.webkit.MimeTypeMap.getFileExtensionFromUrl(URI);
		       if (extention != null) {
			           type = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(extention);
			       }
		       return type;
		   }
	
	
	
	
	
	private boolean fromStorage = false;
	  final static int REQUEST_CODE = 333;
	  final static  int OLD_REQUEST = 2000;
	  private SharedPreferences sha;
	private Intent i = new Intent();
		private  Uri muri;
		private String uriFor1 = "";
		private String uriFor2 = "";
		private  
		androidx.documentfile.provider.DocumentFile dFile;
		private double PermissionNumber;
		private  static final int new_folder = 43;
	{
	}
	
	
	public void _un7zlib() {
	}
	private boolean zipEntryMatch(String zeName, java.io.File[]  files, String path){
		    for(int i = 0; i < files.length; i++){
			        if((path + files[i] .getName()).equals(zeName)){
				            return true;
				        }
			    }
		    return false;
	}
	
	    public static class ZipUtils {
		
		        private final List<java.io.File> fileList;
		
		        private List<String> paths;
		
		        public ZipUtils() {
			            fileList = new ArrayList<>();
			            paths = new ArrayList<>(25);
			        }
		
		        public void zipIt(java.io.File sourceFile, java.io.File zipFile) {
			            if (sourceFile.isDirectory()) {
				                byte[]  buffer = new byte[1024] ;
				                java.io.FileOutputStream fos = null;
				                java.util.zip.ZipOutputStream zos = null;
				
				                try {
					
					
					
					                    String sourcePath = sourceFile.getParentFile().getPath();
					                    generateFileList(sourceFile);
					
					                    fos = new java.io.FileOutputStream(zipFile);
					                    zos = new java.util.zip.ZipOutputStream(fos);
					
					                    System.out.println("Output to Zip : " + zipFile);
					                    java.io.FileInputStream in = null;
					
					                    for (java.io.File file : this.fileList) {
						                        String path = file.getParent().trim();
						                        path = path.substring(sourcePath.length());
						
						                        if (path.startsWith(java.io.File.separator)) {
							                            path = path.substring(1);
							                        }
						
						                        if (path.length() > 0) {
							                            if (!paths.contains(path)) {
								                                paths.add(path);
								                                java.util.zip.ZipEntry ze = new java.util.zip.ZipEntry(path + "");
								                                zos.putNextEntry(ze);
								                                zos.closeEntry();
								                            }
							                            path += "/";
							                        }
						
						                        String entryName = path.substring((int)(0), (int)(path.lastIndexOf("/")))+ "/" + file.getName();
						                        System.out.println("File Added : " + entryName);
						                        java.util.zip.ZipEntry ze = new java.util.zip.ZipEntry(entryName);
						
						                        zos.putNextEntry(ze);
						                        try {
							                            in = new java.io.FileInputStream(file);
							                            int len;
							                            while ((len = in.read(buffer)) > 0) {
								                                zos.write(buffer, 0, len);
								                            }
							                        } finally {
							                            in.close();
							                        }
						                    }
					
					                    zos.closeEntry();
					                    System.out.println("Folder successfully compressed");
					
					                } catch (java.io.IOException ex) {
					                    ex.printStackTrace();
					                } finally {
					                    try {
						                        zos.close();
						                    } catch (java.io.IOException e) {
						                        e.printStackTrace();
						                    }
					                }
				            }
			        }
		
		        protected void generateFileList(java.io.File node) {
			
			            if (node.isFile()) {
				                fileList.add(node);
				            }
			            if (node.isDirectory()) {
				                java.io.File[]  subNote = node.listFiles();
				                for (java.io.File filename : subNote) {
					                    generateFileList(filename);
					                }
				            }
			        }
		    }
	public  java.io.File newFile(java.io.File destinationDir, java.util.zip.ZipEntry zipEntry) throws java.io.IOException {
		    java.io.File destFile = new java.io.File(destinationDir, zipEntry.getName());
		
		    String destDirPath = destinationDir.getCanonicalPath();
		    String destFilePath = destFile.getCanonicalPath();
		
		    if (!destFilePath.startsWith(destDirPath + java.io.File.separator)) {
			        throw new java.io.IOException("Entry is outside of the target dir: " + zipEntry.getName());
			    }
		
		    return destFile;
	}
	
	
	public void _listfile(final double _pos, final String _FILE) {
		try {
			if (files.get((int)_pos).get(_FILE).toString().endsWith(".jar")) {
				cdm = files.get((int)_pos).get(_FILE).toString();
				if (cdm.equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "خطا انتخاب فایل jar");
				}
				else {
					if (cdm.endsWith(".jar")) {
						if (FileUtil.isExistFile(cdm)) {
							error = false;
							try {
								final SpinKitView spkv = new SpinKitView(FilesActivity.this);
								spkv.setLayoutParams(new LinearLayout.LayoutParams(100, 100));
								spkv.setStyle(Style.WAVE);
								spkv.setColor(0xFFFF8800);
								
								
								
								LinearLayout layoutP = new LinearLayout(FilesActivity.this);
								LinearLayout layout1 = new LinearLayout(FilesActivity.this);
								LinearLayout layout2 = new LinearLayout(FilesActivity.this);
								
								final TextView textLoad = new TextView(getApplicationContext());
								textLoad.setText("jar to dex convert ".concat(cdm));
								textLoad.setTextColor(0xFFFF8800);
								textLoad.setTextSize((float)17);
								
								//layoutP.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
								layoutP.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
								
								layoutP.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
								layoutP.setOrientation(LinearLayout.VERTICAL);
								layout1.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
								layout2.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
								  
								
								     
								     
								layout2.setPadding(8,8,8,8);
								textLoad.setPadding(8,8,8,8);
								
								layout1.addView(spkv);
								layout2.addView(textLoad);
								layoutP.addView(layout1);
								layoutP.addView(layout2);
								
								newDialogspkv = new AlertDialog.Builder(FilesActivity.this)
									.setView(layoutP)
									.create();
								  newDialogspkv.show();
								
								newDialogspkv.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
								
								new _BackgroundTaskClass2(FilesActivity.this) {
										        @Override
										        public void doInBackground() {
										try {
											_jar2dex(cdm, cdm.substring((int)(0), (int)(cdm.lastIndexOf(".jar"))).concat(".dex"));
										} catch (Exception e) {
											exception = e.toString();
											error = true;
										}
										
												        }
										
										        @Override
										        public void onPostExecute() {
												 
										SketchwareUtil.showMessage(getApplicationContext(), "Success to convert - ".concat(cdm.substring((int)(0), (int)(cdm.lastIndexOf(".jar"))).concat(".dex")));
										_getFiles("");
										newDialogspkv.dismiss();
										newDialogspkv.setCancelable(false);
										if (error) {
											SketchwareUtil.showMessage(getApplicationContext(), exception);
										}
										else {
											
										}
												        }
										    }.execute();
							} catch (Exception e) {
								 
							}
						}
						else {
							SketchwareUtil.showMessage(getApplicationContext(), "فایل پیدا نشد");
						}
					}
					else {
						SketchwareUtil.showMessage(getApplicationContext(), "فایل jar");
					}
				}
			}
		} catch (Exception e) {
			NinjaCodermain.CustomToast(getApplicationContext(), e.toString(), 0xFFFFFFFF, 14, 0xFF00003A, 25,NinjaCodermain.TOP , 2);
		}
	}
	
	
	public void _gitlib() {
	}
	public Context _getMyContext(Context c) {
		return c;
	}
	public Context _getMyContext(Fragment f) {
		return f.getActivity();
	}
	public Context _getMyContext(DialogFragment df) {
		return df.getActivity();
	}
	{
	}
	
	
	public void _ConvertDexToJar(final String _DexPath, final String _JarPath) {
		try {
			Dex2jar.from(new java.io.File(_DexPath)).to(new java.io.File(_JarPath));
		} catch(java.io.IOException e) {
				 
				     //showMessage(e);
		}
	}
	public static abstract class _BackgroundTaskClass {
		
		    private Activity activity;
		    public _BackgroundTaskClass(Activity activity) {
				        this.activity = activity;
				    }
		public _BackgroundTaskClass(Fragment activity) {
				        this.activity = activity.getActivity();
				    }
		public _BackgroundTaskClass(DialogFragment activity) {
				        this.activity = activity.getActivity();
				    }
		
		    private void startBackground() {
				        new Thread(new Runnable() {
						            public void run() {
								Looper.prepare();
								                doInBackground();
								                activity.runOnUiThread(new Runnable() {
										                    public void run() {
												
												                        onPostExecute();
												                    }
										                });
								            }
						        }).start();
				    }
		    public void execute(){
				        startBackground();
				    }
		
		    public abstract void doInBackground();
		    public abstract void onPostExecute();
		
	}
	{
	}
	
	
	public void _DoInBackground() {
	}
	public static abstract class _BackgroundTaskClass2 {
		
		    private Activity activity;
		    public _BackgroundTaskClass2(Activity activity) {
				        this.activity = activity;
				    }
		public _BackgroundTaskClass2(Fragment activity) {
				        this.activity = activity.getActivity();
				    }
		public _BackgroundTaskClass2(DialogFragment activity) {
				        this.activity = activity.getActivity();
				    }
		
		    private void startBackground() {
				        new Thread(new Runnable() {
						            public void run() {
								Looper.prepare();
								                doInBackground();
								                activity.runOnUiThread(new Runnable() {
										                    public void run() {
												
												                        onPostExecute();
												                    }
										                });
								            }
						        }).start();
				    }
		    public void execute(){
				        startBackground();
				    }
		
		    public abstract void doInBackground();
		    public abstract void onPostExecute();
		
	}
	{
	}
	
	
	public void _jar2dex(final String _input, final String _output) {
		try {
			java.io.File file = new java.io.File(_output);
			java.io.File file2 = new java.io.File(_input);
			if (!file.exists()) {
				file.createNewFile();
			}
			String[] strArr2 = new String[3];
			strArr2[0] = "--dex";
			StringBuffer stringBuffer = new StringBuffer();
			StringBuffer stringBuffer2 = new StringBuffer();
			strArr2[1] = stringBuffer.append("--output=").append(file.getAbsolutePath()).toString();
			strArr2[2] = _input;
			com.android.dx.command.Main.main(strArr2);
			if (FileUtil.getFileLength(file.getAbsolutePath()) > 1) {
			}
		}
		catch (Exception e) {
		}
	}
	
	
	public void _tamal(final String _filePath, final TextView _textview) {
		java.io.File file = new java.io.File(_filePath);
		double bytes = file.length();
		double kiloBytes = bytes/1024;
		double megaBytes = kiloBytes/1024;
		double gigaBytes = megaBytes/1024;
		double mDouble = 0;
		String mString = null;
		if ((int)gigaBytes > 0) {
			mDouble = gigaBytes;
			mString = "GB";
		} else {
			if((int)megaBytes > 0) {
				mDouble = megaBytes;
				mString = "MB";
			} else {
				if((int)kiloBytes > 0) {
					mDouble = kiloBytes;
					mString = "KB";
				} else {
					mDouble = bytes;
					mString = "B";
				}}}
		String pattern = String.format("0.00 %s",  mString);
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
		_textview.setText(decimalFormat.format(mDouble));
	}
	
	
	public void _getApkIcon(final String _path, final ImageView _imageview) {
		try {
			android.content.pm.PackageManager packageManager = this.getPackageManager();
			android.content.pm.PackageInfo packageInfo = packageManager.getPackageArchiveInfo(_path, 0);
			packageInfo.applicationInfo.sourceDir = _path;
			packageInfo.applicationInfo.publicSourceDir = _path;
			_imageview.setImageDrawable(packageInfo.applicationInfo.loadIcon(packageManager));
			packageInfo = null;
			packageManager = null;
		} catch (Exception e) {
			_imageview.setImageResource(R.drawable.android);
		}
	}
	
	
	public void _apksingerlibrary() {
	}
	private void signedFile(final File file){
		try {
			String outFile =file.getAbsolutePath();
			FileUtil.makeDir(FileUtil.getExternalStorageDir().concat("/vscodemobile/"));
			out = FileUtil.getExternalStorageDir().concat("/vscodemobile/".concat(Uri.parse(outFile).getLastPathSegment().replace(".apk", "").concat("-signedfilevscodemobile.apk")));
			apksigner.Main.sign(file,out);
			SketchwareUtil.CustomToast(getApplicationContext(), "Success - ".concat(Uri.parse(out).getLastPathSegment()), 0xFFFFFFFF, 14, 0xFFE91E63, 20, SketchwareUtil.BOTTOM);
		} catch (Exception e) {
			SketchwareUtil.showMessage(getApplicationContext(), e.toString());
		}
	}{
	}
	
	
	public void _imagerviewerclass(final ArrayList<HashMap<String, Object>> _type, final double _pos, final String _path) {
		if (_type.get((int)_pos).get(_path).toString().endsWith(".jpg") || _type.get((int)_pos).get(_path).toString().endsWith(".png")) {
			try {
				final AlertDialog dialog1 = new AlertDialog.Builder(FilesActivity.this).create();
				View inflate = getLayoutInflater().inflate(R.layout.imageviewer,null); 
				dialog1.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
				dialog1.setView(inflate);
				androidx.cardview.widget.CardView card = (androidx.cardview.widget.CardView) inflate.findViewById(R.id.card);
				LinearLayout bg = (LinearLayout) inflate.findViewById(R.id.bg);
				ImageView image = (ImageView) inflate.findViewById(R.id.image);
				ImageView close = (ImageView) inflate.findViewById(R.id.close);
				TextView pa = (TextView) inflate.findViewById(R.id.pa);
				pa.setEllipsize(TextUtils.TruncateAt.MARQUEE);
				pa.setMarqueeRepeatLimit(-1);
				pa.setSingleLine(true);
				pa.setSelected(true);
				card.setCardBackgroundColor(0xFF000027);
				card.setRadius((float)22);
				card.setCardElevation((float)1);
				pa.setText(Uri.parse(_type.get((int)_pos).get(_path).toString()).getLastPathSegment());
				image.setImageBitmap(FileUtil.decodeSampleBitmapFromPath(_type.get((int)_pos).get(_path).toString(), 1024, 1024));
				close.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
								
							dialog1.dismiss();
						
						}
				});
				dialog1.setCancelable(true);
				dialog1.show();
			} catch (Exception e) {
				 
			}
		}
	}
	
	
	public void _setproColor(final ProgressBar _proColors, final TimerTask _Timerask) {
		maintimer = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						maintimer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										if (android.os.Build.VERSION.SDK_INT >= 21) {
												_proColors.getIndeterminateDrawable().setColorFilter(Color.parseColor("#FFFFB200"), PorterDuff.Mode.SRC_IN);
										}
									}
								});
							}
						};
						_timer.schedule(maintimer, (int)(1000));
						maintimer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										if (android.os.Build.VERSION.SDK_INT >= 21) {
												_proColors.getIndeterminateDrawable().setColorFilter(Color.parseColor("#FFFF4C00"), PorterDuff.Mode.SRC_IN);
										}
									}
								});
							}
						};
						_timer.schedule(maintimer, (int)(2000));
						maintimer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										if (android.os.Build.VERSION.SDK_INT >= 21) {
												_proColors.getIndeterminateDrawable().setColorFilter(Color.parseColor("#FF00CCFF"), PorterDuff.Mode.SRC_IN);
										}
									}
								});
							}
						};
						_timer.schedule(maintimer, (int)(3000));
						maintimer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										if (android.os.Build.VERSION.SDK_INT >= 21) {
												_proColors.getIndeterminateDrawable().setColorFilter(Color.parseColor("#FFD400FF"), PorterDuff.Mode.SRC_IN);
										}
									}
								});
							}
						};
						_timer.schedule(maintimer, (int)(4000));
						maintimer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										if (android.os.Build.VERSION.SDK_INT >= 21) {
												_proColors.getIndeterminateDrawable().setColorFilter(Color.parseColor("#FF2EFF63"), PorterDuff.Mode.SRC_IN);
										}
									}
								});
							}
						};
						_timer.schedule(maintimer, (int)(5000));
						maintimer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										if (android.os.Build.VERSION.SDK_INT >= 21) {
												_proColors.getIndeterminateDrawable().setColorFilter(Color.parseColor("#FFFF1E60"), PorterDuff.Mode.SRC_IN);
										}
									}
								});
							}
						};
						_timer.schedule(maintimer, (int)(6000));
						maintimer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										if (android.os.Build.VERSION.SDK_INT >= 21) {
												_proColors.getIndeterminateDrawable().setColorFilter(Color.parseColor("#FFF4FF50"), PorterDuff.Mode.SRC_IN);
										}
									}
								});
							}
						};
						_timer.schedule(maintimer, (int)(7000));
						maintimer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										if (android.os.Build.VERSION.SDK_INT >= 21) {
												_proColors.getIndeterminateDrawable().setColorFilter(Color.parseColor("#FFCAFF0C"), PorterDuff.Mode.SRC_IN);
										}
									}
								});
							}
						};
						_timer.schedule(maintimer, (int)(8000));
						maintimer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										if (android.os.Build.VERSION.SDK_INT >= 21) {
												_proColors.getIndeterminateDrawable().setColorFilter(Color.parseColor("#FF0082FF"), PorterDuff.Mode.SRC_IN);
										}
									}
								});
							}
						};
						_timer.schedule(maintimer, (int)(9000));
						maintimer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										if (android.os.Build.VERSION.SDK_INT >= 21) {
												_proColors.getIndeterminateDrawable().setColorFilter(Color.parseColor("#FF7BE9FF"), PorterDuff.Mode.SRC_IN);
										}
									}
								});
							}
						};
						_timer.schedule(maintimer, (int)(10000));
						maintimer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										if (android.os.Build.VERSION.SDK_INT >= 21) {
												_proColors.getIndeterminateDrawable().setColorFilter(Color.parseColor("#FFFF000F"), PorterDuff.Mode.SRC_IN);
										}
									}
								});
							}
						};
						_timer.schedule(maintimer, (int)(11000));
						maintimer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										if (android.os.Build.VERSION.SDK_INT >= 21) {
												_proColors.getIndeterminateDrawable().setColorFilter(Color.parseColor("#FFFF81F5"), PorterDuff.Mode.SRC_IN);
										}
									}
								});
							}
						};
						_timer.schedule(maintimer, (int)(12000));
						maintimer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										if (android.os.Build.VERSION.SDK_INT >= 21) {
												_proColors.getIndeterminateDrawable().setColorFilter(Color.parseColor("#FFFFFCE6"), PorterDuff.Mode.SRC_IN);
										}
									}
								});
							}
						};
						_timer.schedule(maintimer, (int)(13000));
						maintimer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										if (android.os.Build.VERSION.SDK_INT >= 21) {
												_proColors.getIndeterminateDrawable().setColorFilter(Color.parseColor("#FFFF00C6"), PorterDuff.Mode.SRC_IN);
										}
									}
								});
							}
						};
						_timer.schedule(maintimer, (int)(14000));
						maintimer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										if (android.os.Build.VERSION.SDK_INT >= 21) {
												_proColors.getIndeterminateDrawable().setColorFilter(Color.parseColor("#FF010001"), PorterDuff.Mode.SRC_IN);
										}
									}
								});
							}
						};
						_timer.schedule(maintimer, (int)(15000));
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(maintimer, (int)(0), (int)(1000));
	}
	
	
	public void _ninjacoder() {
	}
	public static class SpinKitView extends ProgressBar {
		    private Style mStyle;
		    private int _style;
		    private int mColor;
		    private Sprite mSprite;
		    public SpinKitView(Context context) {
			        this(context, null);
			    }
		    public SpinKitView(Context context, AttributeSet attrs) {
			        this(context, attrs, 0);
			    }
		    public SpinKitView(Context context, AttributeSet attrs, int defStyleAttr) {
			        this(context, attrs, defStyleAttr, 0); 
			    }
		    public SpinKitView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
			        super(context, attrs, defStyleAttr, defStyleRes);
			        mStyle = Style.ROTATING_PLANE; 
			        mColor = Color.WHITE;
			        init();
			        setIndeterminate(true);
			    }
		    private void init() {
			        Sprite sprite = SpriteFactory.create(mStyle);
			        sprite.setColor(mColor);
			        setIndeterminateDrawable(sprite);
			    }
		    public void setStyle(Style _s) {
			    	this.mStyle = _s;
			        Sprite sprite = SpriteFactory.create(_s);
			        sprite.setColor(mColor);
			        setIndeterminateDrawable(sprite);
			        invalidate();
			    }
		    @Override
		    public void setIndeterminateDrawable(android.graphics.drawable.Drawable d) {
			        if (!(d instanceof Sprite)) {
				            throw new IllegalArgumentException("this d must be instanceof Sprite");
				        }
			        setIndeterminateDrawable((Sprite) d);
			    }
		    public void setIndeterminateDrawable(Sprite d) {
			        super.setIndeterminateDrawable(d);
			        mSprite = d;
			        if (mSprite.getColor() == 0) {
				            mSprite.setColor(mColor);
				        }
			        onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
			        if (getVisibility() == VISIBLE) {
				            mSprite.start();
				        }
			    }
		    @Override
		    public Sprite getIndeterminateDrawable() {
			        return mSprite;
			    }
		    public void setColor(int color) {
			        this.mColor = color;
			        if (mSprite != null) {
				            mSprite.setColor(color);
				        }
			        invalidate();
			    }
		    @Override
		    public void unscheduleDrawable(android.graphics.drawable.Drawable who) {
			        super.unscheduleDrawable(who);
			        if (who instanceof Sprite) {
				            ((Sprite) who).stop();
				        }
			    }
		    @Override
		    public void onWindowFocusChanged(boolean hasWindowFocus) {
			        super.onWindowFocusChanged(hasWindowFocus);
			        if (hasWindowFocus) {
				            if (mSprite != null && getVisibility() == VISIBLE) {
					                mSprite.start();
					            }
				        }
			    }
		    @Override
		    public void onScreenStateChanged(int screenState) {
			        super.onScreenStateChanged(screenState);
			        if (screenState == View.SCREEN_STATE_OFF) {
				            if (mSprite != null) {
					                mSprite.stop();
					            }
				        }
			    }
	}
	
	public static class SpriteFactory {
		    public static Sprite create(Style style) {
			        Sprite sprite = null;
			        switch (style) {
				            case ROTATING_PLANE:
				                sprite = new RotatingPlane();
				                break;
				            case DOUBLE_BOUNCE:
				                sprite = new DoubleBounce();
				                break;
				            case WAVE:
				                sprite = new Wave();
				                break;
				            case WANDERING_CUBES:
				                sprite = new WanderingCubes();
				                break;
				            case PULSE:
				                sprite = new Pulse();
				                break;
				            case CHASING_DOTS:
				                sprite = new ChasingDots();
				                break;
				            case THREE_BOUNCE:
				                sprite = new ThreeBounce();
				                break;
				            case CIRCLE:
				                sprite = new Circle();
				                break;
				            case CUBE_GRID:
				                sprite = new CubeGrid();
				                break;
				            case FADING_CIRCLE:
				                sprite = new FadingCircle();
				                break;
				            case FOLDING_CUBE:
				                sprite = new FoldingCube();
				                break;
				            case ROTATING_CIRCLE:
				                sprite = new RotatingCircle();
				                break;
				            case MULTIPLE_PULSE:
				                sprite = new MultiplePulse();
				                break;
				            case PULSE_RING:
				                sprite = new PulseRing();
				                break;
				            case MULTIPLE_PULSE_RING:
				                sprite = new MultiplePulseRing();
				                break;
				            default:
				                break;
				        }
			        return sprite;
			    }
	}
	
	public static enum Style {
		    ROTATING_PLANE(0),
		    DOUBLE_BOUNCE(1),
		    WAVE(2),
		    WANDERING_CUBES(3),
		    PULSE(4),
		    CHASING_DOTS(5),
		    THREE_BOUNCE(6),
		    CIRCLE(7),
		    CUBE_GRID(8),
		    FADING_CIRCLE(9),
		    FOLDING_CUBE(10),
		    ROTATING_CIRCLE(11),
		    MULTIPLE_PULSE(12),
		    PULSE_RING(13),
		    MULTIPLE_PULSE_RING(14);
		    @SuppressWarnings({"FieldCanBeLocal", "unused"})
		    private int value;
		    Style(int value) {
			        this.value = value;
			    }
	}
	
	public static class Circle extends CircleLayoutContainer {
		    @Override
		    public Sprite[] onCreateChild() {
			        Dot[] dots = new Dot[12];
			        for (int i = 0; i < dots.length; i++) {
				            dots[i] = new Dot();
				            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
					                dots[i].setAnimationDelay(1200 / 12 * i);
					            } else {
					                dots[i].setAnimationDelay(1200 / 12 * i + -1200);
					            }
				        }
			        return dots;
			    }
		    private class Dot extends CircleSprite {
			        Dot() {
				            setScale(0f);
				        }
			        @Override
			        public ValueAnimator onCreateAnimation() {
				            float fractions[] = new float[]{0f, 0.5f, 1f};
				            return new SpriteAnimatorBuilder(this).
				                    scale(fractions, 0f, 1f, 0f).
				                    duration(1200).
				                    easeInOut(fractions)
				                    .build();
				        }
			    }
	}
	
	public static class ChasingDots extends SpriteContainer {
		    @Override
		    public Sprite[] onCreateChild() {
			        return new Sprite[]{
				                new Dot(),
				                new Dot()
				        };
			    }
		    @Override
		    public void onChildCreated(Sprite... sprites) {
			        super.onChildCreated(sprites);
			        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
				            sprites[1].setAnimationDelay(1000);
				        } else {
				            sprites[1].setAnimationDelay(-1000);
				        }
			    }
		    @Override
		    public ValueAnimator onCreateAnimation() {
			        float fractions[] = new float[]{0f, 1f};
			        return new SpriteAnimatorBuilder(this).
			                rotate(fractions, 0, 360).
			                duration(2000).
			                interpolator(new LinearInterpolator()).
			                build();
			    }
		    @Override
		    protected void onBoundsChange(Rect bounds) {
			        super.onBoundsChange(bounds);
			        bounds = clipSquare(bounds);
			        int drawW = (int) (bounds.width() * 0.6f);
			        getChildAt(0).setDrawBounds(
			                bounds.right - drawW,
			                bounds.top,
			                bounds.right
			                , bounds.top + drawW
			        );
			        getChildAt(1).setDrawBounds(
			                bounds.right - drawW,
			                bounds.bottom - drawW,
			                bounds.right,
			                bounds.bottom
			        );
			    }
		    private class Dot extends CircleSprite {
			        Dot() {
				            setScale(0f);
				        }
			        @Override
			        public ValueAnimator onCreateAnimation() {
				            float fractions[] = new float[]{0f, 0.5f, 1f};
				            return new SpriteAnimatorBuilder(this).
				                    scale(fractions, 0f, 1f, 0f).
				                    duration(2000).
				                    easeInOut(fractions)
				                    .build();
				        }
			    }
	}
	
	public static class ThreeBounce extends SpriteContainer {
		    @Override
		    public Sprite[] onCreateChild() {
			        return new Sprite[]{
				                new Bounce(),
				                new Bounce(),
				                new Bounce()
				        };
			    }
		    @Override
		    public void onChildCreated(Sprite... sprites) {
			        super.onChildCreated(sprites);
			        sprites[1].setAnimationDelay(160);
			        sprites[2].setAnimationDelay(320);
			    }
		    @Override
		    protected void onBoundsChange(Rect bounds) {
			        super.onBoundsChange(bounds);
			        bounds = clipSquare(bounds);
			        int radius = bounds.width() / 8;
			        int top = bounds.centerY() - radius;
			        int bottom = bounds.centerY() + radius;
			        for (int i = 0; i < getChildCount(); i++) {
				            int left = bounds.width() * i / 3
				                    + bounds.left;
				            getChildAt(i).setDrawBounds(
				                    left, top, left + radius * 2, bottom
				            );
				        }
			    }
		    private class Bounce extends CircleSprite {
			        Bounce() {
				            setScale(0f);
				        }
			        @Override
			        public ValueAnimator onCreateAnimation() {
				            float fractions[] = new float[]{0f, 0.4f, 0.8f, 1f};
				            return new SpriteAnimatorBuilder(this).scale(fractions, 0f, 1f, 0f, 0f).
				                    duration(1400).
				                    easeInOut(fractions)
				                    .build();
				        }
			    }
	}
	
	public static class WanderingCubes extends SpriteContainer {
		    @Override
		    public Sprite[] onCreateChild() {
			        return new Sprite[]{
				                new Cube(0),
				                new Cube(3)
				        };
			    }
		    @Override
		    public void onChildCreated(Sprite... sprites) {
			        super.onChildCreated(sprites);
			        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
				            sprites[1].setAnimationDelay(-900);
				        }
			    }
		    @Override
		    protected void onBoundsChange(Rect bounds) {
			        bounds = clipSquare(bounds);
			        super.onBoundsChange(bounds);
			        for (int i = 0; i < getChildCount(); i++) {
				            Sprite sprite = getChildAt(i);
				            sprite.setDrawBounds(
				                    bounds.left,
				                    bounds.top,
				                    bounds.left + bounds.width() / 4,
				                    bounds.top + bounds.height() / 4
				            );
				        }
			    }
		    private class Cube extends RectSprite {
			        int startFrame;
			        public Cube(int startFrame) {
				            this.startFrame = startFrame;
				        }
			        @Override
			        public ValueAnimator onCreateAnimation() {
				            float fractions[] = new float[]{0f, 0.25f, 0.5f, 0.51f, 0.75f, 1f};
				            SpriteAnimatorBuilder builder = new SpriteAnimatorBuilder(this).
				                    rotate(fractions, 0, -90, -179, -180, -270, -360).
				                    translateXPercentage(fractions, 0f, 0.75f, 0.75f, 0.75f, 0f, 0f).
				                    translateYPercentage(fractions, 0f, 0f, 0.75f, 0.75f, 0.75f, 0f).
				                    scale(fractions, 1f, 0.5f, 1f, 1f, 0.5f, 1f).
				                    duration(1800).
				                    easeInOut(fractions);
				            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
					                builder.
					                        startFrame(startFrame);
					            }
				            return builder.build();
				        }
			    }
	}
	
	public static class CubeGrid extends SpriteContainer {
		    @Override
		    public Sprite[] onCreateChild() {
			        int delays[] = new int[]{
				                200, 300, 400
				                , 100, 200, 300
				                , 0, 100, 200
				        };
			        GridItem[] gridItems = new GridItem[9];
			        for (int i = 0; i < gridItems.length; i++) {
				            gridItems[i] = new GridItem();
				            gridItems[i].setAnimationDelay(delays[i]);
				        }
			        return gridItems;
			    }
		    @Override
		    protected void onBoundsChange(Rect bounds) {
			        super.onBoundsChange(bounds);
			        bounds = clipSquare(bounds);
			        int width = (int) (bounds.width() * 0.33f);
			        int height = (int) (bounds.height() * 0.33f);
			        for (int i = 0; i < getChildCount(); i++) {
				            int x = i % 3;
				            int y = i / 3;
				            int l = bounds.left + x * width;
				            int t = bounds.top + y * height;
				            Sprite sprite = getChildAt(i);
				            sprite.setDrawBounds(l, t, l + width, t + height);
				        }
			    }
		    private class GridItem extends RectSprite {
			        @Override
			        public ValueAnimator onCreateAnimation() {
				            float fractions[] = new float[]{0f, 0.35f, 0.7f, 1f};
				            return new SpriteAnimatorBuilder(this).
				                    scale(fractions, 1f, 0f, 1f, 1f).
				                    duration(1300).
				                    easeInOut(fractions)
				                    .build();
				        }
			    }
	}
	
	public static class DoubleBounce extends SpriteContainer {
		    @Override
		    public Sprite[] onCreateChild() {
			        return new Sprite[]{
				                new Bounce(), new Bounce()
				        };
			    }
		    @Override
		    public void onChildCreated(Sprite... sprites) {
			        super.onChildCreated(sprites);
			        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
				            sprites[1].setAnimationDelay(1000);
				        } else {
				            sprites[1].setAnimationDelay(-1000);
				        }
			    }
		    private class Bounce extends CircleSprite {
			        Bounce() {
				            setAlpha(153);
				            setScale(0f);
				        }
			        @Override
			        public ValueAnimator onCreateAnimation() {
				            float fractions[] = new float[]{0f, 0.5f, 1f};
				            return new SpriteAnimatorBuilder(this).scale(fractions, 0f, 1f, 0f).
				                    duration(2000).
				                    easeInOut(fractions)
				                    .build();
				        }
			    }
	}
	
	public static class FadingCircle extends CircleLayoutContainer {
		    @Override
		    public Sprite[] onCreateChild() {
			        Dot[] dots = new Dot[12];
			        for (int i = 0; i < dots.length; i++) {
				            dots[i] = new Dot();
				            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
					                dots[i].setAnimationDelay(1200 / 12 * i);
					            } else {
					                dots[i].setAnimationDelay(1200 / 12 * i + -1200);
					            }
				        }
			        return dots;
			    }
		    private class Dot extends CircleSprite {
			        Dot() {
				            setAlpha(0);
				        }
			        @Override
			        public ValueAnimator onCreateAnimation() {
				            float fractions[] = new float[]{0f, 0.39f, 0.4f, 1f};
				            return new SpriteAnimatorBuilder(this).
				                    alpha(fractions, 0, 0, 255, 0).
				                    duration(1200).
				                    easeInOut(fractions).build();
				        }
			    }
	}
	
	public static class FoldingCube extends SpriteContainer {
		    @SuppressWarnings("FieldCanBeLocal")
		    private boolean wrapContent = false;
		    @Override
		    public Sprite[] onCreateChild() {
			        Cube[] cubes
			                = new Cube[4];
			        for (int i = 0; i < cubes.length; i++) {
				            cubes[i] = new Cube();
				
				            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
					                cubes[i].setAnimationDelay(300 * i);
					            } else {
					                cubes[i].setAnimationDelay(300 * i - 1200);
					            }
				        }
			        return cubes;
			    }
		    @Override
		    protected void onBoundsChange(Rect bounds) {
			        super.onBoundsChange(bounds);
			        bounds = clipSquare(bounds);
			        int size = Math.min(bounds.width(), bounds.height());
			        if (wrapContent) {
				            size = (int) Math.sqrt(
				                    (size
				                            * size) / 2);
				            int oW = (bounds.width() - size) / 2;
				            int oH = (bounds.height() - size) / 2;
				            bounds = new Rect(
				                    bounds.left + oW,
				                    bounds.top + oH,
				                    bounds.right - oW,
				                    bounds.bottom - oH
				            );
				        }
			        int px = bounds.left + size / 2 + 1;
			        int py = bounds.top + size / 2 + 1;
			        for (int i = 0; i < getChildCount(); i++) {
				            Sprite sprite = getChildAt(i);
				            sprite.setDrawBounds(
				                    bounds.left,
				                    bounds.top,
				                    px,
				                    py
				            );
				            sprite.setPivotX(sprite.getDrawBounds().right);
				            sprite.setPivotY(sprite.getDrawBounds().bottom);
				        }
			    }
		    @Override
		    public void drawChild(Canvas canvas) {
			        Rect bounds = clipSquare(getBounds());
			        for (int i = 0; i < getChildCount(); i++) {
				            int count = canvas.save();
				            canvas.rotate(45 + i * 90, bounds.centerX(), bounds.centerY());
				            Sprite sprite = getChildAt(i);
				            sprite.draw(canvas);
				            canvas.restoreToCount(count);
				        }
			    }
		    private class Cube extends RectSprite {
			        Cube() {
				            setAlpha(0);
				            setRotateX(-180);
				        }
			        @Override
			        public ValueAnimator onCreateAnimation() {
				            float fractions[] = new float[]{0f, 0.1f, 0.25f, 0.75f, 0.9f, 1f};
				            return new SpriteAnimatorBuilder(this).
				                    alpha(fractions, 0, 0, 255, 255, 0, 0).
				                    rotateX(fractions, -180, -180, 0, 0, 0, 0).
				                    rotateY(fractions, 0, 0, 0, 0, 180, 180).
				                    duration(2400).
				                    interpolator(new LinearInterpolator())
				                    .build();
				        }
			    }
	}
	
	public static class MultiplePulse extends SpriteContainer {
		    @Override
		    public Sprite[] onCreateChild() {
			        return new Sprite[]{
				                new Pulse(),
				                new Pulse(),
				                new Pulse(),
				        };
			    }
		    @Override
		    public void onChildCreated(Sprite... sprites) {
			        for (int i = 0; i < sprites.length; i++) {
				            sprites[i].setAnimationDelay(200 * (i + 1));
				        }
			    }
	}
	
	public static class MultiplePulseRing extends SpriteContainer {
		    @Override
		    public Sprite[] onCreateChild() {
			        return new Sprite[]{
				                new PulseRing(),
				                new PulseRing(),
				                new PulseRing(),
				        };
			    }
		    @Override
		    public void onChildCreated(Sprite... sprites) {
			        for (int i = 0; i < sprites.length; i++) {
				            sprites[i].setAnimationDelay(200 * (i + 1));
				        }
			    }
	}
	
	public static class Pulse extends CircleSprite {
		    public Pulse() {
			        setScale(0f);
			    }
		    @Override
		    public ValueAnimator onCreateAnimation() {
			        float fractions[] = new float[]{0f, 1f};
			        return new SpriteAnimatorBuilder(this).
			                scale(fractions, 0f, 1f).
			                alpha(fractions, 255, 0).
			                duration(1000).
			                easeInOut(fractions)
			                .build();
			    }
	}
	
	public static class PulseRing extends RingSprite {
		    public PulseRing() {
			        setScale(0f);
			    }
		    @Override
		    public ValueAnimator onCreateAnimation() {
			        float fractions[] = new float[]{0f, 0.7f, 1f};
			        return new SpriteAnimatorBuilder(this).
			                scale(fractions, 0f, 1f, 1f).
			                alpha(fractions, 255, (int) (255 * 0.7), 0).
			                duration(1000).
			                interpolator(KeyFrameInterpolator.pathInterpolator(0.21f, 0.53f, 0.56f, 0.8f, fractions)).
			                build();
			    }
	}
	
	public static class RotatingCircle extends CircleSprite {
		    @Override
		    public ValueAnimator onCreateAnimation() {
			        float fractions[] = new float[]{0f, 0.5f, 1f};
			        return new SpriteAnimatorBuilder(this).
			                rotateX(fractions, 0, -180, -180).
			                rotateY(fractions, 0, 0, -180).
			                duration(1200).
			                easeInOut(fractions)
			                .build();
			    }
	}
	
	public static class RotatingPlane extends RectSprite {
		    @Override
		    protected void onBoundsChange(Rect bounds) {
			        setDrawBounds(clipSquare(bounds));
			    }
		    @Override
		    public ValueAnimator onCreateAnimation() {
			        float fractions[] = new float[]{0f, 0.5f, 1f};
			        return new SpriteAnimatorBuilder(this).
			                rotateX(fractions, 0, -180, -180).
			                rotateY(fractions, 0, 0, -180).
			                duration(1200).
			                easeInOut(fractions)
			                .build();
			    }
	}
	
	public static class Wave extends SpriteContainer {
		    @Override
		    public Sprite[] onCreateChild() {
			        WaveItem[] waveItems = new WaveItem[5];
			        for (int i = 0; i < waveItems.length; i++) {
				            waveItems[i] = new WaveItem();
				            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
					                waveItems[i].setAnimationDelay(600 + i * 100);
					            } else {
					                waveItems[i].setAnimationDelay(-1200 + i * 100);
					            }
				
				        }
			        return waveItems;
			    }
		    @Override
		    protected void onBoundsChange(Rect bounds) {
			        super.onBoundsChange(bounds);
			        bounds = clipSquare(bounds);
			        int rw = bounds.width() / getChildCount();
			        int width = bounds.width() / 5 * 3 / 5;
			        for (int i = 0; i < getChildCount(); i++) {
				            Sprite sprite = getChildAt(i);
				            int l = bounds.left + i * rw + rw / 5;
				            int r = l + width;
				            sprite.setDrawBounds(l, bounds.top, r, bounds.bottom);
				        }
			    }
		    private class WaveItem extends RectSprite {
			        WaveItem() {
				            setScaleY(0.4f);
				        }
			        @Override
			        public ValueAnimator onCreateAnimation() {
				            float fractions[] = new float[]{0f, 0.2f, 0.4f, 1f};
				            return new SpriteAnimatorBuilder(this).scaleY(fractions, 0.4f, 1f, 0.4f, 0.4f).
				                    duration(1200).
				                    easeInOut(fractions)
				                    .build();
				        }
			    }
	}
	
	public static class RectSprite extends ShapeSprite {
		    @Override
		    public ValueAnimator onCreateAnimation() {
			        return null;
			    }
		    @Override
		    public void drawShape(Canvas canvas, Paint paint) {
			        if (getDrawBounds() != null) {
				            canvas.drawRect(getDrawBounds(), paint);
				        }
			    }
	}
	
	public static abstract class ShapeSprite extends Sprite {
		    private Paint mPaint;
		    private int mUseColor;
		    private int mBaseColor;
		    public ShapeSprite() {
			        setColor(Color.WHITE);
			        mPaint = new Paint();
			        mPaint.setAntiAlias(true);
			        mPaint.setColor(mUseColor);
			    }
		    @Override
		    public void setColor(int color) {
			        mBaseColor = color;
			        updateUseColor();
			    }
		    @Override
		    public int getColor() {
			        return mBaseColor;
			    }
		    @SuppressWarnings("unused")
		    public int getUseColor() {
			        return mUseColor;
			    }
		    @Override
		    public void setAlpha(int alpha) {
			        super.setAlpha(alpha);
			        updateUseColor();
			    }
		    private void updateUseColor() {
			        int alpha = getAlpha();
			        alpha += alpha >> 7;
			        final int baseAlpha = mBaseColor >>> 24;
			        final int useAlpha = baseAlpha * alpha >> 8;
			        mUseColor = (mBaseColor << 8 >>> 8) | (useAlpha << 24);
			    }
		    @Override
		    public void setColorFilter(ColorFilter colorFilter) {
			        mPaint.setColorFilter(colorFilter);
			    }
		    @Override
		    protected final void drawSelf(Canvas canvas) {
			        mPaint.setColor(mUseColor);
			        drawShape(canvas, mPaint);
			    }
		    public abstract void drawShape(Canvas canvas, Paint paint);
	}
	
	public static abstract class SpriteContainer extends Sprite {
		    private Sprite[] sprites;
		    private int color;
		    public SpriteContainer() {
			        sprites = onCreateChild();
			        initCallBack();
			        onChildCreated(sprites);
			    }
		    private void initCallBack() {
			        if (sprites != null) {
				            for (Sprite sprite : sprites) {
					                sprite.setCallback(this);
					            }
				        }
			    }
		    public void onChildCreated(Sprite... sprites) {
			    }
		    public int getChildCount() {
			        return sprites == null ? 0 : sprites.length;
			    }
		    public Sprite getChildAt(int index) {
			        return sprites == null ? null : sprites[index];
			    }
		    @Override
		    public void setColor(int color) {
			        this.color = color;
			        for (int i = 0; i < getChildCount(); i++) {
				            getChildAt(i).setColor(color);
				        }
			    }
		    @Override
		    public int getColor() {
			        return color;
			    }
		    @Override
		    public void draw(Canvas canvas) {
			        super.draw(canvas);
			        drawChild(canvas);
			    }
		    public void drawChild(Canvas canvas) {
			        if (sprites != null) {
				            for (Sprite sprite : sprites) {
					                int count = canvas.save();
					                sprite.draw(canvas);
					                canvas.restoreToCount(count);
					            }
				        }
			    }
		    @Override
		    protected void drawSelf(Canvas canvas) {
			    }
		    @Override
		    protected void onBoundsChange(Rect bounds) {
			        super.onBoundsChange(bounds);
			        for (Sprite sprite : sprites) {
				            sprite.setBounds(bounds);
				        }
			    }
		    @Override
		    public void start() {
			        super.start();
			        AnimationUtils.start(sprites);
			    }
		    @Override
		    public void stop() {
			        super.stop();
			        AnimationUtils.stop(sprites);
			    }
		    @Override
		    public boolean isRunning() {
			        return AnimationUtils.isRunning(sprites) || super.isRunning();
			    }
		    public abstract Sprite[] onCreateChild();
		    @Override
		    public ValueAnimator onCreateAnimation() {
			        return null;
			    }
	}
	
	public static abstract class Sprite extends android.graphics.drawable.Drawable implements
	        ValueAnimator.AnimatorUpdateListener
	        , android.graphics.drawable.Animatable
	        , android.graphics.drawable.Drawable.Callback {
		    private float scale = 1;
		    private float scaleX = 1;
		    private float scaleY = 1;
		    private float pivotX;
		    private float pivotY;
		    private int animationDelay;
		    private int rotateX;
		    private int rotateY;
		    private int translateX;
		    private int translateY;
		    private int rotate;
		    private float translateXPercentage;
		    private float translateYPercentage;
		    private ValueAnimator animator;
		    private int alpha = 255;
		    private static final Rect ZERO_BOUNDS_RECT = new Rect();
		    protected Rect drawBounds = ZERO_BOUNDS_RECT;
		    private Camera mCamera;
		    private Matrix mMatrix;
		    public Sprite() {
			        mCamera = new Camera();
			        mMatrix = new Matrix();
			    }
		    public abstract int getColor();
		    public abstract void setColor(int color);
		    @Override
		    public void setAlpha(int alpha) {
			        this.alpha = alpha;
			    }
		    @Override
		    public int getAlpha() {
			        return alpha;
			    }
		    @Override
		    public int getOpacity() {
			        return PixelFormat.TRANSLUCENT;
			    }
		    public float getTranslateXPercentage() {
			        return translateXPercentage;
			    }
		    public void setTranslateXPercentage(float translateXPercentage) {
			        this.translateXPercentage = translateXPercentage;
			    }
		    public float getTranslateYPercentage() {
			        return translateYPercentage;
			    }
		    public void setTranslateYPercentage(float translateYPercentage) {
			        this.translateYPercentage = translateYPercentage;
			    }
		    public int getTranslateX() {
			        return translateX;
			    }
		    public void setTranslateX(int translateX) {
			        this.translateX = translateX;
			    }
		    public int getTranslateY() {
			        return translateY;
			    }
		    public void setTranslateY(int translateY) {
			        this.translateY = translateY;
			    }
		    public int getRotate() {
			        return rotate;
			    }
		    public void setRotate(int rotate) {
			        this.rotate = rotate;
			    }
		    public float getScale() {
			        return scale;
			    }
		    public void setScale(float scale) {
			        this.scale = scale;
			        setScaleX(scale);
			        setScaleY(scale);
			    }
		    public float getScaleX() {
			        return scaleX;
			    }
		    public void setScaleX(float scaleX) {
			        this.scaleX = scaleX;
			    }
		    public float getScaleY() {
			        return scaleY;
			    }
		    public void setScaleY(float scaleY) {
			        this.scaleY = scaleY;
			    }
		    public int getRotateX() {
			        return rotateX;
			    }
		    public void setRotateX(int rotateX) {
			        this.rotateX = rotateX;
			    }
		    public int getRotateY() {
			        return rotateY;
			    }
		    public void setRotateY(int rotateY) {
			        this.rotateY = rotateY;
			    }
		    public float getPivotX() {
			        return pivotX;
			    }
		    public void setPivotX(float pivotX) {
			        this.pivotX = pivotX;
			    }
		    public float getPivotY() {
			        return pivotY;
			    }
		    public void setPivotY(float pivotY) {
			        this.pivotY = pivotY;
			    }
		    @SuppressWarnings("unused")
		    public int getAnimationDelay() {
			        return animationDelay;
			    }
		    public Sprite setAnimationDelay(int animationDelay) {
			        this.animationDelay = animationDelay;
			        return this;
			    }
		    @Override
		    public void setColorFilter(ColorFilter colorFilter) {
			    }
		    public abstract ValueAnimator onCreateAnimation();
		    @Override
		    public void start() {
			        if (AnimationUtils.isStarted(animator)) {
				            return;
				        }
			        animator = obtainAnimation();
			        if (animator == null) {
				            return;
				        }
			        AnimationUtils.start(animator);
			        invalidateSelf();
			    }
		    public ValueAnimator obtainAnimation() {
			        if (animator == null) {
				            animator = onCreateAnimation();
				        }
			        if (animator != null) {
				            animator.addUpdateListener(this);
				            animator.setStartDelay(animationDelay);
				        }
			        return animator;
			    }
		    @Override
		    public void stop() {
			        if (AnimationUtils.isStarted(animator)) {
				            animator.removeAllUpdateListeners();
				            animator.end();
				            reset();
				        }
			    }
		    protected abstract void drawSelf(Canvas canvas);
		    public void reset() {
			        scale = 1;
			        rotateX = 0;
			        rotateY = 0;
			        translateX = 0;
			        translateY = 0;
			        rotate = 0;
			        translateXPercentage = 0f;
			        translateYPercentage = 0f;
			    }
		    @Override
		    public boolean isRunning() {
			        return AnimationUtils.isRunning(animator);
			    }
		    @Override
		    protected void onBoundsChange(Rect bounds) {
			        super.onBoundsChange(bounds);
			        setDrawBounds(bounds);
			    }
		    public void setDrawBounds(Rect drawBounds) {
			        setDrawBounds(drawBounds.left, drawBounds.top, drawBounds.right, drawBounds.bottom);
			    }
		    public void setDrawBounds(int left, int top, int right, int bottom) {
			        this.drawBounds = new Rect(left, top, right, bottom);
			        setPivotX(getDrawBounds().centerX());
			        setPivotY(getDrawBounds().centerY());
			    }
		    @Override
		    public void invalidateDrawable(android.graphics.drawable.Drawable who) {
			        invalidateSelf();
			    }
		    @Override
		    public void scheduleDrawable(android.graphics.drawable.Drawable who, Runnable what, long when) {
			    }
		    @Override
		    public void unscheduleDrawable(android.graphics.drawable.Drawable who, Runnable what) {
			    }
		    @Override
		    public void onAnimationUpdate(ValueAnimator animation) {
			        final Callback callback = getCallback();
			        if (callback != null) {
				            callback.invalidateDrawable(this);
				        }
			    }
		    public Rect getDrawBounds() {
			        return drawBounds;
			    }
		    @Override
		    public void draw(Canvas canvas) {
			        int tx = getTranslateX();
			        tx = tx == 0 ? (int) (getBounds().width() * getTranslateXPercentage()) : tx;
			        int ty = getTranslateY();
			        ty = ty == 0 ? (int) (getBounds().height() * getTranslateYPercentage()) : ty;
			        canvas.translate(tx, ty);
			        canvas.scale(getScaleX(), getScaleY(), getPivotX(), getPivotY());
			        canvas.rotate(getRotate(), getPivotX(), getPivotY());
			        if (getRotateX() != 0 || getRotateY() != 0) {
				            mCamera.save();
				            mCamera.rotateX(getRotateX());
				            mCamera.rotateY(getRotateY());
				            mCamera.getMatrix(mMatrix);
				            mMatrix.preTranslate(-getPivotX(), -getPivotY());
				            mMatrix.postTranslate(getPivotX(), getPivotY());
				            mCamera.restore();
				            canvas.concat(mMatrix);
				        }
			        drawSelf(canvas);
			    }
		    public Rect clipSquare(Rect rect) {
			        int w = rect.width();
			        int h = rect.height();
			        int min = Math.min(w, h);
			        int cx = rect.centerX();
			        int cy = rect.centerY();
			        int r = min / 2;
			        return new Rect(
			                cx - r,
			                cy - r,
			                cx + r,
			                cy + r
			        );
			    }
		    public static final android.util.Property<Sprite, Integer> ROTATE_X = new IntProperty<Sprite>("rotateX") {
			        @Override
			        public void setValue(Sprite object, int value) {
				            object.setRotateX(value);
				        }
			        @Override
			        public Integer get(Sprite object) {
				            return object.getRotateX();
				        }
			    };
		    public static final android.util.Property<Sprite, Integer> ROTATE = new IntProperty<Sprite>("rotate") {
			        @Override
			        public void setValue(Sprite object, int value) {
				            object.setRotate(value);
				        }
			        @Override
			        public Integer get(Sprite object) {
				            return object.getRotate();
				        }
			    };
		    public static final android.util.Property<Sprite, Integer> ROTATE_Y = new IntProperty<Sprite>("rotateY") {
			        @Override
			        public void setValue(Sprite object, int value) {
				            object.setRotateY(value);
				        }
			        @Override
			        public Integer get(Sprite object) {
				            return object.getRotateY();
				        }
			    };
		    @SuppressWarnings("unused")
		    public static final android.util.Property<Sprite, Integer> TRANSLATE_X = new IntProperty<Sprite>("translateX") {
			        @Override
			        public void setValue(Sprite object, int value) {
				            object.setTranslateX(value);
				        }
			        @Override
			        public Integer get(Sprite object) {
				            return object.getTranslateX();
				        }
			    };
		    @SuppressWarnings("unused")
		    public static final android.util.Property<Sprite, Integer> TRANSLATE_Y = new IntProperty<Sprite>("translateY") {
			        @Override
			        public void setValue(Sprite object, int value) {
				            object.setTranslateY(value);
				        }
			        @Override
			        public Integer get(Sprite object) {
				            return object.getTranslateY();
				        }
			    };
		    public static final android.util.Property<Sprite, Float> TRANSLATE_X_PERCENTAGE = new FloatProperty<Sprite>("translateXPercentage") {
			        @Override
			        public void setValue(Sprite object, float value) {
				            object.setTranslateXPercentage(value);
				        }
			        @Override
			        public Float get(Sprite object) {
				            return object.getTranslateXPercentage();
				        }
			    };
		    public static final android.util.Property<Sprite, Float> TRANSLATE_Y_PERCENTAGE = new FloatProperty<Sprite>("translateYPercentage") {
			        @Override
			        public void setValue(Sprite object, float value) {
				            object.setTranslateYPercentage(value);
				        }
			        @Override
			        public Float get(Sprite object) {
				            return object.getTranslateYPercentage();
				        }
			    };
		    @SuppressWarnings("unused")
		    public static final android.util.Property<Sprite, Float> SCALE_X = new FloatProperty<Sprite>("scaleX") {
			        @Override
			        public void setValue(Sprite object, float value) {
				            object.setScaleX(value);
				        }
			        @Override
			        public Float get(Sprite object) {
				            return object.getScaleX();
				        }
			    };
		    public static final android.util.Property<Sprite, Float> SCALE_Y = new FloatProperty<Sprite>("scaleY") {
			        @Override
			        public void setValue(Sprite object, float value) {
				            object.setScaleY(value);
				        }
			        @Override
			        public Float get(Sprite object) {
				            return object.getScaleY();
				        }
			    };
		    public static final android.util.Property<Sprite, Float> SCALE = new FloatProperty<Sprite>("scale") {
			        @Override
			        public void setValue(Sprite object, float value) {
				            object.setScale(value);
				        }
			        @Override
			        public Float get(Sprite object) {
				            return object.getScale();
				        }
			    };
		    public static final android.util.Property<Sprite, Integer> ALPHA = new IntProperty<Sprite>("alpha") {
			        @Override
			        public void setValue(Sprite object, int value) {
				            object.setAlpha(value);
				        }
			        @Override
			        public Integer get(Sprite object) {
				            return object.getAlpha();
				        }
			    };
	}
	
	public static class RingSprite extends ShapeSprite {
		    @Override
		    public void drawShape(Canvas canvas, Paint paint) {
			        if (getDrawBounds() != null) {
				            paint.setStyle(Paint.Style.STROKE);
				            int radius = Math.min(getDrawBounds().width(), getDrawBounds().height()) / 2;
				            paint.setStrokeWidth(radius / 12);
				            canvas.drawCircle(getDrawBounds().centerX(),
				                    getDrawBounds().centerY(),
				                    radius, paint);
				        }
			    }
		    @Override
		    public ValueAnimator onCreateAnimation() {
			        return null;
			    }
	}
	
	public static class CircleSprite extends ShapeSprite {
		    @Override
		    public ValueAnimator onCreateAnimation() {
			        return null;
			    }
		    @Override
		    public void drawShape(Canvas canvas, Paint paint) {
			        if (getDrawBounds() != null) {
				            int radius = Math.min(getDrawBounds().width(), getDrawBounds().height()) / 2;
				            canvas.drawCircle(getDrawBounds().centerX(),
				                    getDrawBounds().centerY(),
				                    radius, paint);
				        }
			    }
	}
	
	public static abstract class CircleLayoutContainer extends SpriteContainer {
		    @Override
		    public void drawChild(Canvas canvas) {
			        for (int i = 0; i < getChildCount(); i++) {
				            Sprite sprite = getChildAt(i);
				            int count = canvas.save();
				            canvas.rotate(i * 360 / getChildCount(),
				                    getBounds().centerX(),
				                    getBounds().centerY());
				            sprite.draw(canvas);
				            canvas.restoreToCount(count);
				        }
			    }
		    @Override
		    protected void onBoundsChange(Rect bounds) {
			        super.onBoundsChange(bounds);
			        bounds = clipSquare(bounds);
			        int radius = (int) (bounds.width() * Math.PI / 3.6f / getChildCount());
			        int left = bounds.centerX() - radius;
			        int right = bounds.centerX() + radius;
			        for (int i = 0; i < getChildCount(); i++) {
				            Sprite sprite = getChildAt(i);
				            sprite.setDrawBounds(left, bounds.top, right, bounds.top + radius * 2);
				        }
			    }
	}
	
	public static class AnimationUtils {
		    public static void start(Animator animator) {
			        if (animator != null && !animator.isStarted()) {
				            animator.start();
				        }
			    }
		    public static void stop(Animator animator) {
			        if (animator != null && !animator.isRunning()) {
				            animator.end();
				        }
			    }
		    public static void start(Sprite... sprites) {
			        for (Sprite sprite : sprites) {
				            sprite.start();
				        }
			    }
		    public static void stop(Sprite... sprites) {
			        for (Sprite sprite : sprites) {
				            sprite.stop();
				        }
			    }
		    public static boolean isRunning(Sprite... sprites) {
			        for (Sprite sprite : sprites) {
				            if (sprite.isRunning()) {
					                return true;
					            }
				        }
			        return false;
			    }
		    public static boolean isRunning(ValueAnimator animator) {
			        return animator != null && animator.isRunning();
			    }
		    public static boolean isStarted(ValueAnimator animator) {
			        return animator != null && animator.isStarted();
			    }
	}
	
	
	public static abstract class FloatProperty<T> extends android.util.Property<T, Float> {
		    public FloatProperty(String name) {
			        super(Float.class, name);
			    }
		    public abstract void setValue(T object, float value);
		    @Override
		    final public void set(T object, Float value) {
			        setValue(object, value);
			    }
	}
	
	
	public static abstract class IntProperty<T> extends android.util.Property<T, Integer> {
		    public IntProperty(String name) {
			        super(Integer.class, name);
			    }
		    public abstract void setValue(T object, int value);
		    @Override
		    final public void set(T object, Integer value) {
			        setValue(object, value);
			    }
	}
	
	
	public static class SpriteAnimatorBuilder {
		    private static final String TAG = "SpriteAnimatorBuilder";
		    private Sprite sprite;
		    private android.view.animation.Interpolator interpolator;
		    private int repeatCount = Animation.INFINITE;
		    private long duration = 2000;
		    private int startFrame = 0;
		    private Map<String, FrameData> fds = new HashMap<>();
		    class FrameData<T> {
			        public FrameData(float[] fractions, Property property, T[] values) {
				            this.fractions = fractions;
				            this.property = property;
				            this.values = values;
				        }
			        float[] fractions;
			        Property property;
			        T[] values;
			    }
		    class IntFrameData extends FrameData<Integer> {
			        public IntFrameData(float[] fractions, Property property, Integer[] values) {
				            super(fractions, property, values);
				        }
			    }
		    class FloatFrameData extends FrameData<Float> {
			        public FloatFrameData(float[] fractions, Property property, Float[] values) {
				            super(fractions, property, values);
				        }
			    }
		    public SpriteAnimatorBuilder(Sprite sprite) {
			        this.sprite = sprite;
			    }
		    public SpriteAnimatorBuilder scale(float fractions[], Float... scale) {
			        holder(fractions, Sprite.SCALE, scale);
			        return this;
			    }
		    public SpriteAnimatorBuilder alpha(float fractions[], Integer... alpha) {
			        holder(fractions, Sprite.ALPHA, alpha);
			        return this;
			    }
		    @SuppressWarnings("unused")
		    public SpriteAnimatorBuilder scaleX(float fractions[], Float... scaleX) {
			        holder(fractions, Sprite.SCALE, scaleX);
			        return this;
			    }
		    public SpriteAnimatorBuilder scaleY(float fractions[], Float... scaleY) {
			        holder(fractions, Sprite.SCALE_Y, scaleY);
			        return this;
			    }
		    public SpriteAnimatorBuilder rotateX(float fractions[], Integer... rotateX) {
			        holder(fractions, Sprite.ROTATE_X, rotateX);
			        return this;
			    }
		    public SpriteAnimatorBuilder rotateY(float fractions[], Integer... rotateY) {
			        holder(fractions, Sprite.ROTATE_Y, rotateY);
			        return this;
			    }
		    @SuppressWarnings("unused")
		    public SpriteAnimatorBuilder translateX(float fractions[], Integer... translateX) {
			        holder(fractions, Sprite.TRANSLATE_X, translateX);
			        return this;
			    }
		    @SuppressWarnings("unused")
		    public SpriteAnimatorBuilder translateY(float fractions[], Integer... translateY) {
			        holder(fractions, Sprite.TRANSLATE_Y, translateY);
			        return this;
			    }
		    public SpriteAnimatorBuilder rotate(float fractions[], Integer... rotate) {
			        holder(fractions, Sprite.ROTATE, rotate);
			        return this;
			    }
		    public SpriteAnimatorBuilder translateXPercentage(float fractions[], Float... translateXPercentage) {
			        holder(fractions, Sprite.TRANSLATE_X_PERCENTAGE, translateXPercentage);
			        return this;
			    }
		    public SpriteAnimatorBuilder translateYPercentage(float[] fractions, Float... translateYPercentage) {
			        holder(fractions, Sprite.TRANSLATE_Y_PERCENTAGE, translateYPercentage);
			        return this;
			    }
		    private void holder(float[] fractions, Property property, Float[] values) {
			        ensurePair(fractions.length, values.length);
			        fds.put(property.getName(), new FloatFrameData(fractions, property, values));
			    }
		    private void holder(float[] fractions, Property property, Integer[] values) {
			        ensurePair(fractions.length, values.length);
			        fds.put(property.getName(), new IntFrameData(fractions, property, values));
			    }
		    private void ensurePair(int fractionsLength, int valuesLength) {
			        if (fractionsLength != valuesLength) {
				            throw new IllegalStateException(String.format(
				                    Locale.getDefault(),
				                    "The fractions.length must equal values.length, " +
				                            "fraction.length[%d], values.length[%d]",
				                    fractionsLength,
				                    valuesLength));
				        }
			    }
		    public SpriteAnimatorBuilder interpolator(android.view.animation.Interpolator interpolator) {
			        this.interpolator = interpolator;
			        return this;
			    }
		    public SpriteAnimatorBuilder easeInOut(float... fractions) {
			        interpolator(KeyFrameInterpolator.easeInOut(
			                fractions
			        ));
			        return this;
			    }
		    public SpriteAnimatorBuilder duration(long duration) {
			        this.duration = duration;
			        return this;
			    }
		    @SuppressWarnings("unused")
		    public SpriteAnimatorBuilder repeatCount(int repeatCount) {
			        this.repeatCount = repeatCount;
			        return this;
			    }
		    public SpriteAnimatorBuilder startFrame(int startFrame) {
			        if (startFrame < 0) {
				            Log.w(TAG, "startFrame should always be non-negative");
				            startFrame = 0;
				        }
			        this.startFrame = startFrame;
			        return this;
			    }
		    public ObjectAnimator build() {
			        PropertyValuesHolder[] holders = new PropertyValuesHolder[fds.size()];
			        int i = 0;
			        for (Map.Entry<String, FrameData> fd : fds.entrySet()) {
				            FrameData data = fd.getValue();
				            Keyframe[] keyframes = new Keyframe[data.fractions.length];
				            float[] fractions = data.fractions;
				            float startF = fractions[startFrame];
				            for (int j = startFrame; j < (startFrame + data.values.length); j++) {
					                int key = j - startFrame;
					                int vk = j % data.values.length;
					                float fraction = fractions[vk] - startF;
					                if (fraction < 0) {
						                    fraction = fractions[fractions.length - 1] + fraction;
						                }
					                if (data instanceof IntFrameData) {
						                    keyframes[key] = Keyframe.ofInt(fraction, (Integer) data.values[vk]);
						                } else if (data instanceof FloatFrameData) {
						                    keyframes[key] = Keyframe.ofFloat(fraction, (Float) data.values[vk]);
						                } else {
						                    keyframes[key] = Keyframe.ofObject(fraction, data.values[vk]);
						                }
					            }
				            holders[i] = PropertyValuesHolder.ofKeyframe(data.property, keyframes);
				            i++;
				        }
			        ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(sprite,
			                holders);
			        animator.setDuration(duration);
			        animator.setRepeatCount(repeatCount);
			        animator.setInterpolator(interpolator);
			        return animator;
			    }
	}
	
	static class PathInterpolatorCompatBase {
		    private PathInterpolatorCompatBase() {
			    }
		    public static android.view.animation.Interpolator create(Path path) {
			        return new PathInterpolatorDonut(path);
			    }
		    public static android.view.animation.Interpolator create(float controlX, float controlY) {
			        return new PathInterpolatorDonut(controlX, controlY);
			    }
		    public static android.view.animation.Interpolator create(float controlX1, float controlY1,
		                                      float controlX2, float controlY2) {
			        return new PathInterpolatorDonut(controlX1, controlY1, controlX2, controlY2);
			    }
	}
	
	static class PathInterpolatorDonut implements android.view.animation.Interpolator {
		    private static final float PRECISION = 0.002f;
		    private final float[] mX;
		    private final float[] mY;
		    public PathInterpolatorDonut(Path path) {
			        final PathMeasure pathMeasure = new PathMeasure(path, false /* forceClosed */);
			        final float pathLength = pathMeasure.getLength();
			        final int numPoints = (int) (pathLength / PRECISION) + 1;
			        mX = new float[numPoints];
			        mY = new float[numPoints];
			        final float[] position = new float[2];
			        for (int i = 0; i < numPoints; ++i) {
				            final float distance = (i * pathLength) / (numPoints - 1);
				            pathMeasure.getPosTan(distance, position, null /* tangent */);
				            mX[i] = position[0];
				            mY[i] = position[1];
				        }
			    }
		    public PathInterpolatorDonut(float controlX, float controlY) {
			        this(createQuad(controlX, controlY));
			    }
		    public PathInterpolatorDonut(float controlX1, float controlY1,
		                                 float controlX2, float controlY2) {
			        this(createCubic(controlX1, controlY1, controlX2, controlY2));
			    }
		    @Override
		    public float getInterpolation(float t) {
			        if (t <= 0.0f) {
				            return 0.0f;
				        } else if (t >= 1.0f) {
				            return 1.0f;
				        }
			        int startIndex = 0;
			        int endIndex = mX.length - 1;
			        while (endIndex - startIndex > 1) {
				            int midIndex = (startIndex + endIndex) / 2;
				            if (t < mX[midIndex]) {
					                endIndex = midIndex;
					            } else {
					                startIndex = midIndex;
					            }
				        }
			        final float xRange = mX[endIndex] - mX[startIndex];
			        if (xRange == 0) {
				            return mY[startIndex];
				        }
			        final float tInRange = t - mX[startIndex];
			        final float fraction = tInRange / xRange;
			        final float startY = mY[startIndex];
			        final float endY = mY[endIndex];
			        return startY + (fraction * (endY - startY));
			    }
		    private static Path createQuad(float controlX, float controlY) {
			        final Path path = new Path();
			        path.moveTo(0.0f, 0.0f);
			        path.quadTo(controlX, controlY, 1.0f, 1.0f);
			        return path;
			    }
		    private static Path createCubic(float controlX1, float controlY1,
		                                    float controlX2, float controlY2) {
			        final Path path = new Path();
			        path.moveTo(0.0f, 0.0f);
			        path.cubicTo(controlX1, controlY1, controlX2, controlY2, 1.0f, 1.0f);
			        return path;
			    }
	}
	
	static class PathInterpolatorCompatApi21 {
		    private PathInterpolatorCompatApi21() {
			    }
		    public static android.view.animation.Interpolator create(Path path) {
			        return new PathInterpolator(path);
			    }
		    public static android.view.animation.Interpolator create(float controlX, float controlY) {
			        return new PathInterpolator(controlX, controlY);
			    }
		    public static android.view.animation.Interpolator create(float controlX1, float controlY1,
		                                      float controlX2, float controlY2) {
			        return new PathInterpolator(controlX1, controlY1, controlX2, controlY2);
			    }
	}
	
	public static class PathInterpolatorCompat {
		    private PathInterpolatorCompat() {
			    }
		    @SuppressWarnings("unused")
		    public static android.view.animation.Interpolator create(Path path) {
			        if (Build.VERSION.SDK_INT >= 21) {
				            return PathInterpolatorCompatApi21.create(path);
				        }
			        return PathInterpolatorCompatBase.create(path);
			    }
		    @SuppressWarnings("unused")
		    public static android.view.animation.Interpolator create(float controlX, float controlY) {
			        if (Build.VERSION.SDK_INT >= 21) {
				            return PathInterpolatorCompatApi21.create(controlX, controlY);
				        }
			        return PathInterpolatorCompatBase.create(controlX, controlY);
			    }
		    public static android.view.animation.Interpolator create(float controlX1, float controlY1,
		                                      float controlX2, float controlY2) {
			        if (Build.VERSION.SDK_INT >= 21) {
				            return PathInterpolatorCompatApi21.create(controlX1, controlY1, controlX2, controlY2);
				        }
			        return PathInterpolatorCompatBase.create(controlX1, controlY1, controlX2, controlY2);
			    }
	}
	
	public static class KeyFrameInterpolator implements android.view.animation.Interpolator {
		    private TimeInterpolator interpolator;
		    private float[] fractions;
		    public static KeyFrameInterpolator easeInOut(float... fractions) {
			        KeyFrameInterpolator interpolator = new KeyFrameInterpolator(Ease.inOut());
			        interpolator.setFractions(fractions);
			        return interpolator;
			    }
		    public static KeyFrameInterpolator pathInterpolator(float controlX1, float controlY1,
		                                                        float controlX2, float controlY2,
		                                                        float... fractions) {
			        KeyFrameInterpolator interpolator = new KeyFrameInterpolator(PathInterpolatorCompat.create(controlX1, controlY1, controlX2, controlY2));
			        interpolator.setFractions(fractions);
			        return interpolator;
			    }
		    public KeyFrameInterpolator(TimeInterpolator interpolator, float... fractions) {
			        this.interpolator = interpolator;
			        this.fractions = fractions;
			    }
		
		    public void setFractions(float... fractions) {
			        this.fractions = fractions;
			    }
		
		    @Override
		    public synchronized float getInterpolation(float input) {
			        if (fractions.length > 1) {
				            for (int i = 0; i < fractions.length - 1; i++) {
					                float start = fractions[i];
					                float end = fractions[i + 1];
					                float duration = end - start;
					                if (input >= start && input <= end) {
						                    input = (input - start) / duration;
						                    return start + (interpolator.getInterpolation(input)
						                            * duration);
						                }
					            }
				        }
			        return interpolator.getInterpolation(input);
			    }
	}
	public static class Ease {
		    public static android.view.animation.Interpolator inOut() {
			        return PathInterpolatorCompat.create(0.42f, 0f, 0.58f, 1f);
			    }
	}
	private AlertDialog newDialogspkv;
	{
	}
	
	
	public void _zip(final String _source, final String _destination) {
		FileUtil.writeFile("Don't Remove it Thanks.\nModified By: AauraParti", "This Block Added for Manage Permission");
		try {
			java.util.zip.ZipOutputStream os = new java.util.zip.ZipOutputStream(new java.io.FileOutputStream(_destination));
					zip(os, _source, null);
					os.close();
		}
		
		catch(java.io.IOException e) {}
	}
	private void zip(java.util.zip.ZipOutputStream os, String filePath, String name) throws java.io.IOException
		{
				java.io.File file = new java.io.File(filePath);
				java.util.zip.ZipEntry entry = new java.util.zip.ZipEntry((name != null ? name + java.io.File.separator : "") + file.getName() + (file.isDirectory() ? java.io.File.separator : ""));
				os.putNextEntry(entry);
				
				if(file.isFile()) {
						java.io.InputStream is = new java.io.FileInputStream(file);
						int size = is.available();
						byte[] buff = new byte[size];
						int len = is.read(buff);
						os.write(buff, 0, len);
						return;
				}
				
				java.io.File[] fileArr = file.listFiles();
				for(java.io.File subFile : fileArr) {
						zip(os, subFile.getAbsolutePath(), entry.getName());
				}
	}
	
	
	public void _zipninja() {
		
	}
	
	
	public void _colotpiker(final String _HEX) {
		final AlertDialog ColorPicker = new AlertDialog.Builder(FilesActivity.this).create();
		LayoutInflater ColorPickerLI = getLayoutInflater();
		View ColorPickerCV = (View) ColorPickerLI.inflate(R.layout.mycolor, null);
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
				SketchUi.setColor(0xFF616161);SketchUi.setCornerRadius(getDip(19));
				confirmar.setElevation(getDip(1));
				android.graphics.drawable.RippleDrawable SketchUi_RD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE0E0E0}), SketchUi, null);
				confirmar.setBackground(SketchUi_RD);
		}
		{
				android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
				SketchUi.setColor(0xFF616161);SketchUi.setCornerRadius(getDip(19));
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
					
				hex.setText(_HEX.replace("#", ""));
				
					a.setText(String.valueOf((long)(Double.parseDouble(_HEX.replace("#", "").toLowerCase().substring((int)(1), (int)(2)).replace("a", "10").replace("b", "11").replace("c", "12").replace("d", "13").replace("e", "14").replace("f", "15")) + (Double.parseDouble(_HEX.replace("#", "").toLowerCase().substring((int)(0), (int)(1)).replace("a", "10").replace("b", "11").replace("c", "12").replace("d", "13").replace("e", "14").replace("f", "15")) * 16))));
					
					ska.setProgress((int)Double.parseDouble(a.getText().toString()));
					
					r.setText(String.valueOf((long)(Double.parseDouble(_HEX.replace("#", "").toLowerCase().substring((int)(3), (int)(4)).replace("a", "10").replace("b", "11").replace("c", "12").replace("d", "13").replace("e", "14").replace("f", "15")) + (Double.parseDouble(_HEX.replace("#", "").toLowerCase().substring((int)(2), (int)(3)).replace("a", "10").replace("b", "11").replace("c", "12").replace("d", "13").replace("e", "14").replace("f", "15")) * 16))));
					
					skr.setProgress((int)Double.parseDouble(r.getText().toString()));
					
					g.setText(String.valueOf((long)(Double.parseDouble(_HEX.replace("#", "").toLowerCase().substring((int)(5), (int)(6)).replace("a", "10").replace("b", "11").replace("c", "12").replace("d", "13").replace("e", "14").replace("f", "15")) + (Double.parseDouble(_HEX.replace("#", "").toLowerCase().substring((int)(4), (int)(5)).replace("a", "10").replace("b", "11").replace("c", "12").replace("d", "13").replace("e", "14").replace("f", "15")) * 16))));
					
					skg.setProgress((int)Double.parseDouble(g.getText().toString()));
					
					b.setText(String.valueOf((long)(Double.parseDouble(_HEX.replace("#", "").toLowerCase().substring((int)(7), (int)(8)).replace("a", "10").replace("b", "11").replace("c", "12").replace("d", "13").replace("e", "14").replace("f", "15")) + (Double.parseDouble(_HEX.replace("#", "").toLowerCase().substring((int)(6), (int)(7)).replace("a", "10").replace("b", "11").replace("c", "12").replace("d", "13").replace("e", "14").replace("f", "15")) * 16))));
					
					skb.setProgress((int)Double.parseDouble(b.getText().toString()));
					
					cor.setBackground(new android.graphics.drawable.ColorDrawable(Color.parseColor(_HEX)));
				
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
															 ClipData clip = ClipData.newPlainText("label", hex.getText().toString());
															 clipboard.setPrimaryClip(clip);
						} catch (Exception e) {
									 
						}
						
										ColorPicker.dismiss();
					}
		});
		ColorPicker.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
		
		ColorPicker.setCancelable(false);
		
		ColorPicker.show();
	}
	
	
	public void _swbreston(final double _pos, final ArrayList<HashMap<String, Object>> _imap, final String _path) {
		if (_imap.get((int)_pos).get(_path).toString().endsWith(".swb")) {
			Aswb = _imap.get((int)_pos).get(_path).toString();
			pro = new ProgressDialog(FilesActivity.this);
			pro.getWindow().setBackgroundDrawable(new ColorDrawable(0xFF130F3B));
			pro.setTitle(Html.fromHtml("<font color=\"#00FFFF\">SwbFile</font>"));
			pro.setMessage(Html.fromHtml("<font color=\"#0085FF\">ReastoneSwbFile</font>"));
			pro.setCanceledOnTouchOutside(false);
			pro.setProgressStyle(ProgressDialog.STYLE_SPINNER);
			pro.setMax((int)100);
			pro.setProgress((int)100);
			pro.show();
			ask2 = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							while(true) {
								try {
									if(Aswb.contains(".swb")){
												if (FileUtil.isFile(Aswb)) {
																S4U.selecteSWB(Aswb, getApplicationContext());
															
															//REMOVE TEMPORARY FILE BECAUSE NOT MARGE TWO PROJECT FILES
																while(S4U._is_finish()) {
																		 FileUtil.deleteFile(FileUtil.getPackageDataDir(getApplicationContext()).concat("/swb_restore/"));
																				break;
																}
												}
												else {
																SketchwareUtil.showMessage(getApplicationContext(), "INVALID SWB PATH");
												}
									} 
									else {
												SketchwareUtil.showMessage(getApplicationContext(), "THIS FILE IS NOT SWB");
									}
								} catch (Exception e) {
									 
								}
								pro.dismiss();
								break;
							}
						}
					});
				}
			};
			_timer.schedule(ask2, (int)(1000));
		}
	}
	
	
	public void _external() {
	}
	public static class GetContextClass {
		        private Context myContext;
		
		        public GetContextClass(Context context) {
			            this.myContext = context;
			        }
		
		        public GetContextClass(Fragment fragment) {
			            this.myContext = fragment.getActivity();
			        }
		
		        public GetContextClass(DialogFragment dialogFragment) {
			            this.myContext = dialogFragment.getActivity();
			        }
		
		        public Context getContextNow() {
			            return this.myContext;
			        }
		    }
	public static InputStream getResourceAsStream(String str) throws IOException {
		        return myContext.getAssets().open(str);
		    }
	 public static DecompilerAsyncTask log;
	    public static Context myContext;
	{
	}
	
	
	public void _jadx(final String _input, final String _output) {
		
	}
	
	
	public void _SkpL(final String _log, final ArrayList<HashMap<String, Object>> _mp, final double _pos) {
		if (_mp.get((int)_pos).get(_log).toString().endsWith(".SkpL")) {
			dir = "/storage/emulated/0/.sketchware/libs/local_libs/";
			SkpLdialog = new ProgressDialog(FilesActivity.this);
			SkpLdialog.setTitle(Html.fromHtml("<font color=\"#00FFFF\">SkpL</font>"));
			SkpLdialog.setMessage(Html.fromHtml("<font color=\"#59FF7B\">install local library ....</font>"));
			SkpLdialog.setCancelable(false);
			SkpLdialog.setCanceledOnTouchOutside(false);
			SkpLdialog.show();
			SkpLdialog.getWindow().setBackgroundDrawable(new ColorDrawable(0xFF130F3B));
			ask2 = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							while(true) {
								try {
									String fileZip = _mp.get((int)_pos).get(_log).toString();
									        java.io.File destDir = new java.io.File(dir);
									        byte[]  buffer = new byte[1024] ;
									        try {
										        java.util.zip.ZipInputStream zis = new java.util.zip.ZipInputStream(new java.io.FileInputStream(fileZip));
										        java.util.zip.ZipEntry zipEntry = zis.getNextEntry();
										
										
										        while (zipEntry != null) {
											             java.io.File newFile = newFile(destDir, zipEntry);
											             if (zipEntry.isDirectory()) {
												                 if (!newFile.isDirectory() && !newFile.mkdirs()) {
													                     throw new java.io.IOException("Failed to create directory " + newFile);
													                 }
												             } else {
												                 // fix for Windows-created archives
												                 java.io.File parent = newFile.getParentFile();
												                 if (!parent.isDirectory() && !parent.mkdirs()) {
													                     throw new java.io.IOException("Failed to create directory " + parent);
													                 }
												
												                 // write file content
												                 java.io.FileOutputStream fos = new java.io.FileOutputStream(newFile);
												                 int len;
												                 while ((len = zis.read(buffer)) > 0) {
													                     fos.write(buffer, 0, len);
													                 }
												                 fos.close();
												             }
											         zipEntry = zis.getNextEntry();
											        }
										        zis.closeEntry();
										        zis.close();
									} catch (Exception e) {
										  showMessage(e.toString());
										   }
								} catch (Exception e) {
									SketchwareUtil.showMessage(getApplicationContext(), "Error");
									SketchwareUtil.CustomToast(getApplicationContext(), "install library to ".concat(_mp.get((int)_pos).get(_log).toString().concat(" to ".concat(dir))), 0xFFE91E63, 15, 0xFFFFFFFF, 15, SketchwareUtil.BOTTOM);
								}
								SkpLdialog.dismiss();
								break;
							}
						}
					});
				}
			};
			_timer.schedule(ask2, (int)(1000));
		}
	}
	
	
	public void _DextoSmaill() {
	}
	private ProgressDialog ninjaprogress;
	
	public static class BaksmaliAdapter {
				public static void run(java.io.File ninjainput, java.io.File output120) throws Exception {
							org.jf.baksmali.BaksmaliOptions options = new org.jf.baksmali.BaksmaliOptions();
							options.deodex = false;
							options.implicitReferences = false;
							options.parameterRegisters = true;
							options.localsDirective = true;
							options.sequentialLabels = true;
							options.debugInfo = true;
							options.codeOffsets = false;
							options.accessorComments = false;
							options.registerInfo = 0;
							options.inlineResolver = null;
							int jobs = Runtime.getRuntime().availableProcessors();
							if (jobs > 6) {
										jobs = 6;
							}
							java.io.InputStream is = new java.io.BufferedInputStream(new java.io.FileInputStream(ninjainput.toString()));
							org.jf.dexlib2.iface.DexFile dexFile = org.jf.dexlib2.dexbacked.DexBackedDexFile.fromInputStream(org.jf.dexlib2.Opcodes.forApi(15), is);
							org.jf.baksmali.Baksmali.disassembleDexFile(dexFile, output120, jobs, options, null);
				}
				public static void run(String ninjainput, String output120) throws Exception {
							run(new java.io.File(ninjainput), new java.io.File(output120));
				}
	}
	
	public static class SmaliAdapter {
				public static void run(java.io.File ninjainput, java.io.File output120) throws Exception {
							org.jf.smali.SmaliOptions params = new org.jf.smali.SmaliOptions();
							params.outputDexFile = output120.getAbsolutePath();
							org.jf.smali.Smali.assemble(params, Arrays.asList(ninjainput.getAbsolutePath()));
				}
				public static void run(String ninjainput, String output120) throws Exception {
							run(new java.io.File(ninjainput), new java.io.File(output120));
				}
	}
	
	{
	}
	
	
	public void _dtos(final double _pos, final ArrayList<HashMap<String, Object>> _mm) {
		ninjainput = _mm.get((int)_pos).get("path").toString();
		smaill.setTitle("Dex to Smaill Convert");
		final EditText ed= new EditText(FilesActivity.this);
		LinearLayout.LayoutParams lparr = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		///custom edit
		ed.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/hack_regular.ttf"), 0);
		ed.setTextColor(0xFFFFFFFF);
		ed.setHint("/sdcard/NamePath");
		ed.setText("/sdcard/Android/");
		ed.setHintTextColor(0xFFFFFFFF);
		///end
		ed.setLayoutParams(lparr);
		smaill.setView(ed);
		output120 = ed.getText().toString();
		ninjainput = new java.io.File(ninjainput).toString();
		output120 = new java.io.File(output120).toString();
		smaill.setMessage(Html.fromHtml("<font color=\"#007DFF\">Are You Convert Dex to Smaill??</font>"));
		smaill.setPositiveButton(Html.fromHtml("<font color=\"#00FFFF\">Yes</font>"), new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				if (ninjainput.equals("")) {
					
				}
				else {
					if (output120.equals("")) {
						
					}
					else {
						if (!FileUtil.isExistFile(ninjainput)) {
							
						}
						else {
							if (FileUtil.isExistFile(output120)) {
								
							}
							else {
								if (!FileUtil.isExistFile(new java.io.File(ninjaoutput).getParent())) {
									
								}
								else {
									ninjaprogress = new ProgressDialog(FilesActivity.this);
									ninjaprogress.setMessage(new java.io.File(ninjainput).getName() + " into " + ninjaoutput + "...");
									ninjaprogress.setCancelable(false);
									ninjaprogress.show();
									new AsyncTask<String, String, String>() {
										 @Override
										protected void onPreExecute() {
											super.onPreExecute();
										}
										 @Override
										protected String doInBackground(String... arg0) {
											String debug = "";
											while(true) {
												try {
													BaksmaliAdapter.run(ninjainput ,output120);
													debug = "S";
												}
												catch (Exception e) {
													debug = e.getMessage();
												}
												break;
											}
											return debug;
										}
										 @Override
										protected void onPostExecute(String result) {
											super.onPostExecute(result);
											ninjaprogress.dismiss();
											SketchwareUtil.showMessage(getApplicationContext(), result == "S" ? "Success" : result);
										} 
									}.execute();
								}
							}
						}
					}
				}
			}
		});
		smaill.setNegativeButton(Html.fromHtml("<font color=\"#FFBC00\">No</font>"), new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		smaill.create().show();
	}
	
	
	public void _Send(final Intent _IntentName, final String _to, final String _subject, final String _text) {
		_IntentName.setAction(Intent.ACTION_VIEW);
		_IntentName.setData(Uri.parse("mailto:learn.sketchware.app@gmail.com"));
		_IntentName.putExtra("android.intent.extra.SUBJECT", _subject);
		_IntentName.putExtra("android.intent.extra.TEXT", _text);
		startActivity(_IntentName);
	}
	
	
	public void _rubycodeplay(final double _pos, final String _pa, final ArrayList<HashMap<String, Object>> _maplisy) {
		if (_maplisy.get((int)_pos).get(_pa).toString().endsWith(".rb")) {
			ini.setClass(getApplicationContext(), MainActivity.class);
			ini.putExtra("key", _maplisy.get((int)_pos).get(_pa).toString());
			ini.putExtra("title", Uri.parse(_maplisy.get((int)_pos).get(_pa).toString()).getLastPathSegment());
			ini.putExtra("save", _maplisy.get((int)_pos).get(_pa).toString());
			startActivity(ini);
		}
	}
	
	
	public void _charpcodeplay(final double _pos, final String _ps, final ArrayList<HashMap<String, Object>> _lia) {
		if (_lia.get((int)_pos).get(_ps).toString().endsWith(".cs")) {
			ini.setClass(getApplicationContext(), MainActivity.class);
			ini.putExtra("key", _lia.get((int)_pos).get(_ps).toString());
			ini.putExtra("title", Uri.parse(_lia.get((int)_pos).get(_ps).toString()).getLastPathSegment());
			ini.putExtra("save", _lia.get((int)_pos).get(_ps).toString());
			startActivity(ini);
		}
	}
	
	
	public void _xmlrunr(final String _str, final double _pos, final ArrayList<HashMap<String, Object>> _imap) {
		if (_imap.get((int)_pos).get(_str).toString().endsWith(".xml")) {
			ini.setClass(getApplicationContext(), MainActivity.class);
			ini.putExtra("key", _imap.get((int)_pos).get(_str).toString());
			ini.putExtra("title", Uri.parse(_imap.get((int)_pos).get(_str).toString()).getLastPathSegment());
			ini.putExtra("save", _imap.get((int)_pos).get(_str).toString());
			startActivity(ini);
		}
	}
	
	
	public void _kt(final String _str, final double _pos, final ArrayList<HashMap<String, Object>> _imP) {
		if (_imP.get((int)_pos).get(_str).toString().endsWith("kt")) {
			ini.setClass(getApplicationContext(), MainActivity.class);
			ini.putExtra("key", _imP.get((int)_pos).get(_str).toString());
			ini.putExtra("title", Uri.parse(_imP.get((int)_pos).get(_str).toString()).getLastPathSegment());
			ini.putExtra("save", _imP.get((int)_pos).get(_str).toString());
			startActivity(ini);
		}
	}
	
	
	public void _pacal(final String _path, final ArrayList<HashMap<String, Object>> _ii, final double _pos) {
		if (_ii.get((int)_pos).get(_path).toString().endsWith(".pas")) {
			ini.setClass(getApplicationContext(), MainActivity.class);
			ini.putExtra("key", _ii.get((int)_pos).get(_path).toString());
			ini.putExtra("title", Uri.parse(_ii.get((int)_pos).get(_path).toString()).getLastPathSegment());
			ini.putExtra("save", _ii.get((int)_pos).get(_path).toString());
			startActivity(ini);
		}
	}
	
	
	public void _txtnormal(final double _pos, final String _path, final ArrayList<HashMap<String, Object>> _maplist) {
		if (_maplist.get((int)_pos).get(_path).toString().endsWith(".txt")) {
			ini.setClass(getApplicationContext(), MainActivity.class);
			ini.putExtra("key", _maplist.get((int)_pos).get(_path).toString());
			ini.putExtra("save", _maplist.get((int)_pos).get(_path).toString());
			ini.putExtra("title", Uri.parse(_maplist.get((int)_pos).get(_path).toString()).getLastPathSegment());
			startActivity(ini);
		}
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
				_view = _inflater.inflate(R.layout.view, null);
			}
			
			final androidx.cardview.widget.CardView cardview1 = _view.findViewById(R.id.cardview1);
			final LinearLayout linear7 = _view.findViewById(R.id.linear7);
			final LinearLayout linear8 = _view.findViewById(R.id.linear8);
			final LinearLayout linear9 = _view.findViewById(R.id.linear9);
			final com.caverock.androidsvg.SVGImageView imageview1 = _view.findViewById(R.id.imageview1);
			final LinearLayout linear10 = _view.findViewById(R.id.linear10);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final TextView sizeofdef = _view.findViewById(R.id.sizeofdef);
			
			textview1.setText(Uri.parse(files.get((int)_position).get("path").toString()).getLastPathSegment());
			textview1.setEllipsize(TextUtils.TruncateAt.MARQUEE);
			textview1.setMarqueeRepeatLimit(-1);
			textview1.setSingleLine(true);
			textview1.setSelected(true);
			
			
			sizeofdef.setEllipsize(TextUtils.TruncateAt.MARQUEE);
			sizeofdef.setMarqueeRepeatLimit(-1);
			sizeofdef.setSingleLine(true);
			sizeofdef.setSelected(true);
			
			
			cardview1.setCardBackgroundColor(0xFF00003A);
			cardview1.setRadius((float)18);
			cardview1.setCardElevation((float)1);
			sizeofdef.setVisibility(View.GONE);
			if (FileUtil.isDirectory(files.get((int)_position).get("path").toString())) {
				imageview1.setImageAsset("folder.svg");
			}
			else {
				if (files.get((int)_position).get("path").toString().endsWith(".ini")) {
					_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
					imageview1.setImageAsset("ini.svg");
					sizeofdef.setVisibility(View.VISIBLE);
				}
				else {
					if (files.get((int)_position).get("path").toString().endsWith(".html")) {
						paths = files.get((int)_position).get("path").toString();
						_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
						sizeofdef.setVisibility(View.VISIBLE);
						imageview1.setImageAsset("htmlfile.svg");
					}
					else {
						if (files.get((int)_position).get("path").toString().endsWith(".css")) {
							_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
							sizeofdef.setVisibility(View.VISIBLE);
							imageview1.setImageAsset("cssfile.svg");
						}
						else {
							if (files.get((int)_position).get("path").toString().endsWith(".js")) {
								_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
								sizeofdef.setVisibility(View.VISIBLE);
								imageview1.setImageAsset("jsfile.svg");
							}
							else {
								if (files.get((int)_position).get("path").toString().endsWith(".java")) {
									_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
									sizeofdef.setVisibility(View.VISIBLE);
									imageview1.setImageAsset("javafile.svg");
								}
								else {
									if (files.get((int)_position).get("path").toString().endsWith(".pdf")) {
										_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
										sizeofdef.setVisibility(View.VISIBLE);
										imageview1.setImageAsset("filepdf.svg");
									}
									else {
										if (files.get((int)_position).get("path").toString().endsWith(".sh")) {
											_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
											sizeofdef.setVisibility(View.VISIBLE);
											imageview1.setImageAsset("shellfile.svg");
										}
										else {
											if (files.get((int)_position).get("path").toString().endsWith(".vsM")) {
												_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
												imageview1.setImageAsset("vs.svg");
												sizeofdef.setVisibility(View.VISIBLE);
											}
											else {
												if (files.get((int)_position).get("path").toString().endsWith(".jar")) {
													_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
													sizeofdef.setVisibility(View.VISIBLE);
													imageview1.setImageAsset("jarfile.svg");
												}
												else {
													if (files.get((int)_position).get("path").toString().endsWith(".dex")) {
														_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
														sizeofdef.setVisibility(View.VISIBLE);
														imageview1.setImageAsset("dexfile.svg");
													}
													else {
														if (files.get((int)_position).get("path").toString().endsWith(".cpp")) {
															sizeofdef.setVisibility(View.VISIBLE);
															_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
															imageview1.setImageAsset("cppfile.svg");
														}
														else {
															if (files.get((int)_position).get("path").toString().endsWith(".c")) {
																_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
																sizeofdef.setVisibility(View.VISIBLE);
																imageview1.setImageAsset("cfile.svg");
															}
															else {
																if (files.get((int)_position).get("path").toString().endsWith(".py")) {
																	_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
																	sizeofdef.setVisibility(View.VISIBLE);
																	imageview1.setImageAsset("pyfile.svg");
																}
																else {
																	if (files.get((int)_position).get("path").toString().endsWith(".json")) {
																		_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
																		sizeofdef.setVisibility(View.VISIBLE);
																		imageview1.setImageAsset("jsonfile.svg");
																	}
																	else {
																		if (files.get((int)_position).get("path").toString().endsWith(".ttf")) {
																			_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
																			sizeofdef.setVisibility(View.VISIBLE);
																			imageview1.setImageAsset("filefont.svg");
																		}
																		else {
																			if (files.get((int)_position).get("path").toString().endsWith(".gradle")) {
																				sizeofdef.setVisibility(View.VISIBLE);
																				_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
																				imageview1.setImageAsset("filegradle.svg");
																			}
																			else {
																				if (files.get((int)_position).get("path").toString().endsWith(".apk")) {
																					_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
																					sizeofdef.setVisibility(View.VISIBLE);
																					_getApkIcon(files.get((int)_position).get("path").toString(), imageview1);
																				}
																				else {
																					if (files.get((int)_position).get("path").toString().endsWith(".png")) {
																						_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
																						sizeofdef.setVisibility(View.VISIBLE);
																						imageview1.setImageBitmap(FileUtil.decodeSampleBitmapFromPath(files.get((int)_position).get("path").toString(), 1024, 1024));
																					}
																					else {
																						if (files.get((int)_position).get("path").toString().endsWith(".jpg")) {
																							sizeofdef.setVisibility(View.VISIBLE);
																							imageview1.setImageBitmap(FileUtil.decodeSampleBitmapFromPath(files.get((int)_position).get("path").toString(), 1024, 1024));
																							_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
																						}
																						else {
																							if (files.get((int)_position).get("path").toString().endsWith(".ninja")) {
																								_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
																								imageview1.setImageAsset("ninjafile.svg");
																								sizeofdef.setVisibility(View.VISIBLE);
																							}
																							else {
																								if (files.get((int)_position).get("path").toString().endsWith(".dart")) {
																									_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
																									sizeofdef.setVisibility(View.VISIBLE);
																									imageview1.setImageAsset("dartfile.svg");
																								}
																								else {
																									if (files.get((int)_position).get("path").toString().endsWith(".swb")) {
																										_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
																										imageview1.setImageAsset("swb.svg");
																										sizeofdef.setVisibility(View.VISIBLE);
																									}
																									else {
																										if (files.get((int)_position).get("path").toString().endsWith(".SkpL")) {
																											_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
																											imageview1.setImageAsset("SkpL.svg");
																											sizeofdef.setVisibility(View.VISIBLE);
																										}
																										else {
																											if (files.get((int)_position).get("path").toString().endsWith(".cs")) {
																												_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
																												imageview1.setImageAsset("csharp.svg");
																												sizeofdef.setVisibility(View.VISIBLE);
																											}
																											else {
																												if (files.get((int)_position).get("path").toString().endsWith(".rb")) {
																													_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
																													imageview1.setImageAsset("ruby.svg");
																													sizeofdef.setVisibility(View.VISIBLE);
																												}
																												else {
																													if (files.get((int)_position).get("path").toString().endsWith(".kt")) {
																														_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
																														imageview1.setImageAsset("kotlin.svg");
																														sizeofdef.setVisibility(View.VISIBLE);
																													}
																													else {
																														if (files.get((int)_position).get("path").toString().endsWith(".xml")) {
																															_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
																															sizeofdef.setVisibility(View.VISIBLE);
																															imageview1.setImageAsset("xml.svg");
																														}
																														else {
																															if (files.get((int)_position).get("path").toString().endsWith(".pas")) {
																																_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
																																sizeofdef.setVisibility(View.VISIBLE);
																																imageview1.setImageAsset("pacal.svg");
																															}
																															else {
																																if (files.get((int)_position).get("path").toString().endsWith(".txt")) {
																																	_tamal(files.get((int)_position).get("path").toString(), sizeofdef);
																																	sizeofdef.setVisibility(View.VISIBLE);
																																	imageview1.setImageAsset("text.svg");
																																}
																																else {
																																	imageview1.setImageAsset("default_file.svg");
																																	sizeofdef.setVisibility(View.GONE);
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