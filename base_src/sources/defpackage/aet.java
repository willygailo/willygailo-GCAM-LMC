package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class aet {
    public final aeb a;
    private final Handler b = new Handler();
    private aes c;

    public aet(aee aeeVar) {
        this.a = new aeb(aeeVar);
    }

    public final void a(adz adzVar) {
        aes aesVar = this.c;
        if (aesVar != null) {
            aesVar.run();
        }
        aes aesVar2 = new aes(this.a, adzVar);
        this.c = aesVar2;
        this.b.postAtFrontOfQueue(aesVar2);
    }
}
