package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class pt implements Runnable {
    final /* synthetic */ RecyclerView a;
    private final /* synthetic */ int b;

    public pt(RecyclerView recyclerView, int i) {
        this.b = i;
        this.a = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004c A[LOOP:0: B:18:0x004a->B:19:0x004c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x007f  */
    /* JADX WARN: Code duplicated, block: B:24:0x009b  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:30:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:39:0x010c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0112  */
    /* JADX WARN: Code duplicated, block: B:45:0x0117  */
    /* JADX WARN: Code duplicated, block: B:46:0x0119  */
    /* JADX WARN: Code duplicated, block: B:49:0x011d  */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x010c, please report this as an issue */
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        int size;
        int i;
        long j;
        ArrayList arrayList2;
        ob obVar;
        long j2;
        ArrayList arrayList3;
        ob obVar2;
        ArrayList arrayList4;
        ob obVar3;
        switch (this.b) {
            case 0:
                py pyVar = this.a.E;
                if (pyVar != null) {
                    boolean zIsEmpty = pyVar.b.isEmpty();
                    boolean z = !zIsEmpty;
                    boolean zIsEmpty2 = pyVar.d.isEmpty();
                    boolean z2 = !zIsEmpty2;
                    boolean z3 = !pyVar.e.isEmpty();
                    boolean z4 = !pyVar.c.isEmpty();
                    if (z || z2 || z4) {
                        arrayList = pyVar.b;
                        size = arrayList.size();
                        for (i = 0; i < size; i++) {
                            qs qsVar = (qs) arrayList.get(i);
                            View view = qsVar.a;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            pyVar.k.add(qsVar);
                            viewPropertyAnimatorAnimate.setDuration(60L).alpha(0.0f).setListener(new oc(pyVar, qsVar, viewPropertyAnimatorAnimate, view)).start();
                        }
                        pyVar.b.clear();
                        if (z2) {
                            arrayList4 = new ArrayList();
                            arrayList4.addAll(pyVar.d);
                            pyVar.g.add(arrayList4);
                            pyVar.d.clear();
                            obVar3 = new ob(pyVar, arrayList4, 1);
                            if (z) {
                                gl.B(((oi) arrayList4.get(0)).a.a, obVar3, 120L);
                            } else {
                                obVar3.run();
                            }
                        }
                        if (z3) {
                            arrayList3 = new ArrayList();
                            arrayList3.addAll(pyVar.e);
                            pyVar.h.add(arrayList3);
                            pyVar.e.clear();
                            obVar2 = new ob(pyVar, arrayList3, 0);
                            if (z) {
                                j = 120;
                                gl.B(((oh) arrayList3.get(0)).a.a, obVar2, 120L);
                            } else {
                                j = 120;
                                obVar2.run();
                            }
                        } else {
                            j = 120;
                        }
                        if (z4) {
                            arrayList2 = new ArrayList();
                            arrayList2.addAll(pyVar.c);
                            pyVar.f.add(arrayList2);
                            pyVar.c.clear();
                            obVar = new ob(pyVar, arrayList2, 2);
                            if (!z || z2 || z3) {
                                if (true == zIsEmpty) {
                                    j = 0;
                                }
                                if (true != zIsEmpty2) {
                                    j2 = 250;
                                } else {
                                    j2 = 0;
                                }
                                gl.B(((qs) arrayList2.get(0)).a, obVar, j + Math.max(j2, true == z3 ? 250L : 0L));
                            } else {
                                obVar.run();
                            }
                        }
                    } else if (z3) {
                        z3 = true;
                        arrayList = pyVar.b;
                        size = arrayList.size();
                        while (i < size) {
                            qs qsVar2 = (qs) arrayList.get(i);
                            View view2 = qsVar2.a;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
                            pyVar.k.add(qsVar2);
                            viewPropertyAnimatorAnimate2.setDuration(60L).alpha(0.0f).setListener(new oc(pyVar, qsVar2, viewPropertyAnimatorAnimate2, view2)).start();
                        }
                        pyVar.b.clear();
                        if (z2) {
                            arrayList4 = new ArrayList();
                            arrayList4.addAll(pyVar.d);
                            pyVar.g.add(arrayList4);
                            pyVar.d.clear();
                            obVar3 = new ob(pyVar, arrayList4, 1);
                            if (z) {
                                gl.B(((oi) arrayList4.get(0)).a.a, obVar3, 120L);
                            } else {
                                obVar3.run();
                            }
                        }
                        if (z3) {
                            arrayList3 = new ArrayList();
                            arrayList3.addAll(pyVar.e);
                            pyVar.h.add(arrayList3);
                            pyVar.e.clear();
                            obVar2 = new ob(pyVar, arrayList3, 0);
                            if (z) {
                                j = 120;
                                gl.B(((oh) arrayList3.get(0)).a.a, obVar2, 120L);
                            } else {
                                j = 120;
                                obVar2.run();
                            }
                        } else {
                            j = 120;
                        }
                        if (z4) {
                            arrayList2 = new ArrayList();
                            arrayList2.addAll(pyVar.c);
                            pyVar.f.add(arrayList2);
                            pyVar.c.clear();
                            obVar = new ob(pyVar, arrayList2, 2);
                            if (z) {
                                if (true == zIsEmpty) {
                                    j = 0;
                                }
                                if (true != zIsEmpty2) {
                                    j2 = 250;
                                } else {
                                    j2 = 0;
                                }
                                gl.B(((qs) arrayList2.get(0)).a, obVar, j + Math.max(j2, true == z3 ? 250L : 0L));
                            } else {
                                if (true == zIsEmpty) {
                                    j = 0;
                                }
                                if (true != zIsEmpty2) {
                                    j2 = 250;
                                } else {
                                    j2 = 0;
                                }
                                gl.B(((qs) arrayList2.get(0)).a, obVar, j + Math.max(j2, true == z3 ? 250L : 0L));
                            }
                        }
                    }
                }
                this.a.O = false;
                break;
            default:
                RecyclerView recyclerView = this.a;
                if (recyclerView.t && !recyclerView.isLayoutRequested()) {
                    RecyclerView recyclerView2 = this.a;
                    if (!recyclerView2.r) {
                        recyclerView2.requestLayout();
                    } else if (recyclerView2.v) {
                        recyclerView2.u = true;
                    } else {
                        recyclerView2.t();
                    }
                    break;
                }
                break;
        }
    }
}
