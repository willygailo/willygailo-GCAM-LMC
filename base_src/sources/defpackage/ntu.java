package defpackage;

import com.google.android.apps.camera.bottombar.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ntu implements qco {
    final /* synthetic */ Object a;
    final /* synthetic */ nty b;
    private final /* synthetic */ int c;

    public ntu(Object obj, nty ntyVar, int i) {
        this.c = i;
        this.a = obj;
        this.b = ntyVar;
    }

    @Override // defpackage.qco
    public final /* synthetic */ Object a(Object obj) {
        qbd qbdVarE;
        qbu qbuVarG;
        switch (this.c) {
            case 0:
                obr obrVar = (obr) this.a;
                nuj nujVar = (nuj) obj;
                nty ntyVar = this.b;
                if (obrVar instanceof nup) {
                    String str = ((nup) obrVar).a;
                    if (qno.c(str, nujVar.b.o)) {
                        qbuVarG = qbu.k(nujVar);
                    } else {
                        nqh nqhVarD = nqh.d(nujVar.b, null, str, null, 1015807);
                        qbuVarG = ntyVar.e.d(nujVar.a, nqhVarD).d(nuj.b(nujVar, nqhVarD, null, null, R.styleable.AppCompatTheme_windowMinWidthMinor));
                    }
                } else if (obrVar instanceof nuk) {
                    long j = ((nuk) obrVar).a;
                    nrl nrlVar = nujVar.a;
                    nqh nqhVar = nujVar.b;
                    qbuVarG = ntyVar.b.d(nrlVar, new nqi(nqhVar, nujVar.c), new ntb(nun.d(nqhVar, nujVar.d, j), 4)).l(new ntp(nujVar, 0));
                } else if (obrVar instanceof nuh) {
                    IllegalStateException illegalStateException = new IllegalStateException("UploadAttachmentComplete for resource");
                    nujVar.c(29, illegalStateException);
                    qbuVarG = naq.g(ntyVar.b(nujVar), illegalStateException);
                } else if (obrVar instanceof nuo) {
                    String str2 = ((nuo) obrVar).a;
                    nrl nrlVar2 = nujVar.a;
                    nqh nqhVar2 = nujVar.b;
                    List list = nujVar.c;
                    prl prlVarB = psf.b(ntyVar.f.a());
                    nqh nqhVarD2 = nqh.d(nqhVar2, ohh.af(str2), null, npk.a(nqhVar2.r, null, prlVarB, null, nnr.UPLOADED_TO_F250, 1.0d, 11), 786175);
                    qbuVarG = naq.f(ntyVar.e.d(nrlVar2, nqhVarD2), new ntk(ntyVar, nrlVar2, nqhVarD2, list, prlVarB)).l(new ntl(nujVar, nqhVarD2));
                } else {
                    if (!(obrVar instanceof nui)) {
                        throw new qkk();
                    }
                    nui nuiVar = (nui) obrVar;
                    int i = nuiVar.b;
                    Throwable th = nuiVar.a;
                    nujVar.c(i, th);
                    switch (i - 2) {
                        case 24:
                            qbdVarE = ntyVar.b.d(nujVar.a, new nqi(nujVar.b, nujVar.c), noj.o).e();
                            break;
                        case 25:
                        case 26:
                            nrl nrlVar3 = nujVar.a;
                            nqh nqhVar3 = nujVar.b;
                            qbdVarE = qbd.b(ntyVar.e.d(nrlVar3, nqh.d(nqhVar3, null, null, npk.a(nqhVar3.r, null, null, null, nnr.UPLOAD_PAUSED, nun.d(nqhVar3, nujVar.d, 0L), 15), 753663)), ntyVar.b.b(nrlVar3, nqhVar3, nujVar.c, noj.p).e());
                            break;
                        default:
                            qbdVarE = ntyVar.b(nujVar);
                            break;
                    }
                    qbuVarG = naq.g(qbdVarE, th);
                }
                return qbuVarG.f();
            default:
                Integer num = (Integer) this.a;
                nuj nujVar2 = (nuj) obj;
                nty ntyVar2 = this.b;
                num.getClass();
                int iIntValue = num.intValue();
                nrl nrlVar4 = nujVar2.a;
                nqh nqhVar4 = nujVar2.b;
                List list2 = nujVar2.d;
                return ntyVar2.b.a(nrlVar4, nqhVar4, (npe) list2.get(iIntValue), ntz.c).l(new nto(nujVar2, list2, iIntValue)).i(new ntr(this.b, num)).f();
        }
    }
}
