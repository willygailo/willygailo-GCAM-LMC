package defpackage;

import android.os.Process;
import com.google.android.apps.camera.toast.EducationToastView;
import com.google.android.apps.camera.toast.ToastView;
import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class isd implements Runnable {
    private final /* synthetic */ int o;
    public static final /* synthetic */ isd n = new isd(13);
    public static final /* synthetic */ isd m = new isd(12);
    public static final /* synthetic */ isd l = new isd(11);
    public static final /* synthetic */ isd k = new isd(10);
    public static final /* synthetic */ isd j = new isd(9);
    public static final /* synthetic */ isd i = new isd(8);
    public static final /* synthetic */ isd h = new isd(7);
    public static final /* synthetic */ isd g = new isd(6);
    public static final /* synthetic */ isd f = new isd(5);
    public static final /* synthetic */ isd e = new isd(4);
    public static final /* synthetic */ isd d = new isd(3);
    public static final /* synthetic */ isd c = new isd(2);
    public static final /* synthetic */ isd b = new isd(1);
    public static final /* synthetic */ isd a = new isd(0);

    public /* synthetic */ isd(int i2) {
        this.o = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.o) {
            case 0:
                int i2 = EducationToastView.c;
                break;
            case 1:
                int i3 = EducationToastView.c;
                break;
            case 4:
                Duration duration = ToastView.d;
                break;
            case 5:
                Duration duration2 = ToastView.d;
                break;
            case 6:
                Duration duration3 = ToastView.d;
                break;
            case 7:
                Duration duration4 = ToastView.d;
                break;
            case 12:
                Process.setThreadPriority(-4);
                break;
        }
    }
}
