package defpackage;

import android.media.MediaFormat;
import com.google.android.apps.camera.moments.MomentsUtils;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class gay implements gey {
    private static final AtomicInteger b = new AtomicInteger(0);
    public final gcn a;
    private final gaz c;
    private final geq d;
    private final lis e;
    private final ddf f;
    private final MediaFormat g;
    private final MediaFormat h;
    private final long i;
    private final hcg j;
    private final ojc k;

    public gay(gaz gazVar, geq geqVar, lis lisVar, ddf ddfVar, gcn gcnVar, MediaFormat mediaFormat, MediaFormat mediaFormat2, long j, hcg hcgVar, ojc ojcVar) {
        this.c = gazVar;
        this.d = geqVar;
        this.e = lisVar.a(gcl.class.getSimpleName());
        this.f = ddfVar;
        this.a = gcnVar;
        this.g = mediaFormat;
        this.h = mediaFormat2;
        this.i = j;
        this.j = hcgVar;
        this.k = ojcVar;
    }

    private static int d(boolean z, boolean z2) {
        if (z) {
            return z2 ? 2 : 1;
        }
        return 0;
    }

    @Override // defpackage.gey
    public final int a() {
        return 1;
    }

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
    @Override // defpackage.gey
    public final void b(lmr lmrVar, gfs gfsVar, gfi gfiVar, gex gexVar) {
        lwk lwkVar;
        Throwable th;
        int iD;
        String str;
        int andIncrement = b.getAndIncrement();
        StringBuilder sb = new StringBuilder(31);
        sb.append("fast launcher shot ");
        sb.append(andIncrement);
        sb.append(" ");
        lix lixVarJ = lix.j(sb.toString(), this.e);
        lixVarJ.b("launcher got a HDR+ burst");
        lmw lmwVarB = lmrVar.b();
        lmwVarB.getClass();
        long j = lmwVarB.b;
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("    with frame: ");
        sb2.append(j);
        lixVarJ.b(sb2.toString());
        try {
            lzv lzvVar = (lzv) MomentsUtils.a(lmrVar).get(5000L, TimeUnit.MILLISECONDS);
            lmw lmwVarB2 = lmrVar.b();
            lmwVarB2.getClass();
            long j2 = lmwVarB2.b;
            hcf hcfVarA = this.j.a(lmrVar);
            mad madVarE = hcfVarA.e();
            mad madVarD = hcfVarA.d();
            mad lwjVar = madVarD == null ? new lwj(j2) : madVarD;
            lmrVar.close();
            if (madVarE == null) {
                gexVar.b(new RuntimeException("Could not get a raw image from input frame"));
                return;
            }
            lwk lwkVar2 = new lwk(madVarE, 1);
            try {
                lwk lwkVar3 = new lwk(lwjVar, 1);
                try {
                    lixVarJ.b("Acquired frame metadata successfully.");
                    mad madVarK = lwkVar3.k();
                    if (madVarK == null) {
                        try {
                            lixVarJ.d("Failed to fork PD image");
                            lwkVar3.l();
                        } catch (Throwable th2) {
                            th = th2;
                            lwkVar = lwkVar3;
                            try {
                                lwkVar.l();
                                throw th;
                            } catch (Throwable th3) {
                                throw th;
                            }
                        }
                    } else {
                        lwkVar = lwkVar3;
                        int i = 1;
                        try {
                            gax gaxVar = new gax(this, lwkVar2, gfiVar, j2, lzvVar, lwjVar, madVarK, gexVar, lixVarJ);
                            ger gerVarA = this.c.a(lzvVar, gfsVar.a);
                            lig ligVar = gfsVar.i ? new lig(this.h.getInteger("width"), this.h.getInteger("height")) : new lig(this.g.getInteger("width"), this.g.getInteger("height"));
                            boolean z = false;
                            if (gfsVar.i) {
                                boolean zK = this.f.k(dds.r);
                                if (this.f.k(dds.t) || this.f.k(dds.s)) {
                                    z = true;
                                }
                                iD = d(zK, z);
                            } else {
                                ddf ddfVar = this.f;
                                ddg ddgVar = dds.a;
                                ddfVar.d();
                                this.f.d();
                                iD = d(false, false);
                            }
                            boolean zK2 = this.f.k(dds.y);
                            int i2 = 3;
                            if (!zK2) {
                                i = 3;
                            } else if (this.f.k(dds.S)) {
                                i = 2;
                            }
                            if (!gfiVar.b || !this.k.g()) {
                                i2 = i;
                            }
                            gep gepVar = new gep(ligVar, iD, i2, zK2 ? 0L : this.i);
                            mad madVarK2 = lwkVar2.k();
                            if (madVarK2 == null) {
                                lixVarJ.d("Failed to fork raw image");
                            } else {
                                this.d.b(madVarK2, gerVarA, gepVar, gaxVar);
                                switch (i2) {
                                    case 1:
                                        str = "RGBA_HARDWARE_BUFFER";
                                        break;
                                    case 2:
                                        str = "YUV_HARDWARE_BUFFER";
                                        break;
                                    default:
                                        str = "YUV_IMAGE";
                                        break;
                                }
                                StringBuilder sb3 = new StringBuilder(str.length() + 45);
                                sb3.append("launched FastMomentsHdr shot, outputFormat = ");
                                sb3.append(str);
                                lixVarJ.b(sb3.toString());
                            }
                            lwkVar.l();
                        } catch (Throwable th4) {
                            th = th4;
                            th = th;
                            lwkVar.l();
                            throw th;
                        }
                    }
                    lwkVar2.l();
                } catch (Throwable th5) {
                    th = th5;
                    lwkVar = lwkVar3;
                }
            } catch (Throwable th6) {
                try {
                    lwkVar2.l();
                    throw th6;
                } catch (Throwable th7) {
                    throw th6;
                }
            }
        } catch (InterruptedException e) {
            lixVarJ.d("metadata get interrupted");
            lmrVar.close();
            gexVar.b(e);
        } catch (ExecutionException e2) {
            lixVarJ.d("Failed to acquire metadata from the first frame.");
            lmrVar.close();
            gexVar.b(e2);
        } catch (TimeoutException e3) {
            lixVarJ.d("Timed out waiting for metadata.");
            lmrVar.close();
            gexVar.b(e3);
        }
    }

    @Override // defpackage.gey
    public final boolean c(lmr lmrVar, hcg hcgVar) {
        return this.d.c(lmrVar, hcgVar);
    }
}
