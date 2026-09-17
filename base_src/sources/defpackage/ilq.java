package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ilq extends iai implements fik, fhy, fgq {
    public final Context b;
    public final hnx c;
    public final fjs d;
    public final ddf e;
    public boolean f;
    private final lda g;
    private final ilg h;
    private final lar i;
    private final fhv j;
    private iax k;
    private long l = -1;

    public ilq(Context context, lda ldaVar, hnx hnxVar, ilg ilgVar, fjs fjsVar, lar larVar, fhv fhvVar, ddf ddfVar) {
        this.b = context;
        this.g = ldaVar;
        this.c = hnxVar;
        this.h = ilgVar;
        this.d = fjsVar;
        this.i = larVar;
        this.j = fhvVar;
        this.e = ddfVar;
    }

    @Override // defpackage.fhy
    public final void F() {
        this.f = false;
    }

    @Override // defpackage.iai, defpackage.iat
    public final void b(iay iayVar) {
        super.b(iayVar);
        enl.f(this.i, this.j, this);
    }

    public final void e(ilv ilvVar) {
        if (this.f) {
            ddf ddfVar = this.e;
            ddi ddiVar = ddm.a;
            ddfVar.b();
            return;
        }
        ilf ilfVarA = this.h.a(ilvVar);
        jrl jrlVar = (jrl) this.g.fA();
        if (((jrlVar != jrl.PHOTO && jrlVar != jrl.PORTRAIT && jrlVar != jrl.LONG_EXPOSURE) || !ilfVarA.c) && (jrlVar != jrl.VIDEO || !ilfVarA.d)) {
            this.l = -1L;
            c();
            return;
        }
        long j = this.l;
        if (j < 0 || ilvVar.b < j) {
            this.l = Math.max(0L, ilvVar.b - 25000000);
            if (this.k == null) {
                Resources resources = this.b.getResources();
                iaw iawVarA = iax.a();
                iawVarA.b = resources.getString(R.string.storage_low_warning_toast);
                iawVarA.c = resources.getDrawable(R.drawable.quantum_gm_ic_sd_card_alert_white_24, null);
                iawVarA.d(6000L);
                final int i = 0;
                iawVarA.d = new Runnable(this) { // from class: ilp
                    public final /* synthetic */ ilq a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                ilq ilqVar = this.a;
                                ilqVar.d.ag(3);
                                ilqVar.c.g(ilk.a(ilqVar.b, ilqVar.e));
                                break;
                            default:
                                this.a.f = true;
                                break;
                        }
                    }
                };
                final int i2 = 1;
                iawVarA.g = new Runnable(this) { // from class: ilp
                    public final /* synthetic */ ilq a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                ilq ilqVar = this.a;
                                ilqVar.d.ag(3);
                                ilqVar.c.g(ilk.a(ilqVar.b, ilqVar.e));
                                break;
                            default:
                                this.a.f = true;
                                break;
                        }
                    }
                };
                this.k = iawVarA.a();
            }
            d(this.k);
        }
    }

    @Override // defpackage.iai, defpackage.iat
    public final void u() {
        super.u();
        this.l = -1L;
    }

    @Override // defpackage.fgq
    public final void z(Intent intent) {
        this.f = false;
    }
}
