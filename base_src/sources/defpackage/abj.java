package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class abj implements fb {
    final /* synthetic */ String a;

    public abj(String str) {
        this.a = str;
    }

    @Override // defpackage.fb
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        abk abkVar = (abk) obj;
        synchronized (abl.c) {
            ArrayList arrayList = (ArrayList) abl.d.get(this.a);
            if (arrayList == null) {
                return;
            }
            abl.d.remove(this.a);
            for (int i = 0; i < arrayList.size(); i++) {
                ((fb) arrayList.get(i)).accept(abkVar);
            }
        }
    }
}
