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
import android.widget.LinearLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.net.Uri;
import java.util.Timer;
import java.util.TimerTask;
import android.app.Activity;
import android.content.SharedPreferences;
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
import com.oguzdev.circularfloatingactionmenu.library.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import androidx.core.content.ContextCompat;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;

public class SplashActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private LinearLayout linear1;
	private ImageView imageview1;
	private CardView cardview1;
	
	private Intent vscodeintent = new Intent();
	private TimerTask timer;
	private SharedPreferences por;
	private TimerTask timerask;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.splash);
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
		imageview1 = findViewById(R.id.imageview1);
		cardview1 = findViewById(R.id.cardview1);
		por = getSharedPreferences("por", Activity.MODE_PRIVATE);
	}
	
	private void initializeLogic() {
		FileUtil.makeDir("/sdcard/vscodeandroid/");
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =SplashActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF000027);
		}
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF000027".replace("0xFF" , "#")));
		}
		timerask = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						imageview1.setVisibility(View.GONE);
					}
				});
			}
		};
		_timer.schedule(timerask, (int)(100));
		final AlertDialog dialog1 = new AlertDialog.Builder(SplashActivity.this).create();
		View inflate = getLayoutInflater().inflate(R.layout.vscode,null); 
		dialog1.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
		dialog1.setView(inflate);
		androidx.cardview.widget.CardView card = (androidx.cardview.widget.CardView) inflate.findViewById(R.id.card);
		LinearLayout win = (LinearLayout) inflate.findViewById(R.id.win);
		LinearLayout bg = (LinearLayout) inflate.findViewById(R.id.bg);
		try {
			WP7ProgressBar gg = new WP7ProgressBar(this);
			gg.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT));
			win.addView(gg);
			gg.showProgressBar();
		} catch (Exception e) {
			 
		}
		card.setCardBackgroundColor(0xFF000027);
		card.setRadius((float)18);
		card.setCardElevation((float)0);
		timer = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
						vscodeintent.setClass(getApplicationContext(), FilesActivity.class);
						vscodeintent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
						startActivity(vscodeintent);
					}
				});
			}
		};
		_timer.schedule(timer, (int)(4000));
		dialog1.dismiss();
		dialog1.setCancelable(false);
		dialog1.show();
	}
	
	public void _win() {
	}
	public static class WP7ProgressBar extends LinearLayout {
		    private static final int INTERVAL_DEF = 150;
		    private static final int INDICATOR_COUNT_DEF = 7;
		    private static final int ANIMATION_DURATION_DEF = 2200;
		    private static final int INDICATOR_HEIGHT_DEF = 5;
		    private static final int INDICATOR_RADIUS_DEF = 0;
		    private int interval;
		    private int animationDuration;
		    private int indicatorHeight;
		    private int indicatorColor;
		    private int indicatorRadius;
		    private boolean isShowing = false;
		    private ArrayList<WP7Indicator> WP7Indicators;
		    private Handler handler;
		    private int progressBarCount = 0;
		    private ObjectAnimator objectAnimator;
		    public WP7ProgressBar(Context context) {
			        super(context);
			        initialize(null);
			    }
		    public WP7ProgressBar(Context context, AttributeSet attrs) {
			        super(context, attrs);
			        initialize(attrs);
			    }
		    public WP7ProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
			        super(context, attrs, defStyleAttr);
			        initialize(attrs);
			    }
		    private void initialize(AttributeSet attrs) {
			        this.setGravity(Gravity.CENTER);
			        this.setOrientation(HORIZONTAL);
			        this.handler = new Handler();
			        setAttributes(attrs);
			        initializeIndicators();
			    }
		    private void setAttributes(AttributeSet attributeSet) {
			        //TypedArray typedArray = getContext().obtainStyledAttributes(attributeSet, R.styleable.WP7ProgressBar);
			        interval = INTERVAL_DEF;
			        animationDuration = ANIMATION_DURATION_DEF;
			        indicatorHeight = INDICATOR_HEIGHT_DEF;
			        indicatorRadius = INDICATOR_RADIUS_DEF;
			        indicatorColor = Color.parseColor("#FFFF7D00"); //Context.getColor(getContext(), R.color.colorAccent);
			        //typedArray.recycle();
			    }
		    private void showAnimation() {
			        for (int i = 0; i < WP7Indicators.size(); i++) {
				            WP7Indicators.get(i).startAnim(animationDuration, (5 - i) * interval);
				        }
			    }
		    private void initializeIndicators() {
			        this.removeAllViews();
			        ArrayList<WP7Indicator> WP7Indicators = new ArrayList<>();
			        for (int i = 0; i < INDICATOR_COUNT_DEF; i++) {
				            WP7Indicator WP7Indicator = new WP7Indicator(getContext(), indicatorHeight, indicatorColor, indicatorRadius);
				            WP7Indicators.add(WP7Indicator);
				            this.addView(WP7Indicator);
				        }
			        this.WP7Indicators = WP7Indicators;
			    }
		    private void show() {
			        if (isShowing)
			            return;
			        isShowing = true;
			        showAnimation();
			    }
		    private void hide() {
			        clearIndicatorsAnimations();
			        isShowing = false;
			    }
		    private void startWholeViewAnimation() {
			        objectAnimator = ObjectAnimator.ofFloat(this, "translationX", -200, 200);
			        objectAnimator.setInterpolator(new LinearInterpolator());
			        objectAnimator.setDuration(animationDuration + (5 * interval));
			        objectAnimator.setRepeatMode(ValueAnimator.RESTART);
			        objectAnimator.setRepeatCount(ValueAnimator.INFINITE);
			        objectAnimator.start();
			    }
		    private void hideWholeViewAnimation() {
			        objectAnimator.removeAllListeners();
			        objectAnimator.cancel();
			        objectAnimator.end();
			    }
		    private void clearIndicatorsAnimations() {
			        for (WP7Indicator WP7Indicator : WP7Indicators) {
				            WP7Indicator.removeAnim();
				        }
			    }
		    public void showProgressBar() {
			        progressBarCount++;
			        if (progressBarCount == 1) {
				            handler.post(new Runnable() {
					                @Override
					                public void run() {
						                    WP7ProgressBar.this.show();
						                }
					            });
				        }
			    }
		    public void hideProgressBar() {
			        progressBarCount--;
			        handler.postDelayed(new Runnable() {
				            @Override
				            public void run() {
					                if (progressBarCount == 0) {
						                    WP7ProgressBar.this.hide();
						                }
					            }
				        }, 50);
			    }
		    public void setInterval(int interval) {
			        this.interval = interval;
			        initializeIndicators();
			    }
		    public void setAnimationDuration(int animationDuration) {
			        this.animationDuration = animationDuration;
			        initializeIndicators();
			    }
		    public void setIndicatorHeight(int indicatorHeight) {
			        this.indicatorHeight = indicatorHeight;
			        initializeIndicators();
			    }
		    public void setIndicatorColor(int indicatorColor) {
			        this.indicatorColor = indicatorColor;
			        initializeIndicators();
			    }
		    public void setIndicatorRadius(int indicatorRadius) {
			        this.indicatorRadius = indicatorRadius;
			        initializeIndicators();
			    }
	}
	
	public static class WP10ProgressBar extends RelativeLayout {
		    private static final int INTERVAL_DEF = 150;
		    private static final int INDICATOR_COUNT_DEF = 5;
		    private static final int ANIMATION_DURATION_DEF = 1800;
		    private static final int INDICATOR_HEIGHT_DEF = 7;
		    private static final int INDICATOR_RADIUS_DEF = 0;
		    private int interval;
		    private int animationDuration;
		    private int indicatorHeight;
		    private int indicatorColor;
		    private int indicatorRadius;
		    private boolean isShowing = false;
		    private ArrayList<WP10Indicator> wp10Indicators;
		    private Handler handler;
		    private int progressBarCount = 0;
		    public WP10ProgressBar(Context context) {
			        super(context);
			        initialize(null);
			    }
		    public WP10ProgressBar(Context context, AttributeSet attrs) {
			        super(context, attrs);
			        initialize(attrs);
			    }
		    public WP10ProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
			        super(context, attrs, defStyleAttr);
			        initialize(attrs);
			    }
		    private void initialize(AttributeSet attrs) {
			        this.setGravity(Gravity.CENTER);
			        this.handler = new Handler();
			        this.setRotation(-25);
			        setAttributes(attrs);
			        initializeIndicators();
			    }
		    private void setAttributes(AttributeSet attributeSet) {
			        //TypedArray typedArray = getContext().obtainStyledAttributes(attributeSet, R.styleable.WP10ProgressBar);
			        interval = INTERVAL_DEF;
			        animationDuration = ANIMATION_DURATION_DEF;
			        indicatorHeight = INDICATOR_HEIGHT_DEF;
			        indicatorRadius = INDICATOR_RADIUS_DEF;
			        indicatorColor = Color.parseColor("#FFFF7D00");
			    }
		    private void showAnimation() {
			        for (int i = 0; i < wp10Indicators.size(); i++) {
				            wp10Indicators.get(i).startAnim(animationDuration, (5 - i) * interval);
				        }
			    }
		    private void initializeIndicators() {
			        this.removeAllViews();
			        ArrayList<WP10Indicator> WP10Indicators = new ArrayList<>();
			        for (int i = 0; i < INDICATOR_COUNT_DEF; i++) {
				            WP10Indicator wp10Indicator = new WP10Indicator(getContext(), indicatorHeight, indicatorColor, indicatorRadius, i);
				            WP10Indicators.add(wp10Indicator);
				            this.addView(wp10Indicator);
				        }
			        this.wp10Indicators = WP10Indicators;
			    }
		    private void show() {
			        if (isShowing)
			            return;
			        isShowing = true;
			        showAnimation();
			    }
		    private void hide() {
			        clearIndicatorsAnimations();
			        isShowing = false;
			    }
		    private void clearIndicatorsAnimations() {
			        for (WP10Indicator wp10Indicator : wp10Indicators) {
				            wp10Indicator.removeAnim();
				        }
			    }
		    public void showProgressBar() {
			        progressBarCount++;
			        if (progressBarCount == 1) {
				            handler.post(new Runnable() {
					                @Override
					                public void run() {
						                    WP10ProgressBar.this.show();
						                }
					            });
				        }
			    }
		    public void hideProgressBar() {
			        progressBarCount--;
			        handler.postDelayed(new Runnable() {
				            @Override
				            public void run() {
					                if (progressBarCount == 0) {
						                    WP10ProgressBar.this.hide();
						                }
					            }
				        }, 50);
			    }
		    public void setInterval(int interval) {
			        this.interval = interval;
			        initializeIndicators();
			    }
		    public void setAnimationDuration(int animationDuration) {
			        this.animationDuration = animationDuration;
			        initializeIndicators();
			    }
		    public void setIndicatorHeight(int indicatorHeight) {
			        this.indicatorHeight = indicatorHeight;
			        initializeIndicators();
			    }
		    public void setIndicatorColor(int indicatorColor) {
			        this.indicatorColor = indicatorColor;
			        initializeIndicators();
			    }
		    public void setIndicatorRadius(int indicatorRadius) {
			        this.indicatorRadius = indicatorRadius;
			        initializeIndicators();
			    }
	}
	
	
	public static class Base10Indicator extends View {
		    private int color;
		    public Base10Indicator(Context context, int indicatorHeight, int color, int radius) {
			        super(context);
			        this.color = color;
			        initialize(indicatorHeight, radius);
			    }
		    private void initialize(int indicatorHeight, int radius) {
			        this.setBackground(getCube(radius));
			        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Utils.px2dp(getContext(), indicatorHeight), Utils.px2dp(getContext(), indicatorHeight));
			        this.setLayoutParams(layoutParams);
			    }
		    private android.graphics.drawable.GradientDrawable getCube(int radius) {
			        android.graphics.drawable.GradientDrawable drawable = new android.graphics.drawable.GradientDrawable();
			        drawable.setShape(android.graphics.drawable.GradientDrawable.RECTANGLE);
			        drawable.setColor(color);
			        drawable.setCornerRadius(Utils.px2dp(getContext(), radius));
			        return drawable;
			    }
	}
	
	public static class Utils {
		    public static int px2dp(Context context, int px) {
			        float scale = context.getResources().getDisplayMetrics().density;
			        return (int) (px * scale + 0.5f);
			    }
	}
	
	static class WP7Indicator extends View {
		    private ObjectAnimator objectAnimator;
		    private int color;
		    public WP7Indicator(Context context, int indicatorHeight, int color, int radius) {
			        super(context);
			        this.color = color;
			        initialize(indicatorHeight, radius);
			    }
		    private void initialize(int indicatorHeight, int radius) {
			        this.setBackground(getCube(radius));
			        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Utils.px2dp(getContext(), indicatorHeight), Utils.px2dp(getContext(), indicatorHeight));
			        layoutParams.rightMargin = Utils.px2dp(getContext(), (int) (1.5f * indicatorHeight));
			        this.setLayoutParams(layoutParams);
			        startAnim(0, 0);
			        removeAnim();
			    }
		    private android.graphics.drawable.GradientDrawable getCube(int radius) {
			        android.graphics.drawable.GradientDrawable drawable = new android.graphics.drawable.GradientDrawable();
			        drawable.setShape(android.graphics.drawable.GradientDrawable.RECTANGLE);
			        drawable.setColor(color);
			        drawable.setCornerRadius(Utils.px2dp(getContext(), radius));
			        return drawable;
			    }
		    public void startAnim(long animationDuration, long delay) {
			        objectAnimator = ObjectAnimator.ofFloat(this, "translationX", +1000, -1000);
			        objectAnimator.setInterpolator(new WPInterpolator());
			        objectAnimator.setDuration(animationDuration);
			        objectAnimator.setRepeatMode(ValueAnimator.RESTART);
			        objectAnimator.setRepeatCount(ValueAnimator.INFINITE);
			        objectAnimator.setStartDelay(delay);
			        objectAnimator.start();
			    }
		    public void removeAnim() {
			        objectAnimator.removeAllListeners();
			        objectAnimator.cancel();
			        objectAnimator.end();
			    }
	}
	
	public static class WP10Indicator extends RelativeLayout {
		    private Base10Indicator base10Indicator;
		    private ObjectAnimator objectAnimator;
		    private int number;
		    public WP10Indicator(Context context, int indicatorHeight, int color, int radius, int number) {
			        super(context);
			        initialize(indicatorHeight, color, radius, number);
			    }
		    private void initialize(int indicatorHeight, int color, int radius, int number) {
			        this.number = number;
			        this.base10Indicator = new Base10Indicator(getContext(), indicatorHeight, color, radius);
			        RelativeLayout.LayoutParams layoutParams = new LayoutParams(Utils.px2dp(getContext(), indicatorHeight * 8),
			                Utils.px2dp(getContext(), indicatorHeight * 8));
			        this.setLayoutParams(layoutParams);
			        this.setGravity(Gravity.CENTER_VERTICAL | Gravity.RIGHT);
			        this.addView(base10Indicator);
			        startAnim(0, 0);
			        removeAnim();
			        this.setAlpha(0f);
			    }
		    public void startAnim(final long animationDuration, final long delay) {
			        objectAnimator = ObjectAnimator.ofFloat(this, "rotation", (number * 15), -360 + (number * 15));
			        objectAnimator.setInterpolator(new WPInterpolator());
			        objectAnimator.setDuration(animationDuration);
			        objectAnimator.setRepeatMode(ValueAnimator.RESTART);
			        objectAnimator.setRepeatCount(2);
			        objectAnimator.addListener(new android.animation.Animator.AnimatorListener() {
				            @Override
				            public void onAnimationStart(android.animation.Animator animator) {
					                WP10Indicator.this.setAlpha(1f);
					                startAlphaAnimation(animationDuration);
					            }
				            @Override
				            public void onAnimationEnd(android.animation.Animator animator) {
					                removeAnim();
					                startAnim(animationDuration, 0);
					            }
				            @Override
				            public void onAnimationCancel(android.animation.Animator animator) {
					            }
				            @Override
				            public void onAnimationRepeat(android.animation.Animator animator) {
					            }
				        });
			        objectAnimator.setStartDelay(delay);
			        objectAnimator.start();
			    }
		    public void startAlphaAnimation(long animationDuration) {
			        this.animate().alpha(0).setDuration(animationDuration / 12).setStartDelay(2 * animationDuration);
			    }
		    public void removeAnim() {
			        this.animate().alpha(0f).setDuration(0).setStartDelay(0);
			        objectAnimator.removeAllListeners();
			        objectAnimator.cancel();
			        objectAnimator.end();
			    }
	}
	
	public static class WPInterpolator implements android.view.animation.Interpolator {
		    @Override
		    public float getInterpolation(float v) {
			        if (v > 0.3f && v < 0.70f)
			            return (float) ((-(v - 0.5) / 6) + 0.5f);
			        return (float) ((-4) * Math.pow(v - 0.5, 3) + 0.5);
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