package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class bhq implements bcl, bch {
    private final Resources a;
    private final bcl b;

    private bhq(Resources resources, bcl bclVar) {
        aae.s(resources);
        this.a = resources;
        aae.s(bclVar);
        this.b = bclVar;
    }

    public static bcl f(Resources resources, bcl bclVar) {
        if (bclVar == null) {
            return null;
        }
        return new bhq(resources, bclVar);
    }

    @Override // defpackage.bcl
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.bcl
    public final Class b() {
        return BitmapDrawable.class;
    }

    @Override // defpackage.bcl
    public final /* bridge */ /* synthetic */ Object c() {
        return new BitmapDrawable(this.a, (Bitmap) this.b.c());
    }

    @Override // defpackage.bch
    public final void d() {
        bcl bclVar = this.b;
        if (bclVar instanceof bch) {
            ((bch) bclVar).d();
        }
    }

    @Override // defpackage.bcl
    public final void e() {
        this.b.e();
    }
}
