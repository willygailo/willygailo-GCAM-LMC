package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class nxv implements ft {
    final /* synthetic */ nya a;

    public nxv(nya nyaVar) {
        this.a = nyaVar;
    }

    @Override // defpackage.ft
    public final gy a(View view, gy gyVar) {
        nya nyaVar = this.a;
        nxr nxrVar = nyaVar.g;
        if (nxrVar != null) {
            nyaVar.a.y.remove(nxrVar);
        }
        nya nyaVar2 = this.a;
        nyaVar2.g = new nxz(nyaVar2.b, gyVar);
        nya nyaVar3 = this.a;
        nyaVar3.a.A(nyaVar3.g);
        return gyVar;
    }
}
