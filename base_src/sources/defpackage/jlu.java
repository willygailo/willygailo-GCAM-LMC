package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.display.DisplayManager;
import android.transition.Fade;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class jlu implements AutoCloseable, elv {
    final jmn a;
    private final int d;
    private final View e;
    private final boolean f;
    private final boolean g;
    private Date i;
    private final int k;
    private final jmg l;
    public List b = Collections.synchronizedList(new ArrayList());
    private final AtomicBoolean h = new AtomicBoolean(false);
    public Runnable c = isd.j;
    private boolean j = false;

    /* JADX WARN: Code duplicated, block: B:24:0x00dd  */
    public jlu(jmg jmgVar, View view, int i, View view2, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3) {
        view.getClass();
        view2.getClass();
        Context context = view2.getContext();
        final jmn jmnVar = new jmn(context, z3);
        jmnVar.setWillNotDraw(false);
        jmnVar.setLayerType(1, jmnVar.b);
        jmnVar.setLayerType(1, jmnVar.c);
        jmnVar.setOnClickListener(new View.OnClickListener() { // from class: jmh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                jmn jmnVar2 = jmnVar;
                Runnable runnable = jmnVar2.h;
                if (runnable != null) {
                    runnable.run();
                }
                Iterator it = jmnVar2.d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        });
        final DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        displayManager.registerDisplayListener(jmnVar.v, mip.bV(context.getMainLooper()));
        jmnVar.u.add(new Runnable() { // from class: jmk
            @Override // java.lang.Runnable
            public final void run() {
                displayManager.unregisterDisplayListener(jmnVar.v);
            }
        });
        this.a = jmnVar;
        jmnVar.i = view;
        jmnVar.f = new PopupWindow(jmnVar);
        jmnVar.addView(view);
        int i7 = 3;
        if (s(i)) {
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            int i8 = view2.getResources().getDisplayMetrics().heightPixels;
            int height = view2.getHeight();
            if (height == 0) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                height = view2.getMeasuredHeight();
            }
            int i9 = iArr[1];
            if ((i9 > (i8 - i9) - height ? 1 : 2) == i) {
                i7 = i;
            } else {
                i7 = i == 1 ? 2 : 1;
            }
        } else {
            int iR = r(i, view2);
            int[] iArr2 = new int[2];
            view2.getLocationInWindow(iArr2);
            int i10 = view2.getResources().getDisplayMetrics().widthPixels;
            int width = view2.getWidth();
            if (width == 0) {
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                view2.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                width = view2.getMeasuredWidth();
            }
            int i11 = iArr2[0];
            if ((i11 > (i10 - i11) - width ? 5 : 6) == iR) {
                i7 = i;
            } else if (i == 3) {
                i7 = 4;
            }
        }
        this.d = i5;
        this.k = i6;
        this.e = view2;
        this.f = z;
        this.g = z2;
        this.l = jmgVar;
        jmnVar.k = view2;
        View view3 = jmnVar.k;
        if (view3 != null) {
            int[] iArr3 = jmnVar.a;
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
            view3.measure(iMakeMeasureSpec3, iMakeMeasureSpec3);
            view3.getLocationOnScreen(iArr3);
            int measuredWidth = view3.getWidth() == 0 ? view3.getMeasuredWidth() : view3.getWidth();
            int measuredHeight = view3.getHeight() == 0 ? view3.getMeasuredHeight() : view3.getHeight();
            int i12 = iArr3[0];
            int i13 = iArr3[1];
            jmnVar.l = new Rect(i12, i13, measuredWidth + i12, measuredHeight + i13);
        }
        jmnVar.j = i7;
        jmnVar.m = i2;
        jmnVar.n = i3;
        jmnVar.o = i4;
        jmnVar.a();
    }

    static int r(int i, View view) {
        int iF = gl.f(view);
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return iF != 1 ? 5 : 6;
            case 4:
                return iF != 1 ? 6 : 5;
            default:
                throw new IllegalArgumentException();
        }
    }

    static boolean s(int i) {
        return i == 1 || i == 2;
    }

    @Override // defpackage.elv
    public final int a() {
        return this.d;
    }

    @Override // defpackage.elv
    public final elx b() {
        return elx.TOOLTIP;
    }

    @Override // defpackage.elv
    public final /* synthetic */ Object c() {
        return enl.t();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.j) {
            return;
        }
        this.j = true;
        this.c.run();
        this.a.b(false);
        this.a.close();
    }

    @Override // defpackage.elv
    public final /* synthetic */ Runnable d() {
        return null;
    }

    @Override // defpackage.elv
    public final Date e() {
        return this.i;
    }

    @Override // defpackage.elv
    public final void f(Runnable runnable) {
        String strValueOf = String.valueOf(getClass().getName());
        throw new UnsupportedOperationException(strValueOf.length() != 0 ? "Unsupported Operation delayedHide(Runnable) in: ".concat(strValueOf) : new String("Unsupported Operation delayedHide(Runnable) in: "));
    }

    @Override // defpackage.elv
    public final void g() {
        this.a.b(true);
        if (this.h.get()) {
            this.l.a();
        }
    }

    @Override // defpackage.elv
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.elv
    public final void i(Date date) {
        this.i = date;
    }

    @Override // defpackage.elv
    public final void j() {
        Rect rect = new Rect();
        this.e.getGlobalVisibleRect(rect);
        final jmn jmnVar = this.a;
        jmnVar.l = rect;
        final int i = 0;
        jmnVar.setVisibility(0);
        PopupWindow popupWindow = jmnVar.f;
        View view = jmnVar.k;
        final int i2 = 1;
        if (popupWindow != null && view != null) {
            popupWindow.setClippingEnabled(false);
            Fade fade = new Fade();
            fade.setDuration(jmnVar.r);
            fade.setInterpolator(new adt());
            fade.setStartDelay(jmnVar.q);
            popupWindow.setEnterTransition(fade);
            popupWindow.setBackgroundDrawable(new BitmapDrawable(view.getResources(), ""));
            popupWindow.setOutsideTouchable(jmnVar.g);
            popupWindow.setTouchInterceptor(new View.OnTouchListener() { // from class: jmi
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    jmn jmnVar2 = jmnVar;
                    if (motionEvent.getAction() == 1) {
                        if (jmnVar2.g) {
                            jmnVar2.h.run();
                        }
                        Iterator it = jmnVar2.d.iterator();
                        while (it.hasNext()) {
                            ((Runnable) it.next()).run();
                        }
                        return true;
                    }
                    if (motionEvent.getAction() != 4) {
                        return false;
                    }
                    if (!jmnVar2.g) {
                        return true;
                    }
                    jmnVar2.h.run();
                    return true;
                }
            });
            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: jmj
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    List<Pair> list = jmnVar.t;
                    if (list == null) {
                        return;
                    }
                    for (Pair pair : list) {
                        ((Executor) pair.second).execute((Runnable) pair.first);
                    }
                }
            });
            final WeakReference weakReference = new WeakReference((Activity) view.getContext());
            view.post(new Runnable() { // from class: jml
                @Override // java.lang.Runnable
                public final void run() {
                    PopupWindow popupWindow2;
                    View view2;
                    switch (i2) {
                        case 0:
                            jmn jmnVar2 = jmnVar;
                            WeakReference weakReference2 = weakReference;
                            synchronized (jmnVar2.p) {
                                PopupWindow popupWindow3 = jmnVar2.f;
                                Activity activity = (Activity) weakReference2.get();
                                if (activity != null && !activity.isFinishing() && popupWindow3 != null) {
                                    Fade fade2 = new Fade();
                                    fade2.setDuration(jmnVar2.s);
                                    fade2.setInterpolator(new adt());
                                    popupWindow3.setExitTransition(fade2);
                                }
                                break;
                            }
                            return;
                        default:
                            jmn jmnVar3 = jmnVar;
                            WeakReference weakReference3 = weakReference;
                            synchronized (jmnVar3.p) {
                                Activity activity2 = (Activity) weakReference3.get();
                                if (activity2 != null && !activity2.isFinishing() && (popupWindow2 = jmnVar3.f) != null && (view2 = jmnVar3.k) != null) {
                                    popupWindow2.showAtLocation(view2, 0, 0, 0);
                                }
                                break;
                            }
                            return;
                    }
                }
            });
            view.postDelayed(new Runnable() { // from class: jml
                @Override // java.lang.Runnable
                public final void run() {
                    PopupWindow popupWindow2;
                    View view2;
                    switch (i) {
                        case 0:
                            jmn jmnVar2 = jmnVar;
                            WeakReference weakReference2 = weakReference;
                            synchronized (jmnVar2.p) {
                                PopupWindow popupWindow3 = jmnVar2.f;
                                Activity activity = (Activity) weakReference2.get();
                                if (activity != null && !activity.isFinishing() && popupWindow3 != null) {
                                    Fade fade2 = new Fade();
                                    fade2.setDuration(jmnVar2.s);
                                    fade2.setInterpolator(new adt());
                                    popupWindow3.setExitTransition(fade2);
                                }
                                break;
                            }
                            return;
                        default:
                            jmn jmnVar3 = jmnVar;
                            WeakReference weakReference3 = weakReference;
                            synchronized (jmnVar3.p) {
                                Activity activity2 = (Activity) weakReference3.get();
                                if (activity2 != null && !activity2.isFinishing() && (popupWindow2 = jmnVar3.f) != null && (view2 = jmnVar3.k) != null) {
                                    popupWindow2.showAtLocation(view2, 0, 0, 0);
                                }
                                break;
                            }
                            return;
                    }
                }
            }, jmnVar.q);
        }
        List<jlt> list = this.b;
        final jmn jmnVar2 = this.a;
        for (final jlt jltVar : list) {
            if (jltVar.c == 0) {
                jltVar.b.execute(jltVar.a);
            } else {
                jmnVar2.postDelayed(new Runnable() { // from class: jls
                    @Override // java.lang.Runnable
                    public final void run() {
                        jmn jmnVar3 = jmnVar2;
                        jlt jltVar2 = jltVar;
                        PopupWindow popupWindow2 = jmnVar3.f;
                        if (popupWindow2 == null || !popupWindow2.isShowing()) {
                            return;
                        }
                        jltVar2.b.execute(jltVar2.a);
                    }
                }, jltVar.c);
            }
        }
        this.h.set(true);
    }

    @Override // defpackage.elv
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // defpackage.elv
    public final boolean l() {
        return true;
    }

    @Override // defpackage.elv
    public final boolean m() {
        return this.g;
    }

    @Override // defpackage.elv
    public final boolean n() {
        return false;
    }

    @Override // defpackage.elv
    public final boolean o() {
        return !this.f;
    }

    @Override // defpackage.elv
    public final int p() {
        return this.k;
    }

    @Override // defpackage.elv
    public final /* synthetic */ void q(int i, boolean z, boolean z2) {
    }
}
