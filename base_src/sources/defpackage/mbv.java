package defpackage;

import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.OperationApplicationException;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.MediaStore;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class mbv implements mcg {
    final /* synthetic */ mbw a;
    private final mcc c;
    private final List b = new ArrayList();
    private boolean d = false;

    public mbv(mbw mbwVar, mcc mccVar) {
        this.a = mbwVar;
        this.c = mccVar;
    }

    @Override // defpackage.mcg
    public final synchronized void a(mce mceVar) {
        obr.aQ(!this.d);
        this.b.add(new mct((mcp) mceVar, true, null, null));
    }

    @Override // defpackage.mcg
    public final synchronized void b(mce mceVar, mcn mcnVar, mcj mcjVar) {
        boolean z = true;
        obr.aQ(!this.d);
        if (mceVar.i() != mcnVar && !mceVar.k()) {
            z = false;
        }
        obr.aQ(z);
        this.b.add(new mct(mceVar, false, mcnVar, mcjVar));
    }

    @Override // defpackage.mcg, java.lang.AutoCloseable
    public final synchronized void close() {
        int i;
        ljf ljfVar;
        mcn mcnVar;
        Throwable th;
        if (this.d) {
            throw new IllegalStateException("Cannot publish a closed transaction");
        }
        boolean z = true;
        this.d = true;
        this.a.a.e("media-transaction");
        try {
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList<ContentProviderOperation> arrayList2 = new ArrayList<>();
                Iterator it = this.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    mct mctVar = (mct) it.next();
                    mcn mcnVarI = mctVar.a.i();
                    ljf ljfVar2 = this.a.a;
                    String strValueOf = String.valueOf(mcnVarI);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 3);
                    sb.append("op-");
                    sb.append(strValueOf);
                    ljfVar2.e(sb.toString());
                    File fileB = mcnVarI.b(this.c);
                    if (mctVar.b) {
                        try {
                            lis lisVar = this.a.b;
                            String strValueOf2 = String.valueOf(mctVar.a.i().c());
                            lisVar.f(strValueOf2.length() != 0 ? "Deleting ".concat(strValueOf2) : new String("Deleting "));
                            this.a.a.e("delete");
                            if (!fileB.delete()) {
                                this.a.b.h(String.format(Locale.ROOT, "Unable to delete file %s", fileB));
                            } else if (mcnVarI.d()) {
                                arrayList2.add(ContentProviderOperation.newDelete(mctVar.a.h()).build());
                                arrayList.add(mctVar);
                            }
                            this.a.a.f();
                        } catch (Throwable th2) {
                            this.a.b.i(String.format(Locale.ROOT, "Unable to delete file %s", fileB), th2);
                        }
                    } else {
                        mcn mcnVar2 = mctVar.c;
                        if (mcnVar2 != null && mcnVar2 != mcnVarI) {
                            lis lisVar2 = this.a.b;
                            String strC = mctVar.a.i().c();
                            String strC2 = mctVar.c.c();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(strC).length() + 11 + String.valueOf(strC2).length());
                            sb2.append("Moving ");
                            sb2.append(strC);
                            sb2.append(" to ");
                            sb2.append(strC2);
                            lisVar2.f(sb2.toString());
                            this.a.a.e("move");
                            try {
                                mcnVar = mctVar.c;
                                File fileB2 = mcnVar.b(this.c);
                                if (fileB.renameTo(fileB2)) {
                                    try {
                                        ((mcm) mctVar.a).m(new mcs(fileB2, mcnVar, this.a.b));
                                        mcnVarI = mcnVar;
                                        fileB = fileB2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        fileB = fileB2;
                                        this.a.b.i(String.format(Locale.ROOT, "Unable to move file %s", fileB), th);
                                        mcnVarI = mcnVar;
                                    }
                                }
                            } catch (Throwable th4) {
                                mcnVar = mcnVarI;
                                th = th4;
                            }
                            this.a.a.f();
                        }
                        if (mctVar.a.i().d()) {
                            ContentProviderOperation.Builder builderNewInsert = Uri.EMPTY.equals(mctVar.a.h()) ? ContentProviderOperation.newInsert(MediaStore.Files.getContentUri("external")) : ContentProviderOperation.newUpdate(mctVar.a.h());
                            mcj mcjVar = mctVar.d;
                            mci mciVarB = mcjVar == null ? mcj.b() : mcj.c(mcjVar);
                            if (mip.K(mcnVarI.e)) {
                                mciVarB.b("media_type", 1);
                            } else if (mip.L(mcnVarI.e)) {
                                mciVarB.b("media_type", 3);
                            }
                            String absolutePath = fileB.getAbsolutePath();
                            String name = fileB.getName();
                            String str = mcnVarI.c;
                            mciVarB.d("_data", absolutePath);
                            mciVarB.c("_size", fileB.length());
                            mciVarB.d("_display_name", name);
                            mciVarB.d("title", str);
                            mciVarB.c("date_modified", TimeUnit.MILLISECONDS.toSeconds(fileB.lastModified()));
                            mciVarB.d("mime_type", mcnVarI.e);
                            mcj mcjVarA = mciVarB.a();
                            mctVar.d = mcjVarA;
                            arrayList2.add(builderNewInsert.withValues(mcjVarA.a()).build());
                            arrayList.add(mctVar);
                            this.a.a.f();
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    this.a.b.f("No ContentProvider ops in publish.");
                    ljfVar = this.a.a;
                } else {
                    this.a.a.e("apply");
                    ContentProviderResult[] contentProviderResultArrApplyBatch = this.c.b.applyBatch("media", arrayList2);
                    obr.aQ(arrayList.size() == arrayList2.size());
                    if (contentProviderResultArrApplyBatch.length != arrayList.size()) {
                        z = false;
                    }
                    obr.aQ(z);
                    for (i = 0; i < contentProviderResultArrApplyBatch.length; i++) {
                        ContentProviderResult contentProviderResult = contentProviderResultArrApplyBatch[i];
                        mct mctVar2 = (mct) this.b.get(i);
                        if (!mctVar2.b) {
                            lis lisVar3 = this.a.b;
                            String strValueOf3 = String.valueOf(mctVar2.a);
                            String strValueOf4 = String.valueOf(contentProviderResult.uri);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf3).length() + 14 + String.valueOf(strValueOf4).length());
                            sb3.append("Published ");
                            sb3.append(strValueOf3);
                            sb3.append(" to ");
                            sb3.append(strValueOf4);
                            lisVar3.f(sb3.toString());
                        }
                    }
                    this.a.a.f();
                    ljfVar = this.a.a;
                }
                ljfVar.f();
            } catch (Throwable th5) {
                this.a.a.f();
                throw th5;
            }
        } catch (OperationApplicationException | RemoteException e) {
            throw new IOException("Error inserting MediaStore record.", e);
        }
    }
}
