package defpackage;

import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes2.dex */
public final class nbt implements mwi {
    private final int a;
    private final boolean b;
    private final int c;
    private final myw d;

    public nbt() {
    }

    public nbt(int i, myw mywVar, boolean z, byte[] bArr, byte[] bArr2) {
        this.c = 2;
        this.a = i;
        this.d = mywVar;
        this.b = z;
    }

    @Override // defpackage.mwi
    public final int a() {
        return this.a;
    }

    @Override // defpackage.mwi
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nbt)) {
            return false;
        }
        nbt nbtVar = (nbt) obj;
        int i = this.c;
        int i2 = nbtVar.c;
        if (i != 0) {
            return i == i2 && this.a == nbtVar.a && this.d.equals(nbtVar.d) && this.b == nbtVar.b;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.c;
        mwj.b(i);
        return ((((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String strA = mwj.a(this.c);
        int i = this.a;
        String strValueOf = String.valueOf(this.d);
        boolean z = this.b;
        int length = strA.length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_tooltipForegroundColor + String.valueOf(strValueOf).length());
        sb.append("TikTokTraceConfigurations{enablement=");
        sb.append(strA);
        sb.append(", rateLimitPerSecond=");
        sb.append(i);
        sb.append(", dynamicSampler=");
        sb.append(strValueOf);
        sb.append(", recordTimerDuration=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
