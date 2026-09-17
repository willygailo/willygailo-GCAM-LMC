package defpackage;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: classes2.dex */
public final class kzs extends kym {
    public kkt a;
    public final IntentFilter[] b;

    public kzs(IntentFilter[] intentFilterArr) {
        this.b = intentFilterArr;
    }

    @Override // defpackage.kyn
    public final void b(kxh kxhVar) {
    }

    @Override // defpackage.kyn
    public final void c(DataHolder dataHolder) {
        dataHolder.close();
    }

    @Override // defpackage.kyn
    public final void d(kyw kywVar) {
        kkt kktVar = this.a;
        if (kktVar != null) {
            kktVar.b(new kzr(kywVar));
        }
    }

    @Override // defpackage.kyn
    public final void e(kyw kywVar, kyi kyiVar) {
    }

    @Override // defpackage.kyn
    public final void f() {
    }

    @Override // defpackage.kyn
    public final void g() {
    }

    @Override // defpackage.kyn
    public final void h() {
    }

    @Override // defpackage.kyn
    public final void i() {
    }

    @Override // defpackage.kyn
    public final void j() {
    }

    @Override // defpackage.kyn
    public final void k() {
    }

    public final void l() {
        kkt kktVar = this.a;
        if (kktVar != null) {
            kktVar.a();
        }
        this.a = null;
    }
}
