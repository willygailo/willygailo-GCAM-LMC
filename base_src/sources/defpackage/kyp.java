package defpackage;

import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class kyp extends kzl {
    private final WeakReference a;
    private final WeakReference b;

    public kyp(Map map, Object obj, kjj kjjVar) {
        super(kjjVar);
        this.a = new WeakReference(map);
        this.b = new WeakReference(obj);
    }

    @Override // defpackage.kyj
    public final void e(Status status) {
        Map map = (Map) this.a.get();
        Object obj = this.b.get();
        if (!status.b() && map != null && obj != null) {
            synchronized (map) {
                kzs kzsVar = (kzs) map.remove(obj);
                if (kzsVar != null) {
                    kzsVar.l();
                }
            }
        }
        f(status);
    }
}
