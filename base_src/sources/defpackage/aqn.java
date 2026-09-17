package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class aqn extends aia {
    public aqn(aii aiiVar) {
        super(aiiVar);
    }

    @Override // defpackage.aia
    public final /* bridge */ /* synthetic */ void b(ake akeVar, Object obj) {
        aqm aqmVar = (aqm) obj;
        String str = aqmVar.a;
        akeVar.f(1);
        amq amqVar = aqmVar.b;
        byte[] bArrC = amq.c(null);
        if (bArrC == null) {
            akeVar.f(2);
        } else {
            akeVar.c(2, bArrC);
        }
    }

    @Override // defpackage.aiy
    public final String d() {
        return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
    }
}
