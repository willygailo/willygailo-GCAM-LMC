package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pzb implements pza {
    public static final ner a;
    public static final ner b;

    static {
        nep nepVarA = new nep(neg.a("com.google.android.apps.camera")).b().a();
        nepVarA.d("General__camera_perfetto_trigger_millis", 2000L);
        nepVarA.d("General__camera_slow_launch_dialog_trigger_ms", 3000L);
        nepVarA.d("General__camera_slow_launch_trigger_ms", 3000L);
        nepVarA.e("General__device_release_date", "");
        nepVarA.d("General__fatal_error_tracker_days_to_reset", 4L);
        a = nepVarA.d("General__sideline_max_attempts", 2L);
        b = nepVarA.f("General__sideline_remote_disable", false);
    }

    @Override // defpackage.pza
    public final long a() {
        return ((Long) a.e()).longValue();
    }

    @Override // defpackage.pza
    public final boolean b() {
        return ((Boolean) b.e()).booleanValue();
    }
}
