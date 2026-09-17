package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
final class kwe extends kwa {
    @Override // defpackage.kwa
    public final void c(Status status) {
        if (status.b()) {
            return;
        }
        String strValueOf = String.valueOf(status);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 52);
        sb.append("disconnect(): Could not unregister listener: status=");
        sb.append(strValueOf);
        Log.e("UsageReportingClientImp", sb.toString());
    }
}
