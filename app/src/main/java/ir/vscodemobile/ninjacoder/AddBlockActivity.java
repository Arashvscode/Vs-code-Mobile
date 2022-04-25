package ir.vscodemobile.ninjacoder;

import android.Manifest;
import android.animation.*;
import android.animation.ObjectAnimator;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
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
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.webkit.*;
import android.widget.*;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import com.google.android.material.*;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.gson.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.googlecode.d2j.*;
import com.jtv7.rippleswitchlib.*;
import com.lwb.piechart.*;
import com.oguzdev.circularfloatingactionmenu.library.*;
import com.rohitop.rlottie.*;
import com.suke.widget.*;
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
import io.github.rosemoe.sora.widget.schemes.HTMLScheme;
import io.github.rosemoe.sora.widget.schemes.SchemeDarcula;
import io.github.rosemoe.sora.widget.schemes.SchemeEclipse;
import io.github.rosemoe.sora.widget.schemes.SchemeGitHub;
import io.github.rosemoe.sora.widget.schemes.SchemeNotepadXX;
import io.github.rosemoe.sora.widget.schemes.SchemeVS2019;
import io.github.rosemoe.sora.widget.schemes.HTMLScheme;
import io.github.rosemoe.sora.widget.schemes.SchemeDarcula;
import io.github.rosemoe.sora.widget.schemes.SchemeEclipse;
import io.github.rosemoe.sora.widget.schemes.SchemeGitHub;
import io.github.rosemoe.sora.widget.schemes.SchemeNotepadXX;
import io.github.rosemoe.sora.widget.schemes.SchemeVS2019;

import ir.vscodemobile.ninjacoder.theme;
import io.github.rosemoe.sora.langs.java.JavaLanguage;

public class AddBlockActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private double blockPosotion = 0;
	private String blocksPath = "";
	private boolean isExpanded = false;
	private double returnNumber = 0;
	private String type = "";
	private HashMap<String, Object> hashMap = new HashMap<>();
	private double paletteNumber = 0;
	private String code = "";
	private boolean isDark = false;
	
	private ArrayList<HashMap<String, Object>> blocksListMap = new ArrayList<>();
	private ArrayList<String> listStr = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout bottomTools;
	private LinearLayout saveCloseLin;
	private LinearLayout linearAllData;
	private LinearLayout linearEditorContainer;
	private CardView cardview1;
	private LinearLayout linear4;
	private CardView cardview2;
	private LinearLayout linear7;
	private CardView cardview3;
	private LinearLayout linear12;
	private CardView cardview4;
	private LinearLayout linear15;
	private LinearLayout linear16;
	private LinearLayout linear17;
	private CardView cardview5;
	private LinearLayout linear23;
	private LinearLayout linear2;
	private EditText nameEdit;
	private TextView textview1;
	private LinearLayout linear24;
	private LinearLayout linear5;
	private EditText typeEdit;
	private ImageView imageview2;
	private TextView textview2;
	private LinearLayout linear25;
	private LinearLayout linear10;
	private EditText typeNameEdit;
	private TextView textview3;
	private LinearLayout linearSpecContainer;
	private LinearLayout linear52;
	private LinearLayout linearSpec2;
	private LinearLayout linear14;
	private HorizontalScrollView hscroll4;
	private TextView textview4;
	private EditText specEdit;
	private LinearLayout Spec2Lin;
	private LinearLayout linear50;
	private HorizontalScrollView hscroll10;
	private TextView textview51;
	private LinearLayout linear51;
	private EditText spec2Edit;
	private HorizontalScrollView hscroll5;
	private LinearLayout linearFirstRow;
	private TextView textview8;
	private TextView textview9;
	private TextView textview10;
	private TextView textview11;
	private TextView textview12;
	private TextView textview13;
	private TextView textview14;
	private TextView textview15;
	private TextView textview16;
	private TextView textview18;
	private TextView textview19;
	private TextView textview20;
	private TextView textview21;
	private TextView textview22;
	private TextView textview24;
	private TextView textview25;
	private TextView textview26;
	private TextView textview27;
	private HorizontalScrollView hscroll7;
	private LinearLayout linearRowTwo;
	private TextView textview28;
	private TextView textview29;
	private TextView textview30;
	private TextView textview31;
	private TextView textview32;
	private TextView textview33;
	private TextView textview34;
	private TextView textview35;
	private HorizontalScrollView hscroll8;
	private LinearLayout linearRowThree;
	private TextView textview36;
	private TextView textview37;
	private TextView textview38;
	private TextView textview39;
	private TextView textview40;
	private TextView textview41;
	private TextView textview42;
	private TextView textview43;
	private TextView textview44;
	private TextView textview45;
	private TextView textview46;
	private TextView textview47;
	private TextView textview48;
	private TextView textview49;
	private TextView textview50;
	private LinearLayout linear28;
	private LinearLayout linear19;
	private ImageView imgPickColor;
	private TextView textColor;
	private LinearLayout linearColor;
	private TextView textview5;
	private CodeEditor editor;
	private HorizontalScrollView hscroll9;
	private LinearLayout toolbarGoneVisible;
	private LinearLayout linear42;
	private SymbolInputView symbolsLinear;
	private LinearLayout linear40;
	private EditText searchEdit;
	private ImageView previousSearch;
	private LinearLayout linear6;
	private ImageView nextSezrch;
	private LinearLayout linear35;
	private LinearLayout linear41;
	private ImageView imageview14;
	private ImageView imageview15;
	private LinearLayout linear36;
	private ImageView imageview16;
	private LinearLayout linear37;
	private ImageView imageview3;
	private LinearLayout linear43;
	private ImageView imageview13;
	private ImageView imageview1;
	private LinearLayout linear45;
	private ImageView imageview18;
	private LinearLayout linear46;
	private ImageView imageview19;
	private LinearLayout linear53;
	
	private ObjectAnimator objectanimator = new ObjectAnimator();
	private TimerTask timer;
	private SharedPreferences sp;
	private SharedPreferences sh;
	private AlertDialog.Builder dialog;
	private Intent intent = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.add_block);
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
		bottomTools = findViewById(R.id.bottomTools);
		saveCloseLin = findViewById(R.id.saveCloseLin);
		linearAllData = findViewById(R.id.linearAllData);
		linearEditorContainer = findViewById(R.id.linearEditorContainer);
		cardview1 = findViewById(R.id.cardview1);
		linear4 = findViewById(R.id.linear4);
		cardview2 = findViewById(R.id.cardview2);
		linear7 = findViewById(R.id.linear7);
		cardview3 = findViewById(R.id.cardview3);
		linear12 = findViewById(R.id.linear12);
		cardview4 = findViewById(R.id.cardview4);
		linear15 = findViewById(R.id.linear15);
		linear16 = findViewById(R.id.linear16);
		linear17 = findViewById(R.id.linear17);
		cardview5 = findViewById(R.id.cardview5);
		linear23 = findViewById(R.id.linear23);
		linear2 = findViewById(R.id.linear2);
		nameEdit = findViewById(R.id.nameEdit);
		textview1 = findViewById(R.id.textview1);
		linear24 = findViewById(R.id.linear24);
		linear5 = findViewById(R.id.linear5);
		typeEdit = findViewById(R.id.typeEdit);
		imageview2 = findViewById(R.id.imageview2);
		textview2 = findViewById(R.id.textview2);
		linear25 = findViewById(R.id.linear25);
		linear10 = findViewById(R.id.linear10);
		typeNameEdit = findViewById(R.id.typeNameEdit);
		textview3 = findViewById(R.id.textview3);
		linearSpecContainer = findViewById(R.id.linearSpecContainer);
		linear52 = findViewById(R.id.linear52);
		linearSpec2 = findViewById(R.id.linearSpec2);
		linear14 = findViewById(R.id.linear14);
		hscroll4 = findViewById(R.id.hscroll4);
		textview4 = findViewById(R.id.textview4);
		specEdit = findViewById(R.id.specEdit);
		Spec2Lin = findViewById(R.id.Spec2Lin);
		linear50 = findViewById(R.id.linear50);
		hscroll10 = findViewById(R.id.hscroll10);
		textview51 = findViewById(R.id.textview51);
		linear51 = findViewById(R.id.linear51);
		spec2Edit = findViewById(R.id.spec2Edit);
		hscroll5 = findViewById(R.id.hscroll5);
		linearFirstRow = findViewById(R.id.linearFirstRow);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		textview10 = findViewById(R.id.textview10);
		textview11 = findViewById(R.id.textview11);
		textview12 = findViewById(R.id.textview12);
		textview13 = findViewById(R.id.textview13);
		textview14 = findViewById(R.id.textview14);
		textview15 = findViewById(R.id.textview15);
		textview16 = findViewById(R.id.textview16);
		textview18 = findViewById(R.id.textview18);
		textview19 = findViewById(R.id.textview19);
		textview20 = findViewById(R.id.textview20);
		textview21 = findViewById(R.id.textview21);
		textview22 = findViewById(R.id.textview22);
		textview24 = findViewById(R.id.textview24);
		textview25 = findViewById(R.id.textview25);
		textview26 = findViewById(R.id.textview26);
		textview27 = findViewById(R.id.textview27);
		hscroll7 = findViewById(R.id.hscroll7);
		linearRowTwo = findViewById(R.id.linearRowTwo);
		textview28 = findViewById(R.id.textview28);
		textview29 = findViewById(R.id.textview29);
		textview30 = findViewById(R.id.textview30);
		textview31 = findViewById(R.id.textview31);
		textview32 = findViewById(R.id.textview32);
		textview33 = findViewById(R.id.textview33);
		textview34 = findViewById(R.id.textview34);
		textview35 = findViewById(R.id.textview35);
		hscroll8 = findViewById(R.id.hscroll8);
		linearRowThree = findViewById(R.id.linearRowThree);
		textview36 = findViewById(R.id.textview36);
		textview37 = findViewById(R.id.textview37);
		textview38 = findViewById(R.id.textview38);
		textview39 = findViewById(R.id.textview39);
		textview40 = findViewById(R.id.textview40);
		textview41 = findViewById(R.id.textview41);
		textview42 = findViewById(R.id.textview42);
		textview43 = findViewById(R.id.textview43);
		textview44 = findViewById(R.id.textview44);
		textview45 = findViewById(R.id.textview45);
		textview46 = findViewById(R.id.textview46);
		textview47 = findViewById(R.id.textview47);
		textview48 = findViewById(R.id.textview48);
		textview49 = findViewById(R.id.textview49);
		textview50 = findViewById(R.id.textview50);
		linear28 = findViewById(R.id.linear28);
		linear19 = findViewById(R.id.linear19);
		imgPickColor = findViewById(R.id.imgPickColor);
		textColor = findViewById(R.id.textColor);
		linearColor = findViewById(R.id.linearColor);
		textview5 = findViewById(R.id.textview5);
		editor = findViewById(R.id.editor);
		hscroll9 = findViewById(R.id.hscroll9);
		toolbarGoneVisible = findViewById(R.id.toolbarGoneVisible);
		linear42 = findViewById(R.id.linear42);
		symbolsLinear = findViewById(R.id.symbolsLinear);
		linear40 = findViewById(R.id.linear40);
		searchEdit = findViewById(R.id.searchEdit);
		previousSearch = findViewById(R.id.previousSearch);
		linear6 = findViewById(R.id.linear6);
		nextSezrch = findViewById(R.id.nextSezrch);
		linear35 = findViewById(R.id.linear35);
		linear41 = findViewById(R.id.linear41);
		imageview14 = findViewById(R.id.imageview14);
		imageview15 = findViewById(R.id.imageview15);
		linear36 = findViewById(R.id.linear36);
		imageview16 = findViewById(R.id.imageview16);
		linear37 = findViewById(R.id.linear37);
		imageview3 = findViewById(R.id.imageview3);
		linear43 = findViewById(R.id.linear43);
		imageview13 = findViewById(R.id.imageview13);
		imageview1 = findViewById(R.id.imageview1);
		linear45 = findViewById(R.id.linear45);
		imageview18 = findViewById(R.id.imageview18);
		linear46 = findViewById(R.id.linear46);
		imageview19 = findViewById(R.id.imageview19);
		linear53 = findViewById(R.id.linear53);
		sp = getSharedPreferences("sp2", Activity.MODE_PRIVATE);
		sh = getSharedPreferences("sh2", Activity.MODE_PRIVATE);
		dialog = new AlertDialog.Builder(this);
		
		linearAllData.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		typeEdit.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_charSeq.equals(" ")) {
					typeEdit.setText("regular");
				}
				else {
					if (_charSeq.equals("e")) {
						linearSpec2.setVisibility(View.VISIBLE);
					}
					else {
						linearSpec2.setVisibility(View.GONE);
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
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				View view = getCurrentFocus();
				if (view != null) {  
						    android.view.inputmethod.InputMethodManager imm = (android.view.inputmethod.InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
						    imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
				}
				{
						final String[] array = listStr.toArray(new String[0]);
						final String[] chosen = {""};
						AlertDialog.Builder builder;
						
						boolean dark = isDark;
						
						if (dark) {
									builder = new AlertDialog.Builder(AddBlockActivity.this, AlertDialog.THEME_DEVICE_DEFAULT_DARK);
						} else {
									builder = new AlertDialog.Builder(AddBlockActivity.this, AlertDialog.THEME_DEVICE_DEFAULT_DARK);
						}
						
						
						builder.setCancelable(false);
						        //builder.setIcon(R.drawable.icon);
						        builder.setTitle("Select");
						        builder.setSingleChoiceItems(array, -1, new DialogInterface
						                .OnClickListener() {
								            public void onClick(DialogInterface dialog, int item) {
										              
										              chosen[0] = array[item];
										              
										            }
								        });
						        
						        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
									@Override
									public void onClick(DialogInterface dialog, int _which) {
										
										
												
									}
						});
						
						builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
									@Override
									public void onClick(DialogInterface _dialog, int _which) {
										
										
												
									}
						});
						
						        final AlertDialog alert = builder.create();
						        alert.show();
						
						alert.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener()
						 { 
									 @Override
									 public void onClick(View v)
									 {
												 Boolean wantToCloseDialog = false;
										
										
										String item = chosen[0];
										if (item.isEmpty()){
												
										} else {
												typeEdit.setText(_setType(item));
												alert.dismiss();
										}
												 if(wantToCloseDialog) {
															 
															 }
												 }
									 });
						
				}
			}
		});
		
		imgPickColor.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ColorPicker seekColorPicker = new ColorPicker(AddBlockActivity.this);
				
						final AlertDialog.Builder buildPicker = new AlertDialog.Builder(AddBlockActivity.this);
				
						final LinearLayout linPicker = new LinearLayout(getApplicationContext());
				
				
						buildPicker.setNegativeButton("Exit🚪", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
						
						
								
						}
				});
				
				
				
						linPicker.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
				
						linPicker.setOrientation(LinearLayout.VERTICAL);
				
						linPicker.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
				
				
				
						buildPicker.setPositiveButton("Save✔️", new DialogInterface.OnClickListener() {
									@Override
									public void onClick(DialogInterface dialogInterface, int i) {
								
										
						textColor.setText(hex.getText().toString());
						try { 
							textColor.setTextColor(Color.parseColor(hex.getText().toString()));
							linearColor.setBackgroundColor(Color.parseColor(hex.getText().toString()));
						} catch (Exception e){
							e.printStackTrace();
						}
					}
						});
				
				
				
						linPicker.addView(seekColorPicker);
						buildPicker.setView(linPicker);
						buildPicker.show();
			}
		});
		
		editor.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_DimAnimation(linearAllData, true, SketchwareUtil.getDip(getApplicationContext(), (int)(45)), 400);
				saveCloseLin.setVisibility(View.GONE);
				bottomTools.setVisibility(View.VISIBLE);
				_fab.show();
			}
		});
		
		searchEdit.addTextChangedListener(new TextWatcher() {
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
		
		previousSearch.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					           editor.getSearcher().gotoLast();
					        } catch (IllegalStateException e) {
					            e.printStackTrace();
					        }
			}
		});
		
		nextSezrch.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					            editor.getSearcher().gotoNext();
					        } catch (IllegalStateException e) {
					            e.printStackTrace();
					        }
			}
		});
		
		imageview14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				AlertDialog.Builder alert = new AlertDialog.Builder(AddBlockActivity.this, AlertDialog.THEME_HOLO_LIGHT); 
				alert.setTitle("Replace All with 👇");
				
				    
				
				final EditText myedit = new EditText(AddBlockActivity.this); 
				myedit.setHint("new word..."); 
				myedit.setLayoutParams
				(new LinearLayout.LayoutParams
				(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 
				 android.widget.LinearLayout.LayoutParams.WRAP_CONTENT));
				
				Drawable drawable = myedit.getBackground(); // get current EditText drawable 
				drawable.setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_ATOP); 
				
				if(Build.VERSION.SDK_INT > 16) {
						    myedit.setBackground(drawable); 
				}else{
						    myedit.setBackgroundDrawable(drawable); 
				}
				
				 alert.setView(myedit);
				
				myedit.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)13, 0xFFEEEEEE));
						myedit.setTextColor(0xFF000000);
				final String _btn9 = ("replaceAll");
				alert.setPositiveButton(_btn9, new DialogInterface.OnClickListener() {
						     @Override
						     public void onClick(DialogInterface _dialog, int _which) {
								     if (searchEdit.getText().toString().equals("") || searchEdit.getText().toString().equals("  ")) {
										searchEdit.setError("!");
								}
								else {
										try {
												            editor.getSearcher().replaceAll(myedit.getText().toString());
												        } catch (IllegalStateException e) {
												            e.printStackTrace();
												        }
								}
								
						}
						    });
				final String _btn = ("Exit");
				alert.setNegativeButton(_btn, new DialogInterface.OnClickListener() {
						    @Override
						    public void onClick(DialogInterface dialog, int id) {
								    
								 
								        
								    }
						    });
				final AlertDialog dialog = alert.create();
				dialog.show();
			}
		});
		
		imageview16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				editor.undo();
			}
		});
		
		imageview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				editor.redo();
			}
		});
		
		imageview13.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				editor.setText("");
				return true;
			}
		});
		
		imageview13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				android.view.inputmethod.BaseInputConnection inputConnection = new android.view.inputmethod.BaseInputConnection(AddBlockActivity.this.getWindow().getDecorView().getRootView(), true);
				inputConnection.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL));
			}
		});
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_DimAnimation(linearAllData, true, SketchwareUtil.getDip(getApplicationContext(), (int)(40)), 400);
				saveCloseLin.setVisibility(View.GONE);
				bottomTools.setVisibility(View.VISIBLE);
				_fab.show();
			}
		});
		
		imageview18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					if (getIntent().getStringExtra("cmd").equals("edit")) {
						if (typeEdit.getText().toString().equals("e")) {
							blocksListMap.get((int)blockPosotion).put("name", nameEdit.getText().toString());
							blocksListMap.get((int)blockPosotion).put("type", _setType(typeEdit.getText().toString()));
							blocksListMap.get((int)blockPosotion).put("typeName", typeNameEdit.getText().toString());
							blocksListMap.get((int)blockPosotion).put("spec", specEdit.getText().toString());
							blocksListMap.get((int)blockPosotion).put("color", textColor.getText().toString());
							blocksListMap.get((int)blockPosotion).put("code", editor.getText().toString());
							blocksListMap.get((int)blockPosotion).put("palette", String.valueOf((long)(paletteNumber)));
							blocksListMap.get((int)blockPosotion).put("spec2", spec2Edit.getText().toString());
							FileUtil.writeFile(blocksPath, new Gson().toJson(blocksListMap));
							SketchwareUtil.showMessage(getApplicationContext(), "√");
							finish();
						}
						else {
							if (!typeEdit.getText().toString().equals("e") && blocksListMap.get((int)blockPosotion).containsKey("spec2")) {
								blocksListMap.remove((int)(blockPosotion));
								hashMap = new HashMap<>();
								hashMap.put("name", _setValidName(nameEdit.getText().toString()));
								hashMap.put("type", _setType(typeEdit.getText().toString()));
								hashMap.put("typeName", typeNameEdit.getText().toString());
								hashMap.put("spec", specEdit.getText().toString());
								hashMap.put("color", textColor.getText().toString());
								hashMap.put("code", editor.getText().toString());
								hashMap.put("palette", String.valueOf((long)(paletteNumber)));
								blocksListMap.add((int)paletteNumber, hashMap);
								FileUtil.writeFile(blocksPath, new Gson().toJson(blocksListMap));
								SketchwareUtil.showMessage(getApplicationContext(), "√");
								finish();
							}
							else {
								blocksListMap.get((int)blockPosotion).put("name", nameEdit.getText().toString());
								blocksListMap.get((int)blockPosotion).put("type", _setType(typeEdit.getText().toString()));
								blocksListMap.get((int)blockPosotion).put("typeName", typeNameEdit.getText().toString());
								blocksListMap.get((int)blockPosotion).put("spec", specEdit.getText().toString());
								blocksListMap.get((int)blockPosotion).put("color", textColor.getText().toString());
								blocksListMap.get((int)blockPosotion).put("code", editor.getText().toString());
								blocksListMap.get((int)blockPosotion).put("palette", String.valueOf((long)(paletteNumber)));
								FileUtil.writeFile(blocksPath, new Gson().toJson(blocksListMap));
								SketchwareUtil.showMessage(getApplicationContext(), "√");
								finish();
							}
						}
					}
					else {
						if (getIntent().getStringExtra("cmd").equals("add")) {
							hashMap = new HashMap<>();
							hashMap.put("name", _setValidName(nameEdit.getText().toString()));
							hashMap.put("type", _setType(typeEdit.getText().toString()));
							hashMap.put("typeName", typeNameEdit.getText().toString());
							hashMap.put("spec", specEdit.getText().toString());
							hashMap.put("color", textColor.getText().toString());
							hashMap.put("code", editor.getText().toString());
							hashMap.put("palette", String.valueOf((long)(paletteNumber)));
							if (typeEdit.getText().toString().equals("e")) {
								hashMap.put("spec2", spec2Edit.getText().toString());
							}
							blocksListMap.add(hashMap);
							FileUtil.writeFile(blocksPath, new Gson().toJson(blocksListMap));
							SketchwareUtil.showMessage(getApplicationContext(), "√");
							finish();
						}
						else {
							
						}
					}
				} catch (Exception e) {
					 
				}
			}
		});
		
		imageview19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finish();
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				View view = getCurrentFocus();
				if (view != null) {  
					    android.view.inputmethod.InputMethodManager imm = (android.view.inputmethod.InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
					    imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
				}
				_DimAnimation(linearAllData, true, SketchwareUtil.getDip(getApplicationContext(), (int)(300)), 400);
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								_DimAnimation(linearAllData, true, SketchwareUtil.getDip(getApplicationContext(), (int)(0)), 0);
								saveCloseLin.setVisibility(View.VISIBLE);
								bottomTools.setVisibility(View.GONE);
								cardview5.setVisibility(View.VISIBLE);
								_fab.hide();
							}
						});
					}
				};
				_timer.schedule(timer, (int)(300));
			}
		});
	}
	
	private void initializeLogic() {
		getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE|WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
		editor.setTypefaceText(Typeface.createFromAsset(getAssets(), "myfont.ttf"));
		editor.setTypefaceLineNumber(Typeface.createFromAsset(getAssets(), "myfont.ttf"));
		editor.setPinLineNumber(!editor.isLineNumberPinned());
		editor.setNonPrintablePaintingFlags(CodeEditor.FLAG_DRAW_WHITESPACE_LEADING | CodeEditor.FLAG_DRAW_LINE_SEPARATOR);
		editor.setTextActionMode(CodeEditor.TextActionMode.POPUP_WINDOW);
		editor.setEdgeEffectColor(Color.RED);
		
		editor.setColorScheme(new theme());
		editor.setEditorLanguage(new JavaLanguage()); 
		Thread.setDefaultUncaughtExceptionHandler(new TopExceptionHandler(AddBlockActivity.this));
		returnNumber = linearAllData.getHeight();
		isExpanded = true;
		blocksPath = "/storage/emulated/0/.sketchware/resources/block/My Block/block.json";
		editor.setTextSize((int)13);
		if (getIntent().getStringExtra("cmd").equals("edit")) {
			blockPosotion = Double.parseDouble(getIntent().getStringExtra("blockIndex"));
			paletteNumber = Double.parseDouble(getIntent().getStringExtra("palette")) + 9;
			{
				StringBuilder stringBuilder = new StringBuilder();
				
				try {
					
					Scanner scanner = new Scanner(getIntent().getStringExtra("code")).useDelimiter("\\Z");
					while (scanner.hasNext()) {
						stringBuilder .append(scanner.next());
					}
					editor.setText(stringBuilder );
				} catch (Exception rt) {
					rt.printStackTrace();
				}
			}
			nameEdit.setText(getIntent().getStringExtra("name"));
			specEdit.setText(getIntent().getStringExtra("spec"));
			textColor.setText(getIntent().getStringExtra("color"));
			linearColor.setBackgroundColor(Color.parseColor(getIntent().getStringExtra("color")));
			typeEdit.setText(getIntent().getStringExtra("type"));
			typeNameEdit.setText(getIntent().getStringExtra("typename"));
			if (true) {
				
			}
			if (getIntent().getStringExtra("type").equals("e")) {
				linearSpec2.setVisibility(View.VISIBLE);
				if (getIntent().hasExtra("spec2")) {
					spec2Edit.setText(getIntent().getStringExtra("spec2"));
				}
			}
			else {
				linearSpec2.setVisibility(View.GONE);
				spec2Edit.setText("");
			}
		}
		else {
			if (getIntent().getStringExtra("cmd").equals("add")) {
				paletteNumber = Double.parseDouble(getIntent().getStringExtra("palette")) + 9;
				SketchwareUtil.showMessage(getApplicationContext(), "add");
				try { 
					textColor.setText(getIntent().getStringExtra("color"));
					linearColor.setBackgroundColor(Color.parseColor(getIntent().getStringExtra("color")));
					typeEdit.setText("regular");
				} catch (Exception e){
					e.printStackTrace();
				}
			}
			else {
				SketchwareUtil.showMessage(getApplicationContext(), "else");
			}
		}
		/*
 
*/
		new Thread(new Runnable() {
			@Override
			public void run() {
				Looper.prepare();
				
				if (FileUtil.isExistFile(blocksPath) && !(FileUtil.readFile(blocksPath).equals("") || FileUtil.readFile(blocksPath).equals("[]"))) {
					blocksListMap.clear();
					new Thread(new Runnable() {
						@Override
						public void run() {
							Looper.prepare();
							
							blocksListMap = new Gson().fromJson(FileUtil.readFile(blocksPath), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
							
							
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									
									
									 
									
									Looper.loop();
								} 
								
							});
						}
					}).start();
					
					
				}
				
				
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						
						
						 
						
						Looper.loop();
					} 
					
				});
			}
		}).start();
		
		
		_colorShemType();
		_fab.hide();
		_refreshCheckBox();
		_sertings();
		_clickAddText();
		boolean[] find ={false};
		
		try {
			    java.io.BufferedReader reader = new java.io.BufferedReader(
			        new java.io.InputStreamReader(openFileInput("stack.trace")));
			String line ="";
			
			    while((line = reader.readLine()) != null) {
				        trace += line+"\n";
				    }
			find[0]=true;
		} catch(java.io.FileNotFoundException fnfe) {
			find[0]=false;
			    // ...
		} catch(java.io.IOException ioe) {
			find[0]=false;
			    // ...
		}
		
		if (find[0]) {
			
			 
			
			
		}
		typeEdit.setEnabled(false);
		    typeEdit.setCursorVisible(false);
		    typeEdit.setKeyListener(null);
		    typeEdit.setBackgroundColor(Color.TRANSPARENT); 
		fonts(getApplicationContext(),getWindow().getDecorView()); 
	} 
	  private void fonts(final android.content.Context context, final View v) {
		    String fontName = "fonts/hack_regular.ttf";
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
		_fab.setBackgroundTintList(android.content.res.ColorStateList.valueOf(Color.parseColor("0xFFFF8800".replace("0xFF" , "#"))));
	}
	
	
	@Override
	public void onStart() {
		super.onStart();
		cardview1.setCardBackgroundColor(0xFF000027);
		cardview2.setCardBackgroundColor(0xFF000027);
		cardview3.setCardBackgroundColor(0xFF000027);
		cardview4.setCardBackgroundColor(0xFF000027);
		cardview5.setCardBackgroundColor(0xFF000027);
		cardview1.setRadius((float)25);
		cardview2.setRadius((float)25);
		cardview3.setRadius((float)25);
		cardview4.setRadius((float)25);
		cardview5.setRadius((float)25);
		cardview1.setCardElevation((float)25);
		cardview2.setRadius((float)25);
		cardview3.setRadius((float)25);
		cardview4.setRadius((float)25);
		cardview5.setCardElevation((float)25);
		colorHandles(nameEdit, 0xFFF44336);
		setCursorDrawableColor(nameEdit, 0xFFF44336);
		nameEdit.setHighlightColor(0xFFF44336);
		colorHandles(typeEdit, 0xFF2196F3);
		setCursorDrawableColor(typeEdit, 0xFF2196F3);
		typeEdit.setHighlightColor(0xFF2196F3);
		colorHandles(typeNameEdit, 0xFF00BCD4);
		setCursorDrawableColor(typeNameEdit, 0xFF00BCD4);
		typeNameEdit.setHighlightColor(0xFF00BCD4);
		colorHandles(specEdit, 0xFFFF5722);
		setCursorDrawableColor(specEdit, 0xFFFF5722);
		specEdit.setHighlightColor(0xFFFF5722);
		colorHandles(spec2Edit, 0xFFE91E63);
		setCursorDrawableColor(spec2Edit, 0xFFE91E63);
		spec2Edit.setHighlightColor(0xFFE91E63);
		colorHandles(searchEdit, 0xFFFFEB3B);
		setCursorDrawableColor(searchEdit, 0xFFFFEB3B);
		searchEdit.setHighlightColor(0xFFFFEB3B);
	}
	public void _clickAddText() {
		for(int _repeat10 = 0; _repeat10 < (int)(linearFirstRow.getChildCount()); _repeat10++) {
			final View vv = linearFirstRow.getChildAt((int)_repeat10);
			if (vv instanceof TextView) {
				((TextView)vv).setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						String textoo = ((TextView)vv).getTag().toString();
						int start = specEdit.getSelectionStart(); 
						specEdit.getText().insert(start, textoo);
					}
				});
				((TextView)vv).setOnTouchListener(new View.OnTouchListener() {
					@Override
					public boolean onTouch(View v, MotionEvent event) {
						switch (event.getAction()){
							case MotionEvent.ACTION_DOWN:{
								ObjectAnimator scaleX = new ObjectAnimator();
								scaleX.setTarget(((TextView)vv));
								scaleX.setPropertyName("scaleX");
								scaleX.setFloatValues(0.9f);
								scaleX.setDuration((int)5);
								scaleX.start();
								
								ObjectAnimator scaleY = new ObjectAnimator();
								scaleY.setTarget(((TextView)vv));
								scaleY.setPropertyName("scaleY");
								scaleY.setFloatValues(0.9f);
								scaleY.setDuration((int)5);
								scaleY.start();
								break;
							}
							case MotionEvent.ACTION_UP:{
								
								ObjectAnimator scaleX = new ObjectAnimator();
								scaleX.setTarget(((TextView)vv));
								scaleX.setPropertyName("scaleX");
								scaleX.setFloatValues((float)1);
								scaleX.setDuration((int)5);
								scaleX.start();
								
								ObjectAnimator scaleY = new ObjectAnimator();
								scaleY.setTarget(((TextView)vv));
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
				((TextView)vv).setOnLongClickListener(new View.OnLongClickListener() {
						         @Override
						         public boolean onLongClick(View v) {
								      
								String txt = "";
								
								txt = v.getTag().toString();
								
								ClipData.Item item = new ClipData.Item(txt);
										ClipData dragData = new ClipData(txt, new String[]{
													ClipDescription.MIMETYPE_TEXT_PLAIN }, item);
										DragShadowBuilder myShadow = new View.DragShadowBuilder(((TextView)vv));
										if (Build.VERSION.SDK_INT >= 24){v.startDragAndDrop(dragData, myShadow, ((TextView)vv), 0); } else {
													v.startDrag(dragData, myShadow, ((TextView)vv), 0); }
								
								 
										  
								            return true;
								         }
						      });
				((TextView)vv).setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c) { this.setStroke(a, b); this.setColor(c); return this; } }.getIns((int)2, 0xFFBDBDBD, Color.TRANSPARENT));
				
				if (isDark) {
					((TextView)vv).setTextColor(0xFFFFAB91);
				}
				else {
					((TextView)vv).setTextColor(0xFFBF360C);
				}
			}
		}
		for(int _repeat11 = 0; _repeat11 < (int)(linearRowTwo.getChildCount()); _repeat11++) {
			final View vv = linearRowTwo.getChildAt((int)_repeat11);
			if (vv instanceof TextView) {
				((TextView)vv).setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						String textoo = ((TextView)vv).getTag().toString();
						int start = specEdit.getSelectionStart(); 
						specEdit.getText().insert(start, textoo);
					}
				});
				((TextView)vv).setOnTouchListener(new View.OnTouchListener() {
					@Override
					public boolean onTouch(View v, MotionEvent event) {
						switch (event.getAction()){
							case MotionEvent.ACTION_DOWN:{
								ObjectAnimator scaleX = new ObjectAnimator();
								scaleX.setTarget(((TextView)vv));
								scaleX.setPropertyName("scaleX");
								scaleX.setFloatValues(0.9f);
								scaleX.setDuration((int)5);
								scaleX.start();
								
								ObjectAnimator scaleY = new ObjectAnimator();
								scaleY.setTarget(((TextView)vv));
								scaleY.setPropertyName("scaleY");
								scaleY.setFloatValues(0.9f);
								scaleY.setDuration((int)5);
								scaleY.start();
								break;
							}
							case MotionEvent.ACTION_UP:{
								
								ObjectAnimator scaleX = new ObjectAnimator();
								scaleX.setTarget(((TextView)vv));
								scaleX.setPropertyName("scaleX");
								scaleX.setFloatValues((float)1);
								scaleX.setDuration((int)5);
								scaleX.start();
								
								ObjectAnimator scaleY = new ObjectAnimator();
								scaleY.setTarget(((TextView)vv));
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
				((TextView)vv).setOnLongClickListener(new View.OnLongClickListener() {
						         @Override
						         public boolean onLongClick(View v) {
								      
								String txt = "";
								
								txt = v.getTag().toString();
								
								ClipData.Item item = new ClipData.Item(txt);
										ClipData dragData = new ClipData(txt, new String[]{
													ClipDescription.MIMETYPE_TEXT_PLAIN }, item);
										DragShadowBuilder myShadow = new View.DragShadowBuilder(((TextView)vv));
										if (Build.VERSION.SDK_INT >= 24){v.startDragAndDrop(dragData, myShadow, ((TextView)vv), 0); } else {
													v.startDrag(dragData, myShadow, ((TextView)vv), 0); }
								
								 
										  
								            return true;
								         }
						      });
				((TextView)vv).setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c) { this.setStroke(a, b); this.setColor(c); return this; } }.getIns((int)2, 0xFFBDBDBD, Color.TRANSPARENT));
				
				if (isDark) {
					((TextView)vv).setTextColor(0xFFEA80FC);
				}
				else {
					((TextView)vv).setTextColor(0xFFAA00FF);
				}
			}
		}
		for(int _repeat12 = 0; _repeat12 < (int)(linearRowThree.getChildCount()); _repeat12++) {
			final View vv = linearRowThree.getChildAt((int)_repeat12);
			if (vv instanceof TextView) {
				((TextView)vv).setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						String textoo = ((TextView)vv).getTag().toString();
						int start = specEdit.getSelectionStart(); 
						specEdit.getText().insert(start, textoo);
					}
				});
				((TextView)vv).setOnTouchListener(new View.OnTouchListener() {
					@Override
					public boolean onTouch(View v, MotionEvent event) {
						switch (event.getAction()){
							case MotionEvent.ACTION_DOWN:{
								ObjectAnimator scaleX = new ObjectAnimator();
								scaleX.setTarget(((TextView)vv));
								scaleX.setPropertyName("scaleX");
								scaleX.setFloatValues(0.9f);
								scaleX.setDuration((int)5);
								scaleX.start();
								
								ObjectAnimator scaleY = new ObjectAnimator();
								scaleY.setTarget(((TextView)vv));
								scaleY.setPropertyName("scaleY");
								scaleY.setFloatValues(0.9f);
								scaleY.setDuration((int)5);
								scaleY.start();
								break;
							}
							case MotionEvent.ACTION_UP:{
								
								ObjectAnimator scaleX = new ObjectAnimator();
								scaleX.setTarget(((TextView)vv));
								scaleX.setPropertyName("scaleX");
								scaleX.setFloatValues((float)1);
								scaleX.setDuration((int)5);
								scaleX.start();
								
								ObjectAnimator scaleY = new ObjectAnimator();
								scaleY.setTarget(((TextView)vv));
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
				((TextView)vv).setOnLongClickListener(new View.OnLongClickListener() {
						         @Override
						         public boolean onLongClick(View v) {
								      
								String txt = "";
								
								txt = v.getTag().toString();
								
								ClipData.Item item = new ClipData.Item(txt);
										ClipData dragData = new ClipData(txt, new String[]{
													ClipDescription.MIMETYPE_TEXT_PLAIN }, item);
										DragShadowBuilder myShadow = new View.DragShadowBuilder(((TextView)vv));
										if (Build.VERSION.SDK_INT >= 24){v.startDragAndDrop(dragData, myShadow, ((TextView)vv), 0); } else {
													v.startDrag(dragData, myShadow, ((TextView)vv), 0); }
								
								 
										  
								            return true;
								         }
						      });
				((TextView)vv).setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c) { this.setStroke(a, b); this.setColor(c); return this; } }.getIns((int)2, 0xFFBDBDBD, Color.TRANSPARENT));
				
				if (isDark) {
					((TextView)vv).setTextColor(0xFFA7FFEB);
				}
				else {
					((TextView)vv).setTextColor(0xFF00695C);
				}
			}
		}
		specEdit.setOnDragListener( new OnDragListener(){
				         @Override
				         public boolean onDrag(View v,  DragEvent event){
						View view = (View) event.getLocalState();
						int offset = specEdit.getOffsetForPosition(event.getX(), event.getY()); 
						         switch(event.getAction())                   
						         {
								            case DragEvent.ACTION_DRAG_STARTED:
								if (event.getClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)) {
										//vib.vibrate((long)100);
										v.invalidate();
										return true;
								}
								return false;
								case DragEvent.ACTION_DRAG_ENTERED:
								v.invalidate();
								return true;
								case DragEvent.ACTION_DRAG_LOCATION:
								final int x = (int)event.getX();
								final int y =(int) event.getY();
								
								
								   
								   specEdit.setSelection(offset);
								
								return true;
								case DragEvent.ACTION_DRAG_EXITED:
								
								v.invalidate();
								return true;
								case DragEvent.ACTION_DROP:
								ClipData.Item item = event.getClipData().getItemAt(0);
								String dragData = item.getText().toString();
								
								
								               
										
								   
								   specEdit.setSelection(offset);
								   
												specEdit.getText().insert(offset, " "+view.getTag().toString()+ " ");
												
												
								
								v.invalidate();
								return true;
								case DragEvent.ACTION_DRAG_ENDED:
								v.invalidate();
								if (event.getResult()) {
										 
								} else {
										 
								}
								return true;
								default:
								break;
								            }
						            return true;
						         }
				      });
		typeNameEdit.setOnDragListener( new OnDragListener(){
			         @Override
			         public boolean onDrag(View v,  DragEvent event){
				View view = (View) event.getLocalState();
				         switch(event.getAction())                   
				         {
					            case DragEvent.ACTION_DRAG_STARTED:
					if (event.getClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)) {
						//vib.vibrate((long)100);
						v.invalidate();
						return true;
					}
					return false;
					case DragEvent.ACTION_DRAG_ENTERED:
					v.invalidate();
					return true;
					case DragEvent.ACTION_DRAG_LOCATION:
					final int x = (int)event.getX();
					final int y =(int) event.getY();
					
					return true;
					case DragEvent.ACTION_DRAG_EXITED:
					
					v.invalidate();
					return true;
					case DragEvent.ACTION_DROP:
					ClipData.Item item = event.getClipData().getItemAt(0);
					String dragData = item.getText().toString();
					
					
					               String textoo = ((TextView)view).getText().toString();
					int start = typeNameEdit.getSelectionStart(); 
					typeNameEdit.getText().insert(start, textoo);
					
					v.invalidate();
					return true;
					case DragEvent.ACTION_DRAG_ENDED:
					v.invalidate();
					if (event.getResult()) {
						 
					} else {
						 
					}
					return true;
					default:
					break;
					            }
				            return true;
				         }
			      });
	}
	
	
	public void _DimAnimation(final View _view, final boolean _isHeight, final double _nextValue, final double _ms) {
		ValueAnimator anim = ValueAnimator.ofInt((int) _view.getMeasuredHeight(), (int) _nextValue); anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
			@Override public void onAnimationUpdate(
			ValueAnimator valueAnimator) {
				int val = (int) valueAnimator.getAnimatedValue(); ViewGroup.LayoutParams layoutParams = _view.getLayoutParams(); 
				layoutParams.height = val; 
				_view.setLayoutParams(layoutParams);
			}}); 
		anim.setDuration((int) _ms);
		anim.setInterpolator(new DecelerateInterpolator());
		anim.start(); 
	}
	
	
	public void _getHeight(final View _view) {
		returnNumber = _view.getMeasuredHeight();
	}
	
	
	public void _colorShemType() {
		Collections.sort(listStr);
		listStr.add("regular");
		listStr.add("c (if then)");
		listStr.add("s (String)");
		listStr.add("d (number)");
		listStr.add("b (boolean)");
		listStr.add("e (if then else)");
		listStr.add("v (Variable)");
		listStr.add("a (map)");
		listStr.add("f (stop)");
		listStr.add("l (List)");
		listStr.add("p");
		listStr.add("h (Header)");
		ColorScheme keywords = new ColorScheme(
						Pattern.compile(
								"\\b(transient|super|Activity|AppCompatActivity|MainActivity|View|Log|MotionEvent|void|const|static|volatile|interface|native|protected|final|abstract|synchronized|enum|instanceof|assert|break|goto|return|new|throw|throws|super|extends|implements|import|%s.inputOnly| %s| %b| %d| %m.varMap| %m.view| %m.textview| %m.typeview| %s.gridview| %s.videoview| %s.cardview| %s.searchview| %s.recyclerview| %s.viewpager| %s.codeview| %s.youtubeview| %m.firebase| %m.firebasestorage)\\b"),
						Color.parseColor("#FFD84315") //brown
				);
		
				ColorScheme keywordskeywords = new ColorScheme(
						Pattern.compile(
								"\\b(extends|class|private|Class|public|this|arg|SketchwareUtil|args|out)\\b"),
						Color.parseColor("#FFFF1744") //rose
				);
		
				ColorScheme keywords2 = new ColorScheme(
						Pattern.compile(
								"\\b(package|strictfp|char|short|int|long|Double|double|Object|String|float|byte|boolean|default|do|continue)\\b"),
						Color.parseColor("#FF4DB6AC")
				);
		
				ColorScheme keywords3 = new ColorScheme(
						Pattern.compile(
								"\\b(if|else|PixelFormat|switch|switch_language|_position|case|for|while|%m.imageview| %m.checkbox| %m.switch| %m.spinner| %m.listview| %m.webview| %m.seekbar| %m.progressbar)\\b"),
						Color.parseColor("#FFD500F9") //mauve
				);
		
				ColorScheme keywords4 = new ColorScheme(
						Pattern.compile(
								"\\b(try|catch|finally|true|false|null|Exception|IOException|java.io.IOException)\\b"),
						Color.parseColor("#FFFFC400") // jaune foncé
				);
		
				ColorScheme keywords5 = new ColorScheme(
						Pattern.compile(
								"\\b(BroadcastReceiver|dismiss|about|map.put|map|getDataFromStream|getLogger|MOVE|WINDOW_SERVICE|valueOf|getName|setCancelable|setOnEditorActionListener|WebViewClient|getCookie|Spanned|onPrimaryClipChanged|setPrimaryClip|ClipboardManager|getInt|edit|ClipData|getInputStream|create|getRawX|setInputType|InputType|TYPE_NULL|getRawY|param4|putInt|param3|param2|param1|_param4|_param3|_param2|setContentInsetsAbsolute|_param1|getApplicationContext|CompoundButton|findViewById|LayoutInflater|setProgress|updateViewLayout|removeView|FloatingOnTouchListener|closes|postDelayed|showFloatingWindow|params|ACTION_MOVE|ACTION_UP|FavouritesManager|ACTION_MASK|ACTION_DOWN|stropX|ActionBar|stopY|setTextIsSelectable|startX|startY|getX|getY|Animation|ACTION_POINTER_DOWN|getActionMasked|MotionEventCompat|getPointerId|getChildAt|getChildCount|clearFocus|setRawInputType|setFocusable|createFromAsset|getGlobalVisibleRect|Typeface|assets|setDisplayOptions|killBackgroundProcesses|getInstalledApplications|setTextColor|setWebViewClient|getSupportActionBar|ACTION_DOWNLOAD_COMPLETE|onComplete|Context|loadAnimation|AnimationUtils|getSystemService|setDestinationInExternalPublicDir|mkdirs|SharedPreference|getExternalStorageDirectory|VISIBILITY_VISIBLE_NOTIFY_COMPLETED|setNotificationVisibility|getTitle|allowScanningByMediaScanner|setDescription|addRequestHeader|Request|DownloadListener|setDownloadListener|PreferenceManager|Enabed|setHorizontalScrollBarEnabled|setVerticalremove|ScrollBarEnabled|setDisplayZoomControls|setSupportZoom|setUseWideViewPort|setJavaScriptEnabled|setBackgroundColor|URL|setOrientation|DialogInterface|getDefaultSharedPreferences|getBaseContext|copyFileToDirectory|PackagePath|AdapterView|getPackageManager|customAdapter|TYPE_CLASS_TEXT|ApplicationInfo|setContentView|savedInstanceState|readLine|openFileInput|getNavigation|getTextAnalyzeResult|getLineCount|MenuItem|CodeEditor|setNonPrintablePaintingFlags|Editable|getItemId|setOverScrollEnabled|setTypefaceText|setVisibility|setEditorLanguage|setPositiveButton|setColorScheme|stopSearch|setSingleChoiceItems|isDirectory|setNegativeButton|setWordwrap|openFileOutput|getPath|println|ParseArguments|split|Encrypt|Handler|getBackground|GradientDrawable|setBackgroundDrawable|LinearLayout.LayoutParams|exists|catch|FileWriter|setColorFilter|setCornerRadius|Drawable|run|Runnable|run|maxDistanceToPoints|getTextBounds|setBounds|BitmapDrawable|setHint|Canvas|createBitmap|toShortString|setTextSize|isVisible|onTouchEvent|Build|ViewUtil|drawCircle|getWidth|setXfermode|descriptionTextColorInt|setColor|getViewTreeObserver|EndListener|drawTintedTarget|getMetrics|setTypeface|setAntiAlias|UiUtil|onDismiss|setPadding|build|delayBy|onUpdate|interpolator|duration|addCircle|Gravity|ValueAnimator|setCursorVisible|WindowManager|FloatValueAnimatorBuilder|android.graphics.drawable|resolveAttribute|getPackageName|Resources|TapTarget|getIdentifier|getResources|TypedValue|cancel|Listener|targetRadius|transparentTarget|tintTarget|cancelable|TapTargetView|setText|showFor|Scanner|getBytes|Files|PorterDuff.Mode|java.nio.file|readAllBytes|StandardCharsets|getTripManagerAtIndex|java.nio|setView|setTitle|addView|ArrayAdapter|List|notifyDataSetChanged|setAdapter|BaseAdapter|AlertDialog.Builder|android.widget|AlertDialog|setLayoutParams|toString|printStackTrace|Html|fromHtml|System|createMarkText|getId|HashMap|setItems|ArrayList|Map|TypedValue|SparseBooleanArrayon|ActivityResult|initialize|Intent|Bundle|Integer|editTextClickListener|TextWatcher|CharSequence|Dialog|getWindow|OnFocusChangeListener|onReceive|OnCreateContextMenuListener|setGravity|OnKeyListener|WifiManager|Menu|StringBuffer|onCreateOptionsMenu|requestWindowFeature|setOnItemClickListener|OnItemClickListener|onCheckedChanged|OnCheckedChangeListener|OnPrimaryClipChangedListener|setOnCheckedChangeListener|getAttributes|setOnTouchListener|setMessage|StringBuilder|onFocusChange|InputMethodManager|setOnClickListener|getWindowToken|onClick|onOptionsItemSelected|showSoftInput|SHOW_IMPLICIT|OnClickListener|removeSpan|_param|OnTouchListener|setOnFocusChangeListener|OnLongClickListener|OnCheckedChanged|addTextChangedListener|Color.parseColor|parseColor|Color|hideSoftInputFromWindow|ColorScheme|getActivity|ProcessBuilder|Process|PackageManager|)\\b"),
						Color.parseColor("#FF2196F3") //Blue
				);
		
				ColorScheme keywords6 = new ColorScheme(
						Pattern.compile(
								"\\b(LinearLayout|LinearParams|WebView|CharacterStyle|isChecked|_isChecked|TRANSLUCENT|FLAG_LAYOUT_NO_LIMITS|FLAG_NOT_FOCUSABLE|TYPE_SYSTEM_ALERT|R.layout|android.R.layout|layout.activity_main|onCreate|None|Java|JavaScript|end|id|UniversalLanguage|FEATURE_NO_TITLE|INPUT_METHOD_SERVICE|toJson|CheckboxGroup|CheckBox|Button|Switch|Spannable|EditText|SDK_INT|concat|TextView|ImageView|CircleImageView|RadioButton|TabLayout|SwipRefreshLayout|%m.listMap| %m.listStr| %m.listInt| %m.list| %m.calendarview| %m.color| %m.intent| %m.activity| %m.resource| %m.customView| %m.visible| %m.dialog| %m.anim| %m.drawable| %m.layout)\\b"),
						Color.parseColor("#00796b") //Lime foncé
				);
		
				ColorScheme newtypes = new ColorScheme(
						Pattern.compile(
								"\\b(onTextChanged|isSelected|ListView|setChecked|span|isChecked|getDatabase|R|CheckBox|Button|BackgroundColorSpan|Switch|Spannable|EditText|TextView|ImageView|CircleImageView|RadioButton|TabLayout|SwipRefreshLayout)\\b"),
						Color.parseColor("#76ff03") //check box
				);
		
				ColorScheme keywords7 = new ColorScheme(
						Pattern.compile(
								"\\b(java.io.|BufferedReader|find|FileUtils|FileUtil|FileInputStream|java.io.FileInputStream|toUpperCase|FileOutputStream|java.io.FileOutputStream|Pattern|Matcher|InputStream|java.io.InputStream|BufferedWriter|InputStreamReader|File|FileReader|java.io.BufferedReader|java.io.InputStream|java.io.BufferedWriter|java.io.InputStreamReader|java.io.File|java.io.FileReader)\\b"),
						Color.parseColor("#FFBA68C8") //buffered reader
				);
				ColorScheme keywords10 = new ColorScheme(
						Pattern.compile(
								"\\b(setFocusableInTouchMode|createExecutionOptionsProject|ExecutionOptionsProject|ProjectCreationOptions|createProjectForExecutionOptions|createProject|MAX_DURATION|startTime|currentTimeMillis|LayoutParams|VERSION|VERSION.SDK_INT|shouldOverrideUrlLoading|unregisterReceiver|setLoadWithOverviewMode|pattern|matcher|SPAN_EXCLUSIVE_EXCLUSIVE|addPrimaryClipChangedListener|PrimaryClipChangedListener|CLIPBOARD_SERVICE|getInstance|onDownloadStart|HIDE_NOT_ALWAYS|KEYCODE_ENTER|DownloadManager|height|Y|X|width|onTouch|KeyEvent|OnEditorActionListener|FloatingOnTouchListener|showMessage|getAction|event|overrideFonts|pm|android|content|loadUrl|guessFileName|Environment|URLUtil|CookieManager|getProgress|Uri.parse|show|WebSettings|main_layout|object|add|EditorColorScheme|makeText|Toast|getMenuInflater|gotoNext|IllegalStateException|gotoLast|getSearcher|FilesList.get|FilesList|StoreInvertedIndex|TreeSet|inputString|length|lenghOf|quoteReplacement|print|indexOf|nextLine|replace|replaceString|LENGTH_SHORT|WRAP_CONTENT|GONE|VISIBLE|INVISIBLE|MODE_PRIVATE|YELLOW|GREEN|BLUE|GRAY|BLACK|WHITE|BROWN|createNewFie|beforeTextChanged|afterTextChanged|removeSpans|close|append|findViewById|BufferType|getText|VERTICAL|HORIZONTAL|CENTER|TOP|BOTTOM|LEFT|RIGHT|Override|setDisplayShowHomeEnabled|MATCH_PARENT|Editor|MATCH_PARENT|setBackground|startAnimation|SharedPreferences|setDisplayShowCustomEnabled|setDisplayShowTitleEnabled|Bitmap|DynamicLayout|getKeyCode|supportInvalidateOptionsMenu|getApplicationWindowToken|SpannableStringBuilder|StaticLayout|Paint|onFocus|HIDE_NOT_ALWAYS|ColorDrawable|MENU_ITEM|setCustomView|TextPaint|Rect|editTextClickListener|ViewManager|ViewGroup|setDuration|getIns|setStartDelay|onEditorAction|setAlpha|UTF_8|replaceAll)\\b"),
						Color.parseColor("#06d6a0")  //vert blue
				);
		
				ColorScheme keywordsbluelight = new ColorScheme(
						Pattern.compile(
								"\\b(DOWNLOAD_SERVICE|finishAffinity|IntentFilter|enqueue)\\b"),
						Color.parseColor("#f55652") //2
				);
		
		
		
				ColorScheme next10 = new ColorScheme(
						Pattern.compile("\\b([0-9] +)\\b"), Color.parseColor("#FFF49D06")
				);
		
				ColorScheme next11 = new ColorScheme(
						Pattern.compile("(\\w+)(\\()+"), Color.parseColor("#FFF47990")
				);
		
				ColorScheme next12 = new ColorScheme(
						Pattern.compile("(?:@)\\w+\\b"), Color.parseColor("#FF0DB6F4")
				);
		
				ColorScheme next13 = new ColorScheme(
						Pattern.compile("\"(.*?)\"|'(.*?)'"), Color.parseColor("#FF37D129")
				);
		
				ColorScheme next14 = new ColorScheme(
						Pattern.compile("/\\*(?:.|[\\n\\r])*?\\*/|//.*"), Color.parseColor("#F8F4AA64")
				);
		
				ColorScheme next15 = new ColorScheme(
						Pattern.compile("\\b(?:[A-Z] )[a-zA-Z0-9] +\\b"), Color.parseColor("#FF8C91D8")
				);
		
				ColorScheme next16 = new ColorScheme(
						Pattern.compile("(?!\\s)\\W"), Color.parseColor("#FF84BD35")
				);
		
		
				final ColorScheme[]  schemes = {keywordsbluelight, keywords10, newtypes, keywordskeywords , keywords4, keywords3, keywords2, keywords, keywords5, keywords6, keywords7, next11, next12, next13, next14, next15, next16 };
		
				Editable e = specEdit.getText();
				removeSpans(e, ForegroundColorSpan.class);
				for (ColorScheme scheme : schemes) {
							for(Matcher m = scheme.pattern.matcher(e); m.find();) {
										e.setSpan(new ForegroundColorSpan(scheme.color),
												m.start(),
												m.end(),
												Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
						
						
						
							}
				}
		
		
		
		
		
				specEdit.addTextChangedListener(new TextWatcher() {
							@Override
							public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										final String _charSeq = _param1.toString();
						
						
										
						
							}
				
							@Override
							public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
						
						
						
							}
				
							@Override
							public void afterTextChanged(Editable _param1) {
						
										removeSpans(_param1, ForegroundColorSpan.class);
										for (ColorScheme scheme : schemes) {
													for(Matcher m = scheme.pattern.matcher(_param1); m.find();) {
																_param1.setSpan(new ForegroundColorSpan(scheme.color),
																		m.start(),
																		m.end(),
																		Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
										
										
										
													}
										}
						
							}
				});
		
		  }
	  void removeSpans(Editable _param4, Class<? extends CharacterStyle> type) {
				CharacterStyle[]  spans = _param4.getSpans(0, _param4.length(), type);
				for (CharacterStyle span : spans) {
							_param4.removeSpan(span);
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
	  {
	}
		 private Button btnCopy;
		 private EditText hex;
	private AlertDialog alrt;
		 
		 public static interface OnColorChangedListener
		 {
				 public void onColorChanged(ColorPicker picker, int color);
			 }
		 class ColorPicker extends LinearLayout
		 {
				 private SeekBar r;
				 private SeekBar g;
				 private SeekBar b;
				 private TextView colorShow;
				 private SeekBar.OnSeekBarChangeListener listener;
				 private OnColorChangedListener l;
				 public ColorPicker(Context c)
				 {
							 super(c);
							 init();
						 }
		
				 private void init(){
							 setPadding(16, 16, 16, 16);
							 setGravity(Gravity.CENTER);
							 setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
							 colorShow = new TextView(getContext());
							 colorShow.setLayoutParams(new ViewGroup.LayoutParams(60, 60));
							 addView(colorShow);
							 listener = new SeekBar.OnSeekBarChangeListener(){
										 @Override
										 public void onProgressChanged(SeekBar p1, int p2, boolean p3)
										 {
													 int color = Color.rgb(r.getProgress(), g.getProgress(), b.getProgress());
													 String temp = String.format("0x%08X", color);
													 String result = temp.substring(2);
													 hex.setText("#" + result);
													 
													 hex.getBackground().setColorFilter(color, PorterDuff.Mode.SRC_IN);
													 colorShow.setBackgroundColor(color);
													 btnCopy.setBackgroundColor(color);
								
													 double darkness = 1-(0.299*Color.red(color) + 0.587*Color.green(color) + 0.114*Color.blue(color))/255;
								
													 if(darkness<0.5){
																 btnCopy.setTextColor(Color.BLACK);
															 }else{
																 btnCopy.setTextColor(Color.WHITE);
															 }
								
								
								
													 if(l != null) l.onColorChanged(ColorPicker.this, color);
												 }
										 @Override public void onStartTrackingTouch(SeekBar p1){}
										 @Override public void onStopTrackingTouch(SeekBar p1){}
									 };
							 LinearLayout lay2 = new LinearLayout(getContext());
							 lay2.setOrientation(VERTICAL);
							 lay2.setPadding(8, 0, 8, 8);
							 lay2.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
							 hex = new EditText(getContext());
							 
							 ViewGroup.MarginLayoutParams params = new ViewGroup.MarginLayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
							 params.setMargins(16, 0, 16, 0);
							 hex.setLayoutParams(params);
							 
							 hex.setCursorVisible(false);
				
							 hex.setImeOptions(android.view.inputmethod.EditorInfo.IME_ACTION_DONE);
							 
							 try {
								hex.setText(textColor.getText().toString());	 
								 } catch (Exception e) {
								 hex.setText("#000000");
								 }
							 	 
							 
							 hex.setOnEditorActionListener(new TextView.OnEditorActionListener(){
										 @Override
										 public boolean onEditorAction(TextView text, int code, KeyEvent event)
										 {
													 try {
																 int color = Color.parseColor(text.getText().toString());
																 r.setProgress(Color.red(color));
																 g.setProgress(Color.green(color));
																 b.setProgress(Color.blue(color));
															 } catch(Exception e){
																 Toast.makeText(getContext(), "Color code is wrong", Toast.LENGTH_SHORT).show();
															 }
													 return true;
												 }
									 });
				
							 btnCopy = new Button(getApplicationContext());
				
							 btnCopy.setTextSize(15);
				
							 if (Locale.getDefault().getDisplayLanguage().equals("العربية")){
										 btnCopy.setText("حفظ");
									 } else {
										 btnCopy.setText("save");
									 }
				
							 btnCopy.setTypeface(Typeface.MONOSPACE);
				
							 btnCopy.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
							 
							 btnCopy.setPadding(0,0,0,0);
							 
							 btnCopy.setBackgroundColor(Color.BLACK);
							 
							 btnCopy.setTextColor(Color.WHITE);
				
							 btnCopy.setOnClickListener(new View.OnClickListener() {
										 @Override
										 public void onClick(View view) {
												
					
												 }
									 });
				
							 lay2.addView(hex);
							// lay2.addView(nameEdit);
							 r = new SeekBar(getContext());
							 setProgressColor(r, 0xffcc5577);
							 r.setMax(255);
							 r.setOnSeekBarChangeListener(listener);
							 lay2.addView(r);
							 g = new SeekBar(getContext());
							 setProgressColor(g, 0xff339977);
							 g.setMax(255);
							 g.setOnSeekBarChangeListener(listener);
							 lay2.addView(g);
							 b = new SeekBar(getContext());
							 setProgressColor(b, 0xff6077bb);
							 b.setMax(255);
							 b.setOnSeekBarChangeListener(listener);
							 lay2.addView(b);
							 addView(lay2);
							 int color = Color.parseColor(hex.getText().toString());
							 r.setProgress(Color.red(color));
							 g.setProgress(Color.green(color));
							 b.setProgress(Color.blue(color));
							 colorShow.setBackgroundColor(color);
							 lay2.addView(btnCopy);
						 }
				 public void setColor(int color)
				 {
							 hex.setText("#" + String.format("0x%08X", color).substring(2));
							 
							 r.setProgress(Color.red(color));
							 g.setProgress(Color.green(color));
							 b.setProgress(Color.blue(color));
				
				
				
						 }
				 public int getColor(boolean refreshFromSlider)
				 {
							 if(refreshFromSlider)
								 listener.onProgressChanged(null, 0, false);
							 return Color.parseColor(hex.getText().toString());
						 }
				 public int getColor()
				 {
							 return getColor(true);
						 }
				 public void setOnColorChangedListener(OnColorChangedListener l)
				 {
							 this.l = l;
						 }
				 private void setProgressColor(AbsSeekBar bar, int color)
				 {
							 bar.getProgressDrawable().setColorFilter(color, PorterDuff.Mode.SRC_IN); bar.getThumb().setColorFilter(color, PorterDuff.Mode.SRC_IN);
						 }
			 }
		 {
		
	}
	
	
	public String _setType(final String _text) {
		if (_text.equals("regular")) {
			type = " ";
		}
		else {
			if (_text.startsWith("c")) {
				type = "c";
			}
			else {
				if (_text.startsWith("s")) {
					type = "s";
				}
				else {
					if (_text.startsWith("d")) {
						type = "d";
					}
					else {
						if (_text.startsWith("b")) {
							type = "b";
						}
						else {
							if (_text.startsWith("e")) {
								type = "e";
							}
							else {
								if (_text.startsWith("v")) {
									type = "v";
								}
								else {
									if (_text.startsWith("a")) {
										type = "a";
									}
									else {
										if (_text.startsWith("f")) {
											type = "f";
										}
										else {
											if (_text.startsWith("l")) {
												type = "l";
											}
											else {
												if (_text.startsWith("p")) {
													type = "p";
												}
												else {
													if (_text.startsWith("h")) {
														type = "h";
													}
													else {
														type = " ";
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
		return type;
	}
	
	
	public void _refreshCheckBox() {
		
	}
	
	
	public void _doForAll(final View _view, final String _col) {
		nameEdit.setTextColor(Color.parseColor(_col));
		textview1.setTextColor(Color.parseColor(_col));
		typeEdit.setTextColor(Color.parseColor(_col));
		textview2.setTextColor(Color.parseColor(_col));
		typeNameEdit.setTextColor(Color.parseColor(_col));
		textview3.setTextColor(Color.parseColor(_col));
		textview4.setTextColor(Color.parseColor(_col));
		textview5.setTextColor(Color.parseColor(_col));
		textColor.setTextColor(Color.parseColor(_col));
	}
	
	
	public void _sertings() {
		
	}
	
	
	public void _switchsenableDisable(final String _id) {
		
	}
	
	
	public void _doAllTextColorDrawer(final String _color) {
		
	}
	
	
	public void _themeNightDayMode(final boolean _isDark) {
		
	}
	
	
	public void _crashRecorder() {
	}
	public class TopExceptionHandler implements Thread.UncaughtExceptionHandler {
		    private Thread.UncaughtExceptionHandler defaultUEH;
		    private Activity app = null;
		
		    public TopExceptionHandler(Activity app) {
			        this.defaultUEH = Thread.getDefaultUncaughtExceptionHandler();
			        this.app = app;
			    }
		
		    public void uncaughtException(Thread t, Throwable e) {
			        StackTraceElement[] arr = e.getStackTrace();
			        String report = e.toString()+"\n\n";
			        report += "--------- Stack trace ---------\n\n";
			        for (int i=0; i<arr.length; i++) {
				            report += "    "+arr[i].toString()+"\n";
				        }
			        report += "-------------------------------\n\n";
			
			        // If the exception was thrown in a background thread inside
			        // AsyncTask, then the actual exception can be found with getCause
			
			        report += "--- Cause of Crash سبب الكراش ----\n\n";
			        Throwable cause = e.getCause();
			        if(cause != null) {
				            report += cause.toString() + "\n\n";
				            arr = cause.getStackTrace();
				            for (int i=0; i<arr.length; i++) {
					                report += "    "+arr[i].toString()+"\n";
					            }
				        }
			        report += "-------------------------------\n\n";
			
			        try {
				            java.io.FileOutputStream trace = app.openFileOutput("stack.trace", 
				                                                        Context.MODE_PRIVATE);
				            trace.write(report.getBytes());
				            trace.close();
				        } catch(java.io.IOException ioe) {
				        // ...
				        }
			
			        defaultUEH.uncaughtException(t, e);
			    }
	}
	private String trace ="";
	{
	}
	
	
	public String _setValidName(final String _name) {
		String name = _name;
		for(int _repeat10 = 0; _repeat10 < (int)(blocksListMap.size()); _repeat10++) {
			if (blocksListMap.get((int)_repeat10).get("name").toString().equals(_name)) {
				name = name.concat("_".concat(String.valueOf((long)( SketchwareUtil.getRandom(6, 99)))));
			}
			else {
				name = _name;
			}
		}
		return name;
	}
	
	
	public void _hilite() {
	}
	public static void colorHandles(TextView view, int color) {
		        try {
			            java.lang.reflect.Field editorField = TextView.class.getDeclaredField("mEditor");
			            if (!editorField.isAccessible()) {
				                editorField.setAccessible(true);
				            }
			            Object editor = editorField.get(view);
			            Class<?> editorClass = editor.getClass();
			            String[] handleNames = {"mSelectHandleLeft", "mSelectHandleRight", "mSelectHandleCenter"};
			            String[] resNames = {"mTextSelectHandleLeftRes", "mTextSelectHandleRightRes", "mTextSelectHandleRes"};
			            for (int i = 0; i < handleNames.length; i++) {
				                java.lang.reflect.Field handleField = editorClass.getDeclaredField(handleNames[i]);
				                if (!handleField.isAccessible()) {
					                    handleField.setAccessible(true);
					                }
				                android.graphics.drawable.Drawable handleDrawable = (android.graphics.drawable.Drawable) handleField.get(editor);
				                if (handleDrawable == null) {
					                    java.lang.reflect.Field resField = TextView.class.getDeclaredField(resNames[i]);
					                    if (!resField.isAccessible()) {
						                        resField.setAccessible(true);
						                    }
					                    int resId = resField.getInt(view);
					                    handleDrawable = view.getResources().getDrawable(resId);
					                }
				                if (handleDrawable != null) {
					                    android.graphics.drawable.Drawable drawable = handleDrawable.mutate();
					                    drawable.setColorFilter(color, PorterDuff.Mode.SRC_IN);
					                    handleField.set(editor, drawable);
					                }
				            }
			        } catch (Exception e) {
			            e.printStackTrace();
			        }
		    }
	
	    public static void setCursorDrawableColor(TextView editText, int color) {
		        try {
			            java.lang.reflect.Field fCursorDrawableRes = TextView.class.getDeclaredField("mCursorDrawableRes");
			            fCursorDrawableRes.setAccessible(true);
			            int mCursorDrawableRes = fCursorDrawableRes.getInt(editText);
			            java.lang.reflect.Field fEditor = TextView.class.getDeclaredField("mEditor");
			            fEditor.setAccessible(true);
			            Object editor = fEditor.get(editText);
			            Class<?> clazz = editor.getClass();
			            java.lang.reflect.Field fCursorDrawable = clazz.getDeclaredField("mCursorDrawable");
			            fCursorDrawable.setAccessible(true);
			            android.graphics.drawable.Drawable[] drawables = new android.graphics.drawable.Drawable[2];
			            android.content.res.Resources res = editText.getContext().getResources();
			            drawables[0] = res.getDrawable(mCursorDrawableRes);
			            drawables[1] = res.getDrawable(mCursorDrawableRes);
			            drawables[0].setColorFilter(color, PorterDuff.Mode.SRC_IN);
			            drawables[1].setColorFilter(color, PorterDuff.Mode.SRC_IN);
			            fCursorDrawable.set(editor, drawables);
			        } catch (final Throwable ignored) {
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