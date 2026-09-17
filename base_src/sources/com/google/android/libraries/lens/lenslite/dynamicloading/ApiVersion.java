package com.google.android.libraries.lens.lenslite.dynamicloading;

/* JADX INFO: loaded from: classes.dex */
public enum ApiVersion {
    ORIGINAL(1),
    VERSION_2(2),
    VERSION_3(3),
    VERSION_4(4),
    VERSION_5(5),
    VERSION_6(6),
    VERSION_7(7),
    VERSION_8(8),
    VERSION_9(9),
    VERSION_10(10),
    VERSION_11(11),
    VERSION_12(12),
    VERSION_13(13),
    VERSION_14(14),
    VERSION_15(15),
    VERSION_16(16),
    VERSION_17(17);

    public static final int CURRENT_VERSION = 17;
    public static final int MIN_VERSION = 4;
    private final int versionCode;

    ApiVersion(int i) {
        this.versionCode = i;
    }

    public int getVersionCode() {
        return this.versionCode;
    }
}
