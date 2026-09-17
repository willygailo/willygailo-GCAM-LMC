package defpackage;

import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.evcomp.EvCompView;

/* JADX INFO: loaded from: classes.dex */
public class dna extends dmu {
    public final EvCompView a;
    public final qkg b;
    public final lda c;
    public final lda d;
    public final lda e;
    public final boolean f;
    public int g;
    public int h;
    public float i;
    public final ojc j;
    public final lda k;
    public final Runnable l;
    public float m;
    public float n;
    private final lda o;
    private final lda p;
    private final lda q;

    public dna(qkg qkgVar, EvCompView evCompView, lda ldaVar, lda ldaVar2, lda ldaVar3, lda ldaVar4, huq huqVar, ojc ojcVar, boolean z, byte[] bArr) {
        lce lceVar = new lce(true);
        this.k = lceVar;
        this.l = new Runnable() { // from class: dmv
            @Override // java.lang.Runnable
            public final void run() {
                dna dnaVar = this.a;
                ((dmo) dnaVar.b.get()).c(true);
                if (((dme) dnaVar.e.fA()).equals(dme.SINGLE) || !((Boolean) ((lce) dnaVar.k).d).booleanValue()) {
                    return;
                }
                obr.aQ(true);
                ((hbu) ((ojj) dnaVar.j).a).f();
            }
        };
        this.b = qkgVar;
        this.a = evCompView;
        this.e = ldaVar4;
        this.o = ldaVar;
        this.p = ldaVar2;
        this.q = ldaVar3;
        this.c = huqVar.c;
        this.d = huqVar.a;
        this.j = ojcVar;
        lceVar.fB(true);
        this.m = -1.0f;
        this.n = -1.0f;
        this.f = z;
    }

    final void i() {
        this.a.removeCallbacks(this.l);
    }

    public final void j() {
        if (((dme) this.e.fA()).equals(dme.SINGLE)) {
            k();
        } else {
            obr.aQ(true);
            lda ldaVar = this.p;
            Float fValueOf = Float.valueOf(-1.0f);
            ldaVar.fB(fValueOf);
            this.q.fB(fValueOf);
            this.m = -1.0f;
            this.n = -1.0f;
            plk.af(((hbu) ((ojj) this.j).a).e(), new dmw(this), lar.a);
        }
        this.k.fB(true);
    }

    public final void k() {
        this.a.g(0.5f);
        m(0.5f, dmg.BRIGHTNESS);
    }

    public final void l() {
        if (((dme) this.e.fA()).equals(dme.SINGLE)) {
            k();
        } else {
            ((hbu) ((ojj) this.j).a).f();
        }
        this.k.fB(true);
    }

    public final void m(float f, dmg dmgVar) {
        if (f > 1.0f || f < 0.0f) {
            return;
        }
        if (((dme) this.e.fA()) == dme.SINGLE) {
            obr.aG(dmgVar.equals(dmg.BRIGHTNESS), "Single knob ev slider should have only one control(for brightness).");
            if (((hbu) ((ojj) this.j).a).j()) {
                this.a.h(f);
                if (f != ((Float) ((lce) this.p).d).floatValue()) {
                    this.p.fB(Float.valueOf(f));
                }
                return;
            }
            int iRound = Math.round(this.h * f);
            int i = this.g;
            int i2 = iRound + i;
            this.a.h(((this.h * f) + i) * this.i);
            if (i2 != ((Integer) ((lce) this.o).d).intValue()) {
                this.o.fB(Integer.valueOf(i2));
                return;
            }
            return;
        }
        dmg dmgVar2 = dmg.BRIGHTNESS;
        switch (dmgVar) {
            case BRIGHTNESS:
                this.a.h(f);
                if (f != ((Float) ((lce) this.p).d).floatValue()) {
                    this.p.fB(Float.valueOf(f));
                    if (((Float) ((lce) this.q).d).floatValue() == -1.0f) {
                        this.q.fB(Float.valueOf(this.n));
                    }
                    break;
                }
                break;
            case SHADOW:
                EvCompView evCompView = this.a;
                evCompView.l = f;
                evCompView.g.setContentDescription(evCompView.getResources().getString(R.string.shadow_ev_announcement, String.valueOf(evCompView.l)));
                if (f != ((Float) ((lce) this.q).d).floatValue()) {
                    this.q.fB(Float.valueOf(f));
                    if (((Float) ((lce) this.p).d).floatValue() == -1.0f) {
                        this.p.fB(Float.valueOf(this.m));
                    }
                    break;
                }
                break;
        }
    }
}
