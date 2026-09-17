package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class noj extends qnp implements qmu {
    private final /* synthetic */ int v;
    public static final noj u = new noj(20);
    public static final noj t = new noj(19);
    public static final noj s = new noj(18);
    public static final noj r = new noj(17);
    public static final noj q = new noj(16);
    public static final noj p = new noj(15);
    public static final noj o = new noj(14);
    public static final noj n = new noj(13);
    public static final noj m = new noj(12);
    public static final noj l = new noj(11);
    public static final noj k = new noj(10);
    public static final noj j = new noj(9);
    public static final noj i = new noj(8);
    public static final noj h = new noj(7);
    public static final noj g = new noj(6);
    public static final noj f = new noj(5);
    public static final noj e = new noj(4);
    public static final noj d = new noj(3);
    public static final noj c = new noj(2);
    public static final noj b = new noj(1);
    public static final noj a = new noj(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public noj(int i2) {
        super(1);
        this.v = i2;
    }

    @Override // defpackage.qmu
    public final /* synthetic */ Object a(Object obj) {
        boolean z = true;
        switch (this.v) {
            case 0:
                npk npkVar = (npk) obj;
                npkVar.getClass();
                return npk.a(npkVar, null, null, nmr.FILES_DELETED_FROM_AIRLOCK, null, 0.0d, 55);
            case 1:
                npk npkVar2 = (npk) obj;
                npkVar2.getClass();
                return npk.a(npkVar2, null, null, nmr.FILES_DELETION_IN_PROGRESS, null, 0.0d, 55);
            case 2:
                npk npkVar3 = (npk) obj;
                npkVar3.getClass();
                return npk.a(npkVar3, null, null, nmr.FAILED_TO_DELETE_FROM_AIRLOCK, null, 0.0d, 55);
            case 3:
                ((npe) obj).getClass();
                return true;
            case 4:
                nqi nqiVar = (nqi) obj;
                nqiVar.getClass();
                return qmd.z(nqiVar.b);
            case 5:
                nmr nmrVar = (nmr) obj;
                nmrVar.getClass();
                return String.valueOf(nmrVar.ordinal());
            case 6:
                ((npe) obj).getClass();
                switch (r9.b) {
                    case ANNOTATION:
                    case ATTACHMENT:
                        break;
                    case NOT_FOR_UPLOAD:
                        z = false;
                        break;
                    default:
                        throw new qkk();
                }
                return Boolean.valueOf(z);
            case 7:
                npk npkVar4 = (npk) obj;
                npkVar4.getClass();
                return npk.a(npkVar4, null, null, null, nnr.UPLOAD_FAILED_PERMANENTLY, 0.0d, 47);
            case 8:
                npe npeVar = (npe) obj;
                npeVar.getClass();
                switch (npeVar.b) {
                    case ANNOTATION:
                    case ATTACHMENT:
                        if (npeVar.h.e != nnr.UPLOAD_IN_PROGRESS) {
                        }
                        return Boolean.valueOf(z);
                    case NOT_FOR_UPLOAD:
                        z = false;
                        return Boolean.valueOf(z);
                    default:
                        throw new qkk();
                }
            case 9:
                npk npkVar5 = (npk) obj;
                npkVar5.getClass();
                return npk.a(npkVar5, null, null, null, nnr.UPLOAD_PAUSED, 0.0d, 47);
            case 10:
                npe npeVar2 = (npe) obj;
                npeVar2.getClass();
                switch (npeVar2.b) {
                    case ANNOTATION:
                    case ATTACHMENT:
                        if (npeVar2.h.e != nnr.UPLOAD_NOT_REQUESTED) {
                        }
                        return Boolean.valueOf(z);
                    case NOT_FOR_UPLOAD:
                        z = false;
                        return Boolean.valueOf(z);
                    default:
                        throw new qkk();
                }
            case 11:
                npk npkVar6 = (npk) obj;
                npkVar6.getClass();
                return npk.a(npkVar6, null, null, null, nnr.UPLOAD_PAUSED, 0.0d, 47);
            case 12:
                npk npkVar7 = (npk) obj;
                npkVar7.getClass();
                return npk.a(npkVar7, null, null, null, nnr.UPLOAD_FAILED_PERMANENTLY, 0.0d, 47);
            case 13:
                npk npkVar8 = (npk) obj;
                npkVar8.getClass();
                return npk.a(npkVar8, null, null, null, nnr.UPLOAD_FAILED_PERMANENTLY, 0.0d, 47);
            case 14:
                npk npkVar9 = (npk) obj;
                npkVar9.getClass();
                return npk.a(npkVar9, null, null, null, nnr.UPLOAD_PAUSED, 0.0d, 47);
            case 15:
                npk npkVar10 = (npk) obj;
                npkVar10.getClass();
                return npk.a(npkVar10, null, null, null, nnr.UPLOAD_PENDING, 0.0d, 15);
            case 16:
                npk npkVar11 = (npk) obj;
                npkVar11.getClass();
                return npk.a(npkVar11, null, null, null, nnr.UPLOAD_FAILED_PERMANENTLY, 0.0d, 47);
            case 17:
                npk npkVar12 = (npk) obj;
                npkVar12.getClass();
                return npk.a(npkVar12, null, null, null, nnr.UPLOAD_IN_PROGRESS, 0.0d, 47);
            case 18:
                ((Throwable) obj).getClass();
                return qks.a;
            case 19:
                qoj qojVar = (qoj) obj;
                qojVar.getClass();
                return qojVar.a();
            default:
                qla qlaVar = (qla) obj;
                qlaVar.getClass();
                return qlaVar.b;
        }
    }
}
