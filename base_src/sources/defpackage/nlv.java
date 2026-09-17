package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nlv implements ojf {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    private final /* synthetic */ int c;

    public /* synthetic */ nlv(float f, float f2, int i) {
        this.c = i;
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.ojf
    public final boolean a(Object obj) {
        switch (this.c) {
            case 0:
                nme nmeVar = (nme) obj;
                return (nmeVar.b == nlf.TEXT_BLOCK || nmeVar.b == nlf.UNSTRUCTURED_TEXT || ((float) nmeVar.a.a.length()) / this.a < this.b) ? false : true;
            default:
                nme nmeVar2 = (nme) obj;
                return (nmeVar2.b == nlf.TEXT_BLOCK || nmeVar2.b == nlf.UNSTRUCTURED_TEXT || ((float) nmeVar2.a.a.length()) / this.a < this.b) ? false : true;
        }
    }
}
