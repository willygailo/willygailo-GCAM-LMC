package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class iai implements iat {
    public iax a;
    private iay b;
    private boolean c;

    @Override // defpackage.iat
    public void a() {
        this.a = null;
        iay iayVar = this.b;
        if (iayVar != null) {
            iayVar.a();
            this.b = null;
        }
    }

    @Override // defpackage.iat
    public void b(iay iayVar) {
        this.b = iayVar;
        iax iaxVar = this.a;
        if (iaxVar != null) {
            iayVar.b(iaxVar);
        }
    }

    protected final void c() {
        this.a = null;
        iay iayVar = this.b;
        if (iayVar != null) {
            iayVar.a();
        }
    }

    protected final void d(iax iaxVar) {
        iaw iawVarB = iaxVar.b();
        final Runnable runnable = iaxVar.e;
        if (runnable != null) {
            final int i = 1;
            iawVarB.d = new Runnable(this) { // from class: iah
                public final /* synthetic */ iai a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            iai iaiVar = this.a;
                            Runnable runnable2 = runnable;
                            iaiVar.c();
                            runnable2.run();
                            break;
                        case 1:
                            iai iaiVar2 = this.a;
                            Runnable runnable3 = runnable;
                            iaiVar2.c();
                            runnable3.run();
                            break;
                        case 2:
                            iai iaiVar3 = this.a;
                            Runnable runnable4 = runnable;
                            iaiVar3.c();
                            runnable4.run();
                            break;
                        default:
                            iai iaiVar4 = this.a;
                            Runnable runnable5 = runnable;
                            iaiVar4.a = null;
                            if (runnable5 != null) {
                                runnable5.run();
                            }
                            break;
                    }
                }
            };
        }
        final Runnable runnable2 = iaxVar.h;
        if (runnable2 != null) {
            final int i2 = 0;
            iawVarB.g = new Runnable(this) { // from class: iah
                public final /* synthetic */ iai a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            iai iaiVar = this.a;
                            Runnable runnable3 = runnable2;
                            iaiVar.c();
                            runnable3.run();
                            break;
                        case 1:
                            iai iaiVar2 = this.a;
                            Runnable runnable4 = runnable2;
                            iaiVar2.c();
                            runnable4.run();
                            break;
                        case 2:
                            iai iaiVar3 = this.a;
                            Runnable runnable5 = runnable2;
                            iaiVar3.c();
                            runnable5.run();
                            break;
                        default:
                            iai iaiVar4 = this.a;
                            Runnable runnable6 = runnable2;
                            iaiVar4.a = null;
                            if (runnable6 != null) {
                                runnable6.run();
                            }
                            break;
                    }
                }
            };
        }
        final Runnable runnable3 = iaxVar.f;
        if (runnable3 != null) {
            final int i3 = 2;
            iawVarB.e = new Runnable(this) { // from class: iah
                public final /* synthetic */ iai a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i3) {
                        case 0:
                            iai iaiVar = this.a;
                            Runnable runnable4 = runnable3;
                            iaiVar.c();
                            runnable4.run();
                            break;
                        case 1:
                            iai iaiVar2 = this.a;
                            Runnable runnable5 = runnable3;
                            iaiVar2.c();
                            runnable5.run();
                            break;
                        case 2:
                            iai iaiVar3 = this.a;
                            Runnable runnable6 = runnable3;
                            iaiVar3.c();
                            runnable6.run();
                            break;
                        default:
                            iai iaiVar4 = this.a;
                            Runnable runnable7 = runnable3;
                            iaiVar4.a = null;
                            if (runnable7 != null) {
                                runnable7.run();
                            }
                            break;
                    }
                }
            };
        }
        final Runnable runnable4 = iaxVar.k;
        if (!iaxVar.l) {
            final int i4 = 3;
            iawVarB.j = new Runnable(this) { // from class: iah
                public final /* synthetic */ iai a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i4) {
                        case 0:
                            iai iaiVar = this.a;
                            Runnable runnable5 = runnable4;
                            iaiVar.c();
                            runnable5.run();
                            break;
                        case 1:
                            iai iaiVar2 = this.a;
                            Runnable runnable6 = runnable4;
                            iaiVar2.c();
                            runnable6.run();
                            break;
                        case 2:
                            iai iaiVar3 = this.a;
                            Runnable runnable7 = runnable4;
                            iaiVar3.c();
                            runnable7.run();
                            break;
                        default:
                            iai iaiVar4 = this.a;
                            Runnable runnable8 = runnable4;
                            iaiVar4.a = null;
                            if (runnable8 != null) {
                                runnable8.run();
                            }
                            break;
                    }
                }
            };
        }
        iax iaxVarA = iawVarB.a();
        iay iayVar = this.b;
        if (iayVar != null && !this.c) {
            if (this.a != null) {
                iayVar.c(iaxVarA);
            } else {
                iayVar.b(iaxVarA);
            }
        }
        this.a = iaxVarA;
    }

    @Override // defpackage.iat
    public void u() {
        this.c = true;
    }

    @Override // defpackage.iat
    public final void v() {
        this.c = false;
        iax iaxVar = this.a;
        if (iaxVar != null) {
            iay iayVar = this.b;
            iayVar.getClass();
            iayVar.b(iaxVar);
        }
    }
}
