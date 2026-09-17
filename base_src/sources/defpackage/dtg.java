package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dtg implements drc {
    private final long[] b;
    public final Object a = new Object();
    private int c = 0;
    private int d = 0;

    public dtg(int i) {
        this.b = new long[i];
    }

    private final int j(long j) {
        synchronized (this.a) {
            int iE = e() - 1;
            int i = 0;
            while (i <= iE) {
                int i2 = (i + iE) >>> 1;
                long j2 = this.b[f(i2)];
                if (j2 < j) {
                    i = i2 + 1;
                } else {
                    if (j2 <= j) {
                        return i2;
                    }
                    iE = i2 - 1;
                }
            }
            return i;
        }
    }

    @Override // defpackage.drc
    public final drf a(long j) {
        return new dtf(this, j);
    }

    public final int b(long j) {
        boolean z;
        int i;
        long jH;
        synchronized (this.a) {
            if (i()) {
                z = true;
            } else {
                synchronized (this.a) {
                    obr.aR(!i(), "Attempting to get latest timestamp on empty buffer!");
                    jH = h(e() - 1);
                }
                z = j > jH;
            }
            obr.aG(z, "Attempting to insert earlier timestamp into buffer!");
            i = this.c;
            long[] jArr = this.b;
            this.c = (i + 1) % jArr.length;
            jArr[i] = j;
            this.d++;
        }
        return i;
    }

    public final int c(long j) {
        synchronized (this.a) {
            if (!i()) {
                int iJ = j(j);
                if (iJ >= 0 && iJ < e() && h(iJ) == j) {
                    return iJ;
                }
                if (iJ != 0) {
                    return iJ - 1;
                }
            }
            return -1;
        }
    }

    public final int d(long j) {
        synchronized (this.a) {
            int i = -1;
            if (i()) {
                return -1;
            }
            int iJ = j(j);
            if (iJ >= 0 && iJ < e()) {
                i = iJ;
            }
            return i;
        }
    }

    public final int e() {
        int iMin;
        synchronized (this.a) {
            iMin = Math.min(this.d, this.b.length);
        }
        return iMin;
    }

    public final int f(int i) {
        int i2;
        synchronized (this.a) {
            if (i()) {
                i2 = -1;
            } else {
                i2 = this.d >= this.b.length ? this.c : 0;
            }
        }
        return (i2 + i) % e();
    }

    public final int g(long j) {
        int iJ;
        synchronized (this.a) {
            iJ = j(j);
            if (iJ < 0 || iJ >= e() || h(iJ) != j) {
                iJ = -1;
            }
        }
        if (iJ >= 0) {
            return f(iJ);
        }
        return -1;
    }

    public final long h(int i) {
        long j;
        synchronized (this.a) {
            if (i >= 0) {
                if (i < e()) {
                    j = this.b[f(i)];
                }
            }
            StringBuilder sb = new StringBuilder(46);
            sb.append("Attempting to access illegal index ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        return j;
    }

    public final boolean i() {
        boolean z;
        synchronized (this.a) {
            z = this.d == 0;
        }
        return z;
    }
}
