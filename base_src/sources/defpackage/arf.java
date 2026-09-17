package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class arf extends aia {
    public arf(aii aiiVar) {
        super(aiiVar);
    }

    @Override // defpackage.aia
    public final /* bridge */ /* synthetic */ void b(ake akeVar, Object obj) {
        ddg ddgVar = (ddg) obj;
        String str = ddgVar.b;
        if (str == null) {
            akeVar.f(1);
        } else {
            akeVar.g(1, str);
        }
        String str2 = ddgVar.a;
        if (str2 == null) {
            akeVar.f(2);
        } else {
            akeVar.g(2, str2);
        }
    }

    @Override // defpackage.aiy
    public final String d() {
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }
}
