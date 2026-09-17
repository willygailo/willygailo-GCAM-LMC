package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fur implements fuw {
    final /* synthetic */ fus a;
    private final fuw b;
    private final long c;
    private ojc d = oih.a;
    private ojc e = oih.a;
    private boolean f = false;

    public fur(fus fusVar, long j, fuw fuwVar) {
        this.a = fusVar;
        this.b = fuwVar;
        this.c = j;
    }

    @Override // defpackage.fuw
    public final long a() {
        long j;
        synchronized (this.a) {
            this.a.e.add(this);
            this.b.a();
            long j2 = this.c;
            fus fusVar = this.a;
            long j3 = fusVar.g;
            if (j2 <= j3 || !fusVar.f) {
                c(j3);
            }
            j = this.c;
        }
        return j;
    }

    public final void b() {
        ojc ojcVarI = oih.a;
        ojc ojcVarI2 = oih.a;
        ojc ojcVarI3 = oih.a;
        synchronized (this.a) {
            if (this.f) {
                return;
            }
            if (this.e.g() && this.d.g()) {
                fus fusVar = this.a;
                if (fusVar.c) {
                    if (((Long) this.d.c()).longValue() <= this.c + fusVar.d) {
                        ojcVarI3 = ojc.i(fuj.LONG_PRESS_TOO_SHORT);
                    } else {
                        ojcVarI = ojc.i((Long) this.d.c());
                        ojcVarI2 = ojc.i(fuz.LONG_SHOT_SHUTTER_RELEASE);
                    }
                } else {
                    long j = this.c + 500000;
                    if (((Long) this.d.c()).longValue() <= j) {
                        ojcVarI = ojc.i(Long.valueOf(j));
                        ojcVarI2 = ojc.i(fuz.LONG_SHOT_MINIMAL_LENGTH);
                    } else {
                        ojcVarI = ojc.i((Long) this.d.c());
                        ojcVarI2 = ojc.i(fuz.LONG_SHOT_SHUTTER_RELEASE);
                    }
                }
                this.f = true;
                this.a.e.remove(this);
            }
            if (ojcVarI2.g()) {
                lis lisVar = this.a.a;
                String strValueOf = String.valueOf(ojcVarI.c());
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 27);
                sb.append("Sending out end timestamp: ");
                sb.append(strValueOf);
                lisVar.b(sb.toString());
                ((fuv) this.e.c()).b(((Long) ojcVarI.c()).longValue(), (fuz) ojcVarI2.e(fuz.UNKNOWN));
            }
            if (ojcVarI3.g()) {
                this.a.a.b("Cancelling long shot.");
                ((fuv) this.e.c()).a((fuj) ojcVarI3.c());
            }
        }
    }

    public final void c(long j) {
        this.d = ojc.i(Long.valueOf(j));
        b();
    }

    @Override // defpackage.fuw
    public final void d(fuv fuvVar) {
        this.e = ojc.i(fuvVar);
        this.b.d(new fuq(this));
        b();
    }
}
