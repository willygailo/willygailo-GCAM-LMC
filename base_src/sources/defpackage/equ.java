package defpackage;

import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.lasagna.LasagnaCallbacks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class equ implements LasagnaCallbacks {
    final /* synthetic */ eqx a;

    public equ(eqx eqxVar) {
        this.a = eqxVar;
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final void a(int i, int i2, String str, ojc ojcVar) {
        erp erpVar = (erp) this.a.m.remove(Integer.valueOf(i));
        erpVar.getClass();
        erpVar.a(i, i2, str, ojcVar);
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final void b(int i, long j, int i2, String str, ShotMetadata shotMetadata) {
        erp erpVar = (erp) this.a.m.get(Integer.valueOf(i));
        erpVar.getClass();
        erpVar.b(i, j, i2, str, shotMetadata);
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final /* synthetic */ void onFinalStatusNative(int i, int i2, String str, byte[] bArr) {
        plk.$default$onFinalStatusNative(this, i, i2, str, bArr);
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final /* synthetic */ void onImageNative(int i, long j, int i2, String str, long j2) {
        plk.$default$onImageNative(this, i, j, i2, str, j2);
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final void onProgress(int i, float f) {
        erp erpVar = (erp) this.a.m.get(Integer.valueOf(i));
        erpVar.getClass();
        StringBuilder sb = new StringBuilder(36);
        sb.append("Processing progress: ");
        sb.append(f);
        sb.toString();
        ovd ovdVar = ovl.a;
        edd eddVar = erpVar.j;
        if (eddVar != null) {
            eddVar.c.d.a(esl.u, f);
        } else {
            ((oug) ((oug) erp.a.c().g(ovl.a, "LasagnaProcSession")).G((char) 1448)).o("Shot has been aborted.");
        }
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final void onPslRequest(int i, boolean z, float f, float f2) {
        erp erpVar = (erp) this.a.m.get(Integer.valueOf(i));
        erpVar.getClass();
        String.format("onPslRequest / isNeeded = %s, duration = %s, frameRate = %s", Boolean.valueOf(z), Float.valueOf(f), Float.valueOf(f2));
        ovd ovdVar = ovl.a;
        if (!z || erpVar.e == null) {
            erpVar.h.o(true);
            erpVar.c();
            return;
        }
        try {
            long millis = (long) (TimeUnit.SECONDS.toMillis(1L) * f);
            gof gofVar = erpVar.k;
            if (gofVar != null) {
                gofVar.d().f(millis);
                gof gofVar2 = erpVar.k;
                gofVar2.getClass();
                gofVar2.d().g();
                gof gofVar3 = erpVar.k;
                gofVar3.getClass();
                gofVar3.d().fB(null);
            }
            erpVar.i.Q(millis);
            erpVar.e.d(f, f2, ((Long) erpVar.g.get()).longValue());
            fjx fjxVar = erpVar.p;
            poy poyVar = fjxVar.a;
            if (poyVar.c) {
                poyVar.m();
                poyVar.c = false;
            }
            pdb pdbVar = (pdb) poyVar.b;
            pdb pdbVar2 = pdb.v;
            pdbVar.a |= 16;
            pdbVar.e = f;
            poy poyVar2 = fjxVar.a;
            if (poyVar2.c) {
                poyVar2.m();
                poyVar2.c = false;
            }
            pdb pdbVar3 = (pdb) poyVar2.b;
            pdbVar3.a |= 256;
            pdbVar3.i = f2;
        } catch (InterruptedException | ExecutionException e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            erpVar.c();
        }
    }
}
