package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ojk extends oii {
    final /* synthetic */ ojl f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojk(ojl ojlVar, ojq ojqVar, CharSequence charSequence) {
        super(ojqVar, charSequence);
        this.f = ojlVar;
    }

    @Override // defpackage.oii
    public final int a(int i) {
        return i + 1;
    }

    @Override // defpackage.oii
    public final int b(int i) {
        return this.f.a.c(this.b, i);
    }
}
