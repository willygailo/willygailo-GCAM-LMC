package defpackage;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import j$.util.function.Consumer;
import j$.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class ivz implements btw {
    public static final ouj a = ouj.h("com/google/android/apps/camera/ui/captureindicator/wirer/FilmstripDataCaptureIndicatorUpdater");
    public final WindowManager b;
    public final bue c;
    public boolean d;
    private final Consumer e;

    public ivz(WindowManager windowManager, Consumer consumer, final bue bueVar, huf hufVar, lar larVar, ddf ddfVar, bqg bqgVar) {
        this.b = windowManager;
        this.e = consumer;
        this.c = bueVar;
        if (ddfVar.k(ddl.bp)) {
            bqgVar.i().c(hufVar.a(htu.ab).a(new lij() { // from class: ivx
                @Override // defpackage.lij
                public final void fB(Object obj) {
                    ivz ivzVar = this.a;
                    bue bueVar2 = bueVar;
                    if (!ivzVar.d) {
                        ivzVar.d = true;
                    } else {
                        bueVar2.h();
                        ivzVar.a();
                    }
                }
            }, larVar));
        }
    }

    @Override // defpackage.btw
    public final void a() {
        this.e.accept(new Supplier() { // from class: ivy
            @Override // j$.util.function.Supplier
            public final Object get() {
                ivz ivzVar = this.a;
                try {
                    int iA = ivzVar.c.a();
                    bty btyVarB = ivzVar.c.b();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    ivzVar.b.getDefaultDisplay().getMetrics(displayMetrics);
                    int i = displayMetrics.widthPixels;
                    jry jryVarE = btyVarB != null ? btyVarB.e(i, i) : null;
                    if (jryVarE == null || !jryVarE.a.g()) {
                        return iA == 0 ? ivt.a() : new ivt(null);
                    }
                    Bitmap bitmap = (Bitmap) jryVarE.a.c();
                    new lig(bitmap.getWidth(), bitmap.getHeight());
                    return new ivt(bitmap);
                } catch (RuntimeException e) {
                    ((oug) ((oug) ((oug) ivz.a.c()).h(e)).G((char) 3174)).o("exception generating thumbnail");
                    return ivt.a();
                }
            }
        });
    }
}
