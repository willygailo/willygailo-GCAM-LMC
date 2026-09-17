package defpackage;

import android.content.Context;
import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bqt {
    public final hug a;
    public final Map b = new ArrayMap();
    public final String[] c;
    public final String[] d;
    private final Context e;
    private final String[] f;

    public bqt(Context context, hug hugVar) {
        String[] strArr = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
        this.d = strArr;
        String[] strArr2 = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        this.f = strArr2;
        this.e = context;
        this.a = hugVar;
        String[] strArr3 = new String[6];
        this.c = strArr3;
        System.arraycopy(strArr2, 0, strArr3, 0, 4);
        System.arraycopy(strArr, 0, strArr3, 4, 2);
    }

    public final boolean a(String str) {
        return this.e.checkSelfPermission(str) == 0;
    }

    final boolean b() {
        String[] strArr = this.f;
        for (int i = 0; i < 4; i++) {
            String str = strArr[i];
            if (!this.b.containsKey(str) || !((Boolean) this.b.get(str)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    final boolean c() {
        if (this.b.containsKey("android.permission.ACCESS_FINE_LOCATION") && ((Boolean) this.b.get("android.permission.ACCESS_FINE_LOCATION")).booleanValue()) {
            return true;
        }
        return this.b.containsKey("android.permission.ACCESS_COARSE_LOCATION") && ((Boolean) this.b.get("android.permission.ACCESS_COARSE_LOCATION")).booleanValue();
    }
}
