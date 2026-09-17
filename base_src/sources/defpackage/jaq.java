package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jaq {
    private Boolean a;
    private Boolean b;
    private Boolean c;
    private lco d;
    private lco e;

    public final jar a() {
        Boolean bool = this.a;
        if (bool != null && this.b != null && this.c != null && this.d != null && this.e != null) {
            return new jar(bool.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" showOutputTimer");
        }
        if (this.b == null) {
            sb.append(" showMutedAudioIcon");
        }
        if (this.c == null) {
            sb.append(" showSpeechEnhanceIcon");
        }
        if (this.d == null) {
            sb.append(" showMicInputExtWired");
        }
        if (this.e == null) {
            sb.append(" showMicInputExtBluetooth");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(lco lcoVar) {
        if (lcoVar == null) {
            throw new NullPointerException("Null showMicInputExtBluetooth");
        }
        this.e = lcoVar;
    }

    public final void c(lco lcoVar) {
        if (lcoVar == null) {
            throw new NullPointerException("Null showMicInputExtWired");
        }
        this.d = lcoVar;
    }

    public final void d(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final void e(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    public final void f(boolean z) {
        this.c = Boolean.valueOf(z);
    }
}
