package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class fqe {
    public final long a;
    public long c;
    final /* synthetic */ fqf f;
    private final mln g;
    public long b = 0;
    public boolean d = false;
    public boolean e = false;

    public fqe(fqf fqfVar, mln mlnVar, long j) {
        this.f = fqfVar;
        this.g = mlnVar;
        this.a = j;
        long j2 = fqfVar.d;
        this.c = j2;
        while (true) {
            j2++;
            if (j2 >= fqfVar.e) {
                return;
            }
            mss mssVar = (mss) fqfVar.b.get(Long.valueOf(j2));
            mssVar.getClass();
            if (mssVar.b.presentationTimeUs >= j) {
                return;
            } else {
                this.c = j2;
            }
        }
    }

    public final void a(long j, boolean z) {
        synchronized (this.f) {
            if (this.e) {
                return;
            }
            this.b = j;
            this.d = z;
            long j2 = this.c + 1;
            while (true) {
                fqf fqfVar = this.f;
                if (j2 >= fqfVar.e) {
                    break;
                }
                if (j2 > fqfVar.d) {
                    mss mssVar = (mss) fqfVar.b.get(Long.valueOf(j2));
                    mssVar.getClass();
                    if (j < mssVar.b.presentationTimeUs) {
                        break;
                    } else if (mssVar.b.presentationTimeUs < this.a) {
                        this.c = j2;
                    } else {
                        c(mssVar, j2);
                    }
                } else if (j2 >= 0) {
                    lis lisVar = fqfVar.a;
                    StringBuilder sb = new StringBuilder(65);
                    sb.append("packet at index ");
                    sb.append(j2);
                    sb.append(" was likely dropped too early");
                    lisVar.h(sb.toString());
                }
                j2++;
            }
            b();
        }
    }

    public final void b() {
        if (!this.e && this.d) {
            fqf fqfVar = this.f;
            long j = fqfVar.c;
            long j2 = this.b;
            if (j >= j2 || fqfVar.f || this.a == j2) {
                this.g.close();
                this.e = true;
            }
        }
    }

    public final void c(mss mssVar, long j) {
        if (this.e) {
            return;
        }
        lis lisVar = this.f.a;
        long j2 = mssVar.b.presentationTimeUs;
        StringBuilder sb = new StringBuilder(37);
        sb.append("writing packet <");
        sb.append(j2);
        sb.append(">");
        lisVar.g(sb.toString());
        this.g.b(mssVar.a, mssVar.b);
        this.c = j;
    }
}
