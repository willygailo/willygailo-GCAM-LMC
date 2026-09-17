package defpackage;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class bas extends bao {
    private static final UriMatcher a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        a = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public bas(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    private static final InputStream e(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // defpackage.bac
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.bao
    protected final /* bridge */ /* synthetic */ Object b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream inputStreamE;
        switch (a.match(uri)) {
            case 1:
            case 5:
                Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
                if (uriLookupContact == null) {
                    throw new FileNotFoundException("Contact cannot be found");
                }
                inputStreamE = e(contentResolver, uriLookupContact);
                break;
                break;
            case 2:
            case 4:
            default:
                inputStreamE = contentResolver.openInputStream(uri);
                break;
            case 3:
                inputStreamE = e(contentResolver, uri);
                break;
        }
        if (inputStreamE != null) {
            return inputStreamE;
        }
        String strValueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 24);
        sb.append("InputStream is null for ");
        sb.append(strValueOf);
        throw new FileNotFoundException(sb.toString());
    }

    @Override // defpackage.bao
    protected final /* synthetic */ void c(Object obj) throws IOException {
        ((InputStream) obj).close();
    }
}
