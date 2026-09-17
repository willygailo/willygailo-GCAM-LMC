package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class hik implements hgz {
    public static final ouj a = ouj.h("com/google/android/apps/camera/processing/imagebackend/ImageShadowTaskImpl");
    private static final ExecutorService d = mip.bJ("ImgShadowTask");
    public final hgy b;
    public final Runnable c;
    private final hsa e;

    public hik(hgy hgyVar, hsa hsaVar, ojc ojcVar) {
        this.b = hgyVar;
        this.e = hsaVar;
        this.c = (Runnable) ojcVar.f();
    }

    public hik(hsa hsaVar) {
        hgy hgyVar = new hgy();
        hgyVar.e(1);
        this(hgyVar, hsaVar, oih.a);
    }

    @Override // defpackage.hhn
    public final /* synthetic */ hhm a() {
        return this.e;
    }

    @Override // defpackage.hhn
    public final String b() {
        String strValueOf = String.valueOf(this.e.h());
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 16);
        sb.append("ImageShadowTask-");
        sb.append(strValueOf);
        return sb.toString();
    }

    @Override // defpackage.hhn
    public final void c(lht lhtVar) {
        throw new RuntimeException("Not implemented yet");
    }

    @Override // defpackage.hhn
    public final void d(Context context) {
        hgy hgyVar;
        try {
            d.submit(new Runnable() { // from class: hij
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        this.a.b.c();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        ((oug) ((oug) ((oug) hik.a.c()).h(e)).G((char) 2481)).o("ImageShadowTask failed because it was interrupted.");
                    }
                }
            }, null).get(5L, TimeUnit.MINUTES);
            hgyVar = this.b;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            ((oug) ((oug) ((oug) a.c()).h(e)).G(2484)).o("ImageShadowTask failed because the future was interrupted.");
            hgyVar = this.b;
        } catch (ExecutionException e2) {
            ((oug) ((oug) ((oug) a.c()).h(e2)).G(2482)).o("ImageShadowTask failed to complete.");
            hgyVar = this.b;
        } catch (TimeoutException e3) {
            ((oug) ((oug) a.c()).G(2483)).o("ImageShadowTask failed to complete after 5 minutes.");
            hgyVar = this.b;
        } finally {
            this.b.e(0);
            this.b.d();
        }
        hgyVar.e(0);
    }

    @Override // defpackage.hhn
    public final void e(lht lhtVar) {
        throw new RuntimeException("Not implemented yet");
    }

    @Override // defpackage.hhn
    public final void f() {
    }

    @Override // defpackage.hhn
    public final void g() {
    }

    @Override // defpackage.hgz
    public final void h() {
        this.b.e(0);
        this.b.d();
    }
}
