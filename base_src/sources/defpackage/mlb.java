package defpackage;

import java.io.FileInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class mlb {
    public final FileInputStream a;
    public final long b;
    final long c;
    public long d;
    long e;

    public mlb(FileInputStream fileInputStream, long j, long j2) {
        obr.aM(j <= j2, "start at %s later than end at %s", j, j2);
        this.a = fileInputStream;
        this.b = j;
        this.c = j2;
        this.d = 0L;
        this.e = j2 - j;
    }

    public final long a() {
        return this.e - this.d;
    }

    public final mlb b() {
        mlb mlbVar = new mlb(this.a, this.b, this.c);
        mlbVar.e(this.d);
        mlbVar.d(this.e);
        return mlbVar;
    }

    public final mlb c() {
        FileInputStream fileInputStream = this.a;
        long j = this.b;
        return new mlb(fileInputStream, this.d + j, this.e + j);
    }

    public final void d(long j) {
        long j2 = this.d;
        obr.aM(j >= j2, "New limit %s smaller than position ", j, j2);
        long j3 = this.b;
        long j4 = this.c;
        obr.aM(j3 + j <= j4, "New limit %s points farther than end position %s", j, j4);
        this.e = j;
    }

    public final void e(long j) {
        long j2 = this.e;
        obr.aM(j <= j2, "New position %s larger than limit %s", j, j2);
        this.d = j;
    }
}
