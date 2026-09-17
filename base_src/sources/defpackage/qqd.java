package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qqd {
    public static final boolean a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r0.equals("on") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r0.equals("") != false) goto L18;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = defpackage.qvs.a(r0)
            r1 = 1
            if (r0 == 0) goto L4d
            int r2 = r0.hashCode()
            switch(r2) {
                case 0: goto L24;
                case 3551: goto L1b;
                case 109935: goto L11;
                default: goto L10;
            }
        L10:
            goto L2d
        L11:
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L10
            r1 = 0
            goto L4d
        L1b:
            java.lang.String r2 = "on"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L10
            goto L2c
        L24:
            java.lang.String r2 = ""
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L10
        L2c:
            goto L4d
        L2d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L4d:
            defpackage.qqd.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qqd.<clinit>():void");
    }

    public static final String a(qln qlnVar) {
        qqh qqhVar;
        qlnVar.getClass();
        if (!qql.a || (qqhVar = (qqh) qlnVar.get(qqh.b)) == null) {
            return null;
        }
        qqi qqiVar = (qqi) qlnVar.get(qqi.b);
        return (qqiVar == null ? "coroutine" : qqiVar.a) + '#' + qqhVar.a;
    }

    public static final qln b(qqj qqjVar, qln qlnVar) {
        qln qlnVarPlus = qqjVar.hh().plus(qlnVar);
        qln qlnVarPlus2 = qql.a ? qlnVarPlus.plus(new qqh(qql.c.incrementAndGet())) : qlnVarPlus;
        return (qlnVarPlus == qqq.a || qlnVarPlus.get(qlj.a) != null) ? qlnVarPlus2 : qlnVarPlus2.plus(qqq.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, qlh] */
    /* JADX WARN: Type inference failed for: r2v1, types: [qlv] */
    /* JADX WARN: Type inference failed for: r2v2, types: [qlv] */
    public static final qsc c(qlh qlhVar, qln qlnVar, Object obj) {
        qlhVar.getClass();
        qlnVar.getClass();
        qsc qscVar = null;
        if (qlnVar.get(qsd.a) == null) {
            return null;
        }
        while (!(qlhVar instanceof qqn) && (qlhVar = qlhVar.getCallerFrame()) != 0) {
            if (qlhVar instanceof qsc) {
                qscVar = (qsc) qlhVar;
                break;
            }
        }
        if (qscVar != null) {
            qscVar.b = qlnVar;
            qscVar.e = obj;
        }
        return qscVar;
    }
}
