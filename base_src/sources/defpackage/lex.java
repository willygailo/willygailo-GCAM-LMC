package defpackage;

import android.media.MediaMuxer;
import java.io.FileDescriptor;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class lex implements lfc {
    @Override // defpackage.lfc
    public final mah a(FileDescriptor fileDescriptor, int i) throws lfb {
        String.valueOf(String.valueOf(fileDescriptor)).length();
        try {
            return new lvk(new MediaMuxer(fileDescriptor, i));
        } catch (IOException e) {
            throw new lfb(i, e);
        }
    }
}
