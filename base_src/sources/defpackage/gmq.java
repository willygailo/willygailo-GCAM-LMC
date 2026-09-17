package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class gmq implements phh {
    final /* synthetic */ gmr a;
    final /* synthetic */ gmo b;

    public gmq(gmr gmrVar, gmo gmoVar) {
        this.a = gmrVar;
        this.b = gmoVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        lis lisVar = this.a.a;
        String strValueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 32);
        sb.append("Unable to log capture metadata: ");
        sb.append(strValueOf);
        lisVar.d(sb.toString());
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List list = (List) obj;
        list.getClass();
        String str = (String) ohh.r(list, 0);
        String str2 = (String) ohh.r(list, 1);
        lis lisVar = this.a.a;
        ojb ojbVarBa = obr.ba("Capture Metadata");
        ojbVarBa.b("Input", str);
        ojbVarBa.b("Reprocessing", str2);
        ojbVarBa.b("NPF", this.b.e);
        String strValueOf = String.valueOf(ojbVarBa.toString());
        lisVar.g(strValueOf.length() != 0 ? "Capture Metadata: ".concat(strValueOf) : new String("Capture Metadata: "));
    }
}
