package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ajh implements Comparable {
    final int a;
    final int b;
    final String c;
    final String d;

    public ajh(int i, int i2, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ajh ajhVar = (ajh) obj;
        int i = this.a - ajhVar.a;
        return i == 0 ? this.b - ajhVar.b : i;
    }
}
