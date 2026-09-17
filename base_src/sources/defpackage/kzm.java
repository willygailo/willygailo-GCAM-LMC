package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
final class kzm extends kzl {
    public kzm(kjj kjjVar) {
        super(kjjVar);
    }

    @Override // defpackage.kyj
    public final void b(kxt kxtVar) {
        Status statusCc = mip.cc(kxtVar.a);
        kxf kxfVar = kxtVar.b;
        f(new kxe(statusCc, kxfVar == null ? null : new kxd(kxfVar)));
    }
}
