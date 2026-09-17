package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gdr implements mqj {
    private final /* synthetic */ int h;
    public static final /* synthetic */ gdr g = new gdr(6);
    public static final /* synthetic */ gdr f = new gdr(5);
    public static final /* synthetic */ gdr e = new gdr(4);
    public static final /* synthetic */ gdr d = new gdr(3);
    public static final /* synthetic */ gdr c = new gdr(2);
    public static final /* synthetic */ gdr b = new gdr(1);
    public static final /* synthetic */ gdr a = new gdr(0);

    private /* synthetic */ gdr(int i) {
        this.h = i;
    }

    @Override // defpackage.mqj
    public final String a() {
        switch (this.h) {
            case 0:
                return "mtsPresentationTime";
            case 1:
                ouj oujVar = eot.a;
                return "astroPresentationTime";
            case 2:
                return "mtsWaitForCodecStart";
            case 3:
                return "close";
            case 4:
                return "[unnamed]";
            case 5:
                return "glFlush";
            default:
                return "drawBuilderOnCanvas";
        }
    }
}
