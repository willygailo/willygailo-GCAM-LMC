package defpackage;

import android.widget.Toast;

/* JADX INFO: loaded from: classes.dex */
final class djr implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ djs b;

    public djr(djs djsVar, String str) {
        this.b = djsVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(this.b.a, this.a, 1).show();
    }
}
