package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class div extends aia {
    public div(aii aiiVar) {
        super(aiiVar);
    }

    @Override // defpackage.aia
    public final /* bridge */ /* synthetic */ void b(ake akeVar, Object obj) {
        diz dizVar = (diz) obj;
        akeVar.e(1, dizVar.a);
        akeVar.e(2, dizVar.b);
        akeVar.e(3, dizVar.c);
        String str = dizVar.d;
        if (str == null) {
            akeVar.f(4);
        } else {
            akeVar.g(4, str);
        }
    }

    @Override // defpackage.aiy
    public final String d() {
        return "INSERT OR ABORT INTO `shot_log` (`sequence`,`shot_id`,`time_millis`,`message`) VALUES (nullif(?, 0),?,?,?)";
    }
}
