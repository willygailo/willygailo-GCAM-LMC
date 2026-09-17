package defpackage;

import com.google.android.apps.camera.uiutils.ReplaceableView;

/* JADX INFO: loaded from: classes2.dex */
public final class hop implements hpb {
    public final int a;
    public boolean b;
    private final lar c;
    private final lco d;
    private hor e;
    private lco f;
    private lco g;
    private lco h;
    private int i;
    private hos j;
    private jsc k;

    public hop(lar larVar, ddf ddfVar, lda ldaVar) {
        this.c = larVar;
        this.d = ldaVar;
        if (ddfVar.k(ddl.ah)) {
            this.a = ((Integer) ddfVar.a(ddl.i).c()).intValue();
        } else {
            this.a = ((Integer) ddfVar.a(ddl.g).c()).intValue() | (-16777216);
        }
    }

    @Override // defpackage.hpb
    public final pht a() {
        jsc jscVar = this.k;
        obr.ao(jscVar);
        jscVar.a();
        hor horVar = this.e;
        obr.ao(horVar);
        horVar.setVisibility(8);
        pht phtVarD = hor.d();
        phtVarD.d(new bvf(17), pgr.INSTANCE);
        return phtVarD;
    }

    @Override // defpackage.hpb
    public final pht b() {
        if (this.d.fA() == jrl.LONG_EXPOSURE) {
            jsc jscVar = this.k;
            obr.ao(jscVar);
            jscVar.b(this.i);
        } else {
            jsc jscVar2 = this.k;
            obr.ao(jscVar2);
            jscVar2.c();
        }
        hor horVar = this.e;
        obr.ao(horVar);
        horVar.setVisibility(0);
        return hor.d();
    }

    public final void c() {
        if (d()) {
            this.j.b();
        } else {
            this.j.d();
        }
    }

    @Override // defpackage.hpb
    public final boolean d() {
        if (!this.b) {
            return false;
        }
        jrl jrlVar = (jrl) this.d.fA();
        boolean z = jrlVar == jrl.VIDEO || jrlVar == jrl.VIDEO_INTENT;
        boolean z2 = jrlVar == jrl.PHOTO || jrlVar == jrl.IMAGE_INTENT || jrlVar == jrl.PORTRAIT;
        return (z && ((String) ((lce) this.f).d).equals("torch")) || (z2 && ((String) ((lce) this.g).d).equals("on")) || (jrlVar == jrl.LONG_EXPOSURE && ((String) ((lce) this.h).d).equals("torch"));
    }

    @Override // defpackage.hpb
    public final void e(hos hosVar, lap lapVar, ReplaceableView replaceableView, hpc hpcVar, jsc jscVar, lco lcoVar, lco lcoVar2, lco lcoVar3, lco lcoVar4) {
        this.f = lcoVar;
        this.g = lcoVar2;
        this.h = lcoVar3;
        this.k = jscVar;
        this.i = hpcVar.a();
        hor horVar = new hor(replaceableView.getContext());
        this.e = horVar;
        horVar.setBackgroundColor(this.a);
        replaceableView.a(this.e);
        this.j = hosVar;
        hosVar.f();
        final int i = 2;
        lapVar.c(this.f.a(new lij(this) { // from class: hoo
            public final /* synthetic */ hop a;

            {
                this.a = this;
            }

            @Override // defpackage.lij
            public final void fB(Object obj) {
                switch (i) {
                    case 0:
                        this.a.c();
                        break;
                    case 1:
                        hop hopVar = this.a;
                        hopVar.b = ((cwi) obj).a.k() == lwd.FRONT;
                        hopVar.c();
                        break;
                    case 2:
                        this.a.c();
                        break;
                    case 3:
                        this.a.c();
                        break;
                    default:
                        this.a.c();
                        break;
                }
            }
        }, this.c));
        final int i2 = 3;
        lapVar.c(lcoVar2.a(new lij(this) { // from class: hoo
            public final /* synthetic */ hop a;

            {
                this.a = this;
            }

            @Override // defpackage.lij
            public final void fB(Object obj) {
                switch (i2) {
                    case 0:
                        this.a.c();
                        break;
                    case 1:
                        hop hopVar = this.a;
                        hopVar.b = ((cwi) obj).a.k() == lwd.FRONT;
                        hopVar.c();
                        break;
                    case 2:
                        this.a.c();
                        break;
                    case 3:
                        this.a.c();
                        break;
                    default:
                        this.a.c();
                        break;
                }
            }
        }, this.c));
        final int i3 = 4;
        lapVar.c(lcoVar3.a(new lij(this) { // from class: hoo
            public final /* synthetic */ hop a;

            {
                this.a = this;
            }

            @Override // defpackage.lij
            public final void fB(Object obj) {
                switch (i3) {
                    case 0:
                        this.a.c();
                        break;
                    case 1:
                        hop hopVar = this.a;
                        hopVar.b = ((cwi) obj).a.k() == lwd.FRONT;
                        hopVar.c();
                        break;
                    case 2:
                        this.a.c();
                        break;
                    case 3:
                        this.a.c();
                        break;
                    default:
                        this.a.c();
                        break;
                }
            }
        }, this.c));
        final int i4 = 0;
        lapVar.c(this.d.a(new lij(this) { // from class: hoo
            public final /* synthetic */ hop a;

            {
                this.a = this;
            }

            @Override // defpackage.lij
            public final void fB(Object obj) {
                switch (i4) {
                    case 0:
                        this.a.c();
                        break;
                    case 1:
                        hop hopVar = this.a;
                        hopVar.b = ((cwi) obj).a.k() == lwd.FRONT;
                        hopVar.c();
                        break;
                    case 2:
                        this.a.c();
                        break;
                    case 3:
                        this.a.c();
                        break;
                    default:
                        this.a.c();
                        break;
                }
            }
        }, this.c));
        final int i5 = 1;
        lapVar.c(lcoVar4.a(new lij(this) { // from class: hoo
            public final /* synthetic */ hop a;

            {
                this.a = this;
            }

            @Override // defpackage.lij
            public final void fB(Object obj) {
                switch (i5) {
                    case 0:
                        this.a.c();
                        break;
                    case 1:
                        hop hopVar = this.a;
                        hopVar.b = ((cwi) obj).a.k() == lwd.FRONT;
                        hopVar.c();
                        break;
                    case 2:
                        this.a.c();
                        break;
                    case 3:
                        this.a.c();
                        break;
                    default:
                        this.a.c();
                        break;
                }
            }
        }, this.c));
    }
}
