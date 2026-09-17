package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oxs {
    public final int a;
    public final ovn b;

    protected oxs(ovn ovnVar, int i) {
        if (ovnVar == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if (i >= 0) {
            this.a = i;
            this.b = ovnVar;
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("invalid index: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public abstract void a(oxt oxtVar, Object obj);
}
