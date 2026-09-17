package defpackage;

import android.content.Context;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
public final class fwt implements fxh {
    public final fix a;
    public final hpu b;
    public final gvb c;
    public final hpe d;
    public final lda e;
    public final lda f;
    public final lco g;
    public final lda h;
    public final lda i;
    public final String j;
    public final String k;
    public final lda l;
    public final lda m;
    public final huf n;
    public final ddf o;
    public final lco p;
    public final hql q;
    public final hsh r;
    public ijp s;
    public final hbq t;
    public final ojc u;
    public hsa v;
    public final kme w;
    public final mbg x;

    public fwt(fix fixVar, kme kmeVar, hpu hpuVar, gvb gvbVar, hpe hpeVar, Context context, lda ldaVar, lda ldaVar2, lco lcoVar, lda ldaVar3, lda ldaVar4, lda ldaVar5, lda ldaVar6, huf hufVar, lda ldaVar7, ddf ddfVar, mbg mbgVar, hql hqlVar, hsh hshVar, hbq hbqVar, ojc ojcVar, byte[] bArr, byte[] bArr2) {
        this.a = fixVar;
        this.w = kmeVar;
        this.b = hpuVar;
        this.c = gvbVar;
        this.d = hpeVar;
        this.e = ldaVar;
        this.f = ldaVar2;
        this.g = lcoVar;
        this.h = ldaVar3;
        this.i = ldaVar4;
        this.j = context.getResources().getString(R.string.pref_camera_video_flashmode_torch);
        this.k = context.getResources().getString(R.string.pref_camera_video_flashmode_off);
        this.l = ldaVar5;
        this.m = ldaVar6;
        this.n = hufVar;
        this.p = ldaVar7;
        this.o = ddfVar;
        this.x = mbgVar;
        this.q = hqlVar;
        this.r = hshVar;
        this.t = hbqVar;
        this.u = ojcVar;
    }

    public final void a() {
        hsa hsaVar = this.v;
        hsaVar.getClass();
        hqd hqdVar = (hqd) hsaVar;
        hqdVar.G("interruptSession");
        hqdVar.o().b();
    }

    @Override // defpackage.fxh
    public final void b() {
        hsa hsaVar = this.v;
        hsaVar.getClass();
        hsaVar.S(null);
    }

    @Override // defpackage.fxh
    public final pht c(fwc fwcVar, gft gftVar, boolean z, ijp ijpVar) {
        throw null;
    }

    @Override // defpackage.fxh
    public final pht d(gfu gfuVar, fvx fvxVar, gft gftVar, ghx ghxVar, boolean z, boolean z2, ijp ijpVar) {
        throw null;
    }
}
