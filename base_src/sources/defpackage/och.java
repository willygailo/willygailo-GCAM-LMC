package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class och {

    @Deprecated
    public float a;

    @Deprecated
    public float b;

    @Deprecated
    public float c;

    @Deprecated
    public float d;

    @Deprecated
    public float e;
    public final List f = new ArrayList();
    private final List g = new ArrayList();

    public och() {
        e();
    }

    private final void g(float f) {
        float f2 = this.d;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 > 180.0f) {
                return;
            }
            float f4 = this.b;
            float f5 = this.c;
            ocd ocdVar = new ocd(f4, f5, f4, f5);
            ocdVar.e = this.d;
            ocdVar.f = f3;
            this.g.add(new ocg());
            this.d = f;
        }
    }

    final ocg a(Matrix matrix) {
        g(this.e);
        new Matrix(matrix);
        new ArrayList(this.g);
        return new ocg();
    }

    public final void b(ocg ocgVar, float f, float f2) {
        g(f);
        this.g.add(ocgVar);
        this.d = f2;
    }

    public final void c(Matrix matrix, Path path) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            ((ocf) this.f.get(i)).a(matrix, path);
        }
    }

    public final void d(float f, float f2) {
        oce oceVar = new oce();
        oceVar.a = f;
        oceVar.b = f2;
        this.f.add(oceVar);
        occ occVar = new occ(oceVar, this.b, this.c);
        b(occVar, occVar.a() + 270.0f, occVar.a() + 270.0f);
        this.b = f;
        this.c = f2;
    }

    public final void e() {
        f(0.0f, 270.0f, 0.0f);
    }

    public final void f(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
