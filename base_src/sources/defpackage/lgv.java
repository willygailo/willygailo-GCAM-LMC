package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lgv implements pgj {
    public final /* synthetic */ lgy a;
    private final /* synthetic */ int b;

    public /* synthetic */ lgv(lgy lgyVar, int i) {
        this.b = i;
        this.a = lgyVar;
    }

    @Override // defpackage.pgj
    public final pht a() {
        switch (this.b) {
            case 0:
                lgy lgyVar = this.a;
                lgyVar.b.i();
                lff lffVar = lgyVar.g;
                if (lffVar != null) {
                    lgyVar.b.g(lffVar);
                }
                lfi lfiVar = lgyVar.d;
                if (lfiVar != null) {
                    lfiVar.close();
                }
                lfm lfmVar = lgyVar.e;
                if (lfmVar != null) {
                    lfmVar.close();
                }
                for (lfd lfdVar : lgyVar.f.values()) {
                    lfdVar.c();
                    lfdVar.close();
                }
                lgyVar.b.close();
                synchronized (lgyVar.a) {
                    lgyVar.l = 4;
                    break;
                }
                return phq.a;
            default:
                lgy lgyVar2 = this.a;
                synchronized (lgyVar2.a) {
                    lgyVar2.l = 2;
                    break;
                }
                lge lgeVar = lgyVar2.c;
                if (!lgeVar.e) {
                    boolean z = lgeVar.f;
                    synchronized (lgeVar.c) {
                        lgeVar.i = TimeUnit.MILLISECONDS.toMicros(SystemClock.uptimeMillis());
                        lgeVar.c();
                        break;
                    }
                }
                return phq.a;
        }
    }
}
