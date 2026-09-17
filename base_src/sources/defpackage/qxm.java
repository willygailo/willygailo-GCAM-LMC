package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qxm implements ppi {
    private final /* synthetic */ int i;
    static final ppi h = new qxm(7);
    static final ppi g = new qxm(6);
    static final ppi f = new qxm(5);
    static final ppi e = new qxm(4);
    static final ppi d = new qxm(3);
    static final ppi c = new qxm(2);
    static final ppi b = new qxm(1);
    static final ppi a = new qxm(0);

    private qxm(int i) {
        this.i = i;
    }

    @Override // defpackage.ppi
    public final boolean a(int i) {
        switch (this.i) {
            case 0:
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                        return true;
                    default:
                        return false;
                }
            case 1:
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            case 2:
                return qno.F(i) != 0;
            case 3:
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        return true;
                    default:
                        return false;
                }
            case 4:
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return true;
                    default:
                        return false;
                }
            case 5:
                return qyd.b(i) != null;
            case 6:
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        return true;
                    default:
                        return false;
                }
            default:
                return qno.E(i) != 0;
        }
    }
}
