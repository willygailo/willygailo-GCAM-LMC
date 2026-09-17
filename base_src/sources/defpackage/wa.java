package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class wa {
    public final Set a;
    private final wn b;
    private final qsu c;

    public wa(qkg qkgVar, vr vrVar, wl wlVar, wn wnVar) {
        qkgVar.getClass();
        vrVar.getClass();
        wlVar.getClass();
        wnVar.getClass();
        this.b = wnVar;
        this.c = qnt.l(8, 0, 6);
        this.a = new LinkedHashSet();
        qmd.l(wnVar.a, new qqi("CXCP-VirtualCameraManager"), new vv(this, null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007c -> B:27:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object a(java.util.List r5, defpackage.qlh r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.vw
            if (r0 == 0) goto L13
            r0 = r6
            vw r0 = (defpackage.vw) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            vw r0 = new vw
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.d
            qlp r1 = defpackage.qlp.COROUTINE_SUSPENDED
            int r2 = r0.f
            switch(r2) {
                case 0: goto L3d;
                case 1: goto L33;
                case 2: goto L29;
                default: goto L21;
            }
        L21:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L29:
            java.lang.Object r5 = r0.c
            java.lang.Object r2 = r0.b
            java.lang.Object r3 = r0.a
            defpackage.qmd.M(r6)
            goto L7d
        L33:
            java.lang.Object r5 = r0.c
            java.lang.Object r2 = r0.b
            java.lang.Object r3 = r0.a
            defpackage.qmd.M(r6)
            goto L59
        L3d:
            defpackage.qmd.M(r6)
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L5f
            qsu r6 = r4.c
            r0.a = r4
            r0.b = r5
            r0.c = r5
            r2 = 1
            r0.f = r2
            java.lang.Object r6 = r6.b(r0)
            if (r6 == r1) goto L5e
            r3 = r4
            r2 = r5
        L59:
            r5.add(r6)
            r5 = r2
            goto L60
        L5e:
            return r1
        L5f:
            r3 = r4
        L60:
            r6 = r3
            wa r6 = (defpackage.wa) r6
            qsu r2 = r6.c
            boolean r2 = r2.l()
            if (r2 != 0) goto L83
            qsu r6 = r6.c
            r0.a = r3
            r0.b = r5
            r0.c = r5
            r2 = 2
            r0.f = r2
            java.lang.Object r6 = r6.b(r0)
            if (r6 == r1) goto L82
            r2 = r5
        L7d:
            r5.add(r6)
            r5 = r2
            goto L60
        L82:
            return r1
        L83:
            qks r5 = defpackage.qks.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wa.a(java.util.List, qlh):java.lang.Object");
    }
}
