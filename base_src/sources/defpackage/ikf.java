package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ikf implements oiu {
    final /* synthetic */ ikh a;

    public ikf(ikh ikhVar) {
        this.a = ikhVar;
    }

    @Override // defpackage.oiu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            ((ayu) obj).h(this.a.c);
            return null;
        } catch (IOException e) {
            ((oug) ((oug) ikh.a.b()).G((char) 2974)).o("Purge cache failed.");
            return null;
        }
    }
}
