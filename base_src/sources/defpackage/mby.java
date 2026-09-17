package defpackage;

import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.OperationApplicationException;
import android.net.Uri;
import android.os.RemoteException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
final class mby implements mcg {
    final /* synthetic */ mbz a;
    private final mcc c;
    private final List b = new ArrayList();
    private boolean d = false;

    public mby(mbz mbzVar, mcc mccVar) {
        this.a = mbzVar;
        this.c = mccVar;
    }

    private final void c(mce mceVar, mcn mcnVar) {
        if (mcnVar.d()) {
            String authority = (mip.L(mcnVar.e) ? this.c.d : this.c.c).getAuthority();
            authority.getClass();
            obr.aU(authority.equals(mceVar.h().getAuthority()), "Expected URI with authority %s, instead found %s", authority, mceVar.h());
        }
    }

    @Override // defpackage.mcg
    public final synchronized void a(mce mceVar) {
        obr.aQ(!this.d);
        c(mceVar, mceVar.i());
        this.b.add(new mct(mceVar, true, null, null));
    }

    @Override // defpackage.mcg
    public final synchronized void b(mce mceVar, mcn mcnVar, mcj mcjVar) {
        boolean z = true;
        obr.aQ(!this.d);
        if (mceVar.i() != mcnVar && !mceVar.k()) {
            z = false;
        }
        obr.aQ(z);
        c(mceVar, mcnVar);
        this.b.add(new mct(mceVar, false, mcnVar, mcjVar));
    }

    @Override // defpackage.mcg, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.d) {
            throw new IllegalStateException("Cannot publish a closed transaction");
        }
        this.d = true;
        try {
            ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
            for (mct mctVar : this.b) {
                File fileB = mctVar.a.i().b(this.c);
                mcn mcnVarI = mctVar.a.i();
                String str = String.format(Locale.ROOT, "%s.%s", mcnVarI.c, mcnVarI.d);
                if (!mctVar.b) {
                    mcn mcnVar = mctVar.c;
                    if (mcnVar != null && mcnVar != mcnVarI) {
                        obr.aR(mcnVarI.d() == mcnVar.d(), "Can only rename a file within the same type of folder");
                        str = String.format(Locale.ROOT, "%s.%s", mcnVar.c, mcnVar.d);
                        File fileB2 = mcnVar.b(this.c);
                        if (!mcnVarI.d() && fileB.renameTo(fileB2)) {
                            ((mcm) mctVar.a).m(new mcs(fileB2, mcnVar, this.a.a));
                        }
                    }
                    mce mceVar = mctVar.a;
                    if (mceVar instanceof mco) {
                        obr.aU(!mceVar.h().equals(Uri.EMPTY), "Cannot close file that doesn't exist in storage: % operation=%s", mctVar.a, mctVar);
                        ContentProviderOperation.Builder builderNewUpdate = ContentProviderOperation.newUpdate(mctVar.a.h());
                        mcj mcjVar = mctVar.d;
                        mci mciVarB = mcjVar == null ? mcj.b() : mcj.c(mcjVar);
                        mciVarB.d(this.c.e, str);
                        mcc mccVar = this.c;
                        mciVarB.b(mccVar.g, mccVar.i);
                        mcj mcjVarA = mciVarB.a();
                        mctVar.d = mcjVarA;
                        arrayList.add(builderNewUpdate.withValues(mcjVarA.a()).build());
                    }
                } else if (mcnVarI.d()) {
                    Uri uriH = mctVar.a.h();
                    uriH.getClass();
                    arrayList.add(ContentProviderOperation.newDelete(uriH).build());
                } else if (!fileB.delete()) {
                    this.a.a.h(String.format(Locale.ROOT, "Unable to delete file %s", fileB));
                }
            }
            if (arrayList.isEmpty()) {
                this.a.a.f("No ContentProvider ops in publish.");
                return;
            }
            HashSet hashSet = new HashSet(new olw(arrayList, imd.k));
            obr.aU(hashSet.size() == 1, "Found multiple incompatible authorities %s when publishing transaction with contentproviderOps=%s", hashSet, arrayList);
            ContentProviderResult[] contentProviderResultArrApplyBatch = this.c.b.applyBatch((String) ohh.v(hashSet), arrayList);
            obr.aQ(contentProviderResultArrApplyBatch.length == arrayList.size());
            for (int i = 0; i < contentProviderResultArrApplyBatch.length; i++) {
                ContentProviderResult contentProviderResult = contentProviderResultArrApplyBatch[i];
                if (!((mct) this.b.get(i)).b && !arrayList.get(i).isInsert()) {
                    obr.aQ(contentProviderResult.count.intValue() == 1);
                }
            }
        } catch (OperationApplicationException | RemoteException e) {
            throw new IOException("Error inserting MediaStore record.", e);
        }
    }
}
