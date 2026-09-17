package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qvk {
    public static final qvr a = new qvr("REMOVE_FROZEN");
    private final int c;
    private final boolean d;
    private final int e;
    private final qpa g;
    private final qpe f = qnt.i(null);
    public final qpd b = qnt.h(0);

    public qvk(int i, boolean z) {
        this.c = i;
        this.d = z;
        int i2 = i - 1;
        this.e = i2;
        this.g = qnt.e(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final int a(Object obj) {
        qpd qpdVar = this.b;
        while (true) {
            long j = qpdVar.b;
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((j & 1152921503533105152L) >> 30);
            int i3 = this.e;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (!this.d && this.g.a(i2 & i3).a != null) {
                int i4 = this.c;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    return 1;
                }
            } else if (this.b.c(j, qnm.t(j, 1152921503533105152L) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                qpe qpeVarA = this.g.a(i2 & i3);
                int i5 = qpf.a;
                qpeVarA.a = obj;
                qvk qvkVarC = this;
                while ((qvkVarC.b.b & 1152921504606846976L) != 0) {
                    qvkVarC = qvkVarC.c();
                    Object obj2 = qvkVarC.g.a(qvkVarC.e & i2).a;
                    if ((obj2 instanceof qvj) && ((qvj) obj2).a == i2) {
                        qvkVarC.g.a(qvkVarC.e & i2).a = obj;
                    } else {
                        qvkVarC = null;
                    }
                    if (qvkVarC == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final Object b() {
        Object obj;
        qpd qpdVar = this.b;
        while (true) {
            long j = qpdVar.b;
            long j2 = 1152921504606846976L;
            if ((j & 1152921504606846976L) != 0) {
                return a;
            }
            int i = (int) (j & 1073741823);
            int i2 = this.e;
            int i3 = i & i2;
            if ((i2 & ((int) ((1152921503533105152L & j) >> 30))) == i3) {
                return null;
            }
            Object obj2 = this.g.a(i3).a;
            if (obj2 == null) {
                if (this.d) {
                    return null;
                }
            } else {
                if (obj2 instanceof qvj) {
                    return null;
                }
                int i4 = (i + 1) & 1073741823;
                if (this.b.c(j, qnm.u(j, i4))) {
                    qpe qpeVarA = this.g.a(this.e & i);
                    int i5 = qpf.a;
                    qpeVarA.a = null;
                    return obj2;
                }
                if (this.d) {
                    qvk qvkVarC = this;
                    while (true) {
                        qpd qpdVar2 = qvkVarC.b;
                        while (true) {
                            long j3 = qpdVar2.b;
                            int i6 = (int) (j3 & 1073741823);
                            boolean z = qql.a;
                            if ((j3 & j2) != 0) {
                                qvkVarC = qvkVarC.c();
                                obj = null;
                                break;
                            }
                            if (qvkVarC.b.c(j3, qnm.u(j3, i4))) {
                                qpe qpeVarA2 = qvkVarC.g.a(i6 & qvkVarC.e);
                                int i7 = qpf.a;
                                obj = null;
                                qpeVarA2.a = null;
                                qvkVarC = null;
                                break;
                            }
                            j2 = 1152921504606846976L;
                        }
                        if (qvkVarC == null) {
                            return obj2;
                        }
                        j2 = 1152921504606846976L;
                    }
                }
            }
        }
    }

    public final qvk c() {
        long j;
        qpd qpdVar = this.b;
        while (true) {
            j = qpdVar.b;
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (qpdVar.c(j, j2)) {
                j = j2;
                break;
            }
        }
        qpe qpeVar = this.f;
        while (true) {
            qvk qvkVar = (qvk) qpeVar.a;
            if (qvkVar != null) {
                return qvkVar;
            }
            qpe qpeVar2 = this.f;
            int i = this.c;
            qvk qvkVar2 = new qvk(i + i, this.d);
            int i2 = (int) (1073741823 & j);
            int i3 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i4 = this.e;
                int i5 = i2 & i4;
                if (i5 != (i4 & i3)) {
                    Object qvjVar = this.g.a(i5).a;
                    if (qvjVar == null) {
                        qvjVar = new qvj(i2);
                    }
                    qpe qpeVarA = qvkVar2.g.a(qvkVar2.e & i2);
                    int i6 = qpf.a;
                    qpeVarA.a = qvjVar;
                    i2++;
                }
            }
            qpd qpdVar2 = qvkVar2.b;
            int i7 = qpf.a;
            qpdVar2.b = qnm.t(j, 1152921504606846976L);
            qpeVar2.c(null, qvkVar2);
        }
    }

    public final boolean d() {
        long j;
        qpd qpdVar = this.b;
        do {
            j = qpdVar.b;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!qpdVar.c(j, 2305843009213693952L | j));
        return true;
    }

    public final boolean e() {
        long j = this.b.b;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }
}
