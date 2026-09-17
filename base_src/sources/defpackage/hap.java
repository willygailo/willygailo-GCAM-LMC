package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hap implements goy {
    private static final ouj a = ouj.h("com/google/android/apps/camera/pixelcamerakit/commands/PckSingleFlashHdrPlusImageCaptureCommand");
    private final lnc b;
    private final hcs c;
    private final lco d;
    private final gwi e;
    private final hbb f;
    private final ljf g;
    private final lnv h;
    private final ddf i;
    private final lap j;

    public hap(lnc lncVar, hcs hcsVar, lco lcoVar, gwi gwiVar, ljf ljfVar, hbb hbbVar, ddf ddfVar, lap lapVar) {
        this.b = lncVar;
        this.c = hcsVar;
        this.d = lcoVar;
        this.e = gwiVar;
        this.g = ljfVar;
        this.f = hbbVar;
        this.i = ddfVar;
        this.j = lapVar;
        lnu lnuVarA = lnv.a();
        lnuVarA.b(3);
        lnuVarA.c(4);
        lnuVarA.e(1);
        lnuVarA.d(true);
        this.h = lnuVarA.a();
    }

    @Override // defpackage.goy
    public final lco a() {
        return this.d;
    }

    @Override // defpackage.goy
    public final lco b() {
        return lcv.g(fcy.l());
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:41:0x0100  */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:577)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:603)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    @Override // defpackage.goy
    public final void c(gox goxVar, gog gogVar) throws Throwable {
        hsa hsaVar;
        Object objA = this.c.a();
        this.g.e("pckFlashHdr#sessionAnd3A");
        boolean z = false;
        try {
            try {
                lng lngVarC = this.b.c();
                try {
                    ggx ggxVarA = this.e.a(lngVarC, this.h);
                    try {
                        gogVar.a.g.fB(false);
                        this.g.g("pckFlashHdr#submitCaptureRequest");
                        lpc lpcVarI = lngVarC.i();
                        lpcVarI.f((lqd) objA);
                        enl.x(this.i, lpcVarI);
                        lqa lqaVarD = lngVarC.d(lpcVarI.b());
                        gogVar.c.c().g();
                        goxVar.close();
                        ggxVarA.close();
                        lngVarC.close();
                        this.g.g("pckFlashHdr#getFrame");
                        lmr lmrVarA = lqaVarD.a((lqd) objA);
                        lqaVarD.close();
                        if (lmrVarA != null) {
                            mip.bh(lmrVarA);
                            this.g.g("pckFlashHdr#process");
                            this.f.g(oom.m(lmrVarA), hao.a, gogVar);
                            z = true;
                        }
                        try {
                            ggxVarA.close();
                            try {
                                lngVarC.close();
                                if (!z) {
                                    ((oug) ((oug) a.b()).G((char) 2263)).o("Error capturing image.");
                                    gogVar.c.f();
                                    hsa hsaVar2 = gogVar.b;
                                    if (this.j.a()) {
                                        hsaVar2.w(new dmb((Throwable) null));
                                    } else {
                                        hsaVar2.C(jmq.a, new dmd("Image capture failed. Aborting capture!"));
                                    }
                                }
                            } catch (dmd e) {
                                e = e;
                                if (!z) {
                                    ((oug) ((oug) a.b()).G((char) 2264)).o("Error capturing image.");
                                    gogVar.c.f();
                                    hsa hsaVar3 = gogVar.b;
                                    if (this.j.a()) {
                                        hsaVar3.w(new dmb(e));
                                    } else {
                                        hsaVar3.C(jmq.a, e);
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (!z) {
                                    ((oug) ((oug) a.b()).G((char) 2265)).o("Error capturing image.");
                                    gogVar.c.f();
                                    hsaVar = gogVar.b;
                                    if (this.j.a()) {
                                        hsaVar.w(new dmb((Throwable) null));
                                    } else {
                                        hsaVar.C(jmq.a, new dmd("Image capture failed. Aborting capture!"));
                                    }
                                }
                                goxVar.close();
                                this.g.f();
                                throw th;
                            }
                            goxVar.close();
                            this.g.f();
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                lngVarC.close();
                            } catch (Throwable th3) {
                            }
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                                if (!z) {
                                    ((oug) ((oug) a.b()).G((char) 2265)).o("Error capturing image.");
                                    gogVar.c.f();
                                    hsaVar = gogVar.b;
                                    if (this.j.a()) {
                                        hsaVar.w(new dmb((Throwable) null));
                                    } else {
                                        hsaVar.C(jmq.a, new dmd("Image capture failed. Aborting capture!"));
                                    }
                                }
                                goxVar.close();
                                this.g.f();
                                throw th;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            ggxVarA.close();
                        } catch (Throwable th6) {
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            } catch (dmd e2) {
                e = e2;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }
}
