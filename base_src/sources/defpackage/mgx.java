package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum mgx implements ppg {
    NONE(0),
    PHOTO_OCR(1),
    BARHOPPER(2),
    PHILEASSTORM(3);

    private final int e;

    mgx(int i) {
        this.e = i;
    }

    @Override // defpackage.ppg
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
