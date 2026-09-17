package defpackage;

import com.google.android.GoogleCameraEngR18F1.R;
import j$.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
final class kbh implements kaq {
    final /* synthetic */ kbi a;

    public kbh(kbi kbiVar) {
        this.a = kbiVar;
    }

    @Override // defpackage.kaq
    public final void p(int i) {
        if (i == 3) {
            final kbi kbiVar = this.a;
            if (!kbiVar.T() || kbiVar.j.a("wide_selfie_tooltip_display_count") > 2) {
                return;
            }
            if (((Float) kbiVar.g.fA()).floatValue() < ((Float) ((lce) kbiVar.f).d).floatValue() * ((float) Math.sqrt(kbiVar.P / ((Float) ((lce) kbiVar.f).d).floatValue()))) {
                kbiVar.j.c("wide_selfie_tooltip_display_count", 3);
                return;
            }
            if (kbiVar.j.a("wide_selfie_tooltip_display_count") < 2) {
                kbiVar.j.b("wide_selfie_tooltip_display_count");
            }
            jlz jlzVar = new jlz(kbiVar.E.getString(R.string.zoom_ffc_wide_tooltip));
            jlzVar.s(kbiVar.F);
            jlzVar.i();
            jlzVar.h = kbiVar.c.k(ddl.ay);
            jlzVar.n();
            jlzVar.c = 1000;
            jlzVar.d = kbiVar.E.getInteger(R.integer.zoom_seekbar_timeout_ms) - 1000;
            jlzVar.d(new Supplier() { // from class: kaw
                @Override // j$.util.function.Supplier
                public final Object get() {
                    kbi kbiVar2 = kbiVar;
                    boolean z = false;
                    if (kbiVar2.A == lwd.FRONT && kbiVar2.j.a("wide_selfie_tooltip_display_count") == 2) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            });
            jlzVar.e(new kau(kbiVar, 1));
            jlzVar.m = 4;
            jlzVar.i = kbiVar.i;
            jlzVar.e = false;
            jlzVar.o();
            lie lieVarA = jlzVar.a();
            if (kbiVar.D.g()) {
                ((lie) kbiVar.D.c()).close();
            }
            kbiVar.D = ojc.i(lieVarA);
            kbiVar.d.c(lieVarA);
        }
    }
}
