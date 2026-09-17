package defpackage;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class bga implements bfg {
    private final Context a;
    private final /* synthetic */ int b;

    public bga(Context context, int i) {
        this.b = i;
        this.a = context.getApplicationContext();
    }

    public bga(Context context, int i, byte[] bArr) {
        this.b = i;
        this.a = context;
    }

    public bga(Context context, int i, char[] cArr) {
        this.b = i;
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.bfg
    public final /* synthetic */ bff a(Object obj, int i, int i2, azt aztVar) {
        Long l;
        switch (this.b) {
            case 0:
                Uri uri = (Uri) obj;
                if (!vj.d(i, i2)) {
                    return null;
                }
                blo bloVar = new blo(uri);
                Context context = this.a;
                return new bff(bloVar, bav.b(context, uri, new bat(context.getContentResolver())));
            case 1:
                Uri uri2 = (Uri) obj;
                return new bff(new blo(uri2), new bfa(this.a, uri2));
            default:
                Uri uri3 = (Uri) obj;
                if (!vj.d(i, i2) || (l = (Long) aztVar.b(bif.a)) == null || l.longValue() != -1) {
                    return null;
                }
                blo bloVar2 = new blo(uri3);
                Context context2 = this.a;
                return new bff(bloVar2, bav.b(context2, uri3, new bau(context2.getContentResolver())));
        }
    }

    @Override // defpackage.bfg
    public final /* synthetic */ boolean b(Object obj) {
        switch (this.b) {
            case 0:
                Uri uri = (Uri) obj;
                return vj.c(uri) && !vj.e(uri);
            case 1:
                return vj.c((Uri) obj);
            default:
                Uri uri2 = (Uri) obj;
                return vj.c(uri2) && vj.e(uri2);
        }
    }
}
