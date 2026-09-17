package defpackage;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class khv {
    static final kht a;
    static final kht b;
    private static Context c;

    static {
        new kho(kmz.e("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new khp(kmz.e("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        a = new khq(kmz.e("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        b = new khr(kmz.e("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    }

    static synchronized void a(Context context) {
        if (c != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else {
            if (context != null) {
                c = context.getApplicationContext();
            }
        }
    }
}
