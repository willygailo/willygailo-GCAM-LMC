package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class eea implements Runnable {
    public final lnc a;
    public final lnx b;
    private final lco c;
    private final lco d;
    private final lap e;
    private final Executor f;

    public eea(lnc lncVar, Map map, lco lcoVar, lco lcoVar2, lap lapVar, Executor executor) {
        this.a = lncVar;
        lnx lnxVar = (lnx) map.get(hdr.RAW_ULTRAWIDE);
        lnxVar.getClass();
        this.b = lnxVar;
        this.c = lcoVar;
        this.d = lcoVar2;
        this.e = lapVar;
        this.f = executor;
    }

    private final void a(lco lcoVar, final boolean z, String str) {
        this.e.c(lcoVar.a(new lij() { // from class: edz
            @Override // defpackage.lij
            public final void fB(Object obj) {
                eea eeaVar = this.a;
                if (((Boolean) obj).booleanValue() == z) {
                    ovd ovdVar = ovl.a;
                    eeaVar.a.e(eeaVar.b, false);
                }
            }
        }, this.f));
    }

    @Override // java.lang.Runnable
    public final void run() {
        a(this.c, true, "standby");
        a(this.d, false, "delayed");
    }
}
