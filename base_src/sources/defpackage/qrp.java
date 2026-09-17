package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qrp {
    public static final qvr a = new qvr("COMPLETING_ALREADY");
    public static final qvr b = new qvr("COMPLETING_WAITING_CHILDREN");
    public static final qvr c = new qvr("COMPLETING_RETRY");
    public static final qvr d = new qvr("TOO_LATE_TO_CANCEL");
    public static final qvr e = new qvr("SEALED");
    public static final qqt f = new qqt(true);

    public static final Object a(Object obj) {
        return obj instanceof qrb ? new qrc((qrb) obj) : obj;
    }

    public static final Object b(Object obj) {
        qrc qrcVar = obj instanceof qrc ? (qrc) obj : null;
        return qrcVar == null ? obj : qrcVar.a;
    }
}
