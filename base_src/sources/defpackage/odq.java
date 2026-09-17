package defpackage;

import com.google.android.odml.image.ImageProperties;

/* JADX INFO: loaded from: classes2.dex */
final class odq extends odp {
    private volatile transient int c;
    private volatile transient boolean d;

    public odq(int i, int i2) {
        super(i, i2);
    }

    @Override // defpackage.odp
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odq) || hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof ImageProperties)) {
                return false;
            }
            ImageProperties imageProperties = (ImageProperties) obj;
            if (this.a != imageProperties.a() || this.b != imageProperties.b()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.odp
    public final int hashCode() {
        if (!this.d) {
            synchronized (this) {
                if (!this.d) {
                    this.c = ((this.a ^ 1000003) * 1000003) ^ this.b;
                    this.d = true;
                }
            }
        }
        return this.c;
    }
}
