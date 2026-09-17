package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gfb implements pys {
    private final qkg a;
    private final qkg b;
    private final /* synthetic */ int c;

    public gfb(qkg qkgVar, qkg qkgVar2, int i) {
        this.c = i;
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public static gfb a(qkg qkgVar, qkg qkgVar2) {
        return new gfb(qkgVar, qkgVar2, 0);
    }

    public final Integer b() {
        int iIntValue;
        switch (this.c) {
            case 0:
                return Integer.valueOf(((ddf) this.a.get()).k(dds.U) ? ((gfc) this.b).get().a : 0);
            default:
                ddf ddfVar = (ddf) this.a.get();
                hub hubVar = (hub) this.b.get();
                if (hubVar.n("pref_mode_vesper_enabled")) {
                    iIntValue = hubVar.m("pref_mode_vesper_enabled") ? htf.ON_LIGHT.f : htf.OFF.f;
                } else {
                    iIntValue = ((Integer) ddfVar.a(dda.a).c()).intValue();
                }
                return Integer.valueOf(iIntValue);
        }
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.c) {
            case 0:
                break;
        }
        return b();
    }
}
