package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppb extends ppd implements pqn {
    public pou h = pou.a;

    public final pou i() {
        pou pouVar = this.h;
        if (pouVar.c) {
            this.h = pouVar.clone();
        }
        return this.h;
    }

    public final void j(poq poqVar) {
        if (poqVar.a != ((ppd) G(6))) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }
}
