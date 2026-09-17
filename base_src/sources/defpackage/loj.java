package defpackage;

import android.hardware.camera2.params.MeteringRectangle;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class loj implements lmq {
    final /* synthetic */ lok a;

    public loj(lok lokVar) {
        this.a = lokVar;
    }

    @Override // defpackage.lmq
    public final Integer a() {
        return this.a.e;
    }

    @Override // defpackage.lmq
    public final Integer b() {
        return this.a.d;
    }

    @Override // defpackage.lmq
    public final Integer c() {
        return this.a.f;
    }

    @Override // defpackage.lmq
    public final Integer d() {
        return this.a.c;
    }

    @Override // defpackage.lmq
    public final Integer e() {
        return this.a.g;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lmq) {
            lmq lmqVar = (lmq) obj;
            if (Objects.equals(d(), lmqVar.d()) && Objects.equals(b(), lmqVar.b()) && Objects.equals(a(), lmqVar.a()) && Objects.equals(c(), lmqVar.c()) && Objects.equals(e(), lmqVar.e()) && Arrays.equals(g(), lmqVar.g()) && Arrays.equals(f(), lmqVar.f()) && Arrays.equals(h(), lmqVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lmq
    public final MeteringRectangle[] f() {
        return this.a.i;
    }

    @Override // defpackage.lmq
    public final MeteringRectangle[] g() {
        return this.a.h;
    }

    @Override // defpackage.lmq
    public final MeteringRectangle[] h() {
        return this.a.j;
    }

    public final int hashCode() {
        lok lokVar = this.a;
        return Objects.hash(lokVar.c, lokVar.d, lokVar.e, lokVar.f, lokVar.g, Integer.valueOf(Arrays.hashCode(lokVar.h)), Integer.valueOf(Arrays.hashCode(this.a.i)), Integer.valueOf(Arrays.hashCode(this.a.j)));
    }
}
