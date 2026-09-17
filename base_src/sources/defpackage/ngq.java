package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ngq implements Runnable {
    public final /* synthetic */ pht a;
    public final /* synthetic */ nfm b;
    private final /* synthetic */ int c;

    public /* synthetic */ ngq(nfm nfmVar, pht phtVar, int i) {
        this.c = i;
        this.b = nfmVar;
        this.a = phtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                nfm nfmVar = this.b;
                try {
                    plk.ad(this.a);
                } catch (Exception e) {
                    String str = nfmVar.c;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 73);
                    sb.append("Failed to store account on flag read for: ");
                    sb.append(str);
                    sb.append(" which may lead to stale flags.");
                    Log.w("ProtoDataStoreFlagStore", sb.toString(), e);
                    return;
                }
                break;
            default:
                this.b.d(this.a);
                break;
        }
    }
}
