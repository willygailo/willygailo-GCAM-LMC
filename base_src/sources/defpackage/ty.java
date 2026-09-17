package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ty implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ um b;
    final /* synthetic */ kkm c;

    public ty(um umVar, int i, kkm kkmVar, byte[] bArr) {
        this.b = umVar;
        this.a = i;
        this.c = kkmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uj ujVar;
        um umVar = this.b;
        int i = this.a;
        Object obj = this.c.a;
        String str = (String) umVar.b.get(Integer.valueOf(i));
        if (str == null) {
            return;
        }
        ul ulVar = (ul) umVar.f.get(str);
        if (ulVar == null || (ujVar = ulVar.a) == null) {
            umVar.h.remove(str);
            umVar.g.put(str, obj);
        } else if (umVar.e.remove(str)) {
            ujVar.a(obj);
        }
    }
}
