package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.apps.camera.bottombar.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class myo implements myn {
    private final Context a;

    public myo(Context context) {
        this.a = context;
    }

    @Override // defpackage.myn
    public /* bridge */ /* synthetic */ List a(int i, int i2, String str, long j) {
        return b(0, 0, str, j);
    }

    public oom b(int i, int i2, String str, long j) {
        int i3;
        ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
        activityManager.getClass();
        List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(this.a.getPackageName(), 0, 0);
        ooh oohVarE = oom.e();
        for (ApplicationExitInfo applicationExitInfo : historicalProcessExitReasons) {
            if (applicationExitInfo.getProcessName().equals(str) && applicationExitInfo.getTimestamp() == j) {
                return oohVarE.f();
            }
            poy poyVarM = qwq.j.m();
            String processName = applicationExitInfo.getProcessName();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qwq qwqVar = (qwq) poyVarM.b;
            processName.getClass();
            qwqVar.a |= 1;
            qwqVar.b = processName;
            int status = applicationExitInfo.getStatus();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qwq qwqVar2 = (qwq) poyVarM.b;
            int i4 = 4;
            qwqVar2.a |= 4;
            qwqVar2.d = status;
            long timestamp = applicationExitInfo.getTimestamp();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qwq qwqVar3 = (qwq) poyVarM.b;
            qwqVar3.a |= 16;
            qwqVar3.f = timestamp;
            long pss = applicationExitInfo.getPss();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qwq qwqVar4 = (qwq) poyVarM.b;
            qwqVar4.a |= 32;
            qwqVar4.g = pss;
            long rss = applicationExitInfo.getRss();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qwq qwqVar5 = (qwq) poyVarM.b;
            qwqVar5.a |= 64;
            qwqVar5.h = rss;
            boolean zIsLowMemoryKillReportSupported = ActivityManager.isLowMemoryKillReportSupported();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qwq qwqVar6 = (qwq) poyVarM.b;
            qwqVar6.a |= 128;
            qwqVar6.i = zIsLowMemoryKillReportSupported;
            switch (applicationExitInfo.getReason()) {
                case 0:
                    i3 = 15;
                    break;
                case 1:
                    i3 = 2;
                    break;
                case 2:
                    i3 = 3;
                    break;
                case 3:
                    i3 = 4;
                    break;
                case 4:
                    i3 = 5;
                    break;
                case 5:
                    i3 = 6;
                    break;
                case 6:
                    i3 = 7;
                    break;
                case 7:
                    i3 = 8;
                    break;
                case 8:
                    i3 = 9;
                    break;
                case 9:
                    i3 = 10;
                    break;
                case 10:
                    i3 = 11;
                    break;
                case 11:
                    i3 = 12;
                    break;
                case 12:
                    i3 = 13;
                    break;
                case 13:
                    i3 = 14;
                    break;
                default:
                    i3 = 0;
                    break;
            }
            if (i3 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                qwq qwqVar7 = (qwq) poyVarM.b;
                qwqVar7.c = i3 - 1;
                qwqVar7.a |= 2;
            }
            switch (applicationExitInfo.getImportance()) {
                case R.styleable.AppCompatTheme_spinnerStyle /* 100 */:
                    i4 = 2;
                    break;
                case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                    i4 = 3;
                    break;
                case 200:
                    i4 = 5;
                    break;
                case 230:
                    i4 = 6;
                    break;
                case 300:
                    i4 = 8;
                    break;
                case 325:
                    break;
                case 350:
                    i4 = 7;
                    break;
                case 400:
                    i4 = 9;
                    break;
                case 1000:
                    i4 = 10;
                    break;
                default:
                    i4 = 0;
                    break;
            }
            if (i4 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                qwq qwqVar8 = (qwq) poyVarM.b;
                qwqVar8.e = i4 - 1;
                qwqVar8.a |= 8;
            }
            oohVarE.g((qwq) poyVarM.j());
        }
        return oohVarE.f();
    }
}
