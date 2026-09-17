package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Handler;
import android.os.Looper;
import android.support.wearable.complications.ComplicationData;
import android.support.wearable.complications.ComplicationText;
import android.text.Layout;
import android.text.TextPaint;
import j$.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class sq {
    public so A;
    private boolean C;
    private boolean D;
    private sr F;
    public final Context a;
    public ComplicationData b;
    public Drawable d;
    public Drawable e;
    public Drawable f;
    public Drawable g;
    public Drawable h;
    public sr z;
    public final Rect c = new Rect();
    private CharSequence B = "";
    public final st i = new st();
    public final st j = new st();
    public final st k = new st();
    public final su l = new su();
    public final su m = new su();
    public final Rect n = new Rect();
    public final RectF o = new RectF();
    public final Rect p = new Rect();
    public final Rect q = new Rect();
    public final Rect r = new Rect();
    public final Rect s = new Rect();
    public final Rect t = new Rect();
    private final Rect E = new Rect();
    public final RectF u = new RectF();
    public sp v = null;
    public sp w = null;
    public TextPaint x = null;
    public TextPaint y = null;

    public sq(Context context, sr srVar, sr srVar2) {
        this.a = context;
        g(srVar, srVar2);
    }

    private final void i() {
        sx taVar;
        Layout.Alignment alignmentI;
        if (this.b == null || this.c.isEmpty()) {
            return;
        }
        this.n.set(0, 0, this.c.width(), this.c.height());
        this.o.set(0.0f, 0.0f, this.c.width(), this.c.height());
        ComplicationData complicationData = this.b;
        switch (complicationData.b) {
            case 3:
            case 9:
                taVar = new ta();
                break;
            case 4:
                taVar = new sy();
                break;
            case 5:
                if (!this.C) {
                    taVar = new sz();
                } else if (complicationData.h() != null) {
                    taVar = new ta();
                } else {
                    taVar = new sv();
                }
                break;
            case 6:
                taVar = new sv();
                break;
            case 7:
                taVar = new tb();
                break;
            case 8:
                taVar = new sw();
                break;
            default:
                taVar = new sx();
                break;
        }
        taVar.u(this.c.width(), this.c.height(), this.b);
        taVar.n(this.E);
        this.u.set(this.E);
        taVar.a(this.p);
        taVar.q(this.q);
        taVar.b(this.r);
        if (this.b.b == 4) {
            alignmentI = taVar.g();
            taVar.l(this.s);
            this.l.b(alignmentI);
            this.l.c(taVar.c());
            taVar.m(this.t);
            this.m.b(taVar.h());
            this.m.c(taVar.d());
        } else {
            alignmentI = taVar.i();
            taVar.o(this.s);
            this.l.b(alignmentI);
            this.l.c(taVar.e());
            taVar.p(this.t);
            this.m.b(taVar.j());
            this.m.c(taVar.f());
        }
        if (alignmentI != Layout.Alignment.ALIGN_CENTER) {
            float fHeight = this.c.height() * 0.1f;
            this.l.i(fHeight / this.s.width());
            this.m.i(fHeight / this.s.width());
        } else {
            this.l.i(0.0f);
            this.m.i(0.0f);
        }
        Rect rect = new Rect();
        Rect rect2 = this.n;
        int iMax = Math.max(a(this.F), a(this.z));
        rect.set(rect2);
        double dSqrt = Math.sqrt(2.0d) - 1.0d;
        double d = iMax;
        Double.isNaN(d);
        int iCeil = (int) Math.ceil(dSqrt * d);
        rect.inset(iCeil, iCeil);
        if (!this.s.intersect(rect)) {
            this.s.setEmpty();
        }
        if (!this.t.intersect(rect)) {
            this.t.setEmpty();
        }
        if (!this.p.isEmpty()) {
            Rect rect3 = this.p;
            gi.i(rect3, rect3, 1.0f);
            gi.c(this.p, rect);
        }
        if (!this.q.isEmpty()) {
            Rect rect4 = this.q;
            gi.i(rect4, rect4, 0.95f);
            if (this.b.a() == 2) {
                gi.c(this.q, rect);
            }
        }
        if (this.r.isEmpty()) {
            return;
        }
        Rect rect5 = this.r;
        gi.i(rect5, rect5, 1.0f);
    }

    public final int a(sr srVar) {
        if (this.c.isEmpty()) {
            return 0;
        }
        return Math.min(Math.min(this.c.height(), this.c.width()) / 2, srVar.p);
    }

    public final int b(sr srVar, Rect rect) {
        if (this.c.isEmpty()) {
            return 0;
        }
        return Math.max(a(srVar) - Math.min(Math.min(rect.left, this.c.width() - rect.right), Math.min(rect.top, this.c.height() - rect.bottom)), 0);
    }

    public final void c() {
        so soVar = this.A;
        if (soVar != null) {
            soVar.a();
        }
    }

    public final void d(ComplicationData complicationData) {
        Icon icon;
        Icon icon2;
        Icon iconD;
        Icon icon3;
        boolean z;
        if (Objects.equals(this.b, complicationData)) {
            return;
        }
        Icon iconC = null;
        if (complicationData == null) {
            this.b = null;
            return;
        }
        boolean z2 = true;
        if (complicationData.b != 10) {
            this.b = complicationData;
            this.D = false;
        } else {
            if (this.D) {
                return;
            }
            this.D = true;
            sg sgVar = new sg(3);
            ComplicationText complicationText = new ComplicationText(this.B);
            ComplicationData.j("SHORT_TEXT", sgVar.a);
            sgVar.b.putParcelable("SHORT_TEXT", complicationText);
            this.b = sgVar.a();
        }
        Handler handler = new Handler(Looper.getMainLooper());
        this.d = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.e = null;
        ComplicationData complicationData2 = this.b;
        if (complicationData2 != null) {
            iconC = complicationData2.c();
            ComplicationData complicationData3 = this.b;
            ComplicationData.k("ICON_BURN_IN_PROTECTION", complicationData3.b);
            icon = (Icon) complicationData3.e("ICON_BURN_IN_PROTECTION");
            ComplicationData complicationData4 = this.b;
            ComplicationData.k("SMALL_IMAGE_BURN_IN_PROTECTION", complicationData4.b);
            icon2 = (Icon) complicationData4.e("SMALL_IMAGE_BURN_IN_PROTECTION");
            iconD = this.b.d();
            ComplicationData complicationData5 = this.b;
            ComplicationData.k("LARGE_IMAGE", complicationData5.b);
            icon3 = (Icon) complicationData5.e("LARGE_IMAGE");
        } else {
            icon = null;
            icon2 = null;
            iconD = null;
            icon3 = null;
        }
        if (iconC != null) {
            iconC.loadDrawableAsync(this.a, new sn(this, 1), handler);
            z = true;
        } else {
            z = false;
        }
        if (icon != null) {
            icon.loadDrawableAsync(this.a, new sn(this, 0), handler);
            z = true;
        }
        if (iconD != null) {
            iconD.loadDrawableAsync(this.a, new sn(this, 2), handler);
            z = true;
        }
        if (icon2 != null) {
            icon2.loadDrawableAsync(this.a, new sn(this, 3), handler);
        } else {
            z2 = z;
        }
        if (icon3 != null) {
            icon3.loadDrawableAsync(this.a, new sn(this, 4), handler);
        } else if (!z2) {
            c();
        }
        i();
    }

    public final void e(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        this.B = charSequence.subSequence(0, charSequence.length());
        if (this.D) {
            this.D = false;
            d(new sg(10).a());
        }
    }

    public final void f(boolean z) {
        if (this.C != z) {
            this.C = z;
            i();
        }
    }

    public final void g(sr srVar, sr srVar2) {
        this.F = srVar;
        this.z = srVar2;
        this.v = new sp(srVar, false, false, false);
        this.w = new sp(srVar2, true, false, false);
        i();
    }

    public final void h(Rect rect) {
        boolean z = true;
        if (this.c.width() == rect.width() && this.c.height() == rect.height()) {
            z = false;
        }
        this.c.set(rect);
        if (z) {
            i();
        }
    }
}
