package defpackage;

import android.graphics.Rect;
import com.google.android.GoogleCameraEngR18F1.R;
import j$.time.temporal.ChronoUnit;
import j$.util.Collection;
import j$.util.function.Function;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cgw implements Function {
    private final /* synthetic */ int u;
    public static final /* synthetic */ cgw t = new cgw(20);
    public static final /* synthetic */ cgw s = new cgw(19);
    public static final /* synthetic */ cgw r = new cgw(18);
    public static final /* synthetic */ cgw q = new cgw(17);
    public static final /* synthetic */ cgw p = new cgw(16);
    public static final /* synthetic */ cgw o = new cgw(14);
    public static final /* synthetic */ cgw n = new cgw(13);
    public static final /* synthetic */ cgw m = new cgw(12);
    public static final /* synthetic */ cgw l = new cgw(11);
    public static final /* synthetic */ cgw k = new cgw(10);
    public static final /* synthetic */ cgw j = new cgw(9);
    public static final /* synthetic */ cgw i = new cgw(8);
    public static final /* synthetic */ cgw h = new cgw(7);
    public static final /* synthetic */ cgw g = new cgw(6);
    public static final /* synthetic */ cgw f = new cgw(5);
    public static final /* synthetic */ cgw e = new cgw(4);
    public static final /* synthetic */ cgw d = new cgw(3);
    public static final /* synthetic */ cgw c = new cgw(2);
    public static final /* synthetic */ cgw b = new cgw(1);
    public static final /* synthetic */ cgw a = new cgw(0);

    public /* synthetic */ cgw(int i2) {
        this.u = i2;
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        switch (this.u) {
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
        return Function.CC.$default$andThen(this, function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        switch (this.u) {
            case 0:
                return htl.b((leb) obj);
            case 1:
                return lju.b((lvu) obj);
            case 2:
                return (htl) ((ojc) obj).c();
            case 3:
                return ((jws) obj).a();
            case 4:
                return ((ckt) obj).a;
            case 5:
                return cye.l((lwd) obj);
            case 6:
                return (Long) ((Map.Entry) obj).getKey();
            case 7:
                return ((hjy) obj).a;
            case 8:
                bty btyVar = (bty) obj;
                return btyVar.a().g().toEpochMilli() != -1 ? btyVar.a().g().truncatedTo(ChronoUnit.SECONDS) : btyVar.a().h();
            case 9:
                return Long.valueOf(((bty) obj).a().b());
            case 10:
                return ((epv) obj).c;
            case 11:
                pjs pjsVar = (pjs) obj;
                int i2 = pjsVar.a;
                pjv pjvVar = pjsVar.b;
                if (pjvVar == null) {
                    pjvVar = pjv.c;
                }
                pju pjuVar = pjvVar.a;
                if (pjuVar == null) {
                    pjuVar = pju.e;
                }
                int i3 = pjuVar.a;
                pjv pjvVar2 = pjsVar.b;
                if (pjvVar2 == null) {
                    pjvVar2 = pjv.c;
                }
                pju pjuVar2 = pjvVar2.a;
                if (pjuVar2 == null) {
                    pjuVar2 = pju.e;
                }
                int i4 = pjuVar2.b;
                pjv pjvVar3 = pjsVar.b;
                if (pjvVar3 == null) {
                    pjvVar3 = pjv.c;
                }
                pju pjuVar3 = pjvVar3.a;
                if (pjuVar3 == null) {
                    pjuVar3 = pju.e;
                }
                int i5 = pjuVar3.a;
                pjv pjvVar4 = pjsVar.b;
                if (pjvVar4 == null) {
                    pjvVar4 = pjv.c;
                }
                pju pjuVar4 = pjvVar4.a;
                if (pjuVar4 == null) {
                    pjuVar4 = pju.e;
                }
                int i6 = i5 + pjuVar4.c;
                pjv pjvVar5 = pjsVar.b;
                if (pjvVar5 == null) {
                    pjvVar5 = pjv.c;
                }
                pju pjuVar5 = pjvVar5.a;
                if (pjuVar5 == null) {
                    pjuVar5 = pju.e;
                }
                int i7 = pjuVar5.b;
                pjv pjvVar6 = pjsVar.b;
                if (pjvVar6 == null) {
                    pjvVar6 = pjv.c;
                }
                pju pjuVar6 = pjvVar6.a;
                if (pjuVar6 == null) {
                    pjuVar6 = pju.e;
                }
                return new hjy(i2, new Rect(i3, i4, i6, i7 + pjuVar6.d), (int) pjsVar.c, null, null, null);
            case 12:
                return ((bvv) obj).c();
            case 13:
                return Boolean.valueOf(!((pht) obj).isDone());
            case 14:
                final bvv bvvVar = (bvv) obj;
                return new Runnable() { // from class: bvy
                    @Override // java.lang.Runnable
                    public final void run() {
                        bvvVar.fz();
                    }
                };
            case 15:
                final gto gtoVar = (gto) obj;
                List list = (List) Collection.EL.stream(gtoVar.g()).map(new Function() { // from class: gso
                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function andThen(Function function) {
                        return Function.CC.$default$andThen(this, function);
                    }

                    @Override // j$.util.function.Function
                    public final Object apply(Object obj2) {
                        gto gtoVar2 = gtoVar;
                        gtv gtvVar = (gtv) obj2;
                        return new gtl(gtvVar, gtoVar2.b(gtvVar), gtoVar2.c(gtvVar), gtoVar2.a(gtvVar));
                    }

                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function compose(Function function) {
                        return Function.CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toList());
                gtm gtmVarD = gtoVar.d();
                gtoVar.l();
                gtoVar.k();
                return gtk.a(gtmVarD, R.string.speech_enhance_label, R.string.speech_enhance_content_desc, oom.j(list));
            case 16:
                gto gtoVar2 = (gto) obj;
                oor oorVar = gsp.a;
                return gtoVar2;
            case 17:
                return (gtv) obj;
            case 18:
                return (gtv) obj;
            case 19:
                return ((hcc) obj).b;
            default:
                int i8 = gzu.a;
                return ((hcc) obj).b;
        }
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        switch (this.u) {
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
        return Function.CC.$default$compose(this, function);
    }
}
