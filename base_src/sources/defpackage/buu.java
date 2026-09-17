package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class buu implements bur {
    private final qkg a;
    private final qkg b;

    public buu(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar2;
        this.b = qkgVar;
    }

    @Override // defpackage.bur
    public final void a(Throwable th) {
        iio iioVar = (iio) this.a.get();
        int iA = iioVar != null ? iioVar.a() : 0;
        if (th instanceof lvz) {
            ((fjs) this.b.get()).S(12, null, th, -1, -1, iA, oom.l(), oom.l(), lju.CAMERAS_NOT_ENUMERATED, false);
        } else if (th instanceof lvy) {
            ((fjs) this.b.get()).S(11, null, th.getCause(), -1, -1, iA, oom.l(), new ArrayList(), lju.a(((lvy) th).a), false);
        } else {
            ((fjs) this.b.get()).A(th, iA);
        }
    }
}
