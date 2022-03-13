package ir.vscodemobile.ninjacoder;

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
import java.util.HashMap;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.net.Uri;
import org.antlr.v4.runtime.*;
import com.caverock.androidsvg.*;
import com.googlecode.d2j.*;
import com.android.*;
import io.github.rosemoe.sora.*;
import com.github.angads25.filepicker.*;
import androidx.webkit.*;
import s4u.restore.swb.*;
import com.jtv7.rippleswitchlib.*;
import com.android.tools.r8.*;
import com.lwb.piechart.*;
import net.lingala.zip4j.*;
import io.github.rosemoe.sora.langs.textmate.*;
import io.github.rosemoe.sora.langs.base.*;
import com.example.myapp.*;
import com.github.underscore.lodash.*;
import javaxml.*;
import com.google.gson.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import androidx.core.content.ContextCompat;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;

public class VsmviewActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private double num = 0;
	
	private ArrayList<HashMap<String, Object>> viewmap = new ArrayList<>();
	
	private LinearLayout linear1;
	private ListView listview1;
	
	private AlertDialog.Builder alter;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.vsmview);
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
		listview1 = findViewById(R.id.listview1);
		alter = new AlertDialog.Builder(this);
		
		listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				num = _position;
				if (_ispath(viewmap.get((int)_position).get("ninja").toString())) {
					
					((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
				}
				else {
					if (viewmap.get((int)_position).get("ninja").toString().endsWith(".png")) {
						
					}
					if (viewmap.get((int)_position).get("ninja").toString().endsWith(".jpg")) {
						
					}
					if (viewmap.get((int)_position).get("ninja").toString().endsWith(".mp4")) {
						
					}
					if (viewmap.get((int)_position).get("ninja").toString().endsWith(".apk")) {
						
					}
					if (viewmap.get((int)_position).get("ninja").toString().endsWith(".xml")) {
						
					}
					if (viewmap.get((int)_position).get("ninja").toString().endsWith(".jar")) {
						
					}
				}
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				alter.setTitle("File Exsert ");
				alter.setIcon(R.drawable.variant);
				alter.setMessage("FileExset to ".concat(Uri.parse(viewmap.get((int)num).get("ninja").toString()).getLastPathSegment()));
				final EditText txt= new EditText(VsmviewActivity.this);
				LinearLayout.LayoutParams lparr = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
				///custom edit
				txt.setText("/sdcard/");
				///end
				txt.setLayoutParams(lparr);
				alter.setView(txt);
				alter.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						try {
							
												new net.lingala.zip4j.ZipFile(viewmap.get((int)num).get("ninja").toString())
														.extractAll(txt.getText().toString());
							
							
										} catch (net.lingala.zip4j.exception.ZipException e) {
												showMessage(e.toString());
										}
					}
				});
				alter.setNeutralButton("no", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				alter.create().show();
			}
		});
	}
	
	private void initializeLogic() {
		setTitle(getIntent().getStringExtra("title"));
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) { 
				   Window code = this.getWindow();
			 code.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			 code.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			
				   code.setStatusBarColor(Color.parseColor("#FF000027")); code.setNavigationBarColor(Color.parseColor("#FF000027"));
		}
		try {
			
								
			List<net.lingala.zip4j.model.FileHeader> fileHeaders2 =
										new net.lingala.zip4j.ZipFile(getIntent().getStringExtra("view")).getFileHeaders();
			
								 viewmap = new ArrayList<>();
			
								for (net.lingala.zip4j.model.FileHeader file : fileHeaders2){
										HashMap hash = new HashMap();
										hash.put("ninja", file.getFileName());
										viewmap.add(hash);
								}
			listview1.setAdapter(new Listview1Adapter(viewmap));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
			
						} catch (net.lingala.zip4j.exception.ZipException e) {
								showMessage(e.toString());
						}
		alter = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		_fab.setBackgroundTintList(android.content.res.ColorStateList.valueOf(Color.parseColor("0xFFFF8800".replace("0xFF" , "#"))));
	}
	
	public boolean _ispath(final String _dictatory) {
		if (_dictatory.endsWith("/")) {
			
			return (true);
		}
		return (false);
	}
	
	
	public void _ScrollingText(final TextView _view) {
		_view.setSingleLine(true);
		_view.setEllipsize(TextUtils.TruncateAt.MARQUEE);
		_view.setSelected(true);
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
				_view = _inflater.inflate(R.layout.vsmfileview, null);
			}
			
			final androidx.cardview.widget.CardView cardview1 = _view.findViewById(R.id.cardview1);
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			final LinearLayout linear2 = _view.findViewById(R.id.linear2);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final TextView textview2 = _view.findViewById(R.id.textview2);
			
			textview1.setText(Uri.parse(viewmap.get((int)_position).get("ninja").toString()).getLastPathSegment());
			_ScrollingText(textview1);
			cardview1.setCardBackgroundColor(0xFF00003A);
			cardview1.setRadius((float)19);
			cardview1.setCardElevation((float)0);
			if (_ispath(viewmap.get((int)_position).get("ninja").toString())) {
				imageview1.setImageResource(R.drawable.folder);
			}
			else {
				if (viewmap.get((int)_position).get("ninja").toString().endsWith(".png") && viewmap.get((int)_position).get("ninja").toString().endsWith(".jpg")) {
					imageview1.setImageResource(R.drawable.image);
					_tamal(viewmap.get((int)_position).get("ninja").toString(), textview2);
				}
				else {
					if (viewmap.get((int)_position).get("ninja").toString().endsWith(".html")) {
						imageview1.setImageResource(R.drawable.html);
						_tamal(viewmap.get((int)_position).get("ninja").toString(), textview2);
					}
					else {
						if (viewmap.get((int)_position).get("ninja").toString().endsWith(".css")) {
							imageview1.setImageResource(R.drawable.css);
							_tamal(viewmap.get((int)_position).get("ninja").toString(), textview2);
						}
						else {
							if (viewmap.get((int)_position).get("ninja").toString().endsWith(".py")) {
								imageview1.setImageResource(R.drawable.py);
								_tamal(viewmap.get((int)_position).get("ninja").toString(), textview2);
							}
							else {
								if (viewmap.get((int)_position).get("ninja").toString().endsWith(".java")) {
									imageview1.setImageResource(R.drawable.java);
									_tamal(viewmap.get((int)_position).get("ninja").toString(), textview2);
								}
								else {
									if (viewmap.get((int)_position).get("ninja").toString().endsWith(".js")) {
										imageview1.setImageResource(R.drawable.javascr);
										_tamal(viewmap.get((int)_position).get("ninja").toString(), textview2);
									}
									else {
										if (viewmap.get((int)_position).get("ninja").toString().endsWith(".c")) {
											imageview1.setImageResource(R.drawable.lc);
											_tamal(viewmap.get((int)_position).get("ninja").toString(), textview2);
										}
										else {
											if (viewmap.get((int)_position).get("ninja").toString().endsWith(".cpp")) {
												imageview1.setImageResource(R.drawable.cpp);
												_tamal(viewmap.get((int)_position).get("ninja").toString(), textview2);
											}
											else {
												if (viewmap.get((int)_position).get("ninja").toString().endsWith(".sh")) {
													imageview1.setImageResource(R.drawable.shell);
													_tamal(viewmap.get((int)_position).get("ninja").toString(), textview2);
												}
												else {
													if (viewmap.get((int)_position).get("ninja").toString().endsWith(".json")) {
														imageview1.setImageResource(R.drawable.json);
														_tamal(viewmap.get((int)_position).get("ninja").toString(), textview2);
													}
													else {
														if (viewmap.get((int)_position).get("ninja").toString().endsWith(".mp3")) {
															imageview1.setImageResource(R.drawable.play);
															_tamal(viewmap.get((int)_position).get("ninja").toString(), textview2);
														}
														else {
															if (viewmap.get((int)_position).get("ninja").toString().endsWith(".mp4")) {
																imageview1.setImageResource(R.drawable.play);
																_tamal(viewmap.get((int)_position).get("ninja").toString(), textview2);
															}
															else {
																if (viewmap.get((int)_position).get("ninja").toString().endsWith(".gradle")) {
																	imageview1.setImageResource(R.drawable.gra);
																	_tamal(viewmap.get((int)_position).get("ninja").toString(), textview2);
																}
																else {
																	if (viewmap.get((int)_position).get("ninja").toString().endsWith(".ttf")) {
																		imageview1.setImageResource(R.drawable.font);
																		_tamal(viewmap.get((int)_position).get("ninja").toString(), textview2);
																	}
																	else {
																		if (viewmap.get((int)_position).get("ninja").toString().endsWith(".dex")) {
																			imageview1.setImageResource(R.drawable.dex);
																			_tamal(viewmap.get((int)_position).get("ninja").toString(), textview2);
																		}
																		else {
																			if (viewmap.get((int)_position).get("ninja").toString().endsWith(".jar")) {
																				imageview1.setImageResource(R.drawable.jar);
																				_tamal(viewmap.get((int)_position).get("ninja").toString(), textview2);
																			}
																			else {
																				if (viewmap.get((int)_position).get("ninja").toString().endsWith(".apk")) {
																					_tamal(viewmap.get((int)_position).get("ninja").toString(), textview2);
																					imageview1.setImageResource(R.drawable.skproject);
																				}
																				else {
																					imageview1.setImageResource(R.drawable.file);
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