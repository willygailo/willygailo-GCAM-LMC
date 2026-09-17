package defpackage;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class nok implements qco {
    final /* synthetic */ nom a;
    final /* synthetic */ nrl b;

    public nok(nom nomVar, nrl nrlVar) {
        this.a = nomVar;
        this.b = nrlVar;
    }

    @Override // defpackage.qco
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        qkl qklVar = (qkl) obj;
        qklVar.getClass();
        List list = (List) qklVar.a;
        List list2 = (List) qklVar.b;
        IOException iOException = new IOException("File deletion failed");
        this.a.c.a(this.b.b(list, list2, 23, iOException));
        return qbu.h(iOException);
    }
}
