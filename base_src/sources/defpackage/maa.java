package defpackage;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class maa implements mad {
    protected final mad e;

    public maa(mad madVar) {
        this.e = madVar;
    }

    @Override // defpackage.mad
    public final int a() {
        return this.e.a();
    }

    @Override // defpackage.mad
    public final int b() {
        return this.e.b();
    }

    @Override // defpackage.mad
    public final int c() {
        return this.e.c();
    }

    public void close() {
        this.e.close();
    }

    @Override // defpackage.mad
    public long d() {
        return this.e.d();
    }

    @Override // defpackage.mad
    public final Rect e() {
        return this.e.e();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof mad)) {
            return false;
        }
        mad madVar = (mad) obj;
        return madVar.a() == a() && madVar.c() == c() && madVar.b() == b() && madVar.d() == d();
    }

    @Override // defpackage.mad
    public final HardwareBuffer f() {
        return this.e.f();
    }

    @Override // defpackage.mad
    public final List g() {
        return this.e.g();
    }

    @Override // defpackage.mad
    public final void h(Rect rect) {
        this.e.h(rect);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Integer.valueOf(c()), Integer.valueOf(b()), Long.valueOf(d())});
    }

    @Override // defpackage.mad
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.lzl
    public final kkm j() {
        return this.e.j();
    }

    public String toString() {
        return this.e.toString();
    }
}
