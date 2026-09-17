package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class yo extends yk {
    public yk[] aq = new yk[4];
    public int ar = 0;

    public final void T(ArrayList arrayList, int i, zf zfVar) {
        for (int i2 = 0; i2 < this.ar; i2++) {
            zfVar.d(this.aq[i2]);
        }
        for (int i3 = 0; i3 < this.ar; i3++) {
            wk.a(this.aq[i3], i, arrayList, zfVar);
        }
    }
}
