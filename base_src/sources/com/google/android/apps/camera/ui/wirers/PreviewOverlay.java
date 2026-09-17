package com.google.android.apps.camera.ui.wirers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import defpackage.jqq;
import defpackage.jxf;
import defpackage.jxn;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class PreviewOverlay extends View {
    public GestureDetector a;
    public View.OnTouchListener b;
    public boolean c;
    public boolean d;
    public jqq e;
    private final int[] f;

    public PreviewOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new int[]{0, 0};
        this.a = null;
        this.b = null;
        this.c = true;
        this.d = true;
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getLocationInWindow(this.f);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        jqq jqqVar;
        int i;
        if (!this.c) {
            return true;
        }
        if (!this.d || (jqqVar = this.e) == null) {
            GestureDetector gestureDetector = this.a;
            if (gestureDetector != null) {
                gestureDetector.onTouchEvent(motionEvent);
            }
            View.OnTouchListener onTouchListener = this.b;
            if (onTouchListener != null) {
                onTouchListener.onTouch(this, motionEvent);
            }
            return true;
        }
        jxn jxnVar = jqqVar.a;
        switch (motionEvent.getActionMasked()) {
            case 0:
                jxnVar.e.a(jxnVar.a(motionEvent));
                break;
            case 1:
                jxnVar.b().b();
                jxnVar.e.b();
                jxnVar.n = 0.0f;
                jxnVar.m = 0.0f;
                jxnVar.q = 1;
                jxnVar.k = false;
                jxnVar.l = false;
                jxnVar.o = 0;
                break;
            case 3:
                jxnVar.b().g();
                (jxnVar.l ? jxnVar.e : jxf.m).g();
                jxnVar.o = 0;
                break;
            case 5:
                i = jxnVar.o + 1;
                jxnVar.o = i;
                break;
            case 6:
                i = jxnVar.o - 1;
                jxnVar.o = i;
                break;
        }
        if (jxnVar.k) {
            jxnVar.d.onTouchEvent(motionEvent);
        } else if (jxnVar.q != 1 || jxnVar.l) {
            jxnVar.c.onTouchEvent(motionEvent);
        } else {
            jxnVar.d.onTouchEvent(motionEvent);
            jxnVar.c.onTouchEvent(motionEvent);
        }
        return true;
    }
}
