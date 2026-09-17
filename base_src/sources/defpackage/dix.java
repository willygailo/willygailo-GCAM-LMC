package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class dix extends ahz {
    public dix(aii aiiVar) {
        super(aiiVar);
    }

    @Override // defpackage.ahz
    public final /* bridge */ /* synthetic */ void c(ake akeVar, Object obj) {
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
        akeVar.e(5, dizVar.a);
    }

    @Override // defpackage.aiy
    public final String d() {
        return "UPDATE OR ABORT `shot_log` SET `sequence` = ?,`shot_id` = ?,`time_millis` = ?,`message` = ? WHERE `sequence` = ?";
    }
}
