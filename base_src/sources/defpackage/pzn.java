package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pzn implements pzm {
    public static final ngi a;
    public static final ngi b;
    public static final ngi c;
    public static final ngi d;
    public static final ngi e;
    public static final ngi f;

    static {
        ngn ngnVarD = new ngn("com.google.android.libraries.consentverifier").d();
        a = ngnVarD.b("CollectionBasisVerifierFeatures__enable_all_features", true);
        b = ngnVarD.b("CollectionBasisVerifierFeatures__enable_logging", false);
        c = ngnVarD.b("CollectionBasisVerifierFeatures__enable_using_log_verifier_result", false);
        d = ngnVarD.a("CollectionBasisVerifierFeatures__failure_log_cooldown_period_ms", 86400000L);
        e = ngnVarD.a("CollectionBasisVerifierFeatures__max_stack_trace_size", 1000L);
        f = ngnVarD.a("CollectionBasisVerifierFeatures__min_app_version_code_to_log", -1L);
        ngnVarD.b("CollectionBasisVerifierFeatures__use_packed_proto", true);
    }

    @Override // defpackage.pzm
    public final long a() {
        return ((Long) d.a()).longValue();
    }

    @Override // defpackage.pzm
    public final long b() {
        return ((Long) e.a()).longValue();
    }

    @Override // defpackage.pzm
    public final long c() {
        return ((Long) f.a()).longValue();
    }

    @Override // defpackage.pzm
    public final boolean d() {
        return ((Boolean) a.a()).booleanValue();
    }

    @Override // defpackage.pzm
    public final boolean e() {
        return ((Boolean) b.a()).booleanValue();
    }

    @Override // defpackage.pzm
    public final boolean f() {
        return ((Boolean) c.a()).booleanValue();
    }
}
