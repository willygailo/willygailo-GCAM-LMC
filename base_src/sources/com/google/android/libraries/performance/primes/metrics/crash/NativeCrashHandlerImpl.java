package com.google.android.libraries.performance.primes.metrics.crash;

import defpackage.mye;
import defpackage.myi;
import defpackage.myj;
import defpackage.ojc;
import defpackage.oug;
import defpackage.ouj;
import defpackage.pos;
import defpackage.poy;
import defpackage.ppd;
import defpackage.ptg;
import defpackage.qkg;
import defpackage.qxy;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final class NativeCrashHandlerImpl implements myj {
    private static final ouj c = ouj.h("com/google/android/libraries/performance/primes/metrics/crash/NativeCrashHandlerImpl");
    final CountDownLatch a = new CountDownLatch(1);
    final CountDownLatch b = new CountDownLatch(1);
    private boolean d;
    private final ojc e;

    public NativeCrashHandlerImpl(ojc ojcVar) {
        this.e = ojcVar;
    }

    private static native ByteBuffer awaitSignal();

    private static native boolean initializeSignalHandler();

    private static native void unblockSignalHandler();

    @Override // defpackage.myj
    public final synchronized void a(final mye myeVar) {
        if (this.d) {
            return;
        }
        this.d = true;
        Thread thread = new Thread(new Runnable() { // from class: myk
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b(myeVar);
            }
        }, "Primes-nativecrash-sidecar");
        thread.setDaemon(true);
        thread.setPriority(10);
        thread.start();
    }

    public final /* synthetic */ void b(mye myeVar) {
        if (this.e.g() && !((Boolean) ((qkg) this.e.c()).get()).booleanValue()) {
            this.b.countDown();
            return;
        }
        try {
            System.loadLibrary("native_crash_handler_jni");
            if (!initializeSignalHandler()) {
                ((oug) ((oug) c.c()).G((char) 3625)).o("unable to initialize signal handler");
                return;
            }
            try {
                this.a.countDown();
                ByteBuffer byteBufferAwaitSignal = awaitSignal();
                ptg ptgVar = null;
                if (byteBufferAwaitSignal != null) {
                    try {
                        ptgVar = (ptg) ppd.r(ptg.a, byteBufferAwaitSignal, pos.a());
                    } catch (Throwable th) {
                    }
                }
                poy poyVarG = ((myi) myeVar).g();
                if (poyVarG.c) {
                    poyVarG.m();
                    poyVarG.c = false;
                }
                qxy qxyVar = (qxy) poyVarG.b;
                qxy qxyVar2 = qxy.j;
                qxyVar.f = 5;
                int i = qxyVar.a | 16;
                qxyVar.a = i;
                if (ptgVar != null) {
                    qxyVar.i = ptgVar;
                    qxyVar.a = i | 512;
                }
                ((myi) myeVar).e((qxy) poyVarG.j());
            } finally {
                unblockSignalHandler();
            }
        } catch (UnsatisfiedLinkError e) {
            ((oug) ((oug) ((oug) c.c()).h(e)).G((char) 3626)).o("unable to load native_crash_handler_jni");
        }
    }
}
