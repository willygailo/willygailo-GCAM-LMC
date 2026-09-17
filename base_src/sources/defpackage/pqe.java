package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class pqe {
    private static final pqk b = new pqc(0);
    public final pqk a;

    public pqe() {
        pqk pqkVar;
        pqk[] pqkVarArr = new pqk[2];
        pqkVarArr[0] = pqc.a;
        try {
            pqkVar = (pqk) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            pqkVar = b;
        }
        pqkVarArr[1] = pqkVar;
        pqd pqdVar = new pqd(pqkVarArr);
        ppn.i(pqdVar, "messageInfoFactory");
        this.a = pqdVar;
    }

    public static boolean a(pqj pqjVar) {
        return pqjVar.c() == 1;
    }
}
