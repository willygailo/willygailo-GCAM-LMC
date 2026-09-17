package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ngs implements Runnable {
    public final /* synthetic */ pht a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ ngs(pht phtVar, String str, int i) {
        this.c = i;
        this.a = phtVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                pht phtVar = this.a;
                String str = this.b;
                int i = ngt.a;
                try {
                    plk.ad(phtVar);
                } catch (ExecutionException e) {
                    String.valueOf(str).length();
                    return;
                }
                break;
            default:
                pht phtVar2 = this.a;
                String str2 = this.b;
                try {
                    plk.ad(phtVar2);
                } catch (Throwable th) {
                    if (th instanceof CancellationException) {
                        return;
                    }
                    ((oug) ((oug) ((oug) fqq.a.c()).h(th)).G((char) 1912)).r("%s: muxer result failed", str2);
                    return;
                }
                break;
        }
    }
}
