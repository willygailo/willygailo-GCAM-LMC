package defpackage;

import com.google.android.apps.camera.bottombar.R;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class oej extends ofj {
    public oej(int i) {
        String string;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i);
        Map map = oek.a;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf) && oek.b.containsKey(numValueOf)) {
            String str = (String) oek.a.get(numValueOf);
            String str2 = (String) oek.b.get(numValueOf);
            int length = String.valueOf(str).length();
            StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_textAppearanceListItem + String.valueOf(str2).length());
            sb.append(str);
            sb.append(" (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#");
            sb.append(str2);
            sb.append(")");
            string = sb.toString();
        } else {
            string = "";
        }
        objArr[1] = string;
        super(String.format("Install Error(%d): %s", objArr));
        if (i == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
