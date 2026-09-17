package com.google.android.libraries.lens.lenslite.api;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public interface DownloadEvent {
    int getErrorCode();

    int getEventType();

    Locale getLocale();

    String getModelName();
}
