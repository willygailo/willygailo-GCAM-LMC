package com.google.android.apps.camera.rewind;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.VibrationEffect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.hmq;
import defpackage.hmy;
import defpackage.hnk;
import defpackage.mip;
import defpackage.oug;
import defpackage.ouj;
import defpackage.ovl;
import j$.util.function.Consumer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RewindThumbnailScrollView extends HorizontalScrollView {
    private static final ouj h = ouj.h("com/google/android/apps/camera/rewind/RewindThumbnailScrollView");
    public SparseArray a;
    public final Context b;
    public final Drawable c;
    public final FrameLayout.LayoutParams d;
    public int e;
    public ObjectAnimator f;
    public hmq g;
    private final int i;
    private final PropertyValuesHolder j;
    private LayoutInflater k;
    private int l;
    private int m;
    private int n;
    private int o;

    public RewindThumbnailScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = -1;
        this.o = -1;
        this.b = context;
        Drawable drawable = context.getDrawable(R.drawable.mcfly_high_quality_thumbnail_dot);
        drawable.getClass();
        this.c = drawable;
        this.i = getResources().getDimensionPixelSize(R.dimen.mcfly_thumbnails_height);
        this.d = new FrameLayout.LayoutParams(-2, -1, 83);
        this.j = PropertyValuesHolder.ofFloat("translationY", 0.0f, -7.0f);
    }

    public final int a() {
        if (this.a != null) {
            return this.o;
        }
        ((oug) ((oug) h.c().g(ovl.a, "McFlyThumbnailScrollView")).G(2569)).p("Thumbnail scroller is uninitialized, returning %d", -1);
        return -1;
    }

    public final synchronized int b() {
        d("Cannot get the maximum scrollable X when uninitialized.");
        return this.l;
    }

    public final int c(int i) {
        int i2 = this.l;
        return Math.min(i2, Math.max(0, (i * i2) / this.m));
    }

    public final void d(String str) {
        if (this.a == null) {
            throw new IllegalStateException(str);
        }
    }

    public final synchronized void e(List list, int i) {
        int i2 = this.i;
        int i3 = (i - i2) / 2;
        int size = (i2 * list.size()) / 4;
        this.l = ((i3 + i3) + size) - i;
        this.m = list.size() - 1;
        int i4 = this.l;
        int size2 = list.size();
        this.n = i4 / (size2 + size2);
        this.a = new SparseArray(list.size());
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mcfly_thumbnails);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
        marginLayoutParams.setMarginStart(i3);
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.width = size;
        linearLayout.setLayoutParams(marginLayoutParams);
        linearLayout.setClipToOutline(true);
        this.d.leftMargin = (i3 + (this.i / 2)) - (this.c.getIntrinsicWidth() / 2);
        for (int i5 = 0; i5 < list.size(); i5 += 4) {
            FrameLayout frameLayout = (FrameLayout) this.k.inflate(R.layout.mcfly_thumbnail, (ViewGroup) null);
            ImageView imageView = (ImageView) frameLayout.findViewById(R.id.mcfly_thumbnail_image);
            imageView.setImageBitmap(((hnk) list.get(i5)).d());
            int i6 = this.i;
            imageView.setLayoutParams(new FrameLayout.LayoutParams(i6, i6));
            linearLayout.addView(frameLayout);
        }
    }

    public final void f(int i) {
        if (this.f == null) {
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "scrollX", getScrollX(), c(i));
            objectAnimatorOfInt.setAutoCancel(true);
            objectAnimatorOfInt.setDuration(120L);
            objectAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
            objectAnimatorOfInt.addListener(mip.ev(new Consumer() { // from class: hnc
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    this.a.f = null;
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer.CC.$default$andThen(this, consumer);
                }
            }));
            this.f = objectAnimatorOfInt;
            objectAnimatorOfInt.start();
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.k = LayoutInflater.from(getContext());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f == null && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.a == null) {
            return;
        }
        int i5 = this.n;
        int i6 = this.m;
        int iMin = Math.min(i6, Math.max(0, ((i + i5) * i6) / this.l));
        int i7 = this.o;
        if (i7 != iMin) {
            View view = (View) this.a.get(i7);
            View view2 = (View) this.a.get(iMin);
            if (view != null) {
                ObjectAnimator.ofPropertyValuesHolder(view, this.j).reverse();
            }
            if (view2 != null) {
                ObjectAnimator.ofPropertyValuesHolder(view2, this.j).start();
            }
            this.o = iMin;
            hmq hmqVar = this.g;
            if (hmqVar != null) {
                hmy hmyVar = hmqVar.a;
                List list = hmqVar.b;
                ImageView imageView = hmqVar.c;
                RewindExportShotView rewindExportShotView = hmqVar.d;
                hnk hnkVar = (hnk) list.get(iMin);
                boolean zB = hmyVar.j.b(hnkVar);
                imageView.setImageDrawable(hmyVar.v(hnkVar));
                String str = zB ? rewindExportShotView.a : rewindExportShotView.b;
                if (!((TextView) rewindExportShotView.getCurrentView()).getText().toString().equals(str)) {
                    rewindExportShotView.setText(str);
                }
                if (zB) {
                    hmyVar.g.d(VibrationEffect.createOneShot(50L, -1));
                }
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a != null && motionEvent.getAction() == 1) {
            SparseArray sparseArray = this.a;
            sparseArray.getClass();
            if (sparseArray.get(this.o) != null) {
                f(this.o);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
