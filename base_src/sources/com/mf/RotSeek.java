package com.mf;

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
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class RotSeek extends View {
    public static RotSeek app;
    private float[] FocusValue;
    private final String TAG;
    private final int VISIBLE_ITEMS_INVIEW;
    private String[] Values;
    private int allItemsHeight;
    private Context appContext;
    private boolean autoscroll;
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
        setFocusString();
        this.textsize = 9;
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
        setFocusString();
        this.textsize = 9;
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
        setFocusString();
        this.textsize = 9;
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
        if (i != this.currentValue) {
            log("currentpos" + this.currentPosToDraw + "item " + i);
            this.currentValue = i;
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.mListener;
            performHapticFeedback(4);
            if (onSeekBarChangeListener != null) {
                this.handler.post(new Runnable() { // from class: com.mf.RotSeek.2
                    @Override // java.lang.Runnable
                    public void run() {
                        RotSeek.this.mListener.onProgressChanged(null, RotSeek.this.currentValue, true);
                    }
                });
            }
        }
    }

    private float convertDpiToPixel(int i) {
        return TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    private int getSignedDistance(int i, int i2) {
        return i - i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAutoScroll() {
        this.handler.post(new Runnable() { // from class: com.mf.RotSeek.1
            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                if (RotSeek.this.autoscroll) {
                    int i = (RotSeek.this.currentPosToDraw - RotSeek.this.distanceInPixelFromLastSwipe) - 1;
                    int i2 = i * (-1);
                    if (i2 > RotSeek.this.realMax || i2 < RotSeek.this.realMin) {
                        RotSeek.this.autoscroll = false;
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
                            RotSeek.this.handleAutoScroll();
                        }
                    }
                    RotSeek.this.redraw();
                }
            }
        });
    }

    private void init(Context context, AttributeSet attributeSet) {
        this.appContext = context;
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

    public boolean IsAutoScrolling() {
        return this.autoscroll;
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
        if (Pref.MenuValue("pref_mf_key") == 0) {
            setVisibility(8);
            return;
        }
        super.onDraw(canvas);
        this.paint.setColor(-1);
        this.paint.setTextSize(this.textsize);
        for (int i = 0; i < this.Values.length; i++) {
            String str = this.Values[i];
            int i2 = this.currentValue - i;
            if (i2 < 0) {
                i2 *= -1;
            }
            if (i2 <= 9) {
                this.paint.setAlpha(switchalpha(i2));
                this.paint.setStrokeWidth(1.0f);
                int i3 = ((((this.itemHeight * i) + this.textsize) + this.currentPosToDraw) + (this.itemHeight / 2)) - (this.textsize / 2);
                canvas.drawLine(this.viewWidth - convertDpiToPixel(15), i3 - (this.textsize / 2), this.viewWidth - 20, i3 - (this.textsize / 2), this.paint);
                if (str != null) {
                    canvas.drawText(str, 80.0f, i3, this.paint);
                }
            }
        }
        this.paint.setAlpha(255);
        this.paint.setStrokeWidth(10.0f);
        canvas.drawLine(this.viewWidth - convertDpiToPixel(15), (this.viewHeight / 2) + (this.itemHeight / 2), this.viewWidth, (this.viewHeight / 2) + (this.itemHeight / 2), this.paint);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.viewWidth = i;
        this.viewHeight = i2;
        this.itemHeight = this.viewHeight / 16;
        this.allItemsHeight = (this.itemHeight * this.Values.length) + this.itemHeight;
        this.realMin = ((-this.viewHeight) / 2) - (this.itemHeight / 2);
        this.realMax = (this.allItemsHeight - (this.viewHeight / 2)) - (this.itemHeight * 2);
        setProgress(this.currentValue, false);
        redraw();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) throws IOException {
        int signedDistance;
        boolean z = false;
        switch (motionEvent.getAction()) {
            case 0:
                this.startY = (int) motionEvent.getY();
                this.autoscroll = false;
                z = true;
                break;
            case 1:
                if (this.sliderMoving) {
                    this.sliderMoving = false;
                    if (this.mListener != null) {
                        this.mListener.onStopTrackingTouch(null);
                    }
                    z = false;
                    if ((this.distanceInPixelFromLastSwipe > 0 && this.distanceInPixelFromLastSwipe > 10) || (this.distanceInPixelFromLastSwipe < 0 && this.distanceInPixelFromLastSwipe < -10)) {
                        this.autoscroll = true;
                        handleAutoScroll();
                    }
                    setProgress(this.currentValue, true);
                    Context context = this.appContext;
                    if (Pref.MenuValue("pref_set_focus_key") == 0) {
                        Helper.execCommands(context);
                    } else {
                        CameraActivity.ReInit();
                    }
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
        }
        redraw();
        return z;
    }

    public void setFocusString() {
        String strReplace;
        int i = Helper.sFront;
        int iMenuValue = Pref.MenuValue("pref_aux_key");
        if (iMenuValue == 1) {
            strReplace = "pref_max_focus_value_key_2";
        } else if (iMenuValue == 2) {
            strReplace = "pref_max_focus_value_key_3";
        } else if (iMenuValue != 3) {
            strReplace = iMenuValue != 4 ? "pref_max_focus_value_key" : "pref_max_focus_value_key_5";
        } else {
            strReplace = "pref_max_focus_value_key_4";
        }
        if (i == 0) {
            strReplace = strReplace.replace("back", "front");
        }
        float fMenuValueFloat2 = Helper.MenuValueFloat2(strReplace);
        float fMenuValueFloat3 = Helper.MenuValueFloat2("pref_focus_value_key");
        int i2 = (int) fMenuValueFloat3;
        float f = fMenuValueFloat2 / fMenuValueFloat3;
        StringBuilder sb = new StringBuilder();
        sb.append("Auto,inf,");
        int i3 = 0;
        float f2 = 0.0f;
        float[] fArr = new float[i2];
        while (i3 < i2) {
            f2 += f;
            fArr[i3] = f2;
            sb.append(String.format(Locale.ROOT, "%.2f", Float.valueOf(f2)).replace(",", "."));
            i3++;
            if (i3 >= i2) {
                break;
            } else {
                sb.append(",");
            }
        }
        this.FocusValue = fArr;
        this.Values = sb.toString().split(",");
        this.currentValue = 0;
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.mListener = onSeekBarChangeListener;
    }

    public void setProgress(int i, boolean z) {
        float f;
        manualfocus.getInstance();
        if (i < 2) {
            f = 0.0f;
        } else {
            f = this.FocusValue[i - 2];
        }
        manualfocus.calcdist3(i, f);
        this.currentValue = i;
        log("setprogres" + i);
        this.currentPosToDraw = ((this.itemHeight * i) + (this.itemHeight / 2) + this.realMin) * (-1);
        redraw();
        if (this.mListener == null || !z) {
            return;
        }
        this.handler.post(new Runnable() { // from class: com.mf.RotSeek.3
            @Override // java.lang.Runnable
            public void run() {
                RotSeek.this.mListener.onProgressChanged(null, RotSeek.this.currentValue, true);
            }
        });
    }
}
