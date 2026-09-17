package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class mme extends mmf {
    public mme(int i, int i2) {
        super(new int[]{i, i2});
    }

    @Override // defpackage.mmf
    public final String toString() {
        return String.format(Locale.ENGLISH, "Size(%d, %d)", Integer.valueOf(b()), Integer.valueOf(a()));
    }
}
