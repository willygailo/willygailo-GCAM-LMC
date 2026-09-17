package defpackage;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class ckn {
    public final cib a;
    public final jfn b;
    public final lar c;
    public btv d;
    public ie e;
    public final ikm f;

    public ckn(ikm ikmVar, cib cibVar, jfn jfnVar, lar larVar) {
        this.f = ikmVar;
        this.a = cibVar;
        this.b = jfnVar;
        this.c = larVar;
    }

    public final DialogInterface.OnClickListener a() {
        return new ckk(this, 1);
    }

    public final DialogInterface.OnClickListener b() {
        return new ckk(this, 0);
    }

    public final void c() {
        this.c.execute(new ckm(this, 0));
    }
}
