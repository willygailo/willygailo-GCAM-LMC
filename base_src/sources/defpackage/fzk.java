package defpackage;

import com.google.android.apps.camera.ui.views.ViewfinderCover;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fzk {
    public final /* synthetic */ fzn a;

    public final void a(final jrl jrlVar) {
        final fzn fznVar = this.a;
        synchronized (fznVar.b) {
            if (fznVar.l == jrlVar) {
                return;
            }
            final ViewfinderCover viewfinderCover = ((jnw) fznVar.i).get().e;
            if (fznVar.l != jrl.SLOW_MOTION && jrlVar == jrl.SLOW_MOTION) {
                final int i = 1;
                fznVar.f.c(new Runnable() { // from class: fzl
                    @Override // java.lang.Runnable
                    public final void run() {
                        final int i2 = 1;
                        switch (i) {
                            case 0:
                                final fzn fznVar2 = fznVar;
                                ViewfinderCover viewfinderCover2 = viewfinderCover;
                                final jrl jrlVar2 = jrlVar;
                                fznVar2.g.p();
                                final int i3 = 0;
                                viewfinderCover2.o(jrlVar2, new Runnable() { // from class: fzm
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i3) {
                                            case 0:
                                                fzn fznVar3 = fznVar2;
                                                fznVar3.u((buf) fznVar3.c.get(), jrlVar2);
                                                break;
                                            case 1:
                                                fzn fznVar4 = fznVar2;
                                                fznVar4.u((buf) fznVar4.d.get(), jrlVar2);
                                                break;
                                            default:
                                                fzn fznVar5 = fznVar2;
                                                fznVar5.u((buf) fznVar5.e.get(), jrlVar2);
                                                break;
                                        }
                                    }
                                }, true);
                                break;
                            case 1:
                                final fzn fznVar3 = fznVar;
                                ViewfinderCover viewfinderCover3 = viewfinderCover;
                                final jrl jrlVar3 = jrlVar;
                                fznVar3.g.n();
                                viewfinderCover3.o(jrlVar3, new Runnable() { // from class: fzm
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i2) {
                                            case 0:
                                                fzn fznVar4 = fznVar3;
                                                fznVar4.u((buf) fznVar4.c.get(), jrlVar3);
                                                break;
                                            case 1:
                                                fzn fznVar5 = fznVar3;
                                                fznVar5.u((buf) fznVar5.d.get(), jrlVar3);
                                                break;
                                            default:
                                                fzn fznVar6 = fznVar3;
                                                fznVar6.u((buf) fznVar6.e.get(), jrlVar3);
                                                break;
                                        }
                                    }
                                }, true);
                                break;
                            default:
                                final fzn fznVar4 = fznVar;
                                ViewfinderCover viewfinderCover4 = viewfinderCover;
                                final jrl jrlVar4 = jrlVar;
                                fznVar4.g.o();
                                final int i4 = 2;
                                viewfinderCover4.o(jrlVar4, new Runnable() { // from class: fzm
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i4) {
                                            case 0:
                                                fzn fznVar5 = fznVar4;
                                                fznVar5.u((buf) fznVar5.c.get(), jrlVar4);
                                                break;
                                            case 1:
                                                fzn fznVar6 = fznVar4;
                                                fznVar6.u((buf) fznVar6.d.get(), jrlVar4);
                                                break;
                                            default:
                                                fzn fznVar7 = fznVar4;
                                                fznVar7.u((buf) fznVar7.e.get(), jrlVar4);
                                                break;
                                        }
                                    }
                                }, true);
                                break;
                        }
                    }
                });
            } else if (fznVar.l != jrl.VIDEO && jrlVar == jrl.VIDEO) {
                final int i2 = 0;
                fznVar.f.c(new Runnable() { // from class: fzl
                    @Override // java.lang.Runnable
                    public final void run() {
                        final int i3 = 1;
                        switch (i2) {
                            case 0:
                                final fzn fznVar2 = fznVar;
                                ViewfinderCover viewfinderCover2 = viewfinderCover;
                                final jrl jrlVar2 = jrlVar;
                                fznVar2.g.p();
                                final int i4 = 0;
                                viewfinderCover2.o(jrlVar2, new Runnable() { // from class: fzm
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i4) {
                                            case 0:
                                                fzn fznVar5 = fznVar2;
                                                fznVar5.u((buf) fznVar5.c.get(), jrlVar2);
                                                break;
                                            case 1:
                                                fzn fznVar6 = fznVar2;
                                                fznVar6.u((buf) fznVar6.d.get(), jrlVar2);
                                                break;
                                            default:
                                                fzn fznVar7 = fznVar2;
                                                fznVar7.u((buf) fznVar7.e.get(), jrlVar2);
                                                break;
                                        }
                                    }
                                }, true);
                                break;
                            case 1:
                                final fzn fznVar3 = fznVar;
                                ViewfinderCover viewfinderCover3 = viewfinderCover;
                                final jrl jrlVar3 = jrlVar;
                                fznVar3.g.n();
                                viewfinderCover3.o(jrlVar3, new Runnable() { // from class: fzm
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i3) {
                                            case 0:
                                                fzn fznVar5 = fznVar3;
                                                fznVar5.u((buf) fznVar5.c.get(), jrlVar3);
                                                break;
                                            case 1:
                                                fzn fznVar6 = fznVar3;
                                                fznVar6.u((buf) fznVar6.d.get(), jrlVar3);
                                                break;
                                            default:
                                                fzn fznVar7 = fznVar3;
                                                fznVar7.u((buf) fznVar7.e.get(), jrlVar3);
                                                break;
                                        }
                                    }
                                }, true);
                                break;
                            default:
                                final fzn fznVar4 = fznVar;
                                ViewfinderCover viewfinderCover4 = viewfinderCover;
                                final jrl jrlVar4 = jrlVar;
                                fznVar4.g.o();
                                final int i5 = 2;
                                viewfinderCover4.o(jrlVar4, new Runnable() { // from class: fzm
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i5) {
                                            case 0:
                                                fzn fznVar5 = fznVar4;
                                                fznVar5.u((buf) fznVar5.c.get(), jrlVar4);
                                                break;
                                            case 1:
                                                fzn fznVar6 = fznVar4;
                                                fznVar6.u((buf) fznVar6.d.get(), jrlVar4);
                                                break;
                                            default:
                                                fzn fznVar7 = fznVar4;
                                                fznVar7.u((buf) fznVar7.e.get(), jrlVar4);
                                                break;
                                        }
                                    }
                                }, true);
                                break;
                        }
                    }
                });
            } else if (fznVar.l == jrl.TIME_LAPSE || jrlVar != jrl.TIME_LAPSE) {
                fznVar.l = jrlVar;
            } else {
                final int i3 = 2;
                fznVar.f.c(new Runnable() { // from class: fzl
                    @Override // java.lang.Runnable
                    public final void run() {
                        final int i4 = 1;
                        switch (i3) {
                            case 0:
                                final fzn fznVar2 = fznVar;
                                ViewfinderCover viewfinderCover2 = viewfinderCover;
                                final jrl jrlVar2 = jrlVar;
                                fznVar2.g.p();
                                final int i5 = 0;
                                viewfinderCover2.o(jrlVar2, new Runnable() { // from class: fzm
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i5) {
                                            case 0:
                                                fzn fznVar5 = fznVar2;
                                                fznVar5.u((buf) fznVar5.c.get(), jrlVar2);
                                                break;
                                            case 1:
                                                fzn fznVar6 = fznVar2;
                                                fznVar6.u((buf) fznVar6.d.get(), jrlVar2);
                                                break;
                                            default:
                                                fzn fznVar7 = fznVar2;
                                                fznVar7.u((buf) fznVar7.e.get(), jrlVar2);
                                                break;
                                        }
                                    }
                                }, true);
                                break;
                            case 1:
                                final fzn fznVar3 = fznVar;
                                ViewfinderCover viewfinderCover3 = viewfinderCover;
                                final jrl jrlVar3 = jrlVar;
                                fznVar3.g.n();
                                viewfinderCover3.o(jrlVar3, new Runnable() { // from class: fzm
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i4) {
                                            case 0:
                                                fzn fznVar5 = fznVar3;
                                                fznVar5.u((buf) fznVar5.c.get(), jrlVar3);
                                                break;
                                            case 1:
                                                fzn fznVar6 = fznVar3;
                                                fznVar6.u((buf) fznVar6.d.get(), jrlVar3);
                                                break;
                                            default:
                                                fzn fznVar7 = fznVar3;
                                                fznVar7.u((buf) fznVar7.e.get(), jrlVar3);
                                                break;
                                        }
                                    }
                                }, true);
                                break;
                            default:
                                final fzn fznVar4 = fznVar;
                                ViewfinderCover viewfinderCover4 = viewfinderCover;
                                final jrl jrlVar4 = jrlVar;
                                fznVar4.g.o();
                                final int i6 = 2;
                                viewfinderCover4.o(jrlVar4, new Runnable() { // from class: fzm
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i6) {
                                            case 0:
                                                fzn fznVar5 = fznVar4;
                                                fznVar5.u((buf) fznVar5.c.get(), jrlVar4);
                                                break;
                                            case 1:
                                                fzn fznVar6 = fznVar4;
                                                fznVar6.u((buf) fznVar6.d.get(), jrlVar4);
                                                break;
                                            default:
                                                fzn fznVar7 = fznVar4;
                                                fznVar7.u((buf) fznVar7.e.get(), jrlVar4);
                                                break;
                                        }
                                    }
                                }, true);
                                break;
                        }
                    }
                });
            }
        }
    }
}
