package com.google.android.libraries.lens.lenslite.api;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public interface ModelInfo {
    Locale getModelLocale();

    String getModelName();

    long getModelSize();

    int getModelState();
}
