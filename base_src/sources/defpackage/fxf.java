package defpackage;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class fxf {
    public final brc a;
    public final qkg b;
    public final pyn c;
    public final DialogInterface.OnClickListener d = new fxe(this);
    public final ikm e;
    private final ilu f;
    private final lar g;
    private final ilx h;

    public fxf(ikm ikmVar, brc brcVar, ilx ilxVar, ilu iluVar, qkg qkgVar, pyn pynVar, lar larVar) {
        this.a = brcVar;
        this.e = ikmVar;
        this.h = ilxVar;
        this.f = iluVar;
        this.b = qkgVar;
        this.c = pynVar;
        this.g = larVar;
    }

    public final void a() {
        mip.ca(this.h.a(), new lht() { // from class: fxd
            @Override // defpackage.lht
            public final void a(Object obj) {
                fxf fxfVar = this.a;
                ilv ilvVar = (ilv) obj;
                obr.ao(ilvVar);
                if (!ilvVar.b()) {
                    fxfVar.e.b(fxfVar.d).show();
                } else {
                    ((ilq) fxfVar.b.get()).e(ilvVar);
                    ((ilo) fxfVar.c.get()).c(ilvVar);
                }
            }
        }, this.g);
    }

    public final void b() {
        ilu iluVar = this.f;
        iluVar.b = ilv.a;
        ilx ilxVar = iluVar.c;
    }
}
