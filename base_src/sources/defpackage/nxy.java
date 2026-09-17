package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class nxy extends nxr {
    final /* synthetic */ nya a;

    public nxy(nya nyaVar) {
        this.a = nyaVar;
    }

    @Override // defpackage.nxr
    public final void a(View view, int i) {
        if (i == 5) {
            this.a.cancel();
        }
    }

    @Override // defpackage.nxr
    public final void b(View view) {
    }
}
