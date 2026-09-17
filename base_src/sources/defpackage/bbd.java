package defpackage;

import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class bbd implements bbh, bab {
    private final List a;
    private final bbi b;
    private final bbg c;
    private int d = -1;
    private azp e;
    private List f;
    private int g;
    private volatile bff h;
    private File i;

    public bbd(List list, bbi bbiVar, bbg bbgVar) {
        this.a = list;
        this.b = bbiVar;
        this.c = bbgVar;
    }

    private final boolean d() {
        return this.g < this.f.size();
    }

    @Override // defpackage.bbh
    public final void a() {
        bff bffVar = this.h;
        if (bffVar != null) {
            bffVar.c.fu();
        }
    }

    @Override // defpackage.bab
    public final void b(Object obj) {
        this.c.e(this.e, obj, this.h.c, 3, this.e);
    }

    @Override // defpackage.bbh
    public final boolean c() {
        while (true) {
            boolean z = false;
            if (this.f != null && d()) {
                this.h = null;
                while (!z && d()) {
                    List list = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    bfg bfgVar = (bfg) list.get(i);
                    File file = this.i;
                    bbi bbiVar = this.b;
                    this.h = bfgVar.a(file, bbiVar.e, bbiVar.f, bbiVar.h);
                    if (this.h != null && this.b.h(this.h.c.a())) {
                        this.h.c.f(this.b.n, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= this.a.size()) {
                return false;
            }
            azp azpVar = (azp) this.a.get(this.d);
            File fileA = this.b.d().a(new bbe(azpVar, this.b.m));
            this.i = fileA;
            if (fileA != null) {
                this.e = azpVar;
                this.f = this.b.g(fileA);
                this.g = 0;
            }
        }
    }

    @Override // defpackage.bab
    public final void e(Exception exc) {
        this.c.d(this.e, exc, this.h.c, 3);
    }
}
