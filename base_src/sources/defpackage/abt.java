package defpackage;

import android.content.ClipData;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class abt extends InputConnectionWrapper {
    final /* synthetic */ nd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abt(InputConnection inputConnection, nd ndVar) {
        super(inputConnection, false);
        this.a = ndVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        nd ndVar = this.a;
        abv abvVar = inputContentInfo == null ? null : new abv(new abu(inputContentInfo));
        if ((i & 1) != 0) {
            try {
                abvVar.a.a.requestPermission();
                InputContentInfo inputContentInfo2 = abvVar.a.a;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("android.support.v4.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        fi fiVar = new fi(new ClipData(abvVar.a.a.getDescription(), new ClipData.Item(abvVar.a.a.getContentUri())), 2);
        fiVar.a.setLinkUri(abvVar.a.a.getLinkUri());
        fiVar.a.setExtras(bundle2);
        if (gl.o(ndVar.a, eu.e(fiVar)) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
