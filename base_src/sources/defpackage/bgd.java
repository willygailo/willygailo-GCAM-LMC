package defpackage;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class bgd implements bfg {
    private final Context a;
    private final bfg b;
    private final bfg c;
    private final Class d;

    public bgd(Context context, bfg bfgVar, bfg bfgVar2, Class cls) {
        this.a = context.getApplicationContext();
        this.b = bfgVar;
        this.c = bfgVar2;
        this.d = cls;
    }

    @Override // defpackage.bfg
    public final /* bridge */ /* synthetic */ bff a(Object obj, int i, int i2, azt aztVar) {
        Uri uri = (Uri) obj;
        return new bff(new blo(uri), new bgc(this.a, this.b, this.c, uri, i, i2, aztVar, this.d));
    }

    @Override // defpackage.bfg
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return vj.c((Uri) obj);
    }
}
