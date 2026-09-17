package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public final class cnm {
    private final AudioManager a;

    public cnm(AudioManager audioManager) {
        this.a = audioManager;
    }

    public static void c(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo != null) {
            String strValueOf = String.valueOf(audioDeviceInfo.getProductName());
            audioDeviceInfo.getType();
            audioDeviceInfo.getId();
            String.valueOf(strValueOf).length();
        }
    }

    public final AudioDeviceInfo a() {
        for (AudioDeviceInfo audioDeviceInfo : this.a.getDevices(1)) {
            if (audioDeviceInfo.getType() == 7) {
                c(audioDeviceInfo);
                return audioDeviceInfo;
            }
        }
        return null;
    }

    public final AudioDeviceInfo b() {
        AudioDeviceInfo audioDeviceInfo = null;
        AudioDeviceInfo audioDeviceInfo2 = null;
        for (AudioDeviceInfo audioDeviceInfo3 : this.a.getDevices(1)) {
            c(audioDeviceInfo3);
            if (audioDeviceInfo3.getType() == 11 || audioDeviceInfo3.getType() == 22) {
                c(audioDeviceInfo3);
                if (audioDeviceInfo == null) {
                    audioDeviceInfo = audioDeviceInfo3;
                }
            }
            if (audioDeviceInfo3.getType() == 3) {
                c(audioDeviceInfo3);
                if (audioDeviceInfo2 == null) {
                    audioDeviceInfo2 = audioDeviceInfo3;
                }
            }
        }
        return audioDeviceInfo != null ? audioDeviceInfo : audioDeviceInfo2;
    }
}
