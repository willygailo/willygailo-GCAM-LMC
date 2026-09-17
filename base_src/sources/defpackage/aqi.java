package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class aqi extends aia {
    public aqi(aii aiiVar) {
        super(aiiVar);
    }

    @Override // defpackage.aia
    public final /* bridge */ /* synthetic */ void b(ake akeVar, Object obj) {
        aqh aqhVar = (aqh) obj;
        String str = aqhVar.a;
        if (str == null) {
            akeVar.f(1);
        } else {
            akeVar.g(1, str);
        }
        akeVar.e(2, aqhVar.b);
    }

    @Override // defpackage.aiy
    public final String d() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
    }
}
