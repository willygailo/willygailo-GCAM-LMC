package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class pqw implements pqj {
    public final pqm a;
    public final String b;
    public final Object[] c;
    private final int d;

    public pqw(pqm pqmVar, String str, Object[] objArr) {
        this.a = pqmVar;
        this.b = str;
        this.c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // defpackage.pqj
    public final pqm a() {
        return this.a;
    }

    @Override // defpackage.pqj
    public final boolean b() {
        return (this.d & 2) == 2;
    }

    @Override // defpackage.pqj
    public final int c() {
        return (this.d & 1) == 1 ? 1 : 2;
    }
}
