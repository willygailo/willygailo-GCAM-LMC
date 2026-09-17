package defpackage;

import android.content.pm.ResolveInfo;
import android.widget.Toast;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
class icv implements icl {
    final /* synthetic */ icw b;

    public icv(icw icwVar) {
        this.b = icwVar;
    }

    @Override // defpackage.icl
    public void a() {
        this.b.r(false, true);
    }

    @Override // defpackage.icl
    public final /* synthetic */ void b(bty btyVar, boolean z) {
    }

    @Override // defpackage.icl
    public final /* synthetic */ void d(bty btyVar, boolean z) {
    }

    @Override // defpackage.ihs, defpackage.iht
    public final void f() {
        icw icwVar = this.b;
        ResolveInfo resolveInfo = icwVar.u;
        resolveInfo.getClass();
        CharSequence charSequenceLoadLabel = resolveInfo.loadLabel(icwVar.i);
        icw icwVar2 = this.b;
        icf icfVar = icwVar2.n;
        bty btyVar = icwVar2.t;
        btyVar.getClass();
        int iF = icfVar.f(resolveInfo, btyVar);
        this.b.p.d(icj.TAP_SHARE_TARGET);
        ick ickVar = this.b.p;
        String str = resolveInfo.activityInfo.packageName;
        obr.aQ(ickVar.c);
        poy poyVar = ickVar.d;
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        pdy pdyVar = (pdy) poyVar.b;
        pdy pdyVar2 = pdy.j;
        str.getClass();
        pdyVar.a |= 32;
        pdyVar.g = str;
        if (iF == 1) {
            this.b.p.f(1);
            icw icwVar3 = this.b;
            Toast.makeText(icwVar3.h, iek.a(resolveInfo, icwVar3.i, icwVar3.j), 0).show();
        } else {
            if (iF == 3) {
                this.b.p.f(5);
                return;
            }
            icw icwVar4 = this.b;
            Toast.makeText(icwVar4.h, icwVar4.j.getString(R.string.social_toast_activity_not_found, charSequenceLoadLabel), 0).show();
            this.b.p.f(4);
            icw icwVar5 = this.b;
            icwVar5.o.post(new ibd(icwVar5, 4));
        }
    }

    @Override // defpackage.icl, defpackage.fig
    public void fV() {
    }

    @Override // defpackage.icl, defpackage.fgl
    public final /* synthetic */ boolean fX() {
        return false;
    }

    @Override // defpackage.ihs, defpackage.iht
    public final void g() {
        this.b.u = null;
    }

    @Override // defpackage.icl
    public final /* synthetic */ void gk() {
    }

    @Override // defpackage.ihs
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.icl
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.icl
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.icl
    public void k() {
    }

    @Override // defpackage.icl
    public final /* synthetic */ void l(ResolveInfo resolveInfo) {
    }

    @Override // defpackage.icl
    public final /* synthetic */ void m() {
    }

    @Override // defpackage.icl
    public void n() {
        this.b.r(false, false);
    }

    @Override // defpackage.icl
    public final /* synthetic */ void o() {
    }

    @Override // defpackage.icl
    public final /* synthetic */ void p(long j) {
    }
}
