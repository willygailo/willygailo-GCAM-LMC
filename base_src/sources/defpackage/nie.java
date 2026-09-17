package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
final class nie extends afg {
    private List i;

    public nie(Context context) {
        super(context.getApplicationContext());
    }

    @Override // defpackage.afg
    public final /* bridge */ /* synthetic */ Object a() {
        TreeSet treeSet = new TreeSet();
        String[] strArrSplit = myq.o(this.c.getApplicationContext(), "third_party_license_metadata", 0L, -1).split("\n");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str : strArrSplit) {
            int iIndexOf = str.indexOf(32);
            String[] strArrSplit2 = str.substring(0, iIndexOf).split(":");
            boolean z = strArrSplit2.length == 2 && iIndexOf > 0;
            String strValueOf = String.valueOf(str);
            obr.aR(z, strValueOf.length() != 0 ? "Invalid license meta-data line:\n".concat(strValueOf) : new String("Invalid license meta-data line:\n"));
            arrayList.add(new nic(str.substring(iIndexOf + 1), Long.parseLong(strArrSplit2[0]), Integer.parseInt(strArrSplit2[1])));
        }
        Collections.sort(arrayList);
        treeSet.addAll(arrayList);
        return Collections.unmodifiableList(new ArrayList(treeSet));
    }

    @Override // defpackage.afh
    public final void h() {
        List list = this.i;
        if (list != null) {
            g(list);
        } else {
            c();
        }
    }

    @Override // defpackage.afh
    public final void i() {
        f();
    }

    @Override // defpackage.afh
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void g(List list) {
        this.i = list;
        super.g(list);
    }
}
