package defpackage;

import com.google.googlex.gcam.DirtyLensHistory;
import com.google.googlex.gcam.GcamModuleJNI;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class bsp implements lij {
    final /* synthetic */ lvq a;
    final /* synthetic */ bst b;
    final /* synthetic */ bsu c;

    public bsp(lvq lvqVar, bst bstVar, bsu bsuVar) {
        this.a = lvqVar;
        this.b = bstVar;
        this.c = bsuVar;
    }

    @Override // defpackage.lij
    public final /* bridge */ /* synthetic */ void fB(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.g().iterator();
        while (it.hasNext()) {
            arrayList.add(this.b.d((lvs) it.next()));
        }
        bsu bsuVar = this.c;
        DirtyLensHistory dirtyLensHistory = bsuVar.a.a;
        GcamModuleJNI.DirtyLensHistory_Reset(dirtyLensHistory.a, dirtyLensHistory);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((bss) it2.next()).fB(bsuVar.a.a());
        }
        ddf ddfVar = bsuVar.b;
        ddi ddiVar = dcs.a;
        ddfVar.e();
    }
}
