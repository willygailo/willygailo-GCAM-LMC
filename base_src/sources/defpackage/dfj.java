package defpackage;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class dfj {
    public final ImageView a;
    public final ImageView b;
    public final ImageView c;

    public dfj() {
    }

    public dfj(ImageView imageView, ImageView imageView2, ImageView imageView3) {
        if (imageView == null) {
            throw new NullPointerException("Null contentView");
        }
        this.a = imageView;
        if (imageView2 == null) {
            throw new NullPointerException("Null playButton");
        }
        this.b = imageView2;
        if (imageView3 == null) {
            throw new NullPointerException("Null photoSphereBadge");
        }
        this.c = imageView3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dfj) {
            dfj dfjVar = (dfj) obj;
            if (this.a.equals(dfjVar.a) && this.b.equals(dfjVar.b) && this.c.equals(dfjVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        int length = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length());
        sb.append("ContentViewHolder{contentView=");
        sb.append(strValueOf);
        sb.append(", playButton=");
        sb.append(strValueOf2);
        sb.append(", photoSphereBadge=");
        sb.append(strValueOf3);
        sb.append("}");
        return sb.toString();
    }
}
