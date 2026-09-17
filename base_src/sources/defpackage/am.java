package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class am {
    public final ArrayList a = new ArrayList();

    public final void a(an anVar) {
        this.a.clear();
        for (int i = 1; i < anVar.e; i++) {
            ap apVar = anVar.g.a[i];
            for (int i2 = 0; i2 < 6; i2++) {
                apVar.e[i2] = 0.0f;
            }
            apVar.e[apVar.c] = 1.0f;
            if (apVar.h == 4) {
                this.a.add(apVar);
            }
        }
        int size = this.a.size();
        for (int i3 = 0; i3 < size; i3++) {
            ap apVar2 = (ap) this.a.get(i3);
            int i4 = apVar2.b;
            if (i4 != -1) {
                aj ajVar = anVar.c[i4].d;
                int i5 = ajVar.a;
                for (int i6 = 0; i6 < i5; i6++) {
                    ap apVarD = ajVar.d(i6);
                    if (apVarD != null) {
                        float fB = ajVar.b(i6);
                        for (int i7 = 0; i7 < 6; i7++) {
                            float[] fArr = apVarD.e;
                            fArr[i7] = fArr[i7] + (apVar2.e[i7] * fB);
                        }
                        if (!this.a.contains(apVarD)) {
                            this.a.add(apVarD);
                        }
                    }
                }
                for (int i8 = 0; i8 < 6; i8++) {
                    apVar2.e[i8] = 0.0f;
                }
            }
        }
    }

    public final String toString() {
        int size = this.a.size();
        String string = "Goal: ";
        for (int i = 0; i < size; i++) {
            ap apVar = (ap) this.a.get(i);
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            String str = apVar + "[";
            int i2 = 0;
            while (true) {
                float[] fArr = apVar.e;
                if (i2 < 6) {
                    String str2 = str + apVar.e[i2];
                    float[] fArr2 = apVar.e;
                    str = i2 < 5 ? str2 + ", " : str2 + "] ";
                    i2++;
                }
            }
            sb.append(str);
            string = sb.toString();
        }
        return string;
    }
}
