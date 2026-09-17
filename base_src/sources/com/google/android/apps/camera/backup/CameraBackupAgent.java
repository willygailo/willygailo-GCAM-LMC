package com.google.android.apps.camera.backup;

import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.os.ParcelFileDescriptor;
import android.preference.PreferenceManager;
import defpackage.caj;
import defpackage.enc;
import defpackage.fjs;
import defpackage.kzz;
import defpackage.mip;
import defpackage.oor;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CameraBackupAgent extends kzz {
    public fjs a;

    private final void e() {
        if (this.a == null) {
            ((caj) ((enc) getApplicationContext()).c(caj.class)).a(this);
        }
    }

    @Override // defpackage.kzz
    protected final Map a() {
        return oor.p(PreferenceManager.getDefaultSharedPreferencesName(this), new mip());
    }

    @Override // defpackage.kzz, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) throws IOException {
        super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
        e();
        this.a.h();
    }

    @Override // defpackage.kzz, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        super.onRestore(backupDataInput, i, parcelFileDescriptor);
        e();
        this.a.i();
    }
}
