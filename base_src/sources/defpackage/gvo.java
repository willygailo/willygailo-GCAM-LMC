package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class gvo implements pys {
    private final /* synthetic */ int a;

    public gvo(int i) {
        this.a = i;
    }

    public static gxv a() {
        return new gxv();
    }

    public static final Executor b() {
        return new lax(mip.bM("PortraitProc"));
    }

    public static final gjw c() {
        return new gjw(1);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        Integer num;
        switch (this.a) {
            case 0:
                return new gvm();
            case 1:
                return new lce(false);
            case 2:
                return new lnt(1);
            case 3:
                return new lce(hkc.CONTINUOUS_PICTURE);
            case 4:
                return new ghf(lcz.a(1));
            case 5:
                return a();
            case 6:
                return new fvq();
            case 7:
                return new heu() { // from class: hbl
                    @Override // defpackage.heu
                    public final boolean a(lmr lmrVar) {
                        return true;
                    }
                };
            case 8:
                return new lce("");
            case 9:
                return oih.a;
            case 10:
                return new hci();
            case 11:
            case 12:
            case 13:
                return oih.a;
            case 14:
                Object objH = kcy.a != null ? ope.H(mip.be(kcy.a, 0)) : orx.a;
                qmd.ae(objH);
                return objH;
            case 15:
                throw null;
            case 16:
                throw null;
            case 17:
                nbv nbvVarC = myd.c();
                nbvVarC.d(pzf.a.a().b());
                return nbvVarC.c();
            case 18:
                mzl mzlVarC = mzm.c();
                mzlVarC.b(pzf.a.a().c());
                return mzlVarC.a();
            case 19:
                mwn mwnVarC = mwo.c();
                mwnVarC.b(pzf.a.a().a());
                return mwnVarC.a();
            default:
                nbj nbjVarC = nbk.c();
                nbjVarC.b(pzf.a.a().d());
                nbd nbdVar = new nbd();
                nbdVar.a = 5;
                nbdVar.d = 1;
                nbdVar.c = false;
                nbdVar.d = 3;
                if (nbdVar.b == null) {
                    nbdVar.b = oom.l();
                }
                int i = nbdVar.d;
                if (i != 0 && (num = nbdVar.a) != null && nbdVar.c != null) {
                    nbjVarC.b = ojc.i(new nbf(i, num.intValue(), nbdVar.b, nbdVar.c.booleanValue()));
                    return nbjVarC.a();
                }
                StringBuilder sb = new StringBuilder();
                if (nbdVar.d == 0) {
                    sb.append(" enablement");
                }
                if (nbdVar.a == null) {
                    sb.append(" maxFolderDepth");
                }
                if (nbdVar.c == null) {
                    sb.append(" includeDeviceEncryptedStorage");
                }
                String strValueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(strValueOf);
                throw new IllegalStateException(sb2.toString());
        }
    }
}
