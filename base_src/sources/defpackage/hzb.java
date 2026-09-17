package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.camera.smarts.SmartsChipView;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class hzb implements iap {
    public final iav a;
    public iax b;
    public final SmartsChipView c;
    public final fjs d;
    public final iuf e;
    public final gvb f;
    public boolean g = false;
    public final huq h;
    private final iat i;
    private final boolean j;
    private Date k;

    public hzb(iav iavVar, iat iatVar, iax iaxVar, SmartsChipView smartsChipView, fjs fjsVar, iuf iufVar, gvb gvbVar, huq huqVar, boolean z, byte[] bArr) {
        this.a = iavVar;
        this.b = iaxVar;
        this.c = smartsChipView;
        this.d = fjsVar;
        this.e = iufVar;
        this.i = iatVar;
        this.f = gvbVar;
        this.h = huqVar;
        this.j = z;
    }

    @Override // defpackage.elv
    public final int a() {
        return (int) this.b.a;
    }

    @Override // defpackage.elv
    public final elx b() {
        return elx.SMARTS;
    }

    @Override // defpackage.elv
    public final Object c() {
        return this.i;
    }

    @Override // defpackage.elv
    public final Runnable d() {
        return this.b.k;
    }

    @Override // defpackage.elv
    public final Date e() {
        return this.k;
    }

    @Override // defpackage.elv
    public final void f(Runnable runnable) {
        SmartsChipView smartsChipView = this.c;
        smartsChipView.f = runnable;
        if (smartsChipView.d) {
            smartsChipView.e = true;
        } else {
            smartsChipView.b();
        }
        this.g = false;
    }

    @Override // defpackage.elv
    public final void g() {
        this.c.b();
        this.g = false;
    }

    @Override // defpackage.elv
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.elv
    public final void i(Date date) {
        this.k = date;
    }

    @Override // defpackage.elv
    public final void j() {
        final SmartsChipView smartsChipView = this.c;
        final int i = 1;
        if (!smartsChipView.d) {
            final int i2 = 0;
            smartsChipView.b.scrollTo(0, 0);
            if (gl.f(smartsChipView.b.getRootView()) == 1) {
                smartsChipView.b.setGravity(8388661);
            } else {
                smartsChipView.b.setGravity(8388659);
            }
            if (smartsChipView.l.a()) {
                smartsChipView.l = new lap();
            }
            smartsChipView.l.c(this.h.b.a(new lij() { // from class: hxx
                @Override // defpackage.lij
                public final void fB(Object obj) {
                    switch (i) {
                        case 0:
                            SmartsChipView smartsChipView2 = smartsChipView;
                            hwz hwzVarA = hxa.a(this);
                            hwzVarA.f(smartsChipView2.m);
                            hwzVarA.d(smartsChipView2.i);
                            hwzVarA.c(smartsChipView2.j);
                            hwzVarA.e(smartsChipView2.k);
                            smartsChipView2.d(hwzVarA.a());
                            break;
                        default:
                            SmartsChipView smartsChipView3 = smartsChipView;
                            hwz hwzVarA2 = hxa.a(this);
                            hwzVarA2.f(smartsChipView3.m);
                            hwzVarA2.d(smartsChipView3.i);
                            hwzVarA2.c(smartsChipView3.j);
                            hwzVarA2.e(smartsChipView3.k);
                            smartsChipView3.d(hwzVarA2.a());
                            break;
                    }
                }
            }, aau.a(smartsChipView.getContext())));
            smartsChipView.l.c(this.h.c.a(new lij() { // from class: hxx
                @Override // defpackage.lij
                public final void fB(Object obj) {
                    switch (i2) {
                        case 0:
                            SmartsChipView smartsChipView2 = smartsChipView;
                            hwz hwzVarA = hxa.a(this);
                            hwzVarA.f(smartsChipView2.m);
                            hwzVarA.d(smartsChipView2.i);
                            hwzVarA.c(smartsChipView2.j);
                            hwzVarA.e(smartsChipView2.k);
                            smartsChipView2.d(hwzVarA.a());
                            break;
                        default:
                            SmartsChipView smartsChipView3 = smartsChipView;
                            hwz hwzVarA2 = hxa.a(this);
                            hwzVarA2.f(smartsChipView3.m);
                            hwzVarA2.d(smartsChipView3.i);
                            hwzVarA2.c(smartsChipView3.j);
                            hwzVarA2.e(smartsChipView3.k);
                            smartsChipView3.d(hwzVarA2.a());
                            break;
                    }
                }
            }, aau.a(smartsChipView.getContext())));
            final View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: hxu
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                    SmartsChipView smartsChipView2 = smartsChipView;
                    hwz hwzVarA = hxa.a(this);
                    hwzVarA.f(smartsChipView2.m);
                    hwzVarA.b(true);
                    hwzVarA.d(smartsChipView2.i);
                    hwzVarA.c(smartsChipView2.j);
                    hwzVarA.e(smartsChipView2.k);
                    smartsChipView2.d(hwzVarA.a());
                }
            };
            ((ViewGroup) smartsChipView.getParent()).addOnLayoutChangeListener(onLayoutChangeListener);
            smartsChipView.l.c(new lie() { // from class: hxw
                @Override // defpackage.lie, java.lang.AutoCloseable
                public final void close() {
                    smartsChipView.removeOnLayoutChangeListener(onLayoutChangeListener);
                }
            });
            smartsChipView.c(this);
            if (s()) {
                if (this.e.a()) {
                    jty.e(this.c);
                }
                smartsChipView.a(0);
                Runnable runnable = this.b.i;
                if (runnable != null) {
                    runnable.run();
                }
                this.d.ab(2, this.a.a);
            } else {
                smartsChipView.setVisibility(8);
            }
            smartsChipView.g = this.b.j;
        }
        this.g = true;
    }

    @Override // defpackage.elv
    public final boolean k() {
        return true;
    }

    @Override // defpackage.elv
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // defpackage.elv
    public final boolean m() {
        return this.b.l;
    }

    @Override // defpackage.elv
    public final boolean n() {
        return false;
    }

    @Override // defpackage.elv
    public final /* synthetic */ boolean o() {
        return true;
    }

    @Override // defpackage.elv
    public final int p() {
        return this.a.i;
    }

    @Override // defpackage.elv
    public final void q(int i, boolean z, boolean z2) {
        SmartsChipView smartsChipView = this.c;
        hwz hwzVarA = hxa.a(this);
        hwzVarA.f(i);
        hwzVarA.d(z2);
        hwzVarA.c(z);
        hwzVarA.e(this.j);
        smartsChipView.d(hwzVarA.a());
    }

    @Override // defpackage.iap
    public final void r(iax iaxVar) {
        this.b = iaxVar;
        if (this.g) {
            SmartsChipView smartsChipView = this.c;
            smartsChipView.c(this);
            if (s()) {
                Runnable runnable = this.b.i;
                if (runnable != null) {
                    runnable.run();
                }
                smartsChipView.setVisibility(0);
            } else {
                smartsChipView.setVisibility(8);
            }
            smartsChipView.g = this.b.j;
        }
    }

    @Override // defpackage.iap
    public final boolean s() {
        iax iaxVar = this.b;
        return (iaxVar.d == null && iaxVar.c == null) ? false : true;
    }
}
