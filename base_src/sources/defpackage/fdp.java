package defpackage;

import android.opengl.GLES20;
import java.nio.ShortBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fdp extends fcp {
    public ShortBuffer i;
    public int f = 0;
    public int g = 0;
    public boolean h = false;
    public fcr j = null;
    public final ArrayList k = new ArrayList();
    public boolean l = true;
    public boolean m = true;

    public final void b() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kus kusVar = (kus) arrayList.get(i);
            if (kusVar != null) {
                kusVar.e();
            }
        }
        this.k.clear();
    }

    @Override // defpackage.fcp
    public final void c(float[] fArr) throws fcq {
        fcr fcrVar;
        if (this.h) {
            if (this.m) {
                this.e.c();
                this.e.g(this.a);
                this.e.e(this.b);
                this.e.f(fArr);
                if (this.d.size() > 0) {
                    ((kus) this.d.get(0)).f();
                }
                GLES20.glDrawElements(4, this.f, 5123, this.c);
            }
            if (!this.l || (fcrVar = this.j) == null) {
                return;
            }
            fcrVar.c();
            this.j.g(this.a);
            this.j.f(fArr);
            GLES20.glLineWidth(9.0f);
            GLES20.glDrawElements(2, this.g, 5123, this.i);
            GLES20.glDrawElements(0, this.g, 5123, this.i);
        }
    }

    public final void e(int i) {
        if (this.d.size() == 0) {
            return;
        }
        ((kus) this.d.get(0)).a = i;
    }
}
