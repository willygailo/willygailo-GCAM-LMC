package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class mpn implements Callable {
    final /* synthetic */ mlu a;
    final /* synthetic */ mqj b;
    final /* synthetic */ mpo c;

    public mpn(mpo mpoVar, mlu mluVar, mqj mqjVar) {
        this.c = mpoVar;
        this.a = mluVar;
        this.b = mqjVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        try {
            return this.a.a(this.c.c());
        } catch (Exception e) {
            throw e;
        } catch (Throwable th) {
            throw new Error(th);
        }
    }

    public final String toString() {
        String string = this.c.toString();
        String strA = this.b.a();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 22 + String.valueOf(strA).length());
        sb.append("withRawGLObject(");
        sb.append(string);
        sb.append(", fn=");
        sb.append(strA);
        sb.append(")");
        return sb.toString();
    }
}
