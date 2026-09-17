package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class bie extends RuntimeException {
    private static final long serialVersionUID = -2556382523004027815L;

    public bie() {
        super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
    }
}
