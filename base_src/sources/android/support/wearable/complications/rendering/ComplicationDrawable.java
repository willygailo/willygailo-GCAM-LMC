package android.support.wearable.complications.rendering;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.wearable.complications.ComplicationData;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.sf;
import defpackage.sh;
import defpackage.sk;
import defpackage.sl;
import defpackage.sm;
import defpackage.so;
import defpackage.sp;
import defpackage.sq;
import defpackage.sr;
import defpackage.st;
import defpackage.tr;
import j$.util.Objects;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class ComplicationDrawable extends Drawable implements Parcelable {
    public static final int BORDER_STYLE_DASHED = 2;
    public static final int BORDER_STYLE_NONE = 0;
    public static final int BORDER_STYLE_SOLID = 1;
    public static final Parcelable.Creator CREATOR = new sk(0);
    private static final String FIELD_ACTIVE_STYLE_BUILDER = "active_style_builder";
    private static final String FIELD_AMBIENT_STYLE_BUILDER = "ambient_style_builder";
    private static final String FIELD_BOUNDS = "bounds";
    private static final String FIELD_HIGHLIGHT_DURATION = "highlight_duration";
    private static final String FIELD_NO_DATA_TEXT = "no_data_text";
    private static final String FIELD_RANGED_VALUE_PROGRESS_HIDDEN = "ranged_value_progress_hidden";
    private static final String TAG = "ComplicationDrawable";
    private final ComplicationStyle$Builder mActiveStyleBuilder;
    private boolean mAlreadyStyled;
    private final ComplicationStyle$Builder mAmbientStyleBuilder;
    private boolean mBurnInProtection;
    private sq mComplicationRenderer;
    private Context mContext;
    private long mCurrentTimeMillis;
    private long mHighlightDuration;
    private boolean mInAmbientMode;
    private boolean mIsHighlighted;
    private boolean mIsInflatedFromXml;
    private boolean mIsStyleUpToDate;
    private boolean mLowBitAmbient;
    private final Handler mMainThreadHandler;
    private CharSequence mNoDataText;
    private boolean mRangedValueProgressHidden;
    private final so mRendererInvalidateListener;
    private final Runnable mUnhighlightRunnable;

    public ComplicationDrawable() {
        this.mMainThreadHandler = new Handler(Looper.getMainLooper());
        this.mUnhighlightRunnable = new sl(this);
        this.mRendererInvalidateListener = new sm(this);
        this.mActiveStyleBuilder = new ComplicationStyle$Builder();
        this.mAmbientStyleBuilder = new ComplicationStyle$Builder();
    }

    public ComplicationDrawable(Context context) {
        this();
        setContext(context);
    }

    private ComplicationDrawable(Parcel parcel) {
        this.mMainThreadHandler = new Handler(Looper.getMainLooper());
        this.mUnhighlightRunnable = new sl(this);
        this.mRendererInvalidateListener = new sm(this);
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        this.mActiveStyleBuilder = (ComplicationStyle$Builder) bundle.getParcelable(FIELD_ACTIVE_STYLE_BUILDER);
        this.mAmbientStyleBuilder = (ComplicationStyle$Builder) bundle.getParcelable(FIELD_AMBIENT_STYLE_BUILDER);
        this.mNoDataText = bundle.getCharSequence(FIELD_NO_DATA_TEXT);
        this.mHighlightDuration = bundle.getLong(FIELD_HIGHLIGHT_DURATION);
        this.mRangedValueProgressHidden = bundle.getBoolean(FIELD_RANGED_VALUE_PROGRESS_HIDDEN);
        setBounds((Rect) bundle.getParcelable(FIELD_BOUNDS));
        this.mAlreadyStyled = true;
    }

    public /* synthetic */ ComplicationDrawable(Parcel parcel, sk skVar) {
        this(parcel);
    }

    public ComplicationDrawable(ComplicationDrawable complicationDrawable) {
        this.mMainThreadHandler = new Handler(Looper.getMainLooper());
        this.mUnhighlightRunnable = new sl(this);
        this.mRendererInvalidateListener = new sm(this);
        this.mActiveStyleBuilder = new ComplicationStyle$Builder(complicationDrawable.mActiveStyleBuilder);
        this.mAmbientStyleBuilder = new ComplicationStyle$Builder(complicationDrawable.mAmbientStyleBuilder);
        CharSequence charSequence = complicationDrawable.mNoDataText;
        this.mNoDataText = charSequence.subSequence(0, charSequence.length());
        this.mHighlightDuration = complicationDrawable.mHighlightDuration;
        this.mRangedValueProgressHidden = complicationDrawable.mRangedValueProgressHidden;
        setBounds(complicationDrawable.getBounds());
        this.mAlreadyStyled = true;
    }

    private void assertInitialized() {
        if (this.mContext == null) {
            throw new IllegalStateException("ComplicationDrawable does not have a context. Use setContext(Context) to set it first.");
        }
    }

    private ComplicationStyle$Builder getComplicationStyleBuilder(boolean z) {
        return z ? this.mAmbientStyleBuilder : this.mActiveStyleBuilder;
    }

    private void inflateAttributes(Resources resources, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), sf.e);
        setRangedValueProgressHidden(typedArrayObtainAttributes.getBoolean(11, false));
        typedArrayObtainAttributes.recycle();
    }

    private void inflateStyle(boolean z, Resources resources, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), sf.e);
        ComplicationStyle$Builder complicationStyleBuilder = getComplicationStyleBuilder(z);
        if (typedArrayObtainAttributes.hasValue(0)) {
            complicationStyleBuilder.a = typedArrayObtainAttributes.getColor(0, resources.getColor(R.color.complicationDrawable_backgroundColor, null));
        }
        if (typedArrayObtainAttributes.hasValue(1)) {
            complicationStyleBuilder.b = typedArrayObtainAttributes.getDrawable(1);
        }
        if (typedArrayObtainAttributes.hasValue(14)) {
            complicationStyleBuilder.c = typedArrayObtainAttributes.getColor(14, resources.getColor(R.color.complicationDrawable_textColor, null));
        }
        if (typedArrayObtainAttributes.hasValue(17)) {
            complicationStyleBuilder.d = typedArrayObtainAttributes.getColor(17, resources.getColor(R.color.complicationDrawable_titleColor, null));
        }
        if (typedArrayObtainAttributes.hasValue(16)) {
            complicationStyleBuilder.e = Typeface.create(typedArrayObtainAttributes.getString(16), 0);
        }
        if (typedArrayObtainAttributes.hasValue(19)) {
            complicationStyleBuilder.f = Typeface.create(typedArrayObtainAttributes.getString(19), 0);
        }
        if (typedArrayObtainAttributes.hasValue(15)) {
            complicationStyleBuilder.g = typedArrayObtainAttributes.getDimensionPixelSize(15, resources.getDimensionPixelSize(R.dimen.complicationDrawable_textSize));
        }
        if (typedArrayObtainAttributes.hasValue(18)) {
            complicationStyleBuilder.h = typedArrayObtainAttributes.getDimensionPixelSize(18, resources.getDimensionPixelSize(R.dimen.complicationDrawable_titleSize));
        }
        if (typedArrayObtainAttributes.hasValue(9)) {
            complicationStyleBuilder.j = typedArrayObtainAttributes.getColor(9, resources.getColor(R.color.complicationDrawable_iconColor, null));
        }
        if (typedArrayObtainAttributes.hasValue(2)) {
            complicationStyleBuilder.k = typedArrayObtainAttributes.getColor(2, resources.getColor(R.color.complicationDrawable_borderColor, null));
        }
        if (typedArrayObtainAttributes.hasValue(5)) {
            complicationStyleBuilder.n = typedArrayObtainAttributes.getDimensionPixelSize(5, resources.getDimensionPixelSize(R.dimen.complicationDrawable_borderRadius));
        }
        if (typedArrayObtainAttributes.hasValue(6)) {
            complicationStyleBuilder.b(typedArrayObtainAttributes.getInt(6, resources.getInteger(R.integer.complicationDrawable_borderStyle)));
        }
        if (typedArrayObtainAttributes.hasValue(4)) {
            complicationStyleBuilder.l = typedArrayObtainAttributes.getDimensionPixelSize(4, resources.getDimensionPixelSize(R.dimen.complicationDrawable_borderDashWidth));
        }
        if (typedArrayObtainAttributes.hasValue(3)) {
            complicationStyleBuilder.m = typedArrayObtainAttributes.getDimensionPixelSize(3, resources.getDimensionPixelSize(R.dimen.complicationDrawable_borderDashGap));
        }
        if (typedArrayObtainAttributes.hasValue(7)) {
            complicationStyleBuilder.o = typedArrayObtainAttributes.getDimensionPixelSize(7, resources.getDimensionPixelSize(R.dimen.complicationDrawable_borderWidth));
        }
        if (typedArrayObtainAttributes.hasValue(12)) {
            complicationStyleBuilder.p = typedArrayObtainAttributes.getDimensionPixelSize(12, resources.getDimensionPixelSize(R.dimen.complicationDrawable_rangedValueRingWidth));
        }
        if (typedArrayObtainAttributes.hasValue(10)) {
            complicationStyleBuilder.q = typedArrayObtainAttributes.getColor(10, resources.getColor(R.color.complicationDrawable_rangedValuePrimaryColor, null));
        }
        if (typedArrayObtainAttributes.hasValue(13)) {
            complicationStyleBuilder.r = typedArrayObtainAttributes.getColor(13, resources.getColor(R.color.complicationDrawable_rangedValueSecondaryColor, null));
        }
        if (typedArrayObtainAttributes.hasValue(8)) {
            complicationStyleBuilder.s = typedArrayObtainAttributes.getColor(8, resources.getColor(R.color.complicationDrawable_highlightColor, null));
        }
        typedArrayObtainAttributes.recycle();
    }

    private static void setStyleToDefaultValues(ComplicationStyle$Builder complicationStyle$Builder, Resources resources) {
        complicationStyle$Builder.a = resources.getColor(R.color.complicationDrawable_backgroundColor, null);
        complicationStyle$Builder.c = resources.getColor(R.color.complicationDrawable_textColor, null);
        complicationStyle$Builder.d = resources.getColor(R.color.complicationDrawable_titleColor, null);
        complicationStyle$Builder.e = Typeface.create(resources.getString(R.string.complicationDrawable_textTypeface), 0);
        complicationStyle$Builder.f = Typeface.create(resources.getString(R.string.complicationDrawable_titleTypeface), 0);
        complicationStyle$Builder.g = resources.getDimensionPixelSize(R.dimen.complicationDrawable_textSize);
        complicationStyle$Builder.h = resources.getDimensionPixelSize(R.dimen.complicationDrawable_titleSize);
        complicationStyle$Builder.j = resources.getColor(R.color.complicationDrawable_iconColor, null);
        complicationStyle$Builder.k = resources.getColor(R.color.complicationDrawable_borderColor, null);
        complicationStyle$Builder.o = resources.getDimensionPixelSize(R.dimen.complicationDrawable_borderWidth);
        complicationStyle$Builder.n = resources.getDimensionPixelSize(R.dimen.complicationDrawable_borderRadius);
        complicationStyle$Builder.b(resources.getInteger(R.integer.complicationDrawable_borderStyle));
        complicationStyle$Builder.l = resources.getDimensionPixelSize(R.dimen.complicationDrawable_borderDashWidth);
        complicationStyle$Builder.m = resources.getDimensionPixelSize(R.dimen.complicationDrawable_borderDashGap);
        complicationStyle$Builder.p = resources.getDimensionPixelSize(R.dimen.complicationDrawable_rangedValueRingWidth);
        complicationStyle$Builder.q = resources.getColor(R.color.complicationDrawable_rangedValuePrimaryColor, null);
        complicationStyle$Builder.r = resources.getColor(R.color.complicationDrawable_rangedValueSecondaryColor, null);
        complicationStyle$Builder.s = resources.getColor(R.color.complicationDrawable_highlightColor, null);
    }

    private void updateStyleIfRequired() {
        if (this.mIsStyleUpToDate) {
            return;
        }
        this.mComplicationRenderer.g(this.mActiveStyleBuilder.a(), this.mAmbientStyleBuilder.a());
        this.mIsStyleUpToDate = true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x018d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0195  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a0  */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        sp spVar;
        Drawable drawable;
        Drawable drawable2;
        assertInitialized();
        updateStyleIfRequired();
        sq sqVar = this.mComplicationRenderer;
        long j = this.mCurrentTimeMillis;
        boolean z = this.mInAmbientMode;
        boolean z2 = this.mLowBitAmbient;
        boolean z3 = this.mBurnInProtection;
        boolean z4 = this.mIsHighlighted;
        ComplicationData complicationData = sqVar.b;
        if (complicationData == null || (i = complicationData.b) == 2 || i == 1 || j < complicationData.c.getLong("START_TIME", 0L) || j > complicationData.c.getLong("END_TIME", Long.MAX_VALUE) || sqVar.c.isEmpty()) {
            return;
        }
        if (z) {
            sp spVar2 = sqVar.w;
            if (spVar2.j != z2 || spVar2.k != z3) {
                sqVar.w = new sp(sqVar.z, true, z2, z3);
            }
            spVar = sqVar.w;
        } else {
            spVar = sqVar.v;
        }
        if (sqVar.b.h() != null) {
            sqVar.l.e(1);
            sqVar.l.g(sqVar.b.h().a(sqVar.a, j));
            if (sqVar.b.i() != null) {
                sqVar.m.g(sqVar.b.i().a(sqVar.a, j));
            } else {
                sqVar.m.g("");
            }
        }
        if (sqVar.b.f() != null) {
            sqVar.l.g(sqVar.b.f().a(sqVar.a, j));
            if (sqVar.b.g() != null) {
                sqVar.m.g(sqVar.b.g().a(sqVar.a, j));
                sqVar.l.e(1);
            } else {
                sqVar.m.g("");
                sqVar.l.e(2);
            }
        }
        canvas.save();
        canvas.translate(sqVar.c.left, sqVar.c.top);
        int iA = sqVar.a(spVar.h);
        float f = iA;
        canvas.drawRoundRect(sqVar.o, f, f, spVar.f);
        if (spVar.h.c != null && !spVar.a()) {
            sqVar.i.a(spVar.h.c);
            st stVar = sqVar.i;
            stVar.b = iA;
            stVar.setBounds(sqVar.n);
            sqVar.i.draw(canvas);
        }
        if (!sqVar.p.isEmpty() && (drawable = sqVar.d) != null) {
            if (spVar.a() && (drawable2 = sqVar.e) != null) {
                drawable = drawable2;
            }
            drawable.setColorFilter(spVar.l);
            Rect rect = sqVar.p;
            drawable.setBounds(0, 0, rect.width(), rect.height());
            canvas.save();
            canvas.translate(rect.left, rect.top);
            drawable.draw(canvas);
            canvas.restore();
        }
        if (!sqVar.q.isEmpty()) {
            if (spVar.a()) {
                sqVar.k.a(sqVar.g);
                if (sqVar.g != null) {
                    if (sqVar.b.a() == 2) {
                        sqVar.k.setColorFilter(null);
                        sqVar.k.b = 0;
                    } else {
                        sqVar.k.setColorFilter(spVar.h.j);
                        sqVar.k.b = sqVar.b(spVar.h, sqVar.q);
                    }
                    sqVar.k.setBounds(sqVar.q);
                    sqVar.k.draw(canvas);
                }
            } else {
                sqVar.k.a(sqVar.f);
                if (sqVar.f != null) {
                    if (sqVar.b.a() == 2) {
                        sqVar.k.setColorFilter(null);
                        sqVar.k.b = 0;
                    } else {
                        sqVar.k.setColorFilter(spVar.h.j);
                        sqVar.k.b = sqVar.b(spVar.h, sqVar.q);
                    }
                    sqVar.k.setBounds(sqVar.q);
                    sqVar.k.draw(canvas);
                }
            }
        }
        if (!sqVar.r.isEmpty() && !spVar.a()) {
            sqVar.j.a(sqVar.h);
            sqVar.j.b = sqVar.b(spVar.h, sqVar.r);
            sqVar.j.setBounds(sqVar.r);
            sqVar.j.setColorFilter(spVar.h.j);
            sqVar.j.draw(canvas);
        }
        if (!sqVar.u.isEmpty()) {
            ComplicationData complicationData2 = sqVar.b;
            ComplicationData.k("MAX_VALUE", complicationData2.b);
            float f2 = complicationData2.c.getFloat("MAX_VALUE");
            ComplicationData complicationData3 = sqVar.b;
            ComplicationData.k("MIN_VALUE", complicationData3.b);
            float f3 = f2 - complicationData3.c.getFloat("MIN_VALUE");
            float f4 = 0.0f;
            if (f3 > 0.0f) {
                ComplicationData complicationData4 = sqVar.b;
                ComplicationData.k("VALUE", complicationData4.b);
                f4 = complicationData4.c.getFloat("VALUE") / f3;
            }
            float f5 = f4 * 352.0f;
            int iCeil = (int) Math.ceil(spVar.c.getStrokeWidth());
            float f6 = iCeil;
            sqVar.u.inset(f6, f6);
            canvas.drawArc(sqVar.u, -88.0f, f5, false, spVar.c);
            canvas.drawArc(sqVar.u, 4.0f + (-88.0f) + f5, 352.0f - f5, false, spVar.d);
            float f7 = -iCeil;
            sqVar.u.inset(f7, f7);
        }
        if (!sqVar.s.isEmpty()) {
            TextPaint textPaint = sqVar.x;
            TextPaint textPaint2 = spVar.a;
            if (textPaint != textPaint2) {
                sqVar.x = textPaint2;
                sqVar.l.f(sqVar.x);
                sqVar.l.d(spVar.i);
            }
            sqVar.l.a(canvas, sqVar.s);
        }
        if (!sqVar.t.isEmpty()) {
            TextPaint textPaint3 = sqVar.y;
            TextPaint textPaint4 = spVar.b;
            if (textPaint3 != textPaint4) {
                sqVar.y = textPaint4;
                sqVar.m.f(sqVar.y);
                sqVar.m.d(spVar.i);
            }
            sqVar.m.a(canvas, sqVar.t);
        }
        if (z4 && !spVar.i) {
            float fA = sqVar.a(spVar.h);
            canvas.drawRoundRect(sqVar.o, fA, fA, spVar.g);
        }
        sr srVar = spVar.h;
        if (srVar.m != 0) {
            float fA2 = sqVar.a(srVar);
            canvas.drawRoundRect(sqVar.o, fA2, fA2, spVar.e);
        }
        canvas.restore();
    }

    public void draw(Canvas canvas, long j) {
        assertInitialized();
        setCurrentTimeMillis(j);
        draw(canvas);
    }

    sr getActiveStyle() {
        return this.mActiveStyleBuilder.a();
    }

    sr getAmbientStyle() {
        return this.mAmbientStyleBuilder.a();
    }

    sq getComplicationRenderer() {
        return this.mComplicationRenderer;
    }

    public long getHighlightDuration() {
        return this.mHighlightDuration;
    }

    public boolean getLowBitAmbient() {
        return this.mLowBitAmbient;
    }

    CharSequence getNoDataText() {
        return this.mNoDataText;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        this.mIsInflatedFromXml = true;
        int depth = xmlPullParser.getDepth();
        inflateAttributes(resources, xmlPullParser);
        setStyleToDefaultValues(this.mActiveStyleBuilder, resources);
        setStyleToDefaultValues(this.mAmbientStyleBuilder, resources);
        inflateStyle(false, resources, xmlPullParser);
        inflateStyle(true, resources, xmlPullParser);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                break;
            }
            if (next == 3) {
                if (xmlPullParser.getDepth() <= depth) {
                    break;
                }
            } else if (next == 2) {
                String name = xmlPullParser.getName();
                if (TextUtils.equals(name, "ambient")) {
                    inflateStyle(true, resources, xmlPullParser);
                } else {
                    String strValueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 43 + String.valueOf(strValueOf).length());
                    sb.append("Unknown element: ");
                    sb.append(name);
                    sb.append(" for ComplicationDrawable ");
                    sb.append(strValueOf);
                    Log.w(TAG, sb.toString());
                }
            }
        }
        this.mIsStyleUpToDate = false;
    }

    public boolean isHighlighted() {
        return this.mIsHighlighted;
    }

    public boolean isRangedValueProgressHidden() {
        return this.mRangedValueProgressHidden;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        sq sqVar = this.mComplicationRenderer;
        if (sqVar != null) {
            sqVar.h(rect);
        }
    }

    public boolean onTap(int i, int i2) {
        ComplicationData complicationData;
        sq sqVar = this.mComplicationRenderer;
        if (sqVar == null || (complicationData = sqVar.b) == null || ((complicationData.b() == null && complicationData.b != 9) || !getBounds().contains(i, i2))) {
            return false;
        }
        if (complicationData.b == 9) {
            Context context = this.mContext;
            if (!(context instanceof tr)) {
                return false;
            }
            ComponentName componentName = new ComponentName(context, context.getClass());
            Intent intent = new Intent(context, (Class<?>) sh.class);
            intent.setAction("android.support.wearable.complications.ACTION_PERMISSION_REQUEST_ONLY");
            intent.putExtra("android.support.wearable.complications.EXTRA_WATCH_FACE_COMPONENT_NAME", componentName);
            context.startActivity(intent.addFlags(268435456));
        } else {
            try {
                complicationData.b().send();
            } catch (PendingIntent.CanceledException e) {
                return false;
            }
        }
        if (getHighlightDuration() > 0) {
            setIsHighlighted(true);
            invalidateSelf();
            this.mMainThreadHandler.removeCallbacks(this.mUnhighlightRunnable);
            this.mMainThreadHandler.postDelayed(this.mUnhighlightRunnable, getHighlightDuration());
        }
        return true;
    }

    @Deprecated
    public boolean onTap(int i, int i2, long j) {
        return onTap(i, i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    public void setBackgroundColorActive(int i) {
        getComplicationStyleBuilder(false).a = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBackgroundColorAmbient(int i) {
        getComplicationStyleBuilder(true).a = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBackgroundDrawableActive(Drawable drawable) {
        getComplicationStyleBuilder(false).b = drawable;
        this.mIsStyleUpToDate = false;
    }

    public void setBackgroundDrawableAmbient(Drawable drawable) {
        getComplicationStyleBuilder(true).b = drawable;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderColorActive(int i) {
        getComplicationStyleBuilder(false).k = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderColorAmbient(int i) {
        getComplicationStyleBuilder(true).k = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderDashGapActive(int i) {
        getComplicationStyleBuilder(false).m = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderDashGapAmbient(int i) {
        getComplicationStyleBuilder(true).m = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderDashWidthActive(int i) {
        getComplicationStyleBuilder(false).l = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderDashWidthAmbient(int i) {
        getComplicationStyleBuilder(true).l = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderRadiusActive(int i) {
        getComplicationStyleBuilder(false).n = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderRadiusAmbient(int i) {
        getComplicationStyleBuilder(true).n = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderStyleActive(int i) {
        getComplicationStyleBuilder(false).b(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderStyleAmbient(int i) {
        getComplicationStyleBuilder(true).b(i);
        this.mIsStyleUpToDate = false;
    }

    public void setBorderWidthActive(int i) {
        getComplicationStyleBuilder(false).o = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBorderWidthAmbient(int i) {
        getComplicationStyleBuilder(true).o = i;
        this.mIsStyleUpToDate = false;
    }

    public void setBurnInProtection(boolean z) {
        this.mBurnInProtection = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setComplicationData(ComplicationData complicationData) {
        assertInitialized();
        this.mComplicationRenderer.d(complicationData);
    }

    public void setContext(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Argument \"context\" should not be null.");
        }
        if (Objects.equals(context, this.mContext)) {
            return;
        }
        this.mContext = context;
        if (!this.mIsInflatedFromXml && !this.mAlreadyStyled) {
            setStyleToDefaultValues(this.mActiveStyleBuilder, context.getResources());
            setStyleToDefaultValues(this.mAmbientStyleBuilder, context.getResources());
        }
        if (!this.mAlreadyStyled) {
            this.mHighlightDuration = context.getResources().getInteger(R.integer.complicationDrawable_highlightDurationMs);
        }
        sq sqVar = new sq(this.mContext, this.mActiveStyleBuilder.a(), this.mAmbientStyleBuilder.a());
        this.mComplicationRenderer = sqVar;
        sqVar.A = this.mRendererInvalidateListener;
        CharSequence charSequence = this.mNoDataText;
        if (charSequence == null) {
            setNoDataText(context.getString(R.string.complicationDrawable_noDataText));
        } else {
            sqVar.e(charSequence);
        }
        this.mComplicationRenderer.f(this.mRangedValueProgressHidden);
        this.mComplicationRenderer.h(getBounds());
        this.mIsStyleUpToDate = true;
    }

    public void setCurrentTimeMillis(long j) {
        this.mCurrentTimeMillis = j;
    }

    public void setHighlightColorActive(int i) {
        getComplicationStyleBuilder(false).s = i;
        this.mIsStyleUpToDate = false;
    }

    public void setHighlightColorAmbient(int i) {
        getComplicationStyleBuilder(true).s = i;
        this.mIsStyleUpToDate = false;
    }

    public void setHighlightDuration(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Highlight duration should be non-negative.");
        }
        this.mHighlightDuration = j;
    }

    public void setIconColorActive(int i) {
        getComplicationStyleBuilder(false).j = i;
        this.mIsStyleUpToDate = false;
    }

    public void setIconColorAmbient(int i) {
        getComplicationStyleBuilder(true).j = i;
        this.mIsStyleUpToDate = false;
    }

    public void setImageColorFilterActive(ColorFilter colorFilter) {
        getComplicationStyleBuilder(false).i = colorFilter;
        this.mIsStyleUpToDate = false;
    }

    public void setImageColorFilterAmbient(ColorFilter colorFilter) {
        getComplicationStyleBuilder(true).i = colorFilter;
        this.mIsStyleUpToDate = false;
    }

    public void setInAmbientMode(boolean z) {
        this.mInAmbientMode = z;
    }

    public void setIsHighlighted(boolean z) {
        this.mIsHighlighted = z;
    }

    public void setLowBitAmbient(boolean z) {
        this.mLowBitAmbient = z;
    }

    public void setNoDataText(CharSequence charSequence) {
        if (charSequence == null) {
            this.mNoDataText = "";
        } else {
            this.mNoDataText = charSequence.subSequence(0, charSequence.length());
        }
        sq sqVar = this.mComplicationRenderer;
        if (sqVar != null) {
            sqVar.e(this.mNoDataText);
        }
    }

    public void setRangedValuePrimaryColorActive(int i) {
        getComplicationStyleBuilder(false).q = i;
        this.mIsStyleUpToDate = false;
    }

    public void setRangedValuePrimaryColorAmbient(int i) {
        getComplicationStyleBuilder(true).q = i;
        this.mIsStyleUpToDate = false;
    }

    public void setRangedValueProgressHidden(boolean z) {
        this.mRangedValueProgressHidden = z;
        sq sqVar = this.mComplicationRenderer;
        if (sqVar != null) {
            sqVar.f(z);
        }
    }

    public void setRangedValueRingWidthActive(int i) {
        getComplicationStyleBuilder(false).p = i;
        this.mIsStyleUpToDate = false;
    }

    public void setRangedValueRingWidthAmbient(int i) {
        getComplicationStyleBuilder(true).p = i;
        this.mIsStyleUpToDate = false;
    }

    public void setRangedValueSecondaryColorActive(int i) {
        getComplicationStyleBuilder(false).r = i;
        this.mIsStyleUpToDate = false;
    }

    public void setRangedValueSecondaryColorAmbient(int i) {
        getComplicationStyleBuilder(true).r = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTextColorActive(int i) {
        getComplicationStyleBuilder(false).c = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTextColorAmbient(int i) {
        getComplicationStyleBuilder(true).c = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTextSizeActive(int i) {
        getComplicationStyleBuilder(false).g = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTextSizeAmbient(int i) {
        getComplicationStyleBuilder(true).g = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTextTypefaceActive(Typeface typeface) {
        getComplicationStyleBuilder(false).e = typeface;
        this.mIsStyleUpToDate = false;
    }

    public void setTextTypefaceAmbient(Typeface typeface) {
        getComplicationStyleBuilder(true).e = typeface;
        this.mIsStyleUpToDate = false;
    }

    public void setTitleColorActive(int i) {
        getComplicationStyleBuilder(false).d = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTitleColorAmbient(int i) {
        getComplicationStyleBuilder(true).d = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTitleSizeActive(int i) {
        getComplicationStyleBuilder(false).h = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTitleSizeAmbient(int i) {
        getComplicationStyleBuilder(true).h = i;
        this.mIsStyleUpToDate = false;
    }

    public void setTitleTypefaceActive(Typeface typeface) {
        getComplicationStyleBuilder(false).f = typeface;
        this.mIsStyleUpToDate = false;
    }

    public void setTitleTypefaceAmbient(Typeface typeface) {
        getComplicationStyleBuilder(true).f = typeface;
        this.mIsStyleUpToDate = false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(FIELD_ACTIVE_STYLE_BUILDER, this.mActiveStyleBuilder);
        bundle.putParcelable(FIELD_AMBIENT_STYLE_BUILDER, this.mAmbientStyleBuilder);
        bundle.putCharSequence(FIELD_NO_DATA_TEXT, this.mNoDataText);
        bundle.putLong(FIELD_HIGHLIGHT_DURATION, this.mHighlightDuration);
        bundle.putBoolean(FIELD_RANGED_VALUE_PROGRESS_HIDDEN, this.mRangedValueProgressHidden);
        bundle.putParcelable(FIELD_BOUNDS, getBounds());
        parcel.writeBundle(bundle);
    }
}
