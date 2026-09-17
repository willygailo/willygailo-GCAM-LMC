package defpackage;

import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public enum jhi {
    MIC_BROKEN(R.string.vid_chip_br_mic),
    AUDIO_MISSING_DURING_RECORDING(R.string.vid_chip_no_aud),
    VIDEO_MISSING_DURING_RECORDING(R.string.vid_chip_part_err),
    SNAPSHOT_FAILURE(R.string.vid_chip_4),
    PARTIAL_VIDEO_MISSING_AFTER_RECORDING(R.string.vid_chip_part_err_done),
    NO_VIDEO_AFTER_RECORDING(R.string.vid_chip_err),
    CAPTURE_SESSION_ERROR(R.string.vid_chip_session_err),
    RECORDING_TOO_SHORT(R.string.vid_chip_recording_too_short);

    public final int i;

    jhi(int i) {
        this.i = i;
    }
}
