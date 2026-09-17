package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public abstract class awl {
    public abstract int a();

    @Deprecated
    public abstract Camera.Parameters b();

    public abstract Handler c();

    public abstract awr d();

    public abstract awy e();

    public abstract axh f();

    public abstract axi g();

    public abstract axk h();

    public void i(byte[] bArr) {
        try {
            h().a(new awd(this, bArr));
        } catch (RuntimeException e) {
            d().c().c(e);
        }
    }

    public abstract void j(Handler handler, avu avuVar);

    public void k(boolean z) {
        try {
            h().a(new awg(this, z));
        } catch (RuntimeException e) {
            d().c().c(e);
        }
    }

    public void l(SurfaceTexture surfaceTexture) {
        try {
            h().a(new awi(this, surfaceTexture));
        } catch (RuntimeException e) {
            d().c().c(e);
        }
    }

    public abstract void m(axh axhVar);

    public void n() {
        if (g().d()) {
            return;
        }
        awq awqVar = new awq();
        try {
            h().b(new awk(this, awqVar, 1), awqVar.b, "set preview texture");
        } catch (RuntimeException e) {
            d().c().c(e);
        }
    }

    public abstract void o(Handler handler, fde fdeVar, awc awcVar, awc awcVar2);

    public abstract void p(Handler handler, fde fdeVar);

    public abstract void q(Handler handler, fde fdeVar);

    public final void r(Handler handler, awm awmVar) {
        try {
            h().a(new awj(this, handler, awmVar));
        } catch (RuntimeException e) {
            d().c().c(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:53:0x0103  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00d7, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x00ed, please report this as an issue */
    protected final boolean s(axh axhVar, int i) {
        int i2;
        awu awuVar;
        axn axnVarE;
        axn axnVarF;
        if (axhVar == null) {
            axp.g(awr.i);
            return false;
        }
        awy awyVarE = e();
        float f = axhVar.p;
        if (awyVarE.d(awt.ZOOM)) {
            if (axhVar.p > awyVarE.t) {
                axo axoVar = awy.a;
                String str = "Zoom ratio is not supported: ratio = " + axhVar.p;
                axp.g(axoVar);
            } else {
                i2 = axhVar.q;
                if (i2 <= awyVarE.o) {
                    axp.g(awy.a);
                } else {
                    axp.g(awy.a);
                }
            }
        } else if (f != 1.0f) {
            axp.g(awy.a);
        } else {
            i2 = axhVar.q;
            if (i2 <= awyVarE.o || i2 < awyVarE.n) {
                axp.g(awy.a);
            } else {
                awv awvVar = axhVar.s;
                if (awyVarE.f(awvVar)) {
                    awuVar = axhVar.r;
                    if (awyVarE.e(awuVar)) {
                        axnVarE = axhVar.e();
                        if (awyVarE.f.contains(axnVarE)) {
                            axnVarF = axhVar.f();
                            if (!awyVarE.c.contains(axnVarF)) {
                                String str2 = "Unsupported preview size:" + axnVarF;
                                axp.g(awy.a);
                            } else {
                                if (axhVar.v || awyVarE.d(awt.VIDEO_STABILIZATION)) {
                                    try {
                                        h().a(new awf(this, i, axhVar.a()));
                                        return true;
                                    } catch (RuntimeException e) {
                                        d().c().c(e);
                                        return true;
                                    }
                                }
                                axp.g(awy.a);
                            }
                        } else {
                            String str3 = "Unsupported photo size:" + axnVarE;
                            axp.g(awy.a);
                        }
                    } else {
                        axo axoVar2 = awy.a;
                        if (awuVar != null) {
                            awuVar.name();
                        }
                        axp.g(axoVar2);
                    }
                } else if (awyVarE.f(awv.FIXED)) {
                    axp.c(awy.a, "Focus mode not supported... trying FIXED");
                    axhVar.s = awv.FIXED;
                    awuVar = axhVar.r;
                    if (awyVarE.e(awuVar)) {
                        axo axoVar3 = awy.a;
                        if (awuVar != null) {
                            awuVar.name();
                        }
                        axp.g(axoVar3);
                    } else {
                        axnVarE = axhVar.e();
                        if (awyVarE.f.contains(axnVarE)) {
                            axnVarF = axhVar.f();
                            if (!awyVarE.c.contains(axnVarF)) {
                                if (axhVar.v) {
                                }
                                h().a(new awf(this, i, axhVar.a()));
                                return true;
                            }
                            String str4 = "Unsupported preview size:" + axnVarF;
                            axp.g(awy.a);
                        } else {
                            String str5 = "Unsupported photo size:" + axnVarE;
                            axp.g(awy.a);
                        }
                    }
                } else {
                    axo axoVar4 = awy.a;
                    if (awvVar != null) {
                        awvVar.name();
                    }
                    axp.g(axoVar4);
                }
            }
        }
        axp.c(awr.i, "Unsupported settings in applySettings()");
        return false;
    }
}
