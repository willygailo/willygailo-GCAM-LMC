package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class cp implements uj {
    final /* synthetic */ cu a;

    public cp(cu cuVar) {
        this.a = cuVar;
    }

    @Override // defpackage.uj
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Map map = (Map) obj;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = true != ((Boolean) arrayList.get(i)).booleanValue() ? -1 : 0;
        }
        cr crVar = (cr) this.a.o.pollFirst();
        if (crVar == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        String str = crVar.a;
        if (this.a.a.b(str) == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }
}
