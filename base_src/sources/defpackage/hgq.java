package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.Trace;
import com.google.android.apps.camera.prewarm.ProcessingBoostService;

/* JADX INFO: loaded from: classes2.dex */
public final class hgq extends Handler {
    final /* synthetic */ ProcessingBoostService a;

    public hgq(ProcessingBoostService processingBoostService) {
        this.a = processingBoostService;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                ProcessingBoostService processingBoostService = this.a;
                if (processingBoostService.b == null) {
                    Trace.beginSection("PBS#ensureInjection");
                    ((hgr) ((enc) processingBoostService.getApplication()).c(hgr.class)).p(processingBoostService);
                    Trace.endSection();
                }
                this.a.b.execute(new Runnable() { // from class: hgp
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a.a.a();
                    }
                });
                break;
        }
        super.handleMessage(message);
    }
}
