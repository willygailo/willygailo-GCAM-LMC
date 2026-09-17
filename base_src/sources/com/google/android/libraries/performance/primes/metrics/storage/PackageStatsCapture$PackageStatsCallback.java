package com.google.android.libraries.performance.primes.metrics.storage;

import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageStats;
import defpackage.nbg;
import defpackage.oug;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
final class PackageStatsCapture$PackageStatsCallback extends IPackageStatsObserver.Stub {
    private final Semaphore a = new Semaphore(1);
    private volatile PackageStats b;

    private PackageStatsCapture$PackageStatsCallback() {
    }

    public void onGetStatsCompleted(PackageStats packageStats, boolean z) {
        if (z) {
            this.b = packageStats;
        } else {
            ((oug) ((oug) nbg.a.c()).G((char) 3653)).o("Failure getting PackageStats");
        }
        this.a.release();
    }
}
