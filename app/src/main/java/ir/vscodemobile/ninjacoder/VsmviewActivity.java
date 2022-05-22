package ir.vscodemobile.ninjacoder;

import android.Manifest;
import android.animation.*;
import android.app.*;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.*;
import android.graphics.*;
import android.graphics.Typeface;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
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
import com.google.android.material.floatingactionbutton.FloatingActionButton;
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

public class VsmviewActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private double num = 0;
	
	private ArrayList<HashMap<String, Object>> viewmap = new ArrayList<>();
	
	private LinearLayout linear1;
	private ListView listview1;
	
	private AlertDialog.Builder alter;
	private ProgressDialog pro;
	private TimerTask r;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.vsmview);
		initialize(_savedInstanceState);
		
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE}, 1000);
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
				txt.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/myf.ttf"), 0);
				txt.setTextColor(0xFFFFFFFF);
				txt.setHintTextColor(0xFF219EB7);
				///end
				txt.setLayoutParams(lparr);
				alter.setView(txt);
				alter.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						pro = new ProgressDialog(VsmviewActivity.this);
						pro.setTitle("ExsertFile");
						pro.setMessage("Exsert VsmFile");
						pro.show();
						r = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										try{
											while(true) {
												String fileZip = viewmap.get((int)num).get("ninja").toString();
												        java.io.File destDir = new java.io.File(txt.getText().toString());
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
												pro.dismiss();
												finish();
											}
										}catch(Exception e){
											SketchwareUtil.showMessage(getApplicationContext(), "error");
										}
									}
								});
							}
						};
						_timer.schedule(r, (int)(2000));
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
		_fab.setBackgroundTintList(android.content.res.ColorStateList.valueOf(Color.parseColor("0xFFE91E63".replace("0xFF" , "#"))));
		listview1.setHorizontalScrollBarEnabled(false);
		listview1.setVerticalScrollBarEnabled(false);
		listview1.setOverScrollMode(ListView.OVER_SCROLL_NEVER);
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
	
	
	public void _unzip() {
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
			cardview1.setCardBackgroundColor(0xFF212121);
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