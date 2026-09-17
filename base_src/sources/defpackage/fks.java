package defpackage;

import android.content.Context;
import android.os.CountDownTimer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fks extends jgs implements lie {
    public final lar a;
    public final List b;
    public jgu c;
    public jgu d;
    public jgu e;
    public jgu f;
    public jgu g;
    public jgu h;
    public final pht i;
    public final iud j;
    private CountDownTimer n;

    public fks(Context context, lar larVar, pht phtVar, ddf ddfVar, iud iudVar) {
        super(ddfVar.k(ddl.ay), context);
        this.b = new ArrayList();
        this.a = larVar;
        this.i = phtVar;
        this.j = iudVar;
    }

    public final void a() {
        CountDownTimer countDownTimer = this.n;
        if (countDownTimer != null) {
            countDownTimer.onFinish();
            this.n.cancel();
        }
        f();
    }

    public final void b(float f) {
        if (f == 0.0f) {
            g(this.g);
        } else if (f == 1.0f) {
            f();
        }
    }

    public final void c() {
        bro broVar = (bro) mip.bY(this.i);
        if (broVar != null) {
            broVar.b();
        }
        if (!this.j.f()) {
            this.j.c();
        }
        fkr fkrVar = new fkr(this);
        this.n = fkrVar;
        fkrVar.start();
    }
}
