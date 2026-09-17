package defpackage;

import android.graphics.Point;
import android.graphics.PointF;
import android.os.CountDownTimer;
import com.google.android.apps.camera.smarts.SmartsUiGleamingView;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class hzo extends jxh {
    public static final ouj a = ouj.h("com/google/android/apps/camera/smarts/SmartsGestureListener");
    public final fjs b;
    public final hzz c;
    public final jcw d;
    public final fvv e;
    public final jty f;
    public cvo h;
    public Callable i;
    public boolean j;
    public CountDownTimer k;
    private long n;
    private boolean o;
    private final huq p;
    public volatile boolean g = false;
    public boolean l = false;

    public hzo(Executor executor, fjs fjsVar, hzz hzzVar, huq huqVar, jcw jcwVar, fvv fvvVar, jty jtyVar, byte[] bArr) {
        this.b = fjsVar;
        this.c = hzzVar;
        this.p = huqVar;
        this.d = jcwVar;
        this.e = fvvVar;
        this.f = jtyVar;
        plk.af(jcwVar.a(), new hzl(this), executor);
    }

    @Override // defpackage.jxg
    public final void a(PointF pointF) {
        if (this.j) {
            this.o = true;
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.n < 500) {
            this.o = true;
        } else {
            this.o = false;
        }
        this.n = jCurrentTimeMillis;
    }

    @Override // defpackage.jxf
    public final void b() {
        lar.a();
        d();
    }

    @Override // defpackage.jxg
    public final void c(PointF pointF) {
        lar.a();
        if (this.l) {
            obr.aQ(this.i != null);
            obr.aQ(this.h != null);
            obr.aQ(this.k == null);
            if (!this.g || !this.h.i() || ((Boolean) ((lce) this.p.b).d).booleanValue() || this.o || this.j) {
                return;
            }
            long jMax = Math.max(0L, 1100 - (System.currentTimeMillis() - this.n));
            hzm hzmVar = new hzm(this, jMax, jMax, pointF);
            this.k = hzmVar;
            hzmVar.start();
            if (jMax > 0) {
                this.f.c(0);
                final hzz hzzVar = this.c;
                final Point point = new Point((int) pointF.x, (int) pointF.y);
                hzzVar.f.c(new Runnable() { // from class: hzw
                    @Override // java.lang.Runnable
                    public final void run() {
                        hzz hzzVar2 = hzzVar;
                        Point point2 = point;
                        SmartsUiGleamingView smartsUiGleamingView = hzzVar2.b;
                        lar.a();
                        Point pointEk = mip.ek(smartsUiGleamingView);
                        smartsUiGleamingView.a.setBounds((point2.x - smartsUiGleamingView.b) - pointEk.x, (point2.y - smartsUiGleamingView.b) - pointEk.y, (point2.x + smartsUiGleamingView.b) - pointEk.x, (point2.y + smartsUiGleamingView.b) - pointEk.y);
                        smartsUiGleamingView.a.reset();
                        smartsUiGleamingView.a.start();
                        smartsUiGleamingView.setVisibility(0);
                    }
                });
            }
        }
    }

    public final void d() {
        lar.a();
        CountDownTimer countDownTimer = this.k;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.k = null;
            this.c.a();
        }
    }
}
