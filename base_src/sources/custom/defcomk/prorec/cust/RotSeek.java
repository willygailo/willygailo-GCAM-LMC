package custom.defcomk.prorec.cust;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import com.Fix.Pref;
import com.Helper;
import com.google.android.apps.camera.bottombar.R;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import za.lol;

/* JADX INFO: loaded from: classes2.dex */
public class RotSeek extends View {
    public static RotSeek app;
    public static int sMFicon;
    private boolean AUTOscroll;
    private final String TAG;
    private final int VISIBLE_ITEMS_INVIEW;
    private String[] Values;
    private int allItemsHeight;
    private int currentPosToDraw;
    private int currentValue;
    private final boolean debug;
    private int distanceInPixelFromLastSwipe;
    private Handler handler;
    private int itemHeight;
    private SeekBar.OnSeekBarChangeListener mListener;
    private Paint paint;
    private int realMax;
    private int realMin;
    private final int scrollsubstract;
    private boolean sliderMoving;
    private int startY;
    private final int textColor;
    private int textsize;
    private int viewHeight;
    private int viewWidth;

    public RotSeek(Context context) {
        super(context);
        app = this;
        this.Values = "AUTO,INF,2M,SELFIE,MACRO,0.005,0.006,0.007,0.008,0.009,0.01,0.03,0.05,0.07,0.09,0.11,0.21,0.31,0.41,0.51,0.61,0.71,0.81,0.91,0.95,1.01,1.21,1.41,1.61,1.81,2.01,2.21,2.41,2.61,2.81,3.01,3.21,3.41,3.61,3.81,4.01,4.21,4.41,4.61,4.81,5.01,5.21,5.41,5.61,5.81,6.01,6.21,6.41,6.61,6.81,7.01,7.21,7.41,7.61,7.81,8.01,8.21,8.41,8.61,9.01,9.21,9.41,9.61,9.81,9.9,10.0,11.0,12.0,14.0,15.0".split(",");
        this.currentValue = 0;
        this.textsize = 8;
        this.textColor = -1;
        this.debug = true;
        this.TAG = RotSeek.class.getSimpleName();
        this.scrollsubstract = 1;
        this.VISIBLE_ITEMS_INVIEW = 16;
        init(context, null);
    }

    public RotSeek(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        app = this;
        this.Values = "AUTO,INF,2M,SELFIE,MACRO,0.005,0.006,0.007,0.008,0.009,0.01,0.03,0.05,0.07,0.09,0.11,0.21,0.31,0.41,0.51,0.61,0.71,0.81,0.91,0.95,1.01,1.21,1.41,1.61,1.81,2.01,2.21,2.41,2.61,2.81,3.01,3.21,3.41,3.61,3.81,4.01,4.21,4.41,4.61,4.81,5.01,5.21,5.41,5.61,5.81,6.01,6.21,6.41,6.61,6.81,7.01,7.21,7.41,7.61,7.81,8.01,8.21,8.41,8.61,9.01,9.21,9.41,9.61,9.81,9.9,10.0,11.0,12.0,14.0,15.0".split(",");
        this.currentValue = 0;
        this.textsize = 8;
        this.textColor = -1;
        this.debug = true;
        this.TAG = RotSeek.class.getSimpleName();
        this.scrollsubstract = 1;
        this.VISIBLE_ITEMS_INVIEW = 16;
        init(context, attributeSet);
    }

    public RotSeek(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        app = this;
        this.Values = "AUTO,INF,2M,SELFIE,MACRO,0.005,0.006,0.007,0.008,0.009,0.01,0.03,0.05,0.07,0.09,0.11,0.21,0.31,0.41,0.51,0.61,0.71,0.81,0.91,0.95,1.01,1.21,1.41,1.61,1.81,2.01,2.21,2.41,2.61,2.81,3.01,3.21,3.41,3.61,3.81,4.01,4.21,4.41,4.61,4.81,5.01,5.21,5.41,5.61,5.81,6.01,6.21,6.41,6.61,6.81,7.01,7.21,7.41,7.61,7.81,8.01,8.21,8.41,8.61,9.01,9.21,9.41,9.61,9.81,9.9,10.0,11.0,12.0,14.0,15.0".split(",");
        this.currentValue = 0;
        this.textsize = 8;
        this.textColor = -1;
        this.debug = true;
        this.TAG = RotSeek.class.getSimpleName();
        this.scrollsubstract = 1;
        this.VISIBLE_ITEMS_INVIEW = 16;
        init(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkifCurrentValueHasChanged() {
        int i = (this.currentPosToDraw + this.realMin) / this.itemHeight;
        if (i < 0) {
            i *= -1;
        }
        if (i == this.currentValue) {
            return;
        }
        log("currentpos" + this.currentPosToDraw + "item " + i);
        this.currentValue = i;
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.mListener;
        if (Pref.MenuValue("pref_camera_vibrator_key") != 0) {
            performHapticFeedback(4);
        }
        if (onSeekBarChangeListener != null) {
            this.handler.post(new Runnable() { // from class: custom.defcomk.prorec.cust.RotSeek.2
                @Override // java.lang.Runnable
                public void run() {
                    RotSeek.this.mListener.onProgressChanged(null, RotSeek.this.currentValue, true);
                }
            });
        }
    }

    private float convertDpiToPixel(int i) {
        return TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    public static int getManualFocus() {
        if (Pref.MenuValue("pref_manual_focus_slider_key") == 0) {
            return 1;
        }
        return sMFicon;
    }

    private int getSignedDistance(int i, int i2) {
        return i - i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAUTOScroll() {
        this.handler.post(new Runnable() { // from class: custom.defcomk.prorec.cust.RotSeek.1
            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                if (RotSeek.this.AUTOscroll) {
                    int i = (RotSeek.this.currentPosToDraw - RotSeek.this.distanceInPixelFromLastSwipe) - 1;
                    int i2 = i * (-1);
                    if (i2 > RotSeek.this.realMax || i2 < RotSeek.this.realMin) {
                        RotSeek.this.AUTOscroll = false;
                        RotSeek.this.distanceInPixelFromLastSwipe = 0;
                        if (i2 > RotSeek.this.realMax) {
                            RotSeek.this.setProgress(RotSeek.this.Values.length - 1, true);
                        } else if (i2 < RotSeek.this.realMin) {
                            RotSeek.this.setProgress(0, true);
                        } else {
                            RotSeek.this.checkifCurrentValueHasChanged();
                            if (RotSeek.this.currentValue > RotSeek.this.Values.length - 1) {
                                RotSeek.this.currentValue = RotSeek.this.Values.length - 1;
                            }
                            if (RotSeek.this.currentValue < 0) {
                                RotSeek.this.currentValue = 0;
                            }
                            RotSeek.this.setProgress(RotSeek.this.currentValue, true);
                        }
                        RotSeek.this.log("scroll pos:" + i + " max:" + RotSeek.this.realMax + " min:" + RotSeek.this.realMin);
                    } else {
                        RotSeek.this.log("scroll pos:" + i + " max:" + RotSeek.this.realMax + " min:" + RotSeek.this.realMin);
                        if (RotSeek.this.distanceInPixelFromLastSwipe < 0 && RotSeek.this.distanceInPixelFromLastSwipe + 1 < 0) {
                            RotSeek.this.distanceInPixelFromLastSwipe++;
                            z = true;
                            RotSeek.this.currentPosToDraw -= RotSeek.this.distanceInPixelFromLastSwipe;
                            RotSeek.this.checkifCurrentValueHasChanged();
                        } else if (RotSeek.this.distanceInPixelFromLastSwipe <= 0 || RotSeek.this.distanceInPixelFromLastSwipe - 1 <= 0) {
                            RotSeek.this.checkifCurrentValueHasChanged();
                            RotSeek.this.distanceInPixelFromLastSwipe = 0;
                            RotSeek.this.setProgress(RotSeek.this.currentValue, true);
                            z = false;
                        } else {
                            RotSeek.this.distanceInPixelFromLastSwipe--;
                            z = true;
                            RotSeek.this.currentPosToDraw -= RotSeek.this.distanceInPixelFromLastSwipe;
                            RotSeek.this.checkifCurrentValueHasChanged();
                        }
                        if (z) {
                            RotSeek.this.handleAUTOScroll();
                        }
                    }
                    RotSeek.this.redraw();
                }
            }
        });
    }

    private void init(Context context, AttributeSet attributeSet) {
        this.handler = new Handler();
        this.paint = new Paint();
        this.paint.setAntiAlias(true);
        this.paint.setColor(-1);
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setTextAlign(Paint.Align.RIGHT);
        this.textsize = (int) convertDpiToPixel(this.textsize);
        setProgress(this.currentValue, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void log(String str) {
        Log.i("ProReC", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void redraw() {
        invalidate();
    }

    private int switchalpha(int i) {
        switch (i) {
            case 0:
                return 255;
            case 1:
                return 217;
            case 2:
                return 186;
            case 3:
                return 155;
            case 4:
                return R.styleable.AppCompatTheme_windowMinWidthMajor;
            case 5:
                return 93;
            case 6:
                return 62;
            case 7:
                return 31;
            case 8:
            default:
                return 0;
        }
    }

    public String GetCurrentString() {
        return this.Values[this.currentValue];
    }

    public boolean IsAUTOScrolling() {
        return this.AUTOscroll;
    }

    public boolean IsMoving() {
        return this.sliderMoving;
    }

    public void SetStringValues(String[] strArr) {
        this.Values = strArr;
        this.itemHeight = this.viewHeight / 16;
        this.allItemsHeight = (this.itemHeight * this.Values.length) + this.itemHeight;
        this.realMin = ((-this.viewHeight) / 2) - (this.itemHeight / 2);
        this.realMax = this.allItemsHeight - (this.viewHeight / 2);
        redraw();
    }

    public int getProgress() {
        return this.currentValue;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (getManualFocus() != 0) {
            setVisibility(8);
            return;
        }
        super.onDraw(canvas);
        this.paint.setColor(-1);
        this.paint.setTextSize(this.textsize);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.Values.length) {
                this.paint.setAlpha(255);
                this.paint.setStrokeWidth(10.0f);
                canvas.drawLine(this.viewWidth - convertDpiToPixel(20), (this.viewHeight / 2) + (this.itemHeight / 2), this.viewWidth, (this.viewHeight / 2) + (this.itemHeight / 2), this.paint);
                return;
            }
            String str = this.Values[i2];
            int i3 = this.currentValue - i2;
            if (i3 < 0) {
                i3 *= -1;
            }
            if (i3 <= 8) {
                this.paint.setAlpha(switchalpha(i3));
                this.paint.setStrokeWidth(1.0f);
                int i4 = this.itemHeight;
                int i5 = this.textsize;
                int i6 = ((((i4 * i2) + i5) + this.currentPosToDraw) + (this.itemHeight / 2)) - (this.textsize / 2);
                canvas.drawLine(this.viewWidth - convertDpiToPixel(30), i6 - (this.textsize / 2), this.viewWidth - 20, i6 - (this.textsize / 2), this.paint);
                if (str != null) {
                    canvas.drawText(str, 80.0f, i6, this.paint);
                }
            }
            i = i2 + 1;
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.viewWidth = i;
        this.viewHeight = i2;
        this.itemHeight = this.viewHeight / 12;
        this.allItemsHeight = (this.itemHeight * this.Values.length) + this.itemHeight;
        this.realMin = ((-this.viewHeight) / 2) - (this.itemHeight / 2);
        this.realMax = (this.allItemsHeight - (this.viewHeight / 2)) - (this.itemHeight * 2);
        setProgress(this.currentValue, false);
        redraw();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int signedDistance;
        boolean z = true;
        switch (motionEvent.getAction()) {
            case 0:
                this.startY = (int) motionEvent.getY();
                this.AUTOscroll = false;
                break;
            case 1:
                if (!this.sliderMoving) {
                    z = false;
                } else {
                    this.sliderMoving = false;
                    if (this.mListener != null) {
                        this.mListener.onStopTrackingTouch(null);
                    }
                    if ((this.distanceInPixelFromLastSwipe > 0 && this.distanceInPixelFromLastSwipe > 10) || (this.distanceInPixelFromLastSwipe < 0 && this.distanceInPixelFromLastSwipe < -10)) {
                        this.AUTOscroll = true;
                        handleAUTOScroll();
                    }
                    setProgress(this.currentValue, true);
                    if (Pref.MenuValue("manualfocus_restart") == 0) {
                        CameraActivity.ReInit();
                    } else {
                        Helper.setMenuValue("pref_af_mode_back", "2");
                    }
                    z = false;
                }
                break;
            case 2:
                if (!this.sliderMoving && ((signedDistance = getSignedDistance(this.startY, (int) motionEvent.getY())) > 40 || signedDistance < -40)) {
                    this.sliderMoving = true;
                    if (this.mListener != null) {
                        this.mListener.onStartTrackingTouch(null);
                    }
                }
                if (this.sliderMoving) {
                    this.distanceInPixelFromLastSwipe = getSignedDistance(this.startY, (int) motionEvent.getY());
                    int i = this.currentPosToDraw - this.distanceInPixelFromLastSwipe;
                    int i2 = i * (-1);
                    if (i2 < this.realMax && i2 > this.realMin) {
                        this.currentPosToDraw = i;
                        checkifCurrentValueHasChanged();
                        this.startY = (int) motionEvent.getY();
                    }
                }
                z = this.sliderMoving;
                break;
            default:
                z = false;
                break;
        }
        redraw();
        return z;
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.mListener = onSeekBarChangeListener;
    }

    public void setProgress(int i, boolean z) {
        lol.getInstance();
        lol.calcdist(i);
        this.currentValue = i;
        log("setprogres" + i);
        this.currentPosToDraw = ((this.itemHeight * i) + (this.itemHeight / 2) + this.realMin) * (-1);
        redraw();
        if (this.mListener != null && z) {
            this.handler.post(new Runnable() { // from class: custom.defcomk.prorec.cust.RotSeek.3
                @Override // java.lang.Runnable
                public void run() {
                    RotSeek.this.mListener.onProgressChanged(null, RotSeek.this.currentValue, true);
                }
            });
        }
    }
}
