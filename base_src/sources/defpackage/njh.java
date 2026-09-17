package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class njh implements nin {
    public niu[] a;

    @Override // defpackage.nin
    public final /* bridge */ /* synthetic */ Object a(nim nimVar) {
        OutputStream outputStreamJ = nimVar.a.j(nimVar.d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStreamJ);
        if (!nimVar.c.isEmpty()) {
            List list = nimVar.c;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                njl njlVarB = ((njm) it.next()).b();
                if (njlVarB != null) {
                    arrayList2.add(njlVarB);
                }
            }
            nik nikVar = !arrayList2.isEmpty() ? new nik(outputStreamJ, arrayList2) : null;
            if (nikVar != null) {
                arrayList.add(nikVar);
            }
        }
        for (njn njnVar : nimVar.b) {
            arrayList.add(njnVar.d());
        }
        Collections.reverse(arrayList);
        niu[] niuVarArr = this.a;
        if (niuVarArr != null) {
            niu niuVar = niuVarArr[0];
            OutputStream outputStream = (OutputStream) ohh.t(arrayList);
            if (outputStream instanceof njb) {
                niuVar.b = (njb) outputStream;
                niuVar.a = (OutputStream) arrayList.get(0);
            }
        }
        return (OutputStream) arrayList.get(0);
    }
}
