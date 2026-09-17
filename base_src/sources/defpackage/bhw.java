package defpackage;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class bhw implements azv {
    private final bhe a;
    private final bct b;

    public bhw(bhe bheVar, bct bctVar) {
        this.a = bheVar;
        this.b = bctVar;
    }

    @Override // defpackage.azv
    public final /* bridge */ /* synthetic */ bcl a(Object obj, int i, int i2, azt aztVar) {
        bht bhtVar;
        boolean z;
        blu bluVar;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof bht) {
            bhtVar = (bht) inputStream;
            z = false;
        } else {
            bhtVar = new bht(inputStream, this.b);
            z = true;
        }
        synchronized (blu.a) {
            bluVar = (blu) blu.a.poll();
        }
        if (bluVar == null) {
            bluVar = new blu();
        }
        bluVar.b = bhtVar;
        bmc bmcVar = new bmc(bluVar);
        bhv bhvVar = new bhv(bhtVar, bluVar);
        try {
            bhe bheVar = this.a;
            bcl bclVarA = bheVar.a(new bhm(bmcVar, bheVar.g, bheVar.f), i, i2, aztVar, bhvVar);
            bluVar.a();
            if (z) {
            }
            return bclVarA;
        } finally {
            bluVar.a();
            if (z) {
                bhtVar.b();
            }
        }
    }

    @Override // defpackage.azv
    public final /* bridge */ /* synthetic */ boolean b(Object obj, azt aztVar) {
        return true;
    }
}
