package org.chromium.chrome.browser.feedback;

/**
 * Created by yangdeli on 16-7-20.
 */
public class ConnectivityCheckResult {
    public static final int UNKNOWN = 0;
    public static final int CONNECTED = 1;
    public static final int NOT_CONNECTED = 2;
    public static final int TIMEOUT = 3;
    public static final int ERROR = 4;
    public static final int END = 5;

    public ConnectivityCheckResult() {
    }
}
