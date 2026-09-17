package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
final class ako extends Drawable.ConstantState {
    int a;
    akn b;
    ColorStateList c;
    PorterDuff.Mode d;
    boolean e;
    Bitmap f;
    ColorStateList g;
    PorterDuff.Mode h;
    int i;
    boolean j;
    boolean k;
    Paint l;

    public ako() {
        this.c = null;
        this.d = akq.b;
        this.b = new akn();
    }

    public ako(ako akoVar) {
        this.c = null;
        this.d = akq.b;
        if (akoVar != null) {
            this.a = akoVar.a;
            this.b = new akn(akoVar.b);
            Paint paint = akoVar.b.c;
            if (paint != null) {
                this.b.c = new Paint(paint);
            }
            Paint paint2 = akoVar.b.b;
            if (paint2 != null) {
                this.b.b = new Paint(paint2);
            }
            this.c = akoVar.c;
            this.d = akoVar.d;
            this.e = akoVar.e;
        }
    }

    public final void a(int i, int i2) {
        this.f.eraseColor(0);
        Canvas canvas = new Canvas(this.f);
        akn aknVar = this.b;
        aknVar.a(aknVar.d, akn.a, canvas, i, i2);
    }

    public final boolean b() {
        akn aknVar = this.b;
        if (aknVar.k == null) {
            aknVar.k = Boolean.valueOf(aknVar.d.h());
        }
        return aknVar.k.booleanValue();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new akq(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new akq(this);
    }
}
