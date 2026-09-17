package defpackage;

import android.graphics.Bitmap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class hyz implements hsb {
    final /* synthetic */ hza a;
    private final Set b = new HashSet();

    public hyz(hza hzaVar) {
        this.a = hzaVar;
    }

    private final synchronized void a(hsp hspVar, hsr hsrVar) {
        hsr hsrVar2 = hsr.UNKNOWN;
        switch (hsrVar.ordinal()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 12:
            case 14:
                if (this.b.add(hspVar)) {
                    this.a.b.c(new hyy(this, 1));
                    break;
                }
            default:
                break;
        }
        throw th;
    }

    private final synchronized void b(hsp hspVar) {
        if (this.b.remove(hspVar)) {
            this.a.c.postDelayed(new hyy(this, 0), 3000L);
        }
    }

    @Override // defpackage.hsb
    public final void j(hsp hspVar) {
        b(hspVar);
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void k(hsp hspVar, Bitmap bitmap, int i) {
    }

    @Override // defpackage.hsb
    public final void l(hsp hspVar) {
        b(hspVar);
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void m(long j) {
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void n(Bitmap bitmap) {
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void o(hsp hspVar, lif lifVar) {
    }

    @Override // defpackage.hsb
    public final void p(hsp hspVar, hsj hsjVar, hss hssVar) {
        a(hspVar, hsjVar.c);
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void q(hsp hspVar) {
    }

    @Override // defpackage.hsb
    public final void w(hsp hspVar) {
        b(hspVar);
    }
}
