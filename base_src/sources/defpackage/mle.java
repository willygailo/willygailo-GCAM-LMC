package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class mle {
    public final ojc a;
    final List b = new ArrayList();

    public mle(ojc ojcVar) {
        this.a = ojcVar;
    }

    public final mle a(String str) throws mli {
        List listC = c(str);
        if (listC.size() != 1) {
            throw new mli(String.format(Locale.US, "Looking for a unique %s box in a %s box but found %d of them", str, this.a.g() ? ((mld) this.a.c()).a : "n/a", Integer.valueOf(listC.size())));
        }
        return (mle) listC.get(0);
    }

    public final mlg b(mlf mlfVar) throws mli {
        obr.aF(this.a.g());
        obr.aF(((mld) this.a.c()).a.equals(mlfVar.a));
        if (((mld) this.a.c()).b.b < mlfVar.b + 4) {
            throw new mli(String.format(Locale.US, "Trying to look up offset %d in box %s but the box is only %d bytes long", Integer.valueOf(mlfVar.b), ((mld) this.a.c()).a, Integer.valueOf(((mld) this.a.c()).b.b)));
        }
        mld mldVar = (mld) this.a.c();
        return new mlg(mldVar.d, mldVar.b.a + mlfVar.b);
    }

    public final List c(String str) {
        ArrayList arrayList = new ArrayList();
        for (mle mleVar : this.b) {
            obr.aQ(mleVar.a.g());
            if (((mld) mleVar.a.c()).a.equals(str)) {
                arrayList.add(mleVar);
            }
        }
        return arrayList;
    }
}
