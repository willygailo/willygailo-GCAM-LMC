package defpackage;

import com.google.android.odml.image.ImageProperties;

/* JADX INFO: loaded from: classes2.dex */
public final class odo extends ImageProperties.Builder {
    private Integer a;
    private Integer b;

    final ImageProperties build() {
        Integer num = this.a;
        if (num != null && this.b != null) {
            return new odq(num.intValue(), this.b.intValue());
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" imageFormat");
        }
        if (this.b == null) {
            sb.append(" storageType");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    final ImageProperties.Builder setImageFormat(int i) {
        this.a = Integer.valueOf(i);
        return this;
    }

    final ImageProperties.Builder setStorageType(int i) {
        this.b = Integer.valueOf(i);
        return this;
    }
}
