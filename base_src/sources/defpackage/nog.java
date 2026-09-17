package defpackage;

import com.google.android.apps.camera.bottombar.R;
import com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.F250RoomDatabase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class nog implements nmp {
    public final nrm a;
    public final nox b;
    private final F250RoomDatabase c;
    private final mdf d;
    private final qbt e;

    public nog(F250RoomDatabase f250RoomDatabase, nov novVar, nrm nrmVar, noc nocVar, nom nomVar, nox noxVar, mdf mdfVar, nrk nrkVar, qbt qbtVar) {
        f250RoomDatabase.getClass();
        novVar.getClass();
        nrmVar.getClass();
        nocVar.getClass();
        nomVar.getClass();
        noxVar.getClass();
        mdfVar.getClass();
        nrkVar.getClass();
        qbtVar.getClass();
        this.c = f250RoomDatabase;
        this.a = nrmVar;
        this.b = noxVar;
        this.d = mdfVar;
        this.e = qbtVar;
    }

    @Override // defpackage.nmp
    public final qbm a(Set set, List list) throws IOException {
        nrl nrlVar = new nrl(this.d, new nnh(set, list), null, null, null, null);
        npz npzVarT = this.c.t();
        StringBuilder sb = new StringBuilder("SELECT * FROM ResourceEntity");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        oti otiVarListIterator = ((ose) set).listIterator();
        while (otiVarListIterator.hasNext()) {
            ohh ohhVar = (ohh) otiVarListIterator.next();
            if (ohhVar instanceof nne) {
                throw null;
            }
            if (ohhVar instanceof nng) {
                throw null;
            }
            if (ohhVar instanceof nnb) {
                throw null;
            }
            if (ohhVar instanceof nno) {
                throw null;
            }
            if (ohhVar instanceof nnd) {
                throw null;
            }
            if (ohhVar instanceof nni) {
                throw null;
            }
            if (ohhVar instanceof nnp) {
                throw null;
            }
            if (ohhVar instanceof nms) {
                arrayList.add(qno.a("status_airlockFileState IN ", qmd.D(((nms) ohhVar).a, ",", "(", ")", noj.f, 24)));
            } else if (ohhVar instanceof nns) {
                throw null;
            }
        }
        if (!arrayList2.isEmpty()) {
            sb.append(" JOIN ResourceFts ON ResourceEntity.onDeviceId == ResourceFts.docid");
            arrayList.add(qmd.D(arrayList2, " AND ", "( ResourceFts MATCH ", ")", null, 56));
        }
        if (!arrayList.isEmpty()) {
            qmd.E(arrayList, sb, " AND ", " WHERE ", R.styleable.AppCompatTheme_windowFixedHeightMajor);
        }
        ajp ajpVar = new ajp(sb.toString());
        nqf nqfVar = (nqf) npzVarT;
        aii aiiVar = nqfVar.a;
        nqa nqaVar = new nqa(nqfVar, ajpVar);
        qbt qbtVarA = qka.a(aiiVar.b);
        qfi qfiVar = new qfi(nqaVar);
        qco qcoVar = qmd.l;
        qhb qhbVar = new qhb(qbm.a(new aiu(new String[]{"ResourceEntity"}, aiiVar)).gW(qbtVarA), qbtVarA);
        qco qcoVar2 = qmd.j;
        qgb qgbVar = new qgb(qhbVar.d(qbtVarA), new aiv(qfiVar));
        qco qcoVar3 = qmd.j;
        qbm qbmVarGW = qgbVar.gW(this.e);
        qcz qczVar = qcz.INSTANCE;
        qmd.W(qczVar, "collectionSupplier is null");
        qft qftVar = new qft(qbmVarGW, qczVar);
        qco qcoVar4 = qmd.j;
        qge qgeVar = new qge(qftVar, new noe(this));
        qco qcoVar5 = qmd.j;
        qbm qbmVarI = qgeVar.i(qdd.d, new nof(this, nrlVar, 0));
        qgy qgyVar = new qgy(qbmVarI);
        qco qcoVar6 = qmd.j;
        qbm qbmVarI2 = qgyVar.i(new nof(this, nrlVar, 1), qdd.d);
        qgt qgtVar = new qgt(qbmVarI);
        qco qcoVar7 = qmd.j;
        qgc qgcVar = new qgc(new qbp[]{qbmVarI2, qgtVar});
        qco qcoVar8 = qmd.j;
        int i = qbh.a;
        qmd.X(2, "maxConcurrency");
        qmd.X(i, "bufferSize");
        qfy qfyVar = new qfy(qgcVar, i);
        qco qcoVar9 = qmd.j;
        return qfyVar;
    }
}
