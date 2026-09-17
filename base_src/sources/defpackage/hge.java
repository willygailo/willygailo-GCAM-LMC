package defpackage;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
final class hge extends TimerTask {
    final /* synthetic */ hgf a;

    public hge(hgf hgfVar) {
        this.a = hgfVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.a.c.execute(new Runnable() { // from class: hgd
            @Override // java.lang.Runnable
            public final void run() {
                hgf hgfVar = this.a.a;
                if (hgfVar.e.booleanValue()) {
                    hgfVar.c(300L);
                } else {
                    hgfVar.a();
                }
            }
        });
    }
}
