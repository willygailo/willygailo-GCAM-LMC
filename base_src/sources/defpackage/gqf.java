package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gqf implements pys {
    private final qkg a;
    private final qkg b;
    private final /* synthetic */ int c;

    public gqf(qkg qkgVar, qkg qkgVar2, int i) {
        this.c = i;
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public gqf(qkg qkgVar, qkg qkgVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public gqf(qkg qkgVar, qkg qkgVar2, int i, char[] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public gqf(qkg qkgVar, qkg qkgVar2, int i, int[] iArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public gqf(qkg qkgVar, qkg qkgVar2, int i, short[] sArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public static gqf a(qkg qkgVar, qkg qkgVar2) {
        return new gqf(qkgVar, qkgVar2, 0);
    }

    public final Boolean b() {
        boolean z = true;
        switch (this.c) {
            case 0:
                return Boolean.valueOf(gqe.f((ojc) this.a.get(), (Map) this.b.get()));
            case 1:
                lda ldaVar = (lda) this.b.get();
                ddf ddfVar = (ddf) this.a.get();
                CaptureRequest.Key key = kdd.d;
                boolean zK = ddfVar.k(ddd.b);
                boolean zBooleanValue = ((Boolean) ldaVar.fA()).booleanValue();
                ddfVar.d();
                if (key == null || !zK || !zBooleanValue) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                ddf ddfVar2 = (ddf) this.b.get();
                if (((bpk) this.a).a().booleanValue()) {
                    ddi ddiVar = dcu.a;
                    ddfVar2.d();
                }
                return false;
            case 3:
                return Boolean.valueOf(mip.eh((lzh) this.b.get(), (lzi) this.a.get()));
            default:
                ojc ojcVar = (ojc) ((pyt) this.b).a;
                return Boolean.valueOf(ojcVar.g() && ((Boolean) ojcVar.c()).booleanValue() && ((Boolean) this.a.get()).booleanValue());
        }
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.c) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return b();
    }
}
