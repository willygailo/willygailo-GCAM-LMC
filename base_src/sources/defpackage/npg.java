package defpackage;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class npg implements Callable {
    final /* synthetic */ ais a;
    final /* synthetic */ npj b;

    public npg(npj npjVar, ais aisVar) {
        this.b = npjVar;
        this.a = aisVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.b.a.h();
        try {
            Cursor cursorI = fy.i(this.b.a, this.a, false);
            try {
                prl prlVarH = null;
                Long lValueOf = null;
                if (cursorI.moveToFirst()) {
                    if (!cursorI.isNull(0)) {
                        lValueOf = Long.valueOf(cursorI.getLong(0));
                    }
                    prlVarH = npy.h(lValueOf);
                }
                this.b.a.j();
                cursorI.close();
                this.a.j();
                this.b.a.i();
                return prlVarH;
            } catch (Throwable th) {
                cursorI.close();
                this.a.j();
                throw th;
            }
        } catch (Throwable th2) {
            this.b.a.i();
            throw th2;
        }
    }
}
