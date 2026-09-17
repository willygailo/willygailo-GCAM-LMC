package defpackage;

import android.hardware.camera2.CaptureResult;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.FrameRequestVector;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gzk {
    public final lis a;
    public final eam b;
    public final mcx c;
    public boolean d = false;
    public final ddf e;
    public final lng f;
    public poy g;
    private final ljf h;
    private final ebe i;
    private final gzu j;
    private final eaw k;
    private final hcg l;
    private final gog m;
    private final iio n;
    private final ojc o;

    public gzk(ljf ljfVar, lir lirVar, ebe ebeVar, eam eamVar, gzu gzuVar, eaw eawVar, hcg hcgVar, mcx mcxVar, ddf ddfVar, iio iioVar, ojc ojcVar, lng lngVar, gog gogVar) {
        this.h = ljfVar;
        this.i = ebeVar;
        this.b = eamVar;
        this.j = gzuVar;
        this.k = eawVar;
        this.l = hcgVar;
        this.c = mcxVar;
        this.e = ddfVar;
        this.n = iioVar;
        this.o = ojcVar;
        this.f = lngVar;
        this.m = gogVar;
        this.a = lirVar.a("PckHdrPBurstTkr");
    }

    private final lzv d(edd eddVar, int i, int i2, lmr lmrVar, int i3, lzv lzvVar) {
        return a(eddVar, i, i2, lmrVar, i3, true, oih.a, lzvVar);
    }

    private final void e(edd eddVar, int i, int i2, lzv lzvVar) {
        lis lisVar = this.a;
        int iA = eddVar.a();
        StringBuilder sb = new StringBuilder(73);
        sb.append("Marking frame ");
        sb.append(i + 1);
        sb.append(" of ");
        sb.append(i2);
        sb.append(" as invalid for shot ");
        sb.append(iA);
        sb.append(".");
        lisVar.h(sb.toString());
        this.i.p(eddVar, i, lzvVar, -1, null, null);
    }

    private final boolean f(edd eddVar, int i, int i2, lzv lzvVar, iij iijVar) {
        return b(eddVar, i, i2, lzvVar, iijVar, true);
    }

    public final lzv a(edd eddVar, int i, int i2, lmr lmrVar, int i3, boolean z, ojc ojcVar, lzv lzvVar) {
        String string;
        lzv lzvVarC;
        Integer num;
        ljf ljfVar = this.h;
        if (z) {
            string = "Frame";
        } else {
            StringBuilder sb = new StringBuilder(38);
            sb.append("SecondaryFrame");
            sb.append(i + 1);
            sb.append("of");
            sb.append(i2);
            string = sb.toString();
        }
        ljfVar.e(string);
        try {
            lzv lzvVarC2 = lmrVar.c();
            if (z) {
                if (kdb.q != null && (lzvVarC = lmrVar.c()) != null && (num = (Integer) lzvVarC.d(kdb.q)) != null && num.intValue() > 0) {
                    this.a.b(mip.bp("Skipped PSAF frame %d for shot %d", Integer.valueOf(i + 1), Integer.valueOf(eddVar.a())));
                    if (lzvVarC2 != null) {
                        lis lisVar = this.a;
                        String strValueOf = String.valueOf(lzvVarC2.d(CaptureResult.CONTROL_AF_STATE));
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 20);
                        sb2.append("PSAF frame af_state=");
                        sb2.append(strValueOf);
                        lisVar.b(sb2.toString());
                    }
                } else if (!this.d) {
                    this.b.l(false);
                    this.k.e(eddVar, lmrVar);
                }
                return null;
            }
            this.h.e(true != z ? "RetrievingImageSecondary" : "RetrievingImage");
            hcf hcfVarA = this.l.a(lmrVar);
            mad madVarE = hcfVarA.e();
            this.h.f();
            if (madVarE == null || lzvVarC2 == null) {
                if (madVarE != null) {
                    madVarE.close();
                }
                if (lzvVarC2 == null) {
                    lzvVarC2 = lzvVar;
                }
                if (lzvVarC2 != null) {
                    e(eddVar, i, i2, lzvVarC2);
                }
            } else {
                mad madVarD = hcfVarA.d();
                Object obj = madVarD != null ? "(+PD)" : "";
                this.i.q(eddVar, i, lzvVarC2, i3, madVarE, madVarD, ojcVar);
                this.a.f(mip.bp("Acquired frame %d of %d %s for shot %d at time %d frame %d.", Integer.valueOf(i + 1), Integer.valueOf(i2), obj, Integer.valueOf(eddVar.a()), Long.valueOf(madVarE.d()), Long.valueOf(lzvVarC2.b())));
            }
            return lzvVarC2;
        } finally {
            lmrVar.close();
            this.h.f();
        }
    }

    public final boolean b(edd eddVar, int i, int i2, lzv lzvVar, iij iijVar, boolean z) {
        if (lzvVar != null) {
            if (z) {
                this.m.b.L(lzvVar);
                iijVar.d(lzvVar, true);
            }
            while (i < i2) {
                e(eddVar, i, i2, lzvVar);
                i++;
            }
        }
        if (z) {
            eddVar.c.c.d().b();
            ((iik) iijVar).n = (ozr) this.g.j();
        }
        this.h.g("HdrPlus#endPayload");
        if (!this.i.y(eddVar)) {
            this.a.d(mip.bp("EndPayloadFrames failed for shot %d.", Integer.valueOf(eddVar.a())));
            return false;
        }
        if (z) {
            this.k.h(eddVar);
            this.n.c(iijVar);
            this.a.f(mip.bp("EndPayloadFrames succeeded for shot %d.", Integer.valueOf(eddVar.a())));
            if (this.d && i == 0) {
                this.a.f(mip.bp("Shot %d was successfully cancelled by user.", Integer.valueOf(eddVar.a())));
                this.m.b.w(new dmb((byte[]) null));
                this.i.o(eddVar);
                this.k.d(eddVar.c.b.h());
                return true;
            }
        }
        if (this.i.z(eddVar)) {
            this.a.f(mip.bp("EndShotCapture succeeded for shot %d.", Integer.valueOf(eddVar.a())));
            return true;
        }
        this.a.d(mip.bp("EndShotCapture failed for shot %d.", Integer.valueOf(eddVar.a())));
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x02c7 A[Catch: all -> 0x03b2, TRY_ENTER, TryCatch #12 {all -> 0x03b2, blocks: (B:98:0x029e, B:118:0x02c7, B:121:0x02f3, B:122:0x02fb, B:124:0x0303, B:126:0x0333, B:127:0x034c, B:128:0x0365, B:129:0x0388, B:110:0x02ba, B:79:0x0257), top: B:236:0x0150 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x02f3 A[Catch: all -> 0x03b2, LOOP:1: B:119:0x02ef->B:121:0x02f3, LOOP_END, TryCatch #12 {all -> 0x03b2, blocks: (B:98:0x029e, B:118:0x02c7, B:121:0x02f3, B:122:0x02fb, B:124:0x0303, B:126:0x0333, B:127:0x034c, B:128:0x0365, B:129:0x0388, B:110:0x02ba, B:79:0x0257), top: B:236:0x0150 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0303 A[Catch: all -> 0x03b2, TryCatch #12 {all -> 0x03b2, blocks: (B:98:0x029e, B:118:0x02c7, B:121:0x02f3, B:122:0x02fb, B:124:0x0303, B:126:0x0333, B:127:0x034c, B:128:0x0365, B:129:0x0388, B:110:0x02ba, B:79:0x0257), top: B:236:0x0150 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0333 A[Catch: all -> 0x03b2, TryCatch #12 {all -> 0x03b2, blocks: (B:98:0x029e, B:118:0x02c7, B:121:0x02f3, B:122:0x02fb, B:124:0x0303, B:126:0x0333, B:127:0x034c, B:128:0x0365, B:129:0x0388, B:110:0x02ba, B:79:0x0257), top: B:236:0x0150 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x034c A[Catch: all -> 0x03b2, TryCatch #12 {all -> 0x03b2, blocks: (B:98:0x029e, B:118:0x02c7, B:121:0x02f3, B:122:0x02fb, B:124:0x0303, B:126:0x0333, B:127:0x034c, B:128:0x0365, B:129:0x0388, B:110:0x02ba, B:79:0x0257), top: B:236:0x0150 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0365 A[Catch: all -> 0x03b2, TryCatch #12 {all -> 0x03b2, blocks: (B:98:0x029e, B:118:0x02c7, B:121:0x02f3, B:122:0x02fb, B:124:0x0303, B:126:0x0333, B:127:0x034c, B:128:0x0365, B:129:0x0388, B:110:0x02ba, B:79:0x0257), top: B:236:0x0150 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0388 A[Catch: all -> 0x03b2, TRY_LEAVE, TryCatch #12 {all -> 0x03b2, blocks: (B:98:0x029e, B:118:0x02c7, B:121:0x02f3, B:122:0x02fb, B:124:0x0303, B:126:0x0333, B:127:0x034c, B:128:0x0365, B:129:0x0388, B:110:0x02ba, B:79:0x0257), top: B:236:0x0150 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x0532 A[Catch: all -> 0x0587, LOOP:3: B:182:0x052c->B:184:0x0532, LOOP_END, TRY_LEAVE, TryCatch #3 {all -> 0x0587, blocks: (B:176:0x0503, B:191:0x0552, B:192:0x0556, B:194:0x055c, B:196:0x0568, B:199:0x056f, B:164:0x04ae, B:167:0x04b6, B:169:0x04c2, B:171:0x04c9, B:181:0x0510, B:182:0x052c, B:184:0x0532, B:189:0x0547, B:175:0x0500), top: B:220:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x053e A[Catch: all -> 0x05b1, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x05b1, blocks: (B:19:0x00f9, B:21:0x010b, B:25:0x0124, B:27:0x012a, B:28:0x0130, B:31:0x0144, B:33:0x014e, B:35:0x0152, B:99:0x02a1, B:131:0x03a5, B:80:0x025a, B:136:0x03b3, B:137:0x03ba, B:140:0x03c8, B:142:0x03cc, B:144:0x03d4, B:146:0x042c, B:148:0x044b, B:150:0x0453, B:152:0x0458, B:200:0x057f, B:187:0x053e, B:205:0x058b, B:206:0x0592, B:208:0x0594, B:22:0x0111, B:24:0x0119), top: B:235:0x00f9, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x0547 A[Catch: all -> 0x0587, TRY_ENTER, TryCatch #3 {all -> 0x0587, blocks: (B:176:0x0503, B:191:0x0552, B:192:0x0556, B:194:0x055c, B:196:0x0568, B:199:0x056f, B:164:0x04ae, B:167:0x04b6, B:169:0x04c2, B:171:0x04c9, B:181:0x0510, B:182:0x052c, B:184:0x0532, B:189:0x0547, B:175:0x0500), top: B:220:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x055c A[Catch: all -> 0x0587, LOOP:4: B:192:0x0556->B:194:0x055c, LOOP_END, TryCatch #3 {all -> 0x0587, blocks: (B:176:0x0503, B:191:0x0552, B:192:0x0556, B:194:0x055c, B:196:0x0568, B:199:0x056f, B:164:0x04ae, B:167:0x04b6, B:169:0x04c2, B:171:0x04c9, B:181:0x0510, B:182:0x052c, B:184:0x0532, B:189:0x0547, B:175:0x0500), top: B:220:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x0568 A[Catch: all -> 0x0587, TryCatch #3 {all -> 0x0587, blocks: (B:176:0x0503, B:191:0x0552, B:192:0x0556, B:194:0x055c, B:196:0x0568, B:199:0x056f, B:164:0x04ae, B:167:0x04b6, B:169:0x04c2, B:171:0x04c9, B:181:0x0510, B:182:0x052c, B:184:0x0532, B:189:0x0547, B:175:0x0500), top: B:220:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x056d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v66, types: [lqa] */
    /* JADX WARN: Type inference failed for: r0v73, types: [lpc] */
    /* JADX WARN: Type inference failed for: r0v75, types: [lqa] */
    /* JADX WARN: Type inference failed for: r1v65, types: [lqa] */
    /* JADX WARN: Type inference failed for: r7v0, types: [lqd] */
    /* JADX WARN: Type inference failed for: r7v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v15, types: [lqd] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean c(edd eddVar, BurstSpec burstSpec, ojc ojcVar, lzv lzvVar, goe goeVar, lpc lpcVar, lqd lqdVar, lie lieVar, iij iijVar, int i, int i2, int i3) {
        boolean zF;
        boolean z;
        List list;
        Iterator it;
        Iterator it2;
        ljf ljfVar;
        ?? r7;
        int i4;
        lzv lzvVar2;
        Throwable th;
        int i5;
        lmr lmrVar;
        int i6;
        int i7;
        lzv lzvVar3;
        boolean z2;
        boolean z3;
        lmr lmrVar2;
        int i8;
        ?? r8 = lqdVar;
        ljf ljfVar2 = this.h;
        int iA = eddVar.a();
        StringBuilder sb = new StringBuilder(25);
        sb.append("HdrPlusPayload");
        sb.append(iA);
        ljfVar2.e(sb.toString());
        FrameRequestVector frameRequestVectorB = burstSpec.b();
        ojc ojcVarB = ojcVar.b(eto.q);
        if (i <= 0) {
            return false;
        }
        ljf ljfVar3 = this.h;
        int iA2 = eddVar.a();
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("buildPayloadRequests");
        sb2.append(iA2);
        ljfVar3.e(sb2.toString());
        gzu gzuVar = this.j;
        int iA3 = (kdb.p == null || !ojcVarB.g()) ? 0 : (int) ((FrameRequestVector) ojcVarB.c()).a();
        gzuVar.c(lpcVar, goeVar, lqdVar, i, iA3, false);
        List listB = gzuVar.b(lpcVar, frameRequestVectorB, lzvVar, i);
        if (iA3 > 0) {
            lpcVar.d(kdb.p, Integer.valueOf(iA3));
            listB.addAll(0, gzuVar.b(lpcVar, (FrameRequestVector) ojcVarB.c(), lzvVar, iA3));
        }
        if (listB.size() != i + i3) {
            this.a.d(mip.bp("Unexpected frameRequests length: %d != PSAF %d + payload %d", Integer.valueOf(listB.size()), Integer.valueOf(i3), Integer.valueOf(i)));
        } else {
            this.a.b(mip.bp("Created frameRequests with %d PSAF and %d payload", Integer.valueOf(i3), Integer.valueOf(i)));
        }
        this.h.f();
        this.g = ozr.d.m();
        try {
            this.i.t(eddVar, burstSpec);
            this.k.f(eddVar, burstSpec, lzvVar);
            boolean zN = this.b.n();
            if (zN) {
                this.b.l(true);
            } else if (this.o.g()) {
                ((hdz) this.o.c()).k(eddVar);
            }
            poy poyVar = this.g;
            if (poyVar.c) {
                poyVar.m();
                poyVar.c = false;
            }
            ozr ozrVar = (ozr) poyVar.b;
            ozrVar.a |= 1;
            ozrVar.b = zN;
            goeVar.g();
            if (zN && this.e.k(ddm.D)) {
                try {
                    if (this.f == null) {
                        this.a.d("FrameServerSession not provided.");
                        zF = false;
                    } else {
                        try {
                            lap lapVar = new lap();
                            try {
                                this.h.e("HdrPlus#payload");
                                if (listB.isEmpty()) {
                                    r7 = 0;
                                    i4 = 0;
                                    lzvVar2 = null;
                                } else {
                                    ?? D = this.f.d(((hcc) listB.get(0)).b);
                                    eddVar.c.b.D(false);
                                    lmr lmrVarA = D.a(r8);
                                    D.close();
                                    if (lmrVarA != null) {
                                        lapVar.c(lmrVarA);
                                        i5 = 0;
                                        lmrVar = null;
                                        i6 = 0;
                                        i7 = 0;
                                        lzvVar3 = null;
                                    } else {
                                        i5 = 0;
                                        lmrVar = null;
                                        i6 = 0;
                                        i7 = 0;
                                        lzvVar3 = null;
                                    }
                                    while (true) {
                                        try {
                                            if (i7 >= listB.size()) {
                                                z3 = false;
                                                break;
                                            }
                                            if (this.d) {
                                                ?? I = this.f.i();
                                                I.f(r8);
                                                final ?? D2 = this.f.d(I.b());
                                                lmr lmrVarA2 = D2.a(r8);
                                                if (lmrVarA2 != null) {
                                                    lmrVarA2.j(new lnh(new Runnable() { // from class: gzj
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            gzk gzkVar = this.a;
                                                            lqa lqaVar = D2;
                                                            gzkVar.a.b("Last frame onCompleted.");
                                                            lqaVar.close();
                                                            gzkVar.b.p();
                                                        }
                                                    }));
                                                    lapVar.c(lmrVarA2);
                                                }
                                                lieVar.close();
                                                z3 = false;
                                                break;
                                            }
                                            if (lmrVar != null) {
                                                i5 = i6;
                                            }
                                            lmr lmrVar3 = lmrVar != null ? lmrVar : lmrVarA;
                                            int i9 = i7 + 1;
                                            if (i9 < listB.size()) {
                                                ?? D3 = this.f.d(((hcc) listB.get(i9)).b);
                                                lmr lmrVarA3 = D3.a(r8);
                                                D3.close();
                                                if (lmrVarA3 != null) {
                                                    lapVar.c(lmrVarA3);
                                                }
                                                lmrVar2 = lmrVarA3;
                                                i8 = i9;
                                            } else {
                                                lieVar.close();
                                                lmrVar2 = lmrVar;
                                                i8 = i6;
                                            }
                                            if (lmrVar3 != null) {
                                                try {
                                                    if (this.d) {
                                                        continue;
                                                    } else {
                                                        mip.bh(lmrVar3);
                                                        lzv lzvVarD = d(eddVar, i7, i2, lmrVar3, ((hcc) listB.get(i5)).a.d(), lzvVar3);
                                                        if (lzvVarD != null) {
                                                            lzvVar3 = lzvVarD;
                                                            i7 = i9;
                                                        }
                                                    }
                                                } catch (InterruptedException e) {
                                                    Thread.currentThread().interrupt();
                                                    lis lisVar = this.a;
                                                    Object[] objArr = new Object[1];
                                                    z2 = false;
                                                    z3 = false;
                                                    r7 = 0;
                                                    try {
                                                        objArr[0] = Integer.valueOf(i7);
                                                        lisVar.h(mip.bp("Failed to awaitComplete on frame %s.", objArr));
                                                        if (i7 == 0) {
                                                            try {
                                                                lapVar.close();
                                                                this.d = false;
                                                                this.h.f();
                                                                zF = false;
                                                            } catch (llv e2) {
                                                                i4 = i7;
                                                                lzvVar2 = lzvVar3;
                                                                if (lzvVar2 != null) {
                                                                    this.h.g("HdrPlus#recoverPayload");
                                                                    lis lisVar2 = this.a;
                                                                    int iA4 = eddVar.a();
                                                                    StringBuilder sb3 = new StringBuilder(88);
                                                                    sb3.append("Attempting to recover HDR+ burst ");
                                                                    sb3.append(iA4);
                                                                    sb3.append(" by supplying null for the remaining frames.");
                                                                    lisVar2.h(sb3.toString());
                                                                    while (i4 < i) {
                                                                        e(eddVar, i4, i2, lzvVar2);
                                                                        i4++;
                                                                    }
                                                                    if (this.i.y(eddVar)) {
                                                                        this.n.c(iijVar);
                                                                        lis lisVar3 = this.a;
                                                                        int iA5 = eddVar.a();
                                                                        StringBuilder sb4 = new StringBuilder(48);
                                                                        sb4.append("Payload recovery succeeded for shot ");
                                                                        sb4.append(iA5);
                                                                        sb4.append(".");
                                                                        lisVar3.h(sb4.toString());
                                                                        if (this.i.z(eddVar)) {
                                                                            lis lisVar4 = this.a;
                                                                            Object[] objArr2 = new Object[1];
                                                                            objArr2[r7] = Integer.valueOf(eddVar.a());
                                                                            lisVar4.f(mip.bp("EndShotCapture succeeded for shot %d.", objArr2));
                                                                            zF = true;
                                                                        } else {
                                                                            lis lisVar5 = this.a;
                                                                            Object[] objArr3 = new Object[1];
                                                                            objArr3[r7] = Integer.valueOf(eddVar.a());
                                                                            lisVar5.f(mip.bp("EndShotCapture failed for shot %d.", objArr3));
                                                                            zF = false;
                                                                        }
                                                                    } else {
                                                                        lis lisVar6 = this.a;
                                                                        int iA6 = eddVar.a();
                                                                        StringBuilder sb5 = new StringBuilder(45);
                                                                        sb5.append("Payload recovery failed for shot ");
                                                                        sb5.append(iA6);
                                                                        sb5.append("!");
                                                                        lisVar6.d(sb5.toString());
                                                                        zF = false;
                                                                    }
                                                                } else {
                                                                    lis lisVar7 = this.a;
                                                                    int iA7 = eddVar.a();
                                                                    StringBuilder sb6 = new StringBuilder(67);
                                                                    sb6.append("Failed to receive any frames. Aborting capture for shot ");
                                                                    sb6.append(iA7);
                                                                    lisVar7.d(sb6.toString());
                                                                    zF = false;
                                                                }
                                                                this.d = r7;
                                                                this.h.f();
                                                            }
                                                        } else {
                                                            this.m.c.f();
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        th = th;
                                                        i4 = i7;
                                                        lzvVar2 = lzvVar3;
                                                        r7 = z2;
                                                        try {
                                                            lapVar.close();
                                                        } catch (Throwable th3) {
                                                        }
                                                        try {
                                                            throw th;
                                                        } catch (llv e3) {
                                                            if (lzvVar2 != null) {
                                                                this.h.g("HdrPlus#recoverPayload");
                                                                lis lisVar8 = this.a;
                                                                int iA8 = eddVar.a();
                                                                StringBuilder sb7 = new StringBuilder(88);
                                                                sb7.append("Attempting to recover HDR+ burst ");
                                                                sb7.append(iA8);
                                                                sb7.append(" by supplying null for the remaining frames.");
                                                                lisVar8.h(sb7.toString());
                                                                while (i4 < i) {
                                                                    e(eddVar, i4, i2, lzvVar2);
                                                                    i4++;
                                                                }
                                                                if (this.i.y(eddVar)) {
                                                                    this.n.c(iijVar);
                                                                    lis lisVar9 = this.a;
                                                                    int iA9 = eddVar.a();
                                                                    StringBuilder sb8 = new StringBuilder(48);
                                                                    sb8.append("Payload recovery succeeded for shot ");
                                                                    sb8.append(iA9);
                                                                    sb8.append(".");
                                                                    lisVar9.h(sb8.toString());
                                                                    if (this.i.z(eddVar)) {
                                                                        lis lisVar10 = this.a;
                                                                        Object[] objArr4 = new Object[1];
                                                                        objArr4[r7] = Integer.valueOf(eddVar.a());
                                                                        lisVar10.f(mip.bp("EndShotCapture succeeded for shot %d.", objArr4));
                                                                        zF = true;
                                                                    } else {
                                                                        lis lisVar11 = this.a;
                                                                        Object[] objArr5 = new Object[1];
                                                                        objArr5[r7] = Integer.valueOf(eddVar.a());
                                                                        lisVar11.f(mip.bp("EndShotCapture failed for shot %d.", objArr5));
                                                                        zF = false;
                                                                    }
                                                                } else {
                                                                    lis lisVar12 = this.a;
                                                                    int iA10 = eddVar.a();
                                                                    StringBuilder sb9 = new StringBuilder(45);
                                                                    sb9.append("Payload recovery failed for shot ");
                                                                    sb9.append(iA10);
                                                                    sb9.append("!");
                                                                    lisVar12.d(sb9.toString());
                                                                    zF = false;
                                                                }
                                                            } else {
                                                                lis lisVar13 = this.a;
                                                                int iA11 = eddVar.a();
                                                                StringBuilder sb10 = new StringBuilder(67);
                                                                sb10.append("Failed to receive any frames. Aborting capture for shot ");
                                                                sb10.append(iA11);
                                                                lisVar13.d(sb10.toString());
                                                                zF = false;
                                                            }
                                                            this.d = r7;
                                                            this.h.f();
                                                            ljfVar = this.h;
                                                            ljfVar.f();
                                                            return zF;
                                                        }
                                                    }
                                                }
                                            }
                                            r8 = lqdVar;
                                            lmrVarA = lmrVar3;
                                            lmrVar = lmrVar2;
                                            i6 = i8;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            z2 = false;
                                        }
                                    }
                                    i4 = i7;
                                    lzvVar2 = lzvVar3;
                                    r7 = z3;
                                }
                                try {
                                    boolean zF2 = f(eddVar, i4, i2, lzvVar2, iijVar);
                                    try {
                                        lapVar.close();
                                        this.d = r7;
                                        this.h.f();
                                        zF = zF2;
                                    } catch (llv e4) {
                                        if (lzvVar2 != null) {
                                            this.h.g("HdrPlus#recoverPayload");
                                            lis lisVar14 = this.a;
                                            int iA12 = eddVar.a();
                                            StringBuilder sb11 = new StringBuilder(88);
                                            sb11.append("Attempting to recover HDR+ burst ");
                                            sb11.append(iA12);
                                            sb11.append(" by supplying null for the remaining frames.");
                                            lisVar14.h(sb11.toString());
                                            while (i4 < i) {
                                                e(eddVar, i4, i2, lzvVar2);
                                                i4++;
                                            }
                                            if (this.i.y(eddVar)) {
                                                this.n.c(iijVar);
                                                lis lisVar15 = this.a;
                                                int iA13 = eddVar.a();
                                                StringBuilder sb12 = new StringBuilder(48);
                                                sb12.append("Payload recovery succeeded for shot ");
                                                sb12.append(iA13);
                                                sb12.append(".");
                                                lisVar15.h(sb12.toString());
                                                if (this.i.z(eddVar)) {
                                                    lis lisVar16 = this.a;
                                                    Object[] objArr6 = new Object[1];
                                                    objArr6[r7] = Integer.valueOf(eddVar.a());
                                                    lisVar16.f(mip.bp("EndShotCapture succeeded for shot %d.", objArr6));
                                                    zF = true;
                                                } else {
                                                    lis lisVar17 = this.a;
                                                    Object[] objArr7 = new Object[1];
                                                    objArr7[r7] = Integer.valueOf(eddVar.a());
                                                    lisVar17.f(mip.bp("EndShotCapture failed for shot %d.", objArr7));
                                                    zF = false;
                                                }
                                            } else {
                                                lis lisVar18 = this.a;
                                                int iA14 = eddVar.a();
                                                StringBuilder sb13 = new StringBuilder(45);
                                                sb13.append("Payload recovery failed for shot ");
                                                sb13.append(iA14);
                                                sb13.append("!");
                                                lisVar18.d(sb13.toString());
                                                zF = false;
                                            }
                                        } else {
                                            lis lisVar19 = this.a;
                                            int iA15 = eddVar.a();
                                            StringBuilder sb14 = new StringBuilder(67);
                                            sb14.append("Failed to receive any frames. Aborting capture for shot ");
                                            sb14.append(iA15);
                                            lisVar19.d(sb14.toString());
                                            zF = false;
                                        }
                                        this.d = r7;
                                        this.h.f();
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    r7 = r7;
                                    lapVar.close();
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                r7 = 0;
                                th = th6;
                                i4 = 0;
                                lzvVar2 = null;
                            }
                        } catch (llv e5) {
                            r7 = 0;
                            i4 = 0;
                            lzvVar2 = null;
                        } catch (Throwable th7) {
                            th = th7;
                            r8 = 0;
                            this.d = r8;
                            this.h.f();
                            throw th;
                        }
                    }
                    ljfVar = this.h;
                } catch (Throwable th8) {
                    th = th8;
                }
            } else {
                boolean z4 = false;
                if (this.f == null) {
                    this.a.d("FrameServerSession not provided.");
                    zF = false;
                } else {
                    try {
                        lis lisVar20 = this.a;
                        int iA16 = eddVar.a();
                        StringBuilder sb15 = new StringBuilder(75);
                        sb15.append("Submitting an HDR+ payload burst of ");
                        sb15.append(i);
                        sb15.append(" frames for shot ");
                        sb15.append(iA16);
                        lisVar20.b(sb15.toString());
                        List listC = this.f.c((List) Collection.EL.stream(listB).map(cgw.s).collect(Collectors.toList()));
                        lng lngVar = this.f;
                        lngVar.e(lngVar.h().b());
                        eddVar.c.b.D(z4);
                        if (listC.isEmpty()) {
                            lis lisVar21 = this.a;
                            int iA17 = eddVar.a();
                            StringBuilder sb16 = new StringBuilder(46);
                            sb16.append("Error submitting requests for shot ");
                            sb16.append(iA17);
                            lisVar21.d(sb16.toString());
                            zF = false;
                        } else {
                            boolean zN2 = this.b.n();
                            if (!zN2) {
                                lieVar.close();
                            }
                            if (!zN2) {
                                ddi ddiVar = ddm.a;
                            }
                            try {
                                this.h.e("HdrPlus#payloadAwait");
                                lzv lzvVar4 = lzvVar;
                                int i10 = 0;
                                int i11 = 0;
                                while (true) {
                                    if (i10 >= listC.size()) {
                                        list = listC;
                                        z = false;
                                        break;
                                    }
                                    lqa lqaVar = (lqa) listC.get(i10);
                                    lmr lmrVarA4 = lqaVar.a(lqdVar);
                                    if (lmrVarA4 == null) {
                                        list = listC;
                                        z = false;
                                    } else {
                                        try {
                                            if (this.d) {
                                                lmrVarA4.close();
                                                list = listC;
                                                z = false;
                                                break;
                                            }
                                            mip.bh(lmrVarA4);
                                            list = listC;
                                            z = false;
                                            z = false;
                                            z = false;
                                            try {
                                                lzv lzvVarD2 = d(eddVar, i11, i2, lmrVarA4, ((hcc) listB.get(i10)).a.d(), lzvVar4);
                                                if (lzvVarD2 != null) {
                                                    i11++;
                                                    try {
                                                        Long l = (Long) lzvVarD2.d(CaptureResult.SENSOR_EXPOSURE_TIME);
                                                        lis lisVar22 = this.a;
                                                        long jLongValue = l != null ? l.longValue() : 0L;
                                                        String strValueOf = String.valueOf(lzvVarD2.d(CaptureResult.CONTROL_AF_STATE));
                                                        StringBuilder sb17 = new StringBuilder(String.valueOf(strValueOf).length() + 52);
                                                        sb17.append("Frame exposure time ");
                                                        sb17.append(jLongValue);
                                                        sb17.append("ns, afState=");
                                                        sb17.append(strValueOf);
                                                        lisVar22.b(sb17.toString());
                                                        lzvVar4 = lzvVarD2;
                                                    } catch (InterruptedException e6) {
                                                        lzvVar4 = lzvVarD2;
                                                        Thread.currentThread().interrupt();
                                                        lis lisVar23 = this.a;
                                                        Object[] objArr8 = new Object[1];
                                                        objArr8[z ? 1 : 0] = Integer.valueOf(i11);
                                                        lisVar23.h(mip.bp("Failed to awaitComplete on frame %s.", objArr8));
                                                        it2 = list.iterator();
                                                        while (it2.hasNext()) {
                                                            ((lqa) it2.next()).close();
                                                        }
                                                        if (i11 == 0) {
                                                            this.h.f();
                                                            this.d = z;
                                                            zF = false;
                                                        } else {
                                                            this.m.c.f();
                                                            it = list.iterator();
                                                            while (it.hasNext()) {
                                                                ((lqa) it.next()).close();
                                                            }
                                                            if (zN2) {
                                                                lieVar.close();
                                                            }
                                                            if (i11 == 0) {
                                                                lzvVar4 = null;
                                                            }
                                                            zF = f(eddVar, i11, i2, lzvVar4, iijVar);
                                                            this.h.f();
                                                            this.d = z;
                                                        }
                                                        ljfVar = this.h;
                                                        ljfVar.f();
                                                        return zF;
                                                    }
                                                }
                                                lqaVar.close();
                                            } catch (InterruptedException e7) {
                                            }
                                        } catch (InterruptedException e8) {
                                            list = listC;
                                            z = false;
                                        }
                                        Thread.currentThread().interrupt();
                                        lis lisVar24 = this.a;
                                        Object[] objArr9 = new Object[1];
                                        objArr9[z ? 1 : 0] = Integer.valueOf(i11);
                                        lisVar24.h(mip.bp("Failed to awaitComplete on frame %s.", objArr9));
                                        it2 = list.iterator();
                                        while (it2.hasNext()) {
                                            ((lqa) it2.next()).close();
                                        }
                                        if (i11 == 0) {
                                            this.h.f();
                                            this.d = z;
                                            zF = false;
                                        } else {
                                            this.m.c.f();
                                        }
                                    }
                                    try {
                                        i10++;
                                        listC = list;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        this.h.f();
                                        this.d = z;
                                        throw th;
                                    }
                                }
                                it = list.iterator();
                                while (it.hasNext()) {
                                    ((lqa) it.next()).close();
                                }
                                if (zN2) {
                                    lieVar.close();
                                }
                                if (i11 == 0) {
                                    lzvVar4 = null;
                                }
                                zF = f(eddVar, i11, i2, lzvVar4, iijVar);
                                this.h.f();
                                this.d = z;
                            } catch (Throwable th10) {
                                th = th10;
                                z = false;
                            }
                        }
                    } catch (llv e9) {
                        this.a.d(mip.bp("Failed to submit frame requests for shot %d.", Integer.valueOf(eddVar.a())));
                        zF = false;
                    }
                }
                ljfVar = this.h;
            }
            ljfVar.f();
            return zF;
        } catch (Throwable th11) {
            this.h.f();
            throw th11;
        }
    }
}
