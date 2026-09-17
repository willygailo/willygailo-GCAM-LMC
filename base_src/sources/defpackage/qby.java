package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class qby implements qbz, qcq {
    qjr a;
    public volatile boolean b;

    /* JADX WARN: Code duplicated, block: B:23:0x004b A[Catch: all -> 0x008a, TryCatch #0 {, blocks: (B:5:0x000a, B:7:0x000e, B:9:0x0012, B:10:0x0019, B:12:0x002b, B:36:0x0086, B:15:0x0032, B:18:0x0039, B:21:0x0040, B:23:0x004b, B:24:0x0054, B:26:0x0058, B:27:0x0065, B:30:0x006c, B:35:0x0080, B:33:0x007a, B:38:0x0088), top: B:45:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0065 A[Catch: all -> 0x008a, LOOP:2: B:27:0x0065->B:29:0x006b, LOOP_START, PHI: r2
      0x0065: PHI (r2v3 int) = (r2v2 int), (r2v4 int) binds: [B:25:0x0056, B:29:0x006b] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x000a, B:7:0x000e, B:9:0x0012, B:10:0x0019, B:12:0x002b, B:36:0x0086, B:15:0x0032, B:18:0x0039, B:21:0x0040, B:23:0x004b, B:24:0x0054, B:26:0x0058, B:27:0x0065, B:30:0x006c, B:35:0x0080, B:33:0x007a, B:38:0x0088), top: B:45:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0079  */
    /* JADX WARN: Code duplicated, block: B:33:0x007a A[Catch: all -> 0x008a, LOOP:3: B:33:0x007a->B:53:?, LOOP_START, PHI: r10
      0x007a: PHI (r10v13 int) = (r10v12 int), (r10v15 int) binds: [B:31:0x0077, B:53:?] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x000a, B:7:0x000e, B:9:0x0012, B:10:0x0019, B:12:0x002b, B:36:0x0086, B:15:0x0032, B:18:0x0039, B:21:0x0040, B:23:0x004b, B:24:0x0054, B:26:0x0058, B:27:0x0065, B:30:0x006c, B:35:0x0080, B:33:0x007a, B:38:0x0088), top: B:45:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0058 A[EDGE_INSN: B:49:0x0058->B:26:0x0058 BREAK  A[LOOP:1: B:24:0x0054->B:35:0x0080], SYNTHETIC] */
    @Override // defpackage.qcq
    public final boolean b(qbz qbzVar) {
        int i;
        Object[] objArr;
        int length;
        int i2;
        Object[] objArr2;
        int i3;
        Object obj;
        int iA;
        qmd.W(qbzVar, "disposable is null");
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    qjr qjrVar = this.a;
                    if (qjrVar == null) {
                        qjrVar = new qjr();
                        this.a = qjrVar;
                    }
                    Object[] objArr3 = qjrVar.d;
                    int i4 = qjrVar.a;
                    int iA2 = qjr.a(qbzVar.hashCode()) & i4;
                    Object obj2 = objArr3[iA2];
                    if (obj2 == null) {
                        objArr3[iA2] = qbzVar;
                        i = qjrVar.b + 1;
                        qjrVar.b = i;
                        if (i >= qjrVar.c) {
                            objArr = qjrVar.d;
                            length = objArr.length;
                            int i5 = length + length;
                            i2 = i5 - 1;
                            objArr2 = new Object[i5];
                            while (true) {
                                i3 = i - 1;
                                if (i == 0) {
                                    break;
                                }
                                do {
                                    length--;
                                    obj = objArr[length];
                                } while (obj == null);
                                iA = qjr.a(obj.hashCode()) & i2;
                                if (objArr2[iA] == null) {
                                    do {
                                        iA = (iA + 1) & i2;
                                    } while (objArr2[iA] != null);
                                }
                                objArr2[iA] = objArr[length];
                                i = i3;
                            }
                            qjrVar.a = i2;
                            qjrVar.c = (int) (i5 * 0.75f);
                            qjrVar.d = objArr2;
                        }
                    } else if (!obj2.equals(qbzVar)) {
                        while (true) {
                            iA2 = (iA2 + 1) & i4;
                            Object obj3 = objArr3[iA2];
                            if (obj3 == null) {
                                break;
                            }
                            if (obj3.equals(qbzVar)) {
                            }
                        }
                        objArr3[iA2] = qbzVar;
                        i = qjrVar.b + 1;
                        qjrVar.b = i;
                        if (i >= qjrVar.c) {
                            objArr = qjrVar.d;
                            length = objArr.length;
                            int i6 = length + length;
                            i2 = i6 - 1;
                            objArr2 = new Object[i6];
                            while (true) {
                                i3 = i - 1;
                                if (i == 0) {
                                    break;
                                    break;
                                }
                                do {
                                    length--;
                                    obj = objArr[length];
                                } while (obj == null);
                                iA = qjr.a(obj.hashCode()) & i2;
                                if (objArr2[iA] == null) {
                                    do {
                                        iA = (iA + 1) & i2;
                                    } while (objArr2[iA] != null);
                                }
                                objArr2[iA] = objArr[length];
                                i = i3;
                            }
                            qjrVar.a = i2;
                            qjrVar.c = (int) (i6 * 0.75f);
                            qjrVar.d = objArr2;
                        }
                    }
                    return true;
                }
            }
        }
        qbzVar.gT();
        return false;
    }

    @Override // defpackage.qcq
    public final boolean c(qbz qbzVar) {
        Object[] objArr;
        int i;
        int iA;
        Object obj;
        Object obj2;
        qmd.W(qbzVar, "disposables is null");
        if (this.b) {
            return false;
        }
        synchronized (this) {
            if (this.b) {
                return false;
            }
            qjr qjrVar = this.a;
            if (qjrVar != null && (obj = (objArr = qjrVar.d)[(iA = qjr.a(qbzVar.hashCode()) & (i = qjrVar.a))]) != null) {
                if (obj.equals(qbzVar)) {
                    qjrVar.b(iA, objArr, i);
                } else {
                    do {
                        iA = (iA + 1) & i;
                        obj2 = objArr[iA];
                        if (obj2 != null) {
                        }
                    } while (!obj2.equals(qbzVar));
                    qjrVar.b(iA, objArr, i);
                }
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.qcq
    public final void e(qbz qbzVar) {
        if (c(qbzVar)) {
            qbzVar.gT();
        }
    }

    @Override // defpackage.qbz
    public final void gT() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            qjr qjrVar = this.a;
            ArrayList arrayList = null;
            this.a = null;
            if (qjrVar == null) {
                return;
            }
            for (Object obj : qjrVar.d) {
                if (obj instanceof qbz) {
                    try {
                        ((qbz) obj).gT();
                    } catch (Throwable th) {
                        qmd.Y(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList != null) {
                if (arrayList.size() != 1) {
                    throw new qcg(arrayList);
                }
                throw qjq.a((Throwable) arrayList.get(0));
            }
        }
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }
}
