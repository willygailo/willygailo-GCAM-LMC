package defpackage;

import android.app.Dialog;

/* JADX INFO: loaded from: classes2.dex */
public final class kki {
    final /* synthetic */ Dialog a;
    final /* synthetic */ kjl b;

    public kki() {
    }

    public kki(kjl kjlVar, Dialog dialog) {
        this.b = kjlVar;
        this.a = dialog;
    }

    public final void a() {
        this.b.a.b();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
