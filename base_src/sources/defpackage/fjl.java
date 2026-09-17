package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fjl implements fjt {
    private final ouj a = ouj.h("com/google/android/apps/camera/logging/LogcatCameraEventLogger");

    @Override // defpackage.fjt
    public final synchronized void a(pac pacVar) {
        oug ougVar = (oug) ((oug) this.a.c()).G(1729);
        pab pabVarB = pab.b(pacVar.d);
        if (pabVarB == null) {
            pabVarB = pab.UNKNOWN_TYPE;
        }
        ougVar.r("----------------------\nStart event: %s", pabVarB);
        for (String str : pacVar.toString().split("\n", -1)) {
            ((oug) ((oug) this.a.c()).G(1731)).r("%s", str);
        }
        oug ougVar2 = (oug) ((oug) this.a.c()).G(1730);
        pab pabVarB2 = pab.b(pacVar.d);
        if (pabVarB2 == null) {
            pabVarB2 = pab.UNKNOWN_TYPE;
        }
        ougVar2.r("End Event: %s\n", pabVarB2);
    }
}
