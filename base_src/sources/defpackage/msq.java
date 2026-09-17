package defpackage;

import java.io.FileDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class msq {
    public final ojc a;
    public final ojc b;

    public msq(FileDescriptor fileDescriptor) {
        this.b = ojc.i(fileDescriptor);
        this.a = oih.a;
    }

    private msq(ojc ojcVar, ojc ojcVar2) {
        this.b = ojcVar;
        this.a = ojcVar2;
    }

    public static msq a(Object obj) {
        return new msq(ojc.i(obj), oih.a);
    }

    public static msq b(Object obj) {
        return new msq(oih.a, ojc.i(obj));
    }
}
