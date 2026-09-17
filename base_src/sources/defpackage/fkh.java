package defpackage;

import android.content.res.Resources;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class fkh implements iat {
    public iay b;
    public iax c;
    public final fvv d;
    public final ScheduledExecutorService e;
    public final huj f;
    public final cbl g;
    public boolean h;
    public ScheduledFuture i;
    public boolean j;
    private final Resources k;
    private final eam l;
    private lie m;
    private final eak n = new fkg(this);
    public final AtomicBoolean a = new AtomicBoolean(false);

    public fkh(Resources resources, fvv fvvVar, ScheduledExecutorService scheduledExecutorService, eam eamVar, huj hujVar, cbl cblVar) {
        this.k = resources;
        this.d = fvvVar;
        this.e = scheduledExecutorService;
        this.l = eamVar;
        this.f = hujVar;
        this.g = cblVar;
    }

    @Override // defpackage.iat
    public final void a() {
        ScheduledFuture scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // defpackage.iat
    public final void b(iay iayVar) {
        this.b = iayVar;
        iaw iawVarA = iax.a();
        iawVarA.b = this.k.getString(R.string.astrophotography_suggestion_text);
        iawVarA.c = this.k.getDrawable(R.drawable.quantum_gm_ic_auto_awesome_white_24, null);
        final int i = 1;
        iawVarA.h = new Runnable(this) { // from class: fke
            public final /* synthetic */ fkh a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                iay iayVar2;
                switch (i) {
                    case 0:
                        fkh fkhVar = this.a;
                        fkhVar.j = true;
                        fkhVar.d.b(jrl.LONG_EXPOSURE);
                        break;
                    case 1:
                        fkh fkhVar2 = this.a;
                        fkhVar2.h = true;
                        fkhVar2.f.b("Astro_smarts_chip");
                        fkhVar2.g.f(jrl.LONG_EXPOSURE);
                        break;
                    default:
                        fkh fkhVar3 = this.a;
                        if (fkhVar3.a.compareAndSet(true, false) && (iayVar2 = fkhVar3.b) != null) {
                            iayVar2.a();
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 0;
        iawVarA.d = new Runnable(this) { // from class: fke
            public final /* synthetic */ fkh a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                iay iayVar2;
                switch (i2) {
                    case 0:
                        fkh fkhVar = this.a;
                        fkhVar.j = true;
                        fkhVar.d.b(jrl.LONG_EXPOSURE);
                        break;
                    case 1:
                        fkh fkhVar2 = this.a;
                        fkhVar2.h = true;
                        fkhVar2.f.b("Astro_smarts_chip");
                        fkhVar2.g.f(jrl.LONG_EXPOSURE);
                        break;
                    default:
                        fkh fkhVar3 = this.a;
                        if (fkhVar3.a.compareAndSet(true, false) && (iayVar2 = fkhVar3.b) != null) {
                            iayVar2.a();
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        iawVarA.g = new Runnable(this) { // from class: fke
            public final /* synthetic */ fkh a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                iay iayVar2;
                switch (i3) {
                    case 0:
                        fkh fkhVar = this.a;
                        fkhVar.j = true;
                        fkhVar.d.b(jrl.LONG_EXPOSURE);
                        break;
                    case 1:
                        fkh fkhVar2 = this.a;
                        fkhVar2.h = true;
                        fkhVar2.f.b("Astro_smarts_chip");
                        fkhVar2.g.f(jrl.LONG_EXPOSURE);
                        break;
                    default:
                        fkh fkhVar3 = this.a;
                        if (fkhVar3.a.compareAndSet(true, false) && (iayVar2 = fkhVar3.b) != null) {
                            iayVar2.a();
                            break;
                        }
                        break;
                }
            }
        };
        this.c = iawVarA.a();
    }

    @Override // defpackage.iat
    public final void u() {
        this.a.set(false);
        lie lieVar = this.m;
        if (lieVar != null) {
            lieVar.close();
        }
    }

    @Override // defpackage.iat
    public final void v() {
        this.m = this.l.d(this.n);
    }
}
