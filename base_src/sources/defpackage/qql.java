package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class qql {
    public static final boolean a;
    public static final boolean b;
    public static final AtomicLong c;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r0.equals("off") != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r0.equals("on") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (r0.equals("") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r0.equals("auto") != false) goto L12;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = defpackage.qvs.a(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L58
            int r3 = r0.hashCode()
            switch(r3) {
                case 0: goto L2e;
                case 3551: goto L25;
                case 109935: goto L1b;
                case 3005871: goto L12;
                default: goto L11;
            }
        L11:
            goto L38
        L12:
            java.lang.String r3 = "auto"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L11
            goto L23
        L1b:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L11
        L23:
            r0 = 0
            goto L59
        L25:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L11
            goto L36
        L2e:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L11
        L36:
            r0 = 1
            goto L59
        L38:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L58:
            r0 = 0
        L59:
            defpackage.qql.a = r0
            if (r0 == 0) goto L66
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = defpackage.qnm.q(r0)
            if (r0 == 0) goto L66
            goto L67
        L66:
            r1 = 0
        L67:
            defpackage.qql.b = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            defpackage.qql.c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qql.<clinit>():void");
    }
}
