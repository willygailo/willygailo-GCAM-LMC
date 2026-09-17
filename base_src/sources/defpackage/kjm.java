package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kjm extends LifecycleCallback implements DialogInterface.OnCancelListener {
    protected volatile boolean a;
    protected final AtomicReference b;
    public final Handler c;
    protected final khm d;

    public kjm(kkn kknVar, khm khmVar) {
        super(kknVar);
        this.b = new AtomicReference(null);
        this.c = new ksg(Looper.getMainLooper());
        this.d = khmVar;
    }

    private static final int k(kjk kjkVar) {
        if (kjkVar == null) {
            return -1;
        }
        return kjkVar.a;
    }

    public final void a(khi khiVar, int i) {
        this.b.set(null);
        e(khiVar, i);
    }

    public final void b() {
        this.b.set(null);
        f();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void c(int i, int i2, Intent intent) {
        kjk kjkVar = (kjk) this.b.get();
        switch (i) {
            case 1:
                if (i2 == -1) {
                    b();
                    return;
                } else if (i2 == 0) {
                    if (kjkVar == null) {
                        return;
                    }
                    a(new khi(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, kjkVar.b.toString()), k(kjkVar));
                    return;
                }
            case 2:
                int iE = this.d.e(l());
                if (iE == 0) {
                    b();
                    return;
                } else {
                    if (kjkVar == null) {
                        return;
                    }
                    if (kjkVar.b.c == 18 && iE == 18) {
                        return;
                    }
                }
        }
        if (kjkVar != null) {
            a(kjkVar.b, kjkVar.a);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void d(Bundle bundle) {
        if (bundle != null) {
            this.b.set(bundle.getBoolean("resolving_error", false) ? new kjk(new khi(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    protected abstract void e(khi khiVar, int i);

    protected abstract void f();

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void g(Bundle bundle) {
        kjk kjkVar = (kjk) this.b.get();
        if (kjkVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", kjkVar.a);
        bundle.putInt("failed_status", kjkVar.b.c);
        bundle.putParcelable("failed_resolution", kjkVar.b.d);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a(new khi(13, null), k((kjk) this.b.get()));
    }
}
