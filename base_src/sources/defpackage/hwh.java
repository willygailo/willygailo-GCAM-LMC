package defpackage;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.os.Build;
import com.google.android.apps.camera.sideline.SidelineJobService;
import j$.util.Optional;
import java.io.InputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class hwh {
    public static final ouj a = ouj.h("com/google/android/apps/camera/sideline/SidelineInstaller");
    public final Context b;
    public final dei c;
    public final String d;
    public final Executor e;
    public final Executor f;
    public final ScheduledExecutorService g;
    public final lar h;
    public final PackageInstaller i;
    public final hwl j;
    public final hwp k;
    public final dkl l;
    public final hwn m;
    public final huf n;
    public final hug o;
    public final qkg p;
    public final qkg q;
    public final ljf r;
    public pih s;
    public long t = -1;
    public lji u;
    private final long v;

    static {
        try {
            System.loadLibrary("brotli");
        } catch (UnsatisfiedLinkError e) {
        }
    }

    public hwh(Context context, lzi lziVar, dei deiVar, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, lar larVar, hwl hwlVar, hwp hwpVar, dkl dklVar, hwn hwnVar, huf hufVar, hug hugVar, qkg qkgVar, qkg qkgVar2, PackageInfo packageInfo, ljf ljfVar) {
        this.b = context;
        this.c = deiVar;
        this.e = executor;
        this.f = executor2;
        this.g = scheduledExecutorService;
        this.h = larVar;
        this.j = hwlVar;
        this.k = hwpVar;
        this.l = dklVar;
        this.m = hwnVar;
        this.n = hufVar;
        this.o = hugVar;
        this.p = qkgVar;
        this.q = qkgVar2;
        this.r = ljfVar;
        this.v = packageInfo.getLongVersionCode();
        String string = null;
        String str = (lziVar.j || lziVar.k) ? Build.DEVICE : null;
        if (str != null) {
            String str2 = (Build.TAGS == null || !Build.TAGS.contains("release-keys")) ? "test" : "release";
            StringBuilder sb = new StringBuilder(str2.length() + 42 + str.length());
            sb.append(str2);
            sb.append("-keys_");
            sb.append(str);
            sb.append("_com.google.pixel.camera.hal.apex.br");
            string = sb.toString();
        }
        this.d = string;
        this.i = context.getPackageManager().getPackageInstaller();
    }

    public static final InputStream d(InputStream inputStream) {
        return new pis(inputStream);
    }

    public final void a(int i, Optional optional) {
        int i2;
        ((oug) ((oug) a.b()).G(2683)).t("Install failed! Status (%d): %s", i, optional.orElse(null));
        if (this.c.b(dei.DOGFOOD)) {
            this.j.b();
        }
        c();
        int i3 = 1;
        this.s.o(true);
        if (i != 1) {
            i3 = i;
            i2 = 2;
        } else if (optional.isPresent() && Pattern.matches("INSTALL_FAILED_INTERNAL_ERROR.*signature.*not compatible.*", (CharSequence) optional.get())) {
            i2 = 12;
        } else {
            i = 1;
            i3 = i;
            i2 = 2;
        }
        this.m.b(i3, i2);
    }

    public final void b() {
        if (((emv) this.q).get().schedule(new JobInfo.Builder(58451, new ComponentName(this.b, (Class<?>) SidelineJobService.class)).setPersisted(true).setRequiresDeviceIdle(true).build()) == 1) {
            return;
        }
        ((oug) ((oug) a.c()).G((char) 2690)).o("Failed to schedule retry!");
    }

    public final void c() {
        this.o.e(htu.T, Long.valueOf(this.v));
    }
}
