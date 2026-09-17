package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mlj {
    public final ByteBuffer a;
    private final List b;

    public mlj(ByteBuffer byteBuffer, List list) {
        this.a = byteBuffer;
        this.b = list;
    }

    public final List a(mlh mlhVar) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = mlhVar.a;
        int i3 = mlhVar.b;
        while (true) {
            i = mlhVar.a + mlhVar.b;
            boolean z = true;
            if (i2 >= i) {
                break;
            }
            mld mldVar = new mld(this, new mlh(i2, i3));
            int i4 = mldVar.b.b + mldVar.c;
            i2 += i4;
            i3 -= i4;
            if (i3 < 0) {
                z = false;
            }
            obr.aQ(z);
            arrayList.add(mldVar);
        }
        obr.aQ(i2 == i);
        obr.aQ(i3 == 0);
        return arrayList;
    }

    public final void b(mle mleVar, List list) {
        mle mleVar2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mld mldVar = (mld) it.next();
            if (this.b.contains(mldVar.a)) {
                mleVar2 = new mle(ojc.i(mldVar));
                b(mleVar2, a(mldVar.b));
            } else {
                mleVar2 = new mle(ojc.i(mldVar));
            }
            ojc.i(mleVar);
            mleVar.b.add(mleVar2);
        }
    }
}
