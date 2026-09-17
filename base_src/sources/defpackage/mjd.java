package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mjd implements mjf {
    public final /* synthetic */ ast a;
    private final /* synthetic */ int b;

    public /* synthetic */ mjd(ast astVar, int i) {
        this.b = i;
        this.a = astVar;
    }

    @Override // defpackage.mjf
    public final Object a() {
        switch (this.b) {
            case 0:
                Integer numB = this.a.b("http://ns.google.com/photos/1.0/camera/", "MicroVideo");
                return (numB == null || numB.intValue() <= 0) ? null : 1;
            case 1:
                Integer numB2 = this.a.b("http://ns.google.com/photos/1.0/camera/", "MotionPhoto");
                return (numB2 == null || numB2.intValue() <= 0) ? null : 2;
            default:
                return this.a.b("http://ns.google.com/photos/1.0/camera/", "MicroVideoOffset");
        }
    }
}
