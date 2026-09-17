package defpackage;

import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class atv {
    public int a = 0;

    public atv() {
    }

    public atv(int i) throws ass {
        b(i);
        g(i);
    }

    private final void b(int i) throws ass {
        int iA = (a() ^ (-1)) & i;
        if (iA == 0) {
            e(i);
            return;
        }
        String hexString = Integer.toHexString(iA);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 33);
        sb.append("The option bit(s) 0x");
        sb.append(hexString);
        sb.append(" are invalid!");
        throw new ass(sb.toString(), R.styleable.AppCompatTheme_textAppearanceListItem);
    }

    protected abstract int a();

    protected void e(int i) {
    }

    public final boolean equals(Object obj) {
        return this.a == ((atv) obj).a;
    }

    public final void f(int i, boolean z) {
        int i2;
        if (z) {
            i2 = i | this.a;
        } else {
            i2 = (i ^ (-1)) & this.a;
        }
        this.a = i2;
    }

    public final void g(int i) throws ass {
        b(i);
        this.a = i;
    }

    public final boolean h(int i) {
        return (i & this.a) != 0;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.a));
        return strValueOf.length() != 0 ? "0x".concat(strValueOf) : new String("0x");
    }
}
