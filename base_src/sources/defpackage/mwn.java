package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mwn {
    public int a;
    public mwm b;

    public final mwo a() {
        mwm mwmVar;
        int i = this.a;
        if (i != 0 && (mwmVar = this.b) != null) {
            return new mwo(i, mwmVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" enablement");
        }
        if (this.b == null) {
            sb.append(" metricExtensionProvider");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(boolean z) {
        this.a = true != z ? 2 : 3;
    }
}
