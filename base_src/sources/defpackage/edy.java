package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class edy implements eex {
    private final lco a;

    public edy(lco lcoVar) {
        this.a = lcoVar;
    }

    private static final void b(lzv lzvVar) {
        ovd ovdVar = ovl.a;
        lzvVar.b();
    }

    @Override // defpackage.eex
    public final int a(lzv lzvVar) {
        if (!((Boolean) this.a.fA()).booleanValue()) {
            b(lzvVar);
            return 2;
        }
        Integer num = kdd.p != null ? (Integer) lzvVar.d(kdd.p) : 0;
        if (num == null || num.intValue() != 1) {
            b(lzvVar);
            return 1;
        }
        Boolean bool = (Boolean) lzvVar.d(kdd.c);
        if (bool == null || !bool.booleanValue()) {
            String strValueOf = String.valueOf(bool);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 30);
            sb.append("Falcon result invalid, key is ");
            sb.append(strValueOf);
            sb.toString();
            b(lzvVar);
            return 2;
        }
        String strValueOf2 = String.valueOf(bool);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 31);
        sb2.append("Falcon result is valid, key is ");
        sb2.append(strValueOf2);
        sb2.toString();
        b(lzvVar);
        return 3;
    }
}
