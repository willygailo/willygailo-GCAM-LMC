package defpackage;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.os.Handler;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.hdrplus.deblurfusion.DeblurFusionMergedCropCalculator;
import com.google.googlex.gcam.Gcam;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class dvd implements pys {
    private final qkg a;
    private final qkg b;
    private final /* synthetic */ int c;

    public dvd(qkg qkgVar, qkg qkgVar2, int i) {
        this.c = i;
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public dvd(qkg qkgVar, qkg qkgVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public dvd(qkg qkgVar, qkg qkgVar2, int i, char[] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public dvd(qkg qkgVar, qkg qkgVar2, int i, float[] fArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public dvd(qkg qkgVar, qkg qkgVar2, int i, int[] iArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public dvd(qkg qkgVar, qkg qkgVar2, int i, short[] sArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public dvd(qkg qkgVar, qkg qkgVar2, int i, boolean[] zArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public dvd(qkg qkgVar, qkg qkgVar2, int i, byte[][] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public dvd(qkg qkgVar, qkg qkgVar2, int i, char[][] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public dvd(qkg qkgVar, qkg qkgVar2, int i, short[][] sArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public static dvd a(qkg qkgVar, qkg qkgVar2) {
        return new dvd(qkgVar, qkgVar2, 4);
    }

    public static dvd b(qkg qkgVar, qkg qkgVar2) {
        return new dvd(qkgVar, qkgVar2, 5, (byte[]) null);
    }

    public static dvd c(qkg qkgVar, qkg qkgVar2) {
        return new dvd(qkgVar, qkgVar2, 6, (char[]) null);
    }

    public static dvd d(qkg qkgVar, qkg qkgVar2) {
        return new dvd(qkgVar, qkgVar2, 8);
    }

    public static dvd e(qkg qkgVar, qkg qkgVar2) {
        return new dvd(qkgVar, qkgVar2, 9);
    }

    public static dvd f(qkg qkgVar, qkg qkgVar2) {
        return new dvd(qkgVar, qkgVar2, 10);
    }

    public static dvd g(qkg qkgVar, qkg qkgVar2) {
        return new dvd(qkgVar, qkgVar2, 11, (int[]) null);
    }

    public static dvd h(qkg qkgVar, qkg qkgVar2) {
        return new dvd(qkgVar, qkgVar2, 12, (boolean[]) null);
    }

    public static dvd i(qkg qkgVar, qkg qkgVar2) {
        return new dvd(qkgVar, qkgVar2, 15);
    }

    public static dvd j(qkg qkgVar, qkg qkgVar2) {
        return new dvd(qkgVar, qkgVar2, 16, (byte[][]) null);
    }

    public static dvd k(qkg qkgVar, qkg qkgVar2) {
        return new dvd(qkgVar, qkgVar2, 17);
    }

    public static dvd l(qkg qkgVar, qkg qkgVar2) {
        return new dvd(qkgVar, qkgVar2, 18, (char[][]) null);
    }

    public static dvd m(qkg qkgVar, qkg qkgVar2) {
        return new dvd(qkgVar, qkgVar2, 20);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        lxa lxaVarA;
        switch (this.c) {
            case 0:
                Context context = ((duq) this.a).get();
                duy duyVar = (duy) this.b.get();
                ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.focus_lock_release_inner_splash_diameter_scale_down);
                valueAnimator.addUpdateListener(duyVar.a());
                ValueAnimator valueAnimator2 = (ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.focus_lock_release_inner_splash_opacity_fade_out);
                valueAnimator2.addUpdateListener(duyVar.b());
                ValueAnimator valueAnimator3 = (ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.focus_lock_release_outer_ring_diameter_scale_down);
                valueAnimator3.addUpdateListener(duyVar.c());
                ValueAnimator valueAnimator4 = (ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.focus_lock_release_outer_ring_opacity_fade_out);
                valueAnimator4.addUpdateListener(duyVar.d());
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(valueAnimator, valueAnimator2, valueAnimator3, valueAnimator4);
                animatorSet.addListener(new jse());
                return mip.ej(animatorSet);
            case 1:
                Context context2 = ((duq) this.a).get();
                duy duyVar2 = (duy) this.b.get();
                ValueAnimator valueAnimator5 = (ValueAnimator) AnimatorInflater.loadAnimator(context2, R.animator.active_focus_converge_outer_ring_opacity_fade_out);
                valueAnimator5.addUpdateListener(duyVar2.d());
                valueAnimator5.addListener(new jse());
                return mip.ej(valueAnimator5);
            case 2:
                Context context3 = ((duq) this.a).get();
                duy duyVar3 = (duy) this.b.get();
                ValueAnimator valueAnimator6 = (ValueAnimator) AnimatorInflater.loadAnimator(context3, R.animator.tracking_end_outer_ring_diameter_scale_up);
                valueAnimator6.addUpdateListener(duyVar3.c());
                ValueAnimator valueAnimator7 = (ValueAnimator) AnimatorInflater.loadAnimator(context3, R.animator.tracking_end_outer_ring_opacity_fade_out);
                valueAnimator7.addUpdateListener(duyVar3.d());
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.setInterpolator(new adt());
                animatorSet2.playTogether(valueAnimator6, valueAnimator7);
                animatorSet2.addListener(new jse());
                return mip.ej(animatorSet2);
            case 3:
                Context context4 = ((duq) this.a).get();
                duy duyVar4 = (duy) this.b.get();
                ValueAnimator valueAnimator8 = (ValueAnimator) AnimatorInflater.loadAnimator(context4, R.animator.passive_focus_converge_outer_ring_opacity_fade_out);
                valueAnimator8.addUpdateListener(duyVar4.d());
                valueAnimator8.addListener(new jse());
                return mip.ej(valueAnimator8);
            case 4:
                try {
                    mrp mrpVar = (mrp) this.b.get();
                    int i = dvu.a * 10;
                    long jConvert = TimeUnit.NANOSECONDS.convert(1500000000L, TimeUnit.NANOSECONDS);
                    AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                    return ojc.i(new dvg(mrpVar, i, atomicBoolean, mip.ec(new dvf(atomicBoolean, new AtomicBoolean(true), jConvert))));
                } catch (Exception e) {
                    ((oug) ((oug) dvh.a.b()).G((char) 939)).o("Error trying to initialize audio");
                    return oih.a;
                }
            case 5:
                mrs mrsVar = new mrs(new mrq(new AudioRecord.Builder().setAudioSource(5).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(48000).setChannelMask(12).build()).setBufferSizeInBytes(dvu.a * 10).build(), 1), ((bwn) this.a).a());
                boolean z = mot.a;
                return mrsVar;
            case 6:
                ((cjc) this.b).a();
                ojc ojcVar = (ojc) this.a.get();
                return ojcVar.g() ? ojc.i((dwj) ojcVar.c()) : oih.a;
            case 7:
                return new dxq(((dxm) this.b).get(), ((dxs) this.a).get());
            case 8:
                return new dym((lxb) this.a.get(), (lap) this.b.get());
            case 9:
                Object objH = ((Integer) this.a.get()).intValue() < 0 ? orx.a : ope.H((mip) this.b.get());
                qmd.ae(objH);
                return objH;
            case 10:
                lxb lxbVar = (lxb) this.a.get();
                ddf ddfVar = (ddf) this.b.get();
                ddi ddiVar = ddl.a;
                ddfVar.e();
                qmd.ae(lxbVar);
                return lxbVar;
            case 11:
                Integer num = (Integer) this.b.get();
                return num.intValue() < 0 ? new enp() : new ens(num.intValue(), ((gsf) this.a.get()).b());
            case 12:
                lvp lvpVar = (lvp) this.b.get();
                ddf ddfVar2 = (ddf) this.a.get();
                lwd lwdVarK = lvpVar.k();
                lwd lwdVar = lwd.BACK;
                if (ddfVar2.k(ddl.at) && lwdVarK == lwdVar) {
                    return (Integer) ddfVar2.a(ddl.o).c();
                }
                return -1;
            case 13:
                return new ead(((djc) this.b).get(), (ddf) this.a.get(), null);
            case 14:
                return new eah((Gcam) this.a.get(), (ScheduledExecutorService) this.b.get());
            case 15:
                return new eao((Handler) this.a.get(), (ddf) this.b.get());
            case 16:
                return new eaw(((pyw) this.b).get(), (ljf) this.a.get());
            case 17:
                ojc ojcVar2 = (ojc) this.a.get();
                lap lapVar = (lap) this.b.get();
                if (!ojcVar2.g() || (lxaVarA = ((lxb) ojcVar2.c()).a("HdrPlusSession")) == null) {
                    return oih.a;
                }
                lapVar.c(lxaVarA);
                return ojc.i(lxaVarA);
            case 18:
                return new DeblurFusionMergedCropCalculator((jth) this.b.get(), (Map) this.a.get());
            case 19:
                return new ljl(plk.M((Executor) this.b.get()), (ljf) this.a.get(), "FalconProcess");
            default:
                Object obj = ((ffg) this.a).a().booleanValue() ? (eeu) this.b.get() : gqh.b;
                qmd.ae(obj);
                return obj;
        }
    }
}
