package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class awo implements awm {
    public final awm a;
    private final Handler b;

    public awo(Handler handler, awm awmVar) {
        this.b = handler;
        this.a = awmVar;
    }

    @Override // defpackage.awm
    public final void a() {
        this.b.post(new awn(this));
    }
}
