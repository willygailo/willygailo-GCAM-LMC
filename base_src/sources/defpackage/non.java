package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class non implements qcm {
    private final /* synthetic */ int c;
    public static final non b = new non(1);
    public static final non a = new non(0);

    public non(int i) {
        this.c = i;
    }

    @Override // defpackage.qcm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                nqh nqhVar = (nqh) obj;
                List list = (List) obj2;
                nqhVar.getClass();
                list.getClass();
                return new nqi(nqhVar, list);
            default:
                nqh nqhVar2 = (nqh) obj;
                npe npeVar = (npe) obj2;
                nqhVar2.getClass();
                npeVar.getClass();
                return new qkl(nqhVar2, npeVar);
        }
    }
}
