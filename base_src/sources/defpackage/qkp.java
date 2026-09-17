package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class qkp implements Serializable, qkj {
    private qmj a;
    private volatile Object b = qkq.a;
    private final Object c = this;

    public /* synthetic */ qkp(qmj qmjVar) {
        this.a = qmjVar;
    }

    private final Object writeReplace() {
        return new qki(a());
    }

    @Override // defpackage.qkj
    public final Object a() {
        Object objInvoke;
        Object obj = this.b;
        if (obj != qkq.a) {
            return obj;
        }
        synchronized (this.c) {
            objInvoke = this.b;
            if (objInvoke == qkq.a) {
                qmj qmjVar = this.a;
                qmjVar.getClass();
                objInvoke = qmjVar.invoke();
                this.b = objInvoke;
                this.a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.b != qkq.a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
