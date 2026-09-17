package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gqs extends ldl {
    public gqs(lco lcoVar, lco lcoVar2, lco lcoVar3, lco lcoVar4, lco lcoVar5) {
        super(lcv.b(lcoVar, lcoVar3, lcoVar4, lcoVar5, lcoVar2));
    }

    @Override // defpackage.ldl
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        List list = (List) obj;
        return (((Integer) list.get(1)).intValue() == 0 && ((Float) list.get(2)).floatValue() == -1.0f && ((Float) list.get(3)).floatValue() == -1.0f && !((Boolean) list.get(4)).booleanValue()) ? (gqt) list.get(0) : gqt.OFF;
    }
}
