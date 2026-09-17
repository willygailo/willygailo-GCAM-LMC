package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lvt {
    public String a;
    public Throwable b;

    public final lvu a() {
        String str = this.a;
        if (str != null) {
            return new lvu(str, this.b);
        }
        throw new IllegalStateException("Missing required properties: cameraId");
    }
}
