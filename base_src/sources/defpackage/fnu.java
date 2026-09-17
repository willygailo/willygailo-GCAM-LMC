package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class fnu implements fnv {
    public static final ouj a = ouj.h("com/google/android/apps/camera/microvideo/MicrovideoAppController");
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public final Object d = new Object();
    public volatile int e = 1;
    private final lda f;
    private final lda g;
    private final fnq h;
    private final ddf i;
    private final imf j;
    private final dqa k;
    private volatile fox l;

    public fnu(lda ldaVar, lda ldaVar2, fnq fnqVar, imf imfVar, dqa dqaVar, ddf ddfVar) {
        this.f = ldaVar;
        this.g = ldaVar2;
        this.h = fnqVar;
        this.j = imfVar;
        this.k = dqaVar;
        this.i = ddfVar;
    }

    public final fpa a() {
        synchronized (this.d) {
            if (this.b.isEmpty()) {
                return null;
            }
            return (fpa) ohh.t(this.b);
        }
    }

    @Override // defpackage.fpk
    public final pcw b() {
        int i;
        fpa fpaVarA = a();
        if (fpaVarA == null) {
            return null;
        }
        poy poyVarM = pcw.m.m();
        switch (hls.d(((Integer) this.f.fA()).intValue()) - 1) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            default:
                i = 4;
                break;
        }
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pcw pcwVar = (pcw) poyVarM.b;
        pcwVar.h = i - 1;
        pcwVar.a |= 64;
        int i2 = true == fpaVarA.b.c() ? 5 : 3;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pcw pcwVar2 = (pcw) poyVarM.b;
        pcwVar2.l = i2 - 1;
        pcwVar2.a |= 512;
        return (pcw) poyVarM.j();
    }

    @Override // defpackage.fnv
    public final void c() {
        int i;
        ArrayList arrayListAh;
        fpa fpaVarA = a();
        if (fpaVarA != null) {
            fus fusVar = fpaVarA.b;
            long jA = fusVar.b.a();
            synchronized (fusVar) {
                fusVar.g = TimeUnit.NANOSECONDS.toMicros(jA);
                fusVar.f = false;
                arrayListAh = obr.ah(fusVar.e);
            }
            lis lisVar = fusVar.a;
            StringBuilder sb = new StringBuilder(40);
            sb.append("onLongPressEnded at ");
            sb.append(jA);
            lisVar.b(sb.toString());
            int size = arrayListAh.size();
            for (i = 0; i < size; i++) {
                ((fur) arrayListAh.get(i)).c(TimeUnit.NANOSECONDS.toMicros(jA));
            }
        }
    }

    @Override // defpackage.fnv
    public final void d() {
    }

    @Override // defpackage.fpk
    public final void e() {
        SystemClock.elapsedRealtime();
        ddf ddfVar = this.i;
        ddi ddiVar = ddr.a;
        ddfVar.d();
        this.h.a();
    }

    @Override // defpackage.fpk
    public final void f() {
        ddf ddfVar = this.i;
        ddi ddiVar = ddr.a;
        ddfVar.d();
    }

    @Override // defpackage.fnv
    public final void g(boolean z) {
        fpa fpaVarA = a();
        if (fpaVarA != null) {
            fpaVarA.a.a(z);
        }
        if (z) {
            this.h.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0031 A[Catch: all -> 0x006c, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0008, B:10:0x000e, B:12:0x001e, B:14:0x0026, B:19:0x0031, B:21:0x003f, B:23:0x0051, B:25:0x0063), top: B:35:0x0001 }] */
    public final synchronized boolean h() {
        fox foxVar = this.l;
        if (foxVar == null) {
            return false;
        }
        fpa fpaVarA = a();
        if (fpaVarA != null) {
            gjk gjkVar = (gjk) fpaVarA.c.fA();
            if (!gjkVar.equals(gjk.NORMAL_WITH_FLASH) && !gjkVar.equals(gjk.HDR_PLUS_WITH_TORCH) && !gjkVar.equals(gjk.HDR_PLUS)) {
                if (!((Boolean) this.g.fA()).booleanValue() && !((Boolean) this.j.a().fA()).booleanValue() && !((Boolean) this.k.a().fA()).booleanValue() && foxVar.a()) {
                    return true;
                }
            }
        } else if (!((Boolean) this.g.fA()).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fnv
    public final void i(int i) {
        this.e = i;
    }

    @Override // defpackage.fnv
    public final synchronized void j(fox foxVar) {
        if (this.l == null) {
            this.l = foxVar;
        } else {
            ((oug) ((oug) a.c()).G((char) 1782)).o("Cannot attach UI controller when already attached!");
        }
    }

    @Override // defpackage.fnv
    public final synchronized void k(fox foxVar) {
        if (this.l == foxVar) {
            this.l = null;
        } else {
            ((oug) ((oug) a.c()).G((char) 1784)).o("Cannot detach UI controller. Values mismatch.");
        }
    }
}
