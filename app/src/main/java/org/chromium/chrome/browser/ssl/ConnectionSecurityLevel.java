package org.chromium.chrome.browser.ssl;

/**
 * Created by yangdeli on 16-7-20.
 */
public class ConnectionSecurityLevel {
    public static final int NONE = 0;
    public static final int EV_SECURE = 1;
    public static final int SECURE = 2;
    public static final int SECURITY_WARNING = 3;
    public static final int SECURITY_POLICY_WARNING = 4;
    public static final int SECURITY_ERROR = 5;
}
