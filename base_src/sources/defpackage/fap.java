package defpackage;

import android.hardware.camera2.params.Face;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fap implements lij {
    public final /* synthetic */ fbb a;
    private final /* synthetic */ int b;

    public /* synthetic */ fap(fbb fbbVar, int i) {
        this.b = i;
        this.a = fbbVar;
    }

    @Override // defpackage.lij
    public final void fB(Object obj) {
        float f;
        fwc fwcVar;
        int i = 2;
        boolean z = false;
        switch (this.b) {
            case 0:
                this.a.w.ak((hti) obj);
                return;
            case 1:
                fbb fbbVar = this.a;
                Face[] faceArr = ((gnq) obj).a;
                lce lceVar = fbbVar.I;
                int length = faceArr.length;
                lceVar.fB(Boolean.valueOf(length > 0));
                fbbVar.q.a.a(length);
                if (fbbVar.N != null && fbbVar.c.i()) {
                    int i2 = fbbVar.O;
                    if (i2 < 5) {
                        fbbVar.O = i2 + 1;
                        f = 0.0f;
                    } else {
                        jtj jtjVar = fbbVar.t;
                        lco lcoVar = fbbVar.N;
                        lcoVar.getClass();
                        Float f2 = ((gnt) lcoVar.fA()).a;
                        f2.getClass();
                        jtjVar.a(f2.floatValue());
                        f = fbbVar.t.a;
                    }
                    if (((int) (fbbVar.q.a.a + 0.5f)) == 0 && f > 3.0f) {
                        z = true;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    hgf hgfVar = fbbVar.L;
                    if (boolValueOf.booleanValue()) {
                        synchronized (hgfVar.d) {
                            if (hgfVar.f) {
                                if (hgfVar.g != 2) {
                                    hgfVar.g = 2;
                                    hgfVar.a.d(hgfVar.b);
                                    hgfVar.c(800L);
                                }
                            }
                        }
                    }
                    hgfVar.e = boolValueOf;
                    return;
                }
                return;
            case 2:
                fbb fbbVar2 = this.a;
                if (((Boolean) obj).booleanValue() && (fwcVar = fbbVar2.V) != null && fwcVar.c.L()) {
                    fbbVar2.v(false);
                    synchronized (fbbVar2.R) {
                        plk.O(fbbVar2.R).c(new far(fbbVar2, i), fbbVar2.e);
                        break;
                    }
                    return;
                }
                return;
            default:
                fbb fbbVar3 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    fbbVar3.w.j();
                    return;
                } else {
                    fbbVar3.w.ai(jrl.PORTRAIT);
                    return;
                }
        }
    }
}
