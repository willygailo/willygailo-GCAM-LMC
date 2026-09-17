package com.google.android.apps.camera.prewarm;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import defpackage.eah;
import defpackage.hgq;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class ProcessingBoostService extends Service {
    public eah a;
    public Executor b;
    private final Messenger c = new Messenger(new hgq(this));

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.c.getBinder();
    }
}
