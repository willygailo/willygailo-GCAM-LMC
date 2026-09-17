.class public Lcom/settings/Pref;
.super Ljava/lang/Object;


# direct methods
.method constructor <init>()V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static AddPrefForAwb(Lfcb;)V
    .locals 13

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "/LMC8.4/AWB/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v7, Lcom/Fix/FileFilterAwb;

    invoke-direct {v7}, Lcom/Fix/FileFilterAwb;-><init>()V

    invoke-virtual {v6, v7}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object v7

    const/4 v0, 0x0

    if-eqz v7, :cond_0

    array-length v2, v7

    if-ge v0, v2, :cond_0

    new-instance v1, Lcom/mycompany/myapp40/MainActivity$100000001;

    invoke-direct {v1}, Lcom/mycompany/myapp40/MainActivity$100000001;-><init>()V

    invoke-static {v7, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    invoke-static {v7}, Lcom/settings/Pref;->getFileNames1([Ljava/io/File;)[Ljava/lang/String;

    move-result-object v3

    invoke-static {v7}, Lcom/settings/Pref;->getFileNames1([Ljava/io/File;)[Ljava/lang/String;

    move-result-object v4

    move-object v0, p0

    const-string v1, "Load awb"

    const-string v2, "pref_load_awb_key_front"

    const-string v5, "pref_awb_pref_screeen_key_front"

    invoke-static/range {v0 .. v5}, Lcom/settings/Pref;->GetListPreference(Lfcb;Ljava/lang/CharSequence;Ljava/lang/String;[Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    const-string v2, "pref_load_awb_key"

    const-string v5, "pref_awb_pref_screeen_key_main"

    invoke-static/range {v0 .. v5}, Lcom/settings/Pref;->GetListPreference(Lfcb;Ljava/lang/CharSequence;Ljava/lang/String;[Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    const-string v2, "pref_load_awb_key_2"

    const-string v5, "pref_awb_pref_screeen_key_tele"

    invoke-static/range {v0 .. v5}, Lcom/settings/Pref;->GetListPreference(Lfcb;Ljava/lang/CharSequence;Ljava/lang/String;[Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    const-string v2, "pref_load_awb_key_3"

    const-string v5, "pref_awb_pref_screeen_key_wide"

    invoke-static/range {v0 .. v5}, Lcom/settings/Pref;->GetListPreference(Lfcb;Ljava/lang/CharSequence;Ljava/lang/String;[Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    const-string v2, "pref_load_awb_key_4"

    const-string v5, "pref_awb_pref_screeen_key_id4"

    invoke-static/range {v0 .. v5}, Lcom/settings/Pref;->GetListPreference(Lfcb;Ljava/lang/CharSequence;Ljava/lang/String;[Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    const-string v2, "pref_load_awb_key_5"

    const-string v5, "pref_awb_pref_screeen_key_id5"

    invoke-static/range {v0 .. v5}, Lcom/settings/Pref;->GetListPreference(Lfcb;Ljava/lang/CharSequence;Ljava/lang/String;[Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public static AddPrefForNoiseModel(Lfcb;)V
    .locals 13

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "/LMC8.4/NOISE MODELER/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v7, Lcom/Fix/FileFilterNoise;

    invoke-direct {v7}, Lcom/Fix/FileFilterNoise;-><init>()V

    invoke-virtual {v6, v7}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object v7

    const/4 v0, 0x0

    if-eqz v7, :cond_0

    array-length v2, v7

    if-ge v0, v2, :cond_0

    new-instance v1, Lcom/mycompany/myapp40/MainActivity$100000001;

    invoke-direct {v1}, Lcom/mycompany/myapp40/MainActivity$100000001;-><init>()V

    invoke-static {v7, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    invoke-static {v7}, Lcom/settings/Pref;->getFileNames1([Ljava/io/File;)[Ljava/lang/String;

    move-result-object v3

    invoke-static {v7}, Lcom/settings/Pref;->getFileNames1([Ljava/io/File;)[Ljava/lang/String;

    move-result-object v4

    move-object v0, p0

    const-string v1, "Load noise model"

    const-string v2, "pref_load_noise_model_key_front"

    const-string v5, "pref_get_noise_model_selection_key_front"

    invoke-static/range {v0 .. v5}, Lcom/settings/Pref;->GetListPreference(Lfcb;Ljava/lang/CharSequence;Ljava/lang/String;[Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    const-string v2, "pref_load_noise_model_key"

    const-string v5, "pref_get_noise_model_selection_key_main"

    invoke-static/range {v0 .. v5}, Lcom/settings/Pref;->GetListPreference(Lfcb;Ljava/lang/CharSequence;Ljava/lang/String;[Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    const-string v2, "pref_load_noise_model_key_2"

    const-string v5, "pref_get_noise_model_selection_key_tele"

    invoke-static/range {v0 .. v5}, Lcom/settings/Pref;->GetListPreference(Lfcb;Ljava/lang/CharSequence;Ljava/lang/String;[Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    const-string v2, "pref_load_noise_model_key_3"

    const-string v5, "pref_get_noise_model_selection_key_wide"

    invoke-static/range {v0 .. v5}, Lcom/settings/Pref;->GetListPreference(Lfcb;Ljava/lang/CharSequence;Ljava/lang/String;[Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    const-string v2, "pref_load_noise_model_key_4"

    const-string v5, "pref_get_noise_model_selection_key_id4"

    invoke-static/range {v0 .. v5}, Lcom/settings/Pref;->GetListPreference(Lfcb;Ljava/lang/CharSequence;Ljava/lang/String;[Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    const-string v2, "pref_load_noise_model_key_5"

    const-string v5, "pref_get_noise_model_selection_key_id5"

    invoke-static/range {v0 .. v5}, Lcom/settings/Pref;->GetListPreference(Lfcb;Ljava/lang/CharSequence;Ljava/lang/String;[Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public static AddSettingsPref(Lfcb;)V
    .locals 13

    invoke-static {p0}, Lcom/settings/Pref;->AddPrefForNoiseModel(Lfcb;)V

    invoke-static {p0}, Lcom/settings/Pref;->AddPrefForAwb(Lfcb;)V

    const-string v1, "prefscreen_top"

    invoke-virtual {p0, v1}, Lfcb;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v1

    check-cast v1, Landroid/preference/PreferenceScreen;

    invoke-static {p0, v1}, Lcom/settings/Pref;->getEditTexPreAsSummarry(Lfcb;Landroid/preference/PreferenceGroup;)V

    return-void
.end method

.method public static GetListPreference(Lfcb;Ljava/lang/CharSequence;Ljava/lang/String;[Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 8

    invoke-virtual {p0, p5}, Lfcb;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v7

    instance-of v1, v7, Landroid/preference/PreferenceScreen;

    if-eqz v1, :cond_0

    check-cast v7, Landroid/preference/PreferenceScreen;

    if-eqz v7, :cond_0

    new-instance v0, Landroid/preference/ListPreference;

    invoke-virtual {p0}, Lfcb;->getPreferenceScreen()Landroid/preference/PreferenceScreen;

    move-result-object v1

    invoke-virtual {v1}, Landroid/preference/PreferenceScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/preference/ListPreference;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Landroid/preference/ListPreference;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, p1}, Landroid/preference/ListPreference;->setDialogTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, p2}, Landroid/preference/ListPreference;->setKey(Ljava/lang/String;)V

    const-string v1, "preference_with_margin"

    const v6, 0x1

    invoke-static {v1, v6}, Lcom/Helper;->GetIdFromResources(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/preference/ListPreference;->setLayoutResource(I)V

    const-string v1, "quantum_gm_ic_info_outline_black_24"

    const v2, 0x0

    invoke-static {v1, v2}, Lcom/Helper;->GetIdFromResources(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/preference/ListPreference;->setIcon(I)V

    const-string v1, "%s"

    invoke-virtual {v0, v1}, Landroid/preference/ListPreference;->setSummary(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, p3}, Landroid/preference/ListPreference;->setEntries([Ljava/lang/CharSequence;)V

    invoke-virtual {v0, p4}, Landroid/preference/ListPreference;->setEntryValues([Ljava/lang/CharSequence;)V

    const v1, 0x0

    invoke-virtual {v0, v1}, Landroid/preference/ListPreference;->setValueIndex(I)V

    invoke-virtual {v7, v0}, Landroid/preference/PreferenceScreen;->addPreference(Landroid/preference/Preference;)Z

    goto :goto_0

    :cond_0
    instance-of v1, v7, Landroid/preference/PreferenceGroup;

    if-eqz v1, :cond_1

    check-cast v7, Landroid/preference/PreferenceGroup;

    if-eqz v7, :cond_1

    new-instance v0, Landroid/preference/ListPreference;

    invoke-virtual {p0}, Lfcb;->getPreferenceScreen()Landroid/preference/PreferenceScreen;

    move-result-object v1

    invoke-virtual {v1}, Landroid/preference/PreferenceScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/preference/ListPreference;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Landroid/preference/ListPreference;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, p1}, Landroid/preference/ListPreference;->setDialogTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, p2}, Landroid/preference/ListPreference;->setKey(Ljava/lang/String;)V

    const-string v1, "preference_with_margin"

    const v6, 0x1

    invoke-static {v1, v6}, Lcom/Helper;->GetIdFromResources(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/preference/ListPreference;->setLayoutResource(I)V

    const-string v1, "quantum_gm_ic_info_outline_black_24"

    const v2, 0x0

    invoke-static {v1, v2}, Lcom/Helper;->GetIdFromResources(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/preference/ListPreference;->setIcon(I)V

    const-string v1, "%s"

    invoke-virtual {v0, v1}, Landroid/preference/ListPreference;->setSummary(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, p3}, Landroid/preference/ListPreference;->setEntries([Ljava/lang/CharSequence;)V

    invoke-virtual {v0, p4}, Landroid/preference/ListPreference;->setEntryValues([Ljava/lang/CharSequence;)V

    const v1, 0x0

    invoke-virtual {v0, v1}, Landroid/preference/ListPreference;->setValueIndex(I)V

    invoke-virtual {v7, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public static getEditTexPreAsSummarry(Lfcb;Landroid/preference/PreferenceGroup;)V
    .locals 6

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/preference/PreferenceGroup;->getPreferenceCount()I

    move-result v1

    if-ge v0, v1, :cond_3

    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->getPreference(I)Landroid/preference/Preference;

    move-result-object v1

    instance-of v2, v1, Landroid/preference/PreferenceGroup;

    if-eqz v2, :cond_0

    check-cast v1, Landroid/preference/PreferenceGroup;

    invoke-static {p0, v1}, Lcom/settings/Pref;->getEditTexPreAsSummarry(Lfcb;Landroid/preference/PreferenceGroup;)V

    goto :goto_1

    :cond_0
    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "EditTextPreference"

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    check-cast v1, Landroid/preference/EditTextPreference;

    invoke-virtual {v1}, Landroid/preference/EditTextPreference;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/preference/EditTextPreference;->setSummary(Ljava/lang/CharSequence;)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static getFileNames1([Ljava/io/File;)[Ljava/lang/String;
    .locals 4

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v0, p0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    check-cast v0, Ljava/util/ArrayList;

    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    return-object v1

    :cond_0
    const-string v2, "Default"

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    :goto_1
    array-length v2, p0

    if-lt v0, v2, :cond_1

    move-object v0, v1

    goto :goto_0

    :cond_1
    aget-object v2, p0, v0

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method
