package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class cok implements cib {
    private final ddf a;
    private final emb b;

    public cok(emb embVar, ddf ddfVar, byte[] bArr, byte[] bArr2) {
        this.b = embVar;
        this.a = ddfVar;
    }

    @Override // defpackage.cib
    public final jrl a() {
        return jrl.VIDEO_INTENT;
    }

    @Override // defpackage.cib
    public final ojc b() {
        Intent intentA = this.b.a();
        if (intentA == null) {
            return oih.a;
        }
        return (bqe.i(intentA) && bqe.m(intentA)) ? ojc.i(lwd.FRONT) : oih.a;
    }

    @Override // defpackage.cib
    public final boolean c() {
        return this.a.k(ddl.K);
    }

    @Override // defpackage.cib
    public final boolean d() {
        return false;
    }

    @Override // defpackage.cib
    public final boolean e() {
        return true;
    }

    @Override // defpackage.cib
    public final boolean f() {
        return true;
    }

    @Override // defpackage.cib
    public final boolean g() {
        return false;
    }

    @Override // defpackage.cib
    public final boolean h() {
        return true;
    }

    @Override // defpackage.cib
    public final boolean i() {
        return false;
    }

    @Override // defpackage.cib
    public final boolean j() {
        return false;
    }

    @Override // defpackage.cib
    public final boolean k() {
        return this.a.k(dcu.R);
    }

    @Override // defpackage.cib
    public final boolean l() {
        return true;
    }

    @Override // defpackage.cib
    public final boolean m() {
        Intent intentA = this.b.a();
        if (intentA == null) {
            return false;
        }
        return intentA.getBooleanExtra("include_location_in_exif", false);
    }

    @Override // defpackage.cib
    public final boolean n() {
        return false;
    }

    @Override // defpackage.cib
    public final boolean o() {
        return false;
    }

    @Override // defpackage.cib
    public final void p() {
    }
}
