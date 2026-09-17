package defpackage;

import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes2.dex */
public final class mkg {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;

    public mkg() {
    }

    public mkg(int i, boolean z, boolean z2, int i2, int i3) {
        this.c = i;
        this.a = z;
        this.b = z2;
        this.d = i2;
        this.e = i3;
    }

    public static mkf a() {
        mkf mkfVar = new mkf();
        mkfVar.c = 2;
        mkfVar.a = false;
        mkfVar.b = false;
        mkfVar.d = 1;
        mkfVar.b();
        return mkfVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mkg)) {
            return false;
        }
        mkg mkgVar = (mkg) obj;
        int i = this.c;
        int i2 = mkgVar.c;
        if (i == 0) {
            throw null;
        }
        if (i == i2 && this.a == mkgVar.a && this.b == mkgVar.b) {
            int i3 = this.d;
            int i4 = mkgVar.d;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == 1) {
                int i5 = this.e;
                int i6 = mkgVar.e;
                if (i5 == 0) {
                    throw null;
                }
                if (i5 == i6) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            throw null;
        }
        int i2 = (((((i ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ (true == this.b ? 1231 : 1237)) * 1000003;
        if (this.d == 0) {
            throw null;
        }
        int i3 = (i2 ^ 1) * 1000003;
        int i4 = this.e;
        if (i4 != 0) {
            return i3 ^ i4;
        }
        throw null;
    }

    public final String toString() {
        String str;
        String str2;
        String str3 = "null";
        switch (this.c) {
            case 1:
                str = "DUPLICATE_PREV_DURATION";
                break;
            case 2:
                str = "INSERT_SHORT_FRAME";
                break;
            default:
                str = "null";
                break;
        }
        boolean z = this.a;
        boolean z2 = this.b;
        switch (this.d) {
            case 1:
                str2 = "MP4";
                break;
            default:
                str2 = "null";
                break;
        }
        switch (this.e) {
            case 1:
                str3 = "FRAGMENTED";
                break;
            case 2:
                str3 = "ROBUST";
                break;
        }
        int length = str.length();
        int length2 = str2.length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowNoTitle + length2 + str3.length());
        sb.append("CameraMp4MuxerOptions{lastFrameDurationBehavior=");
        sb.append(str);
        sb.append(", editsEnabled=");
        sb.append(z);
        sb.append(", dynamicFtypEnabled=");
        sb.append(z2);
        sb.append(", mainFileBrand=");
        sb.append(str2);
        sb.append(", mp4MuxerType=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
