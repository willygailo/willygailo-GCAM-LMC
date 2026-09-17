package defpackage;

import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes.dex */
public final class bce implements bcl {
    public final boolean a;
    private final bcl b;
    private final azp c;
    private int d;
    private boolean e;
    private final bby f;

    public bce(bcl bclVar, boolean z, azp azpVar, bby bbyVar) {
        aae.s(bclVar);
        this.b = bclVar;
        this.a = z;
        this.c = azpVar;
        aae.s(bbyVar);
        this.f = bbyVar;
    }

    @Override // defpackage.bcl
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.bcl
    public final Class b() {
        return this.b.b();
    }

    @Override // defpackage.bcl
    public final Object c() {
        return this.b.c();
    }

    public final synchronized void d() {
        if (this.e) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.d++;
    }

    @Override // defpackage.bcl
    public final synchronized void e() {
        if (this.d > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.e) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.e = true;
        this.b.e();
    }

    public final void f() {
        int i;
        synchronized (this) {
            int i2 = this.d;
            if (i2 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            i = i2 - 1;
            this.d = i;
        }
        if (i == 0) {
            bby bbyVar = this.f;
            azp azpVar = this.c;
            bbyVar.e.d(azpVar);
            if (this.a) {
                bbyVar.f.d(azpVar, this);
            } else {
                bbyVar.c.a(this, false);
            }
        }
    }

    public final synchronized String toString() {
        StringBuilder sb;
        boolean z = this.a;
        String strValueOf = String.valueOf(this.f);
        String strValueOf2 = String.valueOf(this.c);
        int i = this.d;
        boolean z2 = this.e;
        String strValueOf3 = String.valueOf(this.b);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        sb = new StringBuilder(length + R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle + length2 + String.valueOf(strValueOf3).length());
        sb.append("EngineResource{isMemoryCacheable=");
        sb.append(z);
        sb.append(", listener=");
        sb.append(strValueOf);
        sb.append(", key=");
        sb.append(strValueOf2);
        sb.append(", acquired=");
        sb.append(i);
        sb.append(", isRecycled=");
        sb.append(z2);
        sb.append(", resource=");
        sb.append(strValueOf3);
        sb.append('}');
        return sb.toString();
    }
}
