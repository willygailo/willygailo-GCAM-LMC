package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iau {
    public String a;
    public ojc b;
    public ojc c;
    public int d;
    private ope e;
    private ope f;
    private Boolean g;
    private Boolean h;
    private lda i;

    public iau() {
    }

    public iau(byte[] bArr) {
        this.b = oih.a;
        this.c = oih.a;
    }

    public final iav a() {
        ope opeVar;
        ope opeVar2;
        Boolean bool;
        String str = this.a;
        if (str != null && (opeVar = this.e) != null && (opeVar2 = this.f) != null && (bool = this.g) != null && this.h != null && this.i != null && this.d != 0) {
            iav iavVar = new iav(str, opeVar, opeVar2, bool.booleanValue(), this.h.booleanValue(), this.i, this.d, this.b, this.c);
            obr.aG(iavVar.a.length() <= 32, "Smarts Processor name is too long.");
            obr.aQ(!iavVar.b.isEmpty());
            obr.aQ(!iavVar.c.isEmpty());
            return iavVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" name");
        }
        if (this.e == null) {
            sb.append(" activeModes");
        }
        if (this.f == null) {
            sb.append(" activeCameraFacing");
        }
        if (this.g == null) {
            sb.append(" shouldPauseDuringCapture");
        }
        if (this.h == null) {
            sb.append(" shouldPauseWhenTimerActive");
        }
        if (this.i == null) {
            sb.append(" externalToggle");
        }
        if (this.d == 0) {
            sb.append(" notificationPriority");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(ope opeVar) {
        if (opeVar == null) {
            throw new NullPointerException("Null activeCameraFacing");
        }
        this.f = opeVar;
    }

    public final void c(ope opeVar) {
        if (opeVar == null) {
            throw new NullPointerException("Null activeModes");
        }
        this.e = opeVar;
    }

    public final void d(lda ldaVar) {
        if (ldaVar == null) {
            throw new NullPointerException("Null externalToggle");
        }
        this.i = ldaVar;
    }

    public final void e(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    public final void f(boolean z) {
        this.h = Boolean.valueOf(z);
    }
}
