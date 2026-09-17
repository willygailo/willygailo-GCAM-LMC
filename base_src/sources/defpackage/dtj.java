package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class dtj implements dqx {
    private final dqw a;
    private final int b;
    private final int c;
    private final dti d;
    private final drc e;

    public dtj(dqw dqwVar, int i, int i2, dti dtiVar, drc drcVar) {
        this.a = dqwVar;
        this.b = i;
        this.c = i2;
        this.d = dtiVar;
        this.e = drcVar;
    }

    @Override // defpackage.dqx
    public final float a(long j) {
        obr.aQ(this.b == 1);
        return c(j).a();
    }

    @Override // defpackage.dqx
    public final long b() {
        drf drfVarA = this.e.a(Long.MAX_VALUE);
        if (drfVarA.c()) {
            return drfVarA.a();
        }
        return 0L;
    }

    @Override // defpackage.dqx
    public final dqu c(long j) {
        long jMin = Math.min(j, 9223372036854775806L);
        drf drfVarA = this.e.a(1 + jMin);
        boolean zC = drfVarA.c();
        long jA = drfVarA.a();
        boolean zB = drfVarA.b();
        drfVarA.a();
        if (zB) {
            if (!zC) {
                return dqu.c(this.a, jMin);
            }
        } else if (!zC) {
            return dqu.c(this.a, jMin);
        }
        float[] fArr = new float[this.c];
        return dqu.d(this.a, jMin, fArr, 0, this.d.a(jA, fArr));
    }

    @Override // defpackage.dqx
    public final dqu d() {
        return c(b());
    }

    @Override // defpackage.dqx
    public final boolean e() {
        return b() <= 0;
    }

    @Override // defpackage.dqx
    public final List f(long j, int i) {
        int i2 = 0;
        obr.aF(j > Long.MIN_VALUE);
        obr.aF(true);
        ArrayList arrayList = new ArrayList();
        float[] fArr = new float[this.c];
        if (j <= 0) {
            drf drfVarA = this.e.a(j - 1);
            while (i2 < i && drfVarA.b() && drfVarA.a() <= 0) {
                arrayList.add(dqu.d(this.a, drfVarA.a(), fArr, 0, this.d.a(drfVarA.a(), fArr)));
                i2++;
            }
        } else {
            drf drfVarA2 = this.e.a(j + 1);
            while (i2 < i && drfVarA2.c() && drfVarA2.a() >= 0) {
                arrayList.add(dqu.d(this.a, drfVarA2.a(), fArr, 0, this.d.a(drfVarA2.a(), fArr)));
                i2++;
            }
        }
        return arrayList;
    }
}
