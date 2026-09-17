package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.nei;
import defpackage.nfn;
import defpackage.nfp;
import defpackage.nfq;
import defpackage.nfy;
import defpackage.ngb;
import defpackage.ngd;
import defpackage.ngt;
import defpackage.oom;
import defpackage.pgb;
import defpackage.pho;
import defpackage.pht;
import defpackage.plk;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class PhenotypeUpdateBackgroundBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            nei neiVarA = nei.a(context);
            Map mapF = ngt.f(context);
            if (mapF.isEmpty()) {
                return;
            }
            nfn nfnVar = (nfn) mapF.get(stringExtra);
            if (nfnVar != null && nfnVar.f != 7) {
                stringExtra.length();
                return;
            }
            final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            final pht phtVarA = nfnVar == null ? plk.O(oom.n(nfq.a(neiVarA).b(new nfp(stringExtra, 4), neiVarA.c()), neiVarA.c().submit(new ngb(neiVarA, stringExtra, 0)))).a(ngd.a, neiVarA.c()) : pgb.i(pho.q(pgb.h(pho.q(nfq.a(neiVarA).a()), new nfp(stringExtra, 0), neiVarA.c())), new nfy(nfnVar, stringExtra, neiVarA, 0), neiVarA.c());
            phtVarA.d(new Runnable() { // from class: ngc
                @Override // java.lang.Runnable
                public final void run() {
                    pht phtVar = phtVarA;
                    String str = stringExtra;
                    BroadcastReceiver.PendingResult pendingResult = pendingResultGoAsync;
                    try {
                        try {
                            plk.ad(phtVar);
                            if (str.length() != 0) {
                                "Successfully updated snapshot for ".concat(str);
                            } else {
                                new String("Successfully updated snapshot for ");
                            }
                        } catch (ExecutionException e) {
                            Log.w("PhenotypeBackgroundRecv", str.length() != 0 ? "Failed to update local snapshot for ".concat(str) : new String("Failed to update local snapshot for "), e);
                        }
                    } finally {
                        pendingResult.finish();
                    }
                }
            }, neiVarA.c());
        }
    }
}
