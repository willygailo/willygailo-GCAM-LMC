package defpackage;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvWriteView;

/* JADX INFO: loaded from: classes.dex */
public final class gee implements gcn {
    @Override // defpackage.gcn
    public final mad a(gcm gcmVar, YuvWriteView yuvWriteView, mad madVar, ShotMetadata shotMetadata) {
        return new edo(yuvWriteView, gcmVar.b.longValue());
    }

    @Override // defpackage.gcn
    public final mad b(gcm gcmVar, HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata) {
        return new lxi(hardwareBuffer, gcmVar.b.longValue());
    }
}
