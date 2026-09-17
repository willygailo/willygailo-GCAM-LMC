package defpackage;

import android.app.ActivityManager;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fob implements ojz {
    private final /* synthetic */ int l;
    public static final /* synthetic */ fob k = new fob(11);
    public static final /* synthetic */ fob j = new fob(10);
    public static final /* synthetic */ fob i = new fob(9);
    public static final /* synthetic */ fob h = new fob(8);
    public static final /* synthetic */ fob g = new fob(7);
    public static final /* synthetic */ fob f = new fob(6);
    public static final /* synthetic */ fob e = new fob(4);
    public static final /* synthetic */ fob d = new fob(3);
    public static final /* synthetic */ fob c = new fob(2);
    public static final /* synthetic */ fob b = new fob(1);
    public static final /* synthetic */ fob a = new fob(0);

    public /* synthetic */ fob(int i2) {
        this.l = i2;
    }

    @Override // defpackage.ojz
    public final Object a() {
        boolean z = true;
        switch (this.l) {
            case 0:
                return new frf();
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                return 6;
            case 4:
                return Pattern.compile("medres-([0-9]+)\\.jpg");
            case 5:
                if (myw.a == 0) {
                    synchronized (myw.class) {
                        if (myw.a == 0) {
                            myw.a = (int) Math.ceil(16.666666666666668d);
                        }
                        break;
                    }
                }
                return Integer.valueOf(myw.a);
            case 6:
                return mzz.a();
            case 7:
                return oih.a;
            case 8:
                return Boolean.valueOf(ActivityManager.isUserAMonkey() ? true : ActivityManager.isRunningInUserTestHarness());
            case 9:
                return new qxu(0);
            case 10:
                return plk.L(Executors.newSingleThreadScheduledExecutor(abp.b));
            default:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    int i2 = runningAppProcessInfo.importance;
                    if (runningAppProcessInfo.importance < 400) {
                        z = false;
                    }
                } catch (RuntimeException e2) {
                    Log.w("ACG", "Failed to retrieve memory state, not killing process.", e2);
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
