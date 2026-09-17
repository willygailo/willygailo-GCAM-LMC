package defpackage;

import android.media.MediaRecorder;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class lhi implements MediaRecorder.OnErrorListener {
    final /* synthetic */ lhj a;

    public lhi(lhj lhjVar) {
        this.a = lhjVar;
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
        if (i == 1) {
            StringBuilder sb = new StringBuilder(47);
            sb.append("MEDIA_RECORDER_ERROR_UNKNOWN: extra=");
            sb.append(i2);
            Log.e("VidRecMedRec", sb.toString());
        } else if (i == 100) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("MEDIA_ERROR_SERVER_DIED: extra=");
            sb2.append(i2);
            Log.e("VidRecMedRec", sb2.toString());
        } else {
            if (i2 == -1007) {
                StringBuilder sb3 = new StringBuilder(57);
                sb3.append("MEDIA_ERROR_MALFORMED: what=");
                sb3.append(i);
                sb3.append(" extra=-1007");
                Log.e("VidRecMedRec", sb3.toString());
                return;
            }
            StringBuilder sb4 = new StringBuilder(57);
            sb4.append("MediaRecorder onError: what=");
            sb4.append(i);
            sb4.append(" extra=");
            sb4.append(i2);
            Log.e("VidRecMedRec", sb4.toString());
        }
        this.a.c.a();
    }
}
