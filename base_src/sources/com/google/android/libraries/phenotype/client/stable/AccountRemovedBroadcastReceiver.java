package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import defpackage.nei;
import defpackage.nfp;
import defpackage.nfq;
import defpackage.pgr;
import defpackage.plk;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class AccountRemovedBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        if ("android.accounts.action.ACCOUNT_REMOVED".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("accountType");
            if ("com.google".equals(stringExtra) || "com.google.work".equals(stringExtra) || "cn.google".equals(stringExtra) || "__logged_out_type".equals(stringExtra)) {
                final String string = intent.getExtras().getString("authAccount");
                final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                nei neiVarA = nei.a(context);
                plk.P(nfq.a(neiVarA).b(new nfp(string, 3), neiVarA.c()), neiVarA.c().submit(new Runnable() { // from class: nfc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str = string;
                        SharedPreferences sharedPreferencesA = nfw.a(context2);
                        SharedPreferences.Editor editorEdit = null;
                        for (Map.Entry<String, ?> entry : sharedPreferencesA.getAll().entrySet()) {
                            if ((entry.getValue() instanceof String) && entry.getValue().equals(str)) {
                                if (editorEdit == null) {
                                    editorEdit = sharedPreferencesA.edit();
                                }
                                editorEdit.remove(entry.getKey());
                            }
                        }
                        if (editorEdit != null) {
                            editorEdit.commit();
                        }
                    }
                })).a(new Callable() { // from class: nfd
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        pendingResultGoAsync.finish();
                        return null;
                    }
                }, pgr.INSTANCE);
            }
        }
    }
}
