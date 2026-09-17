package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ghf extends ldn {
    public final lco a;

    public ghf(lda ldaVar) {
        super(ldaVar);
        this.a = ldaVar;
    }

    @Override // defpackage.ldn
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        switch (((Integer) obj).intValue()) {
            case 1:
                return ghe.AUTO;
            case 2:
                return ghe.INCANDESCENT;
            case 3:
                return ghe.FLUORESCENT;
            case 4:
            default:
                throw new RuntimeException("Unknown WB input value");
            case 5:
                return ghe.SUNNY;
            case 6:
                return ghe.CLOUDY;
        }
    }

    @Override // defpackage.ldn
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        switch ((ghe) obj) {
            case AUTO:
                return 1;
            case CLOUDY:
                return 6;
            case SUNNY:
                return 5;
            case INCANDESCENT:
                return 2;
            case FLUORESCENT:
                return 3;
            default:
                throw new RuntimeException("Unknown WB output value");
        }
    }
}
