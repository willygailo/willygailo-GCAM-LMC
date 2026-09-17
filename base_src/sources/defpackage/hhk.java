package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.camera.processing.ProcessingService;

/* JADX INFO: loaded from: classes2.dex */
public final class hhk extends BroadcastReceiver {
    final /* synthetic */ ProcessingService a;

    public hhk(ProcessingService processingService) {
        this.a = processingService;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.apps.camera.legacy.app.processing.PAUSE".equals(intent.getAction())) {
            ProcessingService processingService = this.a;
            synchronized (processingService.f) {
                processingService.g = false;
            }
            synchronized (processingService.b) {
                processingService.e = true;
                hhn hhnVar = processingService.d;
                if (hhnVar != null) {
                    hhnVar.g();
                }
            }
            return;
        }
        if ("com.google.android.apps.camera.legacy.app.processing.RESUME".equals(intent.getAction())) {
            ProcessingService processingService2 = this.a;
            synchronized (processingService2.f) {
                processingService2.g = true;
            }
            synchronized (processingService2.b) {
                processingService2.e = false;
                hhn hhnVar2 = processingService2.d;
                if (hhnVar2 != null) {
                    hhnVar2.f();
                }
            }
        }
    }
}
