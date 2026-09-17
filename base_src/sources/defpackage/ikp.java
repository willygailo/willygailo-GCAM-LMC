package defpackage;

import android.util.LruCache;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ikp {
    public static final ouj a = ouj.h("com/google/android/apps/camera/storage/module/StorageImpl");
    public final LruCache b = new iko();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();

    public final ojc a(hsp hspVar) {
        return ojc.h((bik) this.b.get(hspVar));
    }
}
