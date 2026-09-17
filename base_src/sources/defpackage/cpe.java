package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cpe extends ldn implements cpl {
    public cpe(hup hupVar) {
        super(hupVar);
    }

    @Override // defpackage.ldn
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        ldz ldzVar = ldz.FPS_AUTO;
        switch (((htg) obj).ordinal()) {
            case 1:
                return ldz.FPS_60C_24E;
            case 2:
                return ldz.FPS_60C_30E;
            default:
                throw new IllegalArgumentException("Not a support FPS option");
        }
    }

    @Override // defpackage.ldn
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        htg htgVar = htg.FPS_AUTO;
        switch (((ldz) obj).ordinal()) {
            case 4:
                return htg.FPS_24;
            case 5:
                return htg.FPS_30;
            default:
                throw new IllegalArgumentException("Not a support camcorderCaptureRate");
        }
    }
}
