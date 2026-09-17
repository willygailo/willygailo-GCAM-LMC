package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class dim extends aia {
    public dim(aii aiiVar) {
        super(aiiVar);
    }

    @Override // defpackage.aia
    public final /* bridge */ /* synthetic */ void b(ake akeVar, Object obj) {
        dit ditVar = (dit) obj;
        akeVar.e(1, ditVar.a);
        String str = ditVar.b;
        if (str == null) {
            akeVar.f(2);
        } else {
            akeVar.g(2, str);
        }
        akeVar.e(3, ditVar.c);
        akeVar.e(4, ditVar.d);
        akeVar.e(5, ditVar.e);
        akeVar.e(6, ditVar.f);
        akeVar.e(7, ditVar.g);
        String str2 = ditVar.h;
        if (str2 == null) {
            akeVar.f(8);
        } else {
            akeVar.g(8, str2);
        }
        String str3 = ditVar.i;
        if (str3 == null) {
            akeVar.f(9);
        } else {
            akeVar.g(9, str3);
        }
        akeVar.e(10, ditVar.j);
        akeVar.e(11, ditVar.k ? 1L : 0L);
        akeVar.e(12, ditVar.l ? 1L : 0L);
    }

    @Override // defpackage.aiy
    public final String d() {
        return "INSERT OR ABORT INTO `shots` (`shot_id`,`title`,`start_millis`,`persisted_millis`,`canceled_millis`,`deleted_millis`,`most_recent_event_millis`,`capture_session_type`,`capture_session_shot_id`,`pid`,`stuck`,`failed`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
