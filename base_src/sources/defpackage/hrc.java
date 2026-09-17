package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class hrc {
    public final Context a;
    public final ikp b;

    public hrc(Context context, ikp ikpVar) {
        this.a = context;
        this.b = ikpVar;
    }

    public final void a(hrb hrbVar) {
        if (hrbVar != null) {
            ikp ikpVar = this.b;
            hsp hspVar = hrbVar.a;
            ikpVar.c.remove(hspVar);
            ikpVar.b.remove(hspVar);
            ikpVar.d.remove(hspVar);
        }
    }

    public final hrb b(lig ligVar, hsp hspVar) {
        ikp ikpVar = this.b;
        ikpVar.c.put(hspVar, ligVar);
        ikpVar.b.remove(hspVar);
        Integer num = (Integer) ikpVar.d.get(hspVar);
        ikpVar.d.put(hspVar, Integer.valueOf(num == null ? 0 : num.intValue() + 1));
        return new hrb(hspVar);
    }
}
