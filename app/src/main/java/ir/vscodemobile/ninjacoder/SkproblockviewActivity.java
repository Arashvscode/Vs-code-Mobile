package ir.vscodemobile.ninjacoder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
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
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.Intent;
import android.net.Uri;
import android.widget.AdapterView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import android.graphics.Typeface;
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

public class SkproblockviewActivity extends AppCompatActivity {
	
	private String blockpath = "";
	private String paletpath = "";
	private double block = 0;
	private String object_clicked = "";
	
	private ArrayList<HashMap<String, Object>> skproblock = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> skpropallet = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> temp = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> blocklist = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear3;
	private LinearLayout linear2;
	private ListView bockview;
	private ListView pal;
	
	private SharedPreferences BlockData;
	private Intent p = new Intent();
	private Intent t = new Intent();
	private SharedPreferences sp;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.skproblockview);
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
		linear1 = findViewById(R.id.linear1);
		linear3 = findViewById(R.id.linear3);
		linear2 = findViewById(R.id.linear2);
		bockview = findViewById(R.id.bockview);
		pal = findViewById(R.id.pal);
		BlockData = getSharedPreferences("data", Activity.MODE_PRIVATE);
		sp = getSharedPreferences("block", Activity.MODE_PRIVATE);
		
		bockview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				BlockData.edit().putString("color", skpropallet.get((int)_position).get("color").toString()).commit();
				BlockData.edit().putString("position", String.valueOf((long)(_position + 9))).commit();
				block = 0;
				temp.clear();
				for(int _repeat19 = 0; _repeat19 < (int)(blocklist.size()); _repeat19++) {
					if (blocklist.get((int)block).get("palette").toString().equals(String.valueOf((long)(_position + 9)))) {
						temp.add(blocklist.get((int)(block)));
					}
					block++;
				}
				new AsyncTask<String, String, String>() {
					@Override
					protected void onPreExecute() {
						super.onPreExecute();
					}
					@Override
					protected String doInBackground(String... arg0) {
						return null;
					}
					@Override
					protected void onPostExecute(String result) {
						super.onPostExecute(result);
						if (FileUtil.readFile(blockpath).length() == 0) {
							FileUtil.deleteFile(blockpath);
							FileUtil.writeFile(blockpath, "[]");
						}
						else {
							if (blocklist.size() == 0) {
								
							}
							else {
								pal.setAdapter(new PalAdapter(temp));
								((BaseAdapter)pal.getAdapter()).notifyDataSetChanged();
							}
						}
					} 
				}.execute();
			}
		});
		
		pal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				
			}
		});
		
		pal.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
			@Override
			public boolean onItemLongClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				
				return true;
			}
		});
	}
	
	private void initializeLogic() {
		blockpath = FileUtil.getExternalStorageDir().concat("/.sketchware/resources/block/My Block/block.json");
		paletpath = FileUtil.getExternalStorageDir().concat("/.sketchware/resources/block/My Block/palette.json");
		if (FileUtil.readFile(blockpath).length() == 0) {
			FileUtil.deleteFile(blockpath);
			FileUtil.writeFile(blockpath, "[]");
		}
		else {
			if (FileUtil.readFile(paletpath).length() == 0) {
				FileUtil.deleteFile(paletpath);
				FileUtil.writeFile(paletpath, "[]");
			}
			else {
				
			}
		}
		try {
			blocklist = new Gson().fromJson(FileUtil.readFile(blockpath), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			skpropallet = new Gson().fromJson(FileUtil.readFile(paletpath), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			bockview.setAdapter(new BockviewAdapter(skpropallet));
			((BaseAdapter)bockview.getAdapter()).notifyDataSetChanged();
		} catch (Exception e) {
			 
		}
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) { 
				   Window code = this.getWindow();
			 code.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			 code.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			
				   code.setStatusBarColor(Color.parseColor("#FF000027")); code.setNavigationBarColor(Color.parseColor("#FF000027"));
		}
	}
	
	public void _SketchwareBlocks(final View _view, final String _type, final String _color) {
		if (_type.equals(" ")) {
				final String packName = "com.sketchware.remod";
				String mDrawableName = "2131166371";
				    try {
							        PackageManager manager = getPackageManager();
							        Resources mApk1Resources = manager.getResourcesForApplication(packName);
							        int mDrawableResID = mApk1Resources.getIdentifier(mDrawableName, "drawable",packName);
							        Drawable myDrawable = mApk1Resources.getDrawable(mDrawableResID);
						myDrawable.mutate().setColorFilter(Color.parseColor(_color), PorterDuff.Mode.SRC_IN);
							        if( myDrawable != null )
						_view.setBackgroundDrawable(myDrawable);
							    }
				    catch (Exception e) {
							    }
		}
		else {
				if (_type.equals("c")) {
						final String packName = "com.sketchware.remod";
						String mDrawableName = "2131166374";
						    try {
									        PackageManager manager = getPackageManager();
									        Resources mApk1Resources = manager.getResourcesForApplication(packName);
									        int mDrawableResID = mApk1Resources.getIdentifier(mDrawableName, "drawable",packName);
									        Drawable myDrawable = mApk1Resources.getDrawable(mDrawableResID);
								myDrawable.mutate().setColorFilter(Color.parseColor(_color), PorterDuff.Mode.SRC_IN);
									        if( myDrawable != null )
								_view.setBackgroundDrawable(myDrawable);
									    }
						    catch (Exception e) {
									    }
				}
				else {
						if (_type.equals("e")) {
								final String packName = "com.sketchware.remod";
								String mDrawableName = "2131166374";
								    try {
											        PackageManager manager = getPackageManager();
											        Resources mApk1Resources = manager.getResourcesForApplication(packName);
											        int mDrawableResID = mApk1Resources.getIdentifier(mDrawableName, "drawable",packName);
											        Drawable myDrawable = mApk1Resources.getDrawable(mDrawableResID);
										myDrawable.mutate().setColorFilter(Color.parseColor(_color), PorterDuff.Mode.SRC_IN);
											        if( myDrawable != null )
										_view.setBackgroundDrawable(myDrawable);
											    }
								    catch (Exception e) {
											    }
						}
						else {
								if (_type.equals("s")) {
										final String packName = "com.sketchware.remod";
										String mDrawableName = "2131166373";
										    try {
													        PackageManager manager = getPackageManager();
													        Resources mApk1Resources = manager.getResourcesForApplication(packName);
													        int mDrawableResID = mApk1Resources.getIdentifier(mDrawableName, "drawable",packName);
													        Drawable myDrawable = mApk1Resources.getDrawable(mDrawableResID);
												myDrawable.mutate().setColorFilter(Color.parseColor(_color), PorterDuff.Mode.SRC_IN);
													        if( myDrawable != null )
												_view.setBackgroundDrawable(myDrawable);
													    }
										    catch (Exception e) {
													    }
								}
								else {
										if (_type.equals("b")) {
												final String packName = "com.sketchware.remod";
												String mDrawableName = "2131166369";
												    try {
															        PackageManager manager = getPackageManager();
															        Resources mApk1Resources = manager.getResourcesForApplication(packName);
															        int mDrawableResID = mApk1Resources.getIdentifier(mDrawableName, "drawable",packName);
															        Drawable myDrawable = mApk1Resources.getDrawable(mDrawableResID);
														myDrawable.mutate().setColorFilter(Color.parseColor(_color), PorterDuff.Mode.SRC_IN);
															        if( myDrawable != null )
														_view.setBackgroundDrawable(myDrawable);
															    }
												    catch (Exception e) {
															    }
										}
										else {
												if (_type.equals("d")) {
														final String packName = "com.sketchware.remod";
														String mDrawableName = "2131166370";
														    try {
																	        PackageManager manager = getPackageManager();
																	        Resources mApk1Resources = manager.getResourcesForApplication(packName);
																	        int mDrawableResID = mApk1Resources.getIdentifier(mDrawableName, "drawable",packName);
																	        Drawable myDrawable = mApk1Resources.getDrawable(mDrawableResID);
																myDrawable.mutate().setColorFilter(Color.parseColor(_color), PorterDuff.Mode.SRC_IN);
																	        if( myDrawable != null )
																_view.setBackgroundDrawable(myDrawable);
																	    }
														    catch (Exception e) {
																	    }
												}
												else {
														if (_type.equals("v")) {
																final String packName = "com.sketchware.remod";
																String mDrawableName = "2131166373";
																    try {
																			        PackageManager manager = getPackageManager();
																			        Resources mApk1Resources = manager.getResourcesForApplication(packName);
																			        int mDrawableResID = mApk1Resources.getIdentifier(mDrawableName, "drawable",packName);
																			        Drawable myDrawable = mApk1Resources.getDrawable(mDrawableResID);
																		myDrawable.mutate().setColorFilter(Color.parseColor(_color), PorterDuff.Mode.SRC_IN);
																			        if( myDrawable != null )
																		_view.setBackgroundDrawable(myDrawable);
																			    }
																    catch (Exception e) {
																			    }
														}
														else {
																if (_type.equals("a")) {
																		final String packName = "com.sketchware.remod";
																		String mDrawableName = "2131166373";
																		    try {
																					        PackageManager manager = getPackageManager();
																					        Resources mApk1Resources = manager.getResourcesForApplication(packName);
																					        int mDrawableResID = mApk1Resources.getIdentifier(mDrawableName, "drawable",packName);
																					        Drawable myDrawable = mApk1Resources.getDrawable(mDrawableResID);
																				myDrawable.mutate().setColorFilter(Color.parseColor(_color), PorterDuff.Mode.SRC_IN);
																					        if( myDrawable != null )
																				_view.setBackgroundDrawable(myDrawable);
																					    }
																		    catch (Exception e) {
																					    }
																}
																else {
																		if (_type.equals("f")) {
																				final String packName = "com.sketchware.remod";
																				String mDrawableName = "2131166372";
																				    try {
																							        PackageManager manager = getPackageManager();
																							        Resources mApk1Resources = manager.getResourcesForApplication(packName);
																							        int mDrawableResID = mApk1Resources.getIdentifier(mDrawableName, "drawable",packName);
																							        Drawable myDrawable = mApk1Resources.getDrawable(mDrawableResID);
																						myDrawable.mutate().setColorFilter(Color.parseColor(_color), PorterDuff.Mode.SRC_IN);
																							        if( myDrawable != null )
																						_view.setBackgroundDrawable(myDrawable);
																							    }
																				    catch (Exception e) {
																							    }
																		}
																		else {
																				if (_type.equals("l")) {
																						final String packName = "com.sketchware.remod";
																						String mDrawableName = "2131166372";
																						    try {
																									        PackageManager manager = getPackageManager();
																									        Resources mApk1Resources = manager.getResourcesForApplication(packName);
																									        int mDrawableResID = mApk1Resources.getIdentifier(mDrawableName, "drawable",packName);
																									        Drawable myDrawable = mApk1Resources.getDrawable(mDrawableResID);
																								myDrawable.mutate().setColorFilter(Color.parseColor(_color), PorterDuff.Mode.SRC_IN);
																									        if( myDrawable != null )
																								_view.setBackgroundDrawable(myDrawable);
																									    }
																						    catch (Exception e) {
																									    }
																				}
																				else {
																						if (_type.equals("p")) {
																								final String packName = "com.sketchware.remod";
																								String mDrawableName = "2131166373";
																								    try {
																											        PackageManager manager = getPackageManager();
																											        Resources mApk1Resources = manager.getResourcesForApplication(packName);
																											        int mDrawableResID = mApk1Resources.getIdentifier(mDrawableName, "drawable",packName);
																											        Drawable myDrawable = mApk1Resources.getDrawable(mDrawableResID);
																										myDrawable.mutate().setColorFilter(Color.parseColor(_color), PorterDuff.Mode.SRC_IN);
																											        if( myDrawable != null )
																										_view.setBackgroundDrawable(myDrawable);
																											    }
																								    catch (Exception e) {
																											    }
																						}
																						else {
																								if (_type.equals("h")) {
																										final String packName = "com.sketchware.remod";
																										String mDrawableName = "2131166373";
																										    try {
																													        PackageManager manager = getPackageManager();
																													        Resources mApk1Resources = manager.getResourcesForApplication(packName);
																													        int mDrawableResID = mApk1Resources.getIdentifier(mDrawableName, "drawable",packName);
																													        Drawable myDrawable = mApk1Resources.getDrawable(mDrawableResID);
																												myDrawable.mutate().setColorFilter(Color.parseColor(_color), PorterDuff.Mode.SRC_IN);
																													        if( myDrawable != null )
																												_view.setBackgroundDrawable(myDrawable);
																													    }
																										    catch (Exception e) {
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
	
	
	public void _textview_mh(final TextView _txt, final String _value) {
		_txt.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
		_txt.setTextIsSelectable(false);
		updateSpan(_value, _txt);
	}
	private void updateSpan(String str, TextView _txt){
		SpannableString ssb = new SpannableString(str);
		java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("(?<![^\\s])(([@]{1}|[%]{1})([A-Za-z0-9_-]\\.?)+)(?![^\\s,])");
		    java.util.regex.Matcher matcher = pattern.matcher(str);
		while(matcher.find()){
			ProfileSpan span = new ProfileSpan();
			ssb.setSpan(span, matcher.start() , matcher. end() , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		} 
		_txt.setText(ssb);
		
	}
	private class ProfileSpan extends android.text.style.ClickableSpan{
		
		
		@Override
		public void onClick(View view){
			
			if(view instanceof TextView){
				    TextView tv = (TextView)view;
				
				    if(tv.getText() instanceof Spannable){
					        Spannable sp = (Spannable)tv.getText();
					    
					        int start = sp.getSpanStart(this);
					        int end = sp.getSpanEnd(this);
					        object_clicked = sp.subSequence(start,end).toString();
				}
			}
			
		}
		
		 
		@Override
		    public void updateDrawState(TextPaint ds) {
			        ds.setUnderlineText(false);
			        ds.setColor(Color.parseColor("#FFFFFF"));
			        ds.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.BOLD));
					
			    }
		
	}
	
	
	public void _ScrollingText(final TextView _view) {
		_view.setSingleLine(true);
		_view.setEllipsize(TextUtils.TruncateAt.MARQUEE);
		_view.setSelected(true);
	}
	
	public class BockviewAdapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public BockviewAdapter(ArrayList<HashMap<String, Object>> _arr) {
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
				_view = _inflater.inflate(R.layout.tiempath, null);
			}
			
			final androidx.cardview.widget.CardView cardview1 = _view.findViewById(R.id.cardview1);
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final LinearLayout ci = _view.findViewById(R.id.ci);
			final LinearLayout linear3 = _view.findViewById(R.id.linear3);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			
			if (_data.get((int)_position).containsKey("color")) {
				ci.setBackgroundColor(Color.parseColor(_data.get((int)_position).get("color").toString()));
				imageview1.setColorFilter(Color.parseColor(_data.get((int)_position).get("color").toString()), PorterDuff.Mode.MULTIPLY);
			}
			if (_data.get((int)_position).containsKey("name")) {
				textview1.setText(_data.get((int)_position).get("name").toString());
			}
			_ScrollingText(textview1);
			textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/myf.ttf"), 1);
			cardview1.setCardBackgroundColor(0xFF000062);
			cardview1.setRadius((float)19);
			cardview1.setCardElevation((float)0);
			
			return _view;
		}
	}
	
	public class PalAdapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public PalAdapter(ArrayList<HashMap<String, Object>> _arr) {
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
				_view = _inflater.inflate(R.layout.palet, null);
			}
			
			final androidx.cardview.widget.CardView cardview1 = _view.findViewById(R.id.cardview1);
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final LinearLayout linear3 = _view.findViewById(R.id.linear3);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			
			try {
				if (_data.get((int)_position).containsKey("name")) {
					_textview_mh(textview1, _data.get((int)_position).get("spec").toString());
				}
				else {
					
				}
				if (!_data.get((int)_position).containsKey("color")) {
					_SketchwareBlocks(textview1, _data.get((int)_position).get("type").toString(), BlockData.getString("color", ""));
				}
				else {
					if (_data.get((int)_position).containsKey("color")) {
						_SketchwareBlocks(textview1, _data.get((int)_position).get("type").toString(), _data.get((int)_position).get("color").toString());
					}
				}
			} catch (Exception e) {
				 
			}
			_ScrollingText(textview1);
			textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/myf.ttf"), 1);
			cardview1.setCardBackgroundColor(0xFF000062);
			cardview1.setRadius((float)19);
			cardview1.setCardElevation((float)0);
			textview1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					t.setClass(getApplicationContext(), SkproblockeditorActivity.class);
					t.putExtra("cmd", "edit");
					if (_data.get((int)_position).containsKey("name")) {
						t.putExtra("name", _data.get((int)_position).get("name").toString());
					}
					else {
						t.putExtra("name", "");
					}
					if (_data.get((int)_position).containsKey("type")) {
						t.putExtra("type", _data.get((int)_position).get("type").toString());
					}
					else {
						t.putExtra("type", " ");
					}
					if (_data.get((int)_position).containsKey("typeName")) {
						t.putExtra("typeName", _data.get((int)_position).get("typeName").toString());
					}
					else {
						t.putExtra("typeName", "");
					}
					if (_data.get((int)_position).containsKey("color")) {
						t.putExtra("color", _data.get((int)_position).get("color").toString());
					}
					else {
						t.putExtra("color", "");
					}
					if (_data.get((int)_position).containsKey("code")) {
						t.putExtra("code", _data.get((int)_position).get("code").toString());
					}
					else {
						t.putExtra("code", "");
					}
					if (_data.get((int)_position).containsKey("palette")) {
						t.putExtra("palette", _data.get((int)_position).get("palette").toString());
					}
					else {
						t.putExtra("palette", "");
					}
					if (_data.get((int)_position).containsKey("spec")) {
						t.putExtra("spec", _data.get((int)_position).get("spec").toString());
					}
					else {
						t.putExtra("spec", "");
					}
					if (_data.get((int)_position).containsKey("spec2")) {
						t.putExtra("spec2", _data.get((int)_position).get("spec2").toString());
					}
					else {
						t.putExtra("spec2", " ");
					}
					t.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(t);
				}
			});
			
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