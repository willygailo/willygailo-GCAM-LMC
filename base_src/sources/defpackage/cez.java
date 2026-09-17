package defpackage;

import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cez implements Consumer {
    private final /* synthetic */ int s;
    public static final /* synthetic */ cez r = new cez(20);
    public static final /* synthetic */ cez q = new cez(19);
    public static final /* synthetic */ cez p = new cez(18);
    public static final /* synthetic */ cez o = new cez(17);
    public static final /* synthetic */ cez n = new cez(16);
    public static final /* synthetic */ cez m = new cez(15);
    public static final /* synthetic */ cez l = new cez(14);
    public static final /* synthetic */ cez k = new cez(13);
    public static final /* synthetic */ cez j = new cez(12);
    public static final /* synthetic */ cez i = new cez(11);
    public static final /* synthetic */ cez h = new cez(7);
    public static final /* synthetic */ cez g = new cez(6);
    public static final /* synthetic */ cez f = new cez(5);
    public static final /* synthetic */ cez e = new cez(4);
    public static final /* synthetic */ cez d = new cez(3);
    public static final /* synthetic */ cez c = new cez(2);
    public static final /* synthetic */ cez b = new cez(1);
    public static final /* synthetic */ cez a = new cez(0);

    public /* synthetic */ cez(int i2) {
        this.s = i2;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.s) {
            case 0:
                ((chy) obj).h();
                break;
            case 1:
                ((chy) obj).f();
                break;
            case 2:
                ((chy) obj).g();
                break;
            case 3:
                cle cleVar = (cle) obj;
                if (!cleVar.h()) {
                    cleVar.g();
                } else {
                    cleVar.close();
                }
                break;
            case 4:
                ((cuw) obj).a();
                break;
            case 5:
                ((cuw) obj).b();
                break;
            case 6:
                ((bub) obj).a();
                break;
            case 7:
                ((bub) obj).b();
                break;
            case 8:
                fik fikVar = (fik) obj;
                int i2 = fhv.k;
                if (fikVar instanceof fgy) {
                    ((fgy) fikVar).a();
                }
                break;
            case 9:
                fik fikVar2 = (fik) obj;
                int i3 = fhv.k;
                if (fikVar2 instanceof gfn) {
                }
                break;
            case 10:
                fik fikVar3 = (fik) obj;
                int i4 = fhv.k;
                if (fikVar3 instanceof gfn) {
                }
                break;
            case 11:
                fik fikVar4 = (fik) obj;
                int i5 = fhv.k;
                if (fikVar4 instanceof hnv) {
                    ((hnv) fikVar4).b();
                }
                break;
            case 12:
                fik fikVar5 = (fik) obj;
                int i6 = fhv.k;
                if (fikVar5 instanceof fgi) {
                    ((fgi) fikVar5).a();
                }
                break;
            case 13:
                fik fikVar6 = (fik) obj;
                int i7 = fhv.k;
                if (fikVar6 instanceof fgj) {
                    ((fgj) fikVar6).a();
                }
                break;
            case 14:
                fik fikVar7 = (fik) obj;
                int i8 = fhv.k;
                if (fikVar7 instanceof fgn) {
                    ((fgn) fikVar7).a();
                }
                break;
            case 15:
                fik fikVar8 = (fik) obj;
                int i9 = fhv.k;
                if (fikVar8 instanceof fgv) {
                    ((fgv) fikVar8).a();
                }
                break;
            case 16:
                fik fikVar9 = (fik) obj;
                int i10 = fhv.k;
                if (fikVar9 instanceof fgw) {
                    ((fgw) fikVar9).a();
                }
                break;
            case 17:
                fik fikVar10 = (fik) obj;
                int i11 = fhv.k;
                if (fikVar10 instanceof fib) {
                    ((fib) fikVar10).fT();
                }
                break;
            case 18:
                fik fikVar11 = (fik) obj;
                int i12 = fhv.k;
                if (fikVar11 instanceof fic) {
                    ((fic) fikVar11).a();
                }
                break;
            case 19:
                fik fikVar12 = (fik) obj;
                int i13 = fhv.k;
                if (fikVar12 instanceof fie) {
                    ((fie) fikVar12).fU();
                }
                break;
            default:
                fik fikVar13 = (fik) obj;
                int i14 = fhv.k;
                if (fikVar13 instanceof fij) {
                    ((fij) fikVar13).e();
                }
                break;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.s) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
