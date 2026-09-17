package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pzh implements pzg {
    public static final ner a;
    public static final ner b;
    public static final ner c;
    public static final ner d;
    public static final ner e;

    static {
        nep nepVarA = new nep(neg.a("com.google.android.apps.camera")).b().a();
        a = nepVarA.f("Primes__enable_battery_logging", false);
        b = nepVarA.f("Primes__enable_crash_logging", false);
        c = nepVarA.f("Primes__enable_memory_logging", false);
        d = nepVarA.f("Primes__enable_package_metrics_logging", false);
        e = nepVarA.f("Primes__enable_timer_logging", false);
    }

    @Override // defpackage.pzg
    public final boolean a() {
        return ((Boolean) a.e()).booleanValue();
    }

    @Override // defpackage.pzg
    public final boolean b() {
        return ((Boolean) b.e()).booleanValue();
    }

    @Override // defpackage.pzg
    public final boolean c() {
        return ((Boolean) c.e()).booleanValue();
    }

    @Override // defpackage.pzg
    public final boolean d() {
        return ((Boolean) d.e()).booleanValue();
    }

    @Override // defpackage.pzg
    public final boolean e() {
        return ((Boolean) e.e()).booleanValue();
    }
}
