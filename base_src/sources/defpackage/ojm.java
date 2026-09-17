package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ojm extends oii {
    final /* synthetic */ ojn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojm(ojn ojnVar, ojq ojqVar, CharSequence charSequence) {
        super(ojqVar, charSequence);
        this.f = ojnVar;
    }

    @Override // defpackage.oii
    public final int a(int i) {
        return i + this.f.a.length();
    }

    @Override // defpackage.oii
    public final int b(int i) {
        int length = this.f.a.length();
        int length2 = this.b.length() - length;
        while (i <= length2) {
            for (int i2 = 0; i2 < length; i2++) {
                if (this.b.charAt(i2 + i) != this.f.a.charAt(i2)) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }
}
