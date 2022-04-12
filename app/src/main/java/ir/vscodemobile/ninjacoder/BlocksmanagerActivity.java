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
import java.util.HashMap;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.app.Activity;
import android.content.SharedPreferences;
import java.util.Timer;
import java.util.TimerTask;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.AdapterView;
import android.view.View;
import android.text.Editable;
import android.text.TextWatcher;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
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
import com.blogspot.atifsoftwares.animatoolib.*;
import ninja.toska.path.*;
import com.caverock.androidsvg.*;
import xyz.ninjacoder.edittext.Animator.main.*;
import org.antlr.v4.runtime.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import androidx.core.content.ContextCompat;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;
import io.github.rosemoe.sora.widget.CodeEditor;
import io.github.rosemoe.sora.widget.schemes.HTMLScheme;
import io.github.rosemoe.sora.widget.schemes.SchemeDarcula;
import io.github.rosemoe.sora.widget.schemes.SchemeEclipse;
import io.github.rosemoe.sora.widget.schemes.SchemeGitHub;
import io.github.rosemoe.sora.widget.schemes.SchemeNotepadXX;
import io.github.rosemoe.sora.widget.schemes.SchemeVS2019;
import io.github.rosemoe.sora.langs.EmptyLanguage;
import io.github.rosemoe.sora.langs.desc.CDescription;
import io.github.rosemoe.sora.langs.desc.CppDescription;
import io.github.rosemoe.sora.langs.desc.JavaScriptDescription;
import io.github.rosemoe.sora.langs.html.HTMLLanguage;
import io.github.rosemoe.sora.langs.java.JavaLanguage;
import io.github.rosemoe.sora.langs.python.PythonLanguage;
import io.github.rosemoe.sora.langs.universal.UniversalLanguage;
import ir.vscodemobile.ninjacoder.theme;

public class BlocksmanagerActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private String blocksPath = "";
	private String palettesPath = "";
	private double clickedPos = 0;
	private boolean clicked = false;
	private String clickedRow = "";
	private double chosenPos = 0;
	private HashMap<String, Object> blocksLoadHash = new HashMap<>();
	private String crashLog = "";
	private HashMap<String, Object> map = new HashMap<>();
	private double drag = 0;
	private double drop = 0;
	private double dragedPos = 0;
	private double dropedPos = 0;
	private HashMap<String, Object> map2 = new HashMap<>();
	private double numStoreValue = 0;
	private boolean draged = false;
	private double posPlusDis = 0;
	private double dropedToPalttePos = 0;
	private String appFolder = "";
	private double couterNumPalette = 0;
	private boolean swiped = false;
	private HashMap<String, Object> tempHash = new HashMap<>();
	private double currentPos = 0;
	private String cmd = "";
	private boolean allBlocks = false;
	private String nameFile = "";
	private String colorOriginal = "";
	private String allDataList = "";
	private HashMap<String, Object> searchHash = new HashMap<>();
	private boolean searchMod = false;
	private boolean isDark = false;
	private double ExactPos = 0;
	private String code = "";
	private double deletedPalettePos = 0;
	private double lenghtBlocksList = 0;
	private double blockIndex = 0;
	private String paletteName = "";
	private String paletteColor = "";
	private HashMap<String, Object> temp_map1 = new HashMap<>();
	private double number = 0;
	private String temp_decrypted = "";
	private String custom_block_path = "";
	private String typeBlock = "";
	
	private ArrayList<HashMap<String, Object>> blocksListMap = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> palettesListMap = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> chosenPletteteListMap = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> list = new ArrayList<>();
	private ArrayList<Double> positionsB = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> chosenBlockorPalette = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> tempListMap = new ArrayList<>();
	private ArrayList<Double> listNumber2 = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> listMapAddBlocks = new ArrayList<>();
	private ArrayList<String> listStr = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> searchMap = new ArrayList<>();
	private ArrayList<Double> searchInt = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> SearchchosenList = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> searchListAll = new ArrayList<>();
	private ArrayList<Double> searchAllNumberList = new ArrayList<>();
	private ArrayList<Double> SearchChosenNumberList = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> projectsList = new ArrayList<>();
	private ArrayList<String> temp_str1 = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> temp_listmap1 = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout container;
	private LinearLayout linearToosActions;
	private ImageView imageview7;
	private LinearLayout linear5;
	private EditText searchEdit;
	private ImageView imageview9;
	private LinearLayout linearPalettes;
	private LinearLayout linearBlocks;
	private ListView palettesList;
	private ListView blocksList;
	private LinearLayout linearToosAction;
	private LinearLayout linear8;
	private LinearLayout sendLinear;
	private LinearLayout saveLinear;
	private LinearLayout linearView;
	private LinearLayout deleteLinear;
	private LinearLayout duplicateLinear;
	private LinearLayout editLinear;
	private ImageView imageview2;
	private ImageView imageview3;
	private ImageView imageview8;
	private ImageView imageview4;
	private ImageView imageview5;
	private ImageView imageview6;
	private TextView textview1;
	
	private SharedPreferences sp;
	private TimerTask timer;
	private AlertDialog.Builder dialog;
	private Intent intent = new Intent();
	private SharedPreferences swipSelect;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.blocksmanager);
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
		linear2 = findViewById(R.id.linear2);
		container = findViewById(R.id.container);
		linearToosActions = findViewById(R.id.linearToosActions);
		imageview7 = findViewById(R.id.imageview7);
		linear5 = findViewById(R.id.linear5);
		searchEdit = findViewById(R.id.searchEdit);
		imageview9 = findViewById(R.id.imageview9);
		linearPalettes = findViewById(R.id.linearPalettes);
		linearBlocks = findViewById(R.id.linearBlocks);
		palettesList = findViewById(R.id.palettesList);
		blocksList = findViewById(R.id.blocksList);
		linearToosAction = findViewById(R.id.linearToosAction);
		linear8 = findViewById(R.id.linear8);
		sendLinear = findViewById(R.id.sendLinear);
		saveLinear = findViewById(R.id.saveLinear);
		linearView = findViewById(R.id.linearView);
		deleteLinear = findViewById(R.id.deleteLinear);
		duplicateLinear = findViewById(R.id.duplicateLinear);
		editLinear = findViewById(R.id.editLinear);
		imageview2 = findViewById(R.id.imageview2);
		imageview3 = findViewById(R.id.imageview3);
		imageview8 = findViewById(R.id.imageview8);
		imageview4 = findViewById(R.id.imageview4);
		imageview5 = findViewById(R.id.imageview5);
		imageview6 = findViewById(R.id.imageview6);
		textview1 = findViewById(R.id.textview1);
		sp = getSharedPreferences("sp", Activity.MODE_PRIVATE);
		dialog = new AlertDialog.Builder(this);
		swipSelect = getSharedPreferences("swipSelect", Activity.MODE_PRIVATE);
		
		imageview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				sp.edit().putString("posNumber", "").commit();
				sp.edit().putString("pos", "").commit();
				_loadRefreshPalettes();
				_loadRefreshBlocks();
				allBlocks = true;
				try { 
					getSupportActionBar().setTitle("Palette :  ".concat(String.valueOf((long)(palettesListMap.size()))));
					getSupportActionBar().setSubtitle("Blocks :".concat("  ".concat(String.valueOf((long)(lenghtBlocksList)))));
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		searchEdit.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_charSeq.isEmpty()) {
					searchMod = false;
					if (allBlocks) {
						_loadRefreshBlocks();
					}
					else {
						if (!sp.getString("posNumber", "").equals("")) {
							_loadSpecificPletteblocks(Double.parseDouble(sp.getString("posNumber", "")));
						}
					}
				}
				else {
					if (allBlocks) {
							searchListAll = new Gson().fromJson(allDataList, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
							final double length = searchListAll.size();
							searchAllNumberList.clear();
							 
							 for (int i = 0; i < searchListAll.size(); i++){
									 
									 searchAllNumberList.add(Double.valueOf(i));
									 
								 }
							 
							d = searchListAll.size() - 1;
							 for(int i = 0; i < (int)(length); i++) {
									  final String serching = searchListAll.get((int)d).get("name").toString();
									  if (serching.toLowerCase().contains(_charSeq.toLowerCase())) {
											   
											  }else {
											   searchListAll.remove((int)(d));
											   searchAllNumberList.remove((int)d);
											  }
									  d--;
									 }
							
							blocksList.setAdapter(new BlocksListAdapter(searchListAll));
							((BaseAdapter)blocksList.getAdapter()).notifyDataSetChanged();
							
					}
					else {
							
							SearchchosenList = new Gson().fromJson(allDataList, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
								
								
								SearchChosenNumberList.clear();
								
								
								for (int i = 0; i < positionsB.size(); i++){
									 
									 SearchChosenNumberList.add(Double.valueOf(positionsB.get((int)(i)).doubleValue()));
									 
								 }
							 
								
								
							final double length = SearchchosenList.size();
							 
							d = SearchchosenList.size() - 1;
							 for(int i = 0; i < (int)(length); i++) {
									  final String serching = SearchchosenList.get((int)d).get("name").toString();
									  if (serching.toLowerCase().contains(_charSeq.toLowerCase())) {
											   
											  }else {
											   SearchchosenList.remove((int)(d));
											   SearchChosenNumberList.remove((int)d);
											  }
									  d--;
									 }
							
							blocksList.setAdapter(new BlocksListAdapter(SearchchosenList));
							((BaseAdapter)blocksList.getAdapter()).notifyDataSetChanged();
							
						
					}
					
					searchMod = true;
				}
			}
			private double d;
			{
				/*
 
*/
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		palettesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				
			}
		});
		
		blocksList.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
			@Override
			public boolean onItemLongClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				dragedPos = _position;
				SketchwareUtil.showMessage(getApplicationContext(), String.valueOf((long)(dragedPos)));
				linearToosAction.setVisibility(View.VISIBLE);
				return true;
			}
		});
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		imageview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		imageview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		imageview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
	}
	
	private void initializeLogic() {
		getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE|WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
		draged = false;
		if (!(sp.contains("pos") && sp.contains("posNumber"))) {
			sp.edit().putString("pos", "").commit();
			sp.edit().putString("posNumber", "").commit();
		}
		if (!sp.contains("theme")) {
			sp.edit().putString("theme", "day").commit();
		}
		if (Build.VERSION.SDK_INT >= 11) {
			        searchEdit.setRawInputType(InputType.TYPE_CLASS_TEXT);
			        searchEdit.setTextIsSelectable(true);
			    } else {
			        searchEdit.setRawInputType(InputType.TYPE_NULL);
			        searchEdit.setFocusable(true);
			    }
		DisplayMetrics displayMetrics = new DisplayMetrics();
		        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
		        int height = displayMetrics.heightPixels;
		        int width = displayMetrics.widthPixels;
		
		
		
		palettesPath = "/storage/emulated/0/.sketchware/resources/block/My Block/palette.json";
		blocksPath = "/storage/emulated/0/.sketchware/resources/block/My Block/block.json";
		appFolder = "/storage/emulated/0/.HichemSoft";
		_loadRefreshPalettes();
		_restoreListViewsState();
		_targedViewAction();
		_drawerInitializeViews();
		if (!FileUtil.isExistFile(appFolder)) {
			FileUtil.makeDir(appFolder);
		}
		else {
			listStr.clear();
			FileUtil.listDir(appFolder, listStr);
			if (listStr.size() > 0) {
				for(int _repeat88 = 0; _repeat88 < (int)(listStr.size()); _repeat88++) {
					if (FileUtil.isFile(listStr.get((int)(_repeat88)))) {
						FileUtil.deleteFile(listStr.get((int)(_repeat88)));
					}
				}
			}
		}
		/*
try { 
getSupportActionBar().setTitle("Palettes : ".concat(String.valueOf((long)(palettesListMap.size())).concat(" / ".concat("blocks"))));
} catch (Exception e){
e.printStackTrace();
}
*/
	}
	
	@Override
	public void onStop() {
		super.onStop();
		
		
		
		sp.edit().putString("indexBlock", String.valueOf((long)(blocksList.getFirstVisiblePosition()))).commit();
		sp.edit().putString("topBlock", String.valueOf((long)((blocksList.getChildAt(0) == null) ? 0 : (blocksList.getChildAt(0).getTop() - blocksList.getPaddingTop())))).commit();
		sp.edit().putString("indexPalette", String.valueOf((long)(palettesList.getFirstVisiblePosition()))).commit();
		sp.edit().putString("topPalette", String.valueOf((long)((palettesList.getChildAt(0) == null) ? 0 : (palettesList.getChildAt(0).getTop() - palettesList.getPaddingTop())))).commit();
		getApplicationContext().getSharedPreferences("swipSelect", 0).edit().clear().apply();
	}
	
	@Override
	public void onPause() {
		super.onPause();
		sp.edit().putString("indexBlock", String.valueOf((long)(blocksList.getFirstVisiblePosition()))).commit();
		sp.edit().putString("topBlock", String.valueOf((long)((blocksList.getChildAt(0) == null) ? 0 : (blocksList.getChildAt(0).getTop() - blocksList.getPaddingTop())))).commit();
		sp.edit().putString("indexPalette", String.valueOf((long)(palettesList.getFirstVisiblePosition()))).commit();
		sp.edit().putString("topPalette", String.valueOf((long)((palettesList.getChildAt(0) == null) ? 0 : (palettesList.getChildAt(0).getTop() - palettesList.getPaddingTop())))).commit();
		if (draged) {
			FileUtil.writeFile(blocksPath, new Gson().toJson(blocksListMap));
			_restoreListViewsState();
			_loadRefreshPalettes();
		}
	}
	
	@Override
	public void onResume() {
		super.onResume();
		_restoreListViewsState();
		searchEdit.setText("");
		searchEdit.clearFocus();
	}
	
	
	@Override
	public void onStart() {
		super.onStart();
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF000027".replace("0xFF" , "#")));
		}
	}
	public void _loadSpecificPletteblocks(final double _pos) {
		if (FileUtil.isExistFile(blocksPath) && !(FileUtil.readFile(blocksPath).equals("") || FileUtil.readFile(blocksPath).equals("[]"))) {
			chosenPos = _pos + 9;
			try { 
				{
					int index = blocksList.getFirstVisiblePosition();
					int top = (blocksList.getChildAt(0) == null) ? 0 : (blocksList.getChildAt(0).getTop() - blocksList.getPaddingTop());
					
					chosenPletteteListMap.clear();
					blocksLoadHash.clear();
					blocksListMap.clear();
					positionsB.clear();
					blocksListMap = new Gson().fromJson(FileUtil.readFile(blocksPath), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
					for(int _repeat85 = 0; _repeat85 < (int)(blocksListMap.size()); _repeat85++) {
						if (blocksListMap.get((int)_repeat85).containsKey("palette") && (chosenPos == Double.parseDouble(blocksListMap.get((int)_repeat85).get("palette").toString()))) {
							blocksLoadHash = blocksListMap.get((int)_repeat85);
							positionsB.add(Double.valueOf(_repeat85));
							chosenPletteteListMap.add(blocksLoadHash);
						}
					}
					blocksList.setAdapter(new BlocksListAdapter(chosenPletteteListMap));
					((BaseAdapter)blocksList.getAdapter()).notifyDataSetChanged();
					allDataList = new Gson().toJson(chosenPletteteListMap);
					allBlocks = false;
					try { 
						getSupportActionBar().setTitle("Palette :".concat(" ".concat(palettesListMap.get((int)_pos).get("name").toString())));
						getSupportActionBar().setSubtitle(String.valueOf((long)(chosenPletteteListMap.size())).concat(" / ".concat("blocks")));
					} catch (Exception e){
						e.printStackTrace();
					}
					
					
					blocksList.setSelectionFromTop((int)index, (int)top);
				}
			} catch (Exception e){
				showMessage(e.toString());
			}
		}
		else {
			
		}
	}
	
	
	public void _sinnerToolbarMenu() {
		
	}
	
	
	public void _loadRefreshPalettes() {
		if (FileUtil.isExistFile(palettesPath) && !(FileUtil.readFile(palettesPath).equals("") || FileUtil.readFile(palettesPath).equals("[]"))) {
			try { 
				palettesListMap.clear();
				{
					int index = palettesList.getFirstVisiblePosition();
					int top = (palettesList.getChildAt(0) == null) ? 0 : (palettesList.getChildAt(0).getTop() - palettesList.getPaddingTop());
					
					palettesListMap = new Gson().fromJson(FileUtil.readFile(palettesPath), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
					palettesList.setAdapter(new PalettesListAdapter(palettesListMap));
					((BaseAdapter)palettesList.getAdapter()).notifyDataSetChanged();
					
					
					palettesList.setSelectionFromTop((int)index, (int)top);
				}
			} catch (Exception e){
				showMessage(e.toString());
			}
		}
		else {
			
		}
	}
	
	
	public void _loadRefreshBlocks() {
		if (FileUtil.isExistFile(blocksPath) && !(FileUtil.readFile(blocksPath).equals("") || FileUtil.readFile(blocksPath).equals("[]"))) {
			try { 
				{
					int index = blocksList.getFirstVisiblePosition();
					int top = (blocksList.getChildAt(0) == null) ? 0 : (blocksList.getChildAt(0).getTop() - blocksList.getPaddingTop());
					
					positionsB.clear();
					blocksListMap.clear();
					new Thread(new Runnable() {
						@Override
						public void run() {
							Looper.prepare();
							
							blocksListMap = new Gson().fromJson(FileUtil.readFile(blocksPath), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
							for(int _repeat34 = 0; _repeat34 < (int)(blocksListMap.size()); _repeat34++) {
								positionsB.add(Double.valueOf(_repeat34));
							}
							
							
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									
									
									blocksList.setAdapter(new BlocksListAdapter(blocksListMap));
									((BaseAdapter)blocksList.getAdapter()).notifyDataSetChanged();
									lenghtBlocksList = blocksListMap.size();
									allDataList = new Gson().toJson(blocksListMap);
									allBlocks = true;
									
									Looper.loop();
								} 
								
							});
						}
					}).start();
					
					
					
					
					blocksList.setSelectionFromTop((int)index, (int)top);
				}
			} catch (Exception e){
				showMessage(e.toString());
			}
		}
		else {
			
		}
	}
	
	
	public void _crashRecorder() {
		
	}
	
	
	public void _restoreListViewsState() {
		if (sp.getString("pos", "").equals("") && sp.getString("posNumber", "").equals("")) {
			_loadRefreshBlocks();
			_loadRefreshPalettes();
		}
		else {
			if (sp.getString("pos", "").equals(palettesListMap.get((int)Double.parseDouble(sp.getString("posNumber", ""))).get("name").toString())) {
				try { 
					_loadSpecificPletteblocks(Double.parseDouble(sp.getString("posNumber", "")));
					getSupportActionBar().setTitle("Palette :".concat(" ".concat(palettesListMap.get((int)Double.parseDouble(sp.getString("posNumber", ""))).get("name").toString())));
					if (!(chosenPletteteListMap.size() == 0)) {
						getSupportActionBar().setSubtitle(String.valueOf((long)(chosenPletteteListMap.size())).concat(" / ".concat("blocks")));
					}
				} catch (Exception e){
					_loadRefreshBlocks();
					_loadRefreshPalettes();
				}
			}
			else {
				_loadRefreshBlocks();
				_loadRefreshPalettes();
			}
		}
		if (!(sp.getString("indexBlock", "").equals("") && sp.getString("topBlock", "").equals(""))) {
			blocksList.setSelectionFromTop((int)Double.parseDouble(sp.getString("indexBlock", "")), (int)Double.parseDouble(sp.getString("topBlock", "")));
		}
		if (!(sp.getString("indexPalette", "").equals("") && sp.getString("topPalette", "").equals(""))) {
			palettesList.setSelectionFromTop((int)Double.parseDouble(sp.getString("indexPalette", "")), (int)Double.parseDouble(sp.getString("topPalette", "")));
		}
		ImageView icon = new ImageView(getApplicationContext());
		icon.setImageDrawable(getResources().getDrawable(R.drawable.settings));
			
		com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton actionButton = new com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton.Builder(BlocksmanagerActivity.this).setContentView(icon)
												.build();
			com.oguzdev.circularfloatingactionmenu.library.SubActionButton.Builder itemBuilder = new com.oguzdev.circularfloatingactionmenu.library.SubActionButton.Builder(BlocksmanagerActivity.this);
		
		ImageView IconAdd = new ImageView(getApplicationContext()); 
		
		IconAdd.setImageDrawable(getResources().getDrawable(R.drawable.typeaddblock)); 
		
		com.oguzdev.circularfloatingactionmenu.library.SubActionButton Add = itemBuilder.setContentView(IconAdd).build(); 
		
		FrameLayout.LayoutParams AddParams = new FrameLayout.LayoutParams(90, 90);
		
		        Add.setLayoutParams(AddParams);
		
		Add.setOnClickListener(new View.OnClickListener() {
								@Override
								public void onClick(View _view) {
				listStr.clear();
				listStr.add("Block(s) from File");
				listStr.add("Add new Block");
				listStr.add("Add Blocks From project");
				listStr.add("Palette");
				{
						final String[] array = listStr.toArray(new String[0]);
						final String[] chosen = {""};
					
					
						AlertDialog.Builder builder;
					
					if (isDark) {
							builder = new AlertDialog.Builder(BlocksmanagerActivity.this, AlertDialog.THEME_DEVICE_DEFAULT_DARK);
					} else {
							builder = new AlertDialog.Builder(BlocksmanagerActivity.this);
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
												_addButton(item);
												alert.dismiss();
										}
												 if(wantToCloseDialog) {
															 
															 }
												 }
									 });
						
				}
				          actionMenu.close(true);
								}
						});
		ImageView IconSendmultiples = new ImageView(getApplicationContext()); 
		
		IconSendmultiples.setImageDrawable(getResources().getDrawable(R.drawable.typeshareblock)); 
		
		com.oguzdev.circularfloatingactionmenu.library.SubActionButton Sendmultiples = itemBuilder.setContentView(IconSendmultiples).build(); 
		
		FrameLayout.LayoutParams SendmultiplesParams = new FrameLayout.LayoutParams(90, 90);
		
		        Sendmultiples.setLayoutParams(SendmultiplesParams);
		
		Sendmultiples.setOnClickListener(new View.OnClickListener() {
								@Override
								public void onClick(View _view) {
				if (!allBlocks) {
						if (!(chosenPletteteListMap.size() == 0)) {
								{
										final AlertDialog.Builder builder = new AlertDialog.Builder(BlocksmanagerActivity.this);
										
										builder.setCancelable(false);
										
										builder.setTitle("select...");
										
										builder.setPositiveButton("ok️", new DialogInterface.OnClickListener() {
														@Override
														public void onClick(DialogInterface _dialog, int _which) {
																
																
																		
														}
										});
										
										builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
														@Override
														public void onClick(DialogInterface _dialog, int _which) {
																
																
																		
														}
										});
										
										
										final LinearLayout lin = new LinearLayout(getApplicationContext());
										
										lin.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
										
										lin.setOrientation(LinearLayout.VERTICAL);
										
										lin.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
										
										for(int i = 0; i < chosenPletteteListMap.size() ; i++) {
													
													final CheckBox check = new CheckBox(getApplicationContext());
													
													check.setTextSize(16);
													
													
													
													
													
								typeBlock = chosenPletteteListMap.get((int)i).get("type").toString();
								if (typeBlock.equals(" ")) {
									check.setText("regular".concat(" / ".concat(chosenPletteteListMap.get((int)i).get("name").toString())));
								}
								else {
									check.setText(typeBlock.concat(" / ".concat(chosenPletteteListMap.get((int)i).get("name").toString())));
								}
								check.setTag(String.valueOf(i));
													
													
													
													
													check.setPadding(20,4,5,4);
													lin.setPadding(20,5,5,5);
													ObjectAnimator a = ObjectAnimator.ofInt(check, "textColor", 0xFFE53935, 0xFFBF360C, 0xFF303F9F); a.setInterpolator(new LinearInterpolator()); a.setDuration(2000); a.setRepeatCount(ValueAnimator.INFINITE); a.setRepeatMode(ValueAnimator.REVERSE); a.setEvaluator(new ArgbEvaluator()); AnimatorSet t = new AnimatorSet(); t.play(a); t.start();
													check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
																    
																       @Override
																       public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
																			
																			HashMap<String, Object> hash = new HashMap<>();  
																			  
																			if (isChecked) {
																						
																						hash = chosenPletteteListMap.get((int)Double.parseDouble(check.getTag().toString()));
																						
																						tempListMap.add(hash);
																						
																			}  else {
																						
																						for(int i = 0; i < tempListMap.size() ; i++) {
																									
																									if (tempListMap.get(i).get("name").toString().equals(check.getText().toString())) {
																												
																												tempListMap.remove(i);
																												
																									}
																						}
																						
																						
																			}
																			
																			
																			
																			            
																			              }
																          });
													lin.addView(check);
										}
										final ScrollView sc = new ScrollView(getApplicationContext());
										sc.addView(lin);
										builder.setView(sc);
										
										final AlertDialog alerto = builder.create();
										alerto.show();
										
										alerto.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener()
										 { 
														 @Override
														 public void onClick(View v)
														 {
																		 Boolean wantToCloseDialog = false;
																
																if (tempListMap.size()==0) {
																
														} else {
																		 FileUtil.writeFile(appFolder.concat("/".concat(palettesListMap.get((int)Double.parseDouble(sp.getString("posNumber", ""))).get("name").toString())), new Gson().toJson(tempListMap));
																String myFilePath = appFolder.concat("/".concat(palettesListMap.get((int)Double.parseDouble(sp.getString("posNumber", ""))).get("name").toString()));
																
																java.io.File file = new java.io.File(myFilePath);
																
																 Intent shareIntent = new Intent();
																shareIntent.setAction(Intent.ACTION_SEND);
																StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
																    StrictMode.setVmPolicy(builder.build());
																
																shareIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse("file://"+file.getAbsolutePath()));
																shareIntent.setType("*/*");
																startActivity(Intent.createChooser(shareIntent, "Share to"));
																
																alerto.dismiss();
																tempListMap.clear();
														}		
																			
																		 if(wantToCloseDialog) {
																						 }
																		 }
														 });
								}
								
								    
						}
						else {
								SketchwareUtil.showMessage(getApplicationContext(), "palette is empty !");
						}
				}
				else {
						SketchwareUtil.showMessage(getApplicationContext(), "choose plette first !");
				}
				          actionMenu.close(true);
								}
						});
		ImageView IconSavemultiples = new ImageView(getApplicationContext()); 
		
		IconSavemultiples.setImageDrawable(getResources().getDrawable(R.drawable.typesaveblock)); 
		
		com.oguzdev.circularfloatingactionmenu.library.SubActionButton Savemultiples = itemBuilder.setContentView(IconSavemultiples).build(); 
		
		FrameLayout.LayoutParams SavemultiplesParams = new FrameLayout.LayoutParams(90, 90);
		
		        Savemultiples.setLayoutParams(SavemultiplesParams);
		
		Savemultiples.setOnClickListener(new View.OnClickListener() {
								@Override
								public void onClick(View _view) {
				if (!allBlocks) {
						if (!(chosenPletteteListMap.size() == 0)) {
								{
										final AlertDialog.Builder builder = new AlertDialog.Builder(BlocksmanagerActivity.this);
										
										builder.setCancelable(false);
										
										builder.setTitle("select...");
										
										builder.setPositiveButton("Ok️", new DialogInterface.OnClickListener() {
														@Override
														public void onClick(DialogInterface _dialog, int _which) {
																
																
																		
														}
										});
										
										builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
														@Override
														public void onClick(DialogInterface _dialog, int _which) {
																
																
																		
														}
										});
										
										
										final LinearLayout lin = new LinearLayout(getApplicationContext());
										
										lin.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
										
										lin.setOrientation(LinearLayout.VERTICAL);
										
										lin.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
										
										for(int i = 0; i < chosenPletteteListMap.size() ; i++) {
													
													final CheckBox check = new CheckBox(getApplicationContext());
													
													check.setTextSize(16);
													
													
													
								typeBlock = chosenPletteteListMap.get((int)i).get("type").toString();
								if (typeBlock.equals(" ") || typeBlock.equals("")) {
									check.setText("regular".concat(" / ".concat(chosenPletteteListMap.get((int)i).get("name").toString())));
								}
								else {
									check.setText(typeBlock.concat(" / ".concat(chosenPletteteListMap.get((int)i).get("name").toString())));
								}
								check.setTag(String.valueOf(i));
													
													
													
													
													check.setPadding(20,4,5,4);
													lin.setPadding(20,5,5,5);
													ObjectAnimator a = ObjectAnimator.ofInt(check, "textColor", 0xFFE53935, 0xFFBF360C, 0xFF303F9F); a.setInterpolator(new LinearInterpolator()); a.setDuration(2000); a.setRepeatCount(ValueAnimator.INFINITE); a.setRepeatMode(ValueAnimator.REVERSE); a.setEvaluator(new ArgbEvaluator()); AnimatorSet t = new AnimatorSet(); t.play(a); t.start();
													check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
																    
																       @Override
																       public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
																			
																			HashMap<String, Object> hash = new HashMap<>();  
																			  
																			if (isChecked) {
																						
																						hash = chosenPletteteListMap.get((int)Double.parseDouble(check.getTag().toString()));
																						
																						tempListMap.add(hash);
																						
																			}  else {
																						
																						for(int i = 0; i < tempListMap.size() ; i++) {
																									
																									if (tempListMap.get(i).get("name").toString().equals(check.getText().toString())) {
																												
																												tempListMap.remove(i);
																												
																									}
																						}
																						
																						
																			}
																			
																			
																			
																			            
																			              }
																          });
													lin.addView(check);
										}
										final ScrollView sc = new ScrollView(getApplicationContext());
										sc.addView(lin);
										builder.setView(sc);
										
										final AlertDialog alerto = builder.create();
										alerto.show();
										
										alerto.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener()
										 { 
														 @Override
														 public void onClick(View v)
														 {
																		 Boolean wantToCloseDialog = false;
																
																if (tempListMap.size()==0) {
																
														} else {
																		 isDark = true;
																if (isDark) {
																		build = new AlertDialog.Builder(BlocksmanagerActivity.this, AlertDialog.THEME_DEVICE_DEFAULT_DARK);
																} else {
																		build = new AlertDialog.Builder(BlocksmanagerActivity.this);
																}
																
																build.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
																				@Override
																				public void onClick(DialogInterface _dialog, int _which) {
																						
																						
																								
																				}
																});
																
																build.setCancelable(false);
																
																alertoo = build.create();
																
																final ArrayList<String> listStr = new ArrayList<String>();
																
																path = "/storage/emulated/0/";
																
																final LinearLayout container = new LinearLayout(getApplicationContext());
																container.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
																container.setOrientation(LinearLayout.VERTICAL);
																container.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
																
																final LinearLayout header = new LinearLayout(getApplicationContext());
																header.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
																header.setOrientation(LinearLayout.VERTICAL);
																header.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
																header.setPadding(5,5,5,5);
																
																
																final TextView edit = new TextView(getApplicationContext());
																edit.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
																
																edit.setTextSize(14);
																edit.setTextIsSelectable(true);
																edit.setText("");
																if (isDark){
																			edit.setTextColor(0xFFFFFFFF);
																} else {
																			edit.setTextColor(0xFF000000);
																}
																
																final ListView List = new ListView(getApplicationContext());
																List.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
																
																
																final LinearLayout options = new LinearLayout(getApplicationContext());
																options.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
																options.setOrientation(LinearLayout.HORIZONTAL);
																options.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
																
																
																final Button back = new Button(getApplicationContext());
																back.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
																
																back.setText("⤎");
																back.setTextSize(20);
																
																final Button home = new Button(getApplicationContext());
																home.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
																
																home.setText("⌂");
																home.setTextSize(20);
																
																final Button select = new Button(getApplicationContext());
																select.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
																
																select.setText("✔️");
																select.setTextSize(20);
																
																
																open(listStr, path);
																
																
																{
																			android.graphics.drawable.GradientDrawable UiDesigner = new android.graphics.drawable.GradientDrawable();
																			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
																			int clrs [] = {Color.parseColor("#FFE7E7E7"),Color.parseColor("#FFE7E7E7")};
																			UiDesigner= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, clrs);
																			UiDesigner.setCornerRadii(new float[]{
																						d*433,d*433,d*433 ,d*433,d*433,d*433 ,d*43,d*43});
																			UiDesigner.setStroke(d*1,Color.parseColor("#FFFF4700"));
																			back.setElevation(d*22);
																			android.graphics.drawable.RippleDrawable UiDesignerPro = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#FFFFFFFF")}), UiDesigner, null);
																			back.setBackground(UiDesignerPro);
																			home.setBackground(UiDesignerPro);
																			select.setBackground(UiDesignerPro);
																			
																			back.setClickable(true);
																			home.setClickable(true);
																			select.setClickable(true);
																}
																DisplayMetrics displayMetrics = new DisplayMetrics();
																        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
																        int height = displayMetrics.heightPixels;
																        int width = displayMetrics.widthPixels;
																
																        container.setMinimumHeight(height);
																        container.setMinimumWidth(width);
																
																
																final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getApplicationContext(), android.R.layout.simple_list_item_1, listStr)
																{ 
																			@Override 
																			public View getView(int _position, View convertView, ViewGroup parent){ 
																						View view = super.getView(_position, convertView, parent);
																						
																						view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
																						
																						TextView tv = (TextView) view.findViewById(android.R.id.text1);
																						tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
																				
																				if (isDark){
																								 tv.setTextColor(0xFFFFFFFF); 
																						
																						
																				} else {
																						 tv.setTextColor(0xFF000000);
																						
																				}
																				
																						tv.setShadowLayer(1.5f,-2,2, 0xFFFFCCBC);
																						
																						if (FileUtil.isDirectory(listStr.get((int)(_position)))) {
																									tv.setText("📂 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
																						}
																						else {
																									if (FileUtil.isFile(listStr.get((int)(_position)))) {
																												tv.setText("📄 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
																									}
																						}
																						
																						return view; 
																			} 
																}; 
																List.setAdapter(arrayAdapter);
																((BaseAdapter)List.getAdapter()).notifyDataSetChanged();
																
																back.setOnClickListener(new View.OnClickListener() {
																			@Override
																			public void onClick(View _view) {
																						if (!(path.equals("/storage/emulated/0") || path.equals("/sdcard"))) {
																									String UpFolder = path.substring((int)(0), (int)(path.lastIndexOf("/")));
																										path = UpFolder;
																									
																									edit.setText("");
																									
																									open(listStr, path);
																									final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getApplicationContext(), android.R.layout.simple_list_item_1, listStr)
																									{ 
																												@Override 
																												public View getView(int _position, View convertView, ViewGroup parent){ 
																															View view = super.getView(_position, convertView, parent);
																															
																															view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
																															
																															TextView tv = (TextView) view.findViewById(android.R.id.text1);
																															tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
																															 if (isDark){
																														 tv.setTextColor(0xFFFFFFFF); 
																												
																												
																										} else {
																												 tv.setTextColor(0xFF000000);
																												
																										}
																															tv.setShadowLayer(1.5f,-2,2, 0xFFD7CCC8);
																															
																															if (FileUtil.isDirectory(listStr.get((int)(_position)))) {
																																		tv.setText("📂 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
																															}
																															else {
																																		if (FileUtil.isFile(listStr.get((int)(_position)))) {
																																					tv.setText("📄 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
																																		}
																															}
																															
																															return view; 
																												} 
																									}; 
																									List.setAdapter(arrayAdapter);
																									((BaseAdapter)List.getAdapter()).notifyDataSetChanged();
																									
																						}
																			}
																});
																home.setOnClickListener(new View.OnClickListener() {
																			@Override
																			public void onClick(View _view) {
																						path = "/storage/emulated/0/";
																						edit.setText("");
																						
																						open(listStr, path);
																						final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getApplicationContext(), android.R.layout.simple_list_item_1, listStr)
																						{ 
																									@Override 
																									public View getView(int _position, View convertView, ViewGroup parent){ 
																												View view = super.getView(_position, convertView, parent);
																												
																												view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
																												
																												TextView tv = (TextView) view.findViewById(android.R.id.text1);
																												tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
																												 if (isDark){
																												 tv.setTextColor(0xFFFFFFFF); 
																										
																										
																								} else {
																										 tv.setTextColor(0xFF000000);
																										
																								}
																												tv.setShadowLayer(1.5f,-2,2, 0xFFD7CCC8);
																												
																												if (FileUtil.isDirectory(listStr.get((int)(_position)))) {
																															tv.setText("📂 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
																												}
																												else {
																															if (FileUtil.isFile(listStr.get((int)(_position)))) {
																																		tv.setText("📄 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
																															}
																												}
																												
																												return view; 
																									} 
																						}; 
																						List.setAdapter(arrayAdapter);
																						((BaseAdapter)List.getAdapter()).notifyDataSetChanged();
																						
																			}
																});
																select.setOnClickListener(new View.OnClickListener() {
																			@Override
																			public void onClick(View _view) {
																						
																				
																				
																				FileUtil.writeFile(selectedFile.concat("/".concat(palettesListMap.get((int)Double.parseDouble(sp.getString("posNumber", ""))).get("name").toString())), new Gson().toJson(tempListMap));
																				SketchwareUtil.showMessage(getApplicationContext(), selectedFile.concat("/".concat(palettesListMap.get((int)Double.parseDouble(sp.getString("posNumber", ""))).get("name").toString())));
																				alertoo.dismiss();
																			}
																});
																List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
																								@Override
																								public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
																							
																						
																										
																						java.io.File check = new java.io.File(listStr.get(position));
																						
																						if (check.isDirectory()){
																									
																									path = listStr.get(position);
																									
																									selectedFile = listStr.get(position);
																									
																									open(listStr, path);
																									
																									
																									final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getApplicationContext(), android.R.layout.simple_list_item_1, listStr)
																									{ 
																												@Override 
																												public View getView(int _position, View convertView, ViewGroup parent){ 
																															View view = super.getView(_position, convertView, parent);
																															
																															view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
																															
																															TextView tv = (TextView) view.findViewById(android.R.id.text1);
																															tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
																															 if (isDark){
																														 tv.setTextColor(0xFFFFFFFF); 
																												
																												
																										} else {
																												 tv.setTextColor(0xFF000000);
																												
																										}
																															tv.setShadowLayer(1.5f,-2,2, 0xFFD7CCC8);
																															
																															if (FileUtil.isDirectory(listStr.get((int)(_position)))) {
																																		tv.setText("📂 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
																															}
																															else {
																																		if (FileUtil.isFile(listStr.get((int)(_position)))) {
																																					tv.setText("📄 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
																																		}
																															}
																															
																															return view; 
																												} 
																									}; 
																									List.setAdapter(arrayAdapter);
																									((BaseAdapter)List.getAdapter()).notifyDataSetChanged();
																									
																						} else {
																									
																									
																									
																									
																									
																									edit.setText("selected folder : "+selectedFile);
																									
																									
																									
																						}
																						
																						        
																								}
																				});
																
																header.addView(edit);
																container.addView(header);
																container.addView(List);
																options.addView(back);
																options.addView(home);
																options.addView(select);
																container.addView(options);
																
																alertoo.setView(container);
																
																alertoo.show();
																
																
																
																
																alerto.dismiss();
																tempListMap.clear();
														}		
																			
																		 if(wantToCloseDialog) {
																						 }
																		 }
														 });
								}
								
								    
						}
						else {
								SketchwareUtil.showMessage(getApplicationContext(), "palette is empty !");
						}
				}
				else {
						SketchwareUtil.showMessage(getApplicationContext(), "choose plette first !");
				}
				          actionMenu.close(true);
								}
						});
		 actionMenu = new com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu.Builder(BlocksmanagerActivity.this)
		
											.addSubActionView(Add)
		.addSubActionView(Sendmultiples)
		.addSubActionView(Savemultiples)
											.attachTo(actionButton)
		                  .build();
		
		
	}
	private com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu actionMenu;
	{
	}
	
	
	public void _transfetBlock(final double _position) {
		try { 
			chosenPos = _position + 9;
			if (searchEdit.getText().toString().isEmpty()) {
				if (allBlocks) {
					blocksListMap.get((int)dragedPos).put("palette", String.valueOf((long)(chosenPos)));
				}
				else {
					blocksListMap.get((int)positionsB.get((int)(dragedPos)).doubleValue()).put("palette", String.valueOf((long)(chosenPos)));
				}
			}
			else {
				if (allBlocks) {
					blocksListMap.get((int)searchAllNumberList.get((int)(dragedPos)).doubleValue()).put("palette", String.valueOf((long)(chosenPos)));
				}
				else {
					blocksListMap.get((int)SearchChosenNumberList.get((int)(dragedPos)).doubleValue()).put("palette", String.valueOf((long)(chosenPos)));
				}
			}
			FileUtil.writeFile(blocksPath, new Gson().toJson(blocksListMap));
			if (!sp.getString("posNumber", "").equals("")) {
				_loadSpecificPletteblocks(Double.parseDouble(sp.getString("posNumber", "")));
			}
			else {
				_loadRefreshPalettes();
				_loadRefreshBlocks();
			}
		} catch (Exception e){
			showMessage(e.toString());
		}
	}
	
	
	public void _toolbar(final double _position) {
		try { 
			getSupportActionBar().setTitle("Palette :".concat(" ".concat(palettesListMap.get((int)_position).get("name").toString())));
			if (!(chosenPletteteListMap.size() == 0)) {
				getSupportActionBar().setSubtitle(String.valueOf((long)(chosenPletteteListMap.size())).concat(" / ".concat("blocks")));
			}
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	
	public void _targedViewAction() {
		sendLinear.setOnDragListener( new OnDragListener(){
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
					
					
					               if (view.getTag().toString().equals("block")) {
						_ActionSend("b");
					}
					else {
						if (view.getTag().toString().equals("palette")) {
							_ActionSend("p");
						}
					}
					
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
		saveLinear.setOnDragListener( new OnDragListener(){
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
					
					
					               if (view.getTag().toString().equals("block")) {
						_ActionSave("b");
					}
					else {
						if (view.getTag().toString().equals("palette")) {
							_ActionSave("p");
						}
					}
					
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
		deleteLinear.setOnDragListener( new OnDragListener(){
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
					
					
					               if (view.getTag().toString().equals("block")) {
						_ActionDelete("b");
					}
					else {
						if (view.getTag().toString().equals("palette")) {
							_ActionDelete("p");
						}
					}
					
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
		duplicateLinear.setOnDragListener( new OnDragListener(){
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
					
					
					               if (view.getTag().toString().equals("block")) {
						_ActionDuplicate("b");
					}
					else {
						if (view.getTag().toString().equals("palette")) {
							_ActionDuplicate("p");
						}
					}
					
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
		editLinear.setOnDragListener( new OnDragListener(){
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
					
					
					               if (view.getTag().toString().equals("block")) {
						_editPaletteOrBlock("b");
					}
					else {
						if (view.getTag().toString().equals("palette")) {
							_editPaletteOrBlock("p");
						}
					}
					
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
		linearView.setOnDragListener( new OnDragListener(){
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
					
					
					               if (view.getTag().toString().equals("block")) {
						_preViewInfo("b");
					}
					else {
						if (view.getTag().toString().equals("palette")) {
							_preViewInfo("p");
						}
					}
					
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
	
	private String selectedFile = "";
	private AlertDialog alertoo;
	private void open(ArrayList<String> strings, String wech){
		
		strings.clear();
		
		
		FileUtil.listDir(wech, strings);
		
		
		
		final class FileComparator implements Comparator<String> {
					public int compare(String f1, String f2) {
								if(f1 == f2) return 0;
								if(FileUtil.isDirectory(f1) && FileUtil.isFile(f2))
								return -1;
								if(FileUtil.isFile(f1) && FileUtil.isDirectory(f2))
								return 1;
								return f1.compareToIgnoreCase(f2);
					}
		}
		Collections.sort(strings, new FileComparator());
		
		
	}
	private String path;
	private AlertDialog.Builder build;
	{
	}
	
	
	public void _deletePalette() {
		try { 
			chosenPos = Double.parseDouble(sp.getString("posNumber", "")) + 9;
			deletedPalettePos = Double.parseDouble(sp.getString("posNumber", ""));
			
			palettesListMap.remove((int)(Double.parseDouble(sp.getString("posNumber", ""))));
			new Thread(new Runnable() {
				@Override
				public void run() {
					Looper.prepare();
					
					ArrayList<HashMap<String, Object>> temp_list = new ArrayList<>();
					        for (HashMap<String, Object> block : blocksListMap) {
						            double palette = Math.floor(Double.parseDouble(block.get("palette").toString()));
									
									
							int result = (int) palette - 1;		
										
							String plt = String.valueOf((int)result);
						
						if (plt.contains(".")) {
							
							plt = String.valueOf((int)result).split("\\.")[0];
							
						} 	
									
						
						            if (palette != chosenPos) {
							                if (palette > chosenPos) {
								                    // Modifying map in list instead of new temporary map because that's the old logic
											
													
													
								                    block.put("palette", plt);
								                    temp_list.add(block);
								                } else {
								                    temp_list.add(block);
								                }
							            }
						        }
					        FileUtil.writeFile(blocksPath, new Gson().toJson(temp_list));
					        
							
							
					FileUtil.writeFile(palettesPath, new Gson().toJson(palettesListMap));
					
					
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							
							
							if (deletedPalettePos > palettesListMap.size()) {
								{
									int index = palettesList.getFirstVisiblePosition();
									int top = (palettesList.getChildAt(0) == null) ? 0 : (palettesList.getChildAt(0).getTop() - palettesList.getPaddingTop());
									
									_loadSpecificPletteblocks(palettesListMap.size() - 1);
									
									
									palettesList.setSelectionFromTop((int)index, (int)top);
								}
								sp.edit().putString("posNumber", String.valueOf((long)(palettesListMap.size() - 1))).commit();
								sp.edit().putString("pos", palettesListMap.get((int)palettesListMap.size() - 1).get("name").toString()).commit();
							}
							else {
								if ((deletedPalettePos < 0) || (deletedPalettePos == 0)) {
									{
										int index = palettesList.getFirstVisiblePosition();
										int top = (palettesList.getChildAt(0) == null) ? 0 : (palettesList.getChildAt(0).getTop() - palettesList.getPaddingTop());
										
										_loadSpecificPletteblocks(0);
										
										
										palettesList.setSelectionFromTop((int)index, (int)top);
									}
									sp.edit().putString("posNumber", "0").commit();
									sp.edit().putString("pos", palettesListMap.get((int)0).get("name").toString()).commit();
								}
								else {
									try {
										{
											int index = palettesList.getFirstVisiblePosition();
											int top = (palettesList.getChildAt(0) == null) ? 0 : (palettesList.getChildAt(0).getTop() - palettesList.getPaddingTop());
											
											_loadSpecificPletteblocks(deletedPalettePos - 1);
											
											
											palettesList.setSelectionFromTop((int)index, (int)top);
										}
										sp.edit().putString("posNumber", String.valueOf((long)(deletedPalettePos - 1))).commit();
										sp.edit().putString("pos", palettesListMap.get((int)deletedPalettePos - 1).get("name").toString()).commit();
									} catch (Exception z) {
										_loadRefreshPalettes();
										_loadRefreshBlocks();
									}
								}
							}
							
							Looper.loop();
						} 
						
					});
				}
			}).start();
			
			
		} catch (Exception e){
			showMessage(e.toString());
		}
		/*
FileUtil.writeFile(blocksPath, new Gson().toJson(blocksListMap));
for(int _repeat33 = 0; _repeat33 < (int)(positionsB.size()); _repeat33++) {
blocksListMap.remove((int)(positionsB.get((int)(_repeat33)).doubleValue()));
}
for(int _repeat150 = 0; _repeat150 < (int)(blocksListMap.size()); _repeat150++) {
if (Double.parseDouble(blocksListMap.get((int)_repeat150).get("palette").toString()) > chosenPos) {
couterNumPalette = Double.parseDouble(blocksListMap.get((int)_repeat150).get("palette").toString()) - 1;
blocksListMap.get((int)_repeat150).put("palette", String.valueOf((long)(couterNumPalette)));
}
}
*/
	}
	
	
	public void _editPaletteOrBlock(final String _which) {
		try {
			if (_which.equals("p")) {
				cmd = "edit";
				ColorPicker seekColorPicker = new ColorPicker(BlocksmanagerActivity.this);
				
						final AlertDialog.Builder buildPicker;
				
				
				if (isDark) {
						buildPicker = new AlertDialog.Builder(BlocksmanagerActivity.this, AlertDialog.THEME_DEVICE_DEFAULT_DARK);
				} else {
						buildPicker = new AlertDialog.Builder(BlocksmanagerActivity.this);
				}
				
				
						final LinearLayout linPicker = new LinearLayout(getApplicationContext());
				
				
						
				
				
				
						linPicker.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
				
						linPicker.setOrientation(LinearLayout.VERTICAL);
				
						linPicker.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
				
				
				
						buildPicker.setPositiveButton("Yes️", new DialogInterface.OnClickListener() {
									@Override
									public void onClick(DialogInterface dialogInterface, int i) {
								
									
						palettesListMap.get((int)Double.parseDouble(sp.getString("posNumber", ""))).put("name", nameEdit.getText().toString());
						palettesListMap.get((int)Double.parseDouble(sp.getString("posNumber", ""))).put("color", hex.getText().toString());
						FileUtil.writeFile(palettesPath, new Gson().toJson(palettesListMap));
						_loadRefreshPalettes();
						}
						});
						
						buildPicker.setNegativeButton("No", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
						
						
								
						}
				});
				
				
				
						linPicker.addView(seekColorPicker);
						buildPicker.setView(linPicker);
						final AlertDialog alrt = buildPicker.create();
						alrt.show();
			}
			else {
				if (_which.equals("b")) {
					if (allBlocks) {
						if (draged) {
							FileUtil.writeFile(blocksPath, new Gson().toJson(blocksListMap));
						}
						if (searchEdit.getText().toString().isEmpty()) {
							ExactPos = dragedPos;
						}
						else {
							ExactPos = searchAllNumberList.get((int)(dragedPos)).doubleValue();
						}
						intent.setClass(getApplicationContext(), AddBlockActivity.class);
						intent.putExtra("blockIndex", String.valueOf((long)(ExactPos)));
						intent.putExtra("cmd", "edit");
						intent.putExtra("palette", blocksListMap.get((int)ExactPos).get("palette").toString());
						intent.putExtra("name", blocksListMap.get((int)ExactPos).get("name").toString());
						intent.putExtra("code", blocksListMap.get((int)ExactPos).get("code").toString());
						if (blocksListMap.get((int)ExactPos).get("type").toString().equals(" ") || blocksListMap.get((int)ExactPos).get("type").toString().equals("  ")) {
							intent.putExtra("type", "regular");
						}
						else {
							intent.putExtra("type", blocksListMap.get((int)ExactPos).get("type").toString());
						}
						if (blocksListMap.get((int)ExactPos).containsKey("spec2")) {
							intent.putExtra("spec2", blocksListMap.get((int)ExactPos).get("spec2").toString());
						}
						intent.putExtra("typename", blocksListMap.get((int)ExactPos).get("typeName").toString());
						intent.putExtra("spec", blocksListMap.get((int)ExactPos).get("spec").toString());
						try { 
							intent.putExtra("color", blocksListMap.get((int)ExactPos).get("color").toString());
						} catch (Exception e){
							intent.putExtra("color", "#FFCED4FF");
						}
						startActivity(intent);
					}
					else {
						intent.setClass(getApplicationContext(), AddBlockActivity.class);
						if (searchEdit.getText().toString().isEmpty()) {
							ExactPos = dragedPos;
							intent.putExtra("blockIndex", String.valueOf((long)(positionsB.get((int)(dragedPos)).doubleValue())));
							intent.putExtra("cmd", "edit");
							intent.putExtra("name", chosenPletteteListMap.get((int)ExactPos).get("name").toString());
							intent.putExtra("code", chosenPletteteListMap.get((int)ExactPos).get("code").toString());
							if (chosenPletteteListMap.get((int)ExactPos).get("type").toString().equals(" ") || chosenPletteteListMap.get((int)ExactPos).get("type").toString().equals("  ")) {
								intent.putExtra("type", "regular");
							}
							else {
								intent.putExtra("type", chosenPletteteListMap.get((int)ExactPos).get("type").toString());
							}
							if (chosenPletteteListMap.get((int)ExactPos).containsKey("spec2")) {
								intent.putExtra("spec2", chosenPletteteListMap.get((int)ExactPos).get("spec2").toString());
							}
							intent.putExtra("typename", chosenPletteteListMap.get((int)ExactPos).get("typeName").toString());
							intent.putExtra("spec", chosenPletteteListMap.get((int)ExactPos).get("spec").toString());
							try { 
								intent.putExtra("color", chosenPletteteListMap.get((int)ExactPos).get("color").toString());
							} catch (Exception e){
								intent.putExtra("color", sp.getString("colorPalette", ""));
							}
							intent.putExtra("palette", sp.getString("posNumber", ""));
							startActivity(intent);
						}
						else {
							ExactPos = dragedPos;
							intent.putExtra("blockIndex", String.valueOf((long)(SearchChosenNumberList.get((int)(ExactPos)).doubleValue())));
							intent.putExtra("cmd", "edit");
							intent.putExtra("name", SearchchosenList.get((int)ExactPos).get("name").toString());
							intent.putExtra("code", SearchchosenList.get((int)ExactPos).get("code").toString());
							if (SearchchosenList.get((int)ExactPos).get("type").toString().equals(" ") || SearchchosenList.get((int)ExactPos).get("type").toString().equals("  ")) {
								intent.putExtra("type", "regular");
							}
							else {
								intent.putExtra("type", SearchchosenList.get((int)ExactPos).get("type").toString());
							}
							if (SearchchosenList.get((int)ExactPos).containsKey("spec2")) {
								intent.putExtra("spec2", SearchchosenList.get((int)ExactPos).get("spec2").toString());
							}
							intent.putExtra("typename", SearchchosenList.get((int)ExactPos).get("typeName").toString());
							intent.putExtra("spec", SearchchosenList.get((int)ExactPos).get("spec").toString());
							try { 
								intent.putExtra("color", SearchchosenList.get((int)ExactPos).get("color").toString());
							} catch (Exception e){
								intent.putExtra("color", sp.getString("colorPalette", ""));
							}
							intent.putExtra("palette", sp.getString("posNumber", ""));
							startActivity(intent);
						}
					}
				}
			}
			/*
 
*/
		} catch (Exception e) {
			 
		}
	}
	
	
	public void _swipListViewRows() {
	}
	public static class SwipeDismissTouchListener implements View.OnTouchListener {
		    private int mSlop;
		    private int mMinFlingVelocity;
		    private int mMaxFlingVelocity;
		    private long mAnimationTime;
		    private View mView;
		    private DismissCallbacks mCallbacks;
		    private int mViewWidth = 1; // 1 and not 0 to prevent dividing by zero
		    private float mDownX;
		    private float mDownY;
		    private boolean mSwiping;
		    private int mSwipingSlop;
		    private Object mToken;
		    private VelocityTracker mVelocityTracker;
		    private float mTranslationX;
		    public interface DismissCallbacks {
			        boolean canDismiss(Object token);
			        void onDismiss(View view, Object token);
			    }
		    public SwipeDismissTouchListener(View view, Object token, DismissCallbacks callbacks) {
			        ViewConfiguration vc = ViewConfiguration.get(view.getContext());
			        mSlop = vc.getScaledTouchSlop();
			        mMinFlingVelocity = vc.getScaledMinimumFlingVelocity() * 16;
			        mMaxFlingVelocity = vc.getScaledMaximumFlingVelocity();
			        mAnimationTime = view.getContext().getResources().getInteger(
			                android.R.integer.config_shortAnimTime);
			        mView = view;
			        mToken = token;
			        mCallbacks = callbacks;
			    }
		
		    @Override
		    public boolean onTouch(View view, MotionEvent motionEvent) {
			        // offset because the view is translated during swipe
			        motionEvent.offsetLocation(mTranslationX, 0);
			
			        if (mViewWidth < 2) {
				            mViewWidth = mView.getWidth();
				        }
			
			        switch (motionEvent.getActionMasked()) {
				            case MotionEvent.ACTION_DOWN: {
					                // TODO: ensure this is a finger, and set a flag
					                mDownX = motionEvent.getRawX();
					                mDownY = motionEvent.getRawY();
					                if (mCallbacks.canDismiss(mToken)) {
						                    mVelocityTracker = VelocityTracker.obtain();
						                    mVelocityTracker.addMovement(motionEvent);
						                }
					                return false;
					            }
				
				            case MotionEvent.ACTION_UP: {
					                if (mVelocityTracker == null) {
						                    break;
						                }
					
					                float deltaX = motionEvent.getRawX() - mDownX;
					                mVelocityTracker.addMovement(motionEvent);
					                mVelocityTracker.computeCurrentVelocity(1000);
					                float velocityX = mVelocityTracker.getXVelocity();
					                float absVelocityX = Math.abs(velocityX);
					                float absVelocityY = Math.abs(mVelocityTracker.getYVelocity());
					                boolean dismiss = false;
					                boolean dismissRight = false;
					                if (Math.abs(deltaX) > mViewWidth / 2 && mSwiping) {
						                    dismiss = true;
						                    dismissRight = deltaX > 0;
						                } else if (mMinFlingVelocity <= absVelocityX && absVelocityX <= mMaxFlingVelocity
					                        && absVelocityY < absVelocityX
					                        && absVelocityY < absVelocityX && mSwiping) {
						                    // dismiss only if flinging in the same direction as dragging
						                    dismiss = (velocityX < 0) == (deltaX < 0);
						                    dismissRight = mVelocityTracker.getXVelocity() > 0;
						                }
					                if (dismiss) {
						                    // dismiss
						                    mView.animate()
						                            .translationX(dismissRight ? mViewWidth : -mViewWidth)
						                            .alpha(1)
						                            .setDuration(10)
						                            .setListener(new AnimatorListenerAdapter() {
							                                @Override
							                                public void onAnimationEnd(Animator animation) {
								                                
								                                mCallbacks.onDismiss(mView, mToken);
								                                    
								                            final ViewGroup.LayoutParams lp = mView.getLayoutParams();
								        final int originalHeight = mView.getHeight();
								        
								        mView.setAlpha(1f);
								                mView.setTranslationX(0);
								                lp.height = originalHeight;
								                mView.setLayoutParams(lp);
								                                    
								                                    
								                                }
							                            });
						                } else if (mSwiping) {
						                    // cancel
						                    mView.animate()
						                            .translationX(0)
						                            .alpha(1)
						                            .setDuration(mAnimationTime)
						                            .setListener(null);
						                }
					                mVelocityTracker.recycle();
					                mVelocityTracker = null;
					                mTranslationX = 0;
					                mDownX = 0;
					                mDownY = 0;
					                mSwiping = false;
					                break;
					            }
				
				            case MotionEvent.ACTION_CANCEL: {
					                if (mVelocityTracker == null) {
						                    break;
						                }
					
					                mView.animate()
					                        .translationX(0)
					                        .alpha(1)
					                        .setDuration(40)
					                        .setListener(null);
					                mVelocityTracker.recycle();
					                mVelocityTracker = null;
					                mTranslationX = 0;
					                mDownX = 0;
					                mDownY = 0;
					                mSwiping = false;
					                break;
					            }
				
				            case MotionEvent.ACTION_MOVE: {
					                if (mVelocityTracker == null) {
						                    break;
						                }
					
					                mVelocityTracker.addMovement(motionEvent);
					                float deltaX = motionEvent.getRawX() - mDownX;
					                float deltaY = motionEvent.getRawY() - mDownY;
					                if (Math.abs(deltaX) > mSlop && Math.abs(deltaY) < Math.abs(deltaX) / 2) {
						                    mSwiping = true;
						                    mSwipingSlop = (deltaX > 0 ? mSlop : -mSlop);
						                    mView.getParent().requestDisallowInterceptTouchEvent(true);
						
						                    // Cancel listview's touch
						                    MotionEvent cancelEvent = MotionEvent.obtain(motionEvent);
						                    cancelEvent.setAction(MotionEvent.ACTION_CANCEL |
						                            (motionEvent.getActionIndex() <<
						                                    MotionEvent.ACTION_POINTER_INDEX_SHIFT));
						                    mView.onTouchEvent(cancelEvent);
						                    cancelEvent.recycle();
						                }
					
					                if (mSwiping) {
						                    mTranslationX = deltaX;
						                    mView.setTranslationX(deltaX - mSwipingSlop);
						                    // TODO: use an ease-out interpolator or such
						                    mView.setAlpha(Math.max(0f, Math.min(1f,
						                            1f - 2f * Math.abs(deltaX) / mViewWidth)));
						                    return true;
						                }
					                break;
					            }
				        }
			        return false;
			    }
		
		    private void performDismiss() {
			        final ViewGroup.LayoutParams lp = mView.getLayoutParams();
			        final int originalHeight = mView.getHeight();
			        ValueAnimator animator = ValueAnimator.ofInt(originalHeight, 1).setDuration(10);
			        animator.addListener(new AnimatorListenerAdapter() {
				            @Override
				            public void onAnimationEnd(Animator animation) {
					                mCallbacks.onDismiss(mView, mToken);
					                // Reset view presentation
					                mView.setAlpha(1f);
					                mView.setTranslationX(0);
					                lp.height = originalHeight;
					                mView.setLayoutParams(lp);
					            }
				        });
			
			        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
				            @Override
				            public void onAnimationUpdate(ValueAnimator valueAnimator) {
					                lp.height = (Integer) valueAnimator.getAnimatedValue();
					                mView.setLayoutParams(lp);
					            }
				        });
			        animator.start();
			    }
	}
	
	
	
	public static class SwipeDismissListViewTouchListener implements View.OnTouchListener {
		    private int mSlop;
		    private int mMinFlingVelocity;
		    private int mMaxFlingVelocity;
		    private long mAnimationTime;
		
		    // Fixed properties
		    private ListView mListView;
		    private DismissCallbacks mCallbacks;
		    private int mViewWidth = 1; // 1 and not 0 to prevent dividing by zero
		
		    // Transient properties
		    private List<PendingDismissData> mPendingDismisses = new ArrayList<PendingDismissData>();
		    private int mDismissAnimationRefCount = 0;
		    private float mDownX;
		    private float mDownY;
		    private boolean mSwiping;
		    private int mSwipingSlop;
		    private VelocityTracker mVelocityTracker;
		    private int mDownPosition;
		    private View mDownView;
		    private boolean mPaused;
		
		    public interface DismissCallbacks {
			        boolean canDismiss(int position);
			        void onDismiss(ListView listView, int[]  reverseSortedPositions);
			    }
		    public SwipeDismissListViewTouchListener(ListView listView, DismissCallbacks callbacks) {
			        ViewConfiguration vc = ViewConfiguration.get(listView.getContext());
			        mSlop = vc.getScaledTouchSlop();
			        mMinFlingVelocity = vc.getScaledMinimumFlingVelocity() * 16;
			        mMaxFlingVelocity = vc.getScaledMaximumFlingVelocity();
			        mAnimationTime = listView.getContext().getResources().getInteger(
			                android.R.integer.config_shortAnimTime);
			        mListView = listView;
			        mCallbacks = callbacks;
			    }
		    public void setEnabled(boolean enabled) {
			        mPaused = !enabled;
			    }
		    public AbsListView.OnScrollListener makeScrollListener() {
			        return new AbsListView.OnScrollListener() {
				            @Override
				            public void onScrollStateChanged(AbsListView absListView, int scrollState) {
					                setEnabled(scrollState != AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL);
					            }
				
				            @Override
				            public void onScroll(AbsListView absListView, int i, int i1, int i2) {
					            }
				        };
			    }
		
		    @Override
		    public boolean onTouch(View view, MotionEvent motionEvent) {
			        if (mViewWidth < 2) {
				            mViewWidth = mListView.getWidth();
				        }
			
			        switch (motionEvent.getActionMasked()) {
				            case MotionEvent.ACTION_DOWN: {
					                if (mPaused) {
						                    return false;
						                }
					
					                // TODO: ensure this is a finger, and set a flag
					
					                // Find the child view that was touched (perform a hit test)
					                Rect rect = new Rect();
					                int childCount = mListView.getChildCount();
					                int[]  listViewCoords = new int[2] ;
					                mListView.getLocationOnScreen(listViewCoords);
					                int x = (int) motionEvent.getRawX() - listViewCoords[0] ;
					                int y = (int) motionEvent.getRawY() - listViewCoords[1] ;
					                View child;
					                for (int i = 0; i < childCount; i++) {
						                    child = mListView.getChildAt(i);
						                    child.getHitRect(rect);
						                    if (rect.contains(x, y)) {
							                        mDownView = child;
							                        break;
							                    }
						                }
					
					                if (mDownView != null) {
						                    mDownX = motionEvent.getRawX();
						                    mDownY = motionEvent.getRawY();
						                    mDownPosition = mListView.getPositionForView(mDownView);
						                    if (mCallbacks.canDismiss(mDownPosition)) {
							                        mVelocityTracker = VelocityTracker.obtain();
							                        mVelocityTracker.addMovement(motionEvent);
							                    } else {
							                        mDownView = null;
							                    }
						                }
					                return false;
					            }
				
				            case MotionEvent.ACTION_CANCEL: {
					                if (mVelocityTracker == null) {
						                    break;
						                }
					
					                if (mDownView != null && mSwiping) {
						                    // cancel
						                    mDownView.animate()
						                            .translationX(0)
						                            .alpha(1)
						                            .setDuration(40)
						                            .setListener(null);
						                }
					                mVelocityTracker.recycle();
					                mVelocityTracker = null;
					                mDownX = 0;
					                mDownY = 0;
					                mDownView = null;
					                mDownPosition = ListView.INVALID_POSITION;
					                mSwiping = false;
					                break;
					            }
				
				            case MotionEvent.ACTION_UP: {
					                if (mVelocityTracker == null) {
						                    break;
						                }
					
					                float deltaX = motionEvent.getRawX() - mDownX;
					                mVelocityTracker.addMovement(motionEvent);
					                mVelocityTracker.computeCurrentVelocity(1000);
					                float velocityX = mVelocityTracker.getXVelocity();
					                float absVelocityX = Math.abs(velocityX);
					                float absVelocityY = Math.abs(mVelocityTracker.getYVelocity());
					                boolean dismiss = false;
					                boolean dismissRight = false;
					                if (Math.abs(deltaX) > mViewWidth / 2 && mSwiping) {
						                    dismiss = true;
						                    dismissRight = deltaX > 0;
						                } else if (mMinFlingVelocity <= absVelocityX && absVelocityX <= mMaxFlingVelocity
					                        && absVelocityY < absVelocityX && mSwiping) {
						                    // dismiss only if flinging in the same direction as dragging
						                    dismiss = (velocityX < 0) == (deltaX < 0);
						                    dismissRight = mVelocityTracker.getXVelocity() > 0;
						                }
					                if (dismiss && mDownPosition != ListView.INVALID_POSITION) {
						                    // dismiss
						                    final View downView = mDownView; // mDownView gets null'd before animation ends
						                    final int downPosition = mDownPosition;
						                    ++mDismissAnimationRefCount;
						                    mDownView.animate()
						                            .translationX(dismissRight ? mViewWidth : -mViewWidth)
						                            .alpha(0)
						                            .setDuration(mAnimationTime)
						                            .setListener(new AnimatorListenerAdapter() {
							                                @Override
							                                public void onAnimationEnd(Animator animation) {
								                                    performDismiss(downView, downPosition);
								                                }
							                            });
						                } else {
						                    // cancel
						                    mDownView.animate()
						                            .translationX(0)
						                            .alpha(1)
						                            .setDuration(mAnimationTime)
						                            .setListener(null);
						                }
					                mVelocityTracker.recycle();
					                mVelocityTracker = null;
					                mDownX = 0;
					                mDownY = 0;
					                mDownView = null;
					                mDownPosition = ListView.INVALID_POSITION;
					                mSwiping = false;
					                break;
					            }
				
				            case MotionEvent.ACTION_MOVE: {
					                if (mVelocityTracker == null || mPaused) {
						                    break;
						                }
					
					                mVelocityTracker.addMovement(motionEvent);
					                float deltaX = motionEvent.getRawX() - mDownX;
					                float deltaY = motionEvent.getRawY() - mDownY;
					                if (Math.abs(deltaX) > mSlop && Math.abs(deltaY) < Math.abs(deltaX) / 2) {
						                    mSwiping = true;
						                    mSwipingSlop = (deltaX > 0 ? mSlop : -mSlop);
						                    mListView.requestDisallowInterceptTouchEvent(true);
						
						                    // Cancel ListView's touch (un-highlighting the item)
						                    MotionEvent cancelEvent = MotionEvent.obtain(motionEvent);
						                    cancelEvent.setAction(MotionEvent.ACTION_CANCEL |
						                            (motionEvent.getActionIndex()
						                                    << MotionEvent.ACTION_POINTER_INDEX_SHIFT));
						                    mListView.onTouchEvent(cancelEvent);
						                    cancelEvent.recycle();
						                }
					
					                if (mSwiping) {
						                    mDownView.setTranslationX(deltaX - mSwipingSlop);
						                    mDownView.setAlpha(Math.max(0f, Math.min(1f,
						                            1f - 2f * Math.abs(deltaX) / mViewWidth)));
						                    return true;
						                }
					                break;
					            }
				        }
			        return false;
			    }
		
		    class PendingDismissData implements Comparable<PendingDismissData> {
			        public int position;
			        public View view;
			
			        public PendingDismissData(int position, View view) {
				            this.position = position;
				            this.view = view;
				        }
			
			        @Override
			        public int compareTo(PendingDismissData other) {
				            // Sort by descending position
				            return other.position - position;
				        }
			    }
		
		    private void performDismiss(final View dismissView, final int dismissPosition) {
			        final ViewGroup.LayoutParams lp = dismissView.getLayoutParams();
			        final int originalHeight = dismissView.getHeight();
			
			        ValueAnimator animator = ValueAnimator.ofInt(originalHeight, 1).setDuration(mAnimationTime);
			
			        animator.addListener(new AnimatorListenerAdapter() {
				            @Override
				            public void onAnimationEnd(Animator animation) {
					                --mDismissAnimationRefCount;
					                if (mDismissAnimationRefCount == 0) {
						                    // No active animations, process all pending dismisses.
						                    // Sort by descending position
						                    Collections.sort(mPendingDismisses);
						
						                    int[]  dismissPositions = new int[mPendingDismisses.size()] ;
						                    for (int i = mPendingDismisses.size() - 1; i >= 0; i--) {
							                        dismissPositions[i]  = mPendingDismisses.get(i).position;
							                    }
						                    mCallbacks.onDismiss(mListView, dismissPositions);
						                    
						                    mDownPosition = ListView.INVALID_POSITION;
						
						                    ViewGroup.LayoutParams lp;
						                    for (PendingDismissData pendingDismiss : mPendingDismisses) {
							                        // Reset view presentation
							                        pendingDismiss.view.setAlpha(1f);
							                        pendingDismiss.view.setTranslationX(0);
							                        lp = pendingDismiss.view.getLayoutParams();
							                        lp.height = originalHeight;
							                        pendingDismiss.view.setLayoutParams(lp);
							                    }
						
						                    // Send a cancel event
						                    long time = SystemClock.uptimeMillis();
						                    MotionEvent cancelEvent = MotionEvent.obtain(time, time,
						                            MotionEvent.ACTION_CANCEL, 0, 0, 0);
						                    mListView.dispatchTouchEvent(cancelEvent);
						
						                    mPendingDismisses.clear();
						                }
					            }
				        });
			
			        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
				            @Override
				            public void onAnimationUpdate(ValueAnimator valueAnimator) {
					                lp.height = (Integer) valueAnimator.getAnimatedValue();
					                dismissView.setLayoutParams(lp);
					            }
				        });
			
			        mPendingDismisses.add(new PendingDismissData(dismissPosition, dismissView));
			        animator.start();
			    }
	} {
	}
	
	
	public void _addButton(final String _which) {
		if (_which.equals("Block(s) from File")) {
			if (allBlocks) {
				SketchwareUtil.showMessage(getApplicationContext(), "select palette first !");
			}
			else {
				if (sp.getString("posNumber", "").equals("")) {
					
				}
				else {
					if (isDark) {
							build = new AlertDialog.Builder(BlocksmanagerActivity.this, AlertDialog.THEME_DEVICE_DEFAULT_DARK);
					} else {
							build = new AlertDialog.Builder(BlocksmanagerActivity.this);
					}
					
					build.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
									@Override
									public void onClick(DialogInterface _dialog, int _which) {
											
											
													
									}
					});
					
					build.setCancelable(false);
					
					alertoo = build.create();
					
					final ArrayList<String> listStr = new ArrayList<String>();
					
					path = "/storage/emulated/0/";
					
					final LinearLayout container = new LinearLayout(getApplicationContext());
					container.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
					container.setOrientation(LinearLayout.VERTICAL);
					container.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
					
					final LinearLayout header = new LinearLayout(getApplicationContext());
					header.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
					header.setOrientation(LinearLayout.VERTICAL);
					header.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
					header.setPadding(5,5,5,5);
					
					
					final TextView edit = new TextView(getApplicationContext());
					edit.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
					
					edit.setTextSize(14);
					edit.setTextIsSelectable(true);
					edit.setText("");
					if (isDark){
								edit.setTextColor(0xFFFFFFFF);
					} else {
								edit.setTextColor(0xFF000000);
					}
					
					final ListView List = new ListView(getApplicationContext());
					List.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
					
					
					final LinearLayout options = new LinearLayout(getApplicationContext());
					options.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
					options.setOrientation(LinearLayout.HORIZONTAL);
					options.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
					
					
					final Button back = new Button(getApplicationContext());
					back.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
					
					back.setText("⤎");
					back.setTextSize(20);
					
					final Button home = new Button(getApplicationContext());
					home.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
					
					home.setText("⌂");
					home.setTextSize(20);
					
					final Button select = new Button(getApplicationContext());
					select.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
					
					select.setText("✔️");
					select.setTextSize(20);
					select.setVisibility(View.INVISIBLE);
					
					open(listStr, path);
					
					
					{
								android.graphics.drawable.GradientDrawable UiDesigner = new android.graphics.drawable.GradientDrawable();
								int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
								int clrs [] = {Color.parseColor("#FFE7E7E7"),Color.parseColor("#FFE7E7E7")};
								UiDesigner= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, clrs);
								UiDesigner.setCornerRadii(new float[]{
											d*433,d*433,d*433 ,d*433,d*433,d*433 ,d*43,d*43});
								UiDesigner.setStroke(d*1,Color.parseColor("#FFFF4700"));
								back.setElevation(d*22);
								android.graphics.drawable.RippleDrawable UiDesignerPro = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#FFFFFFFF")}), UiDesigner, null);
								back.setBackground(UiDesignerPro);
								home.setBackground(UiDesignerPro);
								select.setBackground(UiDesignerPro);
								
								back.setClickable(true);
								home.setClickable(true);
								select.setClickable(true);
					}
					DisplayMetrics displayMetrics = new DisplayMetrics();
					        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
					        int height = displayMetrics.heightPixels;
					        int width = displayMetrics.widthPixels;
					
					        container.setMinimumHeight(height);
					        container.setMinimumWidth(width);
					
					
					final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getApplicationContext(), android.R.layout.simple_list_item_1, listStr)
					{ 
								@Override 
								public View getView(int _position, View convertView, ViewGroup parent){ 
											View view = super.getView(_position, convertView, parent);
											
											view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
											
											TextView tv = (TextView) view.findViewById(android.R.id.text1);
											tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
									
									if (isDark){
													 tv.setTextColor(0xFFFFFFFF); 
											
											
									} else {
											 tv.setTextColor(0xFF000000);
											
									}
									
											tv.setShadowLayer(1.5f,-2,2, 0xFFFFCCBC);
											
											if (FileUtil.isDirectory(listStr.get((int)(_position)))) {
														tv.setText("📂 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
											}
											else {
														if (FileUtil.isFile(listStr.get((int)(_position)))) {
																	tv.setText("📄 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
														}
											}
											
											return view; 
								} 
					}; 
					List.setAdapter(arrayAdapter);
					((BaseAdapter)List.getAdapter()).notifyDataSetChanged();
					
					back.setOnClickListener(new View.OnClickListener() {
								@Override
								public void onClick(View _view) {
											if (!(path.equals("/storage/emulated/0") || path.equals("/sdcard"))) {
														String UpFolder = path.substring((int)(0), (int)(path.lastIndexOf("/")));
															path = UpFolder;
														
														edit.setText("");
														
														open(listStr, path);
														final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getApplicationContext(), android.R.layout.simple_list_item_1, listStr)
														{ 
																	@Override 
																	public View getView(int _position, View convertView, ViewGroup parent){ 
																				View view = super.getView(_position, convertView, parent);
																				
																				view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
																				
																				TextView tv = (TextView) view.findViewById(android.R.id.text1);
																				tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
																				 if (isDark){
																			 tv.setTextColor(0xFFFFFFFF); 
																	
																	
															} else {
																	 tv.setTextColor(0xFF000000);
																	
															}
																				tv.setShadowLayer(1.5f,-2,2, 0xFFD7CCC8);
																				
																				if (FileUtil.isDirectory(listStr.get((int)(_position)))) {
																							tv.setText("📂 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
																				}
																				else {
																							if (FileUtil.isFile(listStr.get((int)(_position)))) {
																										tv.setText("📄 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
																							}
																				}
																				
																				return view; 
																	} 
														}; 
														List.setAdapter(arrayAdapter);
														((BaseAdapter)List.getAdapter()).notifyDataSetChanged();
														
											}
								}
					});
					home.setOnClickListener(new View.OnClickListener() {
								@Override
								public void onClick(View _view) {
											path = "/storage/emulated/0/";
											edit.setText("");
											
											open(listStr, path);
											final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getApplicationContext(), android.R.layout.simple_list_item_1, listStr)
											{ 
														@Override 
														public View getView(int _position, View convertView, ViewGroup parent){ 
																	View view = super.getView(_position, convertView, parent);
																	
																	view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
																	
																	TextView tv = (TextView) view.findViewById(android.R.id.text1);
																	tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
																	 if (isDark){
																	 tv.setTextColor(0xFFFFFFFF); 
															
															
													} else {
															 tv.setTextColor(0xFF000000);
															
													}
																	tv.setShadowLayer(1.5f,-2,2, 0xFFD7CCC8);
																	
																	if (FileUtil.isDirectory(listStr.get((int)(_position)))) {
																				tv.setText("📂 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
																	}
																	else {
																				if (FileUtil.isFile(listStr.get((int)(_position)))) {
																							tv.setText("📄 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
																				}
																	}
																	
																	return view; 
														} 
											}; 
											List.setAdapter(arrayAdapter);
											((BaseAdapter)List.getAdapter()).notifyDataSetChanged();
											
								}
					});
					select.setOnClickListener(new View.OnClickListener() {
								@Override
								public void onClick(View _view) {
											
									 
									
							listMapAddBlocks.clear();
							tempListMap.clear();
							currentPos = Double.parseDouble(sp.getString("posNumber", "")) + 9;
							
							if (selectedFile.endsWith(".json") && !(FileUtil.readFile(selectedFile).equals("") || FileUtil.readFile(selectedFile).equals("[]"))) {
								listMapAddBlocks = new Gson().fromJson(FileUtil.readFile(selectedFile), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
								{
										final AlertDialog.Builder builder = new AlertDialog.Builder(BlocksmanagerActivity.this);
										
										build.setCancelable(false);
										
										builder.setTitle("select...");
										
										builder.setPositiveButton("✔️", new DialogInterface.OnClickListener() {
														@Override
														public void onClick(DialogInterface _dialog, int _which) {
																
																
																		
														}
										});
										
										builder.setNegativeButton("❌", new DialogInterface.OnClickListener() {
														@Override
														public void onClick(DialogInterface _dialog, int _which) {
																
																
																		
														}
										});
										
										builder.setNeutralButton("All", new DialogInterface.OnClickListener() {
											@Override
											public void onClick(DialogInterface _dialog, int _which) {
											
											
											if (listMapAddBlocks.size()==0) {
																
														} else {
																		for (int i=0; i < (int)listMapAddBlocks.size(); i++)  { 
																		
														HashMap<String, Object> map = listMapAddBlocks.get(i);
																		 
													 String plt = String.valueOf(currentPos);
													
													if (plt.contains(".")) {
														
														plt = String.valueOf((int)currentPos).split("\\.")[0];
														
													} 
													map.put("palette", plt);
													
																		     blocksListMap.add(map);
																		                        
																		                        
																		                       
																		
															}
																FileUtil.writeFile(blocksPath, new Gson().toJson(blocksListMap));
																_loadSpecificPletteblocks(Double.parseDouble(sp.getString("posNumber", "")));
																
																_dialog.dismiss();
																tempListMap.clear();
														}	
											
											
											}
									});
										
										final LinearLayout lin = new LinearLayout(getApplicationContext());
										
										lin.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
										
										lin.setOrientation(LinearLayout.VERTICAL);
										
										lin.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
										
										for(int i = 0; i < listMapAddBlocks.size() ; i++) {
													
													final CheckBox check = new CheckBox(getApplicationContext());
													
													check.setTextSize(16);
													
													
													check.setText(listMapAddBlocks.get(i).get("name").toString());
													
													check.setTag(String.valueOf(i));
													
													
													
													
													check.setPadding(20,4,5,4);
													lin.setPadding(20,5,5,5);
													ObjectAnimator a = ObjectAnimator.ofInt(check, "textColor", 0xFFE53935, 0xFFBF360C, 0xFF303F9F); a.setInterpolator(new LinearInterpolator()); a.setDuration(2000); a.setRepeatCount(ValueAnimator.INFINITE); a.setRepeatMode(ValueAnimator.REVERSE); a.setEvaluator(new ArgbEvaluator()); AnimatorSet t = new AnimatorSet(); t.play(a); t.start();
													check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
																    
																       @Override
																       public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
																			
																			HashMap<String, Object> hash = new HashMap<>();  
																			  
																			if (isChecked) {
																						
																						hash = listMapAddBlocks.get((int)Double.parseDouble(check.getTag().toString()));
																						
																						tempListMap.add(hash);
																						
																			}  else {
																						
																						for(int i = 0; i < tempListMap.size() ; i++) {
																									
																									if (tempListMap.get(i).get("name").toString().equals(check.getText().toString())) {
																												
																												tempListMap.remove(i);
																												
																									}
																						}
																						
																						
																			}
																			
																			
																			
																			            
																			              }
																          });
													lin.addView(check);
										}
										final ScrollView sc = new ScrollView(getApplicationContext());
										sc.addView(lin);
										builder.setView(sc);
										
										final AlertDialog alerto = builder.create();
										alerto.show();
										
										alerto.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener()
										 { 
														 @Override
														 public void onClick(View v)
														 {
																		 Boolean wantToCloseDialog = false;
																
															 String plt = String.valueOf(currentPos);
											
											if (plt.contains(".")){
												
												plt = String.valueOf((int)currentPos).split("\\.")[0];
												
											} 
																
																if (tempListMap.size()==0) {
																
														} else {
																		 for (int i=0; i < (int)tempListMap.size(); i++)  { 
																		
																		HashMap<String, Object> map = tempListMap.get(i);
																		 map.put("palette", plt);
																		       blocksListMap.add(map);
																		                        
																		                        
																		                       
																		
																	
													    
												}
																FileUtil.writeFile(blocksPath, new Gson().toJson(blocksListMap));
																_loadSpecificPletteblocks(Double.parseDouble(sp.getString("posNumber", "")));
																
																alerto.dismiss();
																tempListMap.clear();
														}		
																			
																		 if(wantToCloseDialog) {
																						 }
																		 }
														 });
								}
								
							}
							else {
								SketchwareUtil.showMessage(getApplicationContext(), "file not valid or is empty !");
							}
							alertoo.dismiss();
								}
					});
					List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
													@Override
													public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
												
											
															
											java.io.File check = new java.io.File(listStr.get(position));
											
											if (check.isDirectory()){
														
														path = listStr.get(position);
														
														
														select.setVisibility(View.INVISIBLE);
														open(listStr, path);
														
														
														final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getApplicationContext(), android.R.layout.simple_list_item_1, listStr)
														{ 
																	@Override 
																	public View getView(int _position, View convertView, ViewGroup parent){ 
																				View view = super.getView(_position, convertView, parent);
																				
																				view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
																				
																				TextView tv = (TextView) view.findViewById(android.R.id.text1);
																				tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
																				 if (isDark){
																			 tv.setTextColor(0xFFFFFFFF); 
																	
																	
															} else {
																	 tv.setTextColor(0xFF000000);
																	
															}
																				tv.setShadowLayer(1.5f,-2,2, 0xFFD7CCC8);
																				
																				if (FileUtil.isDirectory(listStr.get((int)(_position)))) {
																							tv.setText("📂 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
																				}
																				else {
																							if (FileUtil.isFile(listStr.get((int)(_position)))) {
																										tv.setText("📄 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
																							}
																				}
																				
																				return view; 
																	} 
														}; 
														List.setAdapter(arrayAdapter);
														((BaseAdapter)List.getAdapter()).notifyDataSetChanged();
														
											} else {
														
														List.setSelector(android.R.color.transparent);
														android.graphics.drawable.GradientDrawable style = new android.graphics.drawable.GradientDrawable();
														
															style.setColor(Color.parseColor("#2196F3"));
														
													
														style.setCornerRadius(1);
														List.setSelector(style);
														
														selectedFile = listStr.get(position);
														
														edit.setText("selected file : "+selectedFile);
														
														select.setVisibility(View.VISIBLE);
														
											}
											
											        
													}
									});
					
					header.addView(edit);
					container.addView(header);
					container.addView(List);
					options.addView(back);
					options.addView(home);
					options.addView(select);
					container.addView(options);
					
					alertoo.setView(container);
					
					alertoo.show();
					
					
					
					
				}
			}
		}
		else {
			if (_which.equals("Add new Block")) {
				if (allBlocks) {
					SketchwareUtil.showMessage(getApplicationContext(), "select palette first !");
				}
				else {
					intent.setClass(getApplicationContext(), AddBlockActivity.class);
					intent.putExtra("cmd", "add");
					intent.putExtra("palette", sp.getString("posNumber", ""));
					intent.putExtra("color", palettesListMap.get((int)Double.parseDouble(sp.getString("posNumber", ""))).get("color").toString());
					startActivity(intent);
				}
			}
			else {
				if (_which.equals("Add Blocks From project")) {
					if (allBlocks) {
						SketchwareUtil.showMessage(getApplicationContext(), "select palette first !");
					}
					else {
						_showProjectsSelected("");
					}
				}
				else {
					if (_which.equals("Palette")) {
						cmd = "add";
						ColorPicker seekColorPicker = new ColorPicker(BlocksmanagerActivity.this);
						
						AlertDialog.Builder buildPicker;
						
						if (isDark) {
								buildPicker = new AlertDialog.Builder(BlocksmanagerActivity.this, AlertDialog.THEME_DEVICE_DEFAULT_DARK);
						} else {
								buildPicker = new AlertDialog.Builder(BlocksmanagerActivity.this);
						}
						
						
								final LinearLayout linPicker = new LinearLayout(getApplicationContext());
						
						
						buildPicker.setNegativeButton("❌", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
								
								
										
								}
						});		
						
						
						
								linPicker.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
						
								linPicker.setOrientation(LinearLayout.VERTICAL);
						
								linPicker.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
						
						
						
								
						if (!sp.getString("posNumber", "").equals("")) {
							colorOriginal = palettesListMap.get((int)Double.parseDouble(sp.getString("posNumber", ""))).get("color").toString();
						}
						buildPicker.setPositiveButton("✔️", new DialogInterface.OnClickListener() {
											@Override
											public void onClick(DialogInterface dialogInterface, int i) {
										
												
								
								
								
										
								if (!(nameEdit.getText().toString().equals("") || hex.getText().toString().equals(""))) {
									{
										int index = palettesList.getFirstVisiblePosition();
										int top = (palettesList.getChildAt(0) == null) ? 0 : (palettesList.getChildAt(0).getTop() - palettesList.getPaddingTop());
										
										map2 = new HashMap<>();
										map2.put("name", nameEdit.getText().toString());
										map2.put("color", hex.getText().toString());
										palettesListMap.add(map2);
										FileUtil.writeFile(palettesPath, new Gson().toJson(palettesListMap));
										sp.edit().putString("posNumber", String.valueOf((long)(palettesListMap.size() - 1))).commit();
										_loadRefreshPalettes();
										_loadSpecificPletteblocks(palettesListMap.size() - 1);
										palettesList.smoothScrollToPosition((int)(palettesListMap.size() - 1));
										
										
										dialogInterface.dismiss();
										
										
										
										
										palettesList.setSelectionFromTop((int)index, (int)top);
									}
								}
							}
								});
						
						linPicker.addView(seekColorPicker);
								buildPicker.setView(linPicker);
								final AlertDialog alrt = buildPicker.create();
								alrt.show();
					}
				}
			}
		}
	}
		 private Button btnCopy;
		 private EditText hex;
	private AlertDialog alrt;
		 private EditText nameEdit;
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
							 nameEdit = new EditText(getContext());
							 ViewGroup.MarginLayoutParams params = new ViewGroup.MarginLayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
							 params.setMargins(16, 0, 16, 0);
							 hex.setLayoutParams(params);
							 nameEdit.setLayoutParams(params);
							 hex.setCursorVisible(false);
				
							 hex.setImeOptions(android.view.inputmethod.EditorInfo.IME_ACTION_DONE);
							 
							 
							if (!paletteColor.isEmpty()) {
									hex.setText(paletteColor);
							} else {
									hex.setText("#000000");
								 }
							 
							 if (!paletteName.isEmpty()) {
									nameEdit.setText(paletteName);
							}
							 
							 nameEdit.setHint("Name of Block");
							 
							 
			 if (isDark) {
					nameEdit.setTextColor(0xFFFFFFFF);
					hex.setTextColor(0xFFFFFFFF);
					nameEdit.setHintTextColor(0xFF9e9e9e);
			} else {
					nameEdit.setTextColor(0xFF000000);
					hex.setTextColor(0xFF000000);
					nameEdit.setHintTextColor(0xFFbdbdbd);
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
				
							 
				
							 btnCopy.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
							 
							 btnCopy.setPadding(0,0,0,0);
							 
							 if (!paletteColor.isEmpty()) {
									btnCopy.setBackgroundColor(Color.parseColor(paletteColor));
							} else {
									btnCopy.setBackgroundColor(Color.BLACK);
								 }
							 
							 
							 
						
							 
				
							 lay2.addView(hex);
							 lay2.addView(nameEdit);
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
	
	
	public void _searchInListMap(final ArrayList<HashMap<String, Object>> _map, final String _key, final String _word, final ListView _list) {
		if (_word.isEmpty()) {
			blocksList.setAdapter(new BlocksListAdapter(searchMap));
			((BaseAdapter)blocksList.getAdapter()).notifyDataSetChanged();
		}
		else {
			try { 
				new Thread(new Runnable() {
					@Override
					public void run() {
						Looper.prepare();
						
						searchMap.clear();
						searchInt.clear();
						searchHash.clear();
						for (int i=0; i < (int)blocksListMap.size(); i++)  { 
							
							if (blocksListMap.get((int)i).get(_key).toString().contains(_word)) {
								searchHash = blocksListMap.get((int)i);
								searchInt.add(Double.valueOf(i));
								searchMap.add(searchHash);
							}
							else {
								
							}
							
						}
						
						
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								
								
								if ((searchMap.size() == 0) || _word.isEmpty()) {
									blocksList.setAdapter(new BlocksListAdapter(_map));
									((BaseAdapter)blocksList.getAdapter()).notifyDataSetChanged();
								}
								else {
									blocksList.setAdapter(new BlocksListAdapter(searchMap));
									((BaseAdapter)blocksList.getAdapter()).notifyDataSetChanged();
								}
								
								Looper.loop();
							} 
							
						});
					}
				}).start();
				
				
			} catch (Exception e){
				e.printStackTrace();
			}
		}
	}
	
	
	public void _preViewInfo(final String _which) {
		try {
			if (_which.equals("p")) {
				
			}
			else {
				if (_which.equals("b")) {
					final AlertDialog dialog = new AlertDialog.Builder(BlocksmanagerActivity.this).create();
					LayoutInflater inflater = getLayoutInflater();
					View convertView = (View) inflater.inflate(R.layout.preview, null);
					
					dialog.setView(convertView);
					
					
					final ImageView type = (ImageView)
					convertView.findViewById(R.id.type);
					final CodeEditor codeEditor = (CodeEditor)
					convertView.findViewById(R.id.codeEditor);
					final EditText name = (EditText)
					convertView.findViewById(R.id.name);
					final EditText spec = (EditText)
					convertView.findViewById(R.id.spec);
					final ImageView close = (ImageView)
					convertView.findViewById(R.id.close);
					final ImageView save = (ImageView)
					convertView.findViewById(R.id.save);
					final TextView bnumber = (TextView)
					convertView.findViewById(R.id.bnumber);
					final TextView pname = (TextView)
					convertView.findViewById(R.id.pname);
					final TextView pnumber = (TextView)
					convertView.findViewById(R.id.pnumber);
					final androidx.cardview.widget.CardView cardview1 = (androidx.cardview.widget.CardView)
							convertView.findViewById(R.id.cardview1);
					codeEditor.setWordwrap(true);
					codeEditor.setTypefaceText(Typeface.createFromAsset(getAssets(), "myfont.ttf"));
					codeEditor.setColorScheme(new theme());
					codeEditor.setEditorLanguage(new JavaLanguage()); 
					codeEditor.setTextActionMode(CodeEditor.TextActionMode.POPUP_WINDOW);
					codeEditor.setEdgeEffectColor(Color.RED);
					
					codeEditor.setPinLineNumber(!codeEditor.isLineNumberPinned());
					codeEditor.setNonPrintablePaintingFlags(CodeEditor.FLAG_DRAW_WHITESPACE_LEADING | CodeEditor.FLAG_DRAW_LINE_SEPARATOR);
					codeEditor.setTextSize((int)12);
					cardview1.setCardBackgroundColor(0xFF000027);
					cardview1.setRadius((float)25);
					cardview1.setCardElevation((float)0);
					if (allBlocks) {
						if (searchEdit.getText().toString().isEmpty()) {
							ExactPos = dragedPos;
						}
						else {
							ExactPos = searchAllNumberList.get((int)(dragedPos)).doubleValue();
						}
						_setImageForType(blocksListMap.get((int)ExactPos).get("type").toString(), type, blocksListMap.get((int)ExactPos).get("color").toString());
						code = blocksListMap.get((int)ExactPos).get("code").toString();
						spec.setText(blocksListMap.get((int)ExactPos).get("spec").toString());
						name.setText(blocksListMap.get((int)ExactPos).get("name").toString());
						bnumber.setText(String.valueOf((long)(ExactPos)));
						pnumber.setText(blocksListMap.get((int)ExactPos).get("palette").toString());
						pname.setText(palettesListMap.get((int)Double.parseDouble(blocksListMap.get((int)ExactPos).get("palette").toString()) - 9).get("name").toString());
					}
					else {
						if (searchEdit.getText().toString().isEmpty()) {
							ExactPos = dragedPos;
							blockIndex = positionsB.get((int)(dragedPos)).doubleValue();
							code = chosenPletteteListMap.get((int)ExactPos).get("code").toString();
							_setImageForType(chosenPletteteListMap.get((int)ExactPos).get("type").toString(), type, chosenPletteteListMap.get((int)ExactPos).get("color").toString());
							spec.setText(chosenPletteteListMap.get((int)ExactPos).get("spec").toString());
							name.setText(chosenPletteteListMap.get((int)ExactPos).get("name").toString());
							bnumber.setText(String.valueOf((long)(blockIndex)));
							/*
SketchwareUtil.showMessage(getApplicationContext(), String.valueOf((long)(ExactPos)));
*/
							pnumber.setText(chosenPletteteListMap.get((int)ExactPos).get("palette").toString());
							pname.setText(palettesListMap.get((int)Double.parseDouble(chosenPletteteListMap.get((int)ExactPos).get("palette").toString()) - 9).get("name").toString());
						}
						else {
							ExactPos = dragedPos;
							blockIndex = SearchChosenNumberList.get((int)(ExactPos)).doubleValue();
							code = SearchchosenList.get((int)ExactPos).get("code").toString();
							_setImageForType(SearchchosenList.get((int)ExactPos).get("type").toString(), type, SearchchosenList.get((int)ExactPos).get("color").toString());
							spec.setText(SearchchosenList.get((int)ExactPos).get("spec").toString());
							name.setText(SearchchosenList.get((int)ExactPos).get("name").toString());
							bnumber.setText(String.valueOf((long)(blockIndex)));
							/*
SketchwareUtil.showMessage(getApplicationContext(), String.valueOf((long)(0)));
*/
							pnumber.setText(SearchchosenList.get((int)ExactPos).get("palette").toString());
							pname.setText(palettesListMap.get((int)Double.parseDouble(SearchchosenList.get((int)ExactPos).get("palette").toString()) - 9).get("name").toString());
						}
					}
					save.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View _view) {
							if (allBlocks) {
								blocksListMap.get((int)blockIndex).put("code", codeEditor.getText().toString());
								blocksListMap.get((int)blockIndex).put("name", name.getText().toString());
								blocksListMap.get((int)blockIndex).put("spec", spec.getText().toString());
								FileUtil.writeFile(blocksPath, new Gson().toJson(blocksListMap));
								{
									int index = blocksList.getFirstVisiblePosition();
									int top = (blocksList.getChildAt(0) == null) ? 0 : (blocksList.getChildAt(0).getTop() - blocksList.getPaddingTop());
									
									_loadRefreshBlocks();
									
									
									blocksList.setSelectionFromTop((int)index, (int)top);
								}
								dialog.dismiss();
								SketchwareUtil.showMessage(getApplicationContext(), "✔️");
								searchEdit.setText("");
							}
							else {
								if (!sp.getString("posNumber", "").equals("")) {
									blocksListMap.get((int)blockIndex).put("code", codeEditor.getText().toString());
									blocksListMap.get((int)blockIndex).put("name", name.getText().toString());
									blocksListMap.get((int)blockIndex).put("spec", spec.getText().toString());
									FileUtil.writeFile(blocksPath, new Gson().toJson(blocksListMap));
									{
										int index = blocksList.getFirstVisiblePosition();
										int top = (blocksList.getChildAt(0) == null) ? 0 : (blocksList.getChildAt(0).getTop() - blocksList.getPaddingTop());
										
										_loadSpecificPletteblocks(Double.parseDouble(sp.getString("posNumber", "")));
										
										
										blocksList.setSelectionFromTop((int)index, (int)top);
									}
								}
								dialog.dismiss();
								SketchwareUtil.showMessage(getApplicationContext(), "saved!");
								searchEdit.setText("");
								searchEdit.setText("");
							}
						}
					});
					close.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View _view) {
							dialog.dismiss();
						}
					});
					codeEditor.setText(code);
					dialog.show();
				}
			}
			
			
			
			
			
			
		} catch (Exception e) {
			SketchwareUtil.CustomToast(getApplicationContext(), "خطا رنگ یافت نشد!", 0xFFFFFFFF, 16, 0xFFE91E63, 25, SketchwareUtil.TOP);
		}
	}
	
	
	public void _drawerInitializeViews() {
		
	}
	
	
	public void _setDarkMode(final boolean _dark) {
		if (_dark) {
			swiped = true;
			try { 
				((BaseAdapter)palettesList.getAdapter()).notifyDataSetChanged();
				((BaseAdapter)blocksList.getAdapter()).notifyDataSetChanged();
			} catch (Exception e){
				e.printStackTrace();
			}
		}
		else {
			swiped = false;
			try { 
				((BaseAdapter)palettesList.getAdapter()).notifyDataSetChanged();
				((BaseAdapter)blocksList.getAdapter()).notifyDataSetChanged();
			} catch (Exception e){
				e.printStackTrace();
			}
		}
	}
	
	
	public void _doAllTextColorDrawer(final String _color) {
		
	}
	
	
	public void _setImageForType(final String _which, final ImageView _img, final String _col) {
		if (_which.equals("") || (_which.equals(" ") || _which.equals("  "))) {
			_img.setImageResource(R.drawable.block_regular);
			_img.setColorFilter(Color.parseColor(_col), PorterDuff.Mode.MULTIPLY);
		}
		else {
			if (_which.equals("c")) {
				_img.setImageResource(R.drawable.if_else);
				_img.setColorFilter(Color.parseColor(_col), PorterDuff.Mode.MULTIPLY);
			}
			else {
				if (_which.equals("s")) {
					_img.setImageResource(R.drawable.block_string);
					_img.setColorFilter(Color.parseColor(_col), PorterDuff.Mode.MULTIPLY);
				}
				else {
					if (_which.equals("d")) {
						_img.setImageResource(R.drawable.block_number);
						_img.setColorFilter(Color.parseColor(_col), PorterDuff.Mode.MULTIPLY);
					}
					else {
						if (_which.equals("b")) {
							_img.setImageResource(R.drawable.block_boolean);
							_img.setColorFilter(Color.parseColor(_col), PorterDuff.Mode.MULTIPLY);
						}
						else {
							if (_which.equals("e")) {
								_img.setImageResource(R.drawable.if_else);
								_img.setColorFilter(Color.parseColor(_col), PorterDuff.Mode.MULTIPLY);
							}
							else {
								if (_which.equals("v")) {
									_img.setImageResource(R.drawable.block_string);
									_img.setColorFilter(Color.parseColor(_col), PorterDuff.Mode.MULTIPLY);
								}
								else {
									if (_which.equals("a")) {
										_img.setImageResource(R.drawable.block_string);
										_img.setColorFilter(Color.parseColor(_col), PorterDuff.Mode.MULTIPLY);
									}
									else {
										if (_which.equals("f")) {
											_img.setImageResource(R.drawable.block_stop);
											_img.setColorFilter(Color.parseColor(_col), PorterDuff.Mode.MULTIPLY);
										}
										else {
											if (_which.equals("l")) {
												_img.setImageResource(R.drawable.block_string);
												_img.setColorFilter(Color.parseColor(_col), PorterDuff.Mode.MULTIPLY);
											}
											else {
												if (_which.equals("p")) {
													_img.setImageResource(R.drawable.block_string);
													_img.setColorFilter(Color.parseColor(_col), PorterDuff.Mode.MULTIPLY);
												}
												else {
													if (_which.equals("h")) {
														_img.setImageResource(R.drawable.block_string);
														_img.setColorFilter(Color.parseColor(_col), PorterDuff.Mode.MULTIPLY);
													}
													else {
														_img.setVisibility(View.GONE);
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
	
	
	public void _ActionSend(final String _which) {
		if (_which.equals("b")) {
			chosenBlockorPalette.clear();
			if (allBlocks) {
				if (searchEdit.getText().toString().isEmpty()) {
					ExactPos = dragedPos;
				}
				else {
					ExactPos = searchAllNumberList.get((int)(dragedPos)).doubleValue();
				}
				tempHash = new HashMap<>();
				tempHash = blocksListMap.get((int)ExactPos);
				chosenBlockorPalette.add(tempHash);
				if (chosenBlockorPalette.get((int)0).containsKey("name")) {
					nameFile = chosenBlockorPalette.get((int)0).get("name").toString();
				}
				else {
					try { 
						nameFile = blocksListMap.get((int)ExactPos).get("name").toString();
					} catch (Exception e){
						nameFile = "saved_block";
					}
				}
				FileUtil.writeFile(appFolder.concat("/".concat(nameFile.concat(".json"))), new Gson().toJson(chosenBlockorPalette));
				String myFilePath = appFolder.concat("/".concat(nameFile.concat(".json")));
				
				java.io.File file = new java.io.File(myFilePath);
				
				 Intent shareIntent = new Intent();
				shareIntent.setAction(Intent.ACTION_SEND);
				StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
				    StrictMode.setVmPolicy(builder.build());
				
				shareIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse("file://"+file.getAbsolutePath()));
				shareIntent.setType("*/*");
				startActivity(Intent.createChooser(shareIntent, "Share to"));
			}
			else {
				chosenBlockorPalette.clear();
				if (!allBlocks) {
					if (searchEdit.getText().toString().isEmpty()) {
						ExactPos = positionsB.get((int)(dragedPos)).doubleValue();
						tempHash = new HashMap<>();
						tempHash = chosenPletteteListMap.get((int)dragedPos);
						chosenBlockorPalette.add(tempHash);
					}
					else {
						ExactPos = SearchChosenNumberList.get((int)(dragedPos)).doubleValue();
						tempHash = new HashMap<>();
						tempHash = SearchchosenList.get((int)dragedPos);
						chosenBlockorPalette.add(tempHash);
					}
					if (chosenBlockorPalette.get((int)0).containsKey("name")) {
						nameFile = chosenBlockorPalette.get((int)0).get("name").toString();
					}
					else {
						try { 
							nameFile = blocksListMap.get((int)ExactPos).get("name").toString();
						} catch (Exception e){
							nameFile = "saved_block";
						}
					}
					FileUtil.writeFile(appFolder.concat("/".concat(nameFile.concat(".json"))), new Gson().toJson(chosenBlockorPalette));
					String myFilePath = appFolder.concat("/".concat(nameFile.concat(".json")));
					
					java.io.File file = new java.io.File(myFilePath);
					
					 Intent shareIntent = new Intent();
					shareIntent.setAction(Intent.ACTION_SEND);
					StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
					    StrictMode.setVmPolicy(builder.build());
					
					shareIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse("file://"+file.getAbsolutePath()));
					shareIntent.setType("*/*");
					startActivity(Intent.createChooser(shareIntent, "Share to"));
				}
			}
		}
		else {
			if (_which.equals("p")) {
				if (!(chosenPletteteListMap.size() == 0)) {
					try { 
						FileUtil.writeFile(appFolder.concat("/".concat(palettesListMap.get((int)Double.parseDouble(sp.getString("posNumber", ""))).get("name").toString().concat(".json"))), new Gson().toJson(chosenPletteteListMap));
						String myFilePath = appFolder.concat("/".concat(palettesListMap.get((int)Double.parseDouble(sp.getString("posNumber", ""))).get("name").toString().concat(".json")));
						
						java.io.File file = new java.io.File(myFilePath);
						
						 Intent shareIntent = new Intent();
						shareIntent.setAction(Intent.ACTION_SEND);
						StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
						    StrictMode.setVmPolicy(builder.build());
						
						shareIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse("file://"+file.getAbsolutePath()));
						shareIntent.setType("*/*");
						startActivity(Intent.createChooser(shareIntent, "Share to"));
					} catch (Exception e){
						FileUtil.writeFile(appFolder.concat("/".concat("palette.json")), new Gson().toJson(chosenPletteteListMap));
						String myFilePath = appFolder.concat("/".concat("palette.json"));
						
						java.io.File file = new java.io.File(myFilePath);
						
						 Intent shareIntent = new Intent();
						shareIntent.setAction(Intent.ACTION_SEND);
						StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
						    StrictMode.setVmPolicy(builder.build());
						
						shareIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse("file://"+file.getAbsolutePath()));
						shareIntent.setType("*/*");
						startActivity(Intent.createChooser(shareIntent, "Share to"));
					}
				}
			}
		}
	}
	
	
	public void _ActionSave(final String _which) {
		if (_which.equals("b")) {
			if (allBlocks) {
				if (searchEdit.getText().toString().isEmpty()) {
					ExactPos = dragedPos;
				}
				else {
					ExactPos = searchAllNumberList.get((int)(dragedPos)).doubleValue();
				}
				isDark = true;
				if (isDark) {
					build = new AlertDialog.Builder(BlocksmanagerActivity.this, AlertDialog.THEME_DEVICE_DEFAULT_DARK);
				} else {
					build = new AlertDialog.Builder(BlocksmanagerActivity.this);
				}
				
				build.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
								
										
							}
				});
				
				build.setCancelable(false);
				
				alertoo = build.create();
				
				final ArrayList<String> listStr = new ArrayList<String>();
				
				path = "/storage/emulated/0/";
				
				final LinearLayout container = new LinearLayout(getApplicationContext());
				container.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
				container.setOrientation(LinearLayout.VERTICAL);
				container.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
				
				final LinearLayout header = new LinearLayout(getApplicationContext());
				header.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
				header.setOrientation(LinearLayout.VERTICAL);
				header.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
				header.setPadding(5,5,5,5);
				
				
				final TextView edit = new TextView(getApplicationContext());
				edit.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
				
				edit.setTextSize(14);
				edit.setTextIsSelectable(true);
				edit.setText("");
				if (isDark){
						edit.setTextColor(0xFFFFFFFF);
				} else {
						edit.setTextColor(0xFF000000);
				}
				
				final ListView List = new ListView(getApplicationContext());
				List.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
				
				
				final LinearLayout options = new LinearLayout(getApplicationContext());
				options.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
				options.setOrientation(LinearLayout.HORIZONTAL);
				options.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
				
				
				final Button back = new Button(getApplicationContext());
				back.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
				
				back.setText("⤎");
				back.setTextSize(20);
				
				final Button home = new Button(getApplicationContext());
				home.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
				
				home.setText("⌂");
				home.setTextSize(20);
				
				final Button select = new Button(getApplicationContext());
				select.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
				
				select.setText("✔️");
				select.setTextSize(20);
				
				
				open(listStr, path);
				
				
				{
						android.graphics.drawable.GradientDrawable UiDesigner = new android.graphics.drawable.GradientDrawable();
						int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
						int clrs [] = {Color.parseColor("#FFE7E7E7"),Color.parseColor("#FFE7E7E7")};
						UiDesigner= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, clrs);
						UiDesigner.setCornerRadii(new float[]{
								d*433,d*433,d*433 ,d*433,d*433,d*433 ,d*43,d*43});
						UiDesigner.setStroke(d*1,Color.parseColor("#FFFF4700"));
						back.setElevation(d*22);
						android.graphics.drawable.RippleDrawable UiDesignerPro = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#FFFFFFFF")}), UiDesigner, null);
						back.setBackground(UiDesignerPro);
						home.setBackground(UiDesignerPro);
						select.setBackground(UiDesignerPro);
						
						back.setClickable(true);
						home.setClickable(true);
						select.setClickable(true);
				}
				DisplayMetrics displayMetrics = new DisplayMetrics();
				        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
				        int height = displayMetrics.heightPixels;
				        int width = displayMetrics.widthPixels;
				
				        container.setMinimumHeight(height);
				        container.setMinimumWidth(width);
				
				
				final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getApplicationContext(), android.R.layout.simple_list_item_1, listStr)
				{ 
						@Override 
						public View getView(int _position, View convertView, ViewGroup parent){ 
								View view = super.getView(_position, convertView, parent);
								
								view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
								
								TextView tv = (TextView) view.findViewById(android.R.id.text1);
								tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
						
						if (isDark){
									 tv.setTextColor(0xFFFFFFFF); 
							
							
						} else {
							 tv.setTextColor(0xFF000000);
							
						}
						
								tv.setShadowLayer(1.5f,-2,2, 0xFFFFCCBC);
								
								if (FileUtil.isDirectory(listStr.get((int)(_position)))) {
										tv.setText("📂 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
								}
								else {
										if (FileUtil.isFile(listStr.get((int)(_position)))) {
												tv.setText("📄 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
										}
								}
								
								return view; 
						} 
				}; 
				List.setAdapter(arrayAdapter);
				((BaseAdapter)List.getAdapter()).notifyDataSetChanged();
				
				back.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View _view) {
								if (!(path.equals("/storage/emulated/0") || path.equals("/sdcard"))) {
										String UpFolder = path.substring((int)(0), (int)(path.lastIndexOf("/")));
											path = UpFolder;
										
										edit.setText("");
										
										open(listStr, path);
										final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getApplicationContext(), android.R.layout.simple_list_item_1, listStr)
										{ 
												@Override 
												public View getView(int _position, View convertView, ViewGroup parent){ 
														View view = super.getView(_position, convertView, parent);
														
														view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
														
														TextView tv = (TextView) view.findViewById(android.R.id.text1);
														tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
														 if (isDark){
												 tv.setTextColor(0xFFFFFFFF); 
										
										
									} else {
										 tv.setTextColor(0xFF000000);
										
									}
														tv.setShadowLayer(1.5f,-2,2, 0xFFD7CCC8);
														
														if (FileUtil.isDirectory(listStr.get((int)(_position)))) {
																tv.setText("📂 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
														}
														else {
																if (FileUtil.isFile(listStr.get((int)(_position)))) {
																		tv.setText("📄 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
																}
														}
														
														return view; 
												} 
										}; 
										List.setAdapter(arrayAdapter);
										((BaseAdapter)List.getAdapter()).notifyDataSetChanged();
										
								}
						}
				});
				home.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View _view) {
								path = "/storage/emulated/0/";
								edit.setText("");
								
								open(listStr, path);
								final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getApplicationContext(), android.R.layout.simple_list_item_1, listStr)
								{ 
										@Override 
										public View getView(int _position, View convertView, ViewGroup parent){ 
												View view = super.getView(_position, convertView, parent);
												
												view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
												
												TextView tv = (TextView) view.findViewById(android.R.id.text1);
												tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
												 if (isDark){
											 tv.setTextColor(0xFFFFFFFF); 
									
									
								} else {
									 tv.setTextColor(0xFF000000);
									
								}
												tv.setShadowLayer(1.5f,-2,2, 0xFFD7CCC8);
												
												if (FileUtil.isDirectory(listStr.get((int)(_position)))) {
														tv.setText("📂 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
												}
												else {
														if (FileUtil.isFile(listStr.get((int)(_position)))) {
																tv.setText("📄 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
														}
												}
												
												return view; 
										} 
								}; 
								List.setAdapter(arrayAdapter);
								((BaseAdapter)List.getAdapter()).notifyDataSetChanged();
								
						}
				});
				select.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View _view) {
								
						
						
						chosenBlockorPalette.clear();
						map = blocksListMap.get((int)ExactPos);
						chosenBlockorPalette.add(map);
						FileUtil.writeFile(selectedFile.concat("/".concat(blocksListMap.get((int)ExactPos).get("name").toString().concat(".json"))), new Gson().toJson(chosenBlockorPalette));
						SketchwareUtil.showMessage(getApplicationContext(), selectedFile.concat("/".concat(blocksListMap.get((int)ExactPos).get("name").toString().concat(".json"))));
						alertoo.dismiss();
						}
				});
				List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
											@Override
											public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
									
								
												
								java.io.File check = new java.io.File(listStr.get(position));
								
								if (check.isDirectory()){
										
										path = listStr.get(position);
										
										selectedFile = listStr.get(position);
										
										open(listStr, path);
										
										
										final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getApplicationContext(), android.R.layout.simple_list_item_1, listStr)
										{ 
												@Override 
												public View getView(int _position, View convertView, ViewGroup parent){ 
														View view = super.getView(_position, convertView, parent);
														
														view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
														
														TextView tv = (TextView) view.findViewById(android.R.id.text1);
														tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
														 if (isDark){
												 tv.setTextColor(0xFFFFFFFF); 
										
										
									} else {
										 tv.setTextColor(0xFF000000);
										
									}
														tv.setShadowLayer(1.5f,-2,2, 0xFFD7CCC8);
														
														if (FileUtil.isDirectory(listStr.get((int)(_position)))) {
																tv.setText("📂 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
														}
														else {
																if (FileUtil.isFile(listStr.get((int)(_position)))) {
																		tv.setText("📄 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
																}
														}
														
														return view; 
												} 
										}; 
										List.setAdapter(arrayAdapter);
										((BaseAdapter)List.getAdapter()).notifyDataSetChanged();
										
								} else {
										
										
										
										
										
										edit.setText("selected folder : "+selectedFile);
										
										
										
								}
								
								        
											}
								});
				
				header.addView(edit);
				container.addView(header);
				container.addView(List);
				options.addView(back);
				options.addView(home);
				options.addView(select);
				container.addView(options);
				
				alertoo.setView(container);
				
				alertoo.show();
				
				
				
			}
			else {
				chosenBlockorPalette.clear();
				map = new HashMap<>();
				if (searchEdit.getText().toString().isEmpty()) {
					ExactPos = dragedPos;
					map = chosenPletteteListMap.get((int)dragedPos);
				}
				else {
					ExactPos = SearchChosenNumberList.get((int)(dragedPos)).doubleValue();
					map = SearchchosenList.get((int)dragedPos);
				}
				isDark = true;
				if (isDark) {
					build = new AlertDialog.Builder(BlocksmanagerActivity.this, AlertDialog.THEME_DEVICE_DEFAULT_DARK);
				} else {
					build = new AlertDialog.Builder(BlocksmanagerActivity.this);
				}
				
				build.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
								
										
							}
				});
				
				build.setCancelable(false);
				
				alertoo = build.create();
				
				final ArrayList<String> listStr = new ArrayList<String>();
				
				path = "/storage/emulated/0/";
				
				final LinearLayout container = new LinearLayout(getApplicationContext());
				container.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
				container.setOrientation(LinearLayout.VERTICAL);
				container.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
				
				final LinearLayout header = new LinearLayout(getApplicationContext());
				header.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
				header.setOrientation(LinearLayout.VERTICAL);
				header.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
				header.setPadding(5,5,5,5);
				
				
				final TextView edit = new TextView(getApplicationContext());
				edit.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
				
				edit.setTextSize(14);
				edit.setTextIsSelectable(true);
				edit.setText("");
				if (isDark){
						edit.setTextColor(0xFFFFFFFF);
				} else {
						edit.setTextColor(0xFF000000);
				}
				
				final ListView List = new ListView(getApplicationContext());
				List.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
				
				
				final LinearLayout options = new LinearLayout(getApplicationContext());
				options.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
				options.setOrientation(LinearLayout.HORIZONTAL);
				options.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
				
				
				final Button back = new Button(getApplicationContext());
				back.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
				
				back.setText("⤎");
				back.setTextSize(20);
				
				final Button home = new Button(getApplicationContext());
				home.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
				
				home.setText("⌂");
				home.setTextSize(20);
				
				final Button select = new Button(getApplicationContext());
				select.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
				
				select.setText("✔️");
				select.setTextSize(20);
				
				
				open(listStr, path);
				
				
				{
						android.graphics.drawable.GradientDrawable UiDesigner = new android.graphics.drawable.GradientDrawable();
						int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
						int clrs [] = {Color.parseColor("#FFE7E7E7"),Color.parseColor("#FFE7E7E7")};
						UiDesigner= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, clrs);
						UiDesigner.setCornerRadii(new float[]{
								d*433,d*433,d*433 ,d*433,d*433,d*433 ,d*43,d*43});
						UiDesigner.setStroke(d*1,Color.parseColor("#FFFF4700"));
						back.setElevation(d*22);
						android.graphics.drawable.RippleDrawable UiDesignerPro = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#FFFFFFFF")}), UiDesigner, null);
						back.setBackground(UiDesignerPro);
						home.setBackground(UiDesignerPro);
						select.setBackground(UiDesignerPro);
						
						back.setClickable(true);
						home.setClickable(true);
						select.setClickable(true);
				}
				DisplayMetrics displayMetrics = new DisplayMetrics();
				        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
				        int height = displayMetrics.heightPixels;
				        int width = displayMetrics.widthPixels;
				
				        container.setMinimumHeight(height);
				        container.setMinimumWidth(width);
				
				
				final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getApplicationContext(), android.R.layout.simple_list_item_1, listStr)
				{ 
						@Override 
						public View getView(int _position, View convertView, ViewGroup parent){ 
								View view = super.getView(_position, convertView, parent);
								
								view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
								
								TextView tv = (TextView) view.findViewById(android.R.id.text1);
								tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
						
						if (isDark){
									 tv.setTextColor(0xFFFFFFFF); 
							
							
						} else {
							 tv.setTextColor(0xFF000000);
							
						}
						
								tv.setShadowLayer(1.5f,-2,2, 0xFFFFCCBC);
								
								if (FileUtil.isDirectory(listStr.get((int)(_position)))) {
										tv.setText("📂 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
								}
								else {
										if (FileUtil.isFile(listStr.get((int)(_position)))) {
												tv.setText("📄 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
										}
								}
								
								return view; 
						} 
				}; 
				List.setAdapter(arrayAdapter);
				((BaseAdapter)List.getAdapter()).notifyDataSetChanged();
				
				back.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View _view) {
								if (!(path.equals("/storage/emulated/0") || path.equals("/sdcard"))) {
										String UpFolder = path.substring((int)(0), (int)(path.lastIndexOf("/")));
											path = UpFolder;
										
										edit.setText("");
										
										open(listStr, path);
										final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getApplicationContext(), android.R.layout.simple_list_item_1, listStr)
										{ 
												@Override 
												public View getView(int _position, View convertView, ViewGroup parent){ 
														View view = super.getView(_position, convertView, parent);
														
														view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
														
														TextView tv = (TextView) view.findViewById(android.R.id.text1);
														tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
														 if (isDark){
												 tv.setTextColor(0xFFFFFFFF); 
										
										
									} else {
										 tv.setTextColor(0xFF000000);
										
									}
														tv.setShadowLayer(1.5f,-2,2, 0xFFD7CCC8);
														
														if (FileUtil.isDirectory(listStr.get((int)(_position)))) {
																tv.setText("📂 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
														}
														else {
																if (FileUtil.isFile(listStr.get((int)(_position)))) {
																		tv.setText("📄 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
																}
														}
														
														return view; 
												} 
										}; 
										List.setAdapter(arrayAdapter);
										((BaseAdapter)List.getAdapter()).notifyDataSetChanged();
										
								}
						}
				});
				home.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View _view) {
								path = "/storage/emulated/0/";
								edit.setText("");
								
								open(listStr, path);
								final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getApplicationContext(), android.R.layout.simple_list_item_1, listStr)
								{ 
										@Override 
										public View getView(int _position, View convertView, ViewGroup parent){ 
												View view = super.getView(_position, convertView, parent);
												
												view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
												
												TextView tv = (TextView) view.findViewById(android.R.id.text1);
												tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
												 if (isDark){
											 tv.setTextColor(0xFFFFFFFF); 
									
									
								} else {
									 tv.setTextColor(0xFF000000);
									
								}
												tv.setShadowLayer(1.5f,-2,2, 0xFFD7CCC8);
												
												if (FileUtil.isDirectory(listStr.get((int)(_position)))) {
														tv.setText("📂 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
												}
												else {
														if (FileUtil.isFile(listStr.get((int)(_position)))) {
																tv.setText("📄 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
														}
												}
												
												return view; 
										} 
								}; 
								List.setAdapter(arrayAdapter);
								((BaseAdapter)List.getAdapter()).notifyDataSetChanged();
								
						}
				});
				select.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View _view) {
								
						
						
						chosenBlockorPalette.add(map);
						FileUtil.writeFile(selectedFile.concat("/".concat(chosenBlockorPalette.get((int)0).get("name").toString().concat(".json"))), new Gson().toJson(chosenBlockorPalette));
						SketchwareUtil.showMessage(getApplicationContext(), selectedFile.concat("/".concat(chosenBlockorPalette.get((int)0).get("name").toString().concat(".json"))));
						alertoo.dismiss();
						}
				});
				List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
											@Override
											public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
									
								
												
								java.io.File check = new java.io.File(listStr.get(position));
								
								if (check.isDirectory()){
										
										path = listStr.get(position);
										
										selectedFile = listStr.get(position);
										
										open(listStr, path);
										
										
										final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getApplicationContext(), android.R.layout.simple_list_item_1, listStr)
										{ 
												@Override 
												public View getView(int _position, View convertView, ViewGroup parent){ 
														View view = super.getView(_position, convertView, parent);
														
														view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
														
														TextView tv = (TextView) view.findViewById(android.R.id.text1);
														tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
														 if (isDark){
												 tv.setTextColor(0xFFFFFFFF); 
										
										
									} else {
										 tv.setTextColor(0xFF000000);
										
									}
														tv.setShadowLayer(1.5f,-2,2, 0xFFD7CCC8);
														
														if (FileUtil.isDirectory(listStr.get((int)(_position)))) {
																tv.setText("📂 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
														}
														else {
																if (FileUtil.isFile(listStr.get((int)(_position)))) {
																		tv.setText("📄 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
																}
														}
														
														return view; 
												} 
										}; 
										List.setAdapter(arrayAdapter);
										((BaseAdapter)List.getAdapter()).notifyDataSetChanged();
										
								} else {
										
										
										
										
										
										edit.setText("selected folder : "+selectedFile);
										
										
										
								}
								
								        
											}
								});
				
				header.addView(edit);
				container.addView(header);
				container.addView(List);
				options.addView(back);
				options.addView(home);
				options.addView(select);
				container.addView(options);
				
				alertoo.setView(container);
				
				alertoo.show();
				
				
				
			}
		}
		else {
			if (_which.equals("p")) {
				if (!(chosenPletteteListMap.size() == 0)) {
					isDark = true;
					if (isDark) {
						build = new AlertDialog.Builder(BlocksmanagerActivity.this, AlertDialog.THEME_DEVICE_DEFAULT_DARK);
					} else {
						build = new AlertDialog.Builder(BlocksmanagerActivity.this);
					}
					
					build.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
									
											
								}
					});
					
					build.setCancelable(false);
					
					alertoo = build.create();
					
					final ArrayList<String> listStr = new ArrayList<String>();
					
					path = "/storage/emulated/0/";
					
					final LinearLayout container = new LinearLayout(getApplicationContext());
					container.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
					container.setOrientation(LinearLayout.VERTICAL);
					container.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
					
					final LinearLayout header = new LinearLayout(getApplicationContext());
					header.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
					header.setOrientation(LinearLayout.VERTICAL);
					header.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
					header.setPadding(5,5,5,5);
					
					
					final TextView edit = new TextView(getApplicationContext());
					edit.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
					
					edit.setTextSize(14);
					edit.setTextIsSelectable(true);
					edit.setText("");
					if (isDark){
							edit.setTextColor(0xFFFFFFFF);
					} else {
							edit.setTextColor(0xFF000000);
					}
					
					final ListView List = new ListView(getApplicationContext());
					List.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
					
					
					final LinearLayout options = new LinearLayout(getApplicationContext());
					options.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
					options.setOrientation(LinearLayout.HORIZONTAL);
					options.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
					
					
					final Button back = new Button(getApplicationContext());
					back.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
					
					back.setText("⤎");
					back.setTextSize(20);
					
					final Button home = new Button(getApplicationContext());
					home.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
					
					home.setText("⌂");
					home.setTextSize(20);
					
					final Button select = new Button(getApplicationContext());
					select.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
					
					select.setText("✔️");
					select.setTextSize(20);
					
					
					open(listStr, path);
					
					
					{
							android.graphics.drawable.GradientDrawable UiDesigner = new android.graphics.drawable.GradientDrawable();
							int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
							int clrs [] = {Color.parseColor("#FFE7E7E7"),Color.parseColor("#FFE7E7E7")};
							UiDesigner= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, clrs);
							UiDesigner.setCornerRadii(new float[]{
									d*433,d*433,d*433 ,d*433,d*433,d*433 ,d*43,d*43});
							UiDesigner.setStroke(d*1,Color.parseColor("#FFFF4700"));
							back.setElevation(d*22);
							android.graphics.drawable.RippleDrawable UiDesignerPro = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#FFFFFFFF")}), UiDesigner, null);
							back.setBackground(UiDesignerPro);
							home.setBackground(UiDesignerPro);
							select.setBackground(UiDesignerPro);
							
							back.setClickable(true);
							home.setClickable(true);
							select.setClickable(true);
					}
					DisplayMetrics displayMetrics = new DisplayMetrics();
					        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
					        int height = displayMetrics.heightPixels;
					        int width = displayMetrics.widthPixels;
					
					        container.setMinimumHeight(height);
					        container.setMinimumWidth(width);
					
					
					final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getApplicationContext(), android.R.layout.simple_list_item_1, listStr)
					{ 
							@Override 
							public View getView(int _position, View convertView, ViewGroup parent){ 
									View view = super.getView(_position, convertView, parent);
									
									view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
									
									TextView tv = (TextView) view.findViewById(android.R.id.text1);
									tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
							
							if (isDark){
										 tv.setTextColor(0xFFFFFFFF); 
								
								
							} else {
								 tv.setTextColor(0xFF000000);
								
							}
							
									tv.setShadowLayer(1.5f,-2,2, 0xFFFFCCBC);
									
									if (FileUtil.isDirectory(listStr.get((int)(_position)))) {
											tv.setText("📂 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
									}
									else {
											if (FileUtil.isFile(listStr.get((int)(_position)))) {
													tv.setText("📄 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
											}
									}
									
									return view; 
							} 
					}; 
					List.setAdapter(arrayAdapter);
					((BaseAdapter)List.getAdapter()).notifyDataSetChanged();
					
					back.setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View _view) {
									if (!(path.equals("/storage/emulated/0") || path.equals("/sdcard"))) {
											String UpFolder = path.substring((int)(0), (int)(path.lastIndexOf("/")));
												path = UpFolder;
											
											edit.setText("");
											
											open(listStr, path);
											final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getApplicationContext(), android.R.layout.simple_list_item_1, listStr)
											{ 
													@Override 
													public View getView(int _position, View convertView, ViewGroup parent){ 
															View view = super.getView(_position, convertView, parent);
															
															view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
															
															TextView tv = (TextView) view.findViewById(android.R.id.text1);
															tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
															 if (isDark){
													 tv.setTextColor(0xFFFFFFFF); 
											
											
										} else {
											 tv.setTextColor(0xFF000000);
											
										}
															tv.setShadowLayer(1.5f,-2,2, 0xFFD7CCC8);
															
															if (FileUtil.isDirectory(listStr.get((int)(_position)))) {
																	tv.setText("📂 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
															}
															else {
																	if (FileUtil.isFile(listStr.get((int)(_position)))) {
																			tv.setText("📄 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
																	}
															}
															
															return view; 
													} 
											}; 
											List.setAdapter(arrayAdapter);
											((BaseAdapter)List.getAdapter()).notifyDataSetChanged();
											
									}
							}
					});
					home.setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View _view) {
									path = "/storage/emulated/0/";
									edit.setText("");
									
									open(listStr, path);
									final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getApplicationContext(), android.R.layout.simple_list_item_1, listStr)
									{ 
											@Override 
											public View getView(int _position, View convertView, ViewGroup parent){ 
													View view = super.getView(_position, convertView, parent);
													
													view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
													
													TextView tv = (TextView) view.findViewById(android.R.id.text1);
													tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
													 if (isDark){
												 tv.setTextColor(0xFFFFFFFF); 
										
										
									} else {
										 tv.setTextColor(0xFF000000);
										
									}
													tv.setShadowLayer(1.5f,-2,2, 0xFFD7CCC8);
													
													if (FileUtil.isDirectory(listStr.get((int)(_position)))) {
															tv.setText("📂 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
													}
													else {
															if (FileUtil.isFile(listStr.get((int)(_position)))) {
																	tv.setText("📄 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
															}
													}
													
													return view; 
											} 
									}; 
									List.setAdapter(arrayAdapter);
									((BaseAdapter)List.getAdapter()).notifyDataSetChanged();
									
							}
					});
					select.setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View _view) {
									
							
							
							try { 
								FileUtil.writeFile(selectedFile.concat("/".concat(palettesListMap.get((int)Double.parseDouble(sp.getString("posNumber", ""))).get("name").toString().concat(".json"))), new Gson().toJson(chosenPletteteListMap));
								SketchwareUtil.showMessage(getApplicationContext(), selectedFile.concat("/".concat(palettesListMap.get((int)Double.parseDouble(sp.getString("posNumber", ""))).get("name").toString())));
							} catch (Exception e){
								FileUtil.writeFile(selectedFile.concat("/".concat("palette.json")), new Gson().toJson(chosenPletteteListMap));
								SketchwareUtil.showMessage(getApplicationContext(), selectedFile.concat("/".concat("palette.json")));
							}
							alertoo.dismiss();
							}
					});
					List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
												@Override
												public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
										
									
													
									java.io.File check = new java.io.File(listStr.get(position));
									
									if (check.isDirectory()){
											
											path = listStr.get(position);
											
											selectedFile = listStr.get(position);
											
											open(listStr, path);
											
											
											final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getApplicationContext(), android.R.layout.simple_list_item_1, listStr)
											{ 
													@Override 
													public View getView(int _position, View convertView, ViewGroup parent){ 
															View view = super.getView(_position, convertView, parent);
															
															view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
															
															TextView tv = (TextView) view.findViewById(android.R.id.text1);
															tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
															 if (isDark){
													 tv.setTextColor(0xFFFFFFFF); 
											
											
										} else {
											 tv.setTextColor(0xFF000000);
											
										}
															tv.setShadowLayer(1.5f,-2,2, 0xFFD7CCC8);
															
															if (FileUtil.isDirectory(listStr.get((int)(_position)))) {
																	tv.setText("📂 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
															}
															else {
																	if (FileUtil.isFile(listStr.get((int)(_position)))) {
																			tv.setText("📄 ".concat(Uri.parse(listStr.get((int)(_position))).getLastPathSegment()));
																	}
															}
															
															return view; 
													} 
											}; 
											List.setAdapter(arrayAdapter);
											((BaseAdapter)List.getAdapter()).notifyDataSetChanged();
											
									} else {
											
											
											
											
											
											edit.setText("selected folder : "+selectedFile);
											
											
											
									}
									
									        
												}
									});
					
					header.addView(edit);
					container.addView(header);
					container.addView(List);
					options.addView(back);
					options.addView(home);
					options.addView(select);
					container.addView(options);
					
					alertoo.setView(container);
					
					alertoo.show();
					
					
					
				}
			}
		}
	}
	
	
	public void _ActionDelete(final String _which) {
		if (_which.equals("b")) {
			dialog.setTitle("Delete Block ");
			dialog.setMessage("are you sure you want delete the block ?");
			dialog.setIcon(R.drawable.delete);
			dialog.setPositiveButton("Delete", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					{
						int index = blocksList.getFirstVisiblePosition();
						int top = (blocksList.getChildAt(0) == null) ? 0 : (blocksList.getChildAt(0).getTop() - blocksList.getPaddingTop());
						
						if (allBlocks) {
							if (searchEdit.getText().toString().isEmpty()) {
								ExactPos = dragedPos;
							}
							else {
								ExactPos = searchAllNumberList.get((int)(dragedPos)).doubleValue();
							}
							blocksListMap.remove((int)(ExactPos));
							FileUtil.writeFile(blocksPath, new Gson().toJson(blocksListMap));
							_loadRefreshBlocks();
						}
						else {
							if (searchEdit.getText().toString().isEmpty()) {
								ExactPos = positionsB.get((int)(dragedPos)).doubleValue();
							}
							else {
								ExactPos = SearchChosenNumberList.get((int)(dragedPos)).doubleValue();
							}
							blocksListMap.remove((int)(ExactPos));
							FileUtil.writeFile(blocksPath, new Gson().toJson(blocksListMap));
							_loadSpecificPletteblocks(Double.parseDouble(sp.getString("posNumber", "")));
						}
						
						
						blocksList.setSelectionFromTop((int)index, (int)top);
					}
				}
			});
			dialog.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					
				}
			});
			dialog.create().show();
		}
		else {
			if (_which.equals("p")) {
				dialog.setTitle("Delete Palette");
				dialog.setMessage("are you sure you want delete the palette ?");
				dialog.setIcon(R.drawable.delete);
				dialog.setPositiveButton("Delete", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						{
							int index = palettesList.getFirstVisiblePosition();
							int top = (palettesList.getChildAt(0) == null) ? 0 : (palettesList.getChildAt(0).getTop() - palettesList.getPaddingTop());
							
							_deletePalette();
							
							
							palettesList.setSelectionFromTop((int)index, (int)top);
						}
					}
				});
				dialog.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
			}
		}
	}
	
	
	public void _ActionDuplicate(final String _which) {
		if (_which.equals("b")) {
			if (allBlocks) {
				if (searchEdit.getText().toString().isEmpty()) {
					ExactPos = dragedPos;
				}
				else {
					ExactPos = searchAllNumberList.get((int)(dragedPos)).doubleValue();
				}
				{
					int index = blocksList.getFirstVisiblePosition();
					int top = (blocksList.getChildAt(0) == null) ? 0 : (blocksList.getChildAt(0).getTop() - blocksList.getPaddingTop());
					
					HashMap<String, Object> block = new HashMap<>(blocksListMap.get((int)ExactPos));
					        Object blockName = block.get("name");
					
					        if (blockName instanceof String) {
						            
						                block.put("name", blockName + "_" + SketchwareUtil.getRandom(6, 99));
						            
						        }
					        blocksListMap.add((int)ExactPos + 1, block);
					  
					FileUtil.writeFile(blocksPath, new Gson().toJson(blocksListMap));
					_loadRefreshBlocks();
					
					
					blocksList.setSelectionFromTop((int)index, (int)top);
				}
			}
			else {
				if (searchEdit.getText().toString().isEmpty()) {
					ExactPos = positionsB.get((int)(dragedPos)).doubleValue();
				}
				else {
					ExactPos = SearchChosenNumberList.get((int)(dragedPos)).doubleValue();
				}
				{
					int index = blocksList.getFirstVisiblePosition();
					int top = (blocksList.getChildAt(0) == null) ? 0 : (blocksList.getChildAt(0).getTop() - blocksList.getPaddingTop());
					
					HashMap<String, Object> block = new HashMap<>(blocksListMap.get((int)ExactPos));
					        Object blockName = block.get("name");
					
					        if (blockName instanceof String) {
						            
						                block.put("name", blockName + "_" + SketchwareUtil.getRandom(6, 99));
						            
						        }
					        blocksListMap.add((int)ExactPos + 1, block);
					  
					FileUtil.writeFile(blocksPath, new Gson().toJson(blocksListMap));
					_loadSpecificPletteblocks(Double.parseDouble(sp.getString("posNumber", "")));
					
					
					blocksList.setSelectionFromTop((int)index, (int)top);
				}
			}
		}
		else {
			if (_which.equals("p")) {
				SketchwareUtil.showMessage(getApplicationContext(), "soon");
			}
		}
	}
	
	
	public void _adMob() {
		
	}
	
	
	public void _showProjectsSelected(final String _selected) {
		_Load_Projects();
		final AlertDialog.Builder build = new AlertDialog.Builder(BlocksmanagerActivity.this, AlertDialog.THEME_HOLO_LIGHT); 
		
		        build.setCancelable(false);
		        build.setTitle("select project"); 
			
		build.setPositiveButton("❌", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
				
				
						
				}
		});
			final AlertDialog alt = build.create();
			
		        final LinearLayout main_layout = new LinearLayout(BlocksmanagerActivity.this); 
				
		        main_layout.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.MATCH_PARENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT));
				main_layout.setOrientation(LinearLayout.HORIZONTAL);
		
		        final ListView listview = new ListView(BlocksmanagerActivity.this); 
				
		        listview.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.MATCH_PARENT, android.widget.LinearLayout.LayoutParams.MATCH_PARENT));
				
				listview.setAdapter(new listviewAdapter(temp_listmap1));
		((BaseAdapter)listview.getAdapter()).notifyDataSetChanged();
		
		listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
						@Override
						public void onItemClick(AdapterView<?> _param1, View _param2, int _param30, long _param4) {
								final int _pos = _param30;
								custom_block_path = "/storage/emulated/0/.sketchware/data/".concat(temp_listmap1.get((int)_pos).get("sc_id").toString().concat("/custom_blocks"));
				if (FileUtil.isExistFile(custom_block_path) && !(FileUtil.readFile(custom_block_path).equals("") || FileUtil.readFile(custom_block_path).equals("[]"))) {
					listMapAddBlocks.clear();
					tempListMap.clear();
					currentPos = Double.parseDouble(sp.getString("posNumber", "")) + 9;
					
					listMapAddBlocks = new Gson().fromJson(FileUtil.readFile(custom_block_path), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
					{
							final AlertDialog.Builder builder = new AlertDialog.Builder(BlocksmanagerActivity.this);
							
							build.setCancelable(false);
							
							builder.setTitle("select...");
							
							builder.setPositiveButton("✔️", new DialogInterface.OnClickListener() {
											@Override
											public void onClick(DialogInterface _dialog, int _which) {
													
													
															
											}
							});
							
							builder.setNegativeButton("❌", new DialogInterface.OnClickListener() {
											@Override
											public void onClick(DialogInterface _dialog, int _which) {
													
													
															
											}
							});
							
							builder.setNeutralButton("All", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
								
								
								if (listMapAddBlocks.size()==0) {
													
											} else {
															
									 String plt = String.valueOf(currentPos);
									
									if (plt.contains(".")) {
										
										plt = String.valueOf((int)currentPos).split("\\.")[0];
										
									} 
									
									
														     
													FileUtil.writeFile(blocksPath, new Gson().toJson(blocksListMap));
													_loadSpecificPletteblocks(Double.parseDouble(sp.getString("posNumber", "")));
													
													_dialog.dismiss();
									         alt.dismiss();
													tempListMap.clear();
											}	
								
								
								}
						});
							
							final LinearLayout lin = new LinearLayout(getApplicationContext());
							
							lin.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
							
							lin.setOrientation(LinearLayout.VERTICAL);
							
							lin.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
							
							for(int i = 0; i < listMapAddBlocks.size() ; i++) {
										
										final CheckBox check = new CheckBox(getApplicationContext());
										
										check.setTextSize(16);
										
										
										check.setText(listMapAddBlocks.get(i).get("name").toString());
										
										check.setTag(String.valueOf(i));
										
										
										
										
										check.setPadding(20,4,5,4);
										lin.setPadding(20,5,5,5);
										ObjectAnimator a = ObjectAnimator.ofInt(check, "textColor", 0xFFE53935, 0xFFBF360C, 0xFF303F9F); a.setInterpolator(new LinearInterpolator()); a.setDuration(2000); a.setRepeatCount(ValueAnimator.INFINITE); a.setRepeatMode(ValueAnimator.REVERSE); a.setEvaluator(new ArgbEvaluator()); AnimatorSet t = new AnimatorSet(); t.play(a); t.start();
										check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
													    
													       @Override
													       public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
																
																HashMap<String, Object> hash = new HashMap<>();  
																  
																if (isChecked) {
																			
																			hash = listMapAddBlocks.get((int)Double.parseDouble(check.getTag().toString()));
																			
																			tempListMap.add(hash);
																			
																}  else {
																			
																			for(int i = 0; i < tempListMap.size() ; i++) {
																						
																						if (tempListMap.get(i).get("name").toString().equals(check.getText().toString())) {
																									
																									tempListMap.remove(i);
																									
																						}
																			}
																			
																			
																}
																
																
																
																            
																              }
													          });
										lin.addView(check);
							}
							final ScrollView sc = new ScrollView(getApplicationContext());
							sc.addView(lin);
							builder.setView(sc);
							
							final AlertDialog alerto = builder.create();
							alerto.show();
							
							alerto.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener()
							 { 
											 @Override
											 public void onClick(View v)
											 {
															 Boolean wantToCloseDialog = false;
													
												 String plt = String.valueOf(currentPos);
								
								if (plt.contains(".")){
									
									plt = String.valueOf((int)currentPos).split("\\.")[0];
									
								} 
													
													if (tempListMap.size()==0) {
													
											} else {
															 for (int i=0; i < (int)tempListMap.size(); i++)  { 
															
															HashMap<String, Object> map = tempListMap.get(i);
															 
															                        
															                        
															                       
															
														
										    
										map.remove("paletteColor");
										map.put("palette", plt);
										map.put("color", sp.getString("colorPalette", ""));
										if (!map.get("spec2").toString().equals("")) {
											map.put("type", "e");
										}
										else {
											map.put("type", " ");
										}
										map.put("typeName", "");
										blocksListMap.add(map);
									}
													FileUtil.writeFile(blocksPath, new Gson().toJson(blocksListMap));
													_loadSpecificPletteblocks(Double.parseDouble(sp.getString("posNumber", "")));
													
													alerto.dismiss();
													tempListMap.clear();
											}		
																
															 if(wantToCloseDialog) {
																			 }
															 }
											 });
					}
					
				}
				else {
					
				}
						}
				});
		main_layout.addView(listview);
		alt.setView(main_layout);
		alt.show();
	}
	 public class listviewAdapter extends BaseAdapter {
		  ArrayList<HashMap<String, Object>> _data;
		  public listviewAdapter(ArrayList<HashMap<String, Object>> _arr) {
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
		  public View getView(final int _pos, View _v, ViewGroup _container) {
			   LayoutInflater _inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			   View _view = _v;
			   if (_view == null) {
				    _view = _inflater.inflate(R.layout.projects, null);
				   }
			   
			   final TextView name = (TextView) _view.findViewById(R.id.name);
			final TextView number = (TextView) _view.findViewById(R.id.number);
			final ImageView icon = (ImageView) _view.findViewById(R.id.icon);
			if (temp_listmap1.get((int)_pos).get("custom_icon").toString().equals("true") && FileUtil.isExistFile("/storage/emulated/0/.sketchware/resources/icons/".concat(temp_listmap1.get((int)_pos).get("sc_id").toString().concat("/icon.png")))) {
				icon.setImageBitmap(FileUtil.decodeSampleBitmapFromPath("/storage/emulated/0/.sketchware/resources/icons/".concat(temp_listmap1.get((int)_pos).get("sc_id").toString().concat("/icon.png")), 1024, 1024));
			}
			else {
				icon.setImageResource(R.drawable.android);
			}
			name.setText(temp_listmap1.get((int)_pos).get("my_app_name").toString());
			number.setText(temp_listmap1.get((int)_pos).get("sc_id").toString());
			   return _view;
			  }
		 }
	 
	 {
	}
	
	
	public void _Load_Projects() {
		temp_str1.clear();
		temp_listmap1.clear();
		temp_map1.clear();
		FileUtil.listDir(FileUtil.getExternalStorageDir().concat("/.sketchware/mysc/list/"), temp_str1);
		Collections.sort(temp_str1, String.CASE_INSENSITIVE_ORDER);
		number = 0;
		for(int _repeat18 = 0; _repeat18 < (int)(temp_str1.size()); _repeat18++) {
			if (FileUtil.isExistFile(FileUtil.getExternalStorageDir().concat("/.sketchware/mysc/list/".concat(Uri.parse(temp_str1.get((int)(number))).getLastPathSegment().concat("/project"))))) {
				try {
					javax.crypto.Cipher instance = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
					byte[] bytes = "sketchwaresecure".getBytes();
					instance.init(2, new javax.crypto.spec.SecretKeySpec(bytes, "AES"), new javax.crypto.spec.IvParameterSpec(bytes));
					java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(FileUtil.getExternalStorageDir().concat("/.sketchware/mysc/list/".concat(Uri.parse(temp_str1.get((int)(number))).getLastPathSegment().concat("/project"))), "r");
					byte[] bArr = new byte[((int) randomAccessFile.length())];
					randomAccessFile.readFully(bArr);
					temp_decrypted = new String(instance.doFinal(bArr));
					temp_map1 = new HashMap<>();
					temp_map1 = new Gson().fromJson(temp_decrypted, new TypeToken<HashMap<String, Object>>(){}.getType());
					temp_listmap1.add(temp_map1);
					FileUtil.writeFile("/sdcard/project.txt", new Gson().toJson(temp_listmap1));
				} catch(Exception e) {
					showMessage(e.toString());
				}
			}
			number++;
		}
		Collections.reverse(temp_listmap1);
	}
	
	public class PalettesListAdapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public PalettesListAdapter(ArrayList<HashMap<String, Object>> _arr) {
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
				_view = _inflater.inflate(R.layout.palettes_view, null);
			}
			
			final androidx.cardview.widget.CardView cardview1 = _view.findViewById(R.id.cardview1);
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final LinearLayout linearColor = _view.findViewById(R.id.linearColor);
			final TextView name = _view.findViewById(R.id.name);
			
			name.setText(_data.get((int)_position).get("name").toString());
			cardview1.setCardBackgroundColor(0xFF00003A);
			name.setTextColor(0xFFFFFFFF);
			if (_data.get((int)_position).containsKey("color")) {
				try { 
					linearColor.setBackgroundColor(Color.parseColor(_data.get((int)_position).get("color").toString()));
				} catch (Exception e){
					linearColor.setBackgroundColor(0xFF8D6E63);
				}
			}
			if (sp.getString("theme", "").equals("night")) {
				if (_data.get((int)_position).get("name").toString().equals(sp.getString("pos", ""))) {
					cardview1.setCardBackgroundColor(0xFF757575);
					name.setTextColor(0xFFECEFF1);
				}
				else {
					cardview1.setCardBackgroundColor(0xFF263238);
					name.setTextColor(0xFFFFFFFF);
				}
			}
			else {
				if (sp.getString("theme", "").equals("day")) {
					if (_data.get((int)_position).get("name").toString().equals(sp.getString("pos", ""))) {
						cardview1.setCardBackgroundColor(0xFF000027);
						name.setTextColor(0xFFFFFFFF);
					}
					else {
						cardview1.setCardBackgroundColor(0xFF000027);
						name.setTextColor(0xFFFFFFFF);
					}
				}
			}
			linear1.setOnLongClickListener(new View.OnLongClickListener() {
				         @Override
				         public boolean onLongClick(View v) {
					      
					String txt = "";
					linear1.setTag("palette");
					txt = v.getTag().toString();
					
					ClipData.Item item = new ClipData.Item(txt);
							ClipData dragData = new ClipData(txt, new String[]{
									ClipDescription.MIMETYPE_TEXT_PLAIN }, item);
							DragShadowBuilder myShadow = new View.DragShadowBuilder(linear1);
							if (Build.VERSION.SDK_INT >= 24){v.startDragAndDrop(dragData, myShadow, linear1, 0); } else {
									v.startDrag(dragData, myShadow, linear1, 0); }
					
					sp.edit().putString("pos", palettesListMap.get((int)_position).get("name").toString()).commit();
					sp.edit().putString("posNumber", String.valueOf((long)(_position))).commit();
					if (palettesListMap.get((int)_position).containsKey("color")) {
						sp.edit().putString("colorPalette", palettesListMap.get((int)_position).get("color").toString()).commit();
					}
					((BaseAdapter)palettesList.getAdapter()).notifyDataSetChanged();
					_loadSpecificPletteblocks(_position);
					try { 
						getSupportActionBar().setTitle("Palette :".concat(" ".concat(palettesListMap.get((int)_position).get("name").toString())));
						if (!(chosenPletteteListMap.size() == 0)) {
							getSupportActionBar().setSubtitle(String.valueOf((long)(chosenPletteteListMap.size())).concat(" / ".concat("blocks")));
						}
						paletteName = palettesListMap.get((int)_position).get("name").toString();
						paletteColor = palettesListMap.get((int)_position).get("color").toString();
					} catch (Exception e){
						e.printStackTrace();
					}
					linearToosActions.setVisibility(View.VISIBLE);
					searchEdit.setText("");
					View view = getCurrentFocus();
					if (view != null) {  
						    android.view.inputmethod.InputMethodManager imm = (android.view.inputmethod.InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
						    imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
					}
							  
					            return true;
					         }
				      });
			linear1.setOnDragListener( new OnDragListener(){
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
						
						
						               if (view.getTag().toString().equals("block")) {
							dropedToPalttePos = palettesList.getPositionForView(v);
							_transfetBlock(dropedToPalttePos);
							linearToosActions.setVisibility(View.GONE);
						}
						
						v.invalidate();
						return true;
						case DragEvent.ACTION_DRAG_ENDED:
						v.invalidate();
						if (event.getResult()) {
							linearToosActions.setVisibility(View.GONE);
						} else {
							linearToosActions.setVisibility(View.GONE);
						}
						return true;
						default:
						break;
						            }
					            return true;
					         }
				      });
			linear1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					sp.edit().putString("pos", palettesListMap.get((int)_position).get("name").toString()).commit();
					sp.edit().putString("posNumber", String.valueOf((long)(_position))).commit();
					if (palettesListMap.get((int)_position).containsKey("color")) {
						sp.edit().putString("colorPalette", palettesListMap.get((int)_position).get("color").toString()).commit();
					}
					((BaseAdapter)palettesList.getAdapter()).notifyDataSetChanged();
					_loadSpecificPletteblocks(_position);
					searchEdit.setText("");
					paletteName = "";
					paletteColor = "";
				}
			});
			/*
 
*/
			
			return _view;
		}
	}
	
	public class BlocksListAdapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public BlocksListAdapter(ArrayList<HashMap<String, Object>> _arr) {
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
				_view = _inflater.inflate(R.layout.blocks_view, null);
			}
			
			final androidx.cardview.widget.CardView cardview1 = _view.findViewById(R.id.cardview1);
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final LinearLayout linearColor = _view.findViewById(R.id.linearColor);
			final TextView name = _view.findViewById(R.id.name);
			final LinearLayout linearColor2 = _view.findViewById(R.id.linearColor2);
			
			name.setText(_data.get((int)_position).get("name").toString());
			cardview1.setCardBackgroundColor(0xFF00003A);
			cardview1.setRadius((float)20);
			cardview1.setCardElevation((float)2);
			name.setTextColor(0xFFFFFFFF);
			if (_data.get((int)_position).containsKey("color")) {
				try { 
					linearColor.setBackgroundColor(Color.parseColor(_data.get((int)_position).get("color").toString()));
				} catch (Exception e){
					linearColor.setBackgroundColor(0xFF0D47A1);
				}
			}
			linear1.setOnLongClickListener(new View.OnLongClickListener() {
				         @Override
				         public boolean onLongClick(View v) {
					      
					String txt = "";
					linear1.setTag("block");
					txt = v.getTag().toString();
					
					ClipData.Item item = new ClipData.Item(txt);
							ClipData dragData = new ClipData(txt, new String[]{
									ClipDescription.MIMETYPE_TEXT_PLAIN }, item);
							DragShadowBuilder myShadow = new View.DragShadowBuilder(linear1);
							if (Build.VERSION.SDK_INT >= 24){v.startDragAndDrop(dragData, myShadow, linear1, 0); } else {
									v.startDrag(dragData, myShadow, linear1, 0); }
					
					dragedPos = _position;
					linearToosActions.setVisibility(View.VISIBLE);
					View view = getCurrentFocus();
					if (view != null) {  
						    android.view.inputmethod.InputMethodManager imm = (android.view.inputmethod.InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
						    imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
					}
					/*
 
*/
							  
					            return true;
					         }
				      });
			linear1.setOnDragListener( new OnDragListener(){
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
						
						
						               if (view.getTag().toString().equals("block")) {
							dropedPos = blocksList.getPositionForView(v);
							try { 
								if (!allBlocks) {
									map = new HashMap<>();
									map2 = new HashMap<>();
									map = chosenPletteteListMap.get((int)dragedPos);
									chosenPletteteListMap.remove((int)(dragedPos));
									chosenPletteteListMap.add((int)dropedPos, map);
									map2 = blocksListMap.get((int)positionsB.get((int)(dragedPos)).doubleValue());
									blocksListMap.remove((int)(positionsB.get((int)(dragedPos)).doubleValue()));
									blocksListMap.add((int)positionsB.get((int)(dropedPos)).doubleValue(), map2);
									((BaseAdapter)blocksList.getAdapter()).notifyDataSetChanged();
									dragedPos = -1;
									dropedPos = -1;
									linearToosActions.setVisibility(View.GONE);
									draged = true;
									new Thread(new Runnable() {
										@Override
										public void run() {
											Looper.prepare();
											
											FileUtil.writeFile(blocksPath, new Gson().toJson(blocksListMap));
											
											
											runOnUiThread(new Runnable() {
												@Override
												public void run() {
													
													
													 
													
													Looper.loop();
												} 
												
											});
										}
									}).start();
									
									
								}
								else {
									if (allBlocks) {
										map = new HashMap<>();
										map = blocksListMap.get((int)dragedPos);
										blocksListMap.remove((int)(dragedPos));
										blocksListMap.add((int)dropedPos, map);
										dragedPos = -1;
										dropedPos = -1;
										draged = true;
										((BaseAdapter)blocksList.getAdapter()).notifyDataSetChanged();
										linearToosActions.setVisibility(View.GONE);
										new Thread(new Runnable() {
											@Override
											public void run() {
												Looper.prepare();
												
												FileUtil.writeFile(blocksPath, new Gson().toJson(blocksListMap));
												
												
												runOnUiThread(new Runnable() {
													@Override
													public void run() {
														
														
														 
														
														Looper.loop();
													} 
													
												});
											}
										}).start();
										
										
									}
								}
								paletteName = "";
								paletteColor = "";
							} catch (Exception e){
								showMessage(e.toString());
							}
						}
						
						v.invalidate();
						return true;
						case DragEvent.ACTION_DRAG_ENDED:
						v.invalidate();
						if (event.getResult()) {
							linearToosActions.setVisibility(View.GONE);
						} else {
							linearToosActions.setVisibility(View.GONE);
						}
						return true;
						default:
						break;
						            }
					            return true;
					         }
				      });
			if (!sp.getString("theme", "").equals("")) {
				if (sp.getString("theme", "").equals("night")) {
					if (_data.get((int)_position).containsKey("type")) {
						if (_data.get((int)_position).get("type").toString().equals("h")) {
							linear1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c) { this.setStroke(a, b); this.setColor(c); return this; } }.getIns((int)2, 0xFF37474F, 0xFF0097A7));
							name.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
						}
						else {
							linear1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c) { this.setStroke(a, b); this.setColor(c); return this; } }.getIns((int)2, 0xFF37474F, 0xFF263238));
							name.setGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT);
						}
					}
					else {
						
					}
					name.setTextColor(0xFFFFFFFF);
				}
				else {
					if (sp.getString("theme", "").equals("day")) {
						if (_data.get((int)_position).get("type").toString().equals("h")) {
							linear1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c) { this.setStroke(a, b); this.setColor(c); return this; } }.getIns((int)2, 0xFFE0E0E0, 0xFF80DEEA));
							name.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
						}
						else {
							linear1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c) { this.setStroke(a, b); this.setColor(c); return this; } }.getIns((int)2, 0xFFE0E0E0, 0xFFFFFFFF));
							name.setGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT);
						}
						name.setTextColor(0xFF000000);
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