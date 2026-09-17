package defpackage;

import java.io.File;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes2.dex */
public final class qnm {
    public static final String a(qnn qnnVar) {
        String string = qnnVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class b(qob qobVar) {
        String name;
        qobVar.getClass();
        Class clsA = ((qnj) qobVar).a();
        if (clsA.isPrimitive() && (name = clsA.getName()) != null) {
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x0090, please report this as an issue */
    public static File c(File file, String str) {
        int length;
        String string;
        File file2;
        int iO;
        str.getClass();
        File file3 = new File(str);
        String path = file3.getPath();
        path.getClass();
        int iO2 = qno.o(path, File.separatorChar, 0, 4);
        if (iO2 == 0) {
            if (path.length() <= 1 || path.charAt(1) != File.separatorChar || (iO = qno.o(path, File.separatorChar, 2, 4)) < 0) {
                return file3;
            }
            int iO3 = qno.o(path, File.separatorChar, iO + 1, 4);
            length = iO3 >= 0 ? iO3 + 1 : path.length();
        } else {
            if (iO2 <= 0 || path.charAt(iO2 - 1) != ':') {
                if (iO2 == -1 && qno.m(path, ':')) {
                    length = path.length();
                }
                string = file.toString();
                string.getClass();
                if (string.length() == 0 && !qno.m(string, File.separatorChar)) {
                    file2 = new File(string + File.separatorChar + file3);
                } else {
                    file2 = new File(string + file3);
                }
                return file2;
            }
            length = iO2 + 1;
        }
        if (length > 0) {
            return file3;
        }
        string = file.toString();
        string.getClass();
        if (string.length() == 0) {
            file2 = new File(string + file3);
        } else {
            file2 = new File(string + File.separatorChar + file3);
        }
        return file2;
    }

    public static final void d(qqo qqoVar, qlh qlhVar, boolean z) {
        Object objH = ((qpo) qqoVar).h();
        Throwable thK = qqoVar.k(objH);
        Object objL = thK != null ? qmd.L(thK) : qqoVar.i(objH);
        if (!z) {
            qlhVar.resumeWith(objL);
            return;
        }
        quz quzVar = (quz) qlhVar;
        qlh qlhVar2 = quzVar.b;
        Object obj = quzVar.d;
        qln context = qlhVar2.getContext();
        Object objB = qvt.b(context, obj);
        qsc qscVarC = objB != qvt.a ? qqd.c(qlhVar2, context, objB) : null;
        try {
            quzVar.b.resumeWith(objL);
            if (qscVarC == null || qscVarC.L()) {
            }
        } finally {
            if (qscVarC == null || qscVarC.L()) {
                qvt.c(context, objB);
            }
        }
    }

    public static final boolean e(int i) {
        return i == 1 || i == 2;
    }

    public static final String f(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String g(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String h(qlh qlhVar) {
        Object objL;
        if (qlhVar instanceof quz) {
            return qlhVar.toString();
        }
        try {
            objL = qlhVar + '@' + g(qlhVar);
        } catch (Throwable th) {
            objL = qmd.L(th);
        }
        if (qkn.a(objL) != null) {
            objL = ((Object) qlhVar.getClass().getName()) + '@' + g(qlhVar);
        }
        return (String) objL;
    }

    public static final Object i(qmy qmyVar, qlh qlhVar) throws Throwable {
        qvo qvoVar = new qvo(qlhVar.getContext(), qlhVar);
        Object objJ = qno.J(qvoVar, qvoVar, qmyVar);
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        return objJ;
    }

    public static final qqj j(qln qlnVar) {
        qlnVar.getClass();
        if (qlnVar.get(qrg.c) == null) {
            qlnVar = qlnVar.plus(qno.z());
        }
        return new quy(qlnVar);
    }

    public static final Throwable k(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        qmd.P(runtimeException, th);
        return runtimeException;
    }

    public static final void l(qln qlnVar, Throwable th) {
        qlnVar.getClass();
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) qlnVar.get(CoroutineExceptionHandler.a);
            if (coroutineExceptionHandler == null) {
                qqg.a(qlnVar, th);
            } else {
                coroutineExceptionHandler.handleException(qlnVar, th);
            }
        } catch (Throwable th2) {
            qqg.a(qlnVar, k(th, th2));
        }
    }

    public static /* synthetic */ void m(qmy qmyVar, Object obj, qlh qlhVar) {
        try {
            qva.a(qmd.c(qmd.b(qmyVar, obj, qlhVar)), qks.a);
        } catch (Throwable th) {
            qlhVar.resumeWith(qmd.L(th));
            throw th;
        }
    }

    public static final boolean n() {
        throw null;
    }

    public static final int o(String str, int i, int i2, int i3) {
        return (int) p(str, i, i2, i3);
    }

    public static final long p(String str, long j, long j2, long j3) {
        String strA = qvs.a(str);
        if (strA == null) {
            return j;
        }
        Long lI = qno.i(strA);
        if (lI == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strA + '\'').toString());
        }
        long jLongValue = lI.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static final boolean q(String str) {
        String strA = qvs.a(str);
        if (strA == null) {
            return true;
        }
        return Boolean.parseBoolean(strA);
    }

    public static /* synthetic */ int r(String str, int i, int i2, int i3, int i4) {
        int i5 = i2 | (((i4 & 4) != 0 ? 0 : 1) ^ 1);
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return o(str, i, i5, i3);
    }

    public static final long t(long j, long j2) {
        return j & (j2 ^ (-1));
    }

    public static final long u(long j, int i) {
        return t(j, 1073741823L) | ((long) i);
    }

    public static final void v(qts qtsVar) {
        qtsVar.getClass();
        if (qtsVar instanceof qua) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007d A[Catch: all -> 0x00a2, TryCatch #1 {, blocks: (B:23:0x0065, B:25:0x0069, B:34:0x007c, B:28:0x0070, B:35:0x007d, B:37:0x0081, B:41:0x0092, B:42:0x00a1), top: B:56:0x0065 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0081 A[Catch: all -> 0x00a2, TryCatch #1 {, blocks: (B:23:0x0065, B:25:0x0069, B:34:0x007c, B:28:0x0070, B:35:0x007d, B:37:0x0081, B:41:0x0092, B:42:0x00a1), top: B:56:0x0065 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, qts] */
    /* JADX WARN: Type inference failed for: r5v0, types: [qtg] */
    /* JADX WARN: Type inference failed for: r5v1, types: [qtg] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, qtg] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0090 -> B:57:0x0049). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object w(defpackage.qts r4, defpackage.qtg r5, boolean r6, defpackage.qlh r7) {
        /*
            boolean r0 = r7 instanceof defpackage.qtu
            if (r0 == 0) goto L13
            r0 = r7
            qtu r0 = (defpackage.qtu) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            qtu r0 = new qtu
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.d
            qlp r1 = defpackage.qlp.COROUTINE_SUSPENDED
            int r2 = r0.e
            switch(r2) {
                case 0: goto L43;
                case 1: goto L33;
                case 2: goto L29;
                default: goto L21;
            }
        L21:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L29:
            boolean r6 = r0.c
            java.lang.Object r5 = r0.b
            java.lang.Object r4 = r0.a
            defpackage.qmd.M(r7)     // Catch: java.lang.Throwable -> L41
            goto L49
        L33:
            boolean r6 = r0.c
            java.lang.Object r5 = r0.b
            java.lang.Object r4 = r0.a
            defpackage.qmd.M(r7)     // Catch: java.lang.Throwable -> L41
            qsz r7 = (defpackage.qsz) r7     // Catch: java.lang.Throwable -> L41
            java.lang.Object r7 = r7.b     // Catch: java.lang.Throwable -> L41
            goto L65
        L41:
            r4 = move-exception
            goto La6
        L43:
            defpackage.qmd.M(r7)
            v(r4)
        L49:
            r0.a = r4     // Catch: java.lang.Throwable -> La5
            r0.b = r5     // Catch: java.lang.Throwable -> La5
            r0.c = r6     // Catch: java.lang.Throwable -> La5
            r7 = 1
            r0.e = r7     // Catch: java.lang.Throwable -> La5
            r7 = r5
            qsv r7 = (defpackage.qsv) r7     // Catch: java.lang.Throwable -> La5
            r7 = r5
            qsv r7 = (defpackage.qsv) r7     // Catch: java.lang.Throwable -> La5
            r7 = r5
            qsv r7 = (defpackage.qsv) r7     // Catch: java.lang.Throwable -> La5
            qsu r7 = r7.b     // Catch: java.lang.Throwable -> La5
            java.lang.Object r7 = r7.c(r0)     // Catch: java.lang.Throwable -> La5
            qlp r2 = defpackage.qlp.COROUTINE_SUSPENDED     // Catch: java.lang.Throwable -> La5
            if (r7 == r1) goto La4
        L65:
            boolean r2 = r7 instanceof defpackage.qsx     // Catch: java.lang.Throwable -> La2
            if (r2 == 0) goto L7d
            qsx r7 = (defpackage.qsx) r7     // Catch: java.lang.Throwable -> La2
            r4 = 0
            if (r7 != 0) goto L70
            r7 = r4
            goto L72
        L70:
            java.lang.Throwable r7 = r7.a     // Catch: java.lang.Throwable -> La2
        L72:
            if (r7 != 0) goto L7c
            if (r6 == 0) goto L79
            defpackage.qnt.j(r5, r4)
        L79:
            qks r4 = defpackage.qks.a
            return r4
        L7c:
            throw r7     // Catch: java.lang.Throwable -> La2
        L7d:
            boolean r2 = r7 instanceof defpackage.qsy     // Catch: java.lang.Throwable -> La2
            if (r2 != 0) goto L92
            r0.a = r4     // Catch: java.lang.Throwable -> La2
            r0.b = r5     // Catch: java.lang.Throwable -> La2
            r0.c = r6     // Catch: java.lang.Throwable -> La2
            r2 = 2
            r0.e = r2     // Catch: java.lang.Throwable -> La2
            java.lang.Object r7 = r4.emit(r7, r0)     // Catch: java.lang.Throwable -> La2
            if (r7 == r1) goto L91
            goto L49
        L91:
            return r1
        L92:
            java.lang.String r4 = "Trying to call 'getOrThrow' on a failed channel result: "
            java.lang.String r4 = defpackage.qno.a(r4, r7)     // Catch: java.lang.Throwable -> La2
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La2
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> La2
            r7.<init>(r4)     // Catch: java.lang.Throwable -> La2
            throw r7     // Catch: java.lang.Throwable -> La2
        La2:
            r4 = move-exception
            goto La6
        La4:
            return r1
        La5:
            r4 = move-exception
        La6:
            throw r4     // Catch: java.lang.Throwable -> La7
        La7:
            r7 = move-exception
            if (r6 != 0) goto Lab
            goto Lae
        Lab:
            defpackage.qnt.j(r5, r4)
        Lae:
            goto Lb0
        Laf:
            throw r7
        Lb0:
            goto Laf
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qnm.w(qts, qtg, boolean, qlh):java.lang.Object");
    }

    public static final qtr x(qmy qmyVar) {
        return new qtn(qmyVar);
    }
}
