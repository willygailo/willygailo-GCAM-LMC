package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class aqg extends aia {
    public aqg(aii aiiVar) {
        super(aiiVar);
    }

    @Override // defpackage.aia
    public final /* bridge */ /* synthetic */ void b(ake akeVar, Object obj) {
        aqf aqfVar = (aqf) obj;
        akeVar.g(1, aqfVar.a);
        akeVar.e(2, aqfVar.b.longValue());
    }

    @Override // defpackage.aiy
    public final String d() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }
}
