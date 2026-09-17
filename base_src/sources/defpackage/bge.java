package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class bge implements bfg {
    private final bfg a;
    private final /* synthetic */ int b;

    public bge(bfg bfgVar, int i) {
        this.b = i;
        this.a = bfgVar;
    }

    private static Uri c(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // defpackage.bfg
    public final /* synthetic */ bff a(Object obj, int i, int i2, azt aztVar) {
        Uri uriC;
        switch (this.b) {
            case 0:
                return this.a.a(new bev((URL) obj), i, i2, aztVar);
            default:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriC = null;
                } else if (str.charAt(0) == '/') {
                    uriC = c(str);
                } else {
                    Uri uri = Uri.parse(str);
                    uriC = uri.getScheme() == null ? c(str) : uri;
                }
                if (uriC == null || !this.a.b(uriC)) {
                    return null;
                }
                return this.a.a(uriC, i, i2, aztVar);
        }
    }

    @Override // defpackage.bfg
    public final /* synthetic */ boolean b(Object obj) {
        switch (this.b) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
