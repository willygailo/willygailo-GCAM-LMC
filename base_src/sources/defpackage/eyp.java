package defpackage;

import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
public final class eyp implements jad {
    public final jac a;
    public final lda b;
    public final jlb c;
    public final lar d;
    public ezk e;
    private final iyb f;
    private final ifn g;

    public eyp(jac jacVar, iyb iybVar, lda ldaVar, jlb jlbVar, ifn ifnVar, lar larVar) {
        this.a = jacVar;
        this.f = iybVar;
        this.b = ldaVar;
        this.g = ifnVar;
        this.c = jlbVar;
        this.d = larVar;
    }

    @Override // defpackage.jad
    public final void C(int i) {
    }

    public final void a() {
        if (this.e == null) {
            return;
        }
        if (this.a.e()) {
            b();
            return;
        }
        int i = ((hti) this.b.fA()).g;
        if (i > 0) {
            jac jacVar = this.a;
            jacVar.h = this;
            jacVar.d(i);
        } else {
            ezk ezkVar = this.e;
            if (ezkVar != null) {
                ezkVar.w();
            }
        }
    }

    public final boolean b() {
        if (!this.a.e()) {
            return false;
        }
        this.f.b();
        this.a.a();
        return true;
    }

    @Override // defpackage.jad
    public final void y() {
        Object obj = this.e;
        if (obj == null || ((buf) obj).a) {
            this.f.b();
            ezk ezkVar = this.e;
            if (ezkVar != null) {
                ezkVar.w();
            }
        }
    }

    @Override // defpackage.jad
    public final void z() {
        Object obj = this.e;
        if (obj == null || ((buf) obj).a) {
            this.f.a();
            this.g.c(R.raw.timer_start);
        }
    }
}
