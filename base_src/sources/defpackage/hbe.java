package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class hbe implements goy {
    private static final ouj a = ouj.h("com/google/android/apps/camera/pixelcamerakit/commands/PckZslShastaImageCaptureCommand");
    private final goy b;
    private final Set c;
    private final hal d;
    private final ebe e;
    private final eaw f;
    private final hbb g;
    private final dzv h;
    private final ljf i;

    public hbe(Set set, goy goyVar, ojc ojcVar, ebe ebeVar, eaw eawVar, hbb hbbVar, dzv dzvVar, ljf ljfVar) {
        this.b = goyVar;
        this.c = set;
        this.g = hbbVar;
        this.d = (hal) ojcVar.c();
        this.e = ebeVar;
        this.f = eawVar;
        this.h = dzvVar;
        this.i = ljfVar;
    }

    private static final void d(goy goyVar, List list, gox goxVar, gog gogVar) {
        ((oug) ((oug) a.b()).G((char) 2320)).o("Executing fallback");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((lmr) it.next()).close();
        }
        gogVar.b.k().g();
        gogVar.c.g();
        goyVar.c(goxVar, gogVar);
    }

    @Override // defpackage.goy
    public final lco a() {
        return this.b.a();
    }

    @Override // defpackage.goy
    public final lco b() {
        return lcv.g(fcy.j(obr.ah(this.c)));
    }

    /* JADX INFO: Infinite loop detected, blocks: 13, insns: 0 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x020c */
    /* JADX WARN: Code duplicated, block: B:132:0x0314 A[Catch: all -> 0x047c, TryCatch #21 {all -> 0x047c, blocks: (B:130:0x02ff, B:132:0x0314, B:136:0x031e, B:138:0x0321), top: B:340:0x02ff }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0319 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x031b  */
    /* JADX WARN: Code duplicated, block: B:135:0x031d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0321 A[Catch: all -> 0x047c, TRY_LEAVE, TryCatch #21 {all -> 0x047c, blocks: (B:130:0x02ff, B:132:0x0314, B:136:0x031e, B:138:0x0321), top: B:340:0x02ff }] */
    /* JADX WARN: Code duplicated, block: B:142:0x032e A[Catch: all -> 0x056c, dmd -> 0x0575, TRY_LEAVE, TryCatch #43 {dmd -> 0x0575, all -> 0x056c, blocks: (B:28:0x00d8, B:30:0x00e5, B:36:0x00fb, B:38:0x0101, B:40:0x0113, B:50:0x013a, B:140:0x0329, B:142:0x032e, B:44:0x011c, B:33:0x00f0), top: B:373:0x00d8 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x033d  */
    /* JADX WARN: Code duplicated, block: B:153:0x035c A[Catch: all -> 0x0477, TryCatch #15 {all -> 0x0477, blocks: (B:151:0x033f, B:153:0x035c, B:154:0x0368, B:156:0x0371, B:157:0x037a, B:159:0x0380, B:161:0x0394, B:176:0x03f4, B:186:0x0421, B:185:0x041c, B:187:0x0428, B:188:0x0430, B:191:0x0448, B:190:0x0433, B:163:0x039d, B:165:0x03a6, B:167:0x03ac, B:169:0x03b0, B:170:0x03d2, B:184:0x0401, B:175:0x03dc), top: B:336:0x033f, inners: #20 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0371 A[Catch: all -> 0x0477, TryCatch #15 {all -> 0x0477, blocks: (B:151:0x033f, B:153:0x035c, B:154:0x0368, B:156:0x0371, B:157:0x037a, B:159:0x0380, B:161:0x0394, B:176:0x03f4, B:186:0x0421, B:185:0x041c, B:187:0x0428, B:188:0x0430, B:191:0x0448, B:190:0x0433, B:163:0x039d, B:165:0x03a6, B:167:0x03ac, B:169:0x03b0, B:170:0x03d2, B:184:0x0401, B:175:0x03dc), top: B:336:0x033f, inners: #20 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0380 A[Catch: all -> 0x0477, TryCatch #15 {all -> 0x0477, blocks: (B:151:0x033f, B:153:0x035c, B:154:0x0368, B:156:0x0371, B:157:0x037a, B:159:0x0380, B:161:0x0394, B:176:0x03f4, B:186:0x0421, B:185:0x041c, B:187:0x0428, B:188:0x0430, B:191:0x0448, B:190:0x0433, B:163:0x039d, B:165:0x03a6, B:167:0x03ac, B:169:0x03b0, B:170:0x03d2, B:184:0x0401, B:175:0x03dc), top: B:336:0x033f, inners: #20 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x03da  */
    /* JADX WARN: Code duplicated, block: B:189:0x0431 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:190:0x0433 A[Catch: all -> 0x0477, TryCatch #15 {all -> 0x0477, blocks: (B:151:0x033f, B:153:0x035c, B:154:0x0368, B:156:0x0371, B:157:0x037a, B:159:0x0380, B:161:0x0394, B:176:0x03f4, B:186:0x0421, B:185:0x041c, B:187:0x0428, B:188:0x0430, B:191:0x0448, B:190:0x0433, B:163:0x039d, B:165:0x03a6, B:167:0x03ac, B:169:0x03b0, B:170:0x03d2, B:184:0x0401, B:175:0x03dc), top: B:336:0x033f, inners: #20 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x0466 A[Catch: all -> 0x0554, dmd -> 0x0558, TRY_LEAVE, TryCatch #42 {dmd -> 0x0558, all -> 0x0554, blocks: (B:242:0x04e2, B:244:0x04e7, B:245:0x04ea, B:195:0x0461, B:197:0x0466), top: B:375:0x013a }] */
    /* JADX WARN: Code duplicated, block: B:240:0x04d8 A[Catch: all -> 0x055c, TRY_LEAVE, TryCatch #43 {all -> 0x055c, blocks: (B:237:0x04b3, B:238:0x04d2, B:240:0x04d8), top: B:363:0x04b3 }] */
    /* JADX WARN: Code duplicated, block: B:244:0x04e7 A[Catch: all -> 0x0554, dmd -> 0x0558, TryCatch #42 {dmd -> 0x0558, all -> 0x0554, blocks: (B:242:0x04e2, B:244:0x04e7, B:245:0x04ea, B:195:0x0461, B:197:0x0466), top: B:375:0x013a }] */
    /* JADX WARN: Code duplicated, block: B:249:0x04fb A[Catch: all -> 0x0545, dmd -> 0x054e, TRY_LEAVE, TryCatch #41 {dmd -> 0x054e, all -> 0x0545, blocks: (B:247:0x04f0, B:249:0x04fb), top: B:376:0x04f0 }] */
    /* JADX WARN: Code duplicated, block: B:251:0x0512  */
    /* JADX WARN: Code duplicated, block: B:254:0x0518  */
    /* JADX WARN: Code duplicated, block: B:255:0x0541  */
    /* JADX WARN: Code duplicated, block: B:268:0x0564 A[Catch: all -> 0x0568, dmd -> 0x056a, TryCatch #46 {dmd -> 0x056a, all -> 0x0568, blocks: (B:266:0x055f, B:268:0x0564, B:269:0x0567), top: B:367:0x055f }] */
    /* JADX WARN: Code duplicated, block: B:284:0x0582  */
    /* JADX WARN: Code duplicated, block: B:288:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:290:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:291:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:299:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:301:0x0611  */
    /* JADX WARN: Code duplicated, block: B:303:0x0618  */
    /* JADX WARN: Code duplicated, block: B:304:0x061e  */
    /* JADX WARN: Code duplicated, block: B:306:0x062d  */
    /* JADX WARN: Code duplicated, block: B:338:0x039d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x0394 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x011c A[Catch: all -> 0x056c, dmd -> 0x0575, TryCatch #43 {dmd -> 0x0575, all -> 0x056c, blocks: (B:28:0x00d8, B:30:0x00e5, B:36:0x00fb, B:38:0x0101, B:40:0x0113, B:50:0x013a, B:140:0x0329, B:142:0x032e, B:44:0x011c, B:33:0x00f0), top: B:373:0x00d8 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0231 A[Catch: all -> 0x028f, TRY_ENTER, TryCatch #30 {all -> 0x028f, blocks: (B:98:0x0231, B:99:0x0250), top: B:352:0x022f }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0250 A[Catch: all -> 0x028f, TRY_LEAVE, TryCatch #30 {all -> 0x028f, blocks: (B:98:0x0231, B:99:0x0250), top: B:352:0x022f }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 26, insn: 0x048e: MOVE (r12 I:??[OBJECT, ARRAY]) = (r26 I:??[OBJECT, ARRAY]), block:B:217:0x048e */
    /* JADX WARN: Type inference failed for: r0v141, types: [hcg] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v16, types: [lmr] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v10, types: [lmr] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [lmr] */
    /* JADX WARN: Type inference failed for: r9v6, types: [lmr] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.goy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.gox r29, defpackage.gog r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbe.c(gox, gog):void");
    }

    public final String toString() {
        ojb ojbVarAZ = obr.aZ(this);
        ojbVarAZ.b("fallback", this.b);
        return ojbVarAZ.toString();
    }
}
