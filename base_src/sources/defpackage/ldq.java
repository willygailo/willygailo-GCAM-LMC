package defpackage;

import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ldq implements phh {
    final /* synthetic */ ldv a;
    private final /* synthetic */ int b;

    public ldq(ldv ldvVar, int i) {
        this.b = i;
        this.a = ldvVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        switch (this.b) {
            case 0:
                Iterator it = Collections.unmodifiableCollection(this.a.c).iterator();
                while (it.hasNext()) {
                    ((ldo) it.next()).a(new IllegalStateException("Fail to stop", th));
                }
                break;
            default:
                Iterator it2 = Collections.unmodifiableCollection(this.a.c).iterator();
                while (it2.hasNext()) {
                    ((ldo) it2.next()).a(new IllegalStateException("Fail to start", th));
                }
                break;
        }
    }

    @Override // defpackage.phh
    public final /* synthetic */ void b(Object obj) {
        switch (this.b) {
            case 0:
                Iterator it = Collections.unmodifiableCollection(this.a.c).iterator();
                while (it.hasNext()) {
                    ((ldo) it.next()).e();
                }
                break;
            default:
                Iterator it2 = Collections.unmodifiableCollection(this.a.c).iterator();
                while (it2.hasNext()) {
                    ((ldo) it2.next()).d();
                }
                break;
        }
    }
}
