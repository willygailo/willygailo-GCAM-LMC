package defpackage;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public final class jbn extends jbm {
    private final float[] j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbn(float[] fArr, boolean z, boolean z2) {
        super(false, z, z2);
        boolean z3 = false;
        this.j = fArr;
        if ((!z && fArr.length == 2) || fArr.length == 3) {
            z3 = true;
        }
        obr.aQ(z3);
    }

    @Override // defpackage.jbm
    public final void a(RectF rectF) {
        if (!this.h) {
            this.a = Math.round(rectF.width() * this.j[0]);
            this.b = Math.round(rectF.width() * this.j[1]);
            this.c = Math.round(rectF.height() * this.j[0]);
            this.d = Math.round(rectF.height() * this.j[1]);
            return;
        }
        this.a = Math.round(rectF.width() * this.j[0]);
        this.e = Math.round(rectF.width() * this.j[1]);
        this.b = Math.round(rectF.width() * this.j[2]);
        this.c = Math.round(rectF.height() * this.j[0]);
        this.f = Math.round(rectF.height() * this.j[1]);
        this.d = Math.round(rectF.height() * this.j[2]);
    }
}
