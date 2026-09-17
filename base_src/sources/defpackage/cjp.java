package defpackage;

import android.media.CamcorderProfile;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cjp {
    public final lef a;
    public final Map b = new HashMap();
    public final lwf c;

    public cjp(lef lefVar, lwf lwfVar) {
        this.a = lefVar;
        this.c = lwfVar;
    }

    public final List a(lvs lvsVar, ldz ldzVar) {
        LinkedList linkedList = new LinkedList();
        for (lep lepVar : lep.values()) {
            leb lebVar = lepVar.l;
            if (CamcorderProfile.hasProfile(Integer.parseInt(lvsVar.a), lepVar.k)) {
                if (this.a.d(mip.bE(lvsVar, lepVar), ldzVar, lebVar)) {
                    linkedList.addFirst(lebVar);
                }
            }
        }
        return linkedList;
    }
}
