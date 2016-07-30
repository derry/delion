package org.chromium.chrome.browser.signin;

/**
 * Created by yangdeli on 16-7-20.
 */
public class SigninReason {
    public static final int SIGNIN_PRIMARY_ACCOUNT = 0;
    public static final int ADD_SECONDARY_ACCOUNT = 1;
    public static final int REAUTHENTICATION = 2;
    public static final int UNLOCK = 3;
    public static final int UNKNOWN_REASON = 4;
    public static final int MAX = 5;

    public SigninReason() {
    }
}
