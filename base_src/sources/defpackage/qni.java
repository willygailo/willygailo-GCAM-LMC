package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class qni implements Serializable, qnn, qkh {
    public static final Object a = qnh.a;
    public final String c;
    public final String d;
    private final Class e;
    private final int f;
    private transient qni h;
    protected final Object b = a;
    private final int g = 0;

    public qni(int i, Class cls, String str, String str2) {
        this.e = cls;
        this.c = str;
        this.d = str2;
        this.f = i;
    }

    public final qoc b() {
        return qns.b(this.e);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qni) {
            qni qniVar = (qni) obj;
            if (qno.c(b(), qniVar.b()) && this.c.equals(qniVar.c) && this.d.equals(qniVar.d)) {
                int i = qniVar.g;
                if (this.f == qniVar.f && qno.c(this.b, qniVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.qnn
    public final int getArity() {
        return this.f;
    }

    public final int hashCode() {
        b();
        return (((b().hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        qni qniVar = this.h;
        if (qniVar == null) {
            int i = qns.a;
            this.h = this;
            qniVar = this;
        }
        if (qniVar != this) {
            return qniVar.toString();
        }
        if ("<init>".equals(this.c)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + this.c + " (Kotlin reflection is not available)";
    }
}
