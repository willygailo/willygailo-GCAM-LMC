package defpackage;

import android.hardware.HardwareBuffer;

/* JADX INFO: loaded from: classes.dex */
final class egc implements phh {
    final /* synthetic */ jtk a;
    final /* synthetic */ edt b;
    final /* synthetic */ long c;
    final /* synthetic */ egd d;
    final /* synthetic */ msq e;

    public egc(egd egdVar, jtk jtkVar, edt edtVar, long j, msq msqVar, byte[] bArr) {
        this.d = egdVar;
        this.a = jtkVar;
        this.b = edtVar;
        this.c = j;
        this.e = msqVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        this.a.close();
        this.d.e(this.c, oih.a);
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        gjx gjxVar = (gjx) obj;
        this.d.d |= gjxVar != null;
        this.a.close();
        if (gjxVar == null) {
            ((oug) ((oug) ege.b.b()).G(1135)).r("Error encoding the image: %s", this.b);
            this.d.e(this.c, oih.a);
            return;
        }
        if (this.b == edt.PRIMARY) {
            this.d.a.k().e(gjxVar.b.length);
            if (this.e.a.g()) {
                ((HardwareBuffer) this.e.a.c()).close();
            }
        }
        this.d.e(this.c, ojc.i(gjxVar.d));
    }
}
