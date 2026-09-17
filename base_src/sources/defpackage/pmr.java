package defpackage;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class pmr {
    public Uri a;
    public Bitmap b;
    public Long c;
    public pmh d;
    public Integer e;
    public Integer f;
    public PointF g;

    public pmr() {
    }

    public pmr(pms pmsVar) {
        this.a = pmsVar.a;
        this.b = pmsVar.b;
        this.c = pmsVar.c;
        this.d = pmsVar.d;
        this.e = pmsVar.e;
        this.f = pmsVar.f;
        this.g = pmsVar.g;
    }

    public final pms a() {
        return new pms(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
