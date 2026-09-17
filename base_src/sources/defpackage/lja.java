package defpackage;

import android.os.Trace;

/* JADX INFO: loaded from: classes2.dex */
final class lja implements lji {
    private final int a;
    private final String c;

    public lja(int i, String str) {
        obr.aR(!str.isEmpty(), "Empty msg.");
        this.a = i;
        this.c = str;
        Trace.beginAsyncSection(str, i);
    }

    @Override // defpackage.lji
    public final void a() {
        Trace.endAsyncSection(this.c, this.a);
    }
}
