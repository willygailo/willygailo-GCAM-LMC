package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class lqk {
    private int b = 0;
    private final ArrayList a = new ArrayList();

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final synchronized java.lang.Object f(defpackage.lnx r12, defpackage.lhv r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 0
            r1 = 1
            if (r12 == 0) goto L47
            java.lang.Object r2 = r13.a()     // Catch: java.lang.Throwable -> L8a
            r3 = 1
        La:
            if (r2 != 0) goto L3d
            if (r3 == 0) goto L3d
            java.util.ArrayList r3 = r11.a     // Catch: java.lang.Throwable -> L8a
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L8a
            r4 = 0
            r5 = 0
        L16:
            if (r5 >= r3) goto L43
            java.util.ArrayList r6 = r11.a     // Catch: java.lang.Throwable -> L8a
            int r7 = r11.b     // Catch: java.lang.Throwable -> L8a
            int r7 = r7 + r5
            int r7 = r7 % r3
            java.lang.Object r6 = r6.get(r7)     // Catch: java.lang.Throwable -> L8a
            low r6 = (defpackage.low) r6     // Catch: java.lang.Throwable -> L8a
            lqd r7 = r6.h     // Catch: java.lang.Throwable -> L8a
            ope r7 = r7.c     // Catch: java.lang.Throwable -> L8a
            boolean r7 = r7.contains(r12)     // Catch: java.lang.Throwable -> L8a
            if (r7 == 0) goto L40
            boolean r6 = r6.t()     // Catch: java.lang.Throwable -> L8a
            if (r6 == 0) goto L40
            java.lang.Object r2 = r13.a()     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto L3e
            int r5 = r5 + r1
            r11.b = r5     // Catch: java.lang.Throwable -> L8a
        L3d:
            goto L45
        L3e:
            r4 = 1
            goto L40
        L40:
            int r5 = r5 + 1
            goto L16
        L43:
            r3 = r4
            goto La
        L45:
            monitor-exit(r11)
            return r2
        L47:
            java.lang.Object r12 = r13.a()     // Catch: java.lang.Throwable -> L8a
            r2 = 1
        L4c:
            if (r12 != 0) goto L88
            if (r2 == 0) goto L88
            java.util.ArrayList r2 = r11.a     // Catch: java.lang.Throwable -> L8a
            yc r3 = defpackage.yc.c     // Catch: java.lang.Throwable -> L8a
            java.util.Collections.sort(r2, r3)     // Catch: java.lang.Throwable -> L8a
            java.util.ArrayList r2 = r11.a     // Catch: java.lang.Throwable -> L8a
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L8a
            r3 = 0
            r4 = 0
        L5f:
            if (r4 >= r2) goto L86
            java.util.ArrayList r5 = r11.a     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r5 = r5.get(r4)     // Catch: java.lang.Throwable -> L8a
            low r5 = (defpackage.low) r5     // Catch: java.lang.Throwable -> L8a
            long r6 = r5.r()     // Catch: java.lang.Throwable -> L8a
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L83
            boolean r5 = r5.t()     // Catch: java.lang.Throwable -> L8a
            if (r5 == 0) goto L83
            java.lang.Object r12 = r13.a()     // Catch: java.lang.Throwable -> L8a
            if (r12 != 0) goto L81
            r3 = 1
            goto L83
        L81:
            monitor-exit(r11)
            return r12
        L83:
            int r4 = r4 + 1
            goto L5f
        L86:
            r2 = r3
            goto L4c
        L88:
            monitor-exit(r11)
            return r12
        L8a:
            r12 = move-exception
            monitor-exit(r11)
            goto L8e
        L8d:
            throw r12
        L8e:
            goto L8d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqk.f(lnx, lhv):java.lang.Object");
    }

    public final synchronized Object a(lhv lhvVar) {
        return f(null, lhvVar);
    }

    public final synchronized Object b(lnx lnxVar, lhv lhvVar) {
        return f(lnxVar, lhvVar);
    }

    final synchronized void c(low lowVar) {
        this.a.add(lowVar);
    }

    final synchronized void d(low lowVar) {
        this.a.remove(lowVar);
    }

    public final synchronized void e(lnx lnxVar) {
        f(lnxVar, new lhv() { // from class: lqj
            @Override // defpackage.lhv
            public final Object a() {
                return null;
            }
        });
    }
}
