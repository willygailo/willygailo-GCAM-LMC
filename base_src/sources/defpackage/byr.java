package defpackage;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public final class byr implements pys {
    private final /* synthetic */ int a;

    public byr(int i) {
        this.a = i;
    }

    public static oke a() {
        oke okeVar = oig.a;
        qmd.ae(okeVar);
        return okeVar;
    }

    public static final oom b() {
        oom oomVarM = oom.m(ccj.a("on_shutter", "BOOL"));
        qmd.ae(oomVarM);
        oom oomVarM2 = oom.m(ccj.a("photo_mode", "INTEGER"));
        qmd.ae(oomVarM2);
        oom oomVarN = oom.n(cck.a("pixel_data", oomVarM, new cbs(1)), cck.a("metadata", oomVarM2, new cbs(0)));
        qmd.ae(oomVarN);
        return oomVarN;
    }

    public static hiz c() {
        return new hiz();
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.a) {
            case 0:
                return new lce(false);
            case 1:
                return pih.f();
            case 2:
                return new jdy((byte[]) null, (byte[]) null);
            case 3:
                return new lce(bzp.DISABLED);
            case 4:
                return new lce(Float.valueOf(0.0f));
            case 5:
                return a();
            case 6:
                return new bzo(a());
            case 7:
                return new jdy((short[]) null);
            case 8:
                throw null;
            case 9:
                return dqw.b("feature.brella.frame.low-res");
            case 10:
                HandlerThread handlerThread = new HandlerThread("f250");
                handlerThread.start();
                return mip.bV(handlerThread.getLooper());
            case 11:
                return mip.bP("VidMedCod", 2);
            case 12:
                return new cfm();
            case 13:
                return new lce(cik.OFF);
            case 14:
                return new lce(dug.a().b(dei.DOGFOOD) ? cik.ON : cik.OFF);
            case 15:
                return new cin();
            case 16:
                return c();
            case 17:
                return new nvb((short[]) null, (byte[]) null);
            case 18:
                return new coi();
            case 19:
                return new bug(6);
            default:
                return new cpf();
        }
    }
}
