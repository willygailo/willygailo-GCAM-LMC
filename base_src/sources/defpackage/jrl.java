package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum jrl {
    UNINITIALIZED(0),
    PHOTO(1),
    VIDEO(2),
    IMAX(3),
    PHOTO_SPHERE(4),
    SLOW_MOTION(5),
    PORTRAIT(7),
    IMAGE_INTENT(8),
    VIDEO_INTENT(9),
    ORNAMENT(10),
    LENS(11),
    MOTION_BLUR(13),
    LONG_EXPOSURE(14),
    TIME_LAPSE(15),
    SETTINGS(16),
    MORE_MODES(17),
    MEASURE(18),
    REWIND(19),
    TIARA(20);

    public final int t;

    jrl(int i) {
        this.t = i;
    }
}
