package defpackage;

import java.io.File;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hfx implements Runnable {
    public final /* synthetic */ hfy a;
    private final /* synthetic */ int b;

    public /* synthetic */ hfx(hfy hfyVar, int i) {
        this.b = i;
        this.a = hfyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        switch (this.b) {
            case 0:
                hfy hfyVar = this.a;
                hfyVar.h.lock();
                try {
                    if (hfyVar.g) {
                        hfyVar.f.unload();
                        break;
                    }
                    return;
                } finally {
                    hfyVar.h.unlock();
                }
            case 1:
                hfy hfyVar2 = this.a;
                hfyVar2.h.lock();
                try {
                    if (hfyVar2.g) {
                        reentrantLock = hfyVar2.h;
                    } else {
                        ojc ojcVarB = ((fsr) hfyVar2.e).b();
                        if (hfyVar2.f.initPortraitRelightingProcessor(ojcVarB.g() ? ((File) ojcVarB.c()).getAbsolutePath() : "", hfyVar2.d, hfyVar2.c.k(ddx.u), hfyVar2.f(hfyVar2.b, "face_light_256_256.tflite.enc", "5BE6E9624DF061E5416D4D1D6215D6E6"), hfyVar2.f(hfyVar2.b, "face_model_468.xnft.enc", "DB22B14BAADB4BEB2FF3FE1205232CB2"), hfyVar2.f(hfyVar2.b, "facedetector-front.tflite.enc", "F25FB5752634BA2183D9A16FA878F60A"), hfyVar2.f(hfyVar2.b, "facemesh-full.tflite.enc", "606B34134C93CF8298025B58B6846736"), hfyVar2.f(hfyVar2.b, "ffv6_holo040820_normals_net_mixed_fp16_256_256.tflite.enc", "8EE4D0F472BB7FF0B259F3841B1EE273"), hfyVar2.f(hfyVar2.b, "ffv6_holo040820_relighting_net_mixed_fp16_256_256.tflite.enc", "E6BE4D7010D31926961DE0E45705C754"))) {
                            hfyVar2.g = true;
                            reentrantLock = hfyVar2.h;
                        } else {
                            ((oug) ((oug) hfy.a.b()).G(2437)).o("Unable to initialize Firefly Processor.");
                            reentrantLock = hfyVar2.h;
                        }
                    }
                    reentrantLock.unlock();
                    return;
                } catch (Throwable th) {
                    hfyVar2.h.unlock();
                    throw th;
                }
            default:
                hfy hfyVar3 = this.a;
                hfyVar3.h.lock();
                try {
                    if (hfyVar3.g) {
                        hfyVar3.f.reload();
                        break;
                    }
                    return;
                } finally {
                    hfyVar3.h.unlock();
                }
        }
    }
}
