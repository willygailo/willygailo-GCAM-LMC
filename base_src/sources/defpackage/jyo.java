package defpackage;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.SurfaceView;
import j$.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jyo implements Runnable {
    public final /* synthetic */ jyq a;
    private final /* synthetic */ int b;

    public /* synthetic */ jyo(jyq jyqVar, int i) {
        this.b = i;
        this.a = jyqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        float f;
        Bitmap bitmap;
        switch (this.b) {
            case 0:
                this.a.j.d("/support_feature_version", jye.a());
                return;
            case 1:
                jyq jyqVar = this.a;
                if (!jyqVar.j.c() || jyqVar.j.a() == null) {
                    return;
                }
                if (((Boolean) jyqVar.k.fA()).booleanValue()) {
                    jyqVar.l.f("Already fired promote launch wear notification, ignore.");
                    return;
                }
                jyqVar.j.d("/notify_wear", null);
                jyqVar.k.fB(true);
                jyqVar.h = true;
                return;
            case 2:
                jyq jyqVar2 = this.a;
                if (jyqVar2.h) {
                    jyqVar2.j.d("/cancel_notify_wear", null);
                    return;
                }
                return;
            case 3:
                this.a.j.d("/support_feature_version", jye.a());
                return;
            case 4:
                this.a.j.d("/mode_exit", null);
                return;
            case 5:
                jyq jyqVar3 = this.a;
                synchronized (jyqVar3.n) {
                    str = jyqVar3.s;
                    break;
                }
                if (TextUtils.isEmpty(str)) {
                    jyqVar3.j.d("/mode_exit", null);
                    return;
                } else {
                    jyqVar3.j.d("/mode_ready", str.getBytes(StandardCharsets.UTF_8));
                    return;
                }
            case 6:
                jyq jyqVar4 = this.a;
                jxz jxzVar = jyqVar4.j;
                poy poyVarM = jxu.c.m();
                float fB = jyqVar4.o.b();
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                ((jxu) poyVarM.b).b = fB;
                float fC = jyqVar4.o.c();
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                ((jxu) poyVarM.b).a = fC;
                jxzVar.d("/zoom_limit", ((jxu) poyVarM.j()).g());
                return;
            case 7:
                jyq jyqVar5 = this.a;
                jxz jxzVar2 = jyqVar5.j;
                poy poyVarM2 = jxv.b.m();
                float fFloatValue = ((Float) jyqVar5.p.fA()).floatValue();
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                ((jxv) poyVarM2.b).a = fFloatValue;
                jxzVar2.d("/zoom_value", ((jxv) poyVarM2.j()).g());
                return;
            default:
                jyq jyqVar6 = this.a;
                if (jyqVar6.l()) {
                    if (!jyqVar6.i) {
                        jyqVar6.l.f("Not receive response, send preview message without image.");
                        jxz jxzVar3 = jyqVar6.j;
                        poy poyVarM3 = jxr.c.m();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (poyVarM3.c) {
                            poyVarM3.m();
                            poyVarM3.c = false;
                        }
                        ((jxr) poyVarM3.b).b = jCurrentTimeMillis;
                        jxzVar3.d("/empty_preview", ((jxr) poyVarM3.j()).g());
                        jyqVar6.h(1000L);
                        return;
                    }
                    long j = jyqVar6.b;
                    if (j >= 1000) {
                        f = 4.0f;
                    } else if (j >= 500) {
                        f = 3.0f;
                    } else if (j >= 300) {
                        f = 2.0f;
                    } else {
                        f = j >= 150 ? 1.5f : 1.0f;
                    }
                    try {
                        try {
                            jyqVar6.m.e("GetPreviewForWear");
                            int iA = jyqVar6.u.a().a();
                            jng jngVar = jyqVar6.q;
                            int i = (int) (jyqVar6.d / f);
                            int i2 = (int) (jyqVar6.e / f);
                            jngVar.c.e("getScreenshot");
                            synchronized (jngVar.b) {
                                jna jnaVar = jngVar.d;
                                jnaVar.getClass();
                                final SurfaceView surfaceView = jnaVar.b;
                                float fMin = Math.min(surfaceView.getWidth(), surfaceView.getHeight());
                                float fMax = Math.max(surfaceView.getHeight(), surfaceView.getWidth());
                                float fMax2 = Math.max(fMin / i, fMax / i2);
                                final int i3 = (int) (fMin / fMax2);
                                final int i4 = (int) (fMax / fMax2);
                                bitmap = (Bitmap) jngVar.e.b(new oiu() { // from class: jne
                                    @Override // defpackage.oiu
                                    public final Object a(Object obj) {
                                        int i5 = i3;
                                        int i6 = i4;
                                        return (Bitmap) ((jwx) obj).c(i5, i6).e(jng.b(surfaceView, i5, i6));
                                    }
                                }).e(jng.b(surfaceView, i3, i4));
                                jngVar.c.f();
                                break;
                            }
                            if (iA != 0) {
                                jngVar.c.e("getScreenshot#flipAndRotate");
                                Bitmap bitmapA = jng.a(bitmap, iA, false);
                                jngVar.c.f();
                                bitmap.recycle();
                                bitmap = bitmapA;
                            }
                            jyqVar6.m.f();
                            if (bitmap != null) {
                                jyqVar6.i(bitmap, true);
                            }
                            jyqVar6.h(1000L);
                            jyqVar6.b = 1000L;
                            jyqVar6.i = false;
                            return;
                        } catch (Exception e) {
                            jyqVar6.l.i("Error when viewfinder.getScreenshot", e);
                            jyqVar6.h(50L);
                            jyqVar6.m.f();
                            return;
                        }
                    } catch (Throwable th) {
                        jyqVar6.m.f();
                        throw th;
                    }
                }
                return;
        }
    }
}
