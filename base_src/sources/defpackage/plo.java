package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum plo implements ppg {
    NONE(0),
    CAMERA_MOVED_TOO_FAST(1),
    SCENE_MOVED_TOO_FAST(2),
    TOO_EARLY_FOR_HDR_PLUS_RESULT(3),
    NOT_ENOUGH_MOTION(4);

    public final int f;

    plo(int i) {
        this.f = i;
    }

    @Override // defpackage.ppg
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
