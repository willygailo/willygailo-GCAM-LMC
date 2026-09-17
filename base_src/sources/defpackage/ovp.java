package defpackage;

import com.google.android.apps.camera.bottombar.R;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ovp implements ovc {
    private static final Set d = new HashSet(Arrays.asList(Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class));
    public final StringBuilder b;
    public boolean c = false;
    private final String e = "[CONTEXT ";
    public final String a = " ]";

    public ovp(StringBuilder sb) {
        this.b = sb;
    }

    private static int b(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt < ' ' || cCharAt == '\"' || cCharAt == '\\') {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // defpackage.ovc
    public final void a(String str, Object obj) {
        char c = ' ';
        if (this.c) {
            this.b.append(' ');
        } else {
            if (this.b.length() > 0) {
                StringBuilder sb = this.b;
                if (sb.length() > 1000 || this.b.indexOf("\n") != -1) {
                    c = '\n';
                }
                sb.append(c);
            }
            this.b.append(this.e);
            this.c = true;
        }
        StringBuilder sb2 = this.b;
        sb2.append(str);
        sb2.append('=');
        if (obj == null) {
            sb2.append(true);
            return;
        }
        if (d.contains(obj.getClass())) {
            sb2.append(obj);
            return;
        }
        sb2.append('\"');
        String string = obj.toString();
        int i = 0;
        while (true) {
            int iB = b(string, i);
            if (iB == -1) {
                sb2.append((CharSequence) string, i, string.length());
                sb2.append('\"');
                return;
            }
            sb2.append((CharSequence) string, i, iB);
            i = iB + 1;
            char cCharAt = string.charAt(iB);
            switch (cCharAt) {
                case '\t':
                    cCharAt = 't';
                    break;
                case '\n':
                    cCharAt = 'n';
                    break;
                case '\r':
                    cCharAt = 'r';
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                    break;
                default:
                    sb2.append((char) 65533);
                    continue;
            }
            sb2.append("\\");
            sb2.append(cCharAt);
        }
    }
}
