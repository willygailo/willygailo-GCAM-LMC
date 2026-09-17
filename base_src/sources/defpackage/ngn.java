package defpackage;

import android.util.Base64;

/* JADX INFO: loaded from: classes2.dex */
public final class ngn {
    private final String a;
    private final boolean b;
    private final boolean c;

    public ngn(String str) {
        this(str, false, false);
    }

    private ngn(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final ngi a(String str, long j) {
        return new ngi(this.a, str, Long.valueOf(j), new nfg(this.b, this.c, ngj.c, new ngl(Long.class, 0)));
    }

    public final ngi b(String str, boolean z) {
        return new ngi(this.a, str, Boolean.valueOf(z), new nfg(this.b, this.c, ngj.a, new ngl(Boolean.class, 1)));
    }

    public final ngi c(String str, Object obj, final ngm ngmVar) {
        final int i = 0;
        final int i2 = 1;
        return new ngi(this.a, str, obj, new nfg(this.b, this.c, new ngm() { // from class: ngk
            @Override // defpackage.ngm
            public final Object a(Object obj2) {
                switch (i) {
                    case 0:
                        return ngmVar.a(Base64.decode((String) obj2, 3));
                    default:
                        return ngmVar.a((byte[]) obj2);
                }
            }
        }, new ngm() { // from class: ngk
            @Override // defpackage.ngm
            public final Object a(Object obj2) {
                switch (i2) {
                    case 0:
                        return ngmVar.a(Base64.decode((String) obj2, 3));
                    default:
                        return ngmVar.a((byte[]) obj2);
                }
            }
        }));
    }

    public final ngn d() {
        return new ngn(this.a, true, this.c);
    }

    public final ngn e() {
        return new ngn(this.a, this.b, true);
    }

    public final void f(String str, String str2) {
        new ngi(this.a, str, str2, new nfg(this.b, this.c, ngj.b, new ngl(String.class, 2)));
    }
}
