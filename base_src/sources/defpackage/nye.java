package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes2.dex */
public final class nye {
    public final MaterialButton a;
    public obz b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public boolean n = false;
    public boolean o;
    public LayerDrawable p;
    public int q;

    public nye(MaterialButton materialButton, obz obzVar) {
        this.a = materialButton;
        this.b = obzVar;
    }

    private final obu e(boolean z) {
        LayerDrawable layerDrawable = this.p;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (obu) ((LayerDrawable) ((InsetDrawable) this.p.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    private final obu f() {
        return e(true);
    }

    public final obu a() {
        return e(false);
    }

    public final oci b() {
        LayerDrawable layerDrawable = this.p;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.p.getNumberOfLayers() > 2 ? (oci) this.p.getDrawable(2) : (oci) this.p.getDrawable(1);
    }

    public final void c() {
        this.n = true;
        this.a.c(this.j);
        this.a.d(this.i);
    }

    public final void d(obz obzVar) {
        this.b = obzVar;
        if (a() != null) {
            a().b(obzVar);
        }
        if (f() != null) {
            f().b(obzVar);
        }
        if (b() != null) {
            b().b(obzVar);
        }
    }
}
