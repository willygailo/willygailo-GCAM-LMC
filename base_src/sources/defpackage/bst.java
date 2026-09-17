package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bst implements brx {
    public final lda a = new lce(0);
    public final lda b = new lce(false);
    private final htp c;
    private final ddf d;
    private final lda e;

    public bst(htp htpVar, ddf ddfVar, lda ldaVar) {
        this.c = htpVar;
        this.d = ddfVar;
        this.e = ldaVar;
    }

    @Override // defpackage.brx
    public final lco a() {
        return lcv.d(this.b, this.e);
    }

    @Override // defpackage.brx
    public final lda b() {
        return this.a;
    }

    @Override // defpackage.brx
    public final boolean c() {
        throw null;
    }

    final bss d(lvs lvsVar) {
        htp htpVar = this.c;
        String strValueOf = String.valueOf(lvsVar.a);
        return new bss(htpVar.c(strValueOf.length() != 0 ? "pref_camera_dirty_lens_history_key".concat(strValueOf) : new String("pref_camera_dirty_lens_history_key"), ""), this.d);
    }
}
