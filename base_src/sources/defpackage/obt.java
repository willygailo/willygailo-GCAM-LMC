package defpackage;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class obt extends Drawable.ConstantState {
    public obz a;
    public nyl b;
    public ColorFilter c;
    public ColorStateList d;
    public ColorStateList e;
    public ColorStateList f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public Rect i;
    public float j;
    public float k;
    public float l;
    public int m;
    public float n;
    public float o;
    public float p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public Paint.Style v;

    public obt(obt obtVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = 255;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint.Style.FILL_AND_STROKE;
        this.a = obtVar.a;
        this.b = obtVar.b;
        this.l = obtVar.l;
        this.c = obtVar.c;
        this.d = obtVar.d;
        this.e = obtVar.e;
        this.h = obtVar.h;
        this.g = obtVar.g;
        this.m = obtVar.m;
        this.j = obtVar.j;
        this.s = obtVar.s;
        int i = obtVar.q;
        this.q = 0;
        boolean z = obtVar.u;
        this.u = false;
        this.k = obtVar.k;
        this.n = obtVar.n;
        this.o = obtVar.o;
        float f = obtVar.p;
        this.p = 0.0f;
        this.r = obtVar.r;
        int i2 = obtVar.t;
        this.t = 0;
        ColorStateList colorStateList = obtVar.f;
        this.f = null;
        this.v = obtVar.v;
        Rect rect = obtVar.i;
        if (rect != null) {
            this.i = new Rect(rect);
        }
    }

    public obt(obz obzVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = 255;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint.Style.FILL_AND_STROKE;
        this.a = obzVar;
        this.b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        obu obuVar = new obu(this);
        obuVar.e = true;
        return obuVar;
    }
}
