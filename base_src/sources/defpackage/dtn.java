package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dtn {
    public static final dti a = new dti() { // from class: dth
        @Override // defpackage.dti
        public final int a(long j, float[] fArr) {
            fArr[0] = Float.NaN;
            return 1;
        }
    };

    public static dtm a(dqw dqwVar) {
        return new dtm(dqwVar);
    }

    public static List b(dqx dqxVar, int i) {
        obr.aF(i >= 0);
        return dqxVar.f(dqxVar.b(), i);
    }
}
