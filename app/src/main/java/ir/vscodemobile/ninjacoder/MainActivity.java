package ir.vscodemobile.ninjacoder;

import ir.vscodemobile.ninjacoder.SplashActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
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
import android.widget.LinearLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import android.content.SharedPreferences;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.webkit.*;
import mrAr.Stop.notmeDicompile.*;
import s4u.restore.swb.*;
import com.jtv7.rippleswitchlib.*;
import com.android.tools.r8.*;
import com.lwb.piechart.*;
import net.lingala.zip4j.*;
import io.github.rosemoe.sora.langs.textmate.*;
import io.github.rosemoe.sora.langs.base.*;
import com.github.underscore.lodash.*;
import com.example.myapp.*;
import org.jetbrains.kotlin.*;
import com.suke.widget.*;
import com.google.gson.*;
import com.github.angads25.filepicker.*;
import io.github.rosemoe.sora.*;
import com.android.*;
import com.googlecode.d2j.*;
import org.antlr.v4.runtime.*;
import com.caverock.androidsvg.*;
import com.blogspot.atifsoftwares.animatoolib.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import androidx.core.content.ContextCompat;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;
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
import io.github.rosemoe.sora.langs.html.*;
import io.github.rosemoe.sora.langs.desc.GoDescription;
 import io.github.rosemoe.sora.langs.xml.*;
import io.github.rosemoe.sora.widget.EditorColorScheme;
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
import ir.vscodemobile.ninjacoder.theme;
import ir.vscodemobile.ninjacoder.htmltheme;
import dalvik.system.*;
import io.github.rosemoe.sora.langs.java.*;
import io.github.rosemoe.sora.langs.python.*;
import javax.*;
import org.*;
import com.google.android.material.*;
import java.*;

public class MainActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private String HEX = "";
	private String currentWord = "";
	private String maincss = "";
	private String htmlb = "";
	
	private ArrayList<String> opt = new ArrayList<>();
	
	private LinearLayout linear1;
	private CodeEditor editor;
	private LinearLayout fmt;
	private HorizontalScrollView hscroll1;
	private LinearLayout fixbar;
	private LinearLayout linear7;
	private SymbolInputView sysbar;
	private LinearLayout linear6;
	private ImageView imageview1;
	private ImageView imageview2;
	private ImageView imageview3;
	private ImageView imageview5;
	private ImageView imageview4;
	private ImageView imageview8;
	private ImageView imageview6;
	private LinearLayout mcolor;
	private LinearLayout linear9;
	private LinearLayout serachbar;
	private ImageView imageview7;
	private EditText search;
	private EditText Replace;
	private LinearLayout linear11;
	private Button btn;
	
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
		
		linear1 = findViewById(R.id.linear1);
		editor = findViewById(R.id.editor);
		fmt = findViewById(R.id.fmt);
		hscroll1 = findViewById(R.id.hscroll1);
		fixbar = findViewById(R.id.fixbar);
		linear7 = findViewById(R.id.linear7);
		sysbar = findViewById(R.id.sysbar);
		linear6 = findViewById(R.id.linear6);
		imageview1 = findViewById(R.id.imageview1);
		imageview2 = findViewById(R.id.imageview2);
		imageview3 = findViewById(R.id.imageview3);
		imageview5 = findViewById(R.id.imageview5);
		imageview4 = findViewById(R.id.imageview4);
		imageview8 = findViewById(R.id.imageview8);
		imageview6 = findViewById(R.id.imageview6);
		mcolor = findViewById(R.id.mcolor);
		linear9 = findViewById(R.id.linear9);
		serachbar = findViewById(R.id.serachbar);
		imageview7 = findViewById(R.id.imageview7);
		search = findViewById(R.id.search);
		Replace = findViewById(R.id.Replace);
		linear11 = findViewById(R.id.linear11);
		btn = findViewById(R.id.btn);
		r1 = getSharedPreferences("r1", Activity.MODE_PRIVATE);
		r2 = getSharedPreferences("r2", Activity.MODE_PRIVATE);
		le = new AlertDialog.Builder(this);
		Assin = getSharedPreferences("Assin", Activity.MODE_PRIVATE);
		lin = getSharedPreferences("lin", Activity.MODE_PRIVATE);
		pin = getSharedPreferences("pin", Activity.MODE_PRIVATE);
		sys = getSharedPreferences("sys", Activity.MODE_PRIVATE);
		Zb = getSharedPreferences("Zb", Activity.MODE_PRIVATE);
		alreplce = new AlertDialog.Builder(this);
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				editor.moveSelectionUp();
			}
		});
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				editor.moveSelectionDown();
			}
		});
		
		imageview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				editor.moveSelectionLeft();
			}
		});
		
		imageview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				editor.setSelection(editor.getText().getLineCount() - 1, editor.getText().getColumnCount(editor.getText().getLineCount() - 1));
			}
		});
		
		imageview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				editor.moveSelectionRight();
			}
		});
		
		imageview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					fixbar.setVisibility(View.VISIBLE);
				} catch (Exception e) {
					 
				}
			}
		});
		
		imageview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				editor.moveSelectionHome();
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
				if (getIntent().getStringExtra("key").equals("empty")) {
					
				}
				else {
					FileUtil.writeFile(getIntent().getStringExtra("key"), editor.getText().toString());
				}
				final com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog = new com.google.android.material.bottomsheet.BottomSheetDialog(MainActivity.this);
				
				View bottomSheetView; bottomSheetView = getLayoutInflater().inflate(R.layout.pop,null );
				bottomSheetDialog.setContentView(bottomSheetView);
				
				bottomSheetDialog.getWindow().findViewById(R.id.design_bottom_sheet).setBackgroundResource(android.R.color.transparent);
				
				LinearLayout bg = (LinearLayout) bottomSheetView.findViewById(R.id.bg);
				LinearLayout link = (LinearLayout) bottomSheetView.findViewById(R.id.link);
				LinearLayout run = (LinearLayout) bottomSheetView.findViewById(R.id.run);
				LinearLayout exit = (LinearLayout) bottomSheetView.findViewById(R.id.exit);
				{
					android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
					SketchUi.setColor(0xFF000027);float lt = getDip(24);
					float rt = getDip(24);
					float rb = getDip(0);
					float lb = getDip(0);
					SketchUi.setCornerRadii(new float[]{
							lt,lt,rt ,rt,rb,rb ,lb,lb });
					bg.setElevation(getDip(3));
					bg.setBackground(SketchUi);
				}
				run.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
						
						_srcruner();
						bottomSheetDialog.dismiss();
						
					}
				});
				link.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
						
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
						bottomSheetDialog.dismiss();
						
					}
				});
				exit.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
						
						bottomSheetDialog.dismiss();
						
					}
				});
				bottomSheetDialog.setCancelable(true);
				bottomSheetDialog.show();
			}
		});
	}
	
	private void initializeLogic() {
		setTitle(getIntent().getStringExtra("title"));
		setTheme(android.R.style.Theme_Material);
		
		getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE|WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFFFF8800".replace("0xFF" , "#")));
		}
		_libraryjarpack();
		fixbar.setVisibility(View.GONE);
		editor.setTypefaceText(Typeface.createFromAsset(getAssets(), "myfont.ttf"));
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =MainActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF000027);
		}
		SymbolInputView inputView = findViewById(R.id.sysbar);
		
		        inputView.bindEditor(editor);
		        inputView.addSymbols(new String[]{"->", "{", "}", "(", ")", "<" , ">" ,"|","$",",", ".", ";", "&","<-","?", "+", "-", "*", "/"},
		                new String[]{"\t", "{}", "}", "(", ")", ",", ".", ";", "\"", "?", "+", "-", "*", "/"});
		
		hscroll1.setHorizontalScrollBarEnabled(false);
		hscroll1.setVerticalScrollBarEnabled(false);
		hscroll1.setOverScrollMode(ListView.OVER_SCROLL_NEVER);
		editor.setTextActionMode(CodeEditor.TextActionMode.POPUP_WINDOW);
		editor.setEdgeEffectColor(Color.RED);
		
		editor.setPinLineNumber(!editor.isLineNumberPinned());
		editor.setNonPrintablePaintingFlags(CodeEditor.FLAG_DRAW_WHITESPACE_LEADING | CodeEditor.FLAG_DRAW_LINE_SEPARATOR);
		//editor.getColorScheme().setColor(EditorColorScheme.WHOLE_BACKGROUND, 0);
		//editor.getColorScheme().setColor(EditorColorScheme.LINE_NUMBER_BACKGROUND, 0);
		//editor.getColorScheme().setColor(EditorColorScheme.TEXT_NORMAL, 0);
		
		_fab.hide();
		if (getIntent().getStringExtra("title").contains(".css")) {
			editor.setColorScheme(new theme());
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
			if (getIntent().getStringExtra("title").contains(".json")) {
				editor.setColorScheme(new theme());
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
				_fab.show();
				_fab.setImageResource(R.drawable.play);
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
					editor.setColorScheme(new htmltheme());
					_fab.setImageResource(R.drawable.play);
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
						_fab.setImageResource(R.drawable.play);
						editor.setColorScheme(new theme());
					}
					else {
						if (getIntent().getStringExtra("title").contains(".sh")) {
							_fab.show();
							editor.setColorScheme(new theme());
							editor.setEditorLanguage(new UniversalLanguage(new ShellDescription()));
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
							_fab.setImageResource(R.drawable.play);
						}
						else {
							if (getIntent().getStringExtra("title").contains(".c")) {
								StringBuilder androidC = new StringBuilder();
								
								try {
									
									Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("key"))).useDelimiter("\\Z");
									while (scanner.hasNext()) {
										androidC .append(scanner.next());
									}
									editor.setText(androidC );
								} catch (Exception rt) {
									rt.printStackTrace();
								}
								editor.setColorScheme(new theme());
								editor.setEditorLanguage(new UniversalLanguage(new CDescription()));
								_fab.show();
								_fab.setImageResource(R.drawable.play);
							}
							else {
								if (getIntent().getStringExtra("title").contains(".cpp")) {
									editor.setColorScheme(new theme());
									
									editor.setEditorLanguage(new UniversalLanguage(new CppDescription()));
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
									_fab.setImageResource(R.drawable.play);
								}
								else {
									if (getIntent().getStringExtra("title").contains(".py")) {
										editor.setColorScheme(new theme());
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
										editor.setEditorLanguage(new PythonLanguage()); 
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
											editor.setColorScheme(new theme());
											_fab.show();
											editor.setEditorLanguage(new UniversalLanguage(new JavaScriptDescription()));
											_fab.setImageResource(R.drawable.play);
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
												editor.setColorScheme(new theme());
												_fab.hide();
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
													editor.setColorScheme(new theme());
													_fab.hide();
													editor.setEditorLanguage(new UniversalLanguage(new NINJADescription()));
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
														editor.setColorScheme(new theme());
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
		_fab.setBackgroundTintList(android.content.res.ColorStateList.valueOf(Color.parseColor("0xFFFF8800".replace("0xFF" , "#"))));
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuItem menuitem1 = menu.add(Menu.NONE, 0, Menu.NONE, "Undo");
		menuitem1.setIcon(R.drawable.undo);
		menuitem1.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
		MenuItem menuitem6 = menu.add(Menu.NONE, 5, Menu.NONE, "cut");
		menuitem6.setIcon(R.drawable.cut);
		menuitem6.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
		MenuItem menuitem4 = menu.add(Menu.NONE, 2, Menu.NONE, "file");
		menuitem4.setIcon(R.drawable.save);
		menuitem4.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
		MenuItem menuitem5 = menu.add(Menu.NONE, 4, Menu.NONE, "color");
		menuitem5.setIcon(R.drawable.color);
		menuitem5.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
		MenuItem menuitem3 = menu.add(Menu.NONE, 3, Menu.NONE, "all");
		menuitem3.setIcon(R.drawable.selectall);
		menuitem3.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
		MenuItem menuitem7 = menu.add(Menu.NONE, 6, Menu.NONE, "del");
		menuitem7.setIcon(R.drawable.del);
		menuitem7.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
		MenuItem menuitem2 = menu.add(Menu.NONE, 1, Menu.NONE, "Redo");
		menuitem2.setIcon(R.drawable.redo);
		menuitem2.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		final int _id = item.getItemId();
		final String _title = (String) item.getTitle();
		if (_id == 0) {
			if (editor.canUndo()) {
				editor.undo();
			}
		}
		if (_id == 1) {
			if (editor.canRedo()) {
				editor.redo();
			}
		}
		if (_id == 3) {
			((io.github.rosemoe.sora.widget.CodeEditor)editor).selectAll();
			
		}
		if (_id == 2) {
			if (getIntent().getStringExtra("save").equals("empty")) {
				
			}
			else {
				FileUtil.writeFile(getIntent().getStringExtra("save"), editor.getText().toString());
				SketchwareUtil.showMessage(getApplicationContext(), "saved");
			}
		}
		if (_id == 4) {
			_ColorPickerDialog(HEX);
		}
		if (_id == 5) {
			try {
				android.content.ClipboardManager clipboard = (android.content.ClipboardManager) getSystemService(CLIPBOARD_SERVICE); 
				ClipData clip = ClipData.newPlainText("label", editor.getText().toString());
				clipboard.setPrimaryClip(clip);
			} catch (Exception e) {
				e.printStackTrace();
			}
			editor.setText("");
		}
		if (_id == 6) {
			editor.setText("");
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	public void onStart() {
		super.onStart();
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF000027".replace("0xFF" , "#")));
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			SketchUi.setColor(0xFF000051);SketchUi.setCornerRadius(getDip(16));
			SketchUi.setStroke((int)getDip(3) ,0xFF01579B);
			btn.setElevation(getDip(5));
			android.graphics.drawable.RippleDrawable SketchUi_RD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE91E63}), SketchUi, null);
			btn.setBackground(SketchUi_RD);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			SketchUi.setColor(0xFF000027);SketchUi.setCornerRadius(getDip(7));
			search.setElevation(getDip(5));
			search.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			SketchUi.setColor(0xFF000027);SketchUi.setCornerRadius(getDip(7));
			Replace.setElevation(getDip(5));
			Replace.setBackground(SketchUi);
		}
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
			SketchUi.setColor(0xFF000027);SketchUi.setCornerRadius(getDip(19));
			confirmar.setElevation(getDip(1));
			android.graphics.drawable.RippleDrawable SketchUi_RD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE0E0E0}), SketchUi, null);
			confirmar.setBackground(SketchUi_RD);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			SketchUi.setColor(0xFF000027);SketchUi.setCornerRadius(getDip(19));
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
				
				pr.setMessage("Running...");
				
				pr.setCancelable(false);
				
				pr.show();
			}
			@Override
			protected String doInBackground(String... params) {
				String _param = params[0];
				//code that prepares the files
				FileUtil.deleteFile(FileUtil.getPackageDataDir(getApplicationContext()).concat("/bin/"));
				FileUtil.makeDir(FileUtil.getPackageDataDir(getApplicationContext()).concat("/bin/"));
				FileUtil.writeFile(FileUtil.getPackageDataDir(getApplicationContext()).concat("/bin/Main.java"), editor.getText().toString());
				//code that copies cp.jar from assets to temp folder (if not exists)
				if (!FileUtil.isExistFile(FileUtil.getPackageDataDir(getApplicationContext()).concat("/bin/cp.jar"))) {
					try (InputStream input = getAssets().open("cp.jar");
					OutputStream output = new FileOutputStream(
					FileUtil.getPackageDataDir(getApplicationContext()).concat("/bin/cp.jar")
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
				publishProgress("Compiling Java...");
				opt.clear();
				opt.add("-1.8");
				opt.add("-nowarn");
				opt.add("-deprecation");
				opt.add("-d");
				opt.add(FileUtil.getPackageDataDir(getApplicationContext()).concat("/bin/classes"));
				opt.add("-cp");
				opt.add(FileUtil.getPackageDataDir(getApplicationContext()).concat("/bin/cp.jar"));
				opt.add("-proc:none");
				opt.add("-sourcepath");
				opt.add("ignore");
				opt.add(FileUtil.getPackageDataDir(getApplicationContext()).concat("/bin/Main.java"));
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
				publishProgress("Packaging JAR...");
				try {
					new JarPackager(
					
					FileUtil.getPackageDataDir(getApplicationContext()).concat("/bin/classes/"),
					
					FileUtil.getPackageDataDir(getApplicationContext()).concat("/bin/classes.jar")
					
					).create();
				} catch (Exception e) {
					return "Packaging JAR failed: " + e.toString();
				}
				//code that runs d8 //dx
				time = System.currentTimeMillis();
				try {
					publishProgress("Dexing with D8...");
					/*

*/
					opt.clear();
					opt.add("--output");
					opt.add(FileUtil.getPackageDataDir(getApplicationContext()).concat("/bin/"));
					opt.add("--lib");
					opt.add(FileUtil.getPackageDataDir(getApplicationContext()).concat("/bin/cp.jar"));
					opt.add(FileUtil.getPackageDataDir(getApplicationContext()).concat("/bin/classes.jar"));
					D8.main(opt.toArray(new String[0]));
				} catch (Exception e) {
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
						FileUtil.getPackageDataDir(getApplicationContext()).concat("/bin/classes.dex")
						, optimizedDir, null, getClassLoader() ); 
						
						Class calledClass = dcl.loadClass("Main");
						
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
									
								}
							}
						}
					}
				}
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