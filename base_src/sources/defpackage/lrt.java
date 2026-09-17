package defpackage;

import android.hardware.camera2.params.MeteringRectangle;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class lrt implements lmq {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final MeteringRectangle[] d;
    public final MeteringRectangle[] e;
    public final MeteringRectangle[] f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;

    public lrt(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3) {
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.a = Boolean.valueOf(z);
        this.b = Boolean.valueOf(z2);
        this.c = Boolean.valueOf(z3);
        this.d = meteringRectangleArr;
        this.e = meteringRectangleArr2;
        this.f = meteringRectangleArr3;
    }

    @Override // defpackage.lmq
    public final Integer a() {
        return Integer.valueOf(this.i);
    }

    @Override // defpackage.lmq
    public final Integer b() {
        return Integer.valueOf(this.h);
    }

    @Override // defpackage.lmq
    public final Integer c() {
        return Integer.valueOf(this.j);
    }

    @Override // defpackage.lmq
    public final Integer d() {
        return Integer.valueOf(this.g);
    }

    @Override // defpackage.lmq
    public final Integer e() {
        return Integer.valueOf(this.k);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lrt) {
            lrt lrtVar = (lrt) obj;
            if (Objects.equals(Integer.valueOf(this.g), lrtVar.d()) && Objects.equals(b(), lrtVar.b()) && Objects.equals(a(), lrtVar.a()) && Objects.equals(c(), lrtVar.c()) && Objects.equals(e(), lrtVar.e()) && Arrays.equals(this.d, lrtVar.d) && Arrays.equals(this.e, lrtVar.e) && Arrays.equals(this.f, lrtVar.f) && Objects.equals(this.a, lrtVar.a) && Objects.equals(this.b, lrtVar.b) && Objects.equals(this.c, lrtVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lmq
    public final MeteringRectangle[] f() {
        return this.e;
    }

    @Override // defpackage.lmq
    public final MeteringRectangle[] g() {
        return this.d;
    }

    @Override // defpackage.lmq
    public final MeteringRectangle[] h() {
        return this.f;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), this.a, this.b, this.c);
    }
}
