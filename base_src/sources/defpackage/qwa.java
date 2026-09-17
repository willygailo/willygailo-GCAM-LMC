package defpackage;

import java.util.Random;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public final class qwa extends Thread {
    public final qwk a;
    public final qpc b;
    public boolean c;
    final /* synthetic */ qwb d;
    public int e;
    private long f;
    private long g;
    private int h;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;

    public qwa(qwb qwbVar, int i) {
        this.d = qwbVar;
        setDaemon(true);
        this.a = new qwk();
        this.e = 4;
        this.b = qnt.g(0);
        this.nextParkedWorker = qwb.a;
        qny qnyVar = qny.b;
        Object obj = ((qnu) qny.b).a.get();
        obj.getClass();
        this.h = ((Random) obj).nextInt();
        c(i);
    }

    private final qwg e() {
        if (a(2) == 0) {
            qwg qwgVar = (qwg) this.d.i.b();
            return qwgVar == null ? (qwg) this.d.j.b() : qwgVar;
        }
        qwg qwgVar2 = (qwg) this.d.j.b();
        return qwgVar2 == null ? (qwg) this.d.i.b() : qwgVar2;
    }

    private final qwg f(boolean z) {
        long jB;
        long jB2;
        boolean z2 = qql.a;
        int i = (int) (this.d.h.b & 2097151);
        if (i < 2) {
            return null;
        }
        int iA = a(i);
        qwb qwbVar = this.d;
        long jMin = Long.MAX_VALUE;
        for (int i2 = 0; i2 < i; i2++) {
            iA++;
            if (iA > i) {
                iA = 1;
            }
            qwa qwaVar = (qwa) qwbVar.g.get(iA);
            if (qwaVar != null && qwaVar != this) {
                if (z) {
                    qwk qwkVar = this.a;
                    qwk qwkVar2 = qwaVar.a;
                    qwkVar2.getClass();
                    int i3 = qwkVar2.d.b;
                    int i4 = qwkVar2.c.b;
                    AtomicReferenceArray atomicReferenceArray = qwkVar2.a;
                    while (true) {
                        if (i3 != i4) {
                            int i5 = i3 & 127;
                            if (qwkVar2.e.b != 0) {
                                qwg qwgVar = (qwg) atomicReferenceArray.get(i5);
                                if (qwgVar != null && qwgVar.h.f() == 1 && atomicReferenceArray.compareAndSet(i5, qwgVar, null)) {
                                    qwkVar2.e.a();
                                    qwkVar.c(qwgVar, false);
                                    jB2 = -1;
                                    break;
                                }
                                i3++;
                            }
                        }
                        jB2 = qwkVar.b(qwkVar2, true);
                        break;
                    }
                    jB = jB2;
                } else {
                    qwk qwkVar3 = this.a;
                    qwk qwkVar4 = qwaVar.a;
                    qwkVar4.getClass();
                    qwg qwgVarE = qwkVar4.e();
                    if (qwgVarE != null) {
                        qwkVar3.c(qwgVarE, false);
                        jB = -1;
                    } else {
                        jB = qwkVar3.b(qwkVar4, false);
                    }
                }
                if (jB == -1) {
                    return this.a.d();
                }
                if (jB > 0) {
                    jMin = Math.min(jMin, jB);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.g = jMin;
        return null;
    }

    private final boolean g() {
        return this.nextParkedWorker != qwb.a;
    }

    public final int a(int i) {
        int i2 = this.h;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.h = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (r0 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        if (r0 != null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.qwg b(boolean r9) {
        /*
            r8 = this;
            int r0 = r8.e
            r1 = 1
            if (r0 != r1) goto L6
            goto L4e
        L6:
            qwb r0 = r8.d
            qpd r2 = r0.h
        La:
            long r3 = r2.b
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r5 = r5 & r3
            r7 = 42
            long r5 = r5 >> r7
            int r6 = (int) r5
            if (r6 != 0) goto L3e
            if (r9 == 0) goto L2d
            qwk r9 = r8.a
            qwg r9 = r9.d()
            if (r9 != 0) goto L37
            qwb r9 = r8.d
            qvi r9 = r9.j
            java.lang.Object r9 = r9.b()
            qwg r9 = (defpackage.qwg) r9
            goto L37
        L2d:
            qwb r9 = r8.d
            qvi r9 = r9.j
            java.lang.Object r9 = r9.b()
            qwg r9 = (defpackage.qwg) r9
        L37:
            if (r9 != 0) goto L3d
            qwg r9 = r8.f(r1)
        L3d:
            return r9
        L3e:
            qpd r5 = r0.h
            r6 = -4398046511104(0xfffffc0000000000, double:NaN)
            long r6 = r6 + r3
            boolean r3 = r5.c(r3, r6)
            if (r3 == 0) goto La
            r8.e = r1
        L4e:
            if (r9 == 0) goto L73
            qwb r9 = r8.d
            int r9 = r9.b
            int r9 = r9 + r9
            int r9 = r8.a(r9)
            if (r9 != 0) goto L61
            qwg r0 = r8.e()
            if (r0 != 0) goto L72
        L61:
            qwk r0 = r8.a
            qwg r0 = r0.d()
            if (r0 != 0) goto L72
            if (r9 == 0) goto L7a
            qwg r0 = r8.e()
            if (r0 == 0) goto L7a
            goto L79
        L72:
            goto L79
        L73:
            qwg r0 = r8.e()
            if (r0 == 0) goto L7a
        L79:
            return r0
        L7a:
            r9 = 0
            qwg r9 = r8.f(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwa.b(boolean):qwg");
    }

    public final void c(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.e);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final boolean d(int i) {
        int i2 = this.e;
        boolean z = i2 == 1;
        if (z) {
            this.d.h.a(4398046511104L);
        }
        if (i2 != i) {
            this.e = i;
        }
        return z;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (!this.d.d() && this.e != 5) {
            qwg qwgVarB = b(this.c);
            long j = -2097152;
            if (qwgVarB != null) {
                this.g = 0L;
                int iF = qwgVarB.h.f();
                this.f = 0L;
                if (this.e == 3) {
                    boolean z3 = qql.a;
                    this.e = 2;
                }
                if (iF != 0 && d(2)) {
                    this.d.c();
                }
                qwb.f(qwgVarB);
                if (iF == 0) {
                    z2 = false;
                } else {
                    this.d.h.a(-2097152L);
                    if (this.e != 5) {
                        boolean z4 = qql.a;
                        this.e = 4;
                    }
                    z2 = false;
                }
            } else {
                this.c = z;
                if (this.g == 0) {
                    if (g()) {
                        boolean z5 = qql.a;
                        qpc qpcVar = this.b;
                        int i2 = qpf.a;
                        qpcVar.b = -1;
                        while (g() && this.b.b == -1 && !this.d.d() && this.e != 5) {
                            d(3);
                            Thread.interrupted();
                            if (this.f == 0) {
                                this.f = System.nanoTime() + this.d.d;
                            }
                            LockSupport.parkNanos(this.d.d);
                            if (System.nanoTime() - this.f >= 0) {
                                this.f = 0L;
                                qwb qwbVar = this.d;
                                synchronized (qwbVar.g) {
                                    if (!qwbVar.d()) {
                                        if (((int) (qwbVar.h.b & 2097151)) > qwbVar.b) {
                                            if (this.b.d(-1, i)) {
                                                int i3 = this.indexInArray;
                                                c(0);
                                                qwbVar.b(this, i3, 0);
                                                int andDecrement = (int) (qpd.a.getAndDecrement(qwbVar.h) & 2097151);
                                                if (andDecrement != i3) {
                                                    Object obj = qwbVar.g.get(andDecrement);
                                                    obj.getClass();
                                                    qwa qwaVar = (qwa) obj;
                                                    qwbVar.g.set(i3, qwaVar);
                                                    qwaVar.c(i3);
                                                    qwbVar.b(qwaVar, andDecrement, i3);
                                                }
                                                qwbVar.g.set(andDecrement, null);
                                                this.e = 5;
                                                i = 1;
                                            }
                                        }
                                    }
                                }
                            } else {
                                i = 1;
                            }
                        }
                    } else {
                        qwb qwbVar2 = this.d;
                        if (this.nextParkedWorker == qwb.a) {
                            qpd qpdVar = qwbVar2.f;
                            while (true) {
                                long j2 = qpdVar.b;
                                int i4 = this.indexInArray;
                                boolean z6 = qql.a;
                                this.nextParkedWorker = qwbVar2.g.get((int) (j2 & 2097151));
                                if (qwbVar2.f.c(j2, ((long) i4) | ((2097152 + j2) & j))) {
                                    break;
                                } else {
                                    j = -2097152;
                                }
                            }
                        }
                    }
                    z2 = z2;
                    i = 1;
                    z = false;
                } else if (z2) {
                    d(3);
                    Thread.interrupted();
                    LockSupport.parkNanos(this.g);
                    this.g = 0L;
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
        }
        d(5);
    }
}
