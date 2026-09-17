package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum lga {
    VIDEO_BUFFER_DELAY(true),
    AUDIO_BUFFER_DELAY(false),
    VIDEO_TRACK_FAIL_TO_START(true),
    AUDIO_TRACK_FAIL_TO_START(false),
    METADATA_DELAY(false),
    AUDIO_RECORD_ERROR(false),
    MUXER_STOP_ERROR(true),
    MEDIA_CODEC_ERROR_AUDIO(true),
    MEDIA_CODEC_ERROR_VIDEO(true),
    FILE_LOST(false),
    OTHER(true);

    public final boolean l;

    lga(boolean z) {
        this.l = z;
    }
}
