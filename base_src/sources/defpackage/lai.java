package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lai implements pgk {
    public final /* synthetic */ lak a;
    private final /* synthetic */ int b;

    public /* synthetic */ lai(lak lakVar, int i) {
        this.b = i;
        this.a = lakVar;
    }

    @Override // defpackage.pgk
    public final pht a(Object obj) {
        switch (this.b) {
            case 0:
                lak lakVar = this.a;
                List list = (List) obj;
                list.getClass();
                return lakVar.a(list.get(0), list.get(1));
            default:
                lak lakVar2 = this.a;
                List list2 = (List) obj;
                list2.getClass();
                return lakVar2.a(list2.get(0), list2.get(1));
        }
    }
}
